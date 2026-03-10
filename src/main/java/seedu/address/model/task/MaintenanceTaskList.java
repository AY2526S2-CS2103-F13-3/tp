package seedu.address.model.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of maintenance tasks.
 */
public class MaintenanceTaskList {
    private final ArrayList<MaintenanceTask> tasks = new ArrayList<>();

    public void addTask(MaintenanceTask task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public List<MaintenanceTask> getTasks() {
        return tasks;
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public int size() {
        return tasks.size();
    }
}

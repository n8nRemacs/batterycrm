package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.InterfaceC28559h;
import kotlin.Metadata;

/* compiled from: ApplicationBlockingStartupTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/app/task/h;", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "getPriority", "()Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "priority", "Priority", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ApplicationBlockingStartupTask extends InterfaceC28559h {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApplicationBlockingStartupTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Priority {

        /* renamed from: b, reason: collision with root package name */
        public static final Priority f91378b;

        /* renamed from: c, reason: collision with root package name */
        public static final Priority f91379c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Priority[] f91380d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f91381e;

        static {
            Priority priority = new Priority("REGULAR", 0);
            f91378b = priority;
            Priority priority2 = new Priority("CRITICAL", 1);
            f91379c = priority2;
            Priority[] priorityArr = {priority, priority2};
            f91380d = priorityArr;
            f91381e = kotlin.enums.c.a(priorityArr);
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f91380d.clone();
        }
    }

    /* compiled from: ApplicationBlockingStartupTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @j.K
    @Y61.k
    InterfaceC28559h.a execute(@Y61.k Application application);

    @Y61.k
    Priority getPriority();
}

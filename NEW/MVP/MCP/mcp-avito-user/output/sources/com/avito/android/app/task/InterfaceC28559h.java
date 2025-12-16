package com.avito.android.app.task;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApplicationStartupTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/task/h;", "", "a", "b", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28559h {

    /* compiled from: ApplicationStartupTask.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/app/task/h$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/app/task/h$a$a;", "Lcom/avito/android/app/task/h$a$b;", "Lcom/avito/android/app/task/h$a$c;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.app.task.h$a */
    public static abstract class a {

        /* compiled from: ApplicationStartupTask.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/h$a$a;", "Lcom/avito/android/app/task/h$a;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app.task.h$a$a, reason: collision with other inner class name */
        public static final class C2695a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f91603a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Throwable f91604b;

            /* JADX WARN: Multi-variable type inference failed */
            public C2695a() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public C2695a(@Y61.l String str, @Y61.l Throwable th2) {
                super(null);
                this.f91603a = str;
                this.f91604b = th2;
            }

            public /* synthetic */ C2695a(String str, Throwable th2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2);
            }
        }

        /* compiled from: ApplicationStartupTask.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/h$a$b;", "Lcom/avito/android/app/task/h$a;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app.task.h$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f91605a;

            public b(@Y61.k Throwable th2) {
                super(null);
                this.f91605a = th2;
            }
        }

        /* compiled from: ApplicationStartupTask.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/task/h$a$c;", "Lcom/avito/android/app/task/h$a;", "<init>", "()V", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app.task.h$a$c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f91606a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ApplicationStartupTask.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/app/task/h$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/app/task/h$b$a;", "Lcom/avito/android/app/task/h$b$b;", "Lcom/avito/android/app/task/h$b$c;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.app.task.h$b */
    public static abstract class b {

        /* compiled from: ApplicationStartupTask.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/h$b$a;", "Lcom/avito/android/app/task/h$b;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app.task.h$b$a */
        public static final class a extends b {
            @Override // com.avito.android.app.task.InterfaceC28559h.b
            public final boolean a(@Y61.k Class<? extends b> cls) {
                return true;
            }
        }

        /* compiled from: ApplicationStartupTask.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/task/h$b$b;", "Lcom/avito/android/app/task/h$b;", "<init>", "()V", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app.task.h$b$b, reason: collision with other inner class name */
        public static final class C2696b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C2696b f91607a = new C2696b();

            public C2696b() {
                super(null);
            }

            @Override // com.avito.android.app.task.InterfaceC28559h.b
            public final boolean a(@Y61.k Class<? extends b> cls) {
                return cls.equals(c.class) || cls.equals(C2696b.class);
            }
        }

        /* compiled from: ApplicationStartupTask.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/task/h$b$c;", "Lcom/avito/android/app/task/h$b;", "<init>", "()V", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.app.task.h$b$c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f91608a = new c();

            public c() {
                super(null);
            }

            @Override // com.avito.android.app.task.InterfaceC28559h.b
            public final boolean a(@Y61.k Class<? extends b> cls) {
                return cls.equals(c.class);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public abstract boolean a(@Y61.k Class<? extends b> cls);

        public b() {
        }
    }
}

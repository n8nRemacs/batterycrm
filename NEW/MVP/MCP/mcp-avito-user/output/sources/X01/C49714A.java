package x01;

import java.util.HashMap;

/* renamed from: x01.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C49714A {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f441937b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static C49714A f441938c;

    /* renamed from: a, reason: collision with root package name */
    public final J f441939a = new J();

    public static C49714A a() {
        if (f441938c == null) {
            synchronized (C49714A.class) {
                if (f441938c == null) {
                    f441938c = new C49714A();
                }
            }
        }
        return f441938c;
    }
}

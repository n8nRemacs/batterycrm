package x01;

import android.content.Context;

/* renamed from: x01.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C49740z {

    /* renamed from: c, reason: collision with root package name */
    public static C49740z f442077c;

    /* renamed from: a, reason: collision with root package name */
    public Context f442078a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f442079b = new Object();

    public static C49740z a() {
        if (f442077c == null) {
            synchronized (C49740z.class) {
                if (f442077c == null) {
                    f442077c = new C49740z();
                }
            }
        }
        return f442077c;
    }
}

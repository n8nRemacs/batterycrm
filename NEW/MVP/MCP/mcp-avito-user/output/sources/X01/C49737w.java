package x01;

import android.content.Context;

/* renamed from: x01.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C49737w {

    /* renamed from: b, reason: collision with root package name */
    public static C49737w f442068b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f442069c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Context f442070a;

    public static C49737w a() {
        if (f442068b == null) {
            synchronized (C49737w.class) {
                if (f442068b == null) {
                    f442068b = new C49737w();
                }
            }
        }
        return f442068b;
    }
}

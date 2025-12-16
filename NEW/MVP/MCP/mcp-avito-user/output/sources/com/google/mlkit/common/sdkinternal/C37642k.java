package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.internal.C36729v;
import j.P;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37642k {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f362338b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @P
    public static C37642k f362339c;

    /* renamed from: a, reason: collision with root package name */
    @P
    public com.google.firebase.components.l f362340a;

    @j.N
    @RX0.a
    public static C37642k c() {
        C37642k c37642k;
        synchronized (f362338b) {
            C36729v.l("MlKitContext has not been initialized", f362339c != null);
            c37642k = f362339c;
            C36729v.j(c37642k);
        }
        return c37642k;
    }

    @j.N
    @RX0.a
    public final <T> T a(@j.N Class<T> cls) {
        C36729v.l("MlKitContext has been deleted", f362339c == this);
        C36729v.j(this.f362340a);
        return (T) this.f362340a.a(cls);
    }

    @j.N
    @RX0.a
    public final Context b() {
        return (Context) a(Context.class);
    }
}

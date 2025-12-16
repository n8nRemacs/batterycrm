package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.internal.C36729v;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36660o {

    /* renamed from: a, reason: collision with root package name */
    public final Set f349187a = Collections.newSetFromMap(new WeakHashMap());

    @j.N
    @RX0.a
    public static C36658n a(@j.N Looper looper, @j.N Object obj, @j.N String str) {
        C36729v.k(obj, "Listener must not be null");
        C36729v.k(looper, "Looper must not be null");
        C36729v.k(str, "Listener type must not be null");
        return new C36658n(looper, obj, str);
    }

    @j.N
    @RX0.a
    public static C36658n b(@j.N Object obj, @j.N String str, @j.N Executor executor) {
        C36729v.k(obj, "Listener must not be null");
        C36729v.k(executor, "Executor must not be null");
        return new C36658n(obj, str, executor);
    }

    @j.N
    @RX0.a
    public static <L> C36658n.a<L> c(@j.N L l12, @j.N String str) {
        C36729v.k(l12, "Listener must not be null");
        C36729v.g(str, "Listener type must not be empty");
        return new C36658n.a<>(l12, str);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C36729v;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@j.l0
/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36848b2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Y1 f355036b;

    /* renamed from: c, reason: collision with root package name */
    public final int f355037c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f355038d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f355039e;

    /* renamed from: f, reason: collision with root package name */
    public final String f355040f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, List<String>> f355041g;

    public RunnableC36848b2() {
        throw null;
    }

    public RunnableC36848b2(String str, Y1 y12, int i12, Throwable th2, byte[] bArr, Map map, C36841a2 c36841a2) {
        C36729v.j(y12);
        this.f355036b = y12;
        this.f355037c = i12;
        this.f355038d = th2;
        this.f355039e = bArr;
        this.f355040f = str;
        this.f355041g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355036b.a(this.f355040f, this.f355037c, this.f355038d, this.f355039e, this.f355041g);
    }
}

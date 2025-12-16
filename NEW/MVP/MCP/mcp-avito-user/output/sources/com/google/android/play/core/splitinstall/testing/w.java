package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.C37235l;
import com.google.android.play.core.splitinstall.C37236m;
import com.google.android.play.core.splitinstall.g0;
import com.google.android.play.core.splitinstall.internal.Y;
import com.google.android.play.core.splitinstall.internal.b0;
import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class w implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C37235l f358899a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f358900b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f358901c;

    /* renamed from: d, reason: collision with root package name */
    public final C37236m f358902d;

    public w(C37235l c37235l, b0 b0Var, b0 b0Var2, C37236m c37236m) {
        this.f358899a = c37235l;
        this.f358900b = b0Var;
        this.f358901c = b0Var2;
        this.f358902d = c37236m;
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    public final Object zza() {
        return new C37243a(this.f358899a.f358819a.f358814a, (File) this.f358900b.zza(), (g0) this.f358901c.zza(), Y.a(this.f358902d));
    }
}

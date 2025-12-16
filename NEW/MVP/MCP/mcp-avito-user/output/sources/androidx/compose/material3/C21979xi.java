package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.xi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21979xi extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f37723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f37724m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f37725n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C21935vi f37726o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f37727p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21979xi(boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar, C21935vi c21935vi, androidx.compose.ui.graphics.h1 h1Var) {
        super(2);
        this.f37723l = z12;
        this.f37724m = z13;
        this.f37725n = kVar;
        this.f37726o = c21935vi;
        this.f37727p = h1Var;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            Li.f35084a.a(this.f37723l, this.f37724m, this.f37725n, this.f37726o, this.f37727p, a13, 196608);
        }
        return kotlin.G0.f406611a;
    }
}

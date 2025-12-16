package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21611hc extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f36496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f36497m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36498n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C21935vi f36499o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36500p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21611hc(boolean z12, boolean z13, androidx.compose.foundation.interaction.m mVar, C21935vi c21935vi, androidx.compose.ui.graphics.h1 h1Var) {
        super(2);
        this.f36496l = z12;
        this.f36497m = z13;
        this.f36498n = mVar;
        this.f36499o = c21935vi;
        this.f36500p = h1Var;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C21542ec.f36256a.a(this.f36496l, this.f36497m, this.f36498n, this.f36499o, this.f36500p, 0.0f, 0.0f, a13, 12582912, 96);
        }
        return kotlin.G0.f406611a;
    }
}

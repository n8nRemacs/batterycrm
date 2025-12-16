package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21546eg extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.q<Xf, androidx.compose.runtime.A, Integer, kotlin.G0> f36307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Xf f36308m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21546eg(Y41.q<? super Xf, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar, Xf xf2) {
        super(2);
        this.f36307l = qVar;
        this.f36308m = xf2;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            this.f36307l.invoke(this.f36308m, a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}

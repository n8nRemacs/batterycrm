package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.layout.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20557d1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20567f1 f28591l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f28592m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y0 f28593n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20557d1(C20567f1 c20567f1, int i12, Y0 y02) {
        super(2);
        this.f28591l = c20567f1;
        this.f28592m = i12;
        this.f28593n = y02;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f28591l.f28616l.invoke(Integer.valueOf(this.f28592m), this.f28593n, a13, 0);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}

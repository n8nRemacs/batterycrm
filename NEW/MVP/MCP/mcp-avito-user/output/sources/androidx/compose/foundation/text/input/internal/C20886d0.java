package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.input.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20886d0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f31059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f31060m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20886d0(int i12, int i13) {
        super(1);
        this.f31059l = i12;
        this.f31060m = i13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.text.input.i iVar) {
        androidx.compose.foundation.text.input.i iVar2 = iVar;
        if (iVar2.f30760g != null) {
            iVar2.f(null);
        }
        C0 c02 = iVar2.f30757d;
        int iG2 = kotlin.ranges.s.g(this.f31059l, 0, c02.length());
        int iG3 = kotlin.ranges.s.g(this.f31060m, 0, c02.length());
        if (iG2 != iG3) {
            if (iG2 < iG3) {
                iVar2.e(null, iG2, iG3);
            } else {
                iVar2.e(null, iG3, iG2);
            }
        }
        return kotlin.G0.f406611a;
    }
}

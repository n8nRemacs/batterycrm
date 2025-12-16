package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.v0;
import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f31018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f31019m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(String str, int i12) {
        super(1);
        this.f31018l = str;
        this.f31019m = i12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.text.input.i iVar) {
        androidx.compose.foundation.text.input.i iVar2 = iVar;
        androidx.compose.ui.text.v0 v0Var = iVar2.f30760g;
        String str = this.f31018l;
        if (v0Var != null) {
            long j12 = v0Var.f42736a;
            C20892g0.b(iVar2, (int) (j12 >> 32), (int) (4294967295L & j12), str);
        } else {
            long j13 = iVar2.f30759f;
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            C20892g0.b(iVar2, (int) (j13 >> 32), (int) (4294967295L & j13), str);
        }
        long j14 = iVar2.f30759f;
        v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
        int i12 = (int) (j14 >> 32);
        int i13 = this.f31019m;
        int iG2 = kotlin.ranges.s.g(i13 > 0 ? (i12 + i13) - 1 : (i12 + i13) - str.length(), 0, iVar2.f30757d.length());
        iVar2.g(androidx.compose.ui.text.w0.a(iG2, iG2));
        return kotlin.G0.f406611a;
    }
}

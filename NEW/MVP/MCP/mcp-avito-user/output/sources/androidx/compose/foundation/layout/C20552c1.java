package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "canExpand", "", "shownItemCount", "Landroidx/compose/ui/layout/h0;", "invoke", "(ZI)Landroidx/compose/ui/layout/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.layout.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20552c1 extends kotlin.jvm.internal.N implements Y41.p<Boolean, Integer, InterfaceC22363h0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20567f1 f28589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.Z0 f28590m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20552c1(C20567f1 c20567f1, androidx.compose.ui.layout.Z0 z02) {
        super(2);
        this.f28589l = c20567f1;
        this.f28590m = z02;
    }

    @Override // Y41.p
    public final InterfaceC22363h0 invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        int i12 = !zBooleanValue ? 1 : 0;
        C20567f1 c20567f1 = this.f28589l;
        Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar = (Y41.p) C42745f0.K(i12, c20567f1.f28615k);
        if (pVar == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zBooleanValue);
        sb2.append(c20567f1.f28611g);
        sb2.append(iIntValue);
        return (InterfaceC22363h0) C42745f0.K(0, this.f28590m.h0(sb2.toString(), pVar));
    }
}

package androidx.compose.material;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.v9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21382v9 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f34284l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21382v9(String str) {
        super(3);
        this.f34284l = str;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 17) != 16)) {
            dc.b(this.f34284l, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, a13, 0, 0, 131070);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}

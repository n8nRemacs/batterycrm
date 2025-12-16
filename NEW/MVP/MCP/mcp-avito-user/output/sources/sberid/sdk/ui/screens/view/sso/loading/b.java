package sberid.sdk.ui.screens.view.sso.loading;

import Y41.q;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import p31.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class b extends N implements q<J, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LoadingSsoBottomSheetFragment f437881l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoadingSsoBottomSheetFragment loadingSsoBottomSheetFragment) {
        super(3);
        this.f437881l = loadingSsoBottomSheetFragment;
    }

    @Override // Y41.q
    public final G0 invoke(J j12, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            r.a(new a(this.f437881l), a13, 6);
        }
        return G0.f406611a;
    }
}

package com.avito.android.iac_problems.impl_module.miui_permission.ui;

import Y41.q;
import androidx.compose.foundation.layout.F;
import androidx.compose.runtime.A;
import androidx.compose.ui.layout.InterfaceC22374n;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacMiuiPermissionBottomSheetDialogContent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements q<F, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MiuiBottomsheetRemoteImageLanguage f168825l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MiuiBottomsheetRemoteImageLanguage miuiBottomsheetRemoteImageLanguage) {
        super(3);
        this.f168825l = miuiBottomsheetRemoteImageLanguage;
    }

    @Override // Y41.q
    public final G0 invoke(F f12, A a12, Integer num) {
        UniversalImage universalImage;
        F f13 = f12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(f13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            InterfaceC42726C interfaceC42726C = k.f168837a;
            int iOrdinal = this.f168825l.ordinal();
            if (iOrdinal == 0) {
                universalImage = (UniversalImage) k.f168838b.getValue();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                universalImage = (UniversalImage) k.f168840d.getValue();
            }
            UniversalImage universalImage2 = universalImage;
            float fH2 = f13.h();
            Float fB2 = k.b(universalImage2, fH2);
            androidx.compose.ui.unit.h hVarA = fB2 != null ? androidx.compose.ui.unit.h.a(fB2.floatValue()) : null;
            if (hVarA != null) {
                InterfaceC22374n.f40491a.getClass();
                b.a(universalImage2, fH2, hVarA.f42852b, InterfaceC22374n.a.f40496e, a13, 24584);
            }
        }
        return G0.f406611a;
    }
}

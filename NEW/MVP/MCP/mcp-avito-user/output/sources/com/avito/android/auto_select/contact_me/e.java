package com.avito.android.auto_select.contact_me;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectContactMeBottomSheetFragment f95969l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment) {
        super(2);
        this.f95969l = autoSelectContactMeBottomSheetFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            AutoSelectContactMeBottomSheetFragment.a aVar = AutoSelectContactMeBottomSheetFragment.f95928m0;
            AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment = this.f95969l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) autoSelectContactMeBottomSheetFragment.f95933k0.getValue(), androidx.compose.runtime.internal.r.c(444126680, new d(C22126m3.b(autoSelectContactMeBottomSheetFragment.f5().getState(), a13), autoSelectContactMeBottomSheetFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}

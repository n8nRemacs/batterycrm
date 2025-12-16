package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.remote.model.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BbipPrivateV2Screen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ButtonAction f261387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261388m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ButtonAction buttonAction, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f261387l = buttonAction;
        this.f261388m = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ButtonAction buttonAction = this.f261387l;
            String title = buttonAction.getTitle();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.m.c(title, new q(buttonAction, this.f261388m), com.akita.compose.theme.re23.b.c(a13).g0(), null, null, null, null, false, false, null, a13, 512, 1016);
        }
        return G0.f406611a;
    }
}

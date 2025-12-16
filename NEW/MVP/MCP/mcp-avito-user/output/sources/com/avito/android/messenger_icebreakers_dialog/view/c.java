package com.avito.android.messenger_icebreakers_dialog.view;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerDialogResult;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/view/c;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197709a;

    public c(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment) {
        this.f197709a = messengerIcebreakerBottomSheetFragment;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k h hVar) {
        if (hVar instanceof e) {
            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197709a;
            InterfaceC28373a interfaceC28373a = messengerIcebreakerBottomSheetFragment.f197679i0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new y.a("messengerIcebreakerDialog.icebreaker", 1L));
            String strD5 = messengerIcebreakerBottomSheetFragment.d5();
            e eVar = (e) hVar;
            MessengerIcebreakerDialogResult.OnSendIcebreaker onSendIcebreaker = new MessengerIcebreakerDialogResult.OnSendIcebreaker(messengerIcebreakerBottomSheetFragment.c5(), eVar.f197711c, messengerIcebreakerBottomSheetFragment.b5().f197521b, eVar.f197712d, eVar.f197713e);
            FragmentManager parentFragmentManager = messengerIcebreakerBottomSheetFragment.getParentFragmentManager();
            Bundle bundle = new Bundle();
            bundle.putParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", onSendIcebreaker);
            parentFragmentManager.o0(bundle, strD5);
            Input input = messengerIcebreakerBottomSheetFragment.f197686p0;
            if (input != null) {
                K2.d(input, true);
            }
            messengerIcebreakerBottomSheetFragment.requireDialog().dismiss();
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k h hVar) {
    }
}

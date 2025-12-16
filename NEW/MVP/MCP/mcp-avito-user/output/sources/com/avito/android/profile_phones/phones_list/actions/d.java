package com.avito.android.profile_phones.phones_list.actions;

import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: PhoneActionsSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/items/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/profile_phones/phones_list/actions/items/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneActionsSheetDialogFragment f227478b;

    public d(PhoneActionsSheetDialogFragment phoneActionsSheetDialogFragment) {
        this.f227478b = phoneActionsSheetDialogFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.profile_phones.phones_list.actions.items.a aVar = (com.avito.android.profile_phones.phones_list.actions.items.a) obj;
        Bundle bundleB = C22777e.b(new Q("PHONE_ACTION_RESULT_KEY", new PhoneActionsResult(aVar.f227498c, aVar.f227499d)));
        PhoneActionsSheetDialogFragment phoneActionsSheetDialogFragment = this.f227478b;
        C22960s.a(bundleB, phoneActionsSheetDialogFragment, "PHONE_ACTION_REQUEST_CODE");
        phoneActionsSheetDialogFragment.dismiss();
    }
}

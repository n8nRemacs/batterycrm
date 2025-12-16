package com.avito.android.messenger_icebreakers_dialog;

import Y61.k;
import android.os.Bundle;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerIcebreakerDialogFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/b;", "Lcom/avito/android/messenger_icebreakers_dialog/a;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.messenger_icebreakers_dialog.a
    @k
    public final MessengerIcebreakerBottomSheetFragment a(@k MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, @k MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData, @k String str) {
        MessengerIcebreakerBottomSheetFragment.f197675q0.getClass();
        MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = new MessengerIcebreakerBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("messenger_icebreaker_link", messengerIcebreakerDialogDeeplink);
        bundle.putParcelable("messenger_icebreaker_data", messengerIcebreakerBottomSheetData);
        bundle.putString("messenger_icebreaker_request_key", str);
        messengerIcebreakerBottomSheetFragment.setArguments(bundle);
        return messengerIcebreakerBottomSheetFragment;
    }
}

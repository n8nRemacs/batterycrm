package com.avito.android.messenger_icebreakers_dialog.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.messenger_icebreakers_dialog.mvi.entity.MessengerIcebreakerInternalAction;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import iZ.C41367c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerIcebreakerReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/mvi/f;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction;", "LiZ/c;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements u<MessengerIcebreakerInternalAction, C41367c> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C41367c a(MessengerIcebreakerInternalAction messengerIcebreakerInternalAction, C41367c c41367c) {
        MessengerIcebreakerInternalAction messengerIcebreakerInternalAction2 = messengerIcebreakerInternalAction;
        if (!(messengerIcebreakerInternalAction2 instanceof MessengerIcebreakerInternalAction.IcebreakersSetting)) {
            throw new NoWhenBranchMatchedException();
        }
        List<MessageSuggest> list = ((MessengerIcebreakerInternalAction.IcebreakersSetting) messengerIcebreakerInternalAction2).f197673b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (MessageSuggest messageSuggest : list) {
            arrayList.add(new com.avito.android.messenger_icebreakers_dialog.view.e(messageSuggest.getId(), i12, messageSuggest.getPreviewText(), messageSuggest.getMessageText()));
            i12++;
        }
        return new C41367c(arrayList);
    }
}

package com.avito.android.messenger_icebreakers_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerIcebreakerInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "IcebreakersSetting", "Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction$IcebreakersSetting;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessengerIcebreakerInternalAction extends n {

    /* compiled from: MessengerIcebreakerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction$IcebreakersSetting;", "Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IcebreakersSetting implements MessengerIcebreakerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MessageSuggest> f197673b;

        public IcebreakersSetting(@k List<MessageSuggest> list) {
            this.f197673b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IcebreakersSetting) && L.f(this.f197673b, ((IcebreakersSetting) obj).f197673b);
        }

        public final int hashCode() {
            return this.f197673b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("IcebreakersSetting(suggests="), this.f197673b, ')');
        }
    }
}

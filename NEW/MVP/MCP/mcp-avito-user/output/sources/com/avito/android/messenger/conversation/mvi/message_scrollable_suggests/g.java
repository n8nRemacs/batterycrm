package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.n;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessageScrollSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/g;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g extends S20.a<n.b> {

    /* compiled from: MessageScrollSuggestsPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/g$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f191847a;

        public a(@Y61.k String str) {
            this.f191847a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return L.f(this.f191847a, ((a) obj).f191847a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.f191847a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return AK.c.s(new StringBuilder("SuggestReplaceEvent(text="), this.f191847a, ", showKeyboard=true)");
        }
    }

    void Uc(@Y61.k MessageSuggestsView.SuggestItem suggestItem);

    @Y61.k
    D Ud();

    void b2(@Y61.k String str);
}

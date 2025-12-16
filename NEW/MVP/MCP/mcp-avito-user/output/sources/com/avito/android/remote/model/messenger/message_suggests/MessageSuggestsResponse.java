package com.avito.android.remote.model.messenger.message_suggests;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessageSuggestsResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ6\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "", "suggestList", "", "Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggest;", "title", "", MessageSuggestsResponse.HIDE_CHAT_BUTTONS, "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHideChatButtons", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuggestList", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MessageSuggestsResponse {

    @k
    public static final String HIDE_CHAT_BUTTONS = "hideChatButtons";

    @k
    public static final String ITEMS = "items";

    @k
    public static final String TITLE = "title";

    @c(HIDE_CHAT_BUTTONS)
    @l
    private final Boolean hideChatButtons;

    @c("items")
    @k
    private final List<MessageSuggest> suggestList;

    @c("title")
    @l
    private final String title;

    public MessageSuggestsResponse(@k List<MessageSuggest> list, @l String str, @l Boolean bool) {
        this.suggestList = list;
        this.title = str;
        this.hideChatButtons = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageSuggestsResponse copy$default(MessageSuggestsResponse messageSuggestsResponse, List list, String str, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = messageSuggestsResponse.suggestList;
        }
        if ((i12 & 2) != 0) {
            str = messageSuggestsResponse.title;
        }
        if ((i12 & 4) != 0) {
            bool = messageSuggestsResponse.hideChatButtons;
        }
        return messageSuggestsResponse.copy(list, str, bool);
    }

    @k
    public final List<MessageSuggest> component1() {
        return this.suggestList;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getHideChatButtons() {
        return this.hideChatButtons;
    }

    @k
    public final MessageSuggestsResponse copy(@k List<MessageSuggest> suggestList, @l String title, @l Boolean hideChatButtons) {
        return new MessageSuggestsResponse(suggestList, title, hideChatButtons);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSuggestsResponse)) {
            return false;
        }
        MessageSuggestsResponse messageSuggestsResponse = (MessageSuggestsResponse) other;
        return L.f(this.suggestList, messageSuggestsResponse.suggestList) && L.f(this.title, messageSuggestsResponse.title) && L.f(this.hideChatButtons, messageSuggestsResponse.hideChatButtons);
    }

    @l
    public final Boolean getHideChatButtons() {
        return this.hideChatButtons;
    }

    @k
    public final List<MessageSuggest> getSuggestList() {
        return this.suggestList;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.suggestList.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hideChatButtons;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MessageSuggestsResponse(suggestList=");
        sb2.append(this.suggestList);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", hideChatButtons=");
        return C0.g(sb2, this.hideChatButtons, ')');
    }
}

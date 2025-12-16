package g91;

import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import kotlin.Metadata;

/* compiled from: SendTextMessageResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lg91/o;", "", "Lg91/g;", PlatformActions.EXPANDABLE, "", PlatformActions.HIDE_KEYBOARD, "Lg91/D;", PlatformActions.ItemsList.ITEMS_REQUEST, "", "title", "useMultiButtons", "<init>", "(Lg91/g;Ljava/lang/Boolean;Lg91/D;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lg91/g;", "a", "()Lg91/g;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Lg91/D;", "c", "()Lg91/D;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getUseMultiButtons", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o {

    @com.google.gson.annotations.c(PlatformActions.EXPANDABLE)
    @Y61.l
    private final C40560g expandable;

    @com.google.gson.annotations.c(PlatformActions.HIDE_KEYBOARD)
    @Y61.l
    private final Boolean hideKeyboard;

    @com.google.gson.annotations.c(PlatformActions.ItemsList.ITEMS_REQUEST)
    @Y61.l
    private final D itemsRequest;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("useMultiButtons")
    @Y61.l
    private final Boolean useMultiButtons;

    public o(@Y61.l C40560g c40560g, @Y61.l Boolean bool, @Y61.l D d12, @Y61.k String str, @Y61.l Boolean bool2) {
        this.expandable = c40560g;
        this.hideKeyboard = bool;
        this.itemsRequest = d12;
        this.title = str;
        this.useMultiButtons = bool2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C40560g getExpandable() {
        return this.expandable;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Boolean getHideKeyboard() {
        return this.hideKeyboard;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final D getItemsRequest() {
        return this.itemsRequest;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

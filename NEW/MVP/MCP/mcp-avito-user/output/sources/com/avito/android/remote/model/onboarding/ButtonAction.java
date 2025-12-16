package com.avito.android.remote.model.onboarding;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonAction.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/onboarding/ButtonAction;", "", "(Ljava/lang/String;I)V", "isClose", "", "isGoToURI", "isNext", "isSendRequest", "CLOSE", "NEXT", "SEND_REQUEST", "GO_TO_URI", "HANDLE_URI_AND_NEXT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ButtonAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ButtonAction[] $VALUES;

    @c("close")
    public static final ButtonAction CLOSE = new ButtonAction("CLOSE", 0);

    @c("next")
    public static final ButtonAction NEXT = new ButtonAction("NEXT", 1);

    @c("send_request")
    public static final ButtonAction SEND_REQUEST = new ButtonAction("SEND_REQUEST", 2);

    @c("go_to_uri")
    public static final ButtonAction GO_TO_URI = new ButtonAction("GO_TO_URI", 3);

    @c("handle_uri_and_next")
    public static final ButtonAction HANDLE_URI_AND_NEXT = new ButtonAction("HANDLE_URI_AND_NEXT", 4);

    private static final /* synthetic */ ButtonAction[] $values() {
        return new ButtonAction[]{CLOSE, NEXT, SEND_REQUEST, GO_TO_URI, HANDLE_URI_AND_NEXT};
    }

    static {
        ButtonAction[] buttonActionArr$values = $values();
        $VALUES = buttonActionArr$values;
        $ENTRIES = kotlin.enums.c.a(buttonActionArr$values);
    }

    private ButtonAction(String str, int i12) {
    }

    @k
    public static a<ButtonAction> getEntries() {
        return $ENTRIES;
    }

    public static ButtonAction valueOf(String str) {
        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
    }

    public static ButtonAction[] values() {
        return (ButtonAction[]) $VALUES.clone();
    }

    public final boolean isClose() {
        return this == CLOSE;
    }

    public final boolean isGoToURI() {
        return this == GO_TO_URI;
    }

    public final boolean isNext() {
        return this == NEXT;
    }

    public final boolean isSendRequest() {
        return this == SEND_REQUEST;
    }
}

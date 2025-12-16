package com.avito.android.remote.model.profile_removal;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RemovalButton.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/ButtonTypes;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUPPORT_REQUEST", "NEXT", "ACTION", "REMOVE_PROFILE", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ButtonTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ButtonTypes[] $VALUES;

    @k
    private final String value;

    @c("support_request")
    public static final ButtonTypes SUPPORT_REQUEST = new ButtonTypes("SUPPORT_REQUEST", 0, "support_request");

    @c("next")
    public static final ButtonTypes NEXT = new ButtonTypes("NEXT", 1, "next");

    @c("action")
    public static final ButtonTypes ACTION = new ButtonTypes("ACTION", 2, "action");

    @c("remove_profile")
    public static final ButtonTypes REMOVE_PROFILE = new ButtonTypes("REMOVE_PROFILE", 3, "remove_profile");

    private static final /* synthetic */ ButtonTypes[] $values() {
        return new ButtonTypes[]{SUPPORT_REQUEST, NEXT, ACTION, REMOVE_PROFILE};
    }

    static {
        ButtonTypes[] buttonTypesArr$values = $values();
        $VALUES = buttonTypesArr$values;
        $ENTRIES = kotlin.enums.c.a(buttonTypesArr$values);
    }

    private ButtonTypes(String str, int i12, String str2) {
        this.value = str2;
    }

    @k
    public static a<ButtonTypes> getEntries() {
        return $ENTRIES;
    }

    public static ButtonTypes valueOf(String str) {
        return (ButtonTypes) Enum.valueOf(ButtonTypes.class, str);
    }

    public static ButtonTypes[] values() {
        return (ButtonTypes[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}

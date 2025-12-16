package com.avito.android.remote.model.user_profile.items;

import Y61.k;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoFinanceItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/State;", "", "(Ljava/lang/String;I)V", "DISABLED", "EXISTS", "ERROR", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class State {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;

    @c(BeduinCartItemModel.DISABLED_STRING)
    public static final State DISABLED = new State("DISABLED", 0);

    @c("exists")
    public static final State EXISTS = new State("EXISTS", 1);

    @c("error")
    public static final State ERROR = new State("ERROR", 2);

    private static final /* synthetic */ State[] $values() {
        return new State[]{DISABLED, EXISTS, ERROR};
    }

    static {
        State[] stateArr$values = $values();
        $VALUES = stateArr$values;
        $ENTRIES = kotlin.enums.c.a(stateArr$values);
    }

    private State(String str, int i12) {
    }

    @k
    public static a<State> getEntries() {
        return $ENTRIES;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}

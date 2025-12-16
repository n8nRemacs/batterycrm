package com.avito.android.lib.design.toggle;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toggle/State;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class State {

    /* renamed from: b, reason: collision with root package name */
    public static final State f181147b;

    /* renamed from: c, reason: collision with root package name */
    public static final State f181148c;

    /* renamed from: d, reason: collision with root package name */
    public static final State f181149d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ State[] f181150e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181151f;

    static {
        State state = new State("CHECKED", 0);
        f181147b = state;
        State state2 = new State("UNCHECKED", 1);
        f181148c = state2;
        State state3 = new State("INDETERMINATE", 2);
        f181149d = state3;
        State[] stateArr = {state, state2, state3};
        f181150e = stateArr;
        f181151f = c.a(stateArr);
    }

    public State() {
        throw null;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) f181150e.clone();
    }
}

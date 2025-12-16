package com.avito.android.design;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: State.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/design/State;", "", "a", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class State {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f135879c;

    /* renamed from: d, reason: collision with root package name */
    public static final State f135880d;

    /* renamed from: e, reason: collision with root package name */
    public static final State f135881e;

    /* renamed from: f, reason: collision with root package name */
    public static final State f135882f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ State[] f135883g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135884h;

    /* renamed from: b, reason: collision with root package name */
    public final int f135885b;

    /* compiled from: State.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/design/State$a;", "", "<init>", "()V", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        State state = new State("PLACEHOLDER", 0, 0);
        f135880d = state;
        State state2 = new State("ERROR", 1, 1);
        f135881e = state2;
        State state3 = new State("LOADED", 2, 2);
        f135882f = state3;
        State[] stateArr = {state, state2, state3};
        f135883g = stateArr;
        f135884h = c.a(stateArr);
        f135879c = new a(null);
    }

    public State(String str, int i12, int i13) {
        this.f135885b = i13;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) f135883g.clone();
    }
}

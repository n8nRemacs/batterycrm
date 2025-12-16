package com.avito.android.developments_agency_search.utils;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: AppBarStateChangeListener.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/utils/AppBarStateChangeListener;", "Lcom/google/android/material/appbar/AppBarLayout$g;", "<init>", "()V", "State", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AppBarStateChangeListener implements AppBarLayout.g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public State f139059b = State.f139062d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppBarStateChangeListener.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/utils/AppBarStateChangeListener$State;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f139060b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f139061c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f139062d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f139063e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a f139064f;

        static {
            State state = new State("EXPANDED", 0);
            f139060b = state;
            State state2 = new State("COLLAPSED", 1);
            f139061c = state2;
            State state3 = new State("IDLE", 2);
            f139062d = state3;
            State[] stateArr = {state, state2, state3};
            f139063e = stateArr;
            f139064f = c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f139063e.clone();
        }
    }

    public abstract void a(@k State state);

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void c(@k AppBarLayout appBarLayout, int i12) {
        if (i12 == 0) {
            State state = this.f139059b;
            State state2 = State.f139060b;
            if (state != state2) {
                a(state2);
            }
            this.f139059b = state2;
            return;
        }
        if (Math.abs(i12) >= appBarLayout.getTotalScrollRange()) {
            State state3 = this.f139059b;
            State state4 = State.f139061c;
            if (state3 != state4) {
                a(state4);
            }
            this.f139059b = state4;
            return;
        }
        State state5 = this.f139059b;
        State state6 = State.f139062d;
        if (state5 != state6) {
            a(state6);
        }
        this.f139059b = state6;
    }
}

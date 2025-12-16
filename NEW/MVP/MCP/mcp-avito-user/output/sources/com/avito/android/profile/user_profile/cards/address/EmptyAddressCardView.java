package com.avito.android.profile.user_profile.cards.address;

import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.user_profile.items.SuggestedAddress;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EmptyAddressCardView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/EmptyAddressCardView;", "Lcom/avito/android/profile/user_profile/cards/c;", "State", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface EmptyAddressCardView extends com.avito.android.profile.user_profile.cards.c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EmptyAddressCardView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/EmptyAddressCardView$State;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f224714b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f224715c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f224716d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f224717e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f224718f;

        static {
            State state = new State("SUGGESTED", 0);
            f224714b = state;
            State state2 = new State("PROFILE", 1);
            f224715c = state2;
            State state3 = new State("EMPTY", 2);
            f224716d = state3;
            State[] stateArr = {state, state2, state3};
            f224717e = stateArr;
            f224718f = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f224717e.clone();
        }
    }

    /* compiled from: EmptyAddressCardView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void D3(@Y61.k String str, @Y61.k Y41.a<G0> aVar);

    void I1(@Y61.l String str);

    void QD(@Y61.l SuggestedAddress suggestedAddress, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2);

    void i(@Y61.k UniversalImage universalImage);

    void j80(@Y61.l String str, @Y61.k String str2, @Y61.k String str3);

    void setText(@Y61.k String str);

    void setTitle(@Y61.k String str);

    void sz(@Y61.k State state);
}

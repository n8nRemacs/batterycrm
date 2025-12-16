package com.avito.android.paranja;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ParanjaState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState;", "", "ClickPosition", "State", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ParanjaState {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final State f210845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<ClickPosition, G0> f210846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g f210847c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ParanjaState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClickPosition {

        /* renamed from: b, reason: collision with root package name */
        public static final ClickPosition f210848b;

        /* renamed from: c, reason: collision with root package name */
        public static final ClickPosition f210849c;

        /* renamed from: d, reason: collision with root package name */
        public static final ClickPosition f210850d;

        /* renamed from: e, reason: collision with root package name */
        public static final ClickPosition f210851e;

        /* renamed from: f, reason: collision with root package name */
        public static final ClickPosition f210852f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ClickPosition[] f210853g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f210854h;

        static {
            ClickPosition clickPosition = new ClickPosition("OUTSIDE", 0);
            f210848b = clickPosition;
            ClickPosition clickPosition2 = new ClickPosition("TARGET", 1);
            f210849c = clickPosition2;
            ClickPosition clickPosition3 = new ClickPosition("TOOLTIP", 2);
            f210850d = clickPosition3;
            ClickPosition clickPosition4 = new ClickPosition("CROSS", 3);
            f210851e = clickPosition4;
            ClickPosition clickPosition5 = new ClickPosition("BUTTON", 4);
            f210852f = clickPosition5;
            ClickPosition[] clickPositionArr = {clickPosition, clickPosition2, clickPosition3, clickPosition4, clickPosition5};
            f210853g = clickPositionArr;
            f210854h = kotlin.enums.c.a(clickPositionArr);
        }

        public ClickPosition() {
            throw null;
        }

        public static ClickPosition valueOf(String str) {
            return (ClickPosition) Enum.valueOf(ClickPosition.class, str);
        }

        public static ClickPosition[] values() {
            return (ClickPosition[]) f210853g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ParanjaState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$State;", "", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f210855b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f210856c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f210857d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f210858e;

        static {
            State state = new State("SHOW", 0);
            f210855b = state;
            State state2 = new State("DISMISS", 1);
            f210856c = state2;
            State[] stateArr = {state, state2};
            f210857d = stateArr;
            f210858e = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f210857d.clone();
        }
    }

    /* compiled from: ParanjaState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<ClickPosition, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f210859l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(ClickPosition clickPosition) {
            return G0.f406611a;
        }
    }

    public ParanjaState() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParanjaState)) {
            return false;
        }
        ParanjaState paranjaState = (ParanjaState) obj;
        return this.f210845a == paranjaState.f210845a && L.f(this.f210846b, paranjaState.f210846b) && L.f(this.f210847c, paranjaState.f210847c);
    }

    public final int hashCode() {
        int iHashCode = this.f210845a.hashCode() * 31;
        Y41.l<ClickPosition, G0> lVar = this.f210846b;
        return this.f210847c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ParanjaState(stateOfVisible=" + this.f210845a + ", onClick=" + this.f210846b + ", tooltipState=" + this.f210847c + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParanjaState(@Y61.k State state, @Y61.l Y41.l<? super ClickPosition, G0> lVar, @Y61.k g gVar) {
        this.f210845a = state;
        this.f210846b = lVar;
        this.f210847c = gVar;
    }

    public /* synthetic */ ParanjaState(State state, Y41.l lVar, g gVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? State.f210855b : state, (i12 & 2) != 0 ? a.f210859l : lVar, (i12 & 4) != 0 ? new g(null, false, null, null, null, null, null, null, false, 511, null) : gVar);
    }
}

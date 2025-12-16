package com.avito.android.map_core.analytics.event;

import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;

/* compiled from: PinDescription.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/map_core/analytics/event/PinDescription;", "", "()V", "Highlight", "State", "Type", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinDescription {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PinDescription.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/PinDescription$Highlight;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Highlight {

        /* renamed from: c, reason: collision with root package name */
        public static final Highlight f185578c;

        /* renamed from: d, reason: collision with root package name */
        public static final Highlight f185579d;

        /* renamed from: e, reason: collision with root package name */
        public static final Highlight f185580e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Highlight[] f185581f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185582g;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f185583b;

        static {
            Highlight highlight = new Highlight("VIOLET", 0, "violet");
            f185578c = highlight;
            Highlight highlight2 = new Highlight("REGULAR", 1, FontStyleKt.REGULAR);
            f185579d = highlight2;
            Highlight highlight3 = new Highlight("GREEN", 2, "green");
            f185580e = highlight3;
            Highlight[] highlightArr = {highlight, highlight2, highlight3};
            f185581f = highlightArr;
            f185582g = kotlin.enums.c.a(highlightArr);
        }

        public Highlight(String str, int i12, String str2) {
            this.f185583b = str2;
        }

        public static Highlight valueOf(String str) {
            return (Highlight) Enum.valueOf(Highlight.class, str);
        }

        public static Highlight[] values() {
            return (Highlight[]) f185581f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PinDescription.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/PinDescription$State;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: c, reason: collision with root package name */
        public static final State f185584c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f185585d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f185586e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f185587f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f185588g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185589h;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f185590b;

        static {
            State state = new State("UNVIEWED", 0, "unviewed");
            f185584c = state;
            State state2 = new State("VIEWED", 1, "viewed");
            f185585d = state2;
            State state3 = new State("SELECTED", 2, "selected");
            f185586e = state3;
            State state4 = new State("FAVORITE", 3, "favorite");
            f185587f = state4;
            State[] stateArr = {state, state2, state3, state4};
            f185588g = stateArr;
            f185589h = kotlin.enums.c.a(stateArr);
        }

        public State(String str, int i12, String str2) {
            this.f185590b = str2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f185588g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PinDescription.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/PinDescription$Type;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: c, reason: collision with root package name */
        public static final Type f185591c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f185592d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f185593e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f185594f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185595g;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f185596b;

        static {
            Type type = new Type("RASH", 0, "point");
            f185591c = type;
            Type type2 = new Type("PIN", 1, "pin");
            f185592d = type2;
            Type type3 = new Type("PRICE_PIN", 2, "price_pin");
            f185593e = type3;
            Type[] typeArr = {type, type2, type3};
            f185594f = typeArr;
            f185595g = kotlin.enums.c.a(typeArr);
        }

        public Type(String str, int i12, String str2) {
            this.f185596b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f185594f.clone();
        }
    }
}

package com.avito.android.vas_performance.screens.applied_services.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.component.chips.C27332a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "Section", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliedServicesState extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f320279g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final AppliedServicesState f320280h = new AppliedServicesState(null, false, C42784z0.f406748b, null, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ApiError f320281b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f320282c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Section> f320283d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f320284e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f320285f;

    /* compiled from: AppliedServicesState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f320308a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f320309b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final wZ.l f320310c;

        public a(@k String str, @k DeepLink deepLink, @l wZ.l lVar) {
            this.f320308a = str;
            this.f320309b = deepLink;
            this.f320310c = lVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f320308a, aVar.f320308a) && L.f(this.f320309b, aVar.f320309b) && L.f(this.f320310c, aVar.f320310c);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f320309b, this.f320308a.hashCode() * 31, 31);
            wZ.l lVar = this.f320310c;
            return iE2 + (lVar == null ? 0 : lVar.hashCode());
        }

        @k
        public final String toString() {
            return "Action(title=" + this.f320308a + ", deepLink=" + this.f320309b + ", image=" + this.f320310c + ')';
        }
    }

    /* compiled from: AppliedServicesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$b;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AppliedServicesState(@l ApiError apiError, boolean z12, @k List<Section> list, @l a aVar, @l a aVar2) {
        this.f320281b = apiError;
        this.f320282c = z12;
        this.f320283d = list;
        this.f320284e = aVar;
        this.f320285f = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AppliedServicesState a(AppliedServicesState appliedServicesState, ApiError apiError, ArrayList arrayList, int i12) {
        if ((i12 & 1) != 0) {
            apiError = appliedServicesState.f320281b;
        }
        ApiError apiError2 = apiError;
        boolean z12 = (i12 & 2) != 0 ? appliedServicesState.f320282c : true;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = appliedServicesState.f320283d;
        }
        a aVar = appliedServicesState.f320284e;
        a aVar2 = appliedServicesState.f320285f;
        appliedServicesState.getClass();
        return new AppliedServicesState(apiError2, z12, list, aVar, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedServicesState)) {
            return false;
        }
        AppliedServicesState appliedServicesState = (AppliedServicesState) obj;
        return L.f(this.f320281b, appliedServicesState.f320281b) && this.f320282c == appliedServicesState.f320282c && L.f(this.f320283d, appliedServicesState.f320283d) && L.f(this.f320284e, appliedServicesState.f320284e) && L.f(this.f320285f, appliedServicesState.f320285f);
    }

    public final int hashCode() {
        ApiError apiError = this.f320281b;
        int iE2 = H.e(r.i((apiError == null ? 0 : apiError.hashCode()) * 31, 31, this.f320282c), 31, this.f320283d);
        a aVar = this.f320284e;
        int iHashCode = (iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f320285f;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AppliedServicesState(error=" + this.f320281b + ", isLoading=" + this.f320282c + ", sections=" + this.f320283d + ", primaryAction=" + this.f320284e + ", secondaryAction=" + this.f320285f + ')';
    }

    /* compiled from: AppliedServicesState.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$Section;", "", "a", "Item", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f320286a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a f320287b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f320288c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a f320289d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<Item> f320290e;

        /* compiled from: AppliedServicesState.kt */
        @H0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$Section$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f320305a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final wZ.l f320306b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final wZ.k f320307c;

            public a(@k String str, @l wZ.l lVar, @k wZ.k kVar) {
                this.f320305a = str;
                this.f320306b = lVar;
                this.f320307c = kVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f320305a, aVar.f320305a) && L.f(this.f320306b, aVar.f320306b) && L.f(this.f320307c, aVar.f320307c);
            }

            public final int hashCode() {
                int iHashCode = this.f320305a.hashCode() * 31;
                wZ.l lVar = this.f320306b;
                return this.f320307c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "Banner(text=" + this.f320305a + ", image=" + this.f320306b + ", backgroundColor=" + this.f320307c + ')';
            }
        }

        public Section(@k String str, @l a aVar, @l String str2, @l a aVar2, @k List<Item> list) {
            this.f320286a = str;
            this.f320287b = aVar;
            this.f320288c = str2;
            this.f320289d = aVar2;
            this.f320290e = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return L.f(this.f320286a, section.f320286a) && L.f(this.f320287b, section.f320287b) && L.f(this.f320288c, section.f320288c) && L.f(this.f320289d, section.f320289d) && L.f(this.f320290e, section.f320290e);
        }

        public final int hashCode() {
            int iHashCode = this.f320286a.hashCode() * 31;
            a aVar = this.f320287b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f320288c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            a aVar2 = this.f320289d;
            return this.f320290e.hashCode() + ((iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Section(title=");
            sb2.append(this.f320286a);
            sb2.append(", banner=");
            sb2.append(this.f320287b);
            sb2.append(", description=");
            sb2.append(this.f320288c);
            sb2.append(", action=");
            sb2.append(this.f320289d);
            sb2.append(", items=");
            return H.p(sb2, this.f320290e, ')');
        }

        /* compiled from: AppliedServicesState.kt */
        @H0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$Section$Item;", "", "State", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Item {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f320291a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f320292b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Image f320293c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f320294d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final a f320295e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final State f320296f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final a f320297g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final List<C27332a> f320298h;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: AppliedServicesState.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$Section$Item$State;", "", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class State {

                /* renamed from: c, reason: collision with root package name */
                @k
                public static final a f320299c;

                /* renamed from: d, reason: collision with root package name */
                public static final State f320300d;

                /* renamed from: e, reason: collision with root package name */
                public static final State f320301e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ State[] f320302f;

                /* renamed from: g, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f320303g;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f320304b;

                /* compiled from: AppliedServicesState.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState$Section$Item$State$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class a {
                    public /* synthetic */ a(C42822w c42822w) {
                        this();
                    }

                    public a() {
                    }
                }

                static {
                    State state = new State("APPLIED", 0, "applied");
                    State state2 = new State("PLANNED", 1, "planned");
                    State state3 = new State("CANCELLED", 2, "cancelled");
                    f320300d = state3;
                    State state4 = new State("NONE", 3, "");
                    f320301e = state4;
                    State[] stateArr = {state, state2, state3, state4};
                    f320302f = stateArr;
                    f320303g = c.a(stateArr);
                    f320299c = new a(null);
                }

                public State(String str, int i12, String str2) {
                    this.f320304b = str2;
                }

                public static State valueOf(String str) {
                    return (State) Enum.valueOf(State.class, str);
                }

                public static State[] values() {
                    return (State[]) f320302f.clone();
                }
            }

            public Item(@k String str, @k String str2, @k Image image, @l String str3, @l a aVar, @k State state, @l a aVar2, @l List<C27332a> list) {
                this.f320291a = str;
                this.f320292b = str2;
                this.f320293c = image;
                this.f320294d = str3;
                this.f320295e = aVar;
                this.f320296f = state;
                this.f320297g = aVar2;
                this.f320298h = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj;
                return L.f(this.f320291a, item.f320291a) && L.f(this.f320292b, item.f320292b) && L.f(this.f320293c, item.f320293c) && L.f(this.f320294d, item.f320294d) && L.f(this.f320295e, item.f320295e) && this.f320296f == item.f320296f && L.f(this.f320297g, item.f320297g) && L.f(this.f320298h, item.f320298h);
            }

            public final int hashCode() {
                int iG2 = com.avito.android.actions_sheet.a.g(this.f320293c, H.d(this.f320291a.hashCode() * 31, 31, this.f320292b), 31);
                String str = this.f320294d;
                int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
                a aVar = this.f320295e;
                int iHashCode2 = (this.f320296f.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
                a aVar2 = this.f320297g;
                int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                List<C27332a> list = this.f320298h;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Item(title=");
                sb2.append(this.f320291a);
                sb2.append(", description=");
                sb2.append(this.f320292b);
                sb2.append(", icon=");
                sb2.append(this.f320293c);
                sb2.append(", planId=");
                sb2.append(this.f320294d);
                sb2.append(", action=");
                sb2.append(this.f320295e);
                sb2.append(", state=");
                sb2.append(this.f320296f);
                sb2.append(", itemAction=");
                sb2.append(this.f320297g);
                sb2.append(", stickers=");
                return H.p(sb2, this.f320298h, ')');
            }

            public /* synthetic */ Item(String str, String str2, Image image, String str3, a aVar, State state, a aVar2, List list, int i12, C42822w c42822w) {
                this(str, str2, image, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : aVar, (i12 & 32) != 0 ? State.f320301e : state, (i12 & 64) != 0 ? null : aVar2, (i12 & 128) != 0 ? null : list);
            }
        }
    }
}

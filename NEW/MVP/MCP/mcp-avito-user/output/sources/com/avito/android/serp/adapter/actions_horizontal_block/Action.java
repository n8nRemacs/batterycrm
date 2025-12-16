package com.avito.android.serp.adapter.actions_horizontal_block;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionsHorizontalBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/Action;", "Landroid/os/Parcelable;", "()V", "InlineFilter", "Predefined", "Lcom/avito/android/serp/adapter/actions_horizontal_block/Action$InlineFilter;", "Lcom/avito/android/serp/adapter/actions_horizontal_block/Action$Predefined;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Action implements Parcelable {

    /* compiled from: ActionsHorizontalBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/Action$InlineFilter;", "Lcom/avito/android/serp/adapter/actions_horizontal_block/Action;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class InlineFilter extends Action {

        @Y61.k
        public static final Parcelable.Creator<InlineFilter> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f268636b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f268637c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f268638d;

        /* compiled from: ActionsHorizontalBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InlineFilter> {
            @Override // android.os.Parcelable.Creator
            public final InlineFilter createFromParcel(Parcel parcel) {
                return new InlineFilter(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InlineFilter[] newArray(int i12) {
                return new InlineFilter[i12];
            }
        }

        public InlineFilter(@Y61.l String str, @Y61.k String str2, @Y61.k String str3) {
            super(null);
            this.f268636b = str;
            this.f268637c = str2;
            this.f268638d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineFilter)) {
                return false;
            }
            InlineFilter inlineFilter = (InlineFilter) obj;
            return L.f(this.f268636b, inlineFilter.f268636b) && L.f(this.f268637c, inlineFilter.f268637c) && L.f(this.f268638d, inlineFilter.f268638d);
        }

        public final int hashCode() {
            String str = this.f268636b;
            return this.f268638d.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f268637c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilter(iconName=");
            sb2.append(this.f268636b);
            sb2.append(", title=");
            sb2.append(this.f268637c);
            sb2.append(", filterId=");
            return C22026a.c(sb2, this.f268638d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f268636b);
            parcel.writeString(this.f268637c);
            parcel.writeString(this.f268638d);
        }
    }

    public /* synthetic */ Action(C42822w c42822w) {
        this();
    }

    /* compiled from: ActionsHorizontalBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/Action$Predefined;", "Lcom/avito/android/serp/adapter/actions_horizontal_block/Action;", "State", "Type", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Predefined extends Action {

        @Y61.k
        public static final Parcelable.Creator<Predefined> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f268639b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f268640c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f268641d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f268642e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f268643f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final DeepLink f268644g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Type f268645h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final State f268646i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ActionsHorizontalBlockItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/Action$Predefined$State;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class State {

            /* renamed from: b, reason: collision with root package name */
            public static final State f268647b;

            /* renamed from: c, reason: collision with root package name */
            public static final State f268648c;

            /* renamed from: d, reason: collision with root package name */
            public static final State f268649d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ State[] f268650e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f268651f;

            static {
                State state = new State("ON", 0);
                f268647b = state;
                State state2 = new State("OFF", 1);
                f268648c = state2;
                State state3 = new State("LOADING", 2);
                f268649d = state3;
                State[] stateArr = {state, state2, state3};
                f268650e = stateArr;
                f268651f = kotlin.enums.c.a(stateArr);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f268650e.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ActionsHorizontalBlockItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/Action$Predefined$Type;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f268652b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Type[] f268653c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f268654d;

            static {
                Type type = new Type("SUBSCRIBE_SEARCH", 0);
                f268652b = type;
                Type[] typeArr = {type, new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1)};
                f268653c = typeArr;
                f268654d = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f268653c.clone();
            }
        }

        /* compiled from: ActionsHorizontalBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Predefined> {
            @Override // android.os.Parcelable.Creator
            public final Predefined createFromParcel(Parcel parcel) {
                return new Predefined(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Predefined.class.getClassLoader()), Type.valueOf(parcel.readString()), State.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Predefined[] newArray(int i12) {
                return new Predefined[i12];
            }
        }

        public /* synthetic */ Predefined(String str, String str2, String str3, String str4, String str5, DeepLink deepLink, Type type, State state, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, (i12 & 16) != 0 ? "" : str5, deepLink, type, state);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Predefined)) {
                return false;
            }
            Predefined predefined = (Predefined) obj;
            return L.f(this.f268639b, predefined.f268639b) && L.f(this.f268640c, predefined.f268640c) && L.f(this.f268641d, predefined.f268641d) && L.f(this.f268642e, predefined.f268642e) && L.f(this.f268643f, predefined.f268643f) && L.f(this.f268644g, predefined.f268644g) && this.f268645h == predefined.f268645h && this.f268646i == predefined.f268646i;
        }

        public final int hashCode() {
            String str = this.f268639b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f268640c;
            int iD2 = H.d(H.d(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f268641d), 31, this.f268642e), 31, this.f268643f);
            DeepLink deepLink = this.f268644g;
            return this.f268646i.hashCode() + ((this.f268645h.hashCode() + ((iD2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Predefined(icon=" + this.f268639b + ", iconOn=" + this.f268640c + ", title=" + this.f268641d + ", titleOn=" + this.f268642e + ", titleLoading=" + this.f268643f + ", deepLink=" + this.f268644g + ", type=" + this.f268645h + ", state=" + this.f268646i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f268639b);
            parcel.writeString(this.f268640c);
            parcel.writeString(this.f268641d);
            parcel.writeString(this.f268642e);
            parcel.writeString(this.f268643f);
            parcel.writeParcelable(this.f268644g, i12);
            parcel.writeString(this.f268645h.name());
            parcel.writeString(this.f268646i.name());
        }

        public Predefined(@Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.l DeepLink deepLink, @Y61.k Type type, @Y61.k State state) {
            super(null);
            this.f268639b = str;
            this.f268640c = str2;
            this.f268641d = str3;
            this.f268642e = str4;
            this.f268643f = str5;
            this.f268644g = deepLink;
            this.f268645h = type;
            this.f268646i = state;
        }
    }

    public Action() {
    }
}

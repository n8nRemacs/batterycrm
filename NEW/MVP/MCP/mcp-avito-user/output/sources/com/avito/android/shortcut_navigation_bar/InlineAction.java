package com.avito.android.shortcut_navigation_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InlineActions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/InlineAction;", "Landroid/os/Parcelable;", "()V", "InlineFilter", "Predefined", "Lcom/avito/android/shortcut_navigation_bar/InlineAction$InlineFilter;", "Lcom/avito/android/shortcut_navigation_bar/InlineAction$Predefined;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InlineAction implements Parcelable {

    /* compiled from: InlineActions.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/InlineAction$InlineFilter;", "Lcom/avito/android/shortcut_navigation_bar/InlineAction;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilter extends InlineAction {

        @Y61.k
        public static final Parcelable.Creator<InlineFilter> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f283108b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f283109c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f283110d;

        /* compiled from: InlineActions.kt */
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
            this.f283108b = str;
            this.f283109c = str2;
            this.f283110d = str3;
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
            return kotlin.jvm.internal.L.f(this.f283108b, inlineFilter.f283108b) && kotlin.jvm.internal.L.f(this.f283109c, inlineFilter.f283109c) && kotlin.jvm.internal.L.f(this.f283110d, inlineFilter.f283110d);
        }

        public final int hashCode() {
            String str = this.f283108b;
            return this.f283110d.hashCode() + androidx.compose.foundation.H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f283109c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilter(iconName=");
            sb2.append(this.f283108b);
            sb2.append(", title=");
            sb2.append(this.f283109c);
            sb2.append(", filterId=");
            return C22026a.c(sb2, this.f283110d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f283108b);
            parcel.writeString(this.f283109c);
            parcel.writeString(this.f283110d);
        }
    }

    /* compiled from: InlineActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/InlineAction$Predefined;", "Lcom/avito/android/shortcut_navigation_bar/InlineAction;", "State", "Type", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Predefined extends InlineAction {

        @Y61.k
        public static final Parcelable.Creator<Predefined> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f283111b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f283112c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f283113d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f283114e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f283115f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Type f283116g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final State f283117h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: InlineActions.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/InlineAction$Predefined$State;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class State {

            /* renamed from: b, reason: collision with root package name */
            public static final State f283118b;

            /* renamed from: c, reason: collision with root package name */
            public static final State f283119c;

            /* renamed from: d, reason: collision with root package name */
            public static final State f283120d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ State[] f283121e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f283122f;

            static {
                State state = new State("ON", 0);
                f283118b = state;
                State state2 = new State("OFF", 1);
                f283119c = state2;
                State state3 = new State("LOADING", 2);
                f283120d = state3;
                State[] stateArr = {state, state2, state3};
                f283121e = stateArr;
                f283122f = kotlin.enums.c.a(stateArr);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f283121e.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: InlineActions.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/InlineAction$Predefined$Type;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f283123b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Type[] f283124c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f283125d;

            static {
                Type type = new Type("SUBSCRIBE_SEARCH", 0);
                f283123b = type;
                Type[] typeArr = {type, new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1)};
                f283124c = typeArr;
                f283125d = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f283124c.clone();
            }
        }

        /* compiled from: InlineActions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Predefined> {
            @Override // android.os.Parcelable.Creator
            public final Predefined createFromParcel(Parcel parcel) {
                return new Predefined(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Predefined.class.getClassLoader()), Type.valueOf(parcel.readString()), State.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Predefined[] newArray(int i12) {
                return new Predefined[i12];
            }
        }

        public Predefined(@Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l DeepLink deepLink, @Y61.k Type type, @Y61.k State state) {
            super(null);
            this.f283111b = str;
            this.f283112c = str2;
            this.f283113d = str3;
            this.f283114e = str4;
            this.f283115f = deepLink;
            this.f283116g = type;
            this.f283117h = state;
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
            return kotlin.jvm.internal.L.f(this.f283111b, predefined.f283111b) && kotlin.jvm.internal.L.f(this.f283112c, predefined.f283112c) && kotlin.jvm.internal.L.f(this.f283113d, predefined.f283113d) && kotlin.jvm.internal.L.f(this.f283114e, predefined.f283114e) && kotlin.jvm.internal.L.f(this.f283115f, predefined.f283115f) && this.f283116g == predefined.f283116g && this.f283117h == predefined.f283117h;
        }

        public final int hashCode() {
            String str = this.f283111b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f283112c;
            int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f283113d), 31, this.f283114e);
            DeepLink deepLink = this.f283115f;
            return this.f283117h.hashCode() + ((this.f283116g.hashCode() + ((iD2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Predefined(icon=" + this.f283111b + ", iconOn=" + this.f283112c + ", title=" + this.f283113d + ", titleOn=" + this.f283114e + ", deepLink=" + this.f283115f + ", type=" + this.f283116g + ", state=" + this.f283117h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f283111b);
            parcel.writeString(this.f283112c);
            parcel.writeString(this.f283113d);
            parcel.writeString(this.f283114e);
            parcel.writeParcelable(this.f283115f, i12);
            parcel.writeString(this.f283116g.name());
            parcel.writeString(this.f283117h.name());
        }
    }

    public /* synthetic */ InlineAction(C42822w c42822w) {
        this();
    }

    public InlineAction() {
    }
}

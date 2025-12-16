package com.avito.android.suggest_locations.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.CaseText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestLocationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem;", "Landroid/os/Parcelable;", "From", "Parent", "SuggestType", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestLocationItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestLocationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f292214b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CaseText f292215c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final From f292216d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Parent f292217e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SuggestType f292218f;

    /* compiled from: SuggestLocationItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem$From;", "Landroid/os/Parcelable;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class From implements Parcelable {

        @k
        public static final Parcelable.Creator<From> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f292219b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f292220c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f292221d;

        /* compiled from: SuggestLocationItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<From> {
            @Override // android.os.Parcelable.Creator
            public final From createFromParcel(Parcel parcel) {
                return new From(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final From[] newArray(int i12) {
                return new From[i12];
            }
        }

        public From() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof From)) {
                return false;
            }
            From from = (From) obj;
            return L.f(this.f292219b, from.f292219b) && L.f(this.f292220c, from.f292220c) && L.f(this.f292221d, from.f292221d);
        }

        public final int hashCode() {
            String str = this.f292219b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f292220c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f292221d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("From(internalId=");
            sb2.append(this.f292219b);
            sb2.append(", name=");
            sb2.append(this.f292220c);
            sb2.append(", path=");
            return C22026a.c(sb2, this.f292221d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f292219b);
            parcel.writeString(this.f292220c);
            parcel.writeString(this.f292221d);
        }

        public From(@l String str, @l String str2, @l String str3) {
            this.f292219b = str;
            this.f292220c = str2;
            this.f292221d = str3;
        }

        public /* synthetic */ From(String str, String str2, String str3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
        }
    }

    /* compiled from: SuggestLocationItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem$Parent;", "Landroid/os/Parcelable;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Parent implements Parcelable {

        @k
        public static final Parcelable.Creator<Parent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f292222b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CaseText f292223c;

        /* compiled from: SuggestLocationItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Parent> {
            @Override // android.os.Parcelable.Creator
            public final Parent createFromParcel(Parcel parcel) {
                return new Parent(parcel.readString(), (CaseText) parcel.readParcelable(Parent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Parent[] newArray(int i12) {
                return new Parent[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Parent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            return L.f(this.f292222b, parent.f292222b) && L.f(this.f292223c, parent.f292223c);
        }

        public final int hashCode() {
            String str = this.f292222b;
            return this.f292223c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "Parent(id=" + this.f292222b + ", names=" + this.f292223c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f292222b);
            parcel.writeParcelable(this.f292223c, i12);
        }

        public Parent(@l String str, @k CaseText caseText) {
            this.f292222b = str;
            this.f292223c = caseText;
        }

        public /* synthetic */ Parent(String str, CaseText caseText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? new CaseText() : caseText);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuggestLocationItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem$SuggestType;", "", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestType {

        /* renamed from: c, reason: collision with root package name */
        public static final SuggestType f292224c;

        /* renamed from: d, reason: collision with root package name */
        public static final SuggestType f292225d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SuggestType[] f292226e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f292227f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f292228b;

        static {
            SuggestType suggestType = new SuggestType("HISTORICAL", 0, "history");
            f292224c = suggestType;
            SuggestType suggestType2 = new SuggestType("DEFAULT", 1, "default");
            f292225d = suggestType2;
            SuggestType[] suggestTypeArr = {suggestType, suggestType2};
            f292226e = suggestTypeArr;
            f292227f = kotlin.enums.c.a(suggestTypeArr);
        }

        public SuggestType(String str, int i12, String str2) {
            this.f292228b = str2;
        }

        public static SuggestType valueOf(String str) {
            return (SuggestType) Enum.valueOf(SuggestType.class, str);
        }

        public static SuggestType[] values() {
            return (SuggestType[]) f292226e.clone();
        }
    }

    /* compiled from: SuggestLocationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestLocationItem> {
        @Override // android.os.Parcelable.Creator
        public final SuggestLocationItem createFromParcel(Parcel parcel) {
            return new SuggestLocationItem(parcel.readString(), (CaseText) parcel.readParcelable(SuggestLocationItem.class.getClassLoader()), parcel.readInt() == 0 ? null : From.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Parent.CREATOR.createFromParcel(parcel) : null, SuggestType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestLocationItem[] newArray(int i12) {
            return new SuggestLocationItem[i12];
        }
    }

    public SuggestLocationItem(@k String str, @k CaseText caseText, @l From from, @l Parent parent, @k SuggestType suggestType) {
        this.f292214b = str;
        this.f292215c = caseText;
        this.f292216d = from;
        this.f292217e = parent;
        this.f292218f = suggestType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestLocationItem)) {
            return false;
        }
        SuggestLocationItem suggestLocationItem = (SuggestLocationItem) obj;
        return L.f(this.f292214b, suggestLocationItem.f292214b) && L.f(this.f292215c, suggestLocationItem.f292215c) && L.f(this.f292216d, suggestLocationItem.f292216d) && L.f(this.f292217e, suggestLocationItem.f292217e) && this.f292218f == suggestLocationItem.f292218f;
    }

    public final int hashCode() {
        int iHashCode = (this.f292215c.hashCode() + (this.f292214b.hashCode() * 31)) * 31;
        From from = this.f292216d;
        int iHashCode2 = (iHashCode + (from == null ? 0 : from.hashCode())) * 31;
        Parent parent = this.f292217e;
        return this.f292218f.hashCode() + ((iHashCode2 + (parent != null ? parent.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "SuggestLocationItem(id=" + this.f292214b + ", names=" + this.f292215c + ", from=" + this.f292216d + ", parent=" + this.f292217e + ", suggestType=" + this.f292218f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292214b);
        parcel.writeParcelable(this.f292215c, i12);
        From from = this.f292216d;
        if (from == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            from.writeToParcel(parcel, i12);
        }
        Parent parent = this.f292217e;
        if (parent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f292218f.name());
    }

    public /* synthetic */ SuggestLocationItem(String str, CaseText caseText, From from, Parent parent, SuggestType suggestType, int i12, C42822w c42822w) {
        this(str, caseText, from, parent, (i12 & 16) != 0 ? SuggestType.f292225d : suggestType);
    }
}

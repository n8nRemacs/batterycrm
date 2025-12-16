package com.avito.android.developments_agency_search.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: DealRoomLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "Status", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class DealRoomLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DealRoomLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f136362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Status f136363c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f136364d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DealRoomLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink$Status;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f136365c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f136366d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f136367e;

        /* renamed from: f, reason: collision with root package name */
        public static final Status f136368f;

        /* renamed from: g, reason: collision with root package name */
        public static final Status f136369g;

        /* renamed from: h, reason: collision with root package name */
        public static final Status f136370h;

        /* renamed from: i, reason: collision with root package name */
        public static final Status f136371i;

        /* renamed from: j, reason: collision with root package name */
        public static final Status f136372j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ Status[] f136373k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f136374l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f136375b;

        /* compiled from: DealRoomLink.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink$Status$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Status status = new Status("SELECTION", 0, "selection");
            f136366d = status;
            Status status2 = new Status("BINDING", 1, "binding");
            f136367e = status2;
            Status status3 = new Status("BOOKING", 2, "booking");
            f136368f = status3;
            Status status4 = new Status("DEAL", 3, "deal");
            f136369g = status4;
            Status status5 = new Status("REVENUE", 4, "revenue");
            f136370h = status5;
            Status status6 = new Status("COMPLETED", 5, "completed");
            f136371i = status6;
            Status status7 = new Status("DECLINED", 6, "declined");
            f136372j = status7;
            Status[] statusArr = {status, status2, status3, status4, status5, status6, status7};
            f136373k = statusArr;
            f136374l = kotlin.enums.c.a(statusArr);
            f136365c = new a(null);
        }

        public Status(String str, int i12, String str2) {
            this.f136375b = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f136373k.clone();
        }
    }

    /* compiled from: DealRoomLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink$a;", "", "<init>", "()V", "", "PARENT_SCREEN_CLIENT_LIST", "Ljava/lang/String;", "PARENT_SCREEN_DEAL_UPDATES", "PARENT_SCREEN_UNKNOWN", "PARENT_SCREEN_VIRTUAL_DEAL_ROOM", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealRoomLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DealRoomLink> {
        @Override // android.os.Parcelable.Creator
        public final DealRoomLink createFromParcel(Parcel parcel) {
            return new DealRoomLink(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DealRoomLink[] newArray(int i12) {
            return new DealRoomLink[i12];
        }
    }

    /* compiled from: DealRoomLink.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealRoomLink$c;", "LJu/c$a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements InterfaceC14249c.a {
        static {
            new c();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1149353510;
        }

        @Y61.k
        public final String toString() {
            return "RedirectResult";
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public DealRoomLink(@Y61.k String str, @Y61.l Status status, @Y61.k String str2) {
        this.f136362b = str;
        this.f136363c = status;
        this.f136364d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealRoomLink)) {
            return false;
        }
        DealRoomLink dealRoomLink = (DealRoomLink) obj;
        return kotlin.jvm.internal.L.f(this.f136362b, dealRoomLink.f136362b) && this.f136363c == dealRoomLink.f136363c && kotlin.jvm.internal.L.f(this.f136364d, dealRoomLink.f136364d);
    }

    public final int hashCode() {
        int iHashCode = this.f136362b.hashCode() * 31;
        Status status = this.f136363c;
        return this.f136364d.hashCode() + ((iHashCode + (status == null ? 0 : status.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealRoomLink(clientId=");
        sb2.append(this.f136362b);
        sb2.append(", status=");
        sb2.append(this.f136363c);
        sb2.append(", parentScreen=");
        return C22026a.c(sb2, this.f136364d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136362b);
        Status status = this.f136363c;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        parcel.writeString(this.f136364d);
    }
}

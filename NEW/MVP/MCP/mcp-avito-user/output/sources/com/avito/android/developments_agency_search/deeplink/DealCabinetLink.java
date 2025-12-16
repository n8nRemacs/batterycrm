package com.avito.android.developments_agency_search.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DealCabinetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealCabinetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito_developments-agency-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class DealCabinetLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DealCabinetLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f136359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f136360c;

    /* compiled from: DealCabinetLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealCabinetLink$a;", "", "<init>", "()V", "", "PARENT_SCREEN_UNKNOWN", "Ljava/lang/String;", "_avito_developments-agency-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealCabinetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DealCabinetLink> {
        @Override // android.os.Parcelable.Creator
        public final DealCabinetLink createFromParcel(Parcel parcel) {
            return new DealCabinetLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DealCabinetLink[] newArray(int i12) {
            return new DealCabinetLink[i12];
        }
    }

    /* compiled from: DealCabinetLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/DealCabinetLink$c;", "LJu/c$a;", "<init>", "()V", "_avito_developments-agency-search_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f136361b = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -510475679;
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

    public DealCabinetLink(@Y61.l String str, @Y61.k String str2) {
        this.f136359b = str;
        this.f136360c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealCabinetLink)) {
            return false;
        }
        DealCabinetLink dealCabinetLink = (DealCabinetLink) obj;
        return kotlin.jvm.internal.L.f(this.f136359b, dealCabinetLink.f136359b) && kotlin.jvm.internal.L.f(this.f136360c, dealCabinetLink.f136360c);
    }

    public final int hashCode() {
        String str = this.f136359b;
        return this.f136360c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealCabinetLink(locationId=");
        sb2.append(this.f136359b);
        sb2.append(", parentScreen=");
        return C22026a.c(sb2, this.f136360c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136359b);
        parcel.writeString(this.f136360c);
    }
}

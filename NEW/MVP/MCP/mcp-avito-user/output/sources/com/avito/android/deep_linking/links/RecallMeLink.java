package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: RecallMeLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/RecallMeLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RecallMeLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RecallMeLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133630c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133632e;

    /* compiled from: RecallMeLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeLink> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeLink createFromParcel(Parcel parcel) {
            return new RecallMeLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeLink[] newArray(int i12) {
            return new RecallMeLink[i12];
        }
    }

    /* compiled from: RecallMeLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/RecallMeLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/deep_linking/links/RecallMeLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: RecallMeLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/RecallMeLink$b$a;", "Lcom/avito/android/deep_linking/links/RecallMeLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133633b = new a();

            public a() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public RecallMeLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f133629b = str;
        this.f133630c = str2;
        this.f133631d = str3;
        this.f133632e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMeLink)) {
            return false;
        }
        RecallMeLink recallMeLink = (RecallMeLink) obj;
        return kotlin.jvm.internal.L.f(this.f133629b, recallMeLink.f133629b) && kotlin.jvm.internal.L.f(this.f133630c, recallMeLink.f133630c) && kotlin.jvm.internal.L.f(this.f133631d, recallMeLink.f133631d) && kotlin.jvm.internal.L.f(this.f133632e, recallMeLink.f133632e);
    }

    public final int hashCode() {
        int iHashCode = this.f133629b.hashCode() * 31;
        String str = this.f133630c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133631d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133632e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallMeLink(itemID=");
        sb2.append(this.f133629b);
        sb2.append(", channel=");
        sb2.append(this.f133630c);
        sb2.append(", buyerNeeds=");
        sb2.append(this.f133631d);
        sb2.append(", successMessage=");
        return C22026a.c(sb2, this.f133632e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133629b);
        parcel.writeString(this.f133630c);
        parcel.writeString(this.f133631d);
        parcel.writeString(this.f133632e);
    }
}

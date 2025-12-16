package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DraftPublicationLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftPublicationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DraftPublicationLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DraftPublicationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133289b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133290c;

    /* compiled from: DraftPublicationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DraftPublicationLink> {
        @Override // android.os.Parcelable.Creator
        public final DraftPublicationLink createFromParcel(Parcel parcel) {
            return new DraftPublicationLink(parcel.readString(), (DeepLink) parcel.readParcelable(DraftPublicationLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DraftPublicationLink[] newArray(int i12) {
            return new DraftPublicationLink[i12];
        }
    }

    public /* synthetic */ DraftPublicationLink(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftPublicationLink)) {
            return false;
        }
        DraftPublicationLink draftPublicationLink = (DraftPublicationLink) obj;
        return kotlin.jvm.internal.L.f(this.f133289b, draftPublicationLink.f133289b) && kotlin.jvm.internal.L.f(this.f133290c, draftPublicationLink.f133290c);
    }

    public final int hashCode() {
        int iHashCode = this.f133289b.hashCode() * 31;
        DeepLink deepLink = this.f133290c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DraftPublicationLink(draftId=");
        sb2.append(this.f133289b);
        sb2.append(", startUpAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f133290c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133289b);
        parcel.writeParcelable(this.f133290c, i12);
    }

    public DraftPublicationLink(@Y61.k String str, @Y61.l DeepLink deepLink) {
        this.f133289b = str;
        this.f133290c = deepLink;
    }

    /* compiled from: DraftPublicationLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftPublicationLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/DraftPublicationLink$b$a;", "Lcom/avito/android/deep_linking/links/DraftPublicationLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: DraftPublicationLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftPublicationLink$b$a;", "Lcom/avito/android/deep_linking/links/DraftPublicationLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133291b = new a();
        }

        /* compiled from: DraftPublicationLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftPublicationLink$b$b;", "Lcom/avito/android/deep_linking/links/DraftPublicationLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.DraftPublicationLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3997b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f133292b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final DeepLink f133293c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f133294d;

            public C3997b(@Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l String str2) {
                this.f133292b = str;
                this.f133293c = deepLink;
                this.f133294d = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3997b)) {
                    return false;
                }
                C3997b c3997b = (C3997b) obj;
                return kotlin.jvm.internal.L.f(this.f133292b, c3997b.f133292b) && kotlin.jvm.internal.L.f(this.f133293c, c3997b.f133293c) && kotlin.jvm.internal.L.f(this.f133294d, c3997b.f133294d);
            }

            public final int hashCode() {
                String str = this.f133292b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                DeepLink deepLink = this.f133293c;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                String str2 = this.f133294d;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(advertId=");
                sb2.append(this.f133292b);
                sb2.append(", postAction=");
                sb2.append(this.f133293c);
                sb2.append(", message=");
                return C22026a.c(sb2, this.f133294d, ')');
            }

            public /* synthetic */ C3997b(String str, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : deepLink, str2);
            }
        }
    }
}

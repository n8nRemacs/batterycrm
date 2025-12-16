package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import Ju.InterfaceC14247a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AddToCollectionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/AddToCollectionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AddToCollectionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AddToCollectionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f132938b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132939c;

    /* compiled from: AddToCollectionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddToCollectionLink> {
        @Override // android.os.Parcelable.Creator
        public final AddToCollectionLink createFromParcel(Parcel parcel) {
            return new AddToCollectionLink(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddToCollectionLink[] newArray(int i12) {
            return new AddToCollectionLink[i12];
        }
    }

    /* compiled from: AddToCollectionLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/AddToCollectionLink$b;", "", "<init>", "()V", "a", "b", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AddToCollectionLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AddToCollectionLink$b$a;", "LJu/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f132940b;

            public a(@Y61.k DeepLink deepLink) {
                this.f132940b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f132940b, ((a) obj).f132940b);
            }

            public final int hashCode() {
                return this.f132940b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Added(deepLink="), this.f132940b, ')');
            }
        }

        /* compiled from: AddToCollectionLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AddToCollectionLink$b$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.AddToCollectionLink$b$b, reason: collision with other inner class name */
        public static final class C3983b implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3983b f132941b = new C3983b();
        }

        /* compiled from: AddToCollectionLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AddToCollectionLink$b$c;", "LJu/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f132942b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f132943c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f132944d;

            public c(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k String str2) {
                this.f132942b = deepLink;
                this.f132943c = str;
                this.f132944d = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.L.f(this.f132942b, cVar.f132942b) && kotlin.jvm.internal.L.f(this.f132943c, cVar.f132943c) && kotlin.jvm.internal.L.f(this.f132944d, cVar.f132944d);
            }

            public final int hashCode() {
                return this.f132944d.hashCode() + androidx.compose.foundation.H.d(this.f132942b.hashCode() * 31, 31, this.f132943c);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("EmptyCollectionCreated(deepLink=");
                sb2.append(this.f132942b);
                sb2.append(", collectionId=");
                sb2.append(this.f132943c);
                sb2.append(", collectionName=");
                return C22026a.c(sb2, this.f132944d, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AddToCollectionLink(@Y61.k List<String> list, @Y61.l String str) {
        this.f132938b = list;
        this.f132939c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCollectionLink)) {
            return false;
        }
        AddToCollectionLink addToCollectionLink = (AddToCollectionLink) obj;
        return kotlin.jvm.internal.L.f(this.f132938b, addToCollectionLink.f132938b) && kotlin.jvm.internal.L.f(this.f132939c, addToCollectionLink.f132939c);
    }

    public final int hashCode() {
        int iHashCode = this.f132938b.hashCode() * 31;
        String str = this.f132939c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddToCollectionLink(advertIds=");
        sb2.append(this.f132938b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f132939c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeStringList(this.f132938b);
        parcel.writeString(this.f132939c);
    }
}

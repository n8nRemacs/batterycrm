package com.avito.android.deep_linking.links;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CreateChannelWithAvitoLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CreateChannelWithAvitoLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<CreateChannelWithAvitoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133150d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133151e;

    /* compiled from: CreateChannelWithAvitoLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateChannelWithAvitoLink> {
        @Override // android.os.Parcelable.Creator
        public final CreateChannelWithAvitoLink createFromParcel(Parcel parcel) {
            return new CreateChannelWithAvitoLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateChannelWithAvitoLink[] newArray(int i12) {
            return new CreateChannelWithAvitoLink[i12];
        }
    }

    /* compiled from: CreateChannelWithAvitoLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$b;", "LKu/a;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<CreateChannelWithAvitoLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
            return new CreateChannelWithAvitoLink(uri.getQueryParameter("context"), uri.getQueryParameter(SearchParamsConverterKt.SOURCE), uri.getQueryParameter("extra"), uri.getQueryParameter("avitoUserId"));
        }
    }

    /* compiled from: CreateChannelWithAvitoLink.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "LJu/c$b;", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$a;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$b;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$c;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$d;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$e;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$f;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends InterfaceC14249c.b {

        /* compiled from: CreateChannelWithAvitoLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$a;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133152b = new a();
        }

        /* compiled from: CreateChannelWithAvitoLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$b;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133153b = new b();
        }

        /* compiled from: CreateChannelWithAvitoLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$c;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.CreateChannelWithAvitoLink$c$c, reason: collision with other inner class name */
        public static final class C3992c implements c, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3992c f133154b = new C3992c();
        }

        /* compiled from: CreateChannelWithAvitoLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$d;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements c, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final d f133155b = new d();
        }

        /* compiled from: CreateChannelWithAvitoLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$e;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "LJu/a$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e implements c, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final e f133156b = new e();
        }

        /* compiled from: CreateChannelWithAvitoLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c$f;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink$c;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f implements c, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final f f133157b = new f();
        }
    }

    public CreateChannelWithAvitoLink() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelWithAvitoLink)) {
            return false;
        }
        CreateChannelWithAvitoLink createChannelWithAvitoLink = (CreateChannelWithAvitoLink) obj;
        return kotlin.jvm.internal.L.f(this.f133148b, createChannelWithAvitoLink.f133148b) && kotlin.jvm.internal.L.f(this.f133149c, createChannelWithAvitoLink.f133149c) && kotlin.jvm.internal.L.f(this.f133150d, createChannelWithAvitoLink.f133150d) && kotlin.jvm.internal.L.f(this.f133151e, createChannelWithAvitoLink.f133151e);
    }

    public final int hashCode() {
        String str = this.f133148b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133149c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133150d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133151e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateChannelWithAvitoLink(context=");
        sb2.append(this.f133148b);
        sb2.append(", source=");
        sb2.append(this.f133149c);
        sb2.append(", extra=");
        sb2.append(this.f133150d);
        sb2.append(", avitoUserId=");
        return C22026a.c(sb2, this.f133151e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133148b);
        parcel.writeString(this.f133149c);
        parcel.writeString(this.f133150d);
        parcel.writeString(this.f133151e);
    }

    public /* synthetic */ CreateChannelWithAvitoLink(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
    }

    public CreateChannelWithAvitoLink(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f133148b = str;
        this.f133149c = str2;
        this.f133150d = str3;
        this.f133151e = str4;
    }
}

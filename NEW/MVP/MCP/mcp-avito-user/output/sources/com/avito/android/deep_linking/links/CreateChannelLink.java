package com.avito.android.deep_linking.links;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CreateChannelLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CreateChannelLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<CreateChannelLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133130b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133131c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133132d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133133e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f133134f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f133135g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133136h;

    /* compiled from: CreateChannelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateChannelLink> {
        @Override // android.os.Parcelable.Creator
        public final CreateChannelLink createFromParcel(Parcel parcel) {
            return new CreateChannelLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateChannelLink[] newArray(int i12) {
            return new CreateChannelLink[i12];
        }
    }

    /* compiled from: CreateChannelLink.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/c$b;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$a;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$b;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$c;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$d;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$e;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$f;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$g;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$h;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$i;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$j;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b$k;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$a;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133137b = new a();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$b;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.CreateChannelLink$b$b, reason: collision with other inner class name */
        public static final class C3991b implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3991b f133138b = new C3991b();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$c;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f133139b = new c();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$d;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final d f133140b = new d();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$e;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final e f133141b = new e();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$f;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f133142b;

            public f(@Y61.k String str) {
                this.f133142b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && kotlin.jvm.internal.L.f(this.f133142b, ((f) obj).f133142b);
            }

            public final int hashCode() {
                return this.f133142b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("SendMessageFail(itemId="), this.f133142b, ')');
            }
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$g;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class g implements b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f133143b;

            public g(@Y61.k String str) {
                this.f133143b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && kotlin.jvm.internal.L.f(this.f133143b, ((g) obj).f133143b);
            }

            public final int hashCode() {
                return this.f133143b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("SendMessageSuccess(itemId="), this.f133143b, ')');
            }
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$h;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class h implements b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final h f133144b = new h();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$i;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class i implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final i f133145b = new i();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$j;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class j implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final j f133146b = new j();
        }

        /* compiled from: CreateChannelLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateChannelLink$b$k;", "Lcom/avito/android/deep_linking/links/CreateChannelLink$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class k implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final k f133147b = new k();
        }
    }

    public /* synthetic */ CreateChannelLink(String str, String str2, String str3, String str4, boolean z12, boolean z13, String str5, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 64) == 0 ? str5 : null, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? true : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelLink)) {
            return false;
        }
        CreateChannelLink createChannelLink = (CreateChannelLink) obj;
        return kotlin.jvm.internal.L.f(this.f133130b, createChannelLink.f133130b) && kotlin.jvm.internal.L.f(this.f133131c, createChannelLink.f133131c) && kotlin.jvm.internal.L.f(this.f133132d, createChannelLink.f133132d) && kotlin.jvm.internal.L.f(this.f133133e, createChannelLink.f133133e) && this.f133134f == createChannelLink.f133134f && this.f133135g == createChannelLink.f133135g && kotlin.jvm.internal.L.f(this.f133136h, createChannelLink.f133136h);
    }

    public final int hashCode() {
        int iHashCode = this.f133130b.hashCode() * 31;
        String str = this.f133131c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133132d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133133e;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f133134f), 31, this.f133135g);
        String str4 = this.f133136h;
        return i12 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateChannelLink(itemId=");
        sb2.append(this.f133130b);
        sb2.append(", messageDraft=");
        sb2.append(this.f133131c);
        sb2.append(", context=");
        sb2.append(this.f133132d);
        sb2.append(", source=");
        sb2.append(this.f133133e);
        sb2.append(", sendDraftMessageImmediately=");
        sb2.append(this.f133134f);
        sb2.append(", openChat=");
        sb2.append(this.f133135g);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.f133136h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133130b);
        parcel.writeString(this.f133131c);
        parcel.writeString(this.f133132d);
        parcel.writeString(this.f133133e);
        parcel.writeInt(this.f133134f ? 1 : 0);
        parcel.writeInt(this.f133135g ? 1 : 0);
        parcel.writeString(this.f133136h);
    }

    public CreateChannelLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z12, boolean z13) {
        this.f133130b = str;
        this.f133131c = str2;
        this.f133132d = str3;
        this.f133133e = str4;
        this.f133134f = z12;
        this.f133135g = z13;
        this.f133136h = str5;
    }
}

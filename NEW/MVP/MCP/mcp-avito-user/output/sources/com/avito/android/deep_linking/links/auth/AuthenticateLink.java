package com.avito.android.deep_linking.links.auth;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.ChainedDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AuthLinks.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AuthenticateLink;", "Lcom/avito/android/deep_linking/links/ChainedDeepLink;", "Lcom/avito/android/deep_linking/links/q;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AuthenticateLink extends ChainedDeepLink implements q {

    @k
    public static final Parcelable.Creator<AuthenticateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133883b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133884c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f133885d;

    /* compiled from: AuthLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuthenticateLink> {
        @Override // android.os.Parcelable.Creator
        public final AuthenticateLink createFromParcel(Parcel parcel) {
            return new AuthenticateLink(parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(AuthenticateLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthenticateLink[] newArray(int i12) {
            return new AuthenticateLink[i12];
        }
    }

    /* compiled from: AuthLinks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AuthenticateLink$b;", "", "<init>", "()V", "a", "b", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AuthLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AuthenticateLink$b$a;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f133886b = new a();
        }

        /* compiled from: AuthLinks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AuthenticateLink$b$b;", "LJu/c$b;", "LJu/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.auth.AuthenticateLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4024b implements InterfaceC14249c.b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Parcelable f133887b;

            public C4024b(@l Parcelable parcelable) {
                this.f133887b = parcelable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4024b) && L.f(this.f133887b, ((C4024b) obj).f133887b);
            }

            public final int hashCode() {
                Parcelable parcelable = this.f133887b;
                if (parcelable == null) {
                    return 0;
                }
                return parcelable.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("AuthCompleted(successData="), this.f133887b, ')');
            }
        }

        /* compiled from: AuthLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AuthenticateLink$b$c;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f133888b = new c();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AuthenticateLink() {
        this((String) null, false, (DeepLink) null, 7, (C42822w) null);
    }

    public static AuthenticateLink g(AuthenticateLink authenticateLink) {
        boolean z12 = authenticateLink.f133884c;
        DeepLink deepLink = authenticateLink.f133885d;
        authenticateLink.getClass();
        return new AuthenticateLink("ps", z12, deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticateLink)) {
            return false;
        }
        AuthenticateLink authenticateLink = (AuthenticateLink) obj;
        return L.f(this.f133883b, authenticateLink.f133883b) && this.f133884c == authenticateLink.f133884c && L.f(this.f133885d, authenticateLink.f133885d);
    }

    @Override // com.avito.android.deep_linking.links.ChainedDeepLink
    @l
    /* renamed from: f, reason: from getter */
    public final DeepLink getF133537b() {
        return this.f133885d;
    }

    public final int hashCode() {
        String str = this.f133883b;
        int i12 = r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f133884c);
        DeepLink deepLink = this.f133885d;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthenticateLink(src=");
        sb2.append(this.f133883b);
        sb2.append(", clearTopNeeded=");
        sb2.append(this.f133884c);
        sb2.append(", then=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f133885d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133883b);
        parcel.writeInt(this.f133884c ? 1 : 0);
        parcel.writeParcelable(this.f133885d, i12);
    }

    public /* synthetic */ AuthenticateLink(String str, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : deepLink);
    }

    public AuthenticateLink(@l String str, boolean z12, @l DeepLink deepLink) {
        this.f133883b = str;
        this.f133884c = z12;
        this.f133885d = deepLink;
    }

    public /* synthetic */ AuthenticateLink(AuthSource authSource, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this(authSource, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : deepLink);
    }

    public AuthenticateLink(@k AuthSource authSource, boolean z12, @l DeepLink deepLink) {
        this(authSource.f92737b, z12, deepLink);
    }
}

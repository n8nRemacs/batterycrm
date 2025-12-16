package com.avito.android.deep_linking.links.auth;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.RatingPublishLink;
import com.avito.android.deep_linking.links.ChainedDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationPhoneLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink;", "Lcom/avito/android/deep_linking/links/ChainedDeepLink;", "a", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PhoneAddLink extends ChainedDeepLink {

    @k
    public static final Parcelable.Creator<PhoneAddLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133939b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f133940c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133941d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f133942e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f133943f;

    /* compiled from: VerificationPhoneLinks.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$a;", "", "<init>", "()V", "", "DEFAULT_SOURCE", "Ljava/lang/String;", "EXTENDED_PROFILE_SETTINGS_SOURCE", "FAVORITE_SELLER_ADD_SOURCE", "PHONE_VERIFICATION_ONBOARDING", "PROFILE_ADD", "REVIEW_ADD_SOURCE", "SELF_EMPLOYED_SOURCE", "WALLET", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationPhoneLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PhoneAddLink> {
        @Override // android.os.Parcelable.Creator
        public final PhoneAddLink createFromParcel(Parcel parcel) {
            return new PhoneAddLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(PhoneAddLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneAddLink[] newArray(int i12) {
            return new PhoneAddLink[i12];
        }
    }

    /* compiled from: VerificationPhoneLinks.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$a;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$b;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$c;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$d;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: VerificationPhoneLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$a;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f133944b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: VerificationPhoneLinks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$b;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c;", "LJu/c$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f133945b;

            public b(@k DeepLink deepLink) {
                super(null);
                this.f133945b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f133945b, ((b) obj).f133945b);
            }

            public final int hashCode() {
                return this.f133945b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Redirect(then="), this.f133945b, ')');
            }
        }

        /* compiled from: VerificationPhoneLinks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$c;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.auth.PhoneAddLink$c$c, reason: collision with other inner class name */
        public static final /* data */ class C4027c extends c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Intent f133946b;

            public C4027c(@l Intent intent) {
                super(null);
                this.f133946b = intent;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4027c) && L.f(this.f133946b, ((C4027c) obj).f133946b);
            }

            public final int hashCode() {
                Intent intent = this.f133946b;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            @k
            public final String toString() {
                return "Success(intent=" + this.f133946b + ')';
            }
        }

        /* compiled from: VerificationPhoneLinks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c$d;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink$c;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final RatingPublishLink f133947b;

            public d(@k RatingPublishLink ratingPublishLink) {
                super(null);
                this.f133947b = ratingPublishLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f133947b, ((d) obj).f133947b);
            }

            public final int hashCode() {
                return this.f133947b.f132859b.hashCode();
            }

            @k
            public final String toString() {
                return "SuccessWithNextLink(then=" + this.f133947b + ')';
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PhoneAddLink() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.deep_linking.links.ChainedDeepLink
    @l
    /* renamed from: f, reason: from getter */
    public final DeepLink getF133537b() {
        return this.f133943f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133939b);
        parcel.writeString(this.f133940c);
        parcel.writeString(this.f133941d);
        parcel.writeString(this.f133942e);
        parcel.writeParcelable(this.f133943f, i12);
    }

    public /* synthetic */ PhoneAddLink(String str, String str2, String str3, String str4, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? "unknown" : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : deepLink);
    }

    public PhoneAddLink(@l String str, @k String str2, @l String str3, @l String str4, @l DeepLink deepLink) {
        this.f133939b = str;
        this.f133940c = str2;
        this.f133941d = str3;
        this.f133942e = str4;
        this.f133943f = deepLink;
    }
}

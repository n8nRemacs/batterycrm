package com.avito.android.deep_linking.links.auth;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Result", "Scenario", "Source", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AutoRecoveryLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AutoRecoveryLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f133889b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Scenario f133890c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133891d;

    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;", "", "a", "Success", "Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result$a;", "Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result {

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result$Success;", "Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;", "LJu/c$b;", "ResultAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements Result, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ResultAction f133892b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: SafetyLinks.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result$Success$ResultAction;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ResultAction {

                /* renamed from: b, reason: collision with root package name */
                public static final ResultAction f133893b;

                /* renamed from: c, reason: collision with root package name */
                public static final ResultAction f133894c;

                /* renamed from: d, reason: collision with root package name */
                public static final ResultAction f133895d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ ResultAction[] f133896e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f133897f;

                static {
                    ResultAction resultAction = new ResultAction("CODE_CHECK", 0);
                    f133893b = resultAction;
                    ResultAction resultAction2 = new ResultAction("RESOLUTION", 1);
                    f133894c = resultAction2;
                    ResultAction resultAction3 = new ResultAction("DENIAL", 2);
                    f133895d = resultAction3;
                    ResultAction[] resultActionArr = {resultAction, resultAction2, resultAction3};
                    f133896e = resultActionArr;
                    f133897f = c.a(resultActionArr);
                }

                public ResultAction() {
                    throw null;
                }

                public static ResultAction valueOf(String str) {
                    return (ResultAction) Enum.valueOf(ResultAction.class, str);
                }

                public static ResultAction[] values() {
                    return (ResultAction[]) f133896e.clone();
                }
            }

            public Success(@k ResultAction resultAction) {
                this.f133892b = resultAction;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.f133892b == ((Success) obj).f133892b;
            }

            public final int hashCode() {
                return this.f133892b.hashCode();
            }

            @k
            public final String toString() {
                return "Success(action=" + this.f133892b + ')';
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result$a;", "Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements Result, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f133898b;

            public a(@k String str) {
                this.f133898b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f133898b, ((a) obj).f133898b);
            }

            public final int hashCode() {
                return this.f133898b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f133898b, ')');
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Scenario;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scenario {

        /* renamed from: c, reason: collision with root package name */
        public static final Scenario f133899c;

        /* renamed from: d, reason: collision with root package name */
        public static final Scenario f133900d;

        /* renamed from: e, reason: collision with root package name */
        public static final Scenario f133901e;

        /* renamed from: f, reason: collision with root package name */
        public static final Scenario f133902f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Scenario[] f133903g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133904h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f133905b;

        static {
            Scenario scenario = new Scenario("PUSH", 0, "unable_get_sms_push");
            Scenario scenario2 = new Scenario("PHONE_LIST", 1, "no_required_phone");
            f133899c = scenario2;
            Scenario scenario3 = new Scenario("SMS", 2, "no_access_to_phone");
            f133900d = scenario3;
            Scenario scenario4 = new Scenario("REQUIRE_TFA", 3, "no_verif_phone");
            f133901e = scenario4;
            Scenario scenario5 = new Scenario("NO_MAIL_ACCESS", 4, "no_mail_access");
            f133902f = scenario5;
            Scenario[] scenarioArr = {scenario, scenario2, scenario3, scenario4, scenario5};
            f133903g = scenarioArr;
            f133904h = c.a(scenarioArr);
        }

        public Scenario(String str, int i12, String str2) {
            this.f133905b = str2;
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) f133903g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Source;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: c, reason: collision with root package name */
        public static final Source f133906c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f133907d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Source[] f133908e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133909f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f133910b;

        static {
            Source source = new Source("TFA", 0, "tfa");
            f133906c = source;
            Source source2 = new Source("ANTIHACK", 1, "antihack");
            f133907d = source2;
            Source[] sourceArr = {source, source2};
            f133908e = sourceArr;
            f133909f = c.a(sourceArr);
        }

        public Source(String str, int i12, String str2) {
            this.f133910b = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f133908e.clone();
        }
    }

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoRecoveryLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoRecoveryLink createFromParcel(Parcel parcel) {
            return new AutoRecoveryLink(parcel.readString(), Scenario.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoRecoveryLink[] newArray(int i12) {
            return new AutoRecoveryLink[i12];
        }
    }

    public /* synthetic */ AutoRecoveryLink(String str, Scenario scenario, boolean z12, int i12, C42822w c42822w) {
        this(str, scenario, (i12 & 4) != 0 ? true : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoRecoveryLink)) {
            return false;
        }
        AutoRecoveryLink autoRecoveryLink = (AutoRecoveryLink) obj;
        return L.f(this.f133889b, autoRecoveryLink.f133889b) && this.f133890c == autoRecoveryLink.f133890c && this.f133891d == autoRecoveryLink.f133891d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133891d) + ((this.f133890c.hashCode() + (this.f133889b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoRecoveryLink(source=");
        sb2.append(this.f133889b);
        sb2.append(", scenario=");
        sb2.append(this.f133890c);
        sb2.append(", isTfaProblemEventTrackingNeeded=");
        return r.x(sb2, this.f133891d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133889b);
        parcel.writeString(this.f133890c.name());
        parcel.writeInt(this.f133891d ? 1 : 0);
    }

    public AutoRecoveryLink(@k String str, @k Scenario scenario, boolean z12) {
        this.f133889b = str;
        this.f133890c = scenario;
        this.f133891d = z12;
    }
}

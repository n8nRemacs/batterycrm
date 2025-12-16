package com.avito.android.safety.safety_settings.mvi.entity;

import X41.g;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SafetySettingsState.kt */
@F3
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "", "a", "b", "c", "SessionItem", "d", "e", "f", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$b;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$c;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$d;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$e;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$f;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SafetySettingsElement {

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "a", "LoginType", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SessionItem implements SafetySettingsElement {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f257671a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f257672b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f257673c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f257674d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final LoginType f257675e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f257676f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<a> f257677g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f257678h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SafetySettingsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem$LoginType;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LoginType {

            /* renamed from: b, reason: collision with root package name */
            public static final LoginType f257679b;

            /* renamed from: c, reason: collision with root package name */
            public static final LoginType f257680c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ LoginType[] f257681d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f257682e;

            static {
                LoginType loginType = new LoginType("EMAIL", 0);
                f257679b = loginType;
                LoginType loginType2 = new LoginType("PHONE", 1);
                f257680c = loginType2;
                LoginType[] loginTypeArr = {loginType, loginType2};
                f257681d = loginTypeArr;
                f257682e = kotlin.enums.c.a(loginTypeArr);
            }

            public static LoginType valueOf(String str) {
                return (LoginType) Enum.valueOf(LoginType.class, str);
            }

            public static LoginType[] values() {
                return (LoginType[]) f257681d.clone();
            }
        }

        /* compiled from: SafetySettingsState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem$a;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f257683a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f257684b;

            public a(@k String str, @k DeepLink deepLink) {
                this.f257683a = str;
                this.f257684b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f257683a, aVar.f257683a) && L.f(this.f257684b, aVar.f257684b);
            }

            public final int hashCode() {
                return this.f257684b.hashCode() + (this.f257683a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(title=");
                sb2.append(this.f257683a);
                sb2.append(", deeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f257684b, ')');
            }
        }

        public SessionItem() {
            throw null;
        }

        public SessionItem(String str, String str2, String str3, Boolean bool, LoginType loginType, String str4, List list, String str5, int i12, C42822w c42822w) {
            str5 = (i12 & 128) != 0 ? r.q(str, str4) : str5;
            this.f257671a = str;
            this.f257672b = str2;
            this.f257673c = str3;
            this.f257674d = bool;
            this.f257675e = loginType;
            this.f257676f = str4;
            this.f257677g = list;
            this.f257678h = str5;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionItem)) {
                return false;
            }
            SessionItem sessionItem = (SessionItem) obj;
            return L.f(this.f257671a, sessionItem.f257671a) && L.f(this.f257672b, sessionItem.f257672b) && L.f(this.f257673c, sessionItem.f257673c) && L.f(this.f257674d, sessionItem.f257674d) && this.f257675e == sessionItem.f257675e && L.f(this.f257676f, sessionItem.f257676f) && L.f(this.f257677g, sessionItem.f257677g) && L.f(this.f257678h, sessionItem.f257678h);
        }

        @Override // com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF257701g() {
            return this.f257678h;
        }

        public final int hashCode() {
            int iHashCode = this.f257671a.hashCode() * 31;
            String str = this.f257672b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f257673c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f257674d;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            LoginType loginType = this.f257675e;
            int iHashCode5 = (iHashCode4 + (loginType == null ? 0 : loginType.hashCode())) * 31;
            String str3 = this.f257676f;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<a> list = this.f257677g;
            return this.f257678h.hashCode() + ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SessionItem(title=");
            sb2.append(this.f257671a);
            sb2.append(", subtitle=");
            sb2.append(this.f257672b);
            sb2.append(", deviceId=");
            sb2.append(this.f257673c);
            sb2.append(", isCurrent=");
            sb2.append(this.f257674d);
            sb2.append(", loginType=");
            sb2.append(this.f257675e);
            sb2.append(", sessionIdHash=");
            sb2.append(this.f257676f);
            sb2.append(", actions=");
            sb2.append(this.f257677g);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f257678h, ')');
        }
    }

    /* compiled from: SafetySettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$b;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements SafetySettingsElement {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f257685a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257686b;

        public b(String str, String str2, int i12, C42822w c42822w) {
            str2 = (i12 & 2) != 0 ? str : str2;
            this.f257685a = str;
            this.f257686b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f257685a, bVar.f257685a) && L.f(this.f257686b, bVar.f257686b);
        }

        @Override // com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF257701g() {
            return this.f257686b;
        }

        public final int hashCode() {
            return this.f257686b.hashCode() + (this.f257685a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(title=");
            sb2.append(this.f257685a);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f257686b, ')');
        }
    }

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$c;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements SafetySettingsElement {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f257687a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257688b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f257689c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f257690d;

        public c(String str, String str2, DeepLink deepLink, String str3, int i12, C42822w c42822w) {
            str3 = (i12 & 8) != 0 ? str : str3;
            this.f257687a = str;
            this.f257688b = str2;
            this.f257689c = deepLink;
            this.f257690d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f257687a, cVar.f257687a) && L.f(this.f257688b, cVar.f257688b) && L.f(this.f257689c, cVar.f257689c) && L.f(this.f257690d, cVar.f257690d);
        }

        @Override // com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF257701g() {
            return this.f257690d;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f257687a.hashCode() * 31, 31, this.f257688b);
            DeepLink deepLink = this.f257689c;
            return this.f257690d.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Password(title=");
            sb2.append(this.f257687a);
            sb2.append(", description=");
            sb2.append(this.f257688b);
            sb2.append(", deeplink=");
            sb2.append(this.f257689c);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f257690d, ')');
        }
    }

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$d;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements SafetySettingsElement {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f257691a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f257692b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f257693c;

        public d(String str, AttributedText attributedText, String str2, int i12, C42822w c42822w) {
            str2 = (i12 & 4) != 0 ? str : str2;
            this.f257691a = str;
            this.f257692b = attributedText;
            this.f257693c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f257691a, dVar.f257691a) && L.f(this.f257692b, dVar.f257692b) && L.f(this.f257693c, dVar.f257693c);
        }

        @Override // com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF257701g() {
            return this.f257693c;
        }

        public final int hashCode() {
            return this.f257693c.hashCode() + com.avito.android.actions_sheet.a.b(this.f257691a.hashCode() * 31, 31, this.f257692b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SessionsInfo(title=");
            sb2.append(this.f257691a);
            sb2.append(", info=");
            sb2.append(this.f257692b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f257693c, ')');
        }
    }

    /* compiled from: SafetySettingsState.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$e;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "id", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements SafetySettingsElement {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f257694a;

        private /* synthetic */ e(String str) {
            this.f257694a = str;
        }

        public static final /* synthetic */ e a() {
            return new e("LOADING_ID");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                return L.f(this.f257694a, ((e) obj).f257694a);
            }
            return false;
        }

        @Override // com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF257701g() {
            return this.f257694a;
        }

        public final int hashCode() {
            return this.f257694a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("SessionsLoading(id="), this.f257694a, ')');
        }
    }

    @k
    /* renamed from: getId */
    String getF257701g();

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$f;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements SafetySettingsElement {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f257695a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f257696b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f257697c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f257698d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f257699e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f257700f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f257701g;

        public f(@k String str, @k AttributedText attributedText, boolean z12, boolean z13, boolean z14, boolean z15, @k String str2) {
            this.f257695a = str;
            this.f257696b = attributedText;
            this.f257697c = z12;
            this.f257698d = z13;
            this.f257699e = z14;
            this.f257700f = z15;
            this.f257701g = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f257695a, fVar.f257695a) && L.f(this.f257696b, fVar.f257696b) && this.f257697c == fVar.f257697c && this.f257698d == fVar.f257698d && this.f257699e == fVar.f257699e && this.f257700f == fVar.f257700f && L.f(this.f257701g, fVar.f257701g);
        }

        @Override // com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement
        @k
        /* renamed from: getId, reason: from getter */
        public final String getF257701g() {
            return this.f257701g;
        }

        public final int hashCode() {
            return this.f257701g.hashCode() + r.i(r.i(r.i(r.i(com.avito.android.actions_sheet.a.b(this.f257695a.hashCode() * 31, 31, this.f257696b), 31, this.f257697c), 31, this.f257698d), 31, this.f257699e), 31, this.f257700f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tfa(title=");
            sb2.append(this.f257695a);
            sb2.append(", description=");
            sb2.append(this.f257696b);
            sb2.append(", isEnabled=");
            sb2.append(this.f257697c);
            sb2.append(", hasPhone=");
            sb2.append(this.f257698d);
            sb2.append(", isAvailable=");
            sb2.append(this.f257699e);
            sb2.append(", isLoading=");
            sb2.append(this.f257700f);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f257701g, ')');
        }

        public /* synthetic */ f(String str, AttributedText attributedText, boolean z12, boolean z13, boolean z14, boolean z15, String str2, int i12, C42822w c42822w) {
            this(str, attributedText, z12, z13, z14, z15, (i12 & 64) != 0 ? str : str2);
        }
    }
}

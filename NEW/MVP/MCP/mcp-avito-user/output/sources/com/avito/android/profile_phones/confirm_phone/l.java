package com.avito.android.profile_phones.confirm_phone;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.view.AbstractC22991Y;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.architecture_components.D;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmPhoneViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l;", "", "a", "b", "c", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface l {

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/profile_phones/confirm_phone/l$a$a;", "Lcom/avito/android/profile_phones/confirm_phone/l$a$b;", "Lcom/avito/android/profile_phones/confirm_phone/l$a$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$a$a;", "Lcom/avito/android/profile_phones/confirm_phone/l$a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.confirm_phone.l$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6894a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final long f227042a;

            /* renamed from: b, reason: collision with root package name */
            public final int f227043b;

            public C6894a(long j12, int i12) {
                super(null);
                this.f227042a = j12;
                this.f227043b = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6894a)) {
                    return false;
                }
                C6894a c6894a = (C6894a) obj;
                return this.f227042a == c6894a.f227042a && this.f227043b == c6894a.f227043b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f227043b) + (Long.hashCode(this.f227042a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CodeRequestDone(timeoutSeconds=");
                sb2.append(this.f227042a);
                sb2.append(", codeLength=");
                return androidx.appcompat.app.r.t(sb2, this.f227043b, ')');
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$a$b;", "Lcom/avito/android/profile_phones/confirm_phone/l$a;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f227044a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$a$c;", "Lcom/avito/android/profile_phones/confirm_phone/l$a;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f227045a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$b;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/profile_phones/confirm_phone/l$b$a;", "Lcom/avito/android/profile_phones/confirm_phone/l$b$b;", "Lcom/avito/android/profile_phones/confirm_phone/l$b$c;", "Lcom/avito/android/profile_phones/confirm_phone/l$b$d;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$b$a;", "Lcom/avito/android/profile_phones/confirm_phone/l$b;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f227046a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$b$b;", "Lcom/avito/android/profile_phones/confirm_phone/l$b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.confirm_phone.l$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6895b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f227047a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f227048b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f227049c;

            public C6895b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
                super(null);
                this.f227047a = str;
                this.f227048b = str2;
                this.f227049c = str3;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6895b)) {
                    return false;
                }
                C6895b c6895b = (C6895b) obj;
                return L.f(this.f227047a, c6895b.f227047a) && L.f(this.f227048b, c6895b.f227048b) && L.f(this.f227049c, c6895b.f227049c);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f227047a.hashCode() * 31, 31, this.f227048b);
                String str = this.f227049c;
                return iD2 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("GoToPhoneAllowReverificationInfo(phone=");
                sb2.append(this.f227047a);
                sb2.append(", phoneFormatted=");
                sb2.append(this.f227048b);
                sb2.append(", userEmail=");
                return C22026a.c(sb2, this.f227049c, ')');
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$b$c;", "Lcom/avito/android/profile_phones/confirm_phone/l$b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f227050a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f227051b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f227052c;

            public c(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
                super(null);
                this.f227050a = str;
                this.f227051b = str2;
                this.f227052c = str3;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f227050a, cVar.f227050a) && L.f(this.f227051b, cVar.f227051b) && L.f(this.f227052c, cVar.f227052c);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f227050a.hashCode() * 31, 31, this.f227051b);
                String str = this.f227052c;
                return iD2 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("GoToPhoneDisallowReverificationInfo(phone=");
                sb2.append(this.f227050a);
                sb2.append(", phoneFormatted=");
                sb2.append(this.f227051b);
                sb2.append(", userEmail=");
                return C22026a.c(sb2, this.f227052c, ')');
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$b$d;", "Lcom/avito/android/profile_phones/confirm_phone/l$b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f227053a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final UxFeedbackStartCampaignLink f227054b;

            public d(@Y61.k String str, @Y61.l UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink) {
                super(null);
                this.f227053a = str;
                this.f227054b = uxFeedbackStartCampaignLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f227053a, dVar.f227053a) && L.f(this.f227054b, dVar.f227054b);
            }

            public final int hashCode() {
                int iHashCode = this.f227053a.hashCode() * 31;
                UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink = this.f227054b;
                return iHashCode + (uxFeedbackStartCampaignLink == null ? 0 : uxFeedbackStartCampaignLink.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "GoToPhonesList(phone=" + this.f227053a + ", nextLink=" + this.f227054b + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/profile_phones/confirm_phone/l$c$a;", "Lcom/avito/android/profile_phones/confirm_phone/l$c$b;", "Lcom/avito/android/profile_phones/confirm_phone/l$c$c;", "Lcom/avito/android/profile_phones/confirm_phone/l$c$d;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$c$a;", "Lcom/avito/android/profile_phones/confirm_phone/l$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UserDialog f227055a;

            public a(@Y61.k UserDialog userDialog) {
                super(null);
                this.f227055a = userDialog;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f227055a, ((a) obj).f227055a);
            }

            public final int hashCode() {
                return this.f227055a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ErrorDialog(userDialog=" + this.f227055a + ')';
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$c$b;", "Lcom/avito/android/profile_phones/confirm_phone/l$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f227056a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Throwable f227057b;

            public b(@Y61.l String str, @Y61.l Throwable th2) {
                super(null);
                this.f227056a = str;
                this.f227057b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f227056a, bVar.f227056a) && L.f(this.f227057b, bVar.f227057b);
            }

            public final int hashCode() {
                String str = this.f227056a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f227057b;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InputError(message=");
                sb2.append(this.f227056a);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f227057b, ')');
            }

            public /* synthetic */ b(String str, Throwable th2, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : th2);
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$c$c;", "Lcom/avito/android/profile_phones/confirm_phone/l$c;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.confirm_phone.l$c$c, reason: collision with other inner class name */
        public static final class C6896c extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6896c f227058a = new C6896c();

            public C6896c() {
                super(null);
            }
        }

        /* compiled from: ConfirmPhoneViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$c$d;", "Lcom/avito/android/profile_phones/confirm_phone/l$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f227059a;

            public d(@Y61.k String str) {
                super(null);
                this.f227059a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f227059a, ((d) obj).f227059a);
            }

            public final int hashCode() {
                return this.f227059a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Ready(phone="), this.f227059a, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    void N2();

    void O6();

    @Y61.k
    /* renamed from: O9 */
    D getF227081R();

    @Y61.k
    AbstractC22991Y<b> S0();

    void V4();

    void l0();

    void m6(@Y61.k z<CharSequence> zVar);

    @Y61.k
    AbstractC22991Y<c> z1();
}

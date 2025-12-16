package com.avito.android.authorization.event;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: AutoRecoveryPhoneUnavailableReasonPickedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "MailReason", "PhoneReason", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoRecoveryPhoneUnavailableReasonPickedEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Enum f93839b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f93840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f93841d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AutoRecoveryPhoneUnavailableReasonPickedEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$MailReason;", "", "Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MailReason implements a {

        /* renamed from: c, reason: collision with root package name */
        public static final MailReason f93842c;

        /* renamed from: d, reason: collision with root package name */
        public static final MailReason f93843d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ MailReason[] f93844e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f93845f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f93846b;

        static {
            MailReason mailReason = new MailReason("MAIL_NOT_COMING", 0, "no_mail_delivery");
            f93842c = mailReason;
            MailReason mailReason2 = new MailReason("MAIL_UNAVAILABLE", 1, "no_mail_access");
            f93843d = mailReason2;
            MailReason[] mailReasonArr = {mailReason, mailReason2};
            f93844e = mailReasonArr;
            f93845f = c.a(mailReasonArr);
        }

        public MailReason(String str, int i12, String str2) {
            this.f93846b = str2;
        }

        public static MailReason valueOf(String str) {
            return (MailReason) Enum.valueOf(MailReason.class, str);
        }

        public static MailReason[] values() {
            return (MailReason[]) f93844e.clone();
        }

        @Override // com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent.a
        @k
        /* renamed from: getValue, reason: from getter */
        public final String getF93851b() {
            return this.f93846b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AutoRecoveryPhoneUnavailableReasonPickedEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$PhoneReason;", "", "Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhoneReason implements a {

        /* renamed from: c, reason: collision with root package name */
        public static final PhoneReason f93847c;

        /* renamed from: d, reason: collision with root package name */
        public static final PhoneReason f93848d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PhoneReason[] f93849e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f93850f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f93851b;

        static {
            PhoneReason phoneReason = new PhoneReason("PHONE_UNAVAILABLE", 0, "phone_number_unavailable");
            f93847c = phoneReason;
            PhoneReason phoneReason2 = new PhoneReason("SMS_NOT_COMING", 1, "sms_not_coming");
            f93848d = phoneReason2;
            PhoneReason[] phoneReasonArr = {phoneReason, phoneReason2};
            f93849e = phoneReasonArr;
            f93850f = c.a(phoneReasonArr);
        }

        public PhoneReason(String str, int i12, String str2) {
            this.f93851b = str2;
        }

        public static PhoneReason valueOf(String str) {
            return (PhoneReason) Enum.valueOf(PhoneReason.class, str);
        }

        public static PhoneReason[] values() {
            return (PhoneReason[]) f93849e.clone();
        }

        @Override // com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent.a
        @k
        /* renamed from: getValue, reason: from getter */
        public final String getF93851b() {
            return this.f93851b;
        }
    }

    /* compiled from: AutoRecoveryPhoneUnavailableReasonPickedEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$a;", "", "Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$MailReason;", "Lcom/avito/android/authorization/event/AutoRecoveryPhoneUnavailableReasonPickedEvent$PhoneReason;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        /* renamed from: getValue */
        String getF93851b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoRecoveryPhoneUnavailableReasonPickedEvent(@k a aVar, @k String str) {
        this.f93839b = (Enum) aVar;
        this.f93840c = str;
        this.f93841d = new ParametrizedClickStreamEvent(8154, 2, P0.g(new Q("reason", aVar.getF93851b()), new Q("s", str)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoRecoveryPhoneUnavailableReasonPickedEvent)) {
            return false;
        }
        AutoRecoveryPhoneUnavailableReasonPickedEvent autoRecoveryPhoneUnavailableReasonPickedEvent = (AutoRecoveryPhoneUnavailableReasonPickedEvent) obj;
        return this.f93839b.equals(autoRecoveryPhoneUnavailableReasonPickedEvent.f93839b) && L.f(this.f93840c, autoRecoveryPhoneUnavailableReasonPickedEvent.f93840c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f93841d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f93841d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f93841d.f90248c;
    }

    public final int hashCode() {
        return this.f93840c.hashCode() + (this.f93839b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoRecoveryPhoneUnavailableReasonPickedEvent(reason=");
        sb2.append(this.f93839b);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f93840c, ')');
    }
}

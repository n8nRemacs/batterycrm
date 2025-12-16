package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import ce.C27181b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonArguments;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonInternalAction;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.RadioState;
import com.avito.android.authorization.event.AutoRecoveryPhoneUnavailableReasonPickedEvent;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FactorUnavailableReasonReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "Lce/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements u<FactorUnavailableReasonInternalAction, C27181b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f93186b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FactorUnavailableReasonArguments f93187c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93188d;

    /* compiled from: FactorUnavailableReasonReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RadioState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RadioState radioState = RadioState.f93165b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RadioState radioState2 = RadioState.f93165b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason mailReason = AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason.f93842c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[AutoRecoveryPhoneUnavailableReasonPickedEvent.PhoneReason.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AutoRecoveryPhoneUnavailableReasonPickedEvent.PhoneReason phoneReason = AutoRecoveryPhoneUnavailableReasonPickedEvent.PhoneReason.f93847c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Inject
    public n(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k FactorUnavailableReasonArguments factorUnavailableReasonArguments, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f93186b = aVar;
        this.f93187c = factorUnavailableReasonArguments;
        this.f93188d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C27181b a(FactorUnavailableReasonInternalAction factorUnavailableReasonInternalAction, C27181b c27181b) {
        AutoRecoveryPhoneUnavailableReasonPickedEvent.PhoneReason phoneReason;
        AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason mailReason;
        FactorUnavailableReasonInternalAction factorUnavailableReasonInternalAction2 = factorUnavailableReasonInternalAction;
        C27181b c27181bA = c27181b;
        if (factorUnavailableReasonInternalAction2 == FactorUnavailableReasonInternalAction.Select.f93154b) {
            return C27181b.a(c27181bA, false, false, RadioState.f93166c, 2);
        }
        if (factorUnavailableReasonInternalAction2 == FactorUnavailableReasonInternalAction.Select.f93155c) {
            return C27181b.a(c27181bA, false, false, RadioState.f93167d, 2);
        }
        if (!factorUnavailableReasonInternalAction2.equals(FactorUnavailableReasonInternalAction.a.f93158b)) {
            if (factorUnavailableReasonInternalAction2 instanceof FactorUnavailableReasonInternalAction.b ? true : factorUnavailableReasonInternalAction2.equals(FactorUnavailableReasonInternalAction.c.f93162b) ? true : factorUnavailableReasonInternalAction2 instanceof FactorUnavailableReasonInternalAction.d ? true : factorUnavailableReasonInternalAction2.equals(FactorUnavailableReasonInternalAction.c.f93162b)) {
                return C27181b.a(c27181bA, false, false, null, 5);
            }
            if (factorUnavailableReasonInternalAction2.equals(FactorUnavailableReasonInternalAction.e.f93164b)) {
                return C27181b.a(c27181bA, false, true, null, 5);
            }
            throw new NoWhenBranchMatchedException();
        }
        FactorUnavailableReasonArguments factorUnavailableReasonArguments = this.f93187c;
        boolean z12 = factorUnavailableReasonArguments instanceof FactorUnavailableReasonArguments.Email;
        RadioState radioState = c27181bA.f58060c;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f93186b;
        InterfaceC28373a interfaceC28373a = this.f93188d;
        if (z12) {
            FactorUnavailableReasonArguments.Email email = (FactorUnavailableReasonArguments.Email) factorUnavailableReasonArguments;
            int iOrdinal = radioState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    mailReason = AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason.f93843d;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mailReason = AutoRecoveryPhoneUnavailableReasonPickedEvent.MailReason.f93842c;
                }
                interfaceC28373a.c(new AutoRecoveryPhoneUnavailableReasonPickedEvent(mailReason, email.f93077b));
                int iOrdinal2 = mailReason.ordinal();
                if (iOrdinal2 == 0) {
                    b.a.a(aVar, new HelpCenterUrlShowLink("sections/39?articleId=1799"), "phone_unavailable.hc.request_key", null, 4);
                } else if (iOrdinal2 == 1) {
                    b.a.a(aVar, new AutoRecoveryLink(email.f93077b, AutoRecoveryLink.Scenario.f133902f, false), "phone_unavailable.recover.request_key", null, 4);
                }
            } else {
                c27181bA = C27181b.a(c27181bA, true, false, null, 6);
            }
        } else {
            if (!(factorUnavailableReasonArguments instanceof FactorUnavailableReasonArguments.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            FactorUnavailableReasonArguments.Phone phone = (FactorUnavailableReasonArguments.Phone) factorUnavailableReasonArguments;
            int iOrdinal3 = radioState.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 == 1) {
                    phoneReason = AutoRecoveryPhoneUnavailableReasonPickedEvent.PhoneReason.f93847c;
                } else {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    phoneReason = AutoRecoveryPhoneUnavailableReasonPickedEvent.PhoneReason.f93848d;
                }
                interfaceC28373a.c(new AutoRecoveryPhoneUnavailableReasonPickedEvent(phoneReason, phone.f93078b.f133910b));
                int iOrdinal4 = phoneReason.ordinal();
                if (iOrdinal4 == 0) {
                    b.a.a(aVar, new AutoRecoveryLink(phone.f93078b.f133910b, AutoRecoveryLink.Scenario.f133900d, false), "phone_unavailable.recover.request_key", null, 4);
                } else if (iOrdinal4 == 1) {
                    b.a.a(aVar, new HelpCenterUrlShowLink("articles/2864"), "phone_unavailable.hc.request_key", null, 4);
                }
            } else {
                c27181bA = C27181b.a(c27181bA, true, false, null, 6);
            }
        }
        return c27181bA;
    }
}

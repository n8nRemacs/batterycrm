package com.avito.android.mortgage_invite.participant.interactor;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ParticipantsAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/interactor/b;", "Lcom/avito/android/mortgage_invite/participant/interactor/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage_invite.participant.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f206139a;

    /* compiled from: ParticipantsAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ParticipantFieldId.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParticipantFieldId participantFieldId = ParticipantFieldId.f206099b;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParticipantFieldId participantFieldId2 = ParticipantFieldId.f206099b;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParticipantFieldId participantFieldId3 = ParticipantFieldId.f206099b;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ParticipantFieldId participantFieldId4 = ParticipantFieldId.f206099b;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ParticipantFieldId participantFieldId5 = ParticipantFieldId.f206099b;
                iArr[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ParticipantFieldId participantFieldId6 = ParticipantFieldId.f206099b;
                iArr[9] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f206139a = interfaceC28373a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.avito.android.mortgage_invite.participant.interactor.a
    public final void a(@k ParticipantFieldId participantFieldId) {
        String str = "phone";
        String str2 = "agent";
        switch (participantFieldId.ordinal()) {
            case 3:
                str = "firstName";
                str2 = "borrower";
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
            case 4:
                str = "middleName";
                str2 = "borrower";
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
            case 5:
                str = "lastName";
                str2 = "borrower";
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
            case 6:
                str2 = "borrower";
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
            case 7:
                str = "email";
                str2 = "borrower";
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
            case 8:
                str = "name";
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
            case 9:
                this.f206139a.c(new ParametrizedClickStreamEvent(12417, 5, P0.g(new Q("applicant_type", str2), new Q("field_target_id", str)), null, 8, null));
                break;
        }
    }

    @Override // com.avito.android.mortgage_invite.participant.interactor.a
    public final void b() {
        this.f206139a.c(new ParametrizedClickStreamEvent(11179, 2, Collections.singletonMap("applicant_type", "agent"), null, 8, null));
    }

    @Override // com.avito.android.mortgage_invite.participant.interactor.a
    public final void c() {
        this.f206139a.c(new ParametrizedClickStreamEvent(9446, 6, P0.g(new Q("applicant_type", "agent"), new Q("attr_title", "vdr_pre_filling_confirmation"), new Q("current_mortgage_stage", "vdr_pre_filling")), null, 8, null));
    }

    @Override // com.avito.android.mortgage_invite.participant.interactor.a
    public final void d() {
        this.f206139a.c(new ParametrizedClickStreamEvent(13996, 0, Collections.singletonMap("attr_title", "virtual_deal_room"), null, 8, null));
    }

    @Override // com.avito.android.mortgage_invite.participant.interactor.a
    public final void e() {
        this.f206139a.c(new ParametrizedClickStreamEvent(11180, 0, P0.c(), null, 8, null));
    }
}

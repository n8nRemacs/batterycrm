package com.avito.android.mortgage_invite.generated.api.api_2_mortgage_form_participant_create_post;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import k20.C42478b;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2MortgageFormParticipantCreatePostRequest.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2;", "", "", "applicationId", "Lk20/b;", "client", "clientProfileId", "Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2$ParticipationType;", "participationType", "<init>", "(Ljava/lang/String;Lk20/b;Ljava/lang/String;Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2$ParticipationType;)V", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "Lk20/b;", "getClient", "()Lk20/b;", "getClientProfileId", "Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2$ParticipationType;", "getParticipationType", "()Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2$ParticipationType;", "ParticipationType", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreateParticipantInV2 {

    @c("applicationId")
    @l
    private final String applicationId;

    @c("client")
    @l
    private final C42478b client;

    @c("clientProfileId")
    @l
    private final String clientProfileId;

    @c("participationType")
    @l
    private final ParticipationType participationType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2MortgageFormParticipantCreatePostRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage_invite/generated/api/api_2_mortgage_form_participant_create_post/CreateParticipantInV2$ParticipationType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Borrower", "CoBorrower", "Spouse", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParticipationType {

        @c("borrower")
        public static final ParticipationType Borrower;

        @c("co-borrower")
        public static final ParticipationType CoBorrower;

        @c("spouse")
        public static final ParticipationType Spouse;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ParticipationType[] f205838c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f205839d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f205840b;

        static {
            ParticipationType participationType = new ParticipationType("Borrower", 0, "borrower");
            Borrower = participationType;
            ParticipationType participationType2 = new ParticipationType("CoBorrower", 1, "co-borrower");
            CoBorrower = participationType2;
            ParticipationType participationType3 = new ParticipationType("Spouse", 2, "spouse");
            Spouse = participationType3;
            ParticipationType[] participationTypeArr = {participationType, participationType2, participationType3};
            f205838c = participationTypeArr;
            f205839d = kotlin.enums.c.a(participationTypeArr);
        }

        private ParticipationType(String str, int i12, String str2) {
            this.f205840b = str2;
        }

        public static ParticipationType valueOf(String str) {
            return (ParticipationType) Enum.valueOf(ParticipationType.class, str);
        }

        public static ParticipationType[] values() {
            return (ParticipationType[]) f205838c.clone();
        }
    }

    public CreateParticipantInV2(@l String str, @l C42478b c42478b, @l String str2, @l ParticipationType participationType) {
        this.applicationId = str;
        this.client = c42478b;
        this.clientProfileId = str2;
        this.participationType = participationType;
    }
}

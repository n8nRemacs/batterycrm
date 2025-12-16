package com.avito.android.mortgage_invite.participant.domain.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParticipantFieldId.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/domain/model/ParticipantFieldId;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ParticipantFieldId {

    /* renamed from: b, reason: collision with root package name */
    public static final ParticipantFieldId f206099b;

    /* renamed from: c, reason: collision with root package name */
    public static final ParticipantFieldId f206100c;

    /* renamed from: d, reason: collision with root package name */
    public static final ParticipantFieldId f206101d;

    /* renamed from: e, reason: collision with root package name */
    public static final ParticipantFieldId f206102e;

    /* renamed from: f, reason: collision with root package name */
    public static final ParticipantFieldId f206103f;

    /* renamed from: g, reason: collision with root package name */
    public static final ParticipantFieldId f206104g;

    /* renamed from: h, reason: collision with root package name */
    public static final ParticipantFieldId f206105h;

    /* renamed from: i, reason: collision with root package name */
    public static final ParticipantFieldId f206106i;

    /* renamed from: j, reason: collision with root package name */
    public static final ParticipantFieldId f206107j;

    /* renamed from: k, reason: collision with root package name */
    public static final ParticipantFieldId f206108k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ParticipantFieldId[] f206109l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a f206110m;

    static {
        ParticipantFieldId participantFieldId = new ParticipantFieldId("CLIENT_SEARCH", 0);
        f206099b = participantFieldId;
        ParticipantFieldId participantFieldId2 = new ParticipantFieldId("CLIENT_IMMUTABLE_PHONE", 1);
        f206100c = participantFieldId2;
        ParticipantFieldId participantFieldId3 = new ParticipantFieldId("CLIENT_IMMUTABLE_EMAIL", 2);
        f206101d = participantFieldId3;
        ParticipantFieldId participantFieldId4 = new ParticipantFieldId("CLIENT_FIRST_NAME", 3);
        f206102e = participantFieldId4;
        ParticipantFieldId participantFieldId5 = new ParticipantFieldId("CLIENT_MIDDLE_NAME", 4);
        f206103f = participantFieldId5;
        ParticipantFieldId participantFieldId6 = new ParticipantFieldId("CLIENT_LAST_NAME", 5);
        f206104g = participantFieldId6;
        ParticipantFieldId participantFieldId7 = new ParticipantFieldId("CLIENT_PHONE", 6);
        f206105h = participantFieldId7;
        ParticipantFieldId participantFieldId8 = new ParticipantFieldId("CLIENT_EMAIL", 7);
        f206106i = participantFieldId8;
        ParticipantFieldId participantFieldId9 = new ParticipantFieldId("AGENT_FULL_NAME", 8);
        f206107j = participantFieldId9;
        ParticipantFieldId participantFieldId10 = new ParticipantFieldId("AGENT_PHONE", 9);
        f206108k = participantFieldId10;
        ParticipantFieldId[] participantFieldIdArr = {participantFieldId, participantFieldId2, participantFieldId3, participantFieldId4, participantFieldId5, participantFieldId6, participantFieldId7, participantFieldId8, participantFieldId9, participantFieldId10};
        f206109l = participantFieldIdArr;
        f206110m = c.a(participantFieldIdArr);
    }

    public ParticipantFieldId() {
        throw null;
    }

    public static ParticipantFieldId valueOf(String str) {
        return (ParticipantFieldId) Enum.valueOf(ParticipantFieldId.class, str);
    }

    public static ParticipantFieldId[] values() {
        return (ParticipantFieldId[]) f206109l.clone();
    }
}

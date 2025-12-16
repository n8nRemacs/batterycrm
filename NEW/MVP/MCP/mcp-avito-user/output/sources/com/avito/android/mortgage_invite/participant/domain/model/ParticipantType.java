package com.avito.android.mortgage_invite.participant.domain.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParticipantItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/domain/model/ParticipantType;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ParticipantType {

    /* renamed from: b, reason: collision with root package name */
    public static final ParticipantType f206111b;

    /* renamed from: c, reason: collision with root package name */
    public static final ParticipantType f206112c;

    /* renamed from: d, reason: collision with root package name */
    public static final ParticipantType f206113d;

    /* renamed from: e, reason: collision with root package name */
    public static final ParticipantType f206114e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ParticipantType[] f206115f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f206116g;

    static {
        ParticipantType participantType = new ParticipantType("CLIENT_SEARCH", 0);
        f206111b = participantType;
        ParticipantType participantType2 = new ParticipantType("PLAIN_TEXT", 1);
        f206112c = participantType2;
        ParticipantType participantType3 = new ParticipantType("PHONE", 2);
        f206113d = participantType3;
        ParticipantType participantType4 = new ParticipantType("EMAIL", 3);
        f206114e = participantType4;
        ParticipantType[] participantTypeArr = {participantType, participantType2, participantType3, participantType4};
        f206115f = participantTypeArr;
        f206116g = c.a(participantTypeArr);
    }

    public ParticipantType() {
        throw null;
    }

    public static ParticipantType valueOf(String str) {
        return (ParticipantType) Enum.valueOf(ParticipantType.class, str);
    }

    public static ParticipantType[] values() {
        return (ParticipantType[]) f206115f.clone();
    }
}

package com.avito.android.remote;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModerationEvidence.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/ModerationEvidence;", "", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ModerationEvidence {

    /* renamed from: c, reason: collision with root package name */
    public static final ModerationEvidence f253035c;

    /* renamed from: d, reason: collision with root package name */
    public static final ModerationEvidence f253036d;

    /* renamed from: e, reason: collision with root package name */
    public static final ModerationEvidence f253037e;

    /* renamed from: f, reason: collision with root package name */
    public static final ModerationEvidence f253038f;

    /* renamed from: g, reason: collision with root package name */
    public static final ModerationEvidence f253039g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ModerationEvidence[] f253040h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253041i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f253042b;

    static {
        ModerationEvidence moderationEvidence = new ModerationEvidence("MODERATION_EVIDENCE_CADASTRAL_NUMBER_REQUEST", 0, "ModerationEvidenceCadastralNumberRequest");
        f253035c = moderationEvidence;
        ModerationEvidence moderationEvidence2 = new ModerationEvidence("MODERATION_EVIDENCE_VIDEO_WAY_REQUEST", 1, "ModerationEvidenceVideoWayRequest");
        f253036d = moderationEvidence2;
        ModerationEvidence moderationEvidence3 = new ModerationEvidence("MODERATION_EVIDENCE_FLAT_REQUEST", 2, "ModerationEvidenceFlatRequest");
        f253037e = moderationEvidence3;
        ModerationEvidence moderationEvidence4 = new ModerationEvidence("MODERATION_EVIDENCE_ARCHIVE_EXTRACT_REQUEST", 3, "ModerationEvidenceArchiveExtractRequest");
        f253038f = moderationEvidence4;
        ModerationEvidence moderationEvidence5 = new ModerationEvidence("MODERATION_EVIDENCE_STS_REQUEST", 4, "ModerationEvidenceSTSRequest");
        f253039g = moderationEvidence5;
        ModerationEvidence[] moderationEvidenceArr = {moderationEvidence, moderationEvidence2, moderationEvidence3, moderationEvidence4, moderationEvidence5};
        f253040h = moderationEvidenceArr;
        f253041i = kotlin.enums.c.a(moderationEvidenceArr);
    }

    public ModerationEvidence(String str, int i12, String str2) {
        this.f253042b = str2;
    }

    public static ModerationEvidence valueOf(String str) {
        return (ModerationEvidence) Enum.valueOf(ModerationEvidence.class, str);
    }

    public static ModerationEvidence[] values() {
        return (ModerationEvidence[]) f253040h.clone();
    }
}

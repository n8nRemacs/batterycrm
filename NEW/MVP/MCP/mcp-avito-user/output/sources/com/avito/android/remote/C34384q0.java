package com.avito.android.remote;

import kotlin.Metadata;

/* compiled from: ModerationEvidence.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-api_evidence-request"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.q0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34384q0 {
    @Y61.k
    public static final ModerationEvidence a(@Y61.l String str) {
        ModerationEvidence moderationEvidence = ModerationEvidence.f253035c;
        if (kotlin.jvm.internal.L.f(str, "ModerationEvidenceCadastralNumberRequest")) {
            return moderationEvidence;
        }
        ModerationEvidence moderationEvidence2 = ModerationEvidence.f253036d;
        if (kotlin.jvm.internal.L.f(str, "ModerationEvidenceVideoWayRequest")) {
            return moderationEvidence2;
        }
        ModerationEvidence moderationEvidence3 = ModerationEvidence.f253038f;
        if (kotlin.jvm.internal.L.f(str, "ModerationEvidenceArchiveExtractRequest")) {
            return moderationEvidence3;
        }
        ModerationEvidence moderationEvidence4 = ModerationEvidence.f253037e;
        if (kotlin.jvm.internal.L.f(str, "ModerationEvidenceFlatRequest")) {
            return moderationEvidence4;
        }
        return kotlin.jvm.internal.L.f(str, "ModerationEvidenceSTSRequest") ? ModerationEvidence.f253039g : moderationEvidence4;
    }
}

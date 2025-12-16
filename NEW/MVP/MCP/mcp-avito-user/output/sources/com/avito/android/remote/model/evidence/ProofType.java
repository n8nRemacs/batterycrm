package com.avito.android.remote.model.evidence;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EvidenceData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/evidence/ProofType;", "", "(Ljava/lang/String;I)V", "FLAT_REQUEST", "CADASTRAL_NUMBER_REQUEST", "VIDEO_WAY_REQUEST", "STR_VIDEO_WAY_REQUEST", "STR_REPEATED_VIDEO_WAY_REQUEST", "ARCHIVE_EXTRACT_REQUEST", "STS_REQUEST", "REPEATED_STS_REQUEST", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProofType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProofType[] $VALUES;

    @c("ModerationEvidenceFlatRequest")
    public static final ProofType FLAT_REQUEST = new ProofType("FLAT_REQUEST", 0);

    @c("ModerationEvidenceCadastralNumberRequest")
    public static final ProofType CADASTRAL_NUMBER_REQUEST = new ProofType("CADASTRAL_NUMBER_REQUEST", 1);

    @c("ModerationEvidenceVideoWayRequest")
    public static final ProofType VIDEO_WAY_REQUEST = new ProofType("VIDEO_WAY_REQUEST", 2);

    @c("ModerationEvidenceStrVideoWayRequest")
    public static final ProofType STR_VIDEO_WAY_REQUEST = new ProofType("STR_VIDEO_WAY_REQUEST", 3);

    @c("ModerationEvidenceStrRepeatedVideoWayRequest")
    public static final ProofType STR_REPEATED_VIDEO_WAY_REQUEST = new ProofType("STR_REPEATED_VIDEO_WAY_REQUEST", 4);

    @c("ModerationEvidenceArchiveExtractRequest")
    public static final ProofType ARCHIVE_EXTRACT_REQUEST = new ProofType("ARCHIVE_EXTRACT_REQUEST", 5);

    @c("ModerationEvidenceSTSRequest")
    public static final ProofType STS_REQUEST = new ProofType("STS_REQUEST", 6);

    @c("ModerationEvidenceRepeatedSTSRequest")
    public static final ProofType REPEATED_STS_REQUEST = new ProofType("REPEATED_STS_REQUEST", 7);

    private static final /* synthetic */ ProofType[] $values() {
        return new ProofType[]{FLAT_REQUEST, CADASTRAL_NUMBER_REQUEST, VIDEO_WAY_REQUEST, STR_VIDEO_WAY_REQUEST, STR_REPEATED_VIDEO_WAY_REQUEST, ARCHIVE_EXTRACT_REQUEST, STS_REQUEST, REPEATED_STS_REQUEST};
    }

    static {
        ProofType[] proofTypeArr$values = $values();
        $VALUES = proofTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(proofTypeArr$values);
    }

    private ProofType(String str, int i12) {
    }

    @k
    public static a<ProofType> getEntries() {
        return $ENTRIES;
    }

    public static ProofType valueOf(String str) {
        return (ProofType) Enum.valueOf(ProofType.class, str);
    }

    public static ProofType[] values() {
        return (ProofType[]) $VALUES.clone();
    }
}

package ru.mts.biometry.api.entity;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: FlowStatus.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/mts/biometry/api/entity/FlowStatus;", "", "", "status", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlowStatus {

    @k
    public static final String DATA_ACCEPTED = "dataAccepted";

    @k
    public static final String EXPIRED = "linkExpired";

    @k
    public static final String IDENTIFICATION_FAILED = "identificationFailed";

    @k
    public static final String SUCCESS = "ok";

    @k
    public static final String SYSTEM_ERROR = "systemError";

    @k
    public static final String UNKNOWN = "unknown";

    @c("status")
    @k
    private final String status;

    @k
    private static final FlowStatus NULL = new FlowStatus("unknown");

    @k
    public static final String IN_PROGRESS = "WaitingForApplicantActions";

    @k
    public static final String COLLECTING_APPLICANT_DATA = "CollectingApplicantData";

    @k
    private static final Set<String> successStatuses = C42756l.l0(new String[]{"ok", IN_PROGRESS, COLLECTING_APPLICANT_DATA});

    public FlowStatus(@k String str) {
        this.status = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}

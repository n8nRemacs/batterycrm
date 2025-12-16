package com.avito.android.remote.model.evidence;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EvidenceData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/evidence/AppealStatus;", "", "(Ljava/lang/String;I)V", "PENDING", "REVIEW", "CLOSED", "ARCHIVED", "REREQUEST", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AppealStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppealStatus[] $VALUES;

    @c("Pending")
    public static final AppealStatus PENDING = new AppealStatus("PENDING", 0);

    @c("Review")
    public static final AppealStatus REVIEW = new AppealStatus("REVIEW", 1);

    @c("Closed")
    public static final AppealStatus CLOSED = new AppealStatus("CLOSED", 2);

    @c("Archived")
    @InterfaceC42830m
    public static final AppealStatus ARCHIVED = new AppealStatus("ARCHIVED", 3);

    @c("Re-request")
    public static final AppealStatus REREQUEST = new AppealStatus("REREQUEST", 4);

    private static final /* synthetic */ AppealStatus[] $values() {
        return new AppealStatus[]{PENDING, REVIEW, CLOSED, ARCHIVED, REREQUEST};
    }

    static {
        AppealStatus[] appealStatusArr$values = $values();
        $VALUES = appealStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(appealStatusArr$values);
    }

    private AppealStatus(String str, int i12) {
    }

    @k
    public static a<AppealStatus> getEntries() {
        return $ENTRIES;
    }

    public static AppealStatus valueOf(String str) {
        return (AppealStatus) Enum.valueOf(AppealStatus.class, str);
    }

    public static AppealStatus[] values() {
        return (AppealStatus[]) $VALUES.clone();
    }
}

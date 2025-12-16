package com.avito.android.remote.model.adverts;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PremierPartner.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/adverts/PremierPartnerStatus;", "", "(Ljava/lang/String;I)V", "shouldShowCard", "", "AVAILABLE", "UNAVAILABLE", "SIGNED", "AGREED", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PremierPartnerStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PremierPartnerStatus[] $VALUES;

    @c("available")
    public static final PremierPartnerStatus AVAILABLE = new PremierPartnerStatus("AVAILABLE", 0);

    @c("unavailable")
    public static final PremierPartnerStatus UNAVAILABLE = new PremierPartnerStatus("UNAVAILABLE", 1);

    @c("signed_up")
    public static final PremierPartnerStatus SIGNED = new PremierPartnerStatus("SIGNED", 2);

    @c("agreement_received")
    public static final PremierPartnerStatus AGREED = new PremierPartnerStatus("AGREED", 3);

    private static final /* synthetic */ PremierPartnerStatus[] $values() {
        return new PremierPartnerStatus[]{AVAILABLE, UNAVAILABLE, SIGNED, AGREED};
    }

    static {
        PremierPartnerStatus[] premierPartnerStatusArr$values = $values();
        $VALUES = premierPartnerStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(premierPartnerStatusArr$values);
    }

    private PremierPartnerStatus(String str, int i12) {
    }

    @k
    public static a<PremierPartnerStatus> getEntries() {
        return $ENTRIES;
    }

    public static PremierPartnerStatus valueOf(String str) {
        return (PremierPartnerStatus) Enum.valueOf(PremierPartnerStatus.class, str);
    }

    public static PremierPartnerStatus[] values() {
        return (PremierPartnerStatus[]) $VALUES.clone();
    }

    public final boolean shouldShowCard() {
        return this == AVAILABLE;
    }
}

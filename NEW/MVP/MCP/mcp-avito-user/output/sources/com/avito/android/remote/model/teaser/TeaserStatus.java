package com.avito.android.remote.model.teaser;

import Y61.k;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TeaserStatus.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/teaser/TeaserStatus;", "", "status", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "None", "Ok", "Caution", "Warning", "Locked", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TeaserStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TeaserStatus[] $VALUES;

    @k
    private final String status;

    @c("none")
    public static final TeaserStatus None = new TeaserStatus("None", 0, "none");

    /* renamed from: Ok, reason: collision with root package name */
    @c("ok")
    public static final TeaserStatus f253941Ok = new TeaserStatus("Ok", 1, "ok");

    @c("caution")
    public static final TeaserStatus Caution = new TeaserStatus("Caution", 2, "caution");

    @c(ConstraintKt.WARNING)
    public static final TeaserStatus Warning = new TeaserStatus("Warning", 3, ConstraintKt.WARNING);

    @c("locked")
    public static final TeaserStatus Locked = new TeaserStatus("Locked", 4, "locked");

    private static final /* synthetic */ TeaserStatus[] $values() {
        return new TeaserStatus[]{None, f253941Ok, Caution, Warning, Locked};
    }

    static {
        TeaserStatus[] teaserStatusArr$values = $values();
        $VALUES = teaserStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(teaserStatusArr$values);
    }

    private TeaserStatus(String str, int i12, String str2) {
        this.status = str2;
    }

    @k
    public static a<TeaserStatus> getEntries() {
        return $ENTRIES;
    }

    public static TeaserStatus valueOf(String str) {
        return (TeaserStatus) Enum.valueOf(TeaserStatus.class, str);
    }

    public static TeaserStatus[] values() {
        return (TeaserStatus[]) $VALUES.clone();
    }

    @k
    public final String getStatus() {
        return this.status;
    }
}

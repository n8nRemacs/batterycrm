package com.avito.android.remote.model.teaser;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TeaserIcon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/teaser/TeaserIcon;", "", "(Ljava/lang/String;I)V", "ACCIDENT", "PERSON", "JOBS", "GRAPH", "SELL", "SHIELD", "COURT", "MILEAGE", "TAXI", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TeaserIcon {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TeaserIcon[] $VALUES;

    @c("accident")
    public static final TeaserIcon ACCIDENT = new TeaserIcon("ACCIDENT", 0);

    @c("person")
    public static final TeaserIcon PERSON = new TeaserIcon("PERSON", 1);

    @c("jobs")
    public static final TeaserIcon JOBS = new TeaserIcon("JOBS", 2);

    @c("graph")
    public static final TeaserIcon GRAPH = new TeaserIcon("GRAPH", 3);

    @c("sell")
    public static final TeaserIcon SELL = new TeaserIcon("SELL", 4);

    @c("shield")
    public static final TeaserIcon SHIELD = new TeaserIcon("SHIELD", 5);

    @c("court")
    public static final TeaserIcon COURT = new TeaserIcon("COURT", 6);

    @c("mileage")
    public static final TeaserIcon MILEAGE = new TeaserIcon("MILEAGE", 7);

    @c("taxi")
    public static final TeaserIcon TAXI = new TeaserIcon("TAXI", 8);

    private static final /* synthetic */ TeaserIcon[] $values() {
        return new TeaserIcon[]{ACCIDENT, PERSON, JOBS, GRAPH, SELL, SHIELD, COURT, MILEAGE, TAXI};
    }

    static {
        TeaserIcon[] teaserIconArr$values = $values();
        $VALUES = teaserIconArr$values;
        $ENTRIES = kotlin.enums.c.a(teaserIconArr$values);
    }

    private TeaserIcon(String str, int i12) {
    }

    @k
    public static a<TeaserIcon> getEntries() {
        return $ENTRIES;
    }

    public static TeaserIcon valueOf(String str) {
        return (TeaserIcon) Enum.valueOf(TeaserIcon.class, str);
    }

    public static TeaserIcon[] values() {
        return (TeaserIcon[]) $VALUES.clone();
    }
}

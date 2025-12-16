package com.avito.android.remote.model.autotekateaser;

import Y61.k;
import Y61.l;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaTeaserItemResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/GalleryTeaserType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SINGLE_INSIGHT", "INSIGHT_LIST", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GalleryTeaserType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GalleryTeaserType[] $VALUES;

    @l
    private final String value;
    public static final GalleryTeaserType SINGLE_INSIGHT = new GalleryTeaserType("SINGLE_INSIGHT", 0, "singleInsight");
    public static final GalleryTeaserType INSIGHT_LIST = new GalleryTeaserType("INSIGHT_LIST", 1, "insightsList");
    public static final GalleryTeaserType UNKNOWN = new GalleryTeaserType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "");

    private static final /* synthetic */ GalleryTeaserType[] $values() {
        return new GalleryTeaserType[]{SINGLE_INSIGHT, INSIGHT_LIST, UNKNOWN};
    }

    static {
        GalleryTeaserType[] galleryTeaserTypeArr$values = $values();
        $VALUES = galleryTeaserTypeArr$values;
        $ENTRIES = c.a(galleryTeaserTypeArr$values);
    }

    private GalleryTeaserType(String str, int i12, String str2) {
        this.value = str2;
    }

    @k
    public static a<GalleryTeaserType> getEntries() {
        return $ENTRIES;
    }

    public static GalleryTeaserType valueOf(String str) {
        return (GalleryTeaserType) Enum.valueOf(GalleryTeaserType.class, str);
    }

    public static GalleryTeaserType[] values() {
        return (GalleryTeaserType[]) $VALUES.clone();
    }

    @l
    public final String getValue() {
        return this.value;
    }
}

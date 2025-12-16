package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertNavBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBarActionType;", "", "(Ljava/lang/String;I)V", "FAVORITE", "SHARE", "COMPARE", "OTHER", "DOWNLOAD_PDF_FILE", "DOWNLOAD_DOCX_FILE", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertNavBarActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertNavBarActionType[] $VALUES;

    @c("favorite")
    public static final AdvertNavBarActionType FAVORITE = new AdvertNavBarActionType("FAVORITE", 0);

    @c("share")
    public static final AdvertNavBarActionType SHARE = new AdvertNavBarActionType("SHARE", 1);

    @c("compare")
    public static final AdvertNavBarActionType COMPARE = new AdvertNavBarActionType("COMPARE", 2);

    @c(PluralsKeys.OTHER)
    public static final AdvertNavBarActionType OTHER = new AdvertNavBarActionType("OTHER", 3);

    @c("pdf")
    public static final AdvertNavBarActionType DOWNLOAD_PDF_FILE = new AdvertNavBarActionType("DOWNLOAD_PDF_FILE", 4);

    @c("docx")
    public static final AdvertNavBarActionType DOWNLOAD_DOCX_FILE = new AdvertNavBarActionType("DOWNLOAD_DOCX_FILE", 5);

    private static final /* synthetic */ AdvertNavBarActionType[] $values() {
        return new AdvertNavBarActionType[]{FAVORITE, SHARE, COMPARE, OTHER, DOWNLOAD_PDF_FILE, DOWNLOAD_DOCX_FILE};
    }

    static {
        AdvertNavBarActionType[] advertNavBarActionTypeArr$values = $values();
        $VALUES = advertNavBarActionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(advertNavBarActionTypeArr$values);
    }

    private AdvertNavBarActionType(String str, int i12) {
    }

    @k
    public static a<AdvertNavBarActionType> getEntries() {
        return $ENTRIES;
    }

    public static AdvertNavBarActionType valueOf(String str) {
        return (AdvertNavBarActionType) Enum.valueOf(AdvertNavBarActionType.class, str);
    }

    public static AdvertNavBarActionType[] values() {
        return (AdvertNavBarActionType[]) $VALUES.clone();
    }
}

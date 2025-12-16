package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertNavBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertCardNavBarContentType;", "", "(Ljava/lang/String;I)V", "PREVIEW", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertCardNavBarContentType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertCardNavBarContentType[] $VALUES;

    @c(MessageSuggest.PREVIEW)
    public static final AdvertCardNavBarContentType PREVIEW = new AdvertCardNavBarContentType("PREVIEW", 0);

    private static final /* synthetic */ AdvertCardNavBarContentType[] $values() {
        return new AdvertCardNavBarContentType[]{PREVIEW};
    }

    static {
        AdvertCardNavBarContentType[] advertCardNavBarContentTypeArr$values = $values();
        $VALUES = advertCardNavBarContentTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(advertCardNavBarContentTypeArr$values);
    }

    private AdvertCardNavBarContentType(String str, int i12) {
    }

    @k
    public static a<AdvertCardNavBarContentType> getEntries() {
        return $ENTRIES;
    }

    public static AdvertCardNavBarContentType valueOf(String str) {
        return (AdvertCardNavBarContentType) Enum.valueOf(AdvertCardNavBarContentType.class, str);
    }

    public static AdvertCardNavBarContentType[] values() {
        return (AdvertCardNavBarContentType[]) $VALUES.clone();
    }
}

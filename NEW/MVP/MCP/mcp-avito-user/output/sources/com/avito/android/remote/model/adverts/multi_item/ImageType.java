package com.avito.android.remote.model.adverts.multi_item;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MultiItemParam.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/ImageType;", "", "(Ljava/lang/String;I)V", "Square", "Portrait", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImageType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImageType[] $VALUES;

    @c("square")
    public static final ImageType Square = new ImageType("Square", 0);

    @c("portrait")
    public static final ImageType Portrait = new ImageType("Portrait", 1);

    private static final /* synthetic */ ImageType[] $values() {
        return new ImageType[]{Square, Portrait};
    }

    static {
        ImageType[] imageTypeArr$values = $values();
        $VALUES = imageTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(imageTypeArr$values);
    }

    private ImageType(String str, int i12) {
    }

    @k
    public static a<ImageType> getEntries() {
        return $ENTRIES;
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }
}

package com.avito.android.advert_details.model.images_with_links;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImagesWithLinksElement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details/model/images_with_links/SimpleViewType;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleViewType {

    @c("horizontal")
    public static final SimpleViewType HORIZONTAL;

    @c("vertical")
    public static final SimpleViewType VERTICAL;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SimpleViewType[] f84421b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f84422c;

    static {
        SimpleViewType simpleViewType = new SimpleViewType("HORIZONTAL", 0);
        HORIZONTAL = simpleViewType;
        SimpleViewType simpleViewType2 = new SimpleViewType("VERTICAL", 1);
        VERTICAL = simpleViewType2;
        SimpleViewType[] simpleViewTypeArr = {simpleViewType, simpleViewType2};
        f84421b = simpleViewTypeArr;
        f84422c = kotlin.enums.c.a(simpleViewTypeArr);
    }

    private SimpleViewType(String str, int i12) {
    }

    public static SimpleViewType valueOf(String str) {
        return (SimpleViewType) Enum.valueOf(SimpleViewType.class, str);
    }

    public static SimpleViewType[] values() {
        return (SimpleViewType[]) f84421b.clone();
    }
}

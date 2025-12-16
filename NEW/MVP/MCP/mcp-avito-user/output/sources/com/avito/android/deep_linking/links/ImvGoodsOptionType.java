package com.avito.android.deep_linking.links;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImvGoodsPollLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ImvGoodsOptionType;", "", "(Ljava/lang/String;I)V", "MULTI", "SINGLE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImvGoodsOptionType {

    @com.google.gson.annotations.c("multi")
    public static final ImvGoodsOptionType MULTI;

    @com.google.gson.annotations.c("single")
    public static final ImvGoodsOptionType SINGLE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ImvGoodsOptionType[] f133358b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133359c;

    static {
        ImvGoodsOptionType imvGoodsOptionType = new ImvGoodsOptionType("MULTI", 0);
        MULTI = imvGoodsOptionType;
        ImvGoodsOptionType imvGoodsOptionType2 = new ImvGoodsOptionType("SINGLE", 1);
        SINGLE = imvGoodsOptionType2;
        ImvGoodsOptionType[] imvGoodsOptionTypeArr = {imvGoodsOptionType, imvGoodsOptionType2};
        f133358b = imvGoodsOptionTypeArr;
        f133359c = kotlin.enums.c.a(imvGoodsOptionTypeArr);
    }

    private ImvGoodsOptionType(String str, int i12) {
    }

    public static ImvGoodsOptionType valueOf(String str) {
        return (ImvGoodsOptionType) Enum.valueOf(ImvGoodsOptionType.class, str);
    }

    public static ImvGoodsOptionType[] values() {
        return (ImvGoodsOptionType[]) f133358b.clone();
    }
}

package com.avito.android.advert_core.analytics.guide;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsGuideClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/guide/FromGuideBlock;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FromGuideBlock {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FromGuideBlock[] f82826b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f82827c;

    static {
        FromGuideBlock[] fromGuideBlockArr = {new FromGuideBlock("SECTION", 0), new FromGuideBlock("LINK", 1)};
        f82826b = fromGuideBlockArr;
        f82827c = c.a(fromGuideBlockArr);
    }

    public FromGuideBlock() {
        throw null;
    }

    public static FromGuideBlock valueOf(String str) {
        return (FromGuideBlock) Enum.valueOf(FromGuideBlock.class, str);
    }

    public static FromGuideBlock[] values() {
        return (FromGuideBlock[]) f82826b.clone();
    }
}

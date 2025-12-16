package com.avito.android.autoteka.analytics.event;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/analytics/event/FromBlock;", "", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FromBlock {

    /* renamed from: c, reason: collision with root package name */
    public static final FromBlock f96083c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromBlock f96084d;

    /* renamed from: e, reason: collision with root package name */
    public static final FromBlock f96085e;

    /* renamed from: f, reason: collision with root package name */
    public static final FromBlock f96086f;

    /* renamed from: g, reason: collision with root package name */
    public static final FromBlock f96087g;

    /* renamed from: h, reason: collision with root package name */
    public static final FromBlock f96088h;

    /* renamed from: i, reason: collision with root package name */
    public static final FromBlock f96089i;

    /* renamed from: j, reason: collision with root package name */
    public static final FromBlock f96090j;

    /* renamed from: k, reason: collision with root package name */
    public static final FromBlock f96091k;

    /* renamed from: l, reason: collision with root package name */
    public static final FromBlock f96092l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ FromBlock[] f96093m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a f96094n;

    /* renamed from: b, reason: collision with root package name */
    public final int f96095b;

    static {
        FromBlock fromBlock = new FromBlock("MODEL_SPECIFICATIONS_BLOCK", 0, 7);
        f96083c = fromBlock;
        FromBlock fromBlock2 = new FromBlock("GALLERY_TEASER_SINGLE_INSIGHT", 1, 4);
        f96084d = fromBlock2;
        FromBlock fromBlock3 = new FromBlock("GALLERY_TEASER_INSIGHTS_LIST", 2, 6);
        f96085e = fromBlock3;
        FromBlock fromBlock4 = new FromBlock("OLD_TEASER", 3, 2);
        f96086f = fromBlock4;
        FromBlock fromBlock5 = new FromBlock("ADVERT_TEASER", 4, 0);
        f96087g = fromBlock5;
        FromBlock fromBlock6 = new FromBlock("CHOOSING_PRODUCT", 5, 10);
        f96088h = fromBlock6;
        FromBlock fromBlock7 = new FromBlock("PURCHASE_VIA_STANDALONE", 6, 11);
        f96089i = fromBlock7;
        FromBlock fromBlock8 = new FromBlock("PREVIEW", 7, 12);
        FromBlock fromBlock9 = new FromBlock("ADVERT_CONTACT_TEASER", 8, 22);
        f96090j = fromBlock9;
        FromBlock fromBlock10 = new FromBlock("SELECT_ADVERT_TEASER", 9, 100);
        f96091k = fromBlock10;
        FromBlock fromBlock11 = new FromBlock("FAVORITES", 10, 23);
        f96092l = fromBlock11;
        FromBlock[] fromBlockArr = {fromBlock, fromBlock2, fromBlock3, fromBlock4, fromBlock5, fromBlock6, fromBlock7, fromBlock8, fromBlock9, fromBlock10, fromBlock11, new FromBlock("OWNERSHIP_DISCREPANCY", 11, 45), new FromBlock("TEASER_WITH_LOCKS", 12, 102), new FromBlock("TEASER_WITH_LOCKS_IN_GALLERY", 13, 103), new FromBlock("MODEL_SPECIFICATIONS_BLOCK_SCROLL", 14, 1)};
        f96093m = fromBlockArr;
        f96094n = c.a(fromBlockArr);
    }

    public FromBlock(String str, int i12, int i13) {
        this.f96095b = i13;
    }

    public static FromBlock valueOf(String str) {
        return (FromBlock) Enum.valueOf(FromBlock.class, str);
    }

    public static FromBlock[] values() {
        return (FromBlock[]) f96093m.clone();
    }
}

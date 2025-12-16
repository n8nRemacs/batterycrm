package com.avito.android.mortgage.api.model.items.form;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormContentItemType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/FormContentItemType;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT", "INPUT", "CHIPS", "CHECKBOX", "BANNER", "TEXT", "SUGGEST", "CHILDREN", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FormContentItemType {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    public static final FormContentItemType BANNER;

    @com.google.gson.annotations.c("checkbox")
    public static final FormContentItemType CHECKBOX;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    public static final FormContentItemType CHILDREN;

    @com.google.gson.annotations.c("chips")
    public static final FormContentItemType CHIPS;

    @com.google.gson.annotations.c("input")
    public static final FormContentItemType INPUT;

    @com.google.gson.annotations.c("select")
    public static final FormContentItemType SELECT;

    @com.google.gson.annotations.c("suggest")
    public static final FormContentItemType SUGGEST;

    @com.google.gson.annotations.c("text")
    public static final FormContentItemType TEXT;

    /* renamed from: b, reason: collision with root package name */
    public static final FormContentItemType f198224b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FormContentItemType[] f198225c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198226d;

    static {
        FormContentItemType formContentItemType = new FormContentItemType("SELECT", 0);
        SELECT = formContentItemType;
        FormContentItemType formContentItemType2 = new FormContentItemType("INPUT", 1);
        INPUT = formContentItemType2;
        FormContentItemType formContentItemType3 = new FormContentItemType("CHIPS", 2);
        CHIPS = formContentItemType3;
        FormContentItemType formContentItemType4 = new FormContentItemType("CHECKBOX", 3);
        CHECKBOX = formContentItemType4;
        FormContentItemType formContentItemType5 = new FormContentItemType("BANNER", 4);
        BANNER = formContentItemType5;
        FormContentItemType formContentItemType6 = new FormContentItemType("TEXT", 5);
        TEXT = formContentItemType6;
        FormContentItemType formContentItemType7 = new FormContentItemType("SUGGEST", 6);
        SUGGEST = formContentItemType7;
        FormContentItemType formContentItemType8 = new FormContentItemType("CHILDREN", 7);
        CHILDREN = formContentItemType8;
        FormContentItemType formContentItemType9 = new FormContentItemType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8);
        f198224b = formContentItemType9;
        FormContentItemType[] formContentItemTypeArr = {formContentItemType, formContentItemType2, formContentItemType3, formContentItemType4, formContentItemType5, formContentItemType6, formContentItemType7, formContentItemType8, formContentItemType9};
        f198225c = formContentItemTypeArr;
        f198226d = kotlin.enums.c.a(formContentItemTypeArr);
    }

    private FormContentItemType(String str, int i12) {
    }

    public static FormContentItemType valueOf(String str) {
        return (FormContentItemType) Enum.valueOf(FormContentItemType.class, str);
    }

    public static FormContentItemType[] values() {
        return (FormContentItemType[]) f198225c.clone();
    }
}

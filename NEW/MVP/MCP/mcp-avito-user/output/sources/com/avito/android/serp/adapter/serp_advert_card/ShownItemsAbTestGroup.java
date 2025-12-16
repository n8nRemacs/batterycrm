package com.avito.android.serp.adapter.serp_advert_card;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpAdvertTileCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/ShownItemsAbTestGroup;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShownItemsAbTestGroup {

    /* renamed from: b, reason: collision with root package name */
    public static final ShownItemsAbTestGroup f271856b;

    /* renamed from: c, reason: collision with root package name */
    public static final ShownItemsAbTestGroup f271857c;

    /* renamed from: d, reason: collision with root package name */
    public static final ShownItemsAbTestGroup f271858d;

    /* renamed from: e, reason: collision with root package name */
    public static final ShownItemsAbTestGroup f271859e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ShownItemsAbTestGroup[] f271860f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f271861g;

    static {
        ShownItemsAbTestGroup shownItemsAbTestGroup = new ShownItemsAbTestGroup("NONE", 0);
        f271856b = shownItemsAbTestGroup;
        ShownItemsAbTestGroup shownItemsAbTestGroup2 = new ShownItemsAbTestGroup("CONTROL", 1);
        ShownItemsAbTestGroup shownItemsAbTestGroup3 = new ShownItemsAbTestGroup("BLACK_TEXT", 2);
        f271857c = shownItemsAbTestGroup3;
        ShownItemsAbTestGroup shownItemsAbTestGroup4 = new ShownItemsAbTestGroup("GREY_TEXT", 3);
        f271858d = shownItemsAbTestGroup4;
        ShownItemsAbTestGroup shownItemsAbTestGroup5 = new ShownItemsAbTestGroup("NO_SIGN", 4);
        f271859e = shownItemsAbTestGroup5;
        ShownItemsAbTestGroup[] shownItemsAbTestGroupArr = {shownItemsAbTestGroup, shownItemsAbTestGroup2, shownItemsAbTestGroup3, shownItemsAbTestGroup4, shownItemsAbTestGroup5};
        f271860f = shownItemsAbTestGroupArr;
        f271861g = kotlin.enums.c.a(shownItemsAbTestGroupArr);
    }

    public ShownItemsAbTestGroup() {
        throw null;
    }

    public static ShownItemsAbTestGroup valueOf(String str) {
        return (ShownItemsAbTestGroup) Enum.valueOf(ShownItemsAbTestGroup.class, str);
    }

    public static ShownItemsAbTestGroup[] values() {
        return (ShownItemsAbTestGroup[]) f271860f.clone();
    }
}

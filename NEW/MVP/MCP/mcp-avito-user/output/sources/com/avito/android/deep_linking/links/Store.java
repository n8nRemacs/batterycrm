package com.avito.android.deep_linking.links;

import com.huawei.hms.common.PackageConstants;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoreDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/Store;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Store {

    /* renamed from: d, reason: collision with root package name */
    public static final Store f133676d;

    /* renamed from: e, reason: collision with root package name */
    public static final Store f133677e;

    /* renamed from: f, reason: collision with root package name */
    public static final Store f133678f;

    /* renamed from: g, reason: collision with root package name */
    public static final Store f133679g;

    /* renamed from: h, reason: collision with root package name */
    public static final Store f133680h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Store[] f133681i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133682j;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133683b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133684c;

    static {
        Store store = new Store("GooglePlay", 0, "com.android.vending", "https://play.google.com/store/apps/details?id=com.avito.android");
        f133676d = store;
        Store store2 = new Store("GetApps", 1, "com.xiaomi.mipicks", "https://global.app.mi.com/details?id=com.avito.android");
        f133677e = store2;
        Store store3 = new Store("RuStore", 2, "ru.vk.store", "https://www.rustore.ru/catalog/app/com.avito.android");
        f133678f = store3;
        Store store4 = new Store("GalaxyStore", 3, "com.sec.android.app.samsungapps", "https://galaxystore.samsung.com/detail/com.avito.android");
        f133679g = store4;
        Store store5 = new Store("AppGallery", 4, PackageConstants.SERVICES_PACKAGE_APPMARKET, "https://appgallery.huawei.ru/app/C101350475");
        f133680h = store5;
        Store[] storeArr = {store, store2, store3, store4, store5};
        f133681i = storeArr;
        f133682j = kotlin.enums.c.a(storeArr);
    }

    public Store(String str, int i12, String str2, String str3) {
        this.f133683b = str2;
        this.f133684c = str3;
    }

    public static Store valueOf(String str) {
        return (Store) Enum.valueOf(Store.class, str);
    }

    public static Store[] values() {
        return (Store[]) f133681i.clone();
    }
}

package com.yandex.mobile.ads.common;

import Y61.k;
import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/ads/common/AdTheme;", "", "LIGHT", "DARK", "mobileads_externalRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes8.dex */
public enum AdTheme {
    LIGHT(FontStyleKt.LIGHT),
    DARK("dark");


    /* renamed from: a, reason: collision with root package name */
    @k
    private final String f382688a;

    AdTheme(String str) {
        this.f382688a = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getF382688a() {
        return this.f382688a;
    }
}

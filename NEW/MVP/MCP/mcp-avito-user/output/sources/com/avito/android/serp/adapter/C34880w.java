package com.avito.android.serp.adapter;

import android.os.Bundle;
import android.os.SystemClock;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: AdvertItemListener.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34880w {
    @Y61.k
    public static final Bundle a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Image image, @Y61.l String str4, @Y61.l Integer num, @Y61.l SearchParams searchParams) {
        Bundle bundleM = com.avito.android.actions_sheet.a.m("title", str);
        if (str4 == null) {
            str4 = searchParams != null ? searchParams.getCategoryId() : null;
        }
        bundleM.putString("key_category_id", str4);
        bundleM.putLong("click_time", SystemClock.elapsedRealtime());
        bundleM.putParcelable("screen_source", ScreenSource.SERP.f251785d);
        if (str2 != null) {
            bundleM.putString("price", str2);
        }
        if (str3 != null) {
            bundleM.putString("old_price", str3);
        }
        if (image != null) {
            bundleM.putParcelable("image", new DimmedImage(image, null, 2, null));
        }
        if (num != null) {
            bundleM.putInt("gallery_position", num.intValue());
        }
        return bundleM;
    }
}

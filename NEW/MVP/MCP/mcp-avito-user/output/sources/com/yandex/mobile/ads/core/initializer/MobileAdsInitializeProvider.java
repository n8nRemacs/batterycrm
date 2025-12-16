package com.yandex.mobile.ads.core.initializer;

import Y61.k;
import Y61.l;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.impl.ab;
import com.yandex.mobile.ads.impl.bh0;
import com.yandex.mobile.ads.impl.h7;
import com.yandex.mobile.ads.impl.h70;
import com.yandex.mobile.ads.impl.i70;
import com.yandex.mobile.ads.impl.na0;
import com.yandex.mobile.ads.impl.pa0;
import com.yandex.mobile.ads.impl.tg0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/ads/core/initializer/MobileAdsInitializeProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes8.dex */
public final class MobileAdsInitializeProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@k Uri uri, @l String str, @l String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @l
    public final String getType(@k Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @l
    public final Uri insert(@k Uri uri, @l ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() throws PackageManager.NameNotFoundException {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        if (h7.a(context)) {
            bh0.a aVarA = bh0.a(context);
            if (aVarA instanceof bh0.a.b) {
                h70.a(i70.a((bh0.a.b) aVarA), new Object[0]);
            } else if (aVarA instanceof bh0.a.C10973a) {
                h70.b("Yandex Mobile Ads 6.0.1 integrated successfully", new Object[0]);
            }
            new tg0().a();
        }
        pa0 pa0Var = new pa0();
        Boolean boolA = pa0.a(context);
        if (boolA != null) {
            MobileAds.setAgeRestrictedUser(boolA.booleanValue());
        }
        new ab(new na0(), pa0Var).a(context);
        return true;
    }

    @Override // android.content.ContentProvider
    @l
    public final Cursor query(@k Uri uri, @l String[] strArr, @l String str, @l String[] strArr2, @l String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@k Uri uri, @l ContentValues contentValues, @l String str, @l String[] strArr) {
        return 0;
    }
}

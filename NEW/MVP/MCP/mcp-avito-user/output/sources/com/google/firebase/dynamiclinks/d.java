package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import android.text.TextUtils;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.k;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import j.P;

/* compiled from: PendingDynamicLinkData.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final DynamicLinkData f361520a;

    @VisibleForTesting
    @RX0.a
    public d(DynamicLinkData dynamicLinkData) {
        Bundle bundle;
        if (dynamicLinkData == null) {
            this.f361520a = null;
            return;
        }
        if (dynamicLinkData.f361524e == 0) {
            k.f349611a.getClass();
            dynamicLinkData.f361524e = System.currentTimeMillis();
        }
        this.f361520a = dynamicLinkData;
        Bundle bundle2 = new Bundle();
        if (dynamicLinkData.f361525f == null) {
            new Bundle();
        }
        Bundle bundle3 = dynamicLinkData.f361525f;
        Bundle bundle4 = (bundle3 == null ? new Bundle() : bundle3).getBundle("scionData");
        if (bundle4 == null || (bundle = bundle4.getBundle("_cmp")) == null) {
            return;
        }
        String string = bundle.getString("medium");
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString("utm_medium", string);
        }
        String string2 = bundle.getString(SearchParamsConverterKt.SOURCE);
        if (!TextUtils.isEmpty(string2)) {
            bundle2.putString("utm_source", string2);
        }
        String string3 = bundle.getString("campaign");
        if (TextUtils.isEmpty(string3)) {
            return;
        }
        bundle2.putString("utm_campaign", string3);
    }
}

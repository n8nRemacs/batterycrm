package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class je {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final n2 f386846a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f386847b;

    public je(@Y61.k Context context, @Y61.k n2 n2Var) {
        this.f386846a = n2Var;
        this.f386847b = context.getApplicationContext();
    }

    @Y61.k
    public final ie a(@Y61.k AdResponse<String> adResponse, @Y61.k SizeInfo sizeInfo) {
        return new ie(this.f386847b, adResponse, this.f386846a, sizeInfo);
    }
}

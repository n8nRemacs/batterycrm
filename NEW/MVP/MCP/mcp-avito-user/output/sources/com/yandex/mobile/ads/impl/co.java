package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class co implements j81 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final n2 f384353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ResultReceiver f384354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C39303a1 f384355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final WeakReference<Context> f384356d;

    @X41.j
    public co(Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k AdResultReceiver adResultReceiver, @Y61.k int i12) {
        this(context, ko1Var, n2Var, adResultReceiver);
    }

    @Override // com.yandex.mobile.ads.impl.j81
    public final void a(@Y61.k oy0 oy0Var, @Y61.k String str) {
        this.f384355c.a(this.f384356d.get(), oy0Var, str, this.f384354b, this.f384353a.r());
    }

    @X41.j
    public co(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k AdResultReceiver adResultReceiver, @Y61.k C39303a1 c39303a1) {
        this.f384353a = n2Var;
        this.f384354b = adResultReceiver;
        this.f384355c = c39303a1;
        this.f384356d = new WeakReference<>(context);
    }

    public /* synthetic */ co(Context context, ko1 ko1Var, n2 n2Var, AdResultReceiver adResultReceiver) {
        this(context, ko1Var, n2Var, adResultReceiver, new C39303a1(ko1Var));
    }
}

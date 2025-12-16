package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39307b1 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final n2 f383723a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ResultReceiver f383724b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C39303a1 f383725c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final WeakReference<Context> f383726d;

    @X41.j
    public C39307b1(@Y61.l Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k ResultReceiver resultReceiver) {
        this(context, ko1Var, n2Var, resultReceiver, 0);
    }

    @Override // com.yandex.mobile.ads.impl.j81
    public final void a(@Y61.k oy0 oy0Var, @Y61.k String str) {
        this.f383725c.a(this.f383726d.get(), oy0Var, str, this.f383724b, this.f383723a.r());
    }

    @X41.j
    public C39307b1(@Y61.l Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k ResultReceiver resultReceiver, @Y61.k C39303a1 c39303a1) {
        this.f383723a = n2Var;
        this.f383724b = resultReceiver;
        this.f383725c = c39303a1;
        this.f383726d = new WeakReference<>(context);
    }

    public /* synthetic */ C39307b1(Context context, ko1 ko1Var, n2 n2Var, ResultReceiver resultReceiver, int i12) {
        this(context, ko1Var, n2Var, resultReceiver, new C39303a1(ko1Var));
    }
}

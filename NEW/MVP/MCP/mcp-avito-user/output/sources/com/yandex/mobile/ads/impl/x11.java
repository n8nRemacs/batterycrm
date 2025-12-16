package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;

/* loaded from: classes8.dex */
public final class x11 implements i21 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ha f391520a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final IReporter f391521b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final py0 f391522c;

    public x11(@Y61.k ha haVar, @Y61.l IReporter iReporter, @Y61.k py0 py0Var) {
        this.f391520a = haVar;
        this.f391521b = iReporter;
        this.f391522c = py0Var;
    }

    @Override // com.yandex.mobile.ads.impl.i21
    public final void a(@Y61.k Context context, @Y61.k v11 v11Var) {
        boolean zA2 = this.f391522c.a(context);
        this.f391520a.getClass();
        ha.a(context, zA2);
        IReporter iReporter = this.f391521b;
        if (iReporter != null) {
            iReporter.setStatisticsSending(this.f391522c.b(context));
        }
    }
}

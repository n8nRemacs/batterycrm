package com.geetest.captcha;

import android.content.Context;

/* loaded from: classes4.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f342715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f342716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f342717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f342718d;

    public f(g gVar, Context context, v vVar, z zVar) {
        this.f342715a = gVar;
        this.f342716b = context;
        this.f342717c = vVar;
        this.f342718d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f342715a.b(this.f342716b, this.f342717c, this.f342718d);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}

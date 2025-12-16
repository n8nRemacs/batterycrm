package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.me0;
import java.util.Map;

/* loaded from: classes8.dex */
final class le0 implements k30 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.monetization.ads.mediation.nativeads.a f387451a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f387452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ me0.a f387453c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ me0 f387454d;

    public le0(me0 me0Var, com.monetization.ads.mediation.nativeads.a aVar, int i12, me0.a aVar2) {
        this.f387454d = me0Var;
        this.f387451a = aVar;
        this.f387452b = i12;
        this.f387453c = aVar2;
    }

    @Override // com.yandex.mobile.ads.impl.k30
    public final void a(@j.N Map<String, Bitmap> map) {
        me0.a(this.f387454d, this.f387451a, map, this.f387452b, this.f387453c);
    }
}

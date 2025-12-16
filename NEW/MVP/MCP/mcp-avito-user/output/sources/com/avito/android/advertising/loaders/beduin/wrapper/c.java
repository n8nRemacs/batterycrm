package com.avito.android.advertising.loaders.beduin.wrapper;

import Y61.k;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: CommercialWrapperComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/wrapper/c;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/advertising/loaders/beduin/wrapper/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends n<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<com.avito.konveyor.a> f88179c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final H f88180d;

    public c(@k Y41.a<com.avito.konveyor.a> aVar, @k f fVar, @k H h12) {
        super(fVar);
        this.f88179c = aVar;
        this.f88180d = h12;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new a(this.f88179c.invoke(), this.f88180d);
    }
}

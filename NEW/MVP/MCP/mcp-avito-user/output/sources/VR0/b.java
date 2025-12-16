package Vr0;

import android.content.res.Resources;
import com.avito.android.constructor_advert.ui.serp.constructor.f;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.advert_xl.D;
import com.avito.android.serp.adapter.vertical_main.featured.c;
import com.avito.android.serp.adapter.witcher.InterfaceC34887f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: FeaturedModule_ProvidesFeaturedItemsConverterFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<com.avito.android.serp.adapter.vertical_main.featured.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C15711a f17442a;

    /* renamed from: b, reason: collision with root package name */
    public final l f17443b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34904z0> f17444c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<D> f17445d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<f> f17446e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC34887f> f17447f;

    /* renamed from: g, reason: collision with root package name */
    public final u f17448g;

    public b(C15711a c15711a, l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, u uVar) {
        this.f17442a = c15711a;
        this.f17443b = lVar;
        this.f17444c = provider;
        this.f17445d = provider2;
        this.f17446e = provider3;
        this.f17447f = provider4;
        this.f17448g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f17443b.f393949a;
        InterfaceC34904z0 interfaceC34904z0 = this.f17444c.get();
        D d12 = this.f17445d.get();
        f fVar = this.f17446e.get();
        InterfaceC34887f interfaceC34887f = this.f17447f.get();
        Set set = (Set) this.f17448g.get();
        this.f17442a.getClass();
        return new c(resources, interfaceC34904z0, d12, fVar, interfaceC34887f, set);
    }
}

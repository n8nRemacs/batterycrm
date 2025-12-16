package com.avito.android.publish.slots.advantage_banners.container;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvantageContainerBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/advantage_banners/container/a;", "LTV0/b;", "Lcom/avito/android/publish/slots/advantage_banners/container/g;", "Lcom/avito/android/publish/slots/advantage_banners/container/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f243000a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f243001b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f243002c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f243003d = new g.a<>(R.layout.item_advantage_container, new C7285a());

    /* compiled from: AdvantageContainerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/advantage_banners/container/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/advantage_banners/container/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.advantage_banners.container.a$a, reason: collision with other inner class name */
    public static final class C7285a extends N implements p<ViewGroup, View, h> {
        public C7285a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new h(view, aVar.f243001b, aVar.f243002c);
        }
    }

    @Inject
    public a(@k d dVar, @com.avito.android.publish.slots.advantage_banners.a @k com.avito.konveyor.adapter.a aVar, @com.avito.android.publish.slots.advantage_banners.a @k j jVar) {
        this.f243000a = dVar;
        this.f243001b = aVar;
        this.f243002c = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243000a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f243003d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}

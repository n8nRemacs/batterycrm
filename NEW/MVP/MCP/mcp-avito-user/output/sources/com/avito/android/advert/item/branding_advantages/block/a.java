package com.avito.android.advert.item.branding_advantages.block;

import Oi0.C14700d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandingAdvantagesBlockItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block/a;", "LTV0/b;", "Lcom/avito/android/advert/item/branding_advantages/block/h;", "Lcom/avito/android/advert/item/branding_advantages/block/BrandingAdvantagesBlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<h, BrandingAdvantagesBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f74178a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f74179b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f74180c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<h> f74181d = new g.a<>(R.layout.advert_details_branding_advantages_block, new C2207a());

    /* compiled from: BrandingAdvantagesBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/branding_advantages/block/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/branding_advantages/block/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.branding_advantages.block.a$a, reason: collision with other inner class name */
    public static final class C2207a extends N implements p<ViewGroup, View, h> {
        public C2207a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new h(view, aVar.f74179b, aVar.f74180c);
        }
    }

    @Inject
    public a(@k e eVar, @O4.a @k com.avito.konveyor.adapter.h hVar, @O4.i @k C14700d c14700d) {
        this.f74178a = eVar;
        this.f74179b = hVar;
        this.f74180c = c14700d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74178a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f74181d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof BrandingAdvantagesBlockItem;
    }
}

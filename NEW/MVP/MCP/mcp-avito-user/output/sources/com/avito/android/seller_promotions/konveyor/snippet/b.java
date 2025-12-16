package com.avito.android.seller_promotions.konveyor.snippet;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import bj.InterfaceC25659b;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SnippetBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/snippet/b;", "LTV0/b;", "Lcom/avito/android/seller_promotions/konveyor/snippet/j;", "Lcom/avito/android/seller_promotions/konveyor/snippet/d;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<j, d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f267828a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f267829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<j> f267830c = new g.a<>(R.layout.seller_promotions_snippet, new a());

    /* compiled from: SnippetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/seller_promotions/konveyor/snippet/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/seller_promotions/konveyor/snippet/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j((ViewGroup) view, b.this.f267829b.a(0), null, 4, null);
        }
    }

    @Inject
    public b(@k h hVar, @k InterfaceC25659b interfaceC25659b) {
        this.f267828a = hVar;
        this.f267829b = interfaceC25659b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f267828a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f267830c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof d;
    }
}

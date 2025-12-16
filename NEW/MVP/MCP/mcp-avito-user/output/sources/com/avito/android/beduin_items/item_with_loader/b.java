package com.avito.android.beduin_items.item_with_loader;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinItemWithLoaderBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_items/item_with_loader/b;", "LTV0/b;", "Lcom/avito/android/beduin_items/item_with_loader/h;", "Lcom/avito/android/beduin_items/item_with_loader/a;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<h, com.avito.android.beduin_items.item_with_loader.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f105259a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f105260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f105261c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f105262d = new g.a<>(R.layout.beduin_items_recycler_with_loader, new a());

    /* compiled from: BeduinItemWithLoaderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin_items/item_with_loader/BeduinItemWithLoaderViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<ViewGroup, View, BeduinItemWithLoaderViewImpl> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final BeduinItemWithLoaderViewImpl invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new BeduinItemWithLoaderViewImpl(view, bVar.f105260b.b(null), bVar.f105261c);
        }
    }

    @Inject
    public b(@k e eVar, @k InterfaceC25659b interfaceC25659b, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f105259a = eVar;
        this.f105260b = interfaceC25659b;
        this.f105261c = interfaceC35745a5;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105259a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f105262d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.beduin_items.item_with_loader.a;
    }
}

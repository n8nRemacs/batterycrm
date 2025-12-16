package com.avito.android.avl_entry.impl.ui.external_item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShortVideosBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/a;", "LTV0/b;", "Lcom/avito/android/avl_entry/impl/ui/external_item/j;", "LIg/d;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<j, Ig.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Jg.b<j, Ig.d> f98518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ig.f f98519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f98520c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98521d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f98522e = new g.a<>(R.layout.avl_entry_layout, new C2955a());

    /* compiled from: ShortVideosBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/avl_entry/impl/ui/external_item/ShortVideosViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avl_entry.impl.ui.external_item.a$a, reason: collision with other inner class name */
    public static final class C2955a extends N implements p<ViewGroup, View, ShortVideosViewImpl> {
        public C2955a() {
            super(2);
        }

        @Override // Y41.p
        public final ShortVideosViewImpl invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new ShortVideosViewImpl(view, aVar.f98519b, aVar.f98520c, aVar.f98521d);
        }
    }

    public a(@Y61.k Jg.b<j, Ig.d> bVar, @Y61.k Ig.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.avl_analytics.a aVar) {
        this.f98518a = bVar;
        this.f98519b = fVar;
        this.f98520c = interfaceC35745a5;
        this.f98521d = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f98518a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f98522e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof Ig.d;
    }
}

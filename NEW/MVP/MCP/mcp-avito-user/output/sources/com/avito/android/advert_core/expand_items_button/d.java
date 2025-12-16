package com.avito.android.advert_core.expand_items_button;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpandItemsButtonBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/d;", "LTV0/b;", "Lcom/avito/android/advert_core/expand_items_button/k;", "Lcom/avito/android/advert_core/expand_items_button/ExpandItemsButtonItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.b<k, ExpandItemsButtonItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f83579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f83580b = new g.a<>(R.layout.advert_details_expand_items_button, a.f83581l);

    /* compiled from: ExpandItemsButtonBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/expand_items_button/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/expand_items_button/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f83581l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public d(@Y61.k g gVar) {
        this.f83579a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f83579a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f83580b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ExpandItemsButtonItem) {
            ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) aVar;
            if (!expandItemsButtonItem.f83568l && !expandItemsButtonItem.f83569m) {
                return true;
            }
        }
        return false;
    }
}

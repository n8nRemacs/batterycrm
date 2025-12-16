package com.avito.android.inline_filters.dialog.select.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineFiltersDialogBrandspaceItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/b;", "LTV0/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/c;", "Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.select.adapter.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31030b implements TV0.b<C31031c, i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f172071a;

    /* compiled from: InlineFiltersDialogBrandspaceItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/inline_filters/dialog/select/adapter/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/inline_filters/dialog/select/adapter/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.select.adapter.b$a */
    public static final class a extends N implements Y41.p<ViewGroup, View, C31031c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f172072l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C31031c invoke(ViewGroup viewGroup, View view) {
            return new C31031c(view);
        }
    }

    public C31030b(@Y61.k j jVar) {
        this.f172071a = jVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<C31031c, i> a() {
        return this.f172071a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.inline_filters_dialog_brandspace, a.f172072l);
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof i) {
            if (((i) aVar).f172095f == InlineItemType.f172064k) {
                return true;
            }
        }
        return false;
    }
}

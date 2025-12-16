package com.avito.android.profile.edit.adapter;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.edit.refactoring.adapter.item.TextItem;
import com.avito.android.profile.edit.refactoring.adapter.z;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/adapter/m;", "LTV0/b;", "Lru/avito/component/info_label/j;", "Lcom/avito/android/profile/edit/refactoring/adapter/item/TextItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements TV0.b<ru.avito.component.info_label.j, TextItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f222046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f222047b = new g.a<>(R.layout.info_label, a.f222048l);

    /* compiled from: TextItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lru/avito/component/info_label/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lru/avito/component/info_label/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, ru.avito.component.info_label.k> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f222048l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final ru.avito.component.info_label.k invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            D6.f(view2, 0, view2.getResources().getDimensionPixelSize(R.dimen.content_top_padding), 0, 0, 13);
            return new ru.avito.component.info_label.k(view2);
        }
    }

    public m(@Y61.k z zVar) {
        this.f222046a = zVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f222046a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f222047b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof TextItem;
    }
}

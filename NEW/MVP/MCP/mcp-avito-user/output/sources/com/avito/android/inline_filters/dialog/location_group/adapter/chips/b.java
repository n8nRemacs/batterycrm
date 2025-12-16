package com.avito.android.inline_filters.dialog.location_group.adapter.chips;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.inline_filters.dialog.location_group.adapter.ItemType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupFilterItemChipsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/b;", "LTV0/b;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/h;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/GroupFilterItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TV0.b<h, GroupFilterItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f171728a;

    /* compiled from: GroupFilterItemChipsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/inline_filters/dialog/location_group/adapter/chips/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f171729l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public b(@k g gVar) {
        this.f171728a = gVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<h, GroupFilterItem> a() {
        return this.f171728a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.inline_filters_group_chips_item, a.f171729l);
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof GroupFilterItem) {
            if (((GroupFilterItem) aVar).f171705d == ItemType.f171709d) {
                return true;
            }
        }
        return false;
    }
}

package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalSearchFilterMultiSelectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/m;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/j;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements TV0.b<j, e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f273498a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f273499b = new g.a<>(R.layout.vertical_main_select_item, a.f273500l);

    /* compiled from: VerticalSearchFilterMultiSelectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.konveyor.adapter.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f273500l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public m(@Y61.k g gVar) {
        this.f273498a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273498a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f273499b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof e) {
            if (((e) aVar).f273467d == ItemType.f273431c) {
                return true;
            }
        }
        return false;
    }
}

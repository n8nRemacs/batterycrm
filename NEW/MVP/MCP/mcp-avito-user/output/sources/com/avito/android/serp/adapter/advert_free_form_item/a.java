package com.avito.android.serp.adapter.advert_free_form_item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertFreeFormItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/advert_free_form_item/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/advert_free_form_item/n;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<n, ConstructorAdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f268711a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f268712b;

    /* compiled from: AdvertFreeFormItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/advert_free_form_item/AdvertFreeFormItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.advert_free_form_item.a$a, reason: collision with other inner class name */
    public static final class C8033a extends N implements p<ViewGroup, View, AdvertFreeFormItemViewImpl> {
        public C8033a() {
            super(2);
        }

        @Override // Y41.p
        public final AdvertFreeFormItemViewImpl invoke(ViewGroup viewGroup, View view) {
            return new AdvertFreeFormItemViewImpl(view, a.this.f268712b.a(null));
        }
    }

    @Inject
    public a(@Y61.k e eVar, @Y61.k InterfaceC25659b interfaceC25659b) {
        this.f268711a = eVar;
        this.f268712b = interfaceC25659b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f268711a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.advert_free_form_layout_item, new C8033a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ConstructorAdvertItem) {
            ConstructorAdvertItem constructorAdvertItem = (ConstructorAdvertItem) aVar;
            if (constructorAdvertItem.getDisplayType().isCv() || constructorAdvertItem.getDisplayType().isVacancy()) {
                return true;
            }
        }
        return false;
    }
}

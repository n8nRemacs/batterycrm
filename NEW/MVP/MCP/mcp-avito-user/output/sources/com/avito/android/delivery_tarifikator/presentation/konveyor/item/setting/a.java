package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SettingBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/a;", "LTV0/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/i;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/d;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<i, d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f135401a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f135402b = new g.a<>(R.layout.item_setting, C4096a.f135403l);

    /* compiled from: SettingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.a$a, reason: collision with other inner class name */
    public static final class C4096a extends N implements Y41.p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4096a f135403l = new C4096a();

        public C4096a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public a(@Y61.k f fVar) {
        this.f135401a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f135401a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f135402b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof d;
    }
}

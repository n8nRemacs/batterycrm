package com.avito.android.component.advert_badge_bar.badge_item;

import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: BadgeItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge_item/a;", "LTV0/b;", "Lcom/avito/android/component/advert_badge_bar/badge/a;", "Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<com.avito.android.component.advert_badge_bar.badge.a, BadgeItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f124982a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f124983b;

    /* compiled from: BadgeItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/component/advert_badge_bar/badge/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/component/advert_badge_bar/badge/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.component.advert_badge_bar.badge_item.a$a, reason: collision with other inner class name */
    public static final class C3716a extends N implements p<ViewGroup, View, com.avito.android.component.advert_badge_bar.badge.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3716a f124984l = new C3716a();

        public C3716a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.component.advert_badge_bar.badge.b invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.component.advert_badge_bar.badge.b((AdvertBadgeView) view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f124982a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f124983b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof BadgeItem;
    }

    public a(@l Y41.l<? super BadgeItem, G0> lVar) {
        this.f124982a = new b(lVar);
        this.f124983b = new g.a<>(R.layout.advert_badge_item, C3716a.f124984l);
    }

    public /* synthetic */ a(Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : lVar);
    }
}

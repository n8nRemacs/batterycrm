package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProSbBlockItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/i;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/q;", "Lcom/avito/android/service_booking_user_profile/view/item/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class i implements TV0.b<q, com.avito.android.service_booking_user_profile.view.item.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f223503a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f223504b;

    /* compiled from: ProfileProSbBlockItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, q> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q.a f223505l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q.a aVar) {
            super(2);
            this.f223505l = aVar;
        }

        @Override // Y41.p
        public final q invoke(ViewGroup viewGroup, View view) {
            return this.f223505l.a(view);
        }
    }

    @Inject
    public i(@Y61.k m mVar, @Y61.k q.a aVar) {
        this.f223503a = mVar;
        this.f223504b = new g.a<>(R.layout.item_profile_pro_service_booking, new a(aVar));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<q, com.avito.android.service_booking_user_profile.view.item.a> a() {
        return this.f223503a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f223504b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.service_booking_user_profile.view.item.a;
    }
}

package com.avito.android.publish.slots.address_from_profile.publish_item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.slots.address_from_profile.InterfaceC34117a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddressesFromProfileBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/l;", "LTV0/b;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/a;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/s;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements TV0.b<com.avito.android.publish.slots.address_from_profile.publish_item.a, s> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f242929a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f242930b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f242931c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<b> f242932d = new g.a<>(R.layout.select_address_in_list_slot, new a());

    /* compiled from: AddressesFromProfileBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/address_from_profile/publish_item/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, b> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            l lVar = l.this;
            return new b(view, lVar.f242930b, lVar.f242931c);
        }
    }

    @Inject
    public l(@Y61.k c cVar, @Y61.k @InterfaceC34117a com.avito.konveyor.adapter.a aVar, @Y61.k @InterfaceC34117a com.avito.konveyor.adapter.d dVar) {
        this.f242929a = cVar;
        this.f242930b = aVar;
        this.f242931c = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f242929a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<b> b() {
        return this.f242932d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof s;
    }
}

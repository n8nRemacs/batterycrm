package com.avito.android.sx_address.selectaddresslist.view.recycler;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddressBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/view/recycler/a;", "LTV0/b;", "Lcom/avito/android/sx_address/selectaddresslist/view/recycler/g;", "Lcom/avito/android/sx_address/selectaddresslist/domain/AddressListViewItem;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<g, AddressListViewItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f294198a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f294199b = new g.a<>(R.layout.select_address_item, C8945a.f294200l);

    /* compiled from: AddressBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/sx_address/selectaddresslist/view/recycler/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/sx_address/selectaddresslist/view/recycler/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.sx_address.selectaddresslist.view.recycler.a$a, reason: collision with other inner class name */
    public static final class C8945a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8945a f294200l = new C8945a();

        public C8945a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f294198a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f294198a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f294199b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AddressListViewItem;
    }
}

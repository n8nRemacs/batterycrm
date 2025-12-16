package com.avito.android.advert.item.developer.button;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import h5.InterfaceC40772a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeveloperButtonBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/developer/button/a;", "LTV0/b;", "Lcom/avito/android/advert/item/developer/button/f;", "Lcom/avito/android/advert/item/developer/button/DeveloperButtonItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, DeveloperButtonItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f75170a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40772a f75171b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<g> f75172c = new g.a<>(R.layout.advert_details_developer_button, new C2232a());

    /* compiled from: DeveloperButtonBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/developer/button/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/developer/button/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.developer.button.a$a, reason: collision with other inner class name */
    public static final class C2232a extends N implements p<ViewGroup, View, g> {
        public C2232a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view, a.this.f75171b);
        }
    }

    @Inject
    public a(@k c cVar, @k InterfaceC40772a interfaceC40772a) {
        this.f75170a = cVar;
        this.f75171b = interfaceC40772a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f75170a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f75172c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof DeveloperButtonItem;
    }
}

package com.avito.android.select.sectioned_multiselect.core.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/analytics/d;", "Lcom/avito/android/select/sectioned_multiselect/core/analytics/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.select.sectioned_multiselect.core.analytics.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f266554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f266555b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f266556c;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k Gson gson, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f266554a = interfaceC28373a;
        this.f266555b = gson;
        this.f266556c = interfaceC35745a5;
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.analytics.b
    public final void a(@l String str) {
        if (str == null) {
            return;
        }
        this.f266554a.c(new h(str));
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.analytics.b
    public final void b() {
        this.f266554a.c(f.f266562c);
    }

    @Override // com.avito.android.select.sectioned_multiselect.core.analytics.b
    public final void c(@l final String str, @l final List<SectionedMultiselectParameter.Tab> list, @k final List<? extends ParcelableEntity<String>> list2, @k final String str2, final int i12) {
        G g12 = new G(new Callable() { // from class: com.avito.android.select.sectioned_multiselect.core.analytics.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList;
                List list3 = list;
                if (list3 != null) {
                    List list4 = list3;
                    arrayList = new ArrayList(C42745f0.q(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SectionedMultiselectParameter.Tab) it.next()).getTabTitle());
                    }
                } else {
                    arrayList = null;
                }
                List list5 = list2;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    String f201827c = ((ParcelableEntity) it2.next()).getF201827c();
                    if (f201827c != null) {
                        arrayList2.add(f201827c);
                    }
                }
                return new g(str2, this.f266555b.k(a.class, new a(str, arrayList, arrayList2)), i12);
            }
        });
        InterfaceC35745a5 interfaceC35745a5 = this.f266556c;
        S s5 = g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e());
        final InterfaceC28373a interfaceC28373a = this.f266554a;
        l41.g gVar = new l41.g() { // from class: com.avito.android.select.sectioned_multiselect.core.analytics.d.a
            @Override // l41.g
            public final void accept(Object obj) {
                interfaceC28373a.c((InterfaceC28464o) obj);
            }
        };
        final V2 v22 = V2.f318762a;
        s5.x(gVar, new l41.g() { // from class: com.avito.android.select.sectioned_multiselect.core.analytics.d.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        });
    }
}

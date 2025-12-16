package com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import java.util.ArrayList;
import java.util.Iterator;
import ki.C42696b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wi.C49628d;

/* compiled from: TabContainerTabsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/d;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C42696b f104382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Object f104383c;

    /* compiled from: TabContainerTabsWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f104385m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar) {
            super(1);
            this.f104385m = lVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            String str;
            e.b bVar = (e.b) C42745f0.K(num.intValue(), d.this.f104383c);
            if (bVar != null && (str = bVar.f104389a) != null) {
                this.f104385m.invoke(str);
            }
            return G0.f406611a;
        }
    }

    public d(@k Context context, @k FrameLayout.LayoutParams layoutParams, @k C49628d c49628d) {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f104383c = c42784z0;
        C42696b c42696b = new C42696b(context);
        this.f104382b = c42696b;
        c42696b.setLayoutParams(layoutParams);
        c42696b.a(c49628d.a(), c42784z0, 0, null, c.f104381l);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void a(@k l<? super String, G0> lVar) {
        this.f104382b.getResolvedTabs().nc(new a(lVar));
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void b(@k ArrayList arrayList) {
        this.f104383c = arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e.b bVar = (e.b) it.next();
            String str = bVar.f104390b;
            BeduinTabCounter beduinTabCounter = bVar.f104391c;
            arrayList2.add(new CommonTab(str, beduinTabCounter != null ? beduinTabCounter.getText() : null));
        }
        this.f104382b.getResolvedTabs().mc(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void c(@k String str) {
        Iterator it = this.f104383c.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(((e.b) it.next()).f104389a, str)) {
                break;
            } else {
                i12++;
            }
        }
        this.f104382b.getResolvedTabs().Qa(i12 >= 0 ? i12 : 0);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    @k
    public final View getView() {
        return this.f104382b;
    }
}

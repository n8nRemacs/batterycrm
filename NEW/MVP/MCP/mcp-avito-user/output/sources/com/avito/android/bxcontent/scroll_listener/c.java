package com.avito.android.bxcontent.scroll_listener;

import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.ab_tests.configs.AutoFilterHintToastTestGroup;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.ui.adapter.h;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import t3.InterfaceC48481l;
import u3.l;

/* compiled from: SerpAdvertScrollTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/scroll_listener/c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f112832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h<com.avito.konveyor.adapter.b> f112833c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<AutoFilterHintToastTestGroup> f112834d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.a<G0> f112835e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f112836f = new ArrayList();

    public c(@k LinearLayoutManager linearLayoutManager, @k h<com.avito.konveyor.adapter.b> hVar, @InterfaceC48481l @k l<AutoFilterHintToastTestGroup> lVar, @k Y41.a<G0> aVar) {
        this.f112832b = linearLayoutManager;
        this.f112833c = hVar;
        this.f112834d = lVar;
        this.f112835e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        ArrayList arrayList = this.f112836f;
        if (arrayList.size() >= 5) {
            return;
        }
        if (i12 == 0 && i13 == 0) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f112832b;
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 == -1 || iK1 > iM1) {
            return;
        }
        while (true) {
            TV0.a item = this.f112833c.getItem(iK1);
            if (item != null && (item instanceof SerpConstructorAdvertItem)) {
                if (!arrayList.contains(Long.valueOf(item.getF85764e()))) {
                    arrayList.add(Long.valueOf(item.getF85764e()));
                }
                if (arrayList.size() == 5) {
                    l<AutoFilterHintToastTestGroup> lVar = this.f112834d;
                    AutoFilterHintToastTestGroup autoFilterHintToastTestGroup = lVar.f439745a.f439749b;
                    autoFilterHintToastTestGroup.getClass();
                    if (autoFilterHintToastTestGroup != AutoFilterHintToastTestGroup.f67779c) {
                        lVar.b();
                    }
                    this.f112835e.invoke();
                    return;
                }
            }
            if (iK1 == iM1) {
                return;
            } else {
                iK1++;
            }
        }
    }
}

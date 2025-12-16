package com.avito.android.profile_settings_extended;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class E implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f228994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f228995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f228996d;

    public E(B b12, List list, Y41.a aVar) {
        this.f228994b = b12;
        this.f228995c = list;
        this.f228996d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeduinView beduinView;
        RecyclerView recyclerViewA;
        RecyclerView.m layoutManager;
        B b12 = this.f228994b;
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = b12.f228980w;
        List<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k> listO = iVar != null ? iVar.o() : null;
        if (listO == null) {
            listO = C42784z0.f406748b;
        }
        Iterator<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k> it = listO.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k next = it.next();
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u uVar = next instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u ? (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u) next : null;
            QH.a aVar = uVar != null ? uVar.f151421a : null;
            Rb0.d dVar = aVar instanceof Rb0.d ? (Rb0.d) aVar : null;
            if (C42745f0.r(this.f228995c, dVar != null ? dVar.getF229916d() : null)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1 || (beduinView = b12.f228975r) == null || (recyclerViewA = CA.b.a(beduinView)) == null || (layoutManager = recyclerViewA.getLayoutManager()) == null) {
            return;
        }
        ((C33479m) this.f228996d).invoke();
        com.avito.android.beduin.view.recyclerview.g gVar = b12.f228981x;
        gVar.f53878a = i12;
        layoutManager.x1(gVar);
    }
}

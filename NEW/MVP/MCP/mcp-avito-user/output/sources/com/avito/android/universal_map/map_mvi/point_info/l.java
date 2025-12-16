package com.avito.android.universal_map.map_mvi.point_info;

import Ca1.ViewOnTouchListenerC13234a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.universal_map.map_mvi.point_info.h;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalMapPointInfoViewMviV2Impl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f306321l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar) {
        super(0);
        this.f306321l = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        o oVar = this.f306321l;
        boolean zY2 = D6.y(oVar.f306336l);
        oVar.f306334j.j();
        D6.H(oVar.f306336l);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = oVar.f306347w;
        int i12 = bottomSheetBehavior.f355975L;
        if (i12 != 2 && i12 != 3) {
            bottomSheetBehavior.b(4);
        }
        int i13 = bottomSheetBehavior.f355975L;
        h hVar = oVar.f306348x;
        hVar.f306309a.setOnTouchListener(null);
        RecyclerView recyclerView = hVar.f306310b;
        recyclerView.setOnTouchListener(null);
        RecyclerView recyclerView2 = hVar.f306311c;
        recyclerView2.setOnTouchListener(null);
        h.b bVar = hVar.f306314f;
        recyclerView.u0(bVar);
        recyclerView2.u0(bVar);
        if (i13 == 4 && !zY2) {
            ViewGroup viewGroup = hVar.f306309a;
            ViewOnTouchListenerC13234a viewOnTouchListenerC13234a = hVar.f306315g;
            viewGroup.setOnTouchListener(viewOnTouchListenerC13234a);
            recyclerView.setOnTouchListener(viewOnTouchListenerC13234a);
            recyclerView2.setOnTouchListener(viewOnTouchListenerC13234a);
            recyclerView.n(bVar);
            recyclerView2.n(bVar);
        }
        return G0.f406611a;
    }
}

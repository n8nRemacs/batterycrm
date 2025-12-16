package com.avito.android.universal_map.map.point_info_v2;

import Ca1.ViewOnTouchListenerC13234a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.universal_map.map.point_info_v2.a;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalMapPointInfoViewV2Impl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f305909l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(0);
        this.f305909l = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f305909l;
        boolean zY2 = D6.y(hVar.f305925k);
        hVar.f305923i.j();
        D6.H(hVar.f305925k);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f305936v;
        int i12 = bottomSheetBehavior.f355975L;
        if (i12 != 2 && i12 != 3) {
            bottomSheetBehavior.b(4);
        }
        int i13 = bottomSheetBehavior.f355975L;
        a aVar = hVar.f305937w;
        aVar.f305897a.setOnTouchListener(null);
        RecyclerView recyclerView = aVar.f305898b;
        recyclerView.setOnTouchListener(null);
        RecyclerView recyclerView2 = aVar.f305899c;
        recyclerView2.setOnTouchListener(null);
        a.b bVar = aVar.f305902f;
        recyclerView.u0(bVar);
        recyclerView2.u0(bVar);
        if (i13 == 4 && !zY2) {
            ViewGroup viewGroup = aVar.f305897a;
            ViewOnTouchListenerC13234a viewOnTouchListenerC13234a = aVar.f305903g;
            viewGroup.setOnTouchListener(viewOnTouchListenerC13234a);
            recyclerView.setOnTouchListener(viewOnTouchListenerC13234a);
            recyclerView2.setOnTouchListener(viewOnTouchListenerC13234a);
            recyclerView.n(bVar);
            recyclerView2.n(bVar);
        }
        return G0.f406611a;
    }
}

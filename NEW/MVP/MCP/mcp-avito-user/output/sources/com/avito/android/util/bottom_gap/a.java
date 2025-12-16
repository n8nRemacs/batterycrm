package com.avito.android.util.bottom_gap;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.V;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.vas_planning.o;
import com.avito.android.vas_union.VasUnionV2Fragment;
import com.avito.beduin.v2.render.android_view.J;
import com.avito.beduin.v2.render.android_view.K;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout;
import xZ.C49899a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f318830c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f318829b = i12;
        this.f318830c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Object obj = this.f318830c;
        switch (this.f318829b) {
            case 0:
                ((b) obj).f318831a.b(new j((int) V.a(i15 - i13, view.getResources().getDisplayMetrics())));
                break;
            case 1:
                if (view.getHeight() > 0) {
                    o oVar = (o) obj;
                    C49899a c49899a = oVar.f322456k;
                    RecyclerView recyclerView = oVar.f322453h;
                    if (c49899a != null) {
                        recyclerView.r0(c49899a);
                    }
                    C49899a c49899a2 = new C49899a(view.getHeight());
                    recyclerView.l(c49899a2, -1);
                    oVar.f322456k = c49899a2;
                    break;
                }
                break;
            case 2:
                VasUnionV2Fragment.a aVar = VasUnionV2Fragment.f323084D0;
                if (view.getHeight() > 0) {
                    VasUnionV2Fragment vasUnionV2Fragment = (VasUnionV2Fragment) obj;
                    C49899a c49899a3 = vasUnionV2Fragment.f323086B0;
                    if (c49899a3 != null) {
                        RecyclerView recyclerView2 = vasUnionV2Fragment.f323100z0;
                        if (recyclerView2 == null) {
                            recyclerView2 = null;
                        }
                        recyclerView2.r0(c49899a3);
                    }
                    C49899a c49899a4 = new C49899a(view.getHeight());
                    RecyclerView recyclerView3 = vasUnionV2Fragment.f323100z0;
                    (recyclerView3 != null ? recyclerView3 : null).l(c49899a4, -1);
                    vasUnionV2Fragment.f323086B0 = c49899a4;
                    break;
                }
                break;
            case 3:
                if (i12 != i16 || i14 != i18 || i13 != i17 || i15 != i19) {
                    K k12 = (K) obj;
                    k12.getClass();
                    k12.f337927a.post(new J(k12, 0));
                    break;
                }
                break;
            case 4:
                MultiBannerControlsContainer.a((MultiBannerControlsContainer) obj, view, i12, i13, i14, i15, i16, i17, i18, i19);
                break;
            case 5:
                com.avito.android.loyalty.ui.quality_service.items.grade_info.advice.a aVar2 = (com.avito.android.loyalty.ui.quality_service.items.grade_info.advice.a) obj;
                TextView textView = aVar2.f183883f;
                int lineCount = textView.getLayout().getLineCount();
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                ConstraintLayout constraintLayout = aVar2.f183880c;
                dVar.g(constraintLayout);
                int id2 = (lineCount == 1 ? aVar2.f183881d : aVar2.f183882e).getId();
                float f12 = lineCount == 1 ? 0.0f : 5.0f;
                dVar.i(textView.getId(), 4, id2, 4);
                dVar.z(textView.getId(), 3, y6.a(f12));
                dVar.c(constraintLayout);
                break;
            default:
                CBRFlaggedInputLayout.m295addView$lambda2$lambda1((CBRFlaggedInputLayout) obj, view, i12, i13, i14, i15, i16, i17, i18, i19);
                break;
        }
    }
}

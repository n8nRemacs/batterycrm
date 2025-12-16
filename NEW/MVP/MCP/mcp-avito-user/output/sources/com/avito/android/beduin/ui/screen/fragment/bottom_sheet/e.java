package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import com.avito.android.tariff_cpt.info.CptInfoV2Fragment;
import com.avito.android.util.D6;
import com.avito.android.util.p6;
import kotlin.G0;
import yC0.InterfaceC50099a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e implements View.OnScrollChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f104185c;

    public /* synthetic */ e(Object obj, int i12) {
        this.f104184b = i12;
        this.f104185c = obj;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i12, int i13, int i14, int i15) {
        Object obj = this.f104185c;
        switch (this.f104184b) {
            case 0:
                if (i13 != i15) {
                    BottomSheetScreenFragment.a aVar = BottomSheetScreenFragment.f104149R0;
                    BottomSheetScreenFragment bottomSheetScreenFragment = (BottomSheetScreenFragment) obj;
                    if (bottomSheetScreenFragment.x5().getCurrentState() == R.id.collapsed) {
                        bottomSheetScreenFragment.x5().w(R.id.expanded);
                        break;
                    }
                }
                break;
            case 1:
                ((HorizontalScrollView) obj).requestLayout();
                break;
            case 2:
                MasterPlanView masterPlanView = (MasterPlanView) obj;
                masterPlanView.f179672i = i12 / (masterPlanView.f179670g - masterPlanView.f179669f);
                Y41.a<G0> aVar2 = masterPlanView.f179677n;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                if (Math.abs(masterPlanView.f179673j - masterPlanView.f179672i) > 0.1f) {
                    masterPlanView.f179673j = masterPlanView.f179672i;
                    Y41.a<G0> aVar3 = masterPlanView.f179678o;
                    if (aVar3 != null) {
                        aVar3.invoke();
                        break;
                    }
                }
                break;
            case 3:
                CptInfoV2Fragment.a aVar4 = CptInfoV2Fragment.f298114A0;
                RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
                CptInfoV2Fragment cptInfoV2Fragment = (CptInfoV2Fragment) obj;
                if (recyclerView != null) {
                    p6 p6Var = new p6(recyclerView);
                    while (p6Var.hasNext()) {
                        if (((View) p6Var.next()).getId() == R.id.cpt_info_header_item_container) {
                            cptInfoV2Fragment.q5().accept(new InterfaceC50099a.e(true));
                            break;
                        }
                    }
                }
                cptInfoV2Fragment.q5().accept(new InterfaceC50099a.e(false));
                break;
            default:
                nq.c cVar = (nq.c) obj;
                int bottom = cVar.f419179q.getBottom();
                FrameLayout frameLayout = cVar.f419180r;
                if (i13 >= bottom) {
                    D6.n(frameLayout, 32L);
                    break;
                } else {
                    D6.o(frameLayout, 32L);
                    break;
                }
        }
    }
}

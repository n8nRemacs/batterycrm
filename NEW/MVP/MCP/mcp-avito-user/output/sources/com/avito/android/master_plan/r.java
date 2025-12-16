package com.avito.android.master_plan;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.master_plan.mvi.entity.LoadingState;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vY.InterfaceC49282a;

/* compiled from: ScreenView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/r;", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanView$a;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r implements MasterPlanView.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f186095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f186096c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f186097d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final MasterPlanActivity f186098e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f186099f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final MasterPlanView f186100g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f186101h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f186102i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f186103j;

    /* renamed from: k, reason: collision with root package name */
    public final int f186104k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f186105l;

    /* compiled from: ScreenView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LoadingState loadingState = LoadingState.f186068b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LoadingState loadingState2 = LoadingState.f186068b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public r(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k k kVar, @Y61.k MasterPlanActivity masterPlanActivity) {
        this.f186095b = view;
        this.f186096c = aVar;
        this.f186097d = kVar;
        this.f186098e = masterPlanActivity;
        Context context = view.getContext();
        this.f186099f = context;
        View viewFindViewById = view.findViewById(R.id.master_plan);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.master_plan_view.MasterPlanView");
        }
        this.f186100g = (MasterPlanView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f186101h = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.loading_skeleton);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f186102i = (ShimmerLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.back_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f186103j = (Button) viewFindViewById4;
        this.f186104k = context.getResources().getDimensionPixelSize(R.dimen.master_plan_screen_plan_height);
    }

    @Override // com.avito.android.lib.design.master_plan_view.MasterPlanView.a
    public final void a(@Y61.k MasterPlanPin masterPlanPin, float f12) {
        this.f186098e.a2().accept(new InterfaceC49282a.e(masterPlanPin, f12));
    }
}

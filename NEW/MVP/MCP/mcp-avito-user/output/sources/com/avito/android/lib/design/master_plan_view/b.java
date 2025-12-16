package com.avito.android.lib.design.master_plan_view;

import Y41.l;
import android.view.View;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MasterPlanView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MasterPlanView f179683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MasterPlanView masterPlanView) {
        super(1);
        this.f179683l = masterPlanView;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        MasterPlanPin masterPlanPin;
        MasterPlanView.a aVar;
        View view2 = view;
        MasterPlanView masterPlanView = this.f179683l;
        if (!view2.equals(masterPlanView.f179667d) && (masterPlanPin = (MasterPlanPin) masterPlanView.f179674k.get(view2.getTag())) != null && (aVar = masterPlanView.f179676m) != null) {
            aVar.a(masterPlanPin, masterPlanView.f179672i);
        }
        return G0.f406611a;
    }
}

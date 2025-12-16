package com.avito.android.loyalty.ui.criteria;

import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayActivity;
import iX.InterfaceC41355a;
import kX.InterfaceC42640a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements com.avito.android.loyalty.ui.criteria.items.card.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ui.activity.a f183437b;

    public /* synthetic */ a(com.avito.android.ui.activity.a aVar, int i12) {
        this.f183436a = i12;
        this.f183437b = aVar;
    }

    @Override // com.avito.android.loyalty.ui.criteria.items.card.g
    public final void a(com.avito.android.loyalty.ui.criteria.items.card.a aVar, boolean z12) {
        com.avito.android.ui.activity.a aVar2 = this.f183437b;
        switch (this.f183436a) {
            case 0:
                int i12 = CriteriaActivity.f183403x;
                ((j) ((CriteriaActivity) aVar2).f183405n.getValue()).accept(new InterfaceC41355a.C11379a(aVar, z12));
                break;
            default:
                int i13 = CriteriaGrayActivity.f183562w;
                ((CriteriaGrayActivity) aVar2).a2().accept(new InterfaceC42640a.C11618a(aVar, z12));
                break;
        }
    }
}

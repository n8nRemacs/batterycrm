package com.avito.android.category.di;

import Oi0.C14699c;
import On.C14714b;
import Rn.C15061b;
import android.os.Bundle;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.Metadata;
import kotlin.Q;
import rn0.InterfaceC47690b;

/* compiled from: CategoryWidgetKonveyorItemMappingModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/di/m;", "LWQ/d;", "Lcom/avito/android/category/widget/e;", "Lcom/avito/android/category/widget/c;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements WQ.d<com.avito.android.category.widget.e, com.avito.android.category.widget.c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rn.f f116552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ On.f f116553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C15061b f116554c;

    public m(Rn.f fVar, On.f fVar2, C14714b c14714b, C15061b c15061b) {
        this.f116552a = fVar;
        this.f116553b = fVar2;
        this.f116554c = c15061b;
    }

    @Override // WQ.d
    @Y61.k
    public final Q<com.avito.android.category.widget.e, com.avito.android.category.widget.c> a(@Y61.k WQ.h hVar) throws BlueprintCollisionException {
        h31.e<InterfaceC47690b> eVarB0 = hVar.b0();
        Bundle f111006e = hVar.getF111006e();
        Bundle bundle = f111006e != null ? f111006e.getBundle("category_widget_item_state") : null;
        Rn.f fVar = this.f116552a;
        com.avito.android.category.widget.f fVar2 = new com.avito.android.category.widget.f(bundle, eVarB0, fVar.f14618a, fVar.f14619b);
        com.avito.android.category.element.f fVar3 = new com.avito.android.category.element.f(new com.avito.android.category.element.j(fVar2, this.f116553b.f12514a));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar3);
        com.avito.konveyor.a aVarA = c10493a.a();
        C14699c c14699c = new C14699c(aVarA);
        C15061b c15061b = this.f116554c;
        return new Q<>(fVar2, new com.avito.android.category.widget.d(fVar2, aVarA, c14699c, c15061b.f14616a, c15061b.f14617b, fVar3));
    }
}

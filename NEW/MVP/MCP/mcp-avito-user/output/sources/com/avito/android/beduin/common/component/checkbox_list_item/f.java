package com.avito.android.beduin.common.component.checkbox_list_item;

import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxListItemComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/i;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/checkbox_list_item/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<i, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f100986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f100987m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f100988n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, n nVar, a aVar) {
        super(1);
        this.f100986l = arrayList;
        this.f100987m = nVar;
        this.f100988n = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(i iVar) {
        for (m mVar : this.f100986l) {
            e eVar = new e(this.f100988n);
            CheckboxState checkboxState = mVar.f101002a;
            n nVar = this.f100987m;
            if (checkboxState != null) {
                nVar.f101004b.setState(checkboxState);
            }
            com.avito.android.beduin.common.container.componentsPool.e.a(nVar.f101005c, mVar.f101003b, eVar);
        }
        return G0.f406611a;
    }
}

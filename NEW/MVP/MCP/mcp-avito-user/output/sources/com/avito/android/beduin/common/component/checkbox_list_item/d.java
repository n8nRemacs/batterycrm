package com.avito.android.beduin.common.component.checkbox_list_item;

import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinCheckboxListItemComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/i;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/checkbox_list_item/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<i, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f100983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f100984m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, n nVar) {
        super(1);
        this.f100983l = aVar;
        this.f100984m = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(i iVar) {
        i iVar2 = iVar;
        a aVar = this.f100983l;
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = aVar.f100975e;
        if (beduinCheckboxListItemModel.getPadding() != null) {
            BeduinContainerIndent padding = beduinCheckboxListItemModel.getPadding();
            iVar2.setPadding(0, y6.d(padding.getTopIndent()), y6.d(padding.getRightIndent()), y6.d(padding.getBottomIndent()));
        } else {
            iVar2.setPadding(0, 0, aVar.f395325c, 0);
        }
        BeduinContainerIndent padding2 = beduinCheckboxListItemModel.getPadding();
        D6.f(iVar2.getCheckboxContainer(), padding2 != null ? y6.d(padding2.getLeftIndent()) : aVar.f395324b, 0, 0, 0, 14);
        BeduinCheckboxListItemModel beduinCheckboxListItemModel2 = aVar.f100975e;
        iVar2.setCheckboxPosition(beduinCheckboxListItemModel2.getCheckboxVerticalPosition());
        com.avito.android.beduin.common.container.componentsPool.e.c(this.f100984m.f101005c, beduinCheckboxListItemModel2.getContent().getChildren(), new b(aVar), new c(aVar), 8);
        iVar2.setState(beduinCheckboxListItemModel2.getState());
        return G0.f406611a;
    }
}

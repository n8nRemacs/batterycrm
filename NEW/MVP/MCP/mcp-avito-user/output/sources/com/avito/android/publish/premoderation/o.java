package com.avito.android.publish.premoderation;

import com.avito.android.publish.premoderation.SelectListWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WrongCategoryFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/publish/premoderation/SelectListWidget$a;", "item", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/premoderation/SelectListWidget$a;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o extends N implements Y41.p<SelectListWidget.a, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WrongCategoryFragment f238329l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WrongCategoryFragment wrongCategoryFragment) {
        super(2);
        this.f238329l = wrongCategoryFragment;
    }

    @Override // Y41.p
    public final G0 invoke(SelectListWidget.a aVar, Boolean bool) {
        SelectListWidget.a aVar2 = aVar;
        boolean zBooleanValue = bool.booleanValue();
        s sVar = this.f238329l.f238270f0;
        if (sVar == null) {
            sVar = null;
        }
        if (zBooleanValue) {
            sVar.f238335L.e(aVar2.f238269c, "selected_wizard_id");
            sVar.f238337N.setValue(Boolean.TRUE);
        } else {
            sVar.getClass();
        }
        return G0.f406611a;
    }
}

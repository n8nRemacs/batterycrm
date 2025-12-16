package com.avito.android.beduin.common.component.checkbox;

import Y41.l;
import com.avito.android.beduin.common.component.k;
import com.avito.android.lib.design.toggle.Checkbox;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/toggle/Checkbox;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/toggle/Checkbox;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<Checkbox, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Object> f100935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Checkbox f100936m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<? extends Object> list, Checkbox checkbox) {
        super(1);
        this.f100935l = list;
        this.f100936m = checkbox;
    }

    @Override // Y41.l
    public final G0 invoke(Checkbox checkbox) {
        Object obj = null;
        for (Object obj2 : this.f100935l) {
            if (obj2 instanceof g) {
                obj = obj2;
            }
        }
        g gVar = (g) (obj instanceof g ? obj : null);
        if (gVar != null) {
            Checkbox checkbox2 = this.f100936m;
            k<Boolean> kVar = gVar.f100941b;
            if (kVar != null) {
                Boolean bool = kVar.f101648a;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                checkbox2.setEnabled(zBooleanValue);
                checkbox2.setClickable(zBooleanValue);
            }
            CheckboxState checkboxState = gVar.f100940a;
            if (checkboxState != null) {
                i.a(checkbox2, checkboxState);
            }
        }
        return G0.f406611a;
    }
}

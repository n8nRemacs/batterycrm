package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.lib.design.radio.RadioGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRadioGroupComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<BeduinRadioGroupChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f102199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RadioGroup f102200m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, RadioGroup radioGroup) {
        super(1);
        this.f102199l = eVar;
        this.f102200m = radioGroup;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinRadioGroupChange beduinRadioGroupChange) {
        e eVar = this.f102199l;
        RadioGroup radioGroup = this.f102200m;
        b bVar = new b(beduinRadioGroupChange, eVar, radioGroup);
        eVar.getClass();
        radioGroup.setDeprecatedOnCheckedChangeListener(null);
        bVar.invoke(radioGroup);
        radioGroup.setDeprecatedOnCheckedChangeListener(new Ae0.c(eVar, 29));
        return G0.f406611a;
    }
}

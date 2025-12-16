package com.avito.android.beduin.common.component.input.multi_line;

import Y41.l;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiLineInputComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/Input;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/input/Input;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<Input, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.input.g f101565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f101566m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.beduin.common.component.input.g gVar, g gVar2) {
        super(1);
        this.f101565l = gVar;
        this.f101566m = gVar2;
    }

    @Override // Y41.l
    public final G0 invoke(Input input) {
        Input input2 = input;
        g gVar = this.f101566m;
        Integer maxLength = gVar.f101572g.getMaxLength();
        this.f101565l.f101549c.setMaxLength(maxLength != null ? maxLength.intValue() : Integer.MAX_VALUE);
        MultiLineInputModel multiLineInputModel = gVar.f101572g;
        Input.t(input2, multiLineInputModel.getText(), false, 6);
        input2.setHint(multiLineInputModel.getPlaceholder());
        input2.o(multiLineInputModel.getMaxLinesNumber(), multiLineInputModel.getMinLinesNumber());
        Boolean boolIsEnabled = multiLineInputModel.isEnabled();
        input2.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        return G0.f406611a;
    }
}

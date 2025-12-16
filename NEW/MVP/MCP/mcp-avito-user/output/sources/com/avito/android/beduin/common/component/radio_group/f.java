package com.avito.android.beduin.common.component.radio_group;

import Ui.InterfaceC15523b;
import android.view.View;
import bi.C25654c;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinRadioGroupComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/f;", "Lej/b;", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "Lcom/avito/android/beduin/common/component/h;", "Landroid/view/View;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC40113b<BeduinRadioGroupModel, com.avito.android.beduin.common.component.h<BeduinRadioGroupModel, ? extends View>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f102208a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f102209b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> f102210c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC35201t f102211d;

    @Inject
    public f(@Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar, @Y61.k AbstractC35201t abstractC35201t) {
        this.f102208a = aVar;
        this.f102209b = aVar2;
        this.f102210c = eVar;
        this.f102211d = abstractC35201t;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        BeduinRadioGroupModel beduinRadioGroupModel = (BeduinRadioGroupModel) beduinModel;
        BeduinComponentTheme theme = beduinRadioGroupModel.getTheme();
        BeduinComponentTheme beduinComponentTheme = BeduinComponentTheme.AVITO;
        h31.e<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> eVar2 = this.f102210c;
        if (theme == beduinComponentTheme) {
            return new e(new C25654c(eVar2), eVar, interfaceC15523b, beduinRadioGroupModel, this.f102208a, this.f102209b);
        }
        return new j(new C25654c(eVar2), eVar, interfaceC15523b, beduinRadioGroupModel, this.f102208a, this.f102209b, this.f102211d.E().invoke().booleanValue());
    }
}

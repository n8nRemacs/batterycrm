package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;
import kotlin.Metadata;

/* compiled from: PublishParametersInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.r0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33983r0 extends kotlin.jvm.internal.N implements Y41.l<ParameterSlot, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AccordionSlot f239039l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33983r0(AccordionSlot accordionSlot) {
        super(1);
        this.f239039l = accordionSlot;
    }

    @Override // Y41.l
    public final Boolean invoke(ParameterSlot parameterSlot) {
        return Boolean.valueOf(kotlin.jvm.internal.L.f(parameterSlot.getId(), this.f239039l.getId()));
    }
}

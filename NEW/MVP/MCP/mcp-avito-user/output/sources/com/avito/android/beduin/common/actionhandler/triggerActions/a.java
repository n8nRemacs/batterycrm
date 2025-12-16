package com.avito.android.beduin.common.actionhandler.triggerActions;

import Y41.l;
import com.avito.android.beduin.common.action.BeduinTriggerActionsAction;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinTriggerActionsActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "model", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends N implements l<BeduinModel, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinTriggerActionsAction f100468l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BeduinTriggerActionsAction beduinTriggerActionsAction) {
        super(1);
        this.f100468l = beduinTriggerActionsAction;
    }

    @Override // Y41.l
    public final Boolean invoke(BeduinModel beduinModel) {
        return Boolean.valueOf(L.f(beduinModel.getF100853b(), this.f100468l.getModelId()));
    }
}

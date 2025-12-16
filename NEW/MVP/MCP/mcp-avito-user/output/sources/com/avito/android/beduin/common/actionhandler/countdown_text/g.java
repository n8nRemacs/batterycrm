package com.avito.android.beduin.common.actionhandler.countdown_text;

import Y41.l;
import com.avito.android.beduin.common.action.BeduinApplyCountdownTextAction;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.beduin_shared.model.utils.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import lj.InterfaceC43779a;

/* compiled from: BeduinCountdownTextHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "currentStep", "Lkotlin/G0;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements l<Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f100213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinApplyCountdownTextAction f100214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, BeduinApplyCountdownTextAction beduinApplyCountdownTextAction) {
        super(1);
        this.f100213l = hVar;
        this.f100214m = beduinApplyCountdownTextAction;
    }

    @Override // Y41.l
    public final G0 invoke(Long l12) {
        Long l13 = l12;
        com.avito.android.beduin.common.form.store.b bVar = this.f100213l.f100215a;
        BeduinApplyCountdownTextAction beduinApplyCountdownTextAction = this.f100214m;
        InterfaceC43779a interfaceC43779a = bVar.get(beduinApplyCountdownTextAction.getTargetFormId());
        if (interfaceC43779a != null) {
            j.a(interfaceC43779a, beduinApplyCountdownTextAction.getModelId(), new TextTransform(C43066x.a0(beduinApplyCountdownTextAction.getBaseText(), beduinApplyCountdownTextAction.getReplacementKey(), String.valueOf(beduinApplyCountdownTextAction.getCountdown().getDuration() - l13.longValue()), false)));
        }
        return G0.f406611a;
    }
}

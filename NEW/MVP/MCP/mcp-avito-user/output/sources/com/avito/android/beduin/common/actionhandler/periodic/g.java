package com.avito.android.beduin.common.actionhandler.periodic;

import Y41.l;
import com.avito.android.beduin.common.action.BeduinExecutePeriodicAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinPeriodicActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements l<Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f100353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinExecutePeriodicAction f100354m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BeduinExecutePeriodicAction beduinExecutePeriodicAction, h hVar) {
        super(1);
        this.f100353l = hVar;
        this.f100354m = beduinExecutePeriodicAction;
    }

    @Override // Y41.l
    public final G0 invoke(Long l12) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f100353l.f100355a.get(), this.f100354m.getActions());
        return G0.f406611a;
    }
}

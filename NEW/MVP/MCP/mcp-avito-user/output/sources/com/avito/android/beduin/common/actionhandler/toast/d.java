package com.avito.android.beduin.common.actionhandler.toast;

import com.avito.android.beduin.common.action.BeduinToastAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinToastObserverImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f100423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinToastAction.Button f100424m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, BeduinToastAction.Button button) {
        super(0);
        this.f100423l = fVar;
        this.f100424m = button;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.beduin_shared.model.utils.a.a(this.f100423l.f100427a, this.f100424m.d());
        return G0.f406611a;
    }
}

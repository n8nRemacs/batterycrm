package com.avito.android.beduin_shared.model.utils;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExecuteRequestStates.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUi/f;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(LUi/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.p<BeduinAction, ApiError, G0> f105336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f105337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f105338d;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Y41.p<? super BeduinAction, ? super ApiError, G0> pVar, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        this.f105336b = pVar;
        this.f105337c = aVar;
        this.f105338d = aVar2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Ui.f fVar = (Ui.f) obj;
        P2<BeduinActionsResponse> p22 = fVar.f16555b;
        if (p22 instanceof P2.a) {
            this.f105336b.invoke(fVar.f16554a, ((P2.a) p22).f318719a);
        } else if (p22 instanceof P2.b) {
            this.f105337c.invoke();
        } else if (L.f(p22, P2.c.f318721a)) {
            this.f105338d.invoke();
        }
    }
}

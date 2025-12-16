package com.avito.android.beduin.common;

import Y41.p;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ExecuteRequestStates.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUi/f;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(LUi/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<BeduinAction, ApiError, G0> f103424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f103425c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f103426d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p<? super BeduinAction, ? super ApiError, G0> pVar, Y41.l<? super BeduinActionsResponse, G0> lVar, Y41.a<G0> aVar) {
        this.f103424b = pVar;
        this.f103425c = (N) lVar;
        this.f103426d = (H) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v5, types: [Y41.a, kotlin.jvm.internal.H] */
    @Override // l41.g
    public final void accept(Object obj) {
        Ui.f fVar = (Ui.f) obj;
        P2<BeduinActionsResponse> p22 = fVar.f16555b;
        if (p22 instanceof P2.a) {
            ApiError apiError = ((P2.a) p22).f318719a;
            ((j) this.f103424b).invoke(fVar.f16554a, apiError);
            return;
        }
        if (p22 instanceof P2.b) {
            this.f103425c.invoke(((P2.b) p22).f318720a);
        } else if (L.f(p22, P2.c.f318721a)) {
            this.f103426d.invoke();
        }
    }
}

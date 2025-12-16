package com.avito.android.messenger.conversation.mvi.in_app_calls;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.messenger.conversation.mvi.in_app_calls.a;
import kotlin.G0;
import kotlin.Metadata;
import l41.o;

/* compiled from: ChannelIacInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "iacCanCallResult", "Lkotlin/G0;", "apply", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f191386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.f f191387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeepLink f191388d;

    public e(DeepLink deepLink, a.f fVar, a aVar) {
        this.f191386b = aVar;
        this.f191387c = fVar;
        this.f191388d = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink] */
    @Override // l41.o
    public final Object apply(Object obj) {
        IacCanCallResult iacCanCallResult = (IacCanCallResult) obj;
        boolean z12 = iacCanCallResult instanceof IacCanCallResult.Can;
        a.f fVar = this.f191387c;
        a aVar = this.f191386b;
        if (z12) {
            IacCanCallResult.Can can = (IacCanCallResult.Can) iacCanCallResult;
            DeepLink action = can.getAction();
            if (action == null || (action instanceof NoMatchLink)) {
                IacCallInfo callInfo = can.getCallInfo();
                Boolean bool = fVar.f191372f;
                IacMakeCallLink iacMakeCallLink = new IacMakeCallLink(IacCallInfo.a(callInfo, null, bool != null ? bool.booleanValue() : can.getCallInfo().f166837g, null, null, can.getCallInfo().f166842l, 7135));
                if (!fVar.f191371e) {
                    iacMakeCallLink = new IacLaunchCallAfterCanCallLink(iacMakeCallLink);
                }
                aVar.ne(iacMakeCallLink, null);
            } else {
                aVar.ne(action, null);
            }
        } else {
            a.me(aVar, this.f191388d, fVar.f191370d, iacCanCallResult);
        }
        return G0.f406611a;
    }
}

package com.avito.android.multi_message_send.deeplink;

import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiMessageModalScreenDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f206650l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(0);
        this.f206650l = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MultiMessageModalScreenDeeplink.c.a aVar = MultiMessageModalScreenDeeplink.c.a.f206621b;
        c cVar = this.f206650l;
        cVar.i(aVar, cVar.f206626k, new ChannelsLink(null, null, 3, null));
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_containers;

import Y41.l;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OutgoingMessageRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T1.d f193216l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<h0, G0> f193217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, T1.d dVar) {
        super(0);
        this.f193216l = dVar;
        this.f193217m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        T1.d dVar = this.f193216l;
        MessageDeliveryStatus messageDeliveryStatus = dVar.f189173h;
        if (messageDeliveryStatus == MessageDeliveryStatus.f186166e || messageDeliveryStatus == MessageDeliveryStatus.f186163b) {
            this.f193217m.invoke(new h0.j(dVar.f189168c, dVar.f189180o));
        }
        return G0.f406611a;
    }
}

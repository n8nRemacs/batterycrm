package com.avito.android.messenger.conversation.adapter;

import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OutgoingMessagePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class w extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T1.d f189310l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z.a f189311m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(T1.d dVar, z.a aVar) {
        super(0);
        this.f189310l = dVar;
        this.f189311m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MessageDeliveryStatus messageDeliveryStatus = this.f189310l.f189173h;
        if (messageDeliveryStatus == MessageDeliveryStatus.f186166e || messageDeliveryStatus == MessageDeliveryStatus.f186163b) {
            throw null;
        }
        throw null;
    }
}

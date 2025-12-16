package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VoiceMessageFromUserContentRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x0 extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193467l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193468m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
        super(1);
        this.f193467l = lVar;
        this.f193468m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        this.f193467l.invoke(new h0.v(this.f193468m, num.intValue()));
        return G0.f406611a;
    }
}

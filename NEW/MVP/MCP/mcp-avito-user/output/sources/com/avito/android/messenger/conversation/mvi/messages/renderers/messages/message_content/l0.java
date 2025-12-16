package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VideoMessageFromAvitoContentRenderer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193385m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
        super(0);
        this.f193384l = lVar;
        this.f193385m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        T1.d dVar = this.f193385m;
        this.f193384l.invoke(new h0.i(dVar.f189168c, dVar.f189180o, dVar.f189181p, dVar.f189182q));
        return G0.f406611a;
    }
}

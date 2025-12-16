package com.avito.avcalls.android.rtc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PCSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.rtc.PCSessionImpl", f = "PCSession.kt", i = {0, 1}, l = {152, 153}, m = "createOffer", n = {"this", "localSdp"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f331944q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331945r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f331946s;

    /* renamed from: t, reason: collision with root package name */
    public int f331947t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331946s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331945r = obj;
        this.f331947t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331946s.c(this);
    }
}

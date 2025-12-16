package com.avito.avcalls.rtc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PCSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.rtc.PCSessionImpl", f = "PCSession.kt", i = {0, 1}, l = {170, 171}, m = "createOffer", n = {"this", "localSdp"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f333162q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f333163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f333164s;

    /* renamed from: t, reason: collision with root package name */
    public int f333165t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f333164s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f333163r = obj;
        this.f333165t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f333164s.H(this);
    }
}

package com.avito.avcalls.rtc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PCSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.rtc.PCSessionImpl", f = "PCSession.kt", i = {0, 1, 2}, l = {179, 181, 182}, m = "createAnswer", n = {"this", "this", "localSdp"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f333158q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f333159r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f333160s;

    /* renamed from: t, reason: collision with root package name */
    public int f333161t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f333160s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f333159r = obj;
        this.f333161t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f333160s.G(null, this);
    }
}

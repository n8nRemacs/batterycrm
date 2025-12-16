package com.avito.avcalls.android.rtc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PCSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.rtc.PCSessionImpl", f = "PCSession.kt", i = {0, 1, 2}, l = {163, 165, 166}, m = "createAnswer", n = {"this", "this", "localSdp"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f331940q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331941r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f331942s;

    /* renamed from: t, reason: collision with root package name */
    public int f331943t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331942s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331941r = obj;
        this.f331943t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331942s.b(null, this);
    }
}

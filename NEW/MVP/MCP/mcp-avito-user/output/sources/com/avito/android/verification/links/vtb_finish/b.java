package com.avito.android.verification.links.vtb_finish;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationVTBFinishLinkAsyncHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.links.vtb_finish.VerificationVTBFinishLinkAsyncHandler", f = "VerificationVTBFinishLinkAsyncHandler.kt", i = {0}, l = {60}, m = "handleSuccess", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f324754q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f324755r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f324756s;

    /* renamed from: t, reason: collision with root package name */
    public int f324757t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f324756s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f324755r = obj;
        this.f324757t |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = a.f324744p;
        return this.f324756s.o(null, this);
    }
}

package com.avito.android.verification.links.start;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationStartLinkAsyncHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.links.start.VerificationStartLinkAsyncHandler", f = "VerificationStartLinkAsyncHandler.kt", i = {0}, l = {31}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f324503q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f324504r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f324505s;

    /* renamed from: t, reason: collision with root package name */
    public int f324506t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f324505s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f324504r = obj;
        this.f324506t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f324505s.o(null, this);
    }
}

package com.avito.android.verification.links.redirect;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationRedirectLinkAsyncHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.links.redirect.VerificationRedirectLinkAsyncHandler", f = "VerificationRedirectLinkAsyncHandler.kt", i = {0, 0}, l = {30}, m = "doHandleSuspend", n = {"this", Constants.DEEPLINK}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f324337q;

    /* renamed from: r, reason: collision with root package name */
    public VerificationRedirectLink f324338r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f324339s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f324340t;

    /* renamed from: u, reason: collision with root package name */
    public int f324341u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f324340t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f324339s = obj;
        this.f324341u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f324340t.o(null, this);
    }
}

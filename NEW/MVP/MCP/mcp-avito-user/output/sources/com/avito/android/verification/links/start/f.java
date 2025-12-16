package com.avito.android.verification.links.start;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationStartLinkInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.links.start.VerificationStartLinkInteractor", f = "VerificationStartLinkInteractor.kt", i = {}, l = {33}, m = "verificationStart", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f324522q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f324523r;

    /* renamed from: s, reason: collision with root package name */
    public int f324524s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f324523r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f324522q = obj;
        this.f324524s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f324523r.a(null, this);
    }
}

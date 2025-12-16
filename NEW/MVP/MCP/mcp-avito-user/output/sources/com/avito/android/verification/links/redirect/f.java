package com.avito.android.verification.links.redirect;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationRedirectLinkInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.verification.links.redirect.VerificationRedirectLinkInteractor", f = "VerificationRedirectLinkInteractor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "redirect", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f324359q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f324360r;

    /* renamed from: s, reason: collision with root package name */
    public int f324361s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f324360r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f324359q = obj;
        this.f324361s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f324360r.a(null, this);
    }
}

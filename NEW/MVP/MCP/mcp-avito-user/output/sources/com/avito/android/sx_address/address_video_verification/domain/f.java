package com.avito.android.sx_address.address_video_verification.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxAddressVideoVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl", f = "SxAddressVideoVerificationInteractor.kt", i = {}, l = {165}, m = "submitVerification", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f292625q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f292626r;

    /* renamed from: s, reason: collision with root package name */
    public int f292627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f292626r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f292625q = obj;
        this.f292627s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f292626r.c(0L, this);
    }
}

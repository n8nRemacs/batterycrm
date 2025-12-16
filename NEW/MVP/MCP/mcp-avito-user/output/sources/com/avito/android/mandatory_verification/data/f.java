package com.avito.android.mandatory_verification.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MandatoryVerificationRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mandatory_verification.data.MandatoryVerificationRepositoryImpl", f = "MandatoryVerificationRepositoryImpl.kt", i = {0}, l = {42}, m = "startVerification", n = {"this"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f184418q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f184420s;

    /* renamed from: t, reason: collision with root package name */
    public int f184421t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f184420s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f184419r = obj;
        this.f184421t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f184420s.d(0L, null, this);
    }
}

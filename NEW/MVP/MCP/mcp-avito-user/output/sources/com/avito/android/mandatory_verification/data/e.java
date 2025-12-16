package com.avito.android.mandatory_verification.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MandatoryVerificationRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mandatory_verification.data.MandatoryVerificationRepositoryImpl", f = "MandatoryVerificationRepositoryImpl.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "getMandatoryVerificationData", n = {"this"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f184414q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184415r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f184416s;

    /* renamed from: t, reason: collision with root package name */
    public int f184417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f184416s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f184415r = obj;
        this.f184417t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f184416s.e(0L, this);
    }
}

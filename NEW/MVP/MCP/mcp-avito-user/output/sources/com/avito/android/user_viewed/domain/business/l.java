package com.avito.android.user_viewed.domain.business;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserViewedRemoteInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_viewed.domain.business.UserViewedRemoteInteractorImpl", f = "UserViewedRemoteInteractor.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "fetch", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f318351q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f318352r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f318353s;

    /* renamed from: t, reason: collision with root package name */
    public int f318354t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f318353s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f318352r = obj;
        this.f318354t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f318353s.a(null, this);
    }
}

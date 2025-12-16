package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AuthSocialsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.authorization.auth.auth_socials.AuthSocialsInteractorImpl", f = "AuthSocialsInteractor.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "getAuthSocials", n = {"this"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f92905q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92906r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f92907s;

    /* renamed from: t, reason: collision with root package name */
    public int f92908t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f92907s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f92906r = obj;
        this.f92908t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f92907s.a(this);
    }
}

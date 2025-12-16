package com.avito.android.profile.user_profile;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserProfileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl", f = "UserProfileInteractor.kt", i = {}, l = {221}, m = "getPhones", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f226170q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f226171r;

    /* renamed from: s, reason: collision with root package name */
    public int f226172s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f226171r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f226170q = obj;
        this.f226172s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f226171r.c(this);
    }
}

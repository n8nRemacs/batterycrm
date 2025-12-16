package com.avito.android.profile.user_profile;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserProfileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl", f = "UserProfileInteractor.kt", i = {0}, l = {227, 228}, m = "uploadAvatar", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f226552q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226553r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f226554s;

    /* renamed from: t, reason: collision with root package name */
    public int f226555t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f226554s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f226553r = obj;
        this.f226555t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f226554s.d(null, this);
    }
}

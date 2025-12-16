package com.avito.android.extended_profile;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSubscriptionInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileSubscriptionInteractorImpl", f = "ExtendedProfileSubscriptionInteractor.kt", i = {}, l = {142, 153}, m = "changeSubscribeInternal", n = {}, s = {})
/* loaded from: classes13.dex */
final class g0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f149997q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f0 f149998r;

    /* renamed from: s, reason: collision with root package name */
    public int f149999s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f149998r = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f149997q = obj;
        this.f149999s |= BeduinInputModel.MIN_TEXT_VERSION;
        return f0.e(this.f149998r, false, null, null, this);
    }
}

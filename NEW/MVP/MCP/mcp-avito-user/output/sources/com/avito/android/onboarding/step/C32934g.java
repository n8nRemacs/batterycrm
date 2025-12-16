package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingFavoritesStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingFavoritesStepInteractorImpl", f = "BxOnboardingFavoritesStepInteractorImpl.kt", i = {0}, l = {43}, m = "fetch", n = {"this"}, s = {"L$0"})
/* renamed from: com.avito.android.onboarding.step.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32934g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C32933f f209207q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209208r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32933f f209209s;

    /* renamed from: t, reason: collision with root package name */
    public int f209210t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32934g(C32933f c32933f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209209s = c32933f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209208r = obj;
        this.f209210t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f209209s.b(this);
    }
}

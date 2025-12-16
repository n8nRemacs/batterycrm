package com.avito.android.replace_main.exit_onboarding;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReplaceMainExitOnboardingInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboardingInteractorImpl", f = "ReplaceMainExitOnboardingInteractorImpl.kt", i = {}, l = {38}, m = "getReplaceMainExitOnboarding", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f254507q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f254508r;

    /* renamed from: s, reason: collision with root package name */
    public int f254509s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f254508r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f254507q = obj;
        this.f254509s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f254508r.b(this);
    }
}

package com.avito.android.bxcontent.business360;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxContentReplaceMainExitOnboardingInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.bxcontent.business360.BxContentReplaceMainExitOnboardingInteractor", f = "BxContentReplaceMainExitOnboardingInteractor.kt", i = {0, 1}, l = {15, 17}, m = "getOnboardingToShow", n = {"this", "onboarding"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f109630q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f109631r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f109632s;

    /* renamed from: t, reason: collision with root package name */
    public int f109633t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f109632s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f109631r = obj;
        this.f109633t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f109632s.a(this);
    }
}

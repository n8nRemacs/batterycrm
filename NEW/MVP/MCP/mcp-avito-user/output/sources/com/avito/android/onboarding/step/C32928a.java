package com.avito.android.onboarding.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxOnboardingAskNotificationStepInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.step.BxOnboardingAskNotificationStepInteractorImpl", f = "BxOnboardingAskNotificationStepInteractorImpl.kt", i = {0}, l = {22, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "fetch", n = {"this"}, s = {"L$0"})
/* renamed from: com.avito.android.onboarding.step.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32928a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C32929b f209189q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209190r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32929b f209191s;

    /* renamed from: t, reason: collision with root package name */
    public int f209192t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32928a(C32929b c32929b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209191s = c32929b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209190r = obj;
        this.f209192t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f209191s.b(this);
    }
}

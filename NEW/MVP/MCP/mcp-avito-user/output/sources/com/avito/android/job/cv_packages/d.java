package com.avito.android.job.cv_packages;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.job.cv_packages.mvi.w;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CvPackagesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.job.cv_packages.CvPackagesInteractorImpl", f = "CvPackagesInteractor.kt", i = {}, l = {41}, m = "requestCvPackages", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public w f174341q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174342r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f174343s;

    /* renamed from: t, reason: collision with root package name */
    public int f174344t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f174343s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f174342r = obj;
        this.f174344t |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.b(this.f174343s, null, this);
    }
}

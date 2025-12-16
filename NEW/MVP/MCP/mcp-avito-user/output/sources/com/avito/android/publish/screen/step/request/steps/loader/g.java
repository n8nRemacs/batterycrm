package com.avito.android.publish.screen.step.request.steps.loader;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StepsRequestLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl", f = "StepsRequestLoader.kt", i = {}, l = {76}, m = "loadPublishSteps", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f242038q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f242039r;

    /* renamed from: s, reason: collision with root package name */
    public int f242040s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242039r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f242038q = obj;
        this.f242040s |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.c(this.f242039r, this);
    }
}

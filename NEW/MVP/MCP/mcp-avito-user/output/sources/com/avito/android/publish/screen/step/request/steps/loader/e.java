package com.avito.android.publish.screen.step.request.steps.loader;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StepsRequestLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl", f = "StepsRequestLoader.kt", i = {}, l = {99}, m = "loadEditSteps", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f242032q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f242033r;

    /* renamed from: s, reason: collision with root package name */
    public int f242034s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242033r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f242032q = obj;
        this.f242034s |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.b(this.f242033r, null, this);
    }
}

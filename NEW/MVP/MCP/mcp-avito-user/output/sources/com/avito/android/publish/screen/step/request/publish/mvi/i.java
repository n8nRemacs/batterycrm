package com.avito.android.publish.screen.step.request.publish.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PublishRequestActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor", f = "PublishRequestActor.kt", i = {0}, l = {95}, m = "updatePhotoParameter", n = {"photo"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public PhotoParameter f241917q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f241918r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f241919s;

    /* renamed from: t, reason: collision with root package name */
    public int f241920t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f241919s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f241918r = obj;
        this.f241920t |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.d(this.f241919s, this);
    }
}

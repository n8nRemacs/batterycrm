package com.avito.android.publish.screen.step.request.publish.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishRequestActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor", f = "PublishRequestActor.kt", i = {0, 0, 0, 1, 1}, l = {105, 113, 114}, m = "publish", n = {"this", "collector", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "this", "collector"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f241911q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f241912r;

    /* renamed from: s, reason: collision with root package name */
    public CategoryParameters f241913s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f241914t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f241915u;

    /* renamed from: v, reason: collision with root package name */
    public int f241916v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f241915u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f241914t = obj;
        this.f241916v |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.c(this.f241915u, null, this);
    }
}

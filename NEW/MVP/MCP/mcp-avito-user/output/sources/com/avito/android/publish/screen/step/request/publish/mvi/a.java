package com.avito.android.publish.screen.step.request.publish.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.PretendResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishRequestActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor", f = "PublishRequestActor.kt", i = {0, 0}, l = {150, 156}, m = "handlePretendError", n = {"result", "collector"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public PretendResult f241892q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f241893r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f241894s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f241895t;

    /* renamed from: u, reason: collision with root package name */
    public int f241896u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f241895t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f241894s = obj;
        this.f241896u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f241895t.e(null, null, this);
    }
}

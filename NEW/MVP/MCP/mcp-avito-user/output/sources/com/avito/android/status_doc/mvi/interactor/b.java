package com.avito.android.status_doc.mvi.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigStatusDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.status_doc.mvi.interactor.GigStatusDocInteractorImpl", f = "GigStatusDocInteractor.kt", i = {0, 0, 1, 1}, l = {41, 42, 60}, m = "loadScreenInfo", n = {"this", MessageBody.SystemMessageBody.Platform.FLOW, "this", MessageBody.SystemMessageBody.Platform.FLOW}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f284918q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f284919r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f284920s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f284921t;

    /* renamed from: u, reason: collision with root package name */
    public int f284922u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f284921t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f284920s = obj;
        this.f284922u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f284921t.a(null, this);
    }
}

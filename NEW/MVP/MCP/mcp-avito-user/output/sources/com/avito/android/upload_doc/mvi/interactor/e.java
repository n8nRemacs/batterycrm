package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigUploadDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.interactor.GigUploadDocInteractorImpl", f = "GigUploadDocInteractor.kt", i = {0, 0, 1, 1}, l = {75, 76, 100}, m = "loadScreenInfo", n = {"this", MessageBody.SystemMessageBody.Platform.FLOW, "this", MessageBody.SystemMessageBody.Platform.FLOW}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f306894q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f306895r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f306896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f306897t;

    /* renamed from: u, reason: collision with root package name */
    public int f306898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f306897t = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f306896s = obj;
        this.f306898u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f306897t.a(null, this);
    }
}

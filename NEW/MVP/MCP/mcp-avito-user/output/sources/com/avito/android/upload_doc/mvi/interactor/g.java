package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigUploadDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.interactor.GigUploadDocInteractorImpl", f = "GigUploadDocInteractor.kt", i = {0, 0, 0, 2, 2}, l = {118, 121, 127, 139}, m = "sendDocuments", n = {"this", MessageBody.SystemMessageBody.Platform.FLOW, "documents", "this", MessageBody.SystemMessageBody.Platform.FLOW}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f306902q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f306903r;

    /* renamed from: s, reason: collision with root package name */
    public List f306904s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f306905t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f306906u;

    /* renamed from: v, reason: collision with root package name */
    public int f306907v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f306906u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f306905t = obj;
        this.f306907v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f306906u.d(null, null, this);
    }
}

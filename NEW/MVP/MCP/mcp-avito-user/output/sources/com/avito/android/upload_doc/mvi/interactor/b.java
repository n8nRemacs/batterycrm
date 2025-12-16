package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GigUploadDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.interactor.GigUploadDocInteractorImpl", f = "GigUploadDocInteractor.kt", i = {0, 0, 0, 1, 1}, l = {214, JfifUtil.MARKER_RST7, 221}, m = "createImage", n = {"this", MessageBody.SystemMessageBody.Platform.FLOW, "document", MessageBody.SystemMessageBody.Platform.FLOW, "document"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f306881q;

    /* renamed from: r, reason: collision with root package name */
    public Object f306882r;

    /* renamed from: s, reason: collision with root package name */
    public GigUploadDocDocumentItem f306883s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f306884t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f306885u;

    /* renamed from: v, reason: collision with root package name */
    public int f306886v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f306885u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f306884t = obj;
        this.f306886v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f306885u.g(null, null, this);
    }
}

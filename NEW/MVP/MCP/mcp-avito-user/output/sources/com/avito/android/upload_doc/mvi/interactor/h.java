package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.HttpUrl;

/* compiled from: GigUploadDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.interactor.GigUploadDocInteractorImpl", f = "GigUploadDocInteractor.kt", i = {0, 0, 0, 0, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4}, l = {148, 155, 160, 168, 181, 189}, m = "uploadDocument", n = {"this", MessageBody.SystemMessageBody.Platform.FLOW, "document", "imageUri", "this", MessageBody.SystemMessageBody.Platform.FLOW, "document", "imageId", "httpUrl", "this", MessageBody.SystemMessageBody.Platform.FLOW, "document", "imageId", "this", MessageBody.SystemMessageBody.Platform.FLOW, "document"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f306908q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f306909r;

    /* renamed from: s, reason: collision with root package name */
    public GigUploadDocDocumentItem f306910s;

    /* renamed from: t, reason: collision with root package name */
    public Comparable f306911t;

    /* renamed from: u, reason: collision with root package name */
    public HttpUrl f306912u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f306913v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f306914w;

    /* renamed from: x, reason: collision with root package name */
    public int f306915x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f306914w = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f306913v = obj;
        this.f306915x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f306914w.c(null, null, this);
    }
}

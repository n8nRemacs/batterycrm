package com.avito.android.mortgage.document_upload.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FilesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor", f = "FilesInteractor.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {171, 172, 176, 180}, m = "deleteFile", n = {"this", "$this$deleteFile", "fileId", "packageId", "documentId", "unSuccessCallback", "$this$deleteFile", "fileId", "unSuccessCallback"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* loaded from: classes15.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f199335q;

    /* renamed from: r, reason: collision with root package name */
    public Object f199336r;

    /* renamed from: s, reason: collision with root package name */
    public Object f199337s;

    /* renamed from: t, reason: collision with root package name */
    public String f199338t;

    /* renamed from: u, reason: collision with root package name */
    public String f199339u;

    /* renamed from: v, reason: collision with root package name */
    public Y41.a f199340v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f199341w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f199342x;

    /* renamed from: y, reason: collision with root package name */
    public int f199343y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f199342x = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f199341w = obj;
        this.f199343y |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = f.f199229g;
        return this.f199342x.a(null, null, null, null, null, this);
    }
}

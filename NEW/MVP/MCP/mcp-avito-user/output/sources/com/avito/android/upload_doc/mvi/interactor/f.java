package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GigUploadDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.interactor.GigUploadDocInteractorImpl", f = "GigUploadDocInteractor.kt", i = {}, l = {204}, m = "removeDocument", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f306899q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f306900r;

    /* renamed from: s, reason: collision with root package name */
    public int f306901s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f306900r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f306899q = obj;
        this.f306901s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f306900r.b(null, this);
    }
}

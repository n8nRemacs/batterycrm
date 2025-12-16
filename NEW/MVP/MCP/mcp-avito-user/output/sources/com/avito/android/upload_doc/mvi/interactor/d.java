package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GigUploadDocInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.interactor.GigUploadDocInteractorImpl", f = "GigUploadDocInteractor.kt", i = {}, l = {104}, m = "getImageUri", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f306891q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f306892r;

    /* renamed from: s, reason: collision with root package name */
    public int f306893s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f306892r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f306891q = obj;
        this.f306893s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f306892r.f(null, this);
    }
}

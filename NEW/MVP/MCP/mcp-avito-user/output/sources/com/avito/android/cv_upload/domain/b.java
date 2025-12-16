package com.avito.android.cv_upload.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CvUploadInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cv_upload.domain.CvUploadInteractor", f = "CvUploadInteractor.kt", i = {}, l = {20}, m = "cvUploading", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.cv_upload.domain.mapper.c f131656q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131657r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f131658s;

    /* renamed from: t, reason: collision with root package name */
    public int f131659t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f131658s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f131657r = obj;
        this.f131659t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f131658s.b(null, this);
    }
}

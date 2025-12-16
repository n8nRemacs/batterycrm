package com.avito.android.cv_upload.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CvUploadInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cv_upload.domain.CvUploadInteractor", f = "CvUploadInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "cvParsing", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.cv_upload.domain.mapper.a f131652q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131653r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f131654s;

    /* renamed from: t, reason: collision with root package name */
    public int f131655t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f131654s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f131653r = obj;
        this.f131655t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f131654s.a(null, this);
    }
}

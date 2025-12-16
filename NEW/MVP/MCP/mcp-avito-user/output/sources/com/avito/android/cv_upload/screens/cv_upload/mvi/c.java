package com.avito.android.cv_upload.screens.cv_upload.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CvUploadActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.cv_upload.screens.cv_upload.mvi.CvUploadActor", f = "CvUploadActor.kt", i = {0, 0, 1, 1}, l = {83, 84}, m = "handleSuccessUploading", n = {"this", "cvUploadResponse", "this", "cvUploadResponse"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f131738q;

    /* renamed from: r, reason: collision with root package name */
    public It.d f131739r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f131740s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f131741t;

    /* renamed from: u, reason: collision with root package name */
    public int f131742u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f131741t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f131740s = obj;
        this.f131742u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f131741t.d(null, this);
    }
}

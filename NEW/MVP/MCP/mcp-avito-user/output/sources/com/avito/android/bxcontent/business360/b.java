package com.avito.android.bxcontent.business360;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.BxContentBusiness360;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Business360ToastInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.bxcontent.business360.Business360ToastInteractor", f = "Business360ToastInteractor.kt", i = {0, 0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "shouldShowToast", n = {"this", "toast", "toast"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f109619q;

    /* renamed from: r, reason: collision with root package name */
    public BxContentBusiness360.Toast f109620r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f109621s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f109622t;

    /* renamed from: u, reason: collision with root package name */
    public int f109623u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f109622t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f109621s = obj;
        this.f109623u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f109622t.a(null, this);
    }
}

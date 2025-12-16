package com.avito.android.advert.business360;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertDetailsBusiness360;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdvertDetailsBusiness360ToastPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.business360.AdvertDetailsBusiness360ToastPresenter", f = "AdvertDetailsBusiness360ToastPresenter.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "shouldShowToast", n = {"this", "toast", "keyShownCount", "this", "toast", "keyShownCount", "this", "toast", "keyShownCount"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes10.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f68821q;

    /* renamed from: r, reason: collision with root package name */
    public AdvertDetailsBusiness360.Toast f68822r;

    /* renamed from: s, reason: collision with root package name */
    public String f68823s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f68824t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f68825u;

    /* renamed from: v, reason: collision with root package name */
    public int f68826v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68825u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f68824t = obj;
        this.f68826v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f68825u.a(null, this);
    }
}

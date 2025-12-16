package com.avito.android.notification;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetAskNotificationCheckResultInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification.GetAskNotificationCheckResultInteractorImpl", f = "GetAskNotificationCheckResultInteractor.kt", i = {0, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 33}, m = "checkResult", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f207447q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207448r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f207449s;

    /* renamed from: t, reason: collision with root package name */
    public int f207450t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207449s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207448r = obj;
        this.f207450t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207449s.b(this);
    }
}

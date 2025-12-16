package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacNotificationManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotificationManagerImpl", f = "IacNotificationManager.kt", i = {0, 0, 0, 0, 0}, l = {123}, m = "ensureNotificationWasDisplayed", n = {"this", FailedBinderCallBack.CALLER_ID, "notificationTag", "delayMillis", "finishTimestamp"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1"})
/* loaded from: classes14.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f166116q;

    /* renamed from: r, reason: collision with root package name */
    public String f166117r;

    /* renamed from: s, reason: collision with root package name */
    public String f166118s;

    /* renamed from: t, reason: collision with root package name */
    public long f166119t;

    /* renamed from: u, reason: collision with root package name */
    public long f166120u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f166121v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f166122w;

    /* renamed from: x, reason: collision with root package name */
    public int f166123x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f166122w = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f166121v = obj;
        this.f166123x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f166122w.a(null, this);
    }
}

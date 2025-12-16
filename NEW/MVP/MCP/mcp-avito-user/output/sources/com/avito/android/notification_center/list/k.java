package com.avito.android.notification_center.list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationCenterListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification_center.list.NotificationCenterListInteractorImpl", f = "NotificationCenterListInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "getNotifications", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f207636q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207637r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f207638s;

    /* renamed from: t, reason: collision with root package name */
    public int f207639t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207638s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207637r = obj;
        this.f207639t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207638s.b(this);
    }
}

package com.avito.android.notification_center.counter;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationCenterCounter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification_center.counter.NotificationCenterCounterImpl", f = "NotificationCenterCounter.kt", i = {}, l = {89, 91}, m = "getNotificationCount", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f207486q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f207487r;

    /* renamed from: s, reason: collision with root package name */
    public int f207488s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207487r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207486q = obj;
        this.f207488s |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f207487r, this);
    }
}

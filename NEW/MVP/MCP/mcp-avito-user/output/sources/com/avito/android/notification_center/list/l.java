package com.avito.android.notification_center.list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationCenterListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification_center.list.NotificationCenterListInteractorImpl", f = "NotificationCenterListInteractor.kt", i = {0}, l = {44}, m = "getNotifications", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f207640q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207641r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f207642s;

    /* renamed from: t, reason: collision with root package name */
    public int f207643t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207642s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207641r = obj;
        this.f207643t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207642s.a(null, this);
    }
}

package com.avito.android.notification;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AskNotificationProblemsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notification.AskNotificationProblemsInteractorImpl", f = "AskNotificationProblemsInteractor.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "getProfileNotificationState", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f207419q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f207420r;

    /* renamed from: s, reason: collision with root package name */
    public int f207421s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207420r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f207419q = obj;
        this.f207421s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207420r.d(this);
    }
}

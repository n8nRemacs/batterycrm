package com.avito.android.notifications_settings.profile;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationsSettingsMessengerHelperImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.profile.NotificationsSettingsMessengerHelperImpl", f = "NotificationsSettingsMessengerHelperImpl.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "getNotificationsSettings", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f208019q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f208020r;

    /* renamed from: s, reason: collision with root package name */
    public int f208021s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208020r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f208019q = obj;
        this.f208021s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208020r.c(this);
    }
}

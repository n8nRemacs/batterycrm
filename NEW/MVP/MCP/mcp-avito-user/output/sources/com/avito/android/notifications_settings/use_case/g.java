package com.avito.android.notifications_settings.use_case;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetNotificationSettingsUseCaseImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.use_case.GetDisabledPushNotificationSettingsUseCaseImpl", f = "GetNotificationSettingsUseCaseImpl.kt", i = {}, l = {20}, m = "invoke", n = {}, s = {})
/* loaded from: classes15.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f208199q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f208200r;

    /* renamed from: s, reason: collision with root package name */
    public int f208201s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208200r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f208199q = obj;
        this.f208201s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208200r.a(this);
    }
}

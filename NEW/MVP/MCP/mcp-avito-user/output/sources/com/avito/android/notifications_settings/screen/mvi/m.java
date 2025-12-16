package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationsSettingsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.screen.mvi.NotificationsSettingsInteractorImpl", f = "NotificationsSettingsInteractor.kt", i = {}, l = {23}, m = "loadSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f208154q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f208155r;

    /* renamed from: s, reason: collision with root package name */
    public int f208156s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208155r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f208154q = obj;
        this.f208156s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208155r.b(this);
    }
}

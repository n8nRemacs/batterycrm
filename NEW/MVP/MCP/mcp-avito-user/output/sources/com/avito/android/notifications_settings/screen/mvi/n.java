package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationsSettingsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.screen.mvi.NotificationsSettingsInteractorImpl", f = "NotificationsSettingsInteractor.kt", i = {}, l = {35}, m = "save", n = {}, s = {})
/* loaded from: classes15.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f208157q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f208158r;

    /* renamed from: s, reason: collision with root package name */
    public int f208159s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208158r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f208157q = obj;
        this.f208159s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208158r.a(null, null, this, false);
    }
}

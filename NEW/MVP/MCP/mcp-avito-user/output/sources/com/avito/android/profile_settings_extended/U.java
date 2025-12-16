package com.avito.android.profile_settings_extended;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSettingsToggleInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsToggleInteractorImpl", f = "ExtendedProfileSettingsToggleInteractor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "updateRegularToggle", n = {}, s = {})
/* loaded from: classes16.dex */
final class U extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f229076q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V f229077r;

    /* renamed from: s, reason: collision with root package name */
    public int f229078s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f229077r = v12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f229076q = obj;
        this.f229078s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f229077r.a(null, null, this, false);
    }
}

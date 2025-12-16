package com.avito.android.navigation_config.service;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NavigationConfigService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.navigation_config.service.NavigationConfigServiceImpl", f = "NavigationConfigService.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "getNavigationConfig", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f207244q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f207245r;

    /* renamed from: s, reason: collision with root package name */
    public int f207246s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207245r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f207244q = obj;
        this.f207246s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207245r.a(this);
    }
}

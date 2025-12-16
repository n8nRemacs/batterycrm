package com.avito.android.navigation_config.service;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NavigationConfigService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.navigation_config.service.NavigationConfigServiceImpl", f = "NavigationConfigService.kt", i = {}, l = {42}, m = "updateStartSpace", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f207247q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f207248r;

    /* renamed from: s, reason: collision with root package name */
    public int f207249s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f207248r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f207247q = obj;
        this.f207249s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f207248r.b(null, this);
    }
}

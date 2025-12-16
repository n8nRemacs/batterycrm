package com.avito.android.extended_profile.location;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileLocationProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile.location.ExtendedProfileLocationProviderImpl", f = "ExtendedProfileLocationProvider.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "getLocation", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150026q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f150027r;

    /* renamed from: s, reason: collision with root package name */
    public int f150028s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f150027r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f150026q = obj;
        this.f150028s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f150027r.a(this);
    }
}

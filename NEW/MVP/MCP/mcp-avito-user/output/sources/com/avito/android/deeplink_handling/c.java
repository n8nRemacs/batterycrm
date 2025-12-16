package com.avito.android.deeplink_handling;

import android.os.Bundle;
import com.avito.android.deeplink.JobApplyCreateLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: JobApplyCreateDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f134719l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f134720m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JobApplyCreateLink f134721n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Bundle bundle, JobApplyCreateLink jobApplyCreateLink) {
        super(0);
        this.f134719l = dVar;
        this.f134720m = bundle;
        this.f134721n = jobApplyCreateLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f134719l;
        dVar.f134724h.g(null, true);
        C43259k.d(dVar.f134727k, null, null, new b(dVar, this.f134720m, this.f134721n, null), 3);
        return G0.f406611a;
    }
}

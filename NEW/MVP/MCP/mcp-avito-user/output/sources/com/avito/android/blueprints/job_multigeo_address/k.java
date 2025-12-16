package com.avito.android.blueprints.job_multigeo_address;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.events.j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobMultiGeoPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/job_multigeo_address/k;", "Lcom/avito/android/blueprints/job_multigeo_address/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f106011b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f106012c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q f106013d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106014e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106015f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<j.a> f106016g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f106017h;

    /* renamed from: i, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<String> f106018i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f106019j;

    @Inject
    public k(@Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12, @Y61.k q qVar) {
        this.f106011b = interfaceC35807h4;
        this.f106012c = q12;
        this.f106013d = qVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106014e = cVar;
        this.f106015f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<j.a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106016g = cVar2;
        this.f106017h = cVar2;
        com.jakewharton.rxrelay3.c<String> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f106018i = cVar3;
        this.f106019j = cVar3;
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.e
    @Y61.k
    /* renamed from: I3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF106019j() {
        return this.f106019j;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r17, TV0.a r18, int r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.blueprints.job_multigeo_address.k.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.e
    @Y61.k
    /* renamed from: o2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF106017h() {
        return this.f106017h;
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.e
    @Y61.k
    public final z<DeepLink> y() {
        return this.f106015f;
    }
}

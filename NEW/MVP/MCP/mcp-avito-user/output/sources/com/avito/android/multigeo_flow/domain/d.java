package com.avito.android.multigeo_flow.domain;

import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: JobMultiGeoInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/domain/d;", "Lcom/avito/android/multigeo_flow/domain/b;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<M20.a> f206884a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f206885b;

    @Inject
    public d(@k R0 r02, @k h31.e eVar) {
        this.f206884a = eVar;
        this.f206885b = r02;
    }

    @Override // com.avito.android.multigeo_flow.domain.b
    @l
    public final Object a(@k String str, int i12, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f206885b.a(), new c(this, str, i12, null), suspendLambda);
    }
}

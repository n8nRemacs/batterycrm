package com.avito.avcalls.android.utils.coroutines;

import Y61.k;
import com.avito.avcalls.android.a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.M;
import kotlinx.coroutines.N;
import kotlinx.coroutines.S;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.t1;

/* compiled from: AvCallsScope.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/coroutines/c;", "Lkotlinx/coroutines/T;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements T {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC43129d1 f332436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a.d f332437c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CoroutineContext f332438d;

    public c(@k M m12, @k AbstractC43129d1 abstractC43129d1, @k a.d dVar) {
        this.f332436b = abstractC43129d1;
        this.f332437c = dVar;
        this.f332438d = CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), m12).plus(new S("avcalls_coroutine")).plus(new b(N.f410714t2, this));
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF333661d() {
        return this.f332438d;
    }
}

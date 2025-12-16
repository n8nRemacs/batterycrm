package tK0;

import Y61.k;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.properties.h;
import kotlin.reflect.n;
import kotlinx.coroutines.N0;

/* compiled from: Jobs.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"LtK0/a;", "Lkotlin/properties/h;", "", "Lkotlinx/coroutines/N0;", "_common_coroutines_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48567a implements h<Object, N0> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AtomicReference<N0> f439227b = new AtomicReference<>();

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, n nVar) {
        return this.f439227b.get();
    }

    @Override // kotlin.properties.h
    public final void setValue(Object obj, n nVar, N0 n02) {
        N0 andSet = this.f439227b.getAndSet(n02);
        if (andSet != null) {
            andSet.c(null);
        }
    }
}

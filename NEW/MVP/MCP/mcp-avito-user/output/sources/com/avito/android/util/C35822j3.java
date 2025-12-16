package com.avito.android.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Initializable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/j3;", "Lcom/avito/android/util/J5;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.j3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35822j3 extends J5 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<InterfaceC35881r2> f318906c;

    public C35822j3(@Y61.k InterfaceC35881r2... interfaceC35881r2Arr) {
        this.f318906c = C42745f0.U(Arrays.copyOf(interfaceC35881r2Arr, interfaceC35881r2Arr.length));
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        Iterator<T> it = this.f318906c.iterator();
        while (it.hasNext()) {
            ((InterfaceC35881r2) it.next()).a();
        }
    }
}

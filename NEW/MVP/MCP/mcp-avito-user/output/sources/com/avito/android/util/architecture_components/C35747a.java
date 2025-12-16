package com.avito.android.util.architecture_components;

import androidx.view.AbstractC22991Y;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeLiveData.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/architecture_components/a;", "T", "Landroidx/lifecycle/Y;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.architecture_components.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35747a<T> extends AbstractC22991Y<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AbstractC22991Y<T>> f318806a;

    public C35747a() {
        throw null;
    }

    public C35747a(@Y61.k AbstractC22991Y<T>... abstractC22991YArr) {
        this.f318806a = C42756l.g0(abstractC22991YArr);
    }

    @Override // androidx.view.AbstractC22991Y
    public final void observe(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k InterfaceC23040h0<? super T> interfaceC23040h0) {
        super.observe(interfaceC22983P, interfaceC23040h0);
        Iterator<T> it = this.f318806a.iterator();
        while (it.hasNext()) {
            ((AbstractC22991Y) it.next()).observe(interfaceC22983P, interfaceC23040h0);
        }
    }

    @Override // androidx.view.AbstractC22991Y
    public final void observeForever(@Y61.k InterfaceC23040h0<? super T> interfaceC23040h0) {
        super.observeForever(interfaceC23040h0);
        throw new IllegalStateException("Do not use observeForever(...) cause it ruins logic of SingleLiveEvent sources. Use observe(...) instead it.");
    }
}

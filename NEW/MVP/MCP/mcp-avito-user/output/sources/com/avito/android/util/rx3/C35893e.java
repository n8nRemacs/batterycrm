package com.avito.android.util.rx3;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CompositeConsumer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/rx3/e;", "", "T", "Ll41/g;", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J41.c
/* renamed from: com.avito.android.util.rx3.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35893e<T> implements l41.g<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public ArrayList f319021b;

    public C35893e() {
        throw null;
    }

    @Override // l41.g
    public final void accept(@Y61.k T t12) {
        Iterator it = this.f319021b.iterator();
        while (it.hasNext()) {
            ((l41.g) it.next()).accept(t12);
        }
    }
}

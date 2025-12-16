package com.avito.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AppFeatures.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/q;", "Lcom/avito/android/p;", "<init>", "()V", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C34157q implements InterfaceC32948p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f246155a = new LinkedHashMap();

    @Override // com.avito.android.InterfaceC32948p
    @Y61.k
    public final List<DE0.a<Object>> a() {
        Collection collectionValues = this.f246155a.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            C42745f0.h(Collections.unmodifiableList(C42745f0.M0(((A0) it.next()).f67174a.values())), arrayList);
        }
        return Collections.unmodifiableList(C42745f0.M0(arrayList));
    }

    @Y61.k
    public final <T extends A0> T b(@Y61.k Class<T> cls) {
        Object obj = this.f246155a.get(cls.getName());
        T tCast = cls.isInstance(obj) ? cls.cast(obj) : null;
        if (tCast != null) {
            return tCast;
        }
        throw new IllegalArgumentException(com.akita.compose.theme.re23.style.C0.f(cls, new StringBuilder("Features provider is not registered for type "), " (see Features class)").toString());
    }
}

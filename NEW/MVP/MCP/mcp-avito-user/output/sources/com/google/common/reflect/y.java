package com.google.common.reflect;

import com.google.common.collect.AbstractC37429w3;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: TypeToken.java */
/* loaded from: classes6.dex */
class y extends AbstractC37429w3<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC37429w3 f360477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f360478c;

    public y(AbstractC37429w3 abstractC37429w3, HashMap map) {
        this.f360477b = abstractC37429w3;
        this.f360478c = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = this.f360478c;
        Object obj3 = map.get(obj);
        Objects.requireNonNull(obj3);
        Object obj4 = map.get(obj2);
        Objects.requireNonNull(obj4);
        return this.f360477b.compare(obj3, obj4);
    }
}

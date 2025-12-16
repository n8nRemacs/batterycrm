package com.google.common.collect;

import com.google.common.collect.K;
import java.util.Map;

/* compiled from: CompactHashMap.java */
/* loaded from: classes6.dex */
class I extends K<Object, Object>.b<Map.Entry<Object, Object>> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K f359384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k12) {
        super(null);
        this.f359384f = k12;
    }

    @Override // com.google.common.collect.K.b
    public final Map.Entry<Object, Object> a(int i12) {
        return new K.d(i12);
    }
}

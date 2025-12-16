package com.google.common.collect;

/* compiled from: CompactHashMap.java */
/* loaded from: classes6.dex */
class H extends K<Object, Object>.b<Object> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K f359345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K k12) {
        super(null);
        this.f359345f = k12;
    }

    @Override // com.google.common.collect.K.b
    @InterfaceC37434x3
    public final Object a(int i12) {
        Object obj = K.f359419k;
        return this.f359345f.t()[i12];
    }
}

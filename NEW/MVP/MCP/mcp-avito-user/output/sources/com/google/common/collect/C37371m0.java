package com.google.common.collect;

import com.google.common.collect.C37365l0;
import com.google.common.collect.C37374m3;

/* compiled from: EnumMultiset.java */
/* renamed from: com.google.common.collect.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37371m0 extends C37374m3.a<Enum<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f359828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37365l0.b f359829c;

    public C37371m0(C37365l0.b bVar, int i12) {
        this.f359829c = bVar;
        this.f359828b = i12;
    }

    @Override // com.google.common.collect.InterfaceC37338g3.a
    public final Object a() {
        return C37365l0.this.f359813e[this.f359828b];
    }

    @Override // com.google.common.collect.InterfaceC37338g3.a
    public final int getCount() {
        return C37365l0.this.f359814f[this.f359828b];
    }
}

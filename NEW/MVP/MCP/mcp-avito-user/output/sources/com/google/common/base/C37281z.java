package com.google.common.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Joiner.java */
/* renamed from: com.google.common.base.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37281z extends C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f359069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37281z(C c12, C c13) {
        super(c13, null);
        this.f359069b = c12;
    }

    @Override // com.google.common.base.C
    public final CharSequence d(@I41.a Object obj) {
        return obj == null ? "null" : this.f359069b.d(obj);
    }

    @Override // com.google.common.base.C
    public final C e() {
        throw null;
    }
}

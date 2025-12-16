package com.google.gson.internal;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
class n implements y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f362150a;

    public n(String str) {
        this.f362150a = str;
    }

    @Override // com.google.gson.internal.y
    public final Object a() {
        throw new JsonIOException(this.f362150a);
    }
}

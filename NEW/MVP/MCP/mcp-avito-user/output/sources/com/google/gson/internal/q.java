package com.google.gson.internal;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
class q implements y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f362153a;

    public q(String str) {
        this.f362153a = str;
    }

    @Override // com.google.gson.internal.y
    public final Object a() {
        throw new JsonIOException(this.f362153a);
    }
}

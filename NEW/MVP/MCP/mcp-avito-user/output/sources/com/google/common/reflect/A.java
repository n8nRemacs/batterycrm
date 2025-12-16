package com.google.common.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Types.java */
/* loaded from: classes6.dex */
class A extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f360428b;

    public A(AtomicReference atomicReference) {
        this.f360428b = atomicReference;
    }

    @Override // com.google.common.reflect.z
    public final void b(Class<?> cls) {
        this.f360428b.set(cls.getComponentType());
    }

    @Override // com.google.common.reflect.z
    public final void c(GenericArrayType genericArrayType) {
        this.f360428b.set(genericArrayType.getGenericComponentType());
    }

    @Override // com.google.common.reflect.z
    public final void e(TypeVariable<?> typeVariable) {
        this.f360428b.set(B.a(typeVariable.getBounds()));
    }

    @Override // com.google.common.reflect.z
    public final void f(WildcardType wildcardType) {
        this.f360428b.set(B.a(wildcardType.getUpperBounds()));
    }
}

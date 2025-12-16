package com.google.common.reflect;

import com.google.common.reflect.p;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeResolver.java */
/* loaded from: classes6.dex */
class q extends p.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypeVariable f360459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.b f360460c;

    public q(TypeVariable typeVariable, p.b bVar) {
        this.f360459b = typeVariable;
        this.f360460c = bVar;
    }

    @Override // com.google.common.reflect.p.b
    public final Type a(TypeVariable typeVariable, q qVar) {
        return typeVariable.getGenericDeclaration().equals(this.f360459b.getGenericDeclaration()) ? typeVariable : this.f360460c.a(typeVariable, qVar);
    }
}

package com.facebook.imagepipeline.producers;

import aX0.InterfaceC19834e;
import aX0.InterfaceC19835f;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;

/* compiled from: InternalProducerListener.java */
@Nullsafe
/* loaded from: classes15.dex */
public class E implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public final InterfaceC19835f f340535a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final InterfaceC19834e f340536b;

    public E(@I41.h InterfaceC19835f interfaceC19835f, @I41.h InterfaceC19834e interfaceC19834e) {
        this.f340535a = interfaceC19835f;
        this.f340536b = interfaceC19834e;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void a(k0 k0Var) {
        InterfaceC19835f interfaceC19835f = this.f340535a;
        if (interfaceC19835f != null) {
            interfaceC19835f.h(k0Var.getId());
        }
        InterfaceC19834e interfaceC19834e = this.f340536b;
        if (interfaceC19834e != null) {
            interfaceC19834e.a(k0Var);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void b(k0 k0Var, String str, boolean z12) {
        InterfaceC19835f interfaceC19835f = this.f340535a;
        if (interfaceC19835f != null) {
            interfaceC19835f.c(k0Var.getId(), str, z12);
        }
        InterfaceC19834e interfaceC19834e = this.f340536b;
        if (interfaceC19834e != null) {
            interfaceC19834e.b(k0Var, str, z12);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void c(k0 k0Var, String str) {
        InterfaceC19835f interfaceC19835f = this.f340535a;
        if (interfaceC19835f != null) {
            interfaceC19835f.a(k0Var.getId(), str);
        }
        InterfaceC19834e interfaceC19834e = this.f340536b;
        if (interfaceC19834e != null) {
            interfaceC19834e.c(k0Var, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final boolean d(k0 k0Var, String str) {
        InterfaceC19834e interfaceC19834e;
        InterfaceC19835f interfaceC19835f = this.f340535a;
        boolean zJ2 = interfaceC19835f != null ? interfaceC19835f.j(k0Var.getId()) : false;
        return (zJ2 || (interfaceC19834e = this.f340536b) == null) ? zJ2 : interfaceC19834e.d(k0Var, str);
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void f(k0 k0Var, String str) {
        InterfaceC19835f interfaceC19835f = this.f340535a;
        if (interfaceC19835f != null) {
            interfaceC19835f.g(k0Var.getId(), str);
        }
        InterfaceC19834e interfaceC19834e = this.f340536b;
        if (interfaceC19834e != null) {
            interfaceC19834e.f(k0Var, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void h(k0 k0Var, String str, Throwable th2, @I41.h Map<String, String> map) {
        InterfaceC19835f interfaceC19835f = this.f340535a;
        if (interfaceC19835f != null) {
            interfaceC19835f.f(k0Var.getId(), str, th2, map);
        }
        InterfaceC19834e interfaceC19834e = this.f340536b;
        if (interfaceC19834e != null) {
            interfaceC19834e.h(k0Var, str, th2, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public final void j(k0 k0Var, String str, @I41.h Map<String, String> map) {
        InterfaceC19835f interfaceC19835f = this.f340535a;
        if (interfaceC19835f != null) {
            interfaceC19835f.b(k0Var.getId(), str, map);
        }
        InterfaceC19834e interfaceC19834e = this.f340536b;
        if (interfaceC19834e != null) {
            interfaceC19834e.j(k0Var, str, map);
        }
    }
}

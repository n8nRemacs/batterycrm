package com.jakewharton.rxrelay3;

import l41.r;

/* compiled from: AppendOnlyLinkedArrayList.java */
/* loaded from: classes7.dex */
class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f364261a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f364262b;

    /* renamed from: c, reason: collision with root package name */
    public int f364263c;

    /* compiled from: AppendOnlyLinkedArrayList.java */
    /* renamed from: com.jakewharton.rxrelay3.a$a, reason: collision with other inner class name */
    public interface InterfaceC10779a<T> extends r<T> {
    }

    public a() {
        Object[] objArr = new Object[5];
        this.f364261a = objArr;
        this.f364262b = objArr;
    }

    public final void a(T t12) {
        int i12 = this.f364263c;
        if (i12 == 4) {
            Object[] objArr = new Object[5];
            this.f364262b[4] = objArr;
            this.f364262b = objArr;
            i12 = 0;
        }
        this.f364262b[i12] = t12;
        this.f364263c = i12 + 1;
    }
}

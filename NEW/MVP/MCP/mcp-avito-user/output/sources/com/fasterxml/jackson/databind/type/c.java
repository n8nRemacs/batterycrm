package com.fasterxml.jackson.databind.type;

import java.util.ArrayList;

/* compiled from: ClassStack.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final c f342452a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f342453b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<j> f342454c;

    public c() {
        throw null;
    }

    public c(c cVar, Class<?> cls) {
        this.f342452a = cVar;
        this.f342453b = cls;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList<j> arrayList = this.f342454c;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (c cVar = this; cVar != null; cVar = cVar.f342452a) {
            sb2.append(' ');
            sb2.append(cVar.f342453b.getName());
        }
        sb2.append(']');
        return sb2.toString();
    }
}

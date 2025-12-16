package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ReadableObjectId.java */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public Object f341696a;

    /* renamed from: b, reason: collision with root package name */
    public final G.a f341697b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<a> f341698c;

    /* renamed from: d, reason: collision with root package name */
    public I f341699d;

    public z(G.a aVar) {
        this.f341697b = aVar;
    }

    public final void a(a aVar) {
        if (this.f341698c == null) {
            this.f341698c = new LinkedList<>();
        }
        this.f341698c.add(aVar);
    }

    public final void b(Object obj) {
        I i12 = this.f341699d;
        G.a aVar = this.f341697b;
        i12.a(aVar, obj);
        this.f341696a = obj;
        Object obj2 = aVar.f340903d;
        LinkedList<a> linkedList = this.f341698c;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            this.f341698c = null;
            while (it.hasNext()) {
                it.next().a(obj2, obj);
            }
        }
    }

    public final String toString() {
        return String.valueOf(this.f341697b);
    }

    /* compiled from: ReadableObjectId.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final UnresolvedForwardReference f341700a;

        public a(UnresolvedForwardReference unresolvedForwardReference) {
            this.f341700a = unresolvedForwardReference;
        }

        public abstract void a(Object obj, Object obj2);

        public a(UnresolvedForwardReference unresolvedForwardReference, com.fasterxml.jackson.databind.h hVar) {
            this.f341700a = unresolvedForwardReference;
            hVar.getClass();
        }
    }
}

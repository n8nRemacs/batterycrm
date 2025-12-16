package org.commonmark.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.commonmark.internal.h;
import org.commonmark.internal.m;

/* compiled from: Parser.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f420372a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f420373b;

    /* renamed from: c, reason: collision with root package name */
    public final org.commonmark.parser.c f420374c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f420375d;

    /* compiled from: Parser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f420376a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f420377b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f420378c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final LinkedHashSet f420379d = h.f420278p;
    }

    /* compiled from: Parser.java */
    public interface c extends M61.a {
    }

    public d(b bVar, a aVar) {
        ArrayList arrayList = bVar.f420376a;
        LinkedHashSet linkedHashSet = bVar.f420379d;
        LinkedHashSet linkedHashSet2 = h.f420278p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(h.f420279q.get((Class) it.next()));
        }
        this.f420372a = arrayList2;
        e eVar = new e();
        this.f420374c = eVar;
        this.f420375d = bVar.f420378c;
        ArrayList arrayList3 = bVar.f420377b;
        this.f420373b = arrayList3;
        eVar.a(new m(arrayList3, Collections.emptyMap()));
    }
}

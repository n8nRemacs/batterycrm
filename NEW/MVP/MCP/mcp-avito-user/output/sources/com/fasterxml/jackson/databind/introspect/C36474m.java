package com.fasterxml.jackson.databind.introspect;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: AnnotatedMethodMap.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36474m implements Iterable<C36472k> {

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashMap f342065b;

    @Override // java.lang.Iterable
    public final Iterator<C36472k> iterator() {
        LinkedHashMap linkedHashMap = this.f342065b;
        return linkedHashMap == null ? Collections.emptyIterator() : linkedHashMap.values().iterator();
    }
}

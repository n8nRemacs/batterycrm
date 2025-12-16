package org.hamcrest.collection;

import java.util.Arrays;

/* compiled from: IsArray.java */
/* loaded from: classes7.dex */
public class d<T> extends org.hamcrest.p<T[]> {
    @Override // org.hamcrest.m
    public final void a(org.hamcrest.a aVar) {
        aVar.e("[", ", ", "]", Arrays.asList(null));
    }
}

package io.reactivex.rxjava3.kotlin;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.C41889u;
import j41.InterfaceC42194a;
import j41.InterfaceC42196c;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: flowable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rxkotlin"}, k = 2, mv = {1, 4, 0})
/* renamed from: io.reactivex.rxjava3.kotlin.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42070u {
    @InterfaceC42194a
    @InterfaceC42196c
    @Y61.k
    @j41.g
    public static final C41889u a(@Y61.k io.reactivex.rxjava3.internal.operators.flowable.O0 o02, @Y61.k AbstractC41777j abstractC41777j) {
        C42043g c42043g = C42043g.f404851b;
        Object c42053l = c42043g;
        if (c42043g != null) {
            c42053l = new C42053l(c42043g);
        }
        l41.c cVar = (l41.c) c42053l;
        int i12 = AbstractC41777j.f401972b;
        Objects.requireNonNull(cVar, "combiner is null");
        org.reactivestreams.c[] cVarArr = {o02, abstractC41777j};
        l41.o oVarM = io.reactivex.rxjava3.internal.functions.a.m(cVar);
        int i13 = AbstractC41777j.f401972b;
        io.reactivex.rxjava3.internal.functions.b.a(i13, "bufferSize");
        return new C41889u(cVarArr, oVarM, i13);
    }
}

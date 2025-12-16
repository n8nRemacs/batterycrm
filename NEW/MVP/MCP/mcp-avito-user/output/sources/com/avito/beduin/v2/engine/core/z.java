package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.C36240c;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.manager.c;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Scope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/z;", "Lcom/avito/beduin/v2/engine/r;", "Lcom/avito/beduin/v2/engine/s;", "LYT0/a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface z extends com.avito.beduin.v2.engine.r, com.avito.beduin.v2.engine.s, YT0.a {

    /* compiled from: Scope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    com.avito.beduin.v2.engine.field.j A();

    @Y61.k
    K B(@Y61.k p pVar, @Y61.l Object obj, @Y61.k C36240c c36240c);

    @Y61.k
    <T extends L> T C(@Y61.k String str);

    @Y61.k
    ZT0.i D(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str);

    @Y61.k
    InterfaceC36252b E(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj);

    boolean F();

    @Y61.l
    Set<N> H();

    @Y61.k
    com.avito.beduin.v2.engine.H a();

    void close();

    boolean d(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj);

    @Y61.k
    <R> u<R> f(@Y61.k u<R> uVar, @Y61.l Object obj, R r12);

    @Y61.l
    c.a g();

    @Y61.k
    /* renamed from: getContext */
    InterfaceC36274k getF336594a();

    @Y61.k
    <R extends com.avito.beduin.v2.engine.field.d> y<R> k(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str);

    @Y61.k
    <T> u<T> l(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str);

    @Y61.k
    InterfaceC36254d n(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str);

    @Y61.k
    p o(@Y61.k C36239b.a aVar, @Y61.k String str);

    @Y61.k
    ZT0.a p(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str);

    @Y61.k
    com.avito.beduin.v2.engine.field.j r(@Y61.k String str);

    @Y61.k
    <T> u<T> t(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str);

    boolean u();

    void w(@Y61.k N n12);

    @Y61.k
    z x(@Y61.k String str, boolean z12);
}

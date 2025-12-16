package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.exception.ExceptionTagWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalculationValue.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36256f extends kotlin.jvm.internal.N implements Y41.l<Exception, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.b<?> f336606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36254d f336607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Exception, Object> f336608n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36256f(com.avito.beduin.v2.engine.field.b<?> bVar, InterfaceC36254d interfaceC36254d, Y41.l<? super Exception, ? extends Object> lVar) {
        super(1);
        this.f336606l = bVar;
        this.f336607m = interfaceC36254d;
        this.f336608n = lVar;
    }

    @Override // Y41.l
    public final Object invoke(Exception exc) {
        Exception exceptionTagWrapper = exc;
        com.avito.beduin.v2.engine.field.b<?> bVar = this.f336606l;
        com.avito.beduin.v2.engine.field.entity.c cVar = bVar instanceof com.avito.beduin.v2.engine.field.entity.c ? (com.avito.beduin.v2.engine.field.entity.c) bVar : null;
        String strA = cVar != null ? com.avito.beduin.v2.engine.utils.e.a(cVar, this.f336607m.getF336678a().i()) : null;
        if (strA != null) {
            exceptionTagWrapper = new ExceptionTagWrapper(strA, exceptionTagWrapper);
        }
        return this.f336608n.invoke(exceptionTagWrapper);
    }
}

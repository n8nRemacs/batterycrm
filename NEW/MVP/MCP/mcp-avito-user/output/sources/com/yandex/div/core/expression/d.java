package com.yandex.div.core.expression;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.common.C23088b;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.q0;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.F;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpressionResolverImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/expression/d;", "Lcom/yandex/div/json/expressions/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d implements com.yandex.div.json.expressions.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.div.core.expression.variables.k f367453b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.yandex.div.core.view2.errors.d f367454c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.yandex.div.evaluable.e f367455d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f367456e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashMap f367457f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap f367458g = new LinkedHashMap();

    /* compiled from: ExpressionResolverImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC21/h;", "v", "Lkotlin/G0;", "invoke", "(LC21/h;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements l<C21.h, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C21.h hVar) {
            d dVar = d.this;
            Set<String> set = (Set) dVar.f367457f.get(hVar.getF1897b());
            if (set != null) {
                for (String str : set) {
                    dVar.f367456e.remove(str);
                    q0 q0Var = (q0) dVar.f367458g.get(str);
                    if (q0Var != null) {
                        Iterator<E> it = q0Var.iterator();
                        while (it.hasNext()) {
                            ((Y41.a) it.next()).invoke();
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    public d(@k com.yandex.div.core.expression.variables.k kVar, @k com.yandex.div.core.expression.a aVar, @k com.yandex.div.core.view2.errors.d dVar) {
        this.f367453b = kVar;
        this.f367454c = dVar;
        this.f367455d = new com.yandex.div.evaluable.e(new com.my.target.ads.a(this, 3), aVar.f367448a);
        kVar.f367521d = new a();
    }

    @Override // com.yandex.div.json.expressions.e
    @k
    public final InterfaceC37911f a(@k String str, @k List<String> list, @k Y41.a<G0> aVar) {
        for (String str2 : list) {
            LinkedHashMap linkedHashMap = this.f367457f;
            Object linkedHashSet = linkedHashMap.get(str2);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(str2, linkedHashSet);
            }
            ((Set) linkedHashSet).add(str);
        }
        LinkedHashMap linkedHashMap2 = this.f367458g;
        Object q0Var = linkedHashMap2.get(str);
        if (q0Var == null) {
            q0Var = new q0();
            linkedHashMap2.put(str, q0Var);
        }
        ((q0) q0Var).b(aVar);
        return new c(this, str, aVar, 0);
    }

    @Override // com.yandex.div.json.expressions.e
    @k
    public final <R, T> T b(@k String str, @k String str2, @k com.yandex.div.evaluable.a aVar, @Y61.l l<? super R, ? extends T> lVar, @k F<T> f12, @k D<T> d12, @k com.yandex.div.json.i iVar) {
        try {
            return (T) e(str, str2, aVar, lVar, f12, d12);
        } catch (ParsingException e12) {
            if (e12.f370541b == ParsingExceptionReason.f370546d) {
                throw e12;
            }
            iVar.a(e12);
            this.f367454c.a(e12);
            return (T) e(str, str2, aVar, lVar, f12, d12);
        }
    }

    @Override // com.yandex.div.json.expressions.e
    public final void c(@k ParsingException parsingException) {
        this.f367454c.a(parsingException);
    }

    public final <R> R d(String str, com.yandex.div.evaluable.a aVar) {
        LinkedHashMap linkedHashMap = this.f367456e;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = (R) null;
        }
        if (obj == null) {
            obj = (R) this.f367455d.a(aVar);
            if (aVar.f369379b) {
                for (String str2 : aVar.b()) {
                    LinkedHashMap linkedHashMap2 = this.f367457f;
                    Object linkedHashSet = linkedHashMap2.get(str2);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap2.put(str2, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(str);
                }
                linkedHashMap.put(str, obj);
            }
        }
        return (R) obj;
    }

    public final <R, T> T e(String str, String str2, com.yandex.div.evaluable.a aVar, l<? super R, ? extends T> lVar, F<T> f12, D<T> d12) {
        T tInvoke;
        try {
            Object obj = (Object) d(str2, aVar);
            if (!d12.b(obj)) {
                ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.f370548f;
                if (lVar == null) {
                    tInvoke = (T) obj;
                } else {
                    try {
                        tInvoke = lVar.invoke(obj);
                    } catch (ClassCastException e12) {
                        throw j.k(str, str2, obj, e12);
                    } catch (Exception e13) {
                        throw new ParsingException(parsingExceptionReason, H.n(C23088b.b("Field '", str, "' with expression '", str2, "' received wrong value: '"), obj, '\''), e13, null, null, 24, null);
                    }
                }
                if (tInvoke != null && (d12.getF370137b() instanceof String) && !d12.b(tInvoke)) {
                    tInvoke = String.valueOf(tInvoke);
                }
                if (tInvoke == null) {
                    StringBuilder sb2 = new StringBuilder("Value '");
                    sb2.append(j.j(obj));
                    sb2.append("' for key '");
                    sb2.append(str);
                    sb2.append("' at path '");
                    throw new ParsingException(parsingExceptionReason, AK.c.s(sb2, str2, "' is not valid"), null, null, null, 28, null);
                }
                obj = (T) tInvoke;
            }
            try {
                if (f12.g(obj)) {
                    return (T) obj;
                }
                throw j.b(obj, str2);
            } catch (ClassCastException e14) {
                throw j.k(str, str2, obj, e14);
            }
        } catch (EvaluableException e15) {
            String str3 = e15 instanceof MissingVariableException ? ((MissingVariableException) e15).f369376b : null;
            if (str3 != null) {
                throw new ParsingException(ParsingExceptionReason.f370546d, C22026a.c(C23088b.b("Undefined variable '", str3, "' at \"", str, "\": \""), str2, '\"'), e15, null, null, 24, null);
            }
            throw j.i(str, str2, e15);
        }
    }
}

package com.avito.beduin.v2.interaction.network.parser.serializer;

import SU0.j;
import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: PlainTextSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/parser/serializer/h;", "LSU0/f;", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements SU0.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final h f337702a = new h();

    /* compiled from: PlainTextSerializer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<com.avito.beduin.v2.engine.field.d, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f337703l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(com.avito.beduin.v2.engine.field.d dVar) {
            return h.f337702a.a(dVar).f15023b;
        }
    }

    @Override // SU0.f
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j.c.C1022c a(@k com.avito.beduin.v2.engine.field.d dVar) {
        F.a aVar = F.f336593b;
        com.avito.beduin.v2.engine.field.d dVarC = dVar.c(aVar);
        if (dVarC instanceof v) {
            return new j.c.C1022c(((v) dVarC).getF336843b(), "text/plain");
        }
        if (!(dVarC instanceof C36268a)) {
            throw new IllegalArgumentException("PlainTextSerializer: unsupported: " + m0.f406844a.b(dVar.getClass()).l0());
        }
        List<com.avito.beduin.v2.engine.field.d> list = ((C36268a) dVarC).f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.beduin.v2.engine.field.d) it.next()).c(aVar));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((com.avito.beduin.v2.engine.field.d) next) instanceof com.avito.beduin.v2.engine.field.entity.f)) {
                arrayList2.add(next);
            }
        }
        return new j.c.C1022c(C42745f0.O(arrayList2, ",", null, null, a.f337703l, 30), "text/plain");
    }
}

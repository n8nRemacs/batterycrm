package com.yandex.div.json.expressions;

import Y61.k;
import Y61.l;
import com.yandex.div.core.C37904b;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.internal.parser.x;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.i;
import com.yandex.div.json.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ExpressionList.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/json/expressions/f;", "", "T", "Lcom/yandex/div/json/expressions/d;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f370570a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f370571b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x<T> f370572c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f370573d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ArrayList f370574e;

    /* compiled from: ExpressionList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f370575l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f<T> f370576m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ e f370577n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super List<? extends T>, G0> lVar, f<T> fVar, e eVar) {
            super(1);
            this.f370575l = (N) lVar;
            this.f370576m = fVar;
            this.f370577n = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            this.f370575l.invoke(this.f370576m.a(this.f370577n));
            return G0.f406611a;
        }
    }

    public f(@k String str, @k ArrayList arrayList, @k x xVar, @k i iVar) {
        this.f370570a = str;
        this.f370571b = arrayList;
        this.f370572c = xVar;
        this.f370573d = iVar;
    }

    @Override // com.yandex.div.json.expressions.d
    @k
    public final List<T> a(@k e eVar) {
        try {
            ArrayList arrayListC = c(eVar);
            this.f370574e = arrayListC;
            return arrayListC;
        } catch (ParsingException e12) {
            this.f370573d.a(e12);
            ArrayList arrayList = this.f370574e;
            if (arrayList != null) {
                return arrayList;
            }
            throw e12;
        }
    }

    @Override // com.yandex.div.json.expressions.d
    @k
    public final InterfaceC37911f b(@k e eVar, @k Y41.l<? super List<? extends T>, G0> lVar) {
        a aVar = new a(lVar, this, eVar);
        ArrayList arrayList = this.f370571b;
        if (arrayList.size() == 1) {
            return ((b) C42745f0.E(arrayList)).d(eVar, aVar);
        }
        C37904b c37904b = new C37904b();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC37911f interfaceC37911fD = ((b) it.next()).d(eVar, aVar);
            if (c37904b.f367284c) {
                throw new IllegalArgumentException("close() method was called");
            }
            if (interfaceC37911fD != InterfaceC37911f.f367528l2) {
                c37904b.f367283b.add(interfaceC37911fD);
            }
        }
        return c37904b;
    }

    public final ArrayList c(e eVar) {
        ArrayList arrayList = this.f370571b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b) it.next()).a(eVar));
        }
        if (this.f370572c.isValid(arrayList2)) {
            return arrayList2;
        }
        throw j.b(arrayList2, this.f370570a);
    }

    public final boolean equals(@l Object obj) {
        if (obj instanceof f) {
            if (this.f370571b.equals(((f) obj).f370571b)) {
                return true;
            }
        }
        return false;
    }
}

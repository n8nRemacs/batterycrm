package com.otaliastudios.transcoder.internal.pipeline;

import com.otaliastudios.transcoder.internal.pipeline.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: Pipeline.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/d;", "", "a", "b", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f366156e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<l<Object, com.otaliastudios.transcoder.internal.pipeline.b, Object, com.otaliastudios.transcoder.internal.pipeline.b>> f366157a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366158b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public k.b<Object> f366159c;

    /* renamed from: d, reason: collision with root package name */
    public int f366160d;

    /* compiled from: Pipeline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/d$a;", "", "D", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "C", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<D, C extends com.otaliastudios.transcoder.internal.pipeline.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<l<?, ?, ?, ?>> f366161a;

        public a() {
            this(null, 1, null);
        }

        @Y61.k
        public final <NewData, NewChannel extends com.otaliastudios.transcoder.internal.pipeline.b> a<NewData, NewChannel> a(@Y61.k l<D, C, NewData, NewChannel> lVar) {
            return new a<>(C42745f0.i0(lVar, this.f366161a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k List<? extends l<?, ?, ?, ?>> list) {
            this.f366161a = list;
        }

        public a(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: Pipeline.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/d$b;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static d a(@Y61.k String str, @Y61.k Y41.a aVar) {
            return new d(str, ((a) aVar.invoke()).f366161a, null);
        }

        public b() {
        }
    }

    public d() {
        throw null;
    }

    public d(String str, List list, C42822w c42822w) {
        Iterable iterable;
        this.f366157a = list;
        this.f366158b = new com.otaliastudios.transcoder.internal.utils.j();
        this.f366159c = new k.b<>(G0.f406611a);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList.add(new Q(next, next2));
                next = next2;
            }
            iterable = arrayList;
        } else {
            iterable = C42784z0.f406748b;
        }
        for (Q q12 : C42745f0.q0(iterable)) {
            ((l) q12.f406619b).t(((l) q12.f406620c).r());
        }
    }

    public static k.b a(k.b bVar, l lVar, boolean z12) {
        k kVarS = lVar.s(bVar, z12);
        if (kVarS instanceof k.b) {
            return (k.b) kVarS;
        }
        if (kVarS instanceof k.c) {
            return a(bVar, lVar, false);
        }
        if (kVarS instanceof k.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}

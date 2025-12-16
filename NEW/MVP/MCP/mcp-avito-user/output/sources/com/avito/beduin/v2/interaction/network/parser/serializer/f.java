package com.avito.beduin.v2.interaction.network.parser.serializer;

import SU0.b;
import SU0.j;
import Y61.k;
import android.util.Base64;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.utils.io.FileReadException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: FileSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/parser/serializer/f;", "", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final JV0.a f337695a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C31685o f337696b;

    /* compiled from: FileSerializer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<byte[]> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f337698m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f337698m = str;
        }

        @Override // Y41.a
        public final byte[] invoke() throws FileReadException, FileNotFoundException {
            f fVar = f.this;
            C31685o c31685o = fVar.f337696b;
            byte[] bArrB = fVar.f337695a.b(this.f337698m);
            int i12 = c.f337691b;
            return Base64.encode(bArrB, 0);
        }
    }

    /* compiled from: FileSerializer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<byte[]> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f337700m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f337700m = str;
        }

        @Override // Y41.a
        public final byte[] invoke() {
            return f.this.f337695a.b(this.f337700m);
        }
    }

    public f(@k JV0.a aVar, @k C31685o c31685o) {
        this.f337695a = aVar;
        this.f337696b = c31685o;
    }

    public final j.c a(b.c.a aVar, String str, String str2) {
        if (L.f(aVar, b.c.a.C1016a.f15003c)) {
            return new j.c.a(str2, str, "base64", new a(str));
        }
        if (L.f(aVar, b.c.a.C1017b.f15004c)) {
            return new j.c.a(str2, str, "byte-array", new b(str));
        }
        if (L.f(aVar, b.c.a.C1018c.f15005c)) {
            return new j.c.b(str2, str);
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public final j b(@k com.avito.beduin.v2.engine.field.d dVar, @k b.c.a aVar) {
        if (dVar instanceof v) {
            return c(dVar, aVar);
        }
        if (dVar instanceof A) {
            return c(dVar, aVar);
        }
        if (!(dVar instanceof C36268a)) {
            throw new IllegalArgumentException("Unsupported type: " + m0.f406844a.b(dVar.getClass()).l0());
        }
        List<com.avito.beduin.v2.engine.field.d> list = ((C36268a) dVar).f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.beduin.v2.engine.field.d) it.next()).c(F.f336593b));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((com.avito.beduin.v2.engine.field.d) next) instanceof com.avito.beduin.v2.engine.field.entity.f)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(c((com.avito.beduin.v2.engine.field.d) it3.next(), aVar));
        }
        return new j.a((j.c[]) arrayList3.toArray(new j.c[0]));
    }

    public final j.c c(com.avito.beduin.v2.engine.field.d dVar, b.c.a aVar) throws BeduinPropertyException {
        Object bVar;
        if (dVar instanceof v) {
            return a(aVar, ((v) dVar).getF336843b(), null);
        }
        if (!(dVar instanceof A)) {
            if (dVar instanceof C36268a) {
                throw new IllegalArgumentException("Nested arrays are not supported");
            }
            throw new IllegalArgumentException("Nested types of " + m0.f406844a.b(dVar.getClass()).l0() + " are not supported");
        }
        A a12 = (A) dVar;
        m mVar = a12.f336778b;
        F.a aVar2 = F.f336593b;
        String strL = mVar.l(aVar2, "path");
        try {
            int i12 = Z.f406624c;
            bVar = a12.f336778b.w(aVar2, "name");
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return a(aVar, strL, (String) (bVar instanceof Z.b ? null : bVar));
    }
}

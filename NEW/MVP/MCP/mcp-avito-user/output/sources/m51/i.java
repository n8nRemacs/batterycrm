package m51;

import X41.n;
import Y61.k;
import Y61.l;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import m51.d;

/* compiled from: JvmProtoBufUtil.kt */
@s0
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f414326a = new i();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.protobuf.f f414327b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f fVar = new kotlin.reflect.jvm.internal.impl.protobuf.f();
        fVar.a(JvmProtoBuf.f409145a);
        fVar.a(JvmProtoBuf.f409146b);
        fVar.a(JvmProtoBuf.f409147c);
        fVar.a(JvmProtoBuf.f409148d);
        fVar.a(JvmProtoBuf.f409149e);
        fVar.a(JvmProtoBuf.f409150f);
        fVar.a(JvmProtoBuf.f409151g);
        fVar.a(JvmProtoBuf.f409152h);
        fVar.a(JvmProtoBuf.f409153i);
        fVar.a(JvmProtoBuf.f409154j);
        fVar.a(JvmProtoBuf.f409155k);
        fVar.a(JvmProtoBuf.f409156l);
        fVar.a(JvmProtoBuf.f409157m);
        fVar.a(JvmProtoBuf.f409158n);
        f414327b = fVar;
    }

    @l
    public static d.b a(@k ProtoBuf.b bVar, @k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
        String strO;
        JvmProtoBuf.c cVar2 = (JvmProtoBuf.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(bVar, JvmProtoBuf.f409145a);
        String string = (cVar2 == null || (cVar2.f409210c & 1) != 1) ? "<init>" : cVar.getString(cVar2.f409211d);
        if (cVar2 == null || (cVar2.f409210c & 2) != 2) {
            List<ProtoBuf.l> list = bVar.f408891f;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ProtoBuf.Type typeA = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a((ProtoBuf.l) it.next(), gVar);
                f414326a.getClass();
                String strE = e(typeA, cVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strO = C42745f0.O(arrayList, "", "(", ")V", null, 56);
        } else {
            strO = cVar.getString(cVar2.f409212e);
        }
        return new d.b(string, strO);
    }

    @l
    public static d.a b(@k ProtoBuf.h hVar, @k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z12) {
        ProtoBuf.Type typeA;
        String strE;
        JvmProtoBuf.d dVar = (JvmProtoBuf.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(hVar, JvmProtoBuf.f409148d);
        if (dVar == null) {
            return null;
        }
        JvmProtoBuf.b bVar = (dVar.f409221c & 1) == 1 ? dVar.f409222d : null;
        if (bVar == null && z12) {
            return null;
        }
        int i12 = (bVar == null || (bVar.f409199c & 1) != 1) ? hVar.f408990g : bVar.f409200d;
        if (bVar == null || (bVar.f409199c & 2) != 2) {
            int i13 = hVar.f408987d;
            if ((i13 & 8) == 8) {
                typeA = hVar.f408991h;
            } else {
                if ((i13 & 16) != 16) {
                    throw new IllegalStateException("No returnType in ProtoBuf.Property");
                }
                typeA = gVar.a(hVar.f408992i);
            }
            strE = e(typeA, cVar);
            if (strE == null) {
                return null;
            }
        } else {
            strE = cVar.getString(bVar.f409201e);
        }
        return new d.a(cVar.getString(i12), strE);
    }

    @l
    public static d.b c(@k ProtoBuf.e eVar, @k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
        ProtoBuf.Type typeA;
        String strConcat;
        JvmProtoBuf.c cVar2 = (JvmProtoBuf.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(eVar, JvmProtoBuf.f409146b);
        int i12 = (cVar2 == null || (cVar2.f409210c & 1) != 1) ? eVar.f408922g : cVar2.f409211d;
        if (cVar2 == null || (cVar2.f409210c & 2) != 2) {
            List listV = C42745f0.V(eVar.p() ? eVar.f408926k : (eVar.f408919d & 64) == 64 ? gVar.a(eVar.f408927l) : null);
            List<ProtoBuf.l> list = eVar.f408931p;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a((ProtoBuf.l) it.next(), gVar));
            }
            ArrayList<ProtoBuf.Type> arrayListH0 = C42745f0.h0(arrayList, listV);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListH0, 10));
            for (ProtoBuf.Type type : arrayListH0) {
                f414326a.getClass();
                String strE = e(type, cVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            int i13 = eVar.f408919d;
            if ((i13 & 8) == 8) {
                typeA = eVar.f408923h;
            } else {
                if ((i13 & 16) != 16) {
                    throw new IllegalStateException("No returnType in ProtoBuf.Function");
                }
                typeA = gVar.a(eVar.f408924i);
            }
            String strE2 = e(typeA, cVar);
            if (strE2 == null) {
                return null;
            }
            strConcat = C42745f0.O(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = cVar.getString(cVar2.f409212e);
        }
        return new d.b(cVar.getString(i12), strConcat);
    }

    @n
    public static final boolean d(@k ProtoBuf.h hVar) {
        C43889c.f414313a.getClass();
        return C43889c.f414314b.e(((Number) hVar.g(JvmProtoBuf.f409149e)).intValue()).booleanValue();
    }

    public static String e(ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        if (type.p()) {
            return C43888b.b(cVar.a(type.f408785j));
        }
        return null;
    }

    @n
    @k
    public static final Q<f, ProtoBuf.Class> f(@k String[] strArr, @k String[] strArr2) throws InvalidProtocolBufferException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C43887a.a(strArr));
        f414326a.getClass();
        f fVarG = g(byteArrayInputStream, strArr2);
        kotlin.reflect.jvm.internal.impl.protobuf.f fVar = f414327b;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar = (kotlin.reflect.jvm.internal.impl.protobuf.b) ProtoBuf.Class.f408628L;
        bVar.getClass();
        kotlin.reflect.jvm.internal.impl.protobuf.e eVar = new kotlin.reflect.jvm.internal.impl.protobuf.e(byteArrayInputStream);
        o oVar = (o) bVar.a(eVar, fVar);
        try {
            eVar.a(0);
            kotlin.reflect.jvm.internal.impl.protobuf.b.b(oVar);
            return new Q<>(fVarG, (ProtoBuf.Class) oVar);
        } catch (InvalidProtocolBufferException e12) {
            e12.f409295b = oVar;
            throw e12;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((kotlin.reflect.jvm.internal.impl.protobuf.b) JvmProtoBuf.StringTableTypes.f409160i).c(byteArrayInputStream, f414327b);
        List<Integer> list = stringTableTypes.f409163d;
        Set setP0 = list.isEmpty() ? B0.f406639b : C42745f0.P0(list);
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.f409162c;
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list2) {
            int i12 = record.f409171d;
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return new f(strArr, setP0, arrayList);
    }

    @n
    @k
    public static final Q<f, ProtoBuf.f> h(@k String[] strArr, @k String[] strArr2) throws InvalidProtocolBufferException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C43887a.a(strArr));
        f414326a.getClass();
        f fVarG = g(byteArrayInputStream, strArr2);
        kotlin.reflect.jvm.internal.impl.protobuf.f fVar = f414327b;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar = (kotlin.reflect.jvm.internal.impl.protobuf.b) ProtoBuf.f.f408953m;
        bVar.getClass();
        kotlin.reflect.jvm.internal.impl.protobuf.e eVar = new kotlin.reflect.jvm.internal.impl.protobuf.e(byteArrayInputStream);
        o oVar = (o) bVar.a(eVar, fVar);
        try {
            eVar.a(0);
            kotlin.reflect.jvm.internal.impl.protobuf.b.b(oVar);
            return new Q<>(fVarG, (ProtoBuf.f) oVar);
        } catch (InvalidProtocolBufferException e12) {
            e12.f409295b = oVar;
            throw e12;
        }
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42938a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42939b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42940c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42941d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.l;

/* compiled from: AnnotationDeserializer.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42948e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.E f409897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.H f409898b;

    /* compiled from: AnnotationDeserializer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409899a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                ProtoBuf.Annotation.Argument.Value.Type type = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type2 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type3 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type4 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type5 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type6 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type7 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type8 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type9 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type10 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type11 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type12 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ProtoBuf.Annotation.Argument.Value.Type type13 = ProtoBuf.Annotation.Argument.Value.Type.BYTE;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f409899a = iArr;
        }
    }

    public C42948e(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.H h12) {
        this.f409897a = e12;
        this.f409898b = h12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Q] */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.d a(@Y61.k ProtoBuf.Annotation annotation, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        InterfaceC42850c interfaceC42850c;
        InterfaceC42851d interfaceC42851dC = C42904w.c(this.f409897a, G.a(cVar, annotation.f408565d), this.f409898b);
        Map mapC = P0.c();
        if (annotation.f408566e.size() != 0 && !kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42851dC)) {
            int i12 = kotlin.reflect.jvm.internal.impl.resolve.j.f409625a;
            if (kotlin.reflect.jvm.internal.impl.resolve.j.n(interfaceC42851dC, ClassKind.f407417f) && (interfaceC42850c = (InterfaceC42850c) C42745f0.v0(interfaceC42851dC.G())) != null) {
                List<k0> listG = interfaceC42850c.g();
                int iF2 = P0.f(C42745f0.q(listG, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (Object obj : listG) {
                    linkedHashMap.put(((k0) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> list = annotation.f408566e;
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : list) {
                    k0 k0Var = (k0) linkedHashMap.get(kotlin.reflect.jvm.internal.impl.name.f.d(cVar.getString(argument.f408573d)));
                    if (k0Var != null) {
                        kotlin.reflect.jvm.internal.impl.name.f fVarD = kotlin.reflect.jvm.internal.impl.name.f.d(cVar.getString(argument.f408573d));
                        kotlin.reflect.jvm.internal.impl.types.O type = k0Var.getType();
                        ProtoBuf.Annotation.Argument.Value value = argument.f408574e;
                        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarC = c(type, value, cVar);
                        q = b(gVarC, type, value) ? gVarC : null;
                        if (q == null) {
                            l.a aVar = kotlin.reflect.jvm.internal.impl.resolve.constants.l.f409591b;
                            String str = "Unexpected argument value: actual type " + value.f408581d + " != expected type " + type;
                            aVar.getClass();
                            q = new l.b(str);
                        }
                        q = new Q(fVarD, q);
                    }
                    if (q != null) {
                        arrayList.add(q);
                    }
                }
                mapC = P0.p(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(interfaceC42851dC.q(), mapC, b0.f407539a);
    }

    public final boolean b(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, kotlin.reflect.jvm.internal.impl.types.O o12, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.f408581d;
        int i12 = type == null ? -1 : a.f409899a[type.ordinal()];
        if (i12 != 10) {
            kotlin.reflect.jvm.internal.impl.descriptors.E e12 = this.f409897a;
            if (i12 != 13) {
                return kotlin.jvm.internal.L.f(gVar.a(e12), o12);
            }
            if (gVar instanceof C42939b) {
                C42939b c42939b = (C42939b) gVar;
                if (((List) c42939b.f409586a).size() == value.f408589l.size()) {
                    kotlin.reflect.jvm.internal.impl.types.O oF2 = e12.m().f(o12);
                    Iterable iterableI = C42745f0.I((Collection) c42939b.f409586a);
                    if (!(iterableI instanceof Collection) || !((Collection) iterableI).isEmpty()) {
                        kotlin.ranges.k it = iterableI.iterator();
                        while (it.f406910d) {
                            int iA2 = it.a();
                            if (!b((kotlin.reflect.jvm.internal.impl.resolve.constants.g) ((List) c42939b.f409586a).get(iA2), oF2, value.f408589l.get(iA2))) {
                                return false;
                            }
                        }
                    }
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
        if (interfaceC42851d != null) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.k.f407311f;
            if (!kotlin.reflect.jvm.internal.impl.builtins.k.b(interfaceC42851d, n.a.f407361Q)) {
                return false;
            }
        }
        return true;
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.k ProtoBuf.Annotation.Argument.Value value, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> eVar;
        boolean zBooleanValue = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409109N.e(value.f408591n).booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.f408581d;
        switch (type == null ? -1 : a.f409899a[type.ordinal()]) {
            case 1:
                byte b12 = (byte) value.f408582e;
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.z(b12) : new C42941d(b12);
            case 2:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.e(Character.valueOf((char) value.f408582e));
                break;
            case 3:
                short s5 = (short) value.f408582e;
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.C(s5) : new kotlin.reflect.jvm.internal.impl.resolve.constants.w(s5);
            case 4:
                int i12 = (int) value.f408582e;
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.A(i12) : new kotlin.reflect.jvm.internal.impl.resolve.constants.n(i12);
            case 5:
                long j12 = value.f408582e;
                return zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.B(j12) : new kotlin.reflect.jvm.internal.impl.resolve.constants.t(j12);
            case 6:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.m(value.f408583f);
                break;
            case 7:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.j(value.f408584g);
                break;
            case 8:
                eVar = new C42940c(Boolean.valueOf(value.f408582e != 0));
                break;
            case 9:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(cVar.getString(value.f408585h));
                break;
            case 10:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.s(G.a(cVar, value.f408586i), value.f408590m);
                break;
            case 11:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.k(G.a(cVar, value.f408586i), kotlin.reflect.jvm.internal.impl.name.f.d(cVar.getString(value.f408587j)));
                break;
            case 12:
                eVar = new C42938a(a(value.f408588k, cVar));
                break;
            case 13:
                kotlin.reflect.jvm.internal.impl.resolve.constants.i iVar = kotlin.reflect.jvm.internal.impl.resolve.constants.i.f409588a;
                List<ProtoBuf.Annotation.Argument.Value> list = value.f408589l;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c(this.f409897a.m().e(), (ProtoBuf.Annotation.Argument.Value) it.next(), cVar));
                }
                iVar.getClass();
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.y(arrayList, o12);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.f408581d + " (expected " + o12 + ')').toString());
        }
        return eVar;
    }
}

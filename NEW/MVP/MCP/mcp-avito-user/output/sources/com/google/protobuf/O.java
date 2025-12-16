package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC37707w0;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
final class O extends N<GeneratedMessageLite.f> {

    /* compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362724a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f362724a = iArr;
            try {
                iArr[WireFormat.FieldType.f362789d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362724a[WireFormat.FieldType.f362790e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362724a[WireFormat.FieldType.f362791f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362724a[WireFormat.FieldType.f362792g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362724a[WireFormat.FieldType.f362793h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362724a[WireFormat.FieldType.f362794i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362724a[WireFormat.FieldType.f362795j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f362724a[WireFormat.FieldType.f362796k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f362724a[WireFormat.FieldType.f362801p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f362724a[WireFormat.FieldType.f362803r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f362724a[WireFormat.FieldType.f362804s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f362724a[WireFormat.FieldType.f362805t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f362724a[WireFormat.FieldType.f362806u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f362724a[WireFormat.FieldType.f362802q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f362724a[WireFormat.FieldType.f362800o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f362724a[WireFormat.FieldType.f362797l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f362724a[WireFormat.FieldType.f362798m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f362724a[WireFormat.FieldType.f362799n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.N
    public final int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.f) entry.getKey()).f362684c;
    }

    @Override // com.google.protobuf.N
    public final GeneratedMessageLite.g b(M m12, InterfaceC37707w0 interfaceC37707w0, int i12) {
        return m12.a(i12, interfaceC37707w0);
    }

    @Override // com.google.protobuf.N
    public final V<GeneratedMessageLite.f> c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.N
    public final V<GeneratedMessageLite.f> d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.N
    public final boolean e(InterfaceC37707w0 interfaceC37707w0) {
        return interfaceC37707w0 instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.N
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.n();
    }

    @Override // com.google.protobuf.N
    public final <UT, UB> UB g(Object obj, R0 r02, Object obj2, M m12, V<GeneratedMessageLite.f> v12, UB ub2, m1<UT, UB> m1Var) {
        Object objValueOf;
        Object objF;
        List<Double> arrayList;
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) obj2;
        GeneratedMessageLite.f fVar = gVar.f362691d;
        int i12 = fVar.f362684c;
        WireFormat.FieldType fieldType = fVar.f362685d;
        if (fVar.f362686e && fVar.f362687f) {
            switch (fieldType.ordinal()) {
                case 0:
                    arrayList = new ArrayList<>();
                    r02.readDoubleList(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList<>();
                    r02.readFloatList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList<>();
                    r02.readInt64List(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList<>();
                    r02.readUInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList<>();
                    r02.readInt32List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList<>();
                    r02.readFixed64List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList<>();
                    r02.readFixed32List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList<>();
                    r02.readBoolList(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + fVar.f362685d);
                case 12:
                    arrayList = new ArrayList<>();
                    r02.readUInt32List(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    r02.readEnumList(arrayList2);
                    ub2 = (UB) V0.z(obj, i12, arrayList2, fVar.f362683b, ub2, m1Var);
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList<>();
                    r02.readSFixed32List(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList<>();
                    r02.readSFixed64List(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList<>();
                    r02.readSInt32List(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList<>();
                    r02.readSInt64List(arrayList);
                    break;
            }
            v12.q(fVar, arrayList);
        } else {
            if (fieldType != WireFormat.FieldType.f362802q) {
                int i13 = a.f362724a[fieldType.ordinal()];
                InterfaceC37707w0 interfaceC37707w0 = gVar.f362690c;
                switch (i13) {
                    case 1:
                        objValueOf = Double.valueOf(r02.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(r02.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(r02.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(r02.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(r02.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(r02.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(r02.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(r02.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(r02.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(r02.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(r02.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(r02.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(r02.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = r02.readBytes();
                        break;
                    case 16:
                        objValueOf = r02.readString();
                        break;
                    case 17:
                        if (!fVar.f362686e) {
                            Object objF2 = v12.f(fVar);
                            if (objF2 instanceof GeneratedMessageLite) {
                                T0 t0B = N0.f362717c.b(objF2);
                                if (!((GeneratedMessageLite) objF2).isMutable()) {
                                    Object objNewInstance = t0B.newInstance();
                                    t0B.mergeFrom(objNewInstance, objF2);
                                    v12.q(fVar, objNewInstance);
                                    objF2 = objNewInstance;
                                }
                                r02.f(objF2, t0B, m12);
                                return ub2;
                            }
                        }
                        objValueOf = r02.c(interfaceC37707w0.getClass(), m12);
                        break;
                    case 18:
                        if (!fVar.f362686e) {
                            Object objF3 = v12.f(fVar);
                            if (objF3 instanceof GeneratedMessageLite) {
                                T0 t0B2 = N0.f362717c.b(objF3);
                                if (!((GeneratedMessageLite) objF3).isMutable()) {
                                    Object objNewInstance2 = t0B2.newInstance();
                                    t0B2.mergeFrom(objNewInstance2, objF3);
                                    v12.q(fVar, objNewInstance2);
                                    objF3 = objNewInstance2;
                                }
                                r02.a(objF3, t0B2, m12);
                                return ub2;
                            }
                        }
                        objValueOf = r02.d(interfaceC37707w0.getClass(), m12);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = r02.readInt32();
                if (fVar.f362683b.findValueByNumber(int32) == null) {
                    return (UB) V0.C(obj, i12, int32, ub2, m1Var);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (fVar.f362686e) {
                v12.a(fVar, objValueOf);
            } else {
                int i14 = a.f362724a[fVar.f362685d.ordinal()];
                if ((i14 == 17 || i14 == 18) && (objF = v12.f(fVar)) != null) {
                    objValueOf = ((InterfaceC37707w0) objF).toBuilder().h((InterfaceC37707w0) objValueOf).buildPartial();
                }
                v12.q(fVar, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.protobuf.N
    public final void h(R0 r02, Object obj, M m12, V<GeneratedMessageLite.f> v12) {
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) obj;
        v12.q(gVar.f362691d, r02.d(gVar.f362690c.getClass(), m12));
    }

    @Override // com.google.protobuf.N
    public final void i(AbstractC37700t abstractC37700t, Object obj, M m12, V<GeneratedMessageLite.f> v12) {
        GeneratedMessageLite.g gVar = (GeneratedMessageLite.g) obj;
        InterfaceC37707w0.a aVarNewBuilderForType = gVar.f362690c.newBuilderForType();
        AbstractC37708x abstractC37708xW = abstractC37700t.w();
        aVarNewBuilderForType.m2(abstractC37708xW, m12);
        v12.q(gVar.f362691d, aVarNewBuilderForType.buildPartial());
        abstractC37708xW.a(0);
    }

    @Override // com.google.protobuf.N
    public final void j(Writer writer, Map.Entry<?, ?> entry) {
        GeneratedMessageLite.f fVar = (GeneratedMessageLite.f) entry.getKey();
        boolean z12 = fVar.f362686e;
        WireFormat.FieldType fieldType = fVar.f362685d;
        int i12 = fVar.f362684c;
        if (!z12) {
            switch (a.f362724a[fieldType.ordinal()]) {
                case 1:
                    writer.writeDouble(i12, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.writeFloat(i12, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.writeInt64(i12, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.writeUInt64(i12, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.writeInt32(i12, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.writeFixed64(i12, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.writeFixed32(i12, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.writeBool(i12, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.writeUInt32(i12, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.writeSFixed32(i12, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.writeSFixed64(i12, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.writeSInt32(i12, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.writeSInt64(i12, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.writeInt32(i12, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.a(i12, (AbstractC37700t) entry.getValue());
                    break;
                case 16:
                    writer.writeString(i12, (String) entry.getValue());
                    break;
                case 17:
                    writer.c(i12, entry.getValue(), N0.f362717c.a(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.e(i12, entry.getValue(), N0.f362717c.a(entry.getValue().getClass()));
                    break;
            }
        }
        int i13 = a.f362724a[fieldType.ordinal()];
        boolean z13 = fVar.f362687f;
        switch (i13) {
            case 1:
                V0.F(i12, (List) entry.getValue(), writer, z13);
                break;
            case 2:
                V0.J(i12, (List) entry.getValue(), writer, z13);
                break;
            case 3:
                V0.M(i12, (List) entry.getValue(), writer, z13);
                break;
            case 4:
                V0.U(i12, (List) entry.getValue(), writer, z13);
                break;
            case 5:
                V0.L(i12, (List) entry.getValue(), writer, z13);
                break;
            case 6:
                V0.I(i12, (List) entry.getValue(), writer, z13);
                break;
            case 7:
                V0.H(i12, (List) entry.getValue(), writer, z13);
                break;
            case 8:
                V0.D(i12, (List) entry.getValue(), writer, z13);
                break;
            case 9:
                V0.T(i12, (List) entry.getValue(), writer, z13);
                break;
            case 10:
                V0.O(i12, (List) entry.getValue(), writer, z13);
                break;
            case 11:
                V0.P(i12, (List) entry.getValue(), writer, z13);
                break;
            case 12:
                V0.Q(i12, (List) entry.getValue(), writer, z13);
                break;
            case 13:
                V0.R(i12, (List) entry.getValue(), writer, z13);
                break;
            case 14:
                V0.L(i12, (List) entry.getValue(), writer, z13);
                break;
            case 15:
                V0.E(i12, (List) entry.getValue(), writer);
                break;
            case 16:
                V0.S(i12, (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    V0.K(i12, (List) entry.getValue(), writer, N0.f362717c.a(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    V0.N(i12, (List) entry.getValue(), writer, N0.f362717c.a(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}

package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC22877a;
import androidx.datastore.preferences.protobuf.AbstractC22940z;
import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.C22939y0;
import androidx.datastore.preferences.protobuf.C22941z0;
import androidx.datastore.preferences.protobuf.G0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.X0;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class PreferencesProto {

    public static final class Value extends GeneratedMessageLite<Value, a> implements f {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile X0<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ValueCase {

            /* renamed from: b, reason: collision with root package name */
            public static final ValueCase f45544b;

            /* renamed from: c, reason: collision with root package name */
            public static final ValueCase f45545c;

            /* renamed from: d, reason: collision with root package name */
            public static final ValueCase f45546d;

            /* renamed from: e, reason: collision with root package name */
            public static final ValueCase f45547e;

            /* renamed from: f, reason: collision with root package name */
            public static final ValueCase f45548f;

            /* renamed from: g, reason: collision with root package name */
            public static final ValueCase f45549g;

            /* renamed from: h, reason: collision with root package name */
            public static final ValueCase f45550h;

            /* renamed from: i, reason: collision with root package name */
            public static final ValueCase f45551i;

            /* renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ ValueCase[] f45552j;

            static {
                ValueCase valueCase = new ValueCase("BOOLEAN", 0);
                f45544b = valueCase;
                ValueCase valueCase2 = new ValueCase("FLOAT", 1);
                f45545c = valueCase2;
                ValueCase valueCase3 = new ValueCase("INTEGER", 2);
                f45546d = valueCase3;
                ValueCase valueCase4 = new ValueCase("LONG", 3);
                f45547e = valueCase4;
                ValueCase valueCase5 = new ValueCase("STRING", 4);
                f45548f = valueCase5;
                ValueCase valueCase6 = new ValueCase("STRING_SET", 5);
                f45549g = valueCase6;
                ValueCase valueCase7 = new ValueCase("DOUBLE", 6);
                f45550h = valueCase7;
                ValueCase valueCase8 = new ValueCase("VALUE_NOT_SET", 7);
                f45551i = valueCase8;
                f45552j = new ValueCase[]{valueCase, valueCase2, valueCase3, valueCase4, valueCase5, valueCase6, valueCase7, valueCase8};
            }

            public ValueCase() {
                throw null;
            }

            public static ValueCase valueOf(String str) {
                return (ValueCase) Enum.valueOf(ValueCase.class, str);
            }

            public static ValueCase[] values() {
                return (ValueCase[]) f45552j.clone();
            }
        }

        public static final class a extends GeneratedMessageLite.b<Value, a> implements f {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(Value.DEFAULT_INSTANCE);
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.o(Value.class, value);
        }

        public static a G() {
            return (a) ((GeneratedMessageLite.b) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.f45663f));
        }

        public static void p(Value value, long j12) {
            value.valueCase_ = 4;
            value.value_ = Long.valueOf(j12);
        }

        public static void q(Value value, String str) {
            value.getClass();
            str.getClass();
            value.valueCase_ = 5;
            value.value_ = str;
        }

        public static void r(Value value, d.a aVar) {
            value.getClass();
            value.value_ = aVar.i();
            value.valueCase_ = 6;
        }

        public static void s(Value value, double d12) {
            value.valueCase_ = 7;
            value.value_ = Double.valueOf(d12);
        }

        public static void u(Value value, boolean z12) {
            value.valueCase_ = 1;
            value.value_ = Boolean.valueOf(z12);
        }

        public static void v(Value value, float f12) {
            value.valueCase_ = 2;
            value.value_ = Float.valueOf(f12);
        }

        public static void w(Value value, int i12) {
            value.valueCase_ = 3;
            value.value_ = Integer.valueOf(i12);
        }

        public static Value y() {
            return DEFAULT_INSTANCE;
        }

        public final float A() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        public final int B() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public final long C() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        public final String D() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        public final d E() {
            return this.valueCase_ == 6 ? (d) this.value_ : d.r();
        }

        public final ValueCase F() {
            switch (this.valueCase_) {
                case 0:
                    return ValueCase.f45551i;
                case 1:
                    return ValueCase.f45544b;
                case 2:
                    return ValueCase.f45545c;
                case 3:
                    return ValueCase.f45546d;
                case 4:
                    return ValueCase.f45547e;
                case 5:
                    return ValueCase.f45548f;
                case 6:
                    return ValueCase.f45549g;
                case 7:
                    return ValueCase.f45550h;
                default:
                    return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            a aVar = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.m(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", d.class});
                case 3:
                    return new Value();
                case 4:
                    return new a(aVar);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    X0<Value> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (Value.class) {
                            try {
                                cVar = PARSER;
                                if (cVar == null) {
                                    cVar = new GeneratedMessageLite.c<>();
                                    PARSER = cVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return cVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean x() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public final double z() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45553a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f45553a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45553a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45553a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45553a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45553a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45553a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45553a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile X0<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private C22941z0<String, Value> preferences_ = C22941z0.f45986c;

        public static final class a extends GeneratedMessageLite.b<b, a> implements c {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: androidx.datastore.preferences.PreferencesProto$b$b, reason: collision with other inner class name */
        public static final class C1776b {

            /* renamed from: a, reason: collision with root package name */
            public static final C22939y0<String, Value> f45554a = new C22939y0<>(WireFormat.FieldType.f45766l, WireFormat.FieldType.f45768n, Value.y());
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.o(b.class, bVar);
        }

        public static C22941z0 q(b bVar) {
            C22941z0<String, Value> c22941z0 = bVar.preferences_;
            if (!c22941z0.f45987b) {
                bVar.preferences_ = c22941z0.k();
            }
            return bVar.preferences_;
        }

        public static a s() {
            return (a) ((GeneratedMessageLite.b) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.f45663f));
        }

        public static b t(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
            GeneratedMessageLite generatedMessageLiteN = GeneratedMessageLite.n(DEFAULT_INSTANCE, AbstractC22940z.f(fileInputStream), T.a());
            if (generatedMessageLiteN.l()) {
                return (b) generatedMessageLiteN;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            a aVar = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.m(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C1776b.f45554a});
                case 3:
                    return new b();
                case 4:
                    return new a(aVar);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    X0<b> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (b.class) {
                            try {
                                cVar = PARSER;
                                if (cVar == null) {
                                    cVar = new GeneratedMessageLite.c<>();
                                    PARSER = cVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return cVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final Map<String, Value> r() {
            return Collections.unmodifiableMap(this.preferences_);
        }
    }

    public interface c extends G0 {
    }

    public static final class d extends GeneratedMessageLite<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        private static volatile X0<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private C22914m0.k<String> strings_ = GeneratedMessageLite.i();

        public static final class a extends GeneratedMessageLite.b<d, a> implements e {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.o(d.class, dVar);
        }

        public static void q(d dVar, Iterable iterable) {
            if (!dVar.strings_.isModifiable()) {
                C22914m0.k<String> kVar = dVar.strings_;
                int size = kVar.size();
                dVar.strings_ = kVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            }
            AbstractC22877a.c(iterable, dVar.strings_);
        }

        public static d r() {
            return DEFAULT_INSTANCE;
        }

        public static a t() {
            return (a) ((GeneratedMessageLite.b) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.f45663f));
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            a aVar = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.m(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 3:
                    return new d();
                case 4:
                    return new a(aVar);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    X0<d> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (d.class) {
                            try {
                                cVar = PARSER;
                                if (cVar == null) {
                                    cVar = new GeneratedMessageLite.c<>();
                                    PARSER = cVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return cVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final C22914m0.k s() {
            return this.strings_;
        }
    }

    public interface e extends G0 {
    }

    public interface f extends G0 {
    }
}

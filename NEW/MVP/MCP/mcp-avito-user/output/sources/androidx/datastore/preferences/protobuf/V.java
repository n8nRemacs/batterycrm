package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
final class V extends U<GeneratedMessageLite.g> {

    /* compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45752a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45752a = iArr;
            try {
                iArr[WireFormat.FieldType.f45758d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45752a[WireFormat.FieldType.f45759e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45752a[WireFormat.FieldType.f45760f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45752a[WireFormat.FieldType.f45761g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45752a[WireFormat.FieldType.f45762h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45752a[WireFormat.FieldType.f45763i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45752a[WireFormat.FieldType.f45764j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45752a[WireFormat.FieldType.f45765k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45752a[WireFormat.FieldType.f45770p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45752a[WireFormat.FieldType.f45772r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45752a[WireFormat.FieldType.f45773s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45752a[WireFormat.FieldType.f45774t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45752a[WireFormat.FieldType.f45775u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45752a[WireFormat.FieldType.f45771q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45752a[WireFormat.FieldType.f45769o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45752a[WireFormat.FieldType.f45766l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45752a[WireFormat.FieldType.f45767m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f45752a[WireFormat.FieldType.f45768n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.g) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final GeneratedMessageLite.h b(T t12, F0 f02, int i12) {
        t12.getClass();
        return t12.f45748a.get(new T.a(i12, f02));
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final C22884c0<GeneratedMessageLite.g> c(Object obj) {
        return ((GeneratedMessageLite.e) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final C22884c0<GeneratedMessageLite.g> d(Object obj) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        C22884c0<GeneratedMessageLite.g> c22884c0 = eVar.extensions;
        if (c22884c0.f45807b) {
            eVar.extensions = c22884c0.clone();
        }
        return eVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean e(F0 f02) {
        return f02 instanceof GeneratedMessageLite.e;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void f(Object obj) {
        ((GeneratedMessageLite.e) obj).extensions.j();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final Object g(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void h(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void i(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void j(Map.Entry entry) {
        ((GeneratedMessageLite.g) entry.getKey()).getClass();
        int[] iArr = a.f45752a;
        throw null;
    }
}

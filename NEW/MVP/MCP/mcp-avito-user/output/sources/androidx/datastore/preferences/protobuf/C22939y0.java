package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;

/* compiled from: MapEntryLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22939y0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final b<K, V> f45943a;

    /* compiled from: MapEntryLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45944a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45944a = iArr;
            try {
                iArr[WireFormat.FieldType.f45768n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45944a[WireFormat.FieldType.f45771q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45944a[WireFormat.FieldType.f45767m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MapEntryLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y0$b */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f45945a;

        /* renamed from: b, reason: collision with root package name */
        public final WireFormat.FieldType f45946b;

        /* renamed from: c, reason: collision with root package name */
        public final GeneratedMessageLite f45947c;

        public b(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
            this.f45945a = fieldType;
            this.f45946b = fieldType2;
            this.f45947c = generatedMessageLite;
        }
    }

    public C22939y0(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
        this.f45943a = new b<>(fieldType, fieldType2, generatedMessageLite);
    }

    public static <K, V> int a(b<K, V> bVar, K k12, V v12) {
        return C22884c0.b(bVar.f45945a, 1, k12) + C22884c0.b(bVar.f45946b, 2, v12);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, b<K, V> bVar, K k12, V v12) {
        C22884c0.m(codedOutputStream, bVar.f45945a, 1, k12);
        C22884c0.m(codedOutputStream, bVar.f45946b, 2, v12);
    }
}

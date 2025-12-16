package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* compiled from: MapEntryLite.java */
/* renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37694p0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final b<K, V> f362933a;

    /* renamed from: b, reason: collision with root package name */
    public final V f362934b;

    /* compiled from: MapEntryLite.java */
    /* renamed from: com.google.protobuf.p0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362935a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f362935a = iArr;
            try {
                iArr[WireFormat.FieldType.f362799n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362935a[WireFormat.FieldType.f362802q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362935a[WireFormat.FieldType.f362798m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MapEntryLite.java */
    /* renamed from: com.google.protobuf.p0$b */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f362936a;

        /* renamed from: b, reason: collision with root package name */
        public final WireFormat.FieldType f362937b;

        /* renamed from: c, reason: collision with root package name */
        public final V f362938c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
            this.f362936a = fieldType;
            this.f362937b = fieldType2;
            this.f362938c = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37694p0(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
        this.f362933a = new b<>(fieldType, fieldType2, obj);
        this.f362934b = obj;
    }

    public static <K, V> int a(b<K, V> bVar, K k12, V v12) {
        return V.c(bVar.f362936a, 1, k12) + V.c(bVar.f362937b, 2, v12);
    }
}

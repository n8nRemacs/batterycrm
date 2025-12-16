package com.avito.android.gson;

import Y61.k;
import Y61.l;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.m;
import com.google.gson.internal.y;
import com.google.gson.r;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NullSafeGson.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gson/NullSafeReflectiveTypeAdapterFactory;", "Lcom/google/gson/r;", "Adapter", "a", "b", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NullSafeReflectiveTypeAdapterFactory implements r {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Object f161313i;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f161314b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f161315c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AW.f f161316d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ReflectiveTypeAdapterFactory f161317e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final m f161318f = new m(C42784z0.f406748b, true, P0.c());

    /* renamed from: g, reason: collision with root package name */
    public Excluder f161319g;

    /* renamed from: h, reason: collision with root package name */
    public FieldNamingPolicy f161320h;

    /* compiled from: NullSafeGson.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gson/NullSafeReflectiveTypeAdapterFactory$Adapter;", "T", "Lcom/google/gson/TypeAdapter;", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final y<T> f161321a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f161322b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final TypeAdapter<T> f161323c;

        public Adapter(@k y yVar, @k LinkedHashMap linkedHashMap, @l TypeAdapter typeAdapter) {
            this.f161321a = yVar;
            this.f161322b = linkedHashMap;
            this.f161323c = typeAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
        @Override // com.google.gson.TypeAdapter
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final T read(@Y61.k com.google.gson.stream.a r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gson.NullSafeReflectiveTypeAdapterFactory.Adapter.read(com.google.gson.stream.a):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(@k com.google.gson.stream.c cVar, @l T t12) {
            G0 g02;
            TypeAdapter<T> typeAdapter = this.f161323c;
            if (typeAdapter != null) {
                typeAdapter.write(cVar, t12);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: NullSafeGson.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gson/NullSafeReflectiveTypeAdapterFactory$a;", "", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f161324a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Field f161325b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC42726C<TypeAdapter<? extends Object>> f161326c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final InterfaceC42726C<Map<String, Boolean>> f161327d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f161328e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ThreadLocal<Object> f161329f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k String str, @k Field field, @k InterfaceC42726C<? extends TypeAdapter<? extends Object>> interfaceC42726C, @k InterfaceC42726C<? extends Map<String, Boolean>> interfaceC42726C2, boolean z12) {
            this.f161324a = str;
            this.f161325b = field;
            this.f161326c = interfaceC42726C;
            this.f161327d = interfaceC42726C2;
            this.f161328e = z12;
            ThreadLocal<Object> threadLocal = new ThreadLocal<>();
            threadLocal.set(NullSafeReflectiveTypeAdapterFactory.f161313i);
            this.f161329f = threadLocal;
        }
    }

    /* compiled from: NullSafeGson.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gson/NullSafeReflectiveTypeAdapterFactory$b;", "", "<init>", "()V", "ABSENT_VALUE", "Ljava/lang/Object;", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f161313i = new Object();
    }

    public NullSafeReflectiveTypeAdapterFactory(boolean z12, boolean z13, @k AW.f fVar, @l ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory) {
        this.f161314b = z12;
        this.f161315c = z13;
        this.f161316d = fVar;
        this.f161317e = reflectiveTypeAdapterFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    @Override // com.google.gson.r
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.google.gson.TypeAdapter<T> a(@Y61.k com.google.gson.Gson r29, @Y61.k com.google.gson.reflect.a<T> r30) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gson.NullSafeReflectiveTypeAdapterFactory.a(com.google.gson.Gson, com.google.gson.reflect.a):com.google.gson.TypeAdapter");
    }
}

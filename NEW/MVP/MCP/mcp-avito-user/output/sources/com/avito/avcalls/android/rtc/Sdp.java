package com.avito.avcalls.android.rtc;

import androidx.compose.runtime.C22026a;
import kotlin.C42727D;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;

/* compiled from: Sdp.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0003\r\f\u000eB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/avcalls/android/rtc/Sdp;", "", "", "seen1", "Lcom/avito/avcalls/android/rtc/Sdp$Type;", "type", "", "text", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/android/rtc/Sdp$Type;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "Type", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w
/* loaded from: classes5.dex */
public final /* data */ class Sdp {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Type f331883a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f331884b;

    /* compiled from: Sdp.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/rtc/Sdp$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/rtc/Sdp;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<Sdp> serializer() {
            return Sdp$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Sdp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/Sdp$Type;", "", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final class Type {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Object f331885b;

        /* renamed from: c, reason: collision with root package name */
        @kotlinx.serialization.v
        public static final Type f331886c;

        /* renamed from: d, reason: collision with root package name */
        @kotlinx.serialization.v
        public static final Type f331887d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f331888e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331889f;

        /* compiled from: Sdp.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/rtc/Sdp$Type$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/rtc/Sdp$Type;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
            @Y61.k
            public final KSerializer<Type> serializer() {
                return (KSerializer) Type.f331885b.getValue();
            }

            public Companion() {
            }
        }

        /* compiled from: Sdp.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.a<KSerializer<Object>> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f331890l = new a();

            public a() {
                super(0);
            }

            @Override // Y41.a
            public final KSerializer<Object> invoke() {
                return Sdp$Type$$serializer.INSTANCE;
            }
        }

        static {
            Type type = new Type("OFFER", 0);
            f331886c = type;
            Type type2 = new Type("ANSWER", 1);
            f331887d = type2;
            Type[] typeArr = {type, type2};
            f331888e = typeArr;
            f331889f = kotlin.enums.c.a(typeArr);
            INSTANCE = new Companion(null);
            f331885b = C42727D.b(LazyThreadSafetyMode.f406615c, a.f331890l);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f331888e.clone();
        }
    }

    @InterfaceC42830m
    public /* synthetic */ Sdp(int i12, Type type, String str, P0 p02) {
        if (3 != (i12 & 3)) {
            E0.b(i12, 3, Sdp$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f331883a = type;
        this.f331884b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sdp)) {
            return false;
        }
        Sdp sdp = (Sdp) obj;
        return this.f331883a == sdp.f331883a && L.f(this.f331884b, sdp.f331884b);
    }

    public final int hashCode() {
        return this.f331884b.hashCode() + (this.f331883a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Sdp(type=");
        sb2.append(this.f331883a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f331884b, ')');
    }

    public Sdp(@Y61.k Type type, @Y61.k String str) {
        this.f331883a = type;
        this.f331884b = str;
    }
}

package com.avito.avcalls.rtc.connecting;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.avcalls.logger.g;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: Sdp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u000e\u0010B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/Sdp;", "", "", "seen1", "Lcom/avito/avcalls/rtc/connecting/Sdp$Type;", "type", "", "text", "Lcom/avito/avcalls/utils/UUID;", "hash", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/rtc/connecting/Sdp$Type;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "Type", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class Sdp {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Type f333072a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333073b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f333074c;

    /* compiled from: Sdp.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/Sdp$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/rtc/connecting/Sdp;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<Sdp> serializer() {
            return Sdp$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Sdp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/Sdp$Type;", "", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final class Type {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Object f333075b;

        /* renamed from: c, reason: collision with root package name */
        @v
        public static final Type f333076c;

        /* renamed from: d, reason: collision with root package name */
        @v
        public static final Type f333077d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f333078e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f333079f;

        /* compiled from: Sdp.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/Sdp$Type$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/rtc/connecting/Sdp$Type;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
            @k
            public final KSerializer<Type> serializer() {
                return (KSerializer) Type.f333075b.getValue();
            }

            public Companion() {
            }
        }

        /* compiled from: Sdp.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.a<KSerializer<Object>> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f333080l = new a();

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
            f333076c = type;
            Type type2 = new Type("ANSWER", 1);
            f333077d = type2;
            Type[] typeArr = {type, type2};
            f333078e = typeArr;
            f333079f = kotlin.enums.c.a(typeArr);
            INSTANCE = new Companion(null);
            f333075b = C42727D.b(LazyThreadSafetyMode.f406615c, a.f333080l);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f333078e.clone();
        }
    }

    @InterfaceC42830m
    public Sdp(int i12, Type type, String str, String str2, P0 p02) {
        if (3 != (i12 & 3)) {
            E0.b(i12, 3, Sdp$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f333072a = type;
        this.f333073b = str;
        if ((i12 & 4) == 0) {
            this.f333074c = C43066x.t0(8, UUID.randomUUID().toString());
        } else {
            this.f333074c = str2;
        }
        g.f332960a.getClass();
        g.b("Sdp_init()", this + ": text=" + str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sdp)) {
            return false;
        }
        Sdp sdp = (Sdp) obj;
        return this.f333072a == sdp.f333072a && L.f(this.f333073b, sdp.f333073b);
    }

    public final int hashCode() {
        return this.f333073b.hashCode() + (this.f333072a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Sdp(type=");
        sb2.append(this.f333072a);
        sb2.append(", hash=");
        return C22026a.c(sb2, this.f333074c, ')');
    }

    public Sdp(@k Type type, @k String str) {
        this.f333072a = type;
        this.f333073b = str;
        this.f333074c = C43066x.t0(8, UUID.randomUUID().toString());
        g.f332960a.getClass();
        g.b("Sdp_init()", this + ": text=" + str);
    }
}

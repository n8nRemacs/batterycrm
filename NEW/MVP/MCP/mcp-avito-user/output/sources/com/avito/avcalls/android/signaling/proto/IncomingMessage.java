package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import Y61.l;
import kotlin.C42727D;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.w;

/* compiled from: IncomingMessage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0003\r\f\u000eB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/IncomingMessage;", "Lcom/avito/avcalls/android/signaling/a;", "", "seen1", "Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;", "type", "Lkotlinx/serialization/json/JsonElement;", "data", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "IncomingMessageType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class IncomingMessage implements com.avito.avcalls.android.signaling.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IncomingMessageType f332107a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JsonElement f332108b;

    /* compiled from: IncomingMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/IncomingMessage;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<IncomingMessage> serializer() {
            return IncomingMessage$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IncomingMessage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;", "", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final class IncomingMessageType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Object f332109b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IncomingMessageType[] f332110c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f332111d;

        /* compiled from: IncomingMessage.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
            @k
            public final KSerializer<IncomingMessageType> serializer() {
                return (KSerializer) IncomingMessageType.f332109b.getValue();
            }

            public Companion() {
            }
        }

        /* compiled from: IncomingMessage.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.a<KSerializer<Object>> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f332112l = new a();

            public a() {
                super(0);
            }

            @Override // Y41.a
            public final KSerializer<Object> invoke() {
                return IncomingMessage$IncomingMessageType$$serializer.INSTANCE;
            }
        }

        static {
            IncomingMessageType[] incomingMessageTypeArr = {new IncomingMessageType("PUSH", 0), new IncomingMessageType("MSG", 1), new IncomingMessageType("NOOP", 2)};
            f332110c = incomingMessageTypeArr;
            f332111d = c.a(incomingMessageTypeArr);
            INSTANCE = new Companion(null);
            f332109b = C42727D.b(LazyThreadSafetyMode.f406615c, a.f332112l);
        }

        public IncomingMessageType() {
            throw null;
        }

        public static IncomingMessageType valueOf(String str) {
            return (IncomingMessageType) Enum.valueOf(IncomingMessageType.class, str);
        }

        public static IncomingMessageType[] values() {
            return (IncomingMessageType[]) f332110c.clone();
        }
    }

    @InterfaceC42830m
    public /* synthetic */ IncomingMessage(int i12, IncomingMessageType incomingMessageType, JsonElement jsonElement, P0 p02) {
        if (1 != (i12 & 1)) {
            E0.b(i12, 1, IncomingMessage$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f332107a = incomingMessageType;
        if ((i12 & 2) == 0) {
            this.f332108b = new JsonObject(kotlin.collections.P0.c());
        } else {
            this.f332108b = jsonElement;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomingMessage)) {
            return false;
        }
        IncomingMessage incomingMessage = (IncomingMessage) obj;
        return this.f332107a == incomingMessage.f332107a && L.f(this.f332108b, incomingMessage.f332108b);
    }

    public final int hashCode() {
        return this.f332108b.hashCode() + (this.f332107a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "IncomingMessage(type=" + this.f332107a + ", data=" + this.f332108b + ')';
    }

    public IncomingMessage(IncomingMessageType incomingMessageType, JsonElement jsonElement, int i12, C42822w c42822w) {
        jsonElement = (i12 & 2) != 0 ? new JsonObject(kotlin.collections.P0.c()) : jsonElement;
        this.f332107a = incomingMessageType;
        this.f332108b = jsonElement;
    }
}

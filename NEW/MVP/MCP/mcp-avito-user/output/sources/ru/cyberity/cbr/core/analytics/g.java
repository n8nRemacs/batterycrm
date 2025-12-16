package ru.cyberity.cbr.core.analytics;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.C42729a0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.r;
import kotlin.reflect.t;
import kotlin.text.C43047d;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.serialization.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43411k;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.common.g0;
import ru.cyberity.cbr.core.common.u;
import ru.cyberity.cbr.core.data.model.CBRTrackEvents;

/* compiled from: CBRAnalyticSink.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\f\u0019B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010J)\u0010\f\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0014J\u001b\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/analytics/g;", "Lru/cyberity/log/cacher/a;", "", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "Lru/cyberity/cbr/core/data/source/analythic/b;", "analyticService", "Lkotlin/Function0;", "Ljava/util/UUID;", "sessionIdProvider", "<init>", "(Lru/cyberity/cbr/core/data/source/analythic/b;LY41/a;)V", "", "a", "()[B", "value", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "outputStream", "Lkotlin/G0;", "(Ljava/util/List;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/analythic/b;", "b", "LY41/a;", "Lkotlinx/serialization/json/a;", "c", "Lkotlinx/serialization/json/a;", "json", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g implements ru.cyberity.log.cacher.a<List<? extends CBRTrackEvents>> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private static final b f432544d = new b(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.analythic.b analyticService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Y41.a<UUID> sessionIdProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final AbstractC43443a json = g0.a(false, 1, null);

    /* compiled from: CBRAnalyticSink.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0013\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/core/analytics/g$a;", "", "", "sessionId", "", "data", "<init>", "(Ljava/lang/String;[B)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;[BLkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/analytics/g$a;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getSessionId$annotations", "()V", "b", "[B", "()[B", "getData$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final class a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String sessionId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final byte[] data;

        /* compiled from: CBRAnalyticSink.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/analytics/CBRAnalyticSink.CacheItem.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/analytics/g$a;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/analytics/g$a;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/analytics/g$a;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        /* renamed from: ru.cyberity.cbr.core.analytics.g$a$a, reason: collision with other inner class name */
        public static final class C12430a implements N<a> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12430a f432550a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f432551b;

            static {
                C12430a c12430a = new C12430a();
                f432550a = c12430a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.analytics.CBRAnalyticSink.CacheItem", c12430a, 2);
                pluginGeneratedSerialDescriptor.j("sessionId", false);
                pluginGeneratedSerialDescriptor.j("data", false);
                f432551b = pluginGeneratedSerialDescriptor;
            }

            private C12430a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f412706c = getF332717a();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
                P0 p02 = null;
                boolean z12 = true;
                int i12 = 0;
                String strS = null;
                Object objV = null;
                while (z12) {
                    int iJ2 = cVarC.j(f412706c);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else if (iJ2 == 0) {
                        strS = cVarC.s(f412706c, 0);
                        i12 |= 1;
                    } else {
                        if (iJ2 != 1) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objV = cVarC.v(f412706c, 1, C43411k.f412876c, objV);
                        i12 |= 2;
                    }
                }
                cVarC.d(f412706c);
                return new a(i12, strS, (byte[]) objV, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{V0.f412822a, C43411k.f412876c};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return f432551b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k a value) {
                SerialDescriptor f412706c = getF332717a();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
                a.a(value, dVarC, f412706c);
                dVarC.d(f412706c);
            }
        }

        /* compiled from: CBRAnalyticSink.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/analytics/g$a$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/analytics/g$a;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.analytics.g$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<a> serializer() {
                return C12430a.f432550a;
            }

            private Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ a(int i12, @v String str, @v byte[] bArr, P0 p02) {
            if (3 != (i12 & 3)) {
                E0.b(i12, 3, C12430a.f432550a.getF332717a());
                throw null;
            }
            this.sessionId = str;
            this.data = bArr;
        }

        @X41.n
        public static final void a(@Y61.k a self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            output.l(serialDesc, 0, self.sessionId);
            output.F(serialDesc, 1, C43411k.f412876c, self.data);
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public a(@Y61.k String str, @Y61.k byte[] bArr) {
            this.sessionId = str;
            this.data = bArr;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }
    }

    /* compiled from: CBRAnalyticSink.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/analytics/g$b;", "", "", "CLIENT_ERROR_LOWER", "I", "CLIENT_ERROR_UPPER", "KEY_LENGTH", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: CBRAnalyticSink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.analytics.CBRAnalyticSink$prepareForCache$2", f = "CBRAnalyticSink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432552a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<CBRTrackEvents> f432554c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OutputStream f432555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<CBRTrackEvents> list, OutputStream outputStream, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f432554c = list;
            this.f432555d = outputStream;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return g.this.new c(this.f432554c, this.f432555d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String string;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432552a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            AbstractC43443a abstractC43443a = g.this.json;
            List<CBRTrackEvents> list = this.f432554c;
            kotlinx.serialization.modules.f fVar = abstractC43443a.f412956b;
            t.a aVar = t.f410463c;
            r rVarC = m0.c(CBRTrackEvents.class);
            aVar.getClass();
            t tVarA = t.a.a(rVarC);
            n0 n0Var = m0.f406844a;
            String strC = abstractC43443a.c(C.e(fVar, n0Var.m(n0Var.b(List.class), Collections.singletonList(tVarA), false)), list);
            UUID uuid = (UUID) g.this.sessionIdProvider.invoke();
            if (uuid == null || (string = uuid.toString()) == null) {
                return kotlin.G0.f406611a;
            }
            byte[] bArrA = g.this.a();
            if (bArrA == null) {
                return kotlin.G0.f406611a;
            }
            a aVar2 = new a(string, u.b(strC.getBytes(C43047d.f410589b), bArrA));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f432555d);
            try {
                AbstractC43443a abstractC43443a2 = g.this.json;
                outputStreamWriter.write(abstractC43443a2.c(C.e(abstractC43443a2.f412956b, m0.c(a.class)), aVar2));
                kotlin.G0 g02 = kotlin.G0.f406611a;
                kotlin.io.c.a(outputStreamWriter, null);
                return kotlin.G0.f406611a;
            } finally {
            }
        }
    }

    /* compiled from: CBRAnalyticSink.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.analytics.CBRAnalyticSink", f = "CBRAnalyticSink.kt", i = {}, l = {83}, m = "resendFromCache", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432556a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432557b;

        /* renamed from: d, reason: collision with root package name */
        int f432559d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432557b = obj;
            this.f432559d |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.this.a((InputStream) null, this);
        }
    }

    /* compiled from: CBRAnalyticSink.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.analytics.CBRAnalyticSink", f = "CBRAnalyticSink.kt", i = {}, l = {43}, m = "send", n = {}, s = {})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f432560a;

        /* renamed from: c, reason: collision with root package name */
        int f432562c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432560a = obj;
            this.f432562c |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.this.a((List<CBRTrackEvents>) null, this);
        }
    }

    public g(@Y61.k ru.cyberity.cbr.core.data.source.analythic.b bVar, @Y61.k Y41.a<UUID> aVar) {
        this.analyticService = bVar;
        this.sessionIdProvider = aVar;
    }

    @Override // ru.cyberity.log.cacher.c
    public /* bridge */ /* synthetic */ Object send(Object obj, Continuation continuation) {
        return a((List<CBRTrackEvents>) obj, (Continuation<? super Boolean>) continuation);
    }

    @Override // ru.cyberity.log.cacher.a
    public /* bridge */ /* synthetic */ Object a(List<? extends CBRTrackEvents> list, OutputStream outputStream, Continuation continuation) {
        return a2((List<CBRTrackEvents>) list, outputStream, (Continuation<? super kotlin.G0>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.util.List<ru.cyberity.cbr.core.data.model.CBRTrackEvents> r13, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ru.cyberity.cbr.core.analytics.g.e
            if (r0 == 0) goto L13
            r0 = r14
            ru.cyberity.cbr.core.analytics.g$e r0 = (ru.cyberity.cbr.core.analytics.g.e) r0
            int r1 = r0.f432562c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432562c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.analytics.g$e r0 = new ru.cyberity.cbr.core.analytics.g$e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f432560a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432562c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto La4
        L2b:
            r13 = move-exception
            goto Lb5
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.C42729a0.b(r14)
            Y41.a<java.util.UUID> r14 = r12.sessionIdProvider
            java.lang.Object r14 = r14.invoke()
            java.util.UUID r14 = (java.util.UUID) r14
            if (r14 == 0) goto L48
            java.lang.String r14 = r14.toString()
            goto L49
        L48:
            r14 = 0
        L49:
            byte[] r2 = r12.a()
            if (r14 == 0) goto Lc3
            if (r2 != 0) goto L52
            goto Lc3
        L52:
            kotlinx.serialization.json.a r5 = r12.json     // Catch: java.lang.Throwable -> L2b
            kotlinx.serialization.modules.f r6 = r5.f412956b     // Catch: java.lang.Throwable -> L2b
            kotlin.reflect.t$a r7 = kotlin.reflect.t.f410463c     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<ru.cyberity.cbr.core.data.model.CBRTrackEvents> r8 = ru.cyberity.cbr.core.data.model.CBRTrackEvents.class
            kotlin.reflect.r r8 = kotlin.jvm.internal.m0.c(r8)     // Catch: java.lang.Throwable -> L2b
            r7.getClass()     // Catch: java.lang.Throwable -> L2b
            kotlin.reflect.t r7 = kotlin.reflect.t.a.a(r8)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.n0 r8 = kotlin.jvm.internal.m0.f406844a     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<java.util.List> r9 = java.util.List.class
            kotlin.reflect.d r9 = r8.b(r9)     // Catch: java.lang.Throwable -> L2b
            java.util.List r7 = java.util.Collections.singletonList(r7)     // Catch: java.lang.Throwable -> L2b
            kotlin.reflect.r r7 = r8.m(r9, r7, r3)     // Catch: java.lang.Throwable -> L2b
            kotlinx.serialization.KSerializer r6 = kotlinx.serialization.C.e(r6, r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = r5.c(r6, r13)     // Catch: java.lang.Throwable -> L2b
            java.nio.charset.Charset r5 = kotlin.text.C43047d.f410589b     // Catch: java.lang.Throwable -> L2b
            byte[] r13 = r13.getBytes(r5)     // Catch: java.lang.Throwable -> L2b
            byte[] r6 = ru.cyberity.cbr.core.common.u.b(r13, r2)     // Catch: java.lang.Throwable -> L2b
            okhttp3.RequestBody$Companion r5 = okhttp3.RequestBody.INSTANCE     // Catch: java.lang.Throwable -> L2b
            okhttp3.MediaType$Companion r13 = okhttp3.MediaType.INSTANCE     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "application/octet-stream"
            okhttp3.MediaType r7 = r13.get(r2)     // Catch: java.lang.Throwable -> L2b
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            okhttp3.RequestBody r13 = okhttp3.RequestBody.Companion.create$default(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2b
            ru.cyberity.cbr.core.data.source.analythic.b r2 = r12.analyticService     // Catch: java.lang.Throwable -> L2b
            r0.f432562c = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r14 = r2.a(r14, r13, r0)     // Catch: java.lang.Throwable -> L2b
            if (r14 != r1) goto La4
            return r1
        La4:
            ru.cyberity.cbr.core.data.source.applicant.remote.f r14 = (ru.cyberity.cbr.core.data.source.applicant.remote.f) r14     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r13 = r14.getOk()     // Catch: java.lang.Throwable -> L2b
            if (r13 != 0) goto Lad
            goto Lbe
        Lad:
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L2b
            if (r13 != r4) goto Lbe
            r3 = r4
            goto Lbe
        Lb5:
            ru.cyberity.log.a r14 = ru.cyberity.log.a.f436064a
            java.lang.String r0 = "RealAnalyticsRepository"
            java.lang.String r1 = "send failed "
            r14.w(r0, r1, r13)
        Lbe:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r13
        Lc3:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.analytics.g.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.l
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(@Y61.k List<CBRTrackEvents> list, @Y61.k OutputStream outputStream, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objG = C43259k.g(C43262l0.f411947c, new c(list, outputStream, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : kotlin.G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[Catch: all -> 0x0037, TryCatch #4 {all -> 0x0037, blocks: (B:12:0x0033, B:28:0x0095, B:56:0x00e9, B:31:0x009e, B:40:0x00b0, B:41:0x00b6, B:43:0x00bc, B:47:0x00c6, B:49:0x00cc, B:53:0x00d6, B:55:0x00e4), top: B:76:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: all -> 0x0037, TryCatch #4 {all -> 0x0037, blocks: (B:12:0x0033, B:28:0x0095, B:56:0x00e9, B:31:0x009e, B:40:0x00b0, B:41:0x00b6, B:43:0x00bc, B:47:0x00c6, B:49:0x00cc, B:53:0x00d6, B:55:0x00e4), top: B:76:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation, ru.cyberity.cbr.core.analytics.g$d] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    @Override // ru.cyberity.log.cacher.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.io.InputStream r19, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.analytics.g.a(java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a() {
        UUID uuidInvoke = this.sessionIdProvider.invoke();
        String string = uuidInvoke != null ? uuidInvoke.toString() : null;
        if (string != null && string.length() != 0) {
            byte[] bArrCopyOf = Arrays.copyOf(string.getBytes(C43047d.f410589b), 16);
            if (bArrCopyOf.length == 0) {
                return bArrCopyOf;
            }
            byte[] bArr = new byte[bArrCopyOf.length];
            int length = bArrCopyOf.length - 1;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    bArr[length - i12] = bArrCopyOf[i12];
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            return bArr;
        }
        ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "RealAnalyticsRepository", "Got empty session id", null, 4, null);
        return null;
    }
}

package ru.cyberity.cbr.core.common;

import Y01.e;
import android.content.Context;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.serialization.C;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.z;
import ru.cyberity.cbr.core.data.model.LogParams;

/* compiled from: CBRExceptionSink.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0014J\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u000b\u0010%R#\u0010*\u001a\n (*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001b\u0010)R#\u0010.\u001a\n (*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b\u001f\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/common/m;", "Lru/cyberity/log/cacher/a;", "Lru/cyberity/cbr/core/data/model/LogParams;", "Landroid/content/Context;", "context", "", ContextActionHandler.Link.URL, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Ljava/io/InputStream;", "inputStream", "b", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "a", "(Lru/cyberity/cbr/core/data/model/LogParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "outputStream", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/LogParams;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "()Landroid/content/Context;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lkotlinx/serialization/json/a;", "c", "Lkotlinx/serialization/json/a;", "json", "Lru/cyberity/cbr/core/data/source/settings/b;", "d", "Lkotlin/C;", "e", "()Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lokhttp3/OkHttpClient;", "()Lokhttp3/OkHttpClient;", "okHttpClient", "Lretrofit2/z;", "kotlin.jvm.PlatformType", "()Lretrofit2/z;", "retrofit", "Lru/cyberity/cbr/core/data/source/log/b;", "g", "()Lru/cyberity/cbr/core/data/source/log/b;", "service", "h", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class m implements ru.cyberity.log.cacher.a<LogParams> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final AbstractC43443a json = g0.a(false, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C settingsRepository = C42727D.c(new i());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C okHttpClient = C42727D.c(new b());

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C retrofit = C42727D.c(new f());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C service = C42727D.c(new h());

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRExceptionSink$prepareForCache$2", f = "CBRExceptionSink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f432757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f432758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LogParams f432759d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(OutputStream outputStream, m mVar, LogParams logParams, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f432757b = outputStream;
            this.f432758c = mVar;
            this.f432759d = logParams;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f432757b, this.f432758c, this.f432759d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432756a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f432757b);
            m mVar = this.f432758c;
            LogParams logParams = this.f432759d;
            try {
                AbstractC43443a abstractC43443a = mVar.json;
                outputStreamWriter.write(abstractC43443a.c(C.e(abstractC43443a.f412956b, kotlin.jvm.internal.m0.c(LogParams.class)), logParams));
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(outputStreamWriter, null);
                return G0.f406611a;
            } finally {
            }
        }
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRExceptionSink", f = "CBRExceptionSink.kt", i = {0}, l = {103, 103}, m = "resendFromCache", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432760a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432761b;

        /* renamed from: d, reason: collision with root package name */
        int f432763d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432761b = obj;
            this.f432763d |= BeduinInputModel.MIN_TEXT_VERSION;
            return m.this.a((InputStream) null, this);
        }
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/cyberity/cbr/core/data/model/LogParams;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/cbr/core/data/model/LogParams;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRExceptionSink$restoreParams$2", f = "CBRExceptionSink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super LogParams>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432764a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432765b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputStream f432766c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f432767d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InputStream inputStream, m mVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f432766c = inputStream;
            this.f432767d = mVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super LogParams> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f432766c, this.f432767d, continuation);
            eVar.f432765b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            LogParams logParams;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432764a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            T t12 = (T) this.f432765b;
            InputStreamReader inputStreamReader = new InputStreamReader(this.f432766c);
            try {
                try {
                    AbstractC43443a abstractC43443a = this.f432767d.json;
                    logParams = (LogParams) abstractC43443a.d(kotlin.io.w.c(inputStreamReader), C.e(abstractC43443a.f412956b, kotlin.jvm.internal.m0.c(LogParams.class)));
                } finally {
                }
            } catch (Exception e12) {
                ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(t12), "Can't restore params", e12);
                logParams = null;
            }
            kotlin.io.c.a(inputStreamReader, null);
            return logParams;
        }
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/z;", "kotlin.jvm.PlatformType", "a", "()Lretrofit2/z;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<retrofit2.z> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final retrofit2.z invoke() {
            z.b bVar = new z.b();
            bVar.c(m.this.getUrl());
            OkHttpClient okHttpClientB = m.this.b();
            Objects.requireNonNull(okHttpClientB, "client == null");
            bVar.f430133b = okHttpClientB;
            bVar.b(new Y01.b(MediaType.INSTANCE.get("application/json"), new e.b(m.this.json)));
            return bVar.e();
        }
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CBRExceptionSink", f = "CBRExceptionSink.kt", i = {}, l = {76}, m = "send", n = {}, s = {})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f432769a;

        /* renamed from: c, reason: collision with root package name */
        int f432771c;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432769a = obj;
            this.f432771c |= BeduinInputModel.MIN_TEXT_VERSION;
            return m.this.a((LogParams) null, this);
        }
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/source/log/b;", "kotlin.jvm.PlatformType", "a", "()Lru/cyberity/cbr/core/data/source/log/b;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends N implements Y41.a<ru.cyberity.cbr.core.data.source.log.b> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.log.b invoke() {
            return (ru.cyberity.cbr.core.data.source.log.b) m.this.c().b(ru.cyberity.cbr.core.data.source.log.b.class);
        }
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/cyberity/cbr/core/data/source/settings/a;", "a", "()Lru/cyberity/cbr/core/data/source/settings/a;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends N implements Y41.a<ru.cyberity.cbr.core.data.source.settings.a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.core.data.source.settings.a invoke() {
            return new ru.cyberity.cbr.core.data.source.settings.a(m.this.getContext().getSharedPreferences("cyberity_mobile_sdk", 0));
        }
    }

    public m(@Y61.k Context context, @Y61.k String str) {
        this.context = context;
        this.url = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.settings.b e() {
        return (ru.cyberity.cbr.core.data.source.settings.b) this.settingsRepository.getValue();
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // ru.cyberity.log.cacher.c
    public /* bridge */ /* synthetic */ Object send(Object obj, Continuation continuation) {
        return a((LogParams) obj, (Continuation<? super Boolean>) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient b() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final retrofit2.z c() {
        return (retrofit2.z) this.retrofit.getValue();
    }

    private final ru.cyberity.cbr.core.data.source.log.b d() {
        return (ru.cyberity.cbr.core.data.source.log.b) this.service.getValue();
    }

    @Override // ru.cyberity.log.cacher.a
    public /* bridge */ /* synthetic */ Object a(LogParams logParams, OutputStream outputStream, Continuation continuation) {
        return a2(logParams, outputStream, (Continuation<? super G0>) continuation);
    }

    private final Object b(InputStream inputStream, Continuation<? super LogParams> continuation) {
        return C43259k.g(C43262l0.f411947c, new e(inputStream, this, null), continuation);
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.core.data.model.LogParams r5, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.common.m.g
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.common.m$g r0 = (ru.cyberity.cbr.core.common.m.g) r0
            int r1 = r0.f432771c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432771c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.common.m$g r0 = new ru.cyberity.cbr.core.common.m$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f432769a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432771c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Exception -> L4b
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            ru.cyberity.cbr.core.data.source.log.b r6 = r4.d()     // Catch: java.lang.Exception -> L4b
            ru.cyberity.cbr.core.data.model.LogType r2 = ru.cyberity.cbr.core.data.model.LogType.Error     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Exception -> L4b
            java.util.Map r5 = ru.cyberity.cbr.core.data.model.s.a(r5)     // Catch: java.lang.Exception -> L4b
            r0.f432771c = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Object r5 = r6.a(r2, r5, r0)     // Catch: java.lang.Exception -> L4b
            if (r5 != r1) goto L4c
            return r1
        L4b:
            r3 = 0
        L4c:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.m.a(ru.cyberity.cbr.core.data.model.LogParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.log.cacher.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.io.InputStream r6, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.common.m.d
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.common.m$d r0 = (ru.cyberity.cbr.core.common.m.d) r0
            int r1 = r0.f432763d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432763d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.common.m$d r0 = new ru.cyberity.cbr.core.common.m$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f432761b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432763d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f432760a
            ru.cyberity.cbr.core.common.m r6 = (ru.cyberity.cbr.core.common.m) r6
            kotlin.C42729a0.b(r7)
            goto L4b
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f432760a = r5
            r0.f432763d = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            ru.cyberity.cbr.core.data.model.LogParams r7 = (ru.cyberity.cbr.core.data.model.LogParams) r7
            if (r7 == 0) goto L62
            r2 = 0
            r0.f432760a = r2
            r0.f432763d = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            goto L63
        L62:
            r6 = 0
        L63:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.m.a(java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: CBRExceptionSink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/OkHttpClient;", "a", "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<OkHttpClient> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderAddInterceptor = builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).addInterceptor(new ru.cyberity.cbr.core.data.network.interceptor.a(m.this.e()));
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new A());
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            return builderAddInterceptor.addInterceptor(httpLoggingInterceptor).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(String str) {
            System.out.println((Object) str);
        }
    }

    @Y61.l
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(@Y61.k LogParams logParams, @Y61.k OutputStream outputStream, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(C43262l0.f411947c, new c(outputStream, this, logParams, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}

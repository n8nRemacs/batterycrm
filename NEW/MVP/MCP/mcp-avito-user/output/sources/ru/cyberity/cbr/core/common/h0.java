package ru.cyberity.cbr.core.common;

import android.util.Log;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Executors;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.serialization.C;
import kotlinx.serialization.json.AbstractC43443a;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.LogParams;
import ru.cyberity.cbr.core.data.model.LogType;
import ru.cyberity.log.logger.Logger;

/* compiled from: KibanaLogger.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0014\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J)\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0014\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"¨\u0006#"}, d2 = {"Lru/cyberity/cbr/core/common/h0;", "Lru/cyberity/log/logger/Logger;", "Lru/cyberity/cbr/core/data/source/log/a;", "logRepository", "", "applicantId", "Ljava/io/File;", "cacheDir", "Lru/cyberity/log/cacher/e;", "Lru/cyberity/cbr/core/data/model/LogParams;", "sink", "<init>", "(Lru/cyberity/cbr/core/data/source/log/a;Ljava/lang/String;Ljava/io/File;Lru/cyberity/log/cacher/e;)V", "", "severity", "tag", "message", "", "throwable", "Lkotlin/G0;", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lru/cyberity/cbr/core/data/model/LogParams;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "d", "i", "v", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Lru/cyberity/log/cacher/e;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class h0 implements Logger {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private static final T f432665e = U.a(new C43315z0(Executors.newSingleThreadExecutor()));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private String applicantId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.log.cacher.e<LogParams> sink;

    /* compiled from: KibanaLogger.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012J\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lru/cyberity/cbr/core/common/h0$b;", "Lru/cyberity/log/cacher/a;", "Lru/cyberity/cbr/core/data/model/LogParams;", "Lru/cyberity/cbr/core/data/source/log/a;", "logRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/log/a;)V", "Ljava/io/InputStream;", "inputStream", "b", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "a", "(Lru/cyberity/cbr/core/data/model/LogParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "outputStream", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/LogParams;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/log/a;", "Lkotlinx/serialization/json/a;", "Lkotlinx/serialization/json/a;", "json", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements ru.cyberity.log.cacher.a<LogParams> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.data.source.log.a logRepository;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final AbstractC43443a json = g0.a(false, 1, null);

        /* compiled from: KibanaLogger.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.common.KibanaLogger$KibanaSink$prepareForCache$2", f = "KibanaLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OutputStream f432671b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f432672c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LogParams f432673d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OutputStream outputStream, b bVar, LogParams logParams, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f432671b = outputStream;
                this.f432672c = bVar;
                this.f432673d = logParams;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f432671b, this.f432672c, this.f432673d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432670a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f432671b);
                b bVar = this.f432672c;
                LogParams logParams = this.f432673d;
                try {
                    AbstractC43443a abstractC43443a = bVar.json;
                    outputStreamWriter.write(abstractC43443a.c(C.e(abstractC43443a.f412956b, kotlin.jvm.internal.m0.c(LogParams.class)), logParams));
                    G0 g02 = G0.f406611a;
                    kotlin.io.c.a(outputStreamWriter, null);
                    return G0.f406611a;
                } finally {
                }
            }
        }

        /* compiled from: KibanaLogger.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "ru.cyberity.cbr.core.common.KibanaLogger$KibanaSink", f = "KibanaLogger.kt", i = {0}, l = {134, 134}, m = "resendFromCache", n = {"this"}, s = {"L$0"})
        /* renamed from: ru.cyberity.cbr.core.common.h0$b$b, reason: collision with other inner class name */
        public static final class C12435b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f432674a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f432675b;

            /* renamed from: d, reason: collision with root package name */
            int f432677d;

            public C12435b(Continuation<? super C12435b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f432675b = obj;
                this.f432677d |= BeduinInputModel.MIN_TEXT_VERSION;
                return b.this.a((InputStream) null, this);
            }
        }

        /* compiled from: KibanaLogger.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/cyberity/cbr/core/data/model/LogParams;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/cbr/core/data/model/LogParams;"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.common.KibanaLogger$KibanaSink$restoreParams$2", f = "KibanaLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super LogParams>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432678a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InputStream f432679b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f432680c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InputStream inputStream, b bVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f432679b = inputStream;
                this.f432680c = bVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super LogParams> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f432679b, this.f432680c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                LogParams logParams;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432678a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                InputStreamReader inputStreamReader = new InputStreamReader(this.f432679b);
                try {
                    try {
                        AbstractC43443a abstractC43443a = this.f432680c.json;
                        logParams = (LogParams) abstractC43443a.d(kotlin.io.w.c(inputStreamReader), C.e(abstractC43443a.f412956b, kotlin.jvm.internal.m0.c(LogParams.class)));
                    } catch (Exception e12) {
                        ru.cyberity.log.a.f436064a.e("KibanaLogger", "Can't restore params", e12);
                        logParams = null;
                    }
                    kotlin.io.c.a(inputStreamReader, null);
                    return logParams;
                } finally {
                }
            }
        }

        /* compiled from: KibanaLogger.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.common.KibanaLogger$KibanaSink$send$2", f = "KibanaLogger.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432681a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LogParams f432683c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LogParams logParams, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f432683c = logParams;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super Boolean> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return b.this.new d(this.f432683c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f432681a;
                boolean z12 = false;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ru.cyberity.cbr.core.data.source.log.a aVar = b.this.logRepository;
                        LogType logType = LogType.Warn;
                        LogParams logParams = this.f432683c;
                        this.f432681a = 1;
                        if (aVar.a(logType, logParams, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                } catch (CBRException.Api e12) {
                    Integer code = e12.getCode();
                    if ((code != null ? code.intValue() : 0) >= 400) {
                        Integer code2 = e12.getCode();
                        if ((code2 != null ? code2.intValue() : 0) <= 499) {
                            Logger.i$default(ru.cyberity.log.a.f436064a, "KibanaLogger", "Unauthorized, drop packet", null, 4, null);
                        }
                    }
                    ru.cyberity.log.a.f436064a.e("KibanaLogger", "Failed to send logs", e12);
                } catch (Exception e13) {
                    ru.cyberity.log.a.f436064a.e("KibanaLogger", "Failed to send logs", e13);
                }
                z12 = true;
                return Boxing.boxBoolean(z12);
            }
        }

        public b(@Y61.k ru.cyberity.cbr.core.data.source.log.a aVar) {
            this.logRepository = aVar;
        }

        @Override // ru.cyberity.log.cacher.c
        public /* bridge */ /* synthetic */ Object send(Object obj, Continuation continuation) {
            return a((LogParams) obj, (Continuation<? super Boolean>) continuation);
        }

        private final Object b(InputStream inputStream, Continuation<? super LogParams> continuation) {
            return C43259k.g(C43262l0.f411947c, new c(inputStream, this, null), continuation);
        }

        @Override // ru.cyberity.log.cacher.a
        public /* bridge */ /* synthetic */ Object a(LogParams logParams, OutputStream outputStream, Continuation continuation) {
            return a2(logParams, outputStream, (Continuation<? super G0>) continuation);
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
                boolean r0 = r7 instanceof ru.cyberity.cbr.core.common.h0.b.C12435b
                if (r0 == 0) goto L13
                r0 = r7
                ru.cyberity.cbr.core.common.h0$b$b r0 = (ru.cyberity.cbr.core.common.h0.b.C12435b) r0
                int r1 = r0.f432677d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f432677d = r1
                goto L18
            L13:
                ru.cyberity.cbr.core.common.h0$b$b r0 = new ru.cyberity.cbr.core.common.h0$b$b
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f432675b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f432677d
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
                java.lang.Object r6 = r0.f432674a
                ru.cyberity.cbr.core.common.h0$b r6 = (ru.cyberity.cbr.core.common.h0.b) r6
                kotlin.C42729a0.b(r7)
                goto L4b
            L3c:
                kotlin.C42729a0.b(r7)
                r0.f432674a = r5
                r0.f432677d = r4
                java.lang.Object r7 = r5.b(r6, r0)
                if (r7 != r1) goto L4a
                return r1
            L4a:
                r6 = r5
            L4b:
                ru.cyberity.cbr.core.data.model.LogParams r7 = (ru.cyberity.cbr.core.data.model.LogParams) r7
                if (r7 == 0) goto L62
                r2 = 0
                r0.f432674a = r2
                r0.f432677d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.h0.b.a(java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Y61.l
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public Object a2(@Y61.k LogParams logParams, @Y61.k OutputStream outputStream, @Y61.k Continuation<? super G0> continuation) {
            Object objG = C43259k.g(C43262l0.f411947c, new a(outputStream, this, logParams, null), continuation);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
        }

        @Y61.l
        public Object a(@Y61.k LogParams logParams, @Y61.k Continuation<? super Boolean> continuation) {
            return C43259k.g(C43262l0.f411947c, new d(logParams, null), continuation);
        }
    }

    /* compiled from: KibanaLogger.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.KibanaLogger$log$1", f = "KibanaLogger.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432684a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f432686c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f432687d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f432688e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Throwable f432689f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, String str, String str2, Throwable th2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f432686c = i12;
            this.f432687d = str;
            this.f432688e = str2;
            this.f432689f = th2;
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
            return h0.this.new c(this.f432686c, this.f432687d, this.f432688e, this.f432689f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432684a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.log.cacher.e eVar = h0.this.sink;
                LogParams logParamsB = h0.this.b(this.f432686c, this.f432687d, this.f432688e, this.f432689f);
                this.f432684a = 1;
                if (eVar.send(logParamsB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    public h0(@Y61.k ru.cyberity.cbr.core.data.source.log.a aVar, @Y61.k String str, @Y61.k File file, @Y61.k ru.cyberity.log.cacher.e<LogParams> eVar) {
        this.applicantId = str;
        this.sink = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogParams b(int severity, String tag, String message, Throwable throwable) {
        String stackTraceString;
        String str = this.applicantId;
        String strO = H.o(new StringBuilder(), ru.cyberity.log.b.a().get(Integer.valueOf(severity)), '/', message);
        if (throwable == null || (stackTraceString = Log.getStackTraceString(throwable)) == null) {
            stackTraceString = "";
        }
        return new LogParams((String) null, tag, (String) null, "KibanaLogger.kt", str, strO, (String) null, stackTraceString, 65, (C42822w) null);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void d(@Y61.k String tag, @Y61.k String message, @Y61.l Throwable throwable) {
        a(3, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void e(@Y61.k String tag, @Y61.k String message, @Y61.l Throwable throwable) {
        a(6, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void i(@Y61.k String tag, @Y61.k String message, @Y61.l Throwable throwable) {
        a(4, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void v(@Y61.k String tag, @Y61.k String message, @Y61.l Throwable throwable) {
        a(2, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void w(@Y61.k String tag, @Y61.k String message, @Y61.l Throwable throwable) {
        a(5, tag, message, throwable);
    }

    public final void a(@Y61.k String str) {
        this.applicantId = str;
    }

    public /* synthetic */ h0(ru.cyberity.cbr.core.data.source.log.a aVar, String str, File file, ru.cyberity.log.cacher.e eVar, int i12, C42822w c42822w) {
        if ((i12 & 8) != 0) {
            eVar = new ru.cyberity.log.cacher.e(new b(aVar), file);
            eVar.a("_KibanaLogger");
            ru.cyberity.log.cacher.d.f436072a.a(eVar);
        }
        this(aVar, str, file, eVar);
    }

    private final void a(int severity, String tag, String message, Throwable throwable) {
        C43259k.d(f432665e, null, null, new c(severity, tag, message, throwable, null), 3);
    }
}

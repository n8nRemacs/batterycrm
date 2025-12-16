package ru.cyberity.cbr.core.data.source.applicant.remote;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.drafts.LocalPublishState;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okio.InterfaceC44803m;
import okio.M;
import ru.cyberity.cbr.core.common.b1;
import ru.cyberity.cbr.core.common.g0;
import ru.cyberity.cbr.core.data.model.CBRMessage;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;

/* compiled from: ApplicantRemoteDataSource.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r*\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ_\u0010\u000e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u001bJ_\u0010\u000e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u001dJ#\u0010\u000e\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010!J\u001b\u0010\u000e\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010#J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0016¢\u0006\u0004\b\u000e\u0010(J?\u0010\u000e\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0\u00162\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010+H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010.JM\u0010\u000e\u001a\u0002032\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u0002010+2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010+H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u00104J#\u0010\u000e\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u00108J+\u0010\u000e\u001a\u0002072\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010;J\u001b\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010#J\u001b\u0010\u000e\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010AJ/\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0\u00162\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010C\u001a\u00020BH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010DJ+\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\bE\u0010#J#\u0010\u000e\u001a\u00020G2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010C\u001a\u00020FH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010HJ+\u0010\u000e\u001a\u00020G2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00062\u0006\u0010C\u001a\u00020JH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010KJ\u001b\u0010M\u001a\u00020L2\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\bM\u0010#J\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020N0+H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/c;", "Lru/cyberity/cbr/core/data/source/applicant/a;", "Lru/cyberity/cbr/core/data/source/applicant/remote/d;", "service", "Lokhttp3/OkHttpClient;", "httpClient", "", "baseUrl", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/d;Lokhttp3/OkHttpClient;Ljava/lang/String;)V", "Ljava/io/InputStream;", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "a", "(Ljava/io/InputStream;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "applicantId", "country", "file", "identityType", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "side", "", "headers", "Lru/cyberity/cbr/core/data/model/DocumentType;", "idDocSetType", "Lru/cyberity/cbr/core/data/model/remote/k;", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/DocumentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/DocumentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageId", "Lkotlin/G0;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/c;", "accessTokenProvider", "Lkotlinx/coroutines/flow/i;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "(Lru/cyberity/cbr/core/c;)Lkotlinx/coroutines/flow/i;", "", LocalPublishState.FIELDS, "", "unsetFields", "Lru/cyberity/cbr/core/data/model/g$a;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "email", "phone", "Lru/cyberity/cbr/core/data/model/remote/e;", "customFields", "Lru/cyberity/cbr/core/data/model/g;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "requestCode", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "questionnaireId", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "f", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaire", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmationId", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/z;", "d", "Lru/cyberity/cbr/core/data/source/applicant/remote/k;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/d;", "b", "Lokhttp3/OkHttpClient;", "c", "Ljava/lang/String;", "Lkotlinx/serialization/json/a;", "Lkotlinx/serialization/json/a;", "json", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c implements ru.cyberity.cbr.core.data.source.applicant.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.remote.d service;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final OkHttpClient httpClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String baseUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final AbstractC43443a json = g0.a(false, 1, null);

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/G0;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class a implements InterfaceC43160i<CBRMessage.ServerMessage> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i f433465a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f433466b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.c$a$a, reason: collision with other inner class name */
        public static final class C12468a<T> implements InterfaceC43172j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC43172j f433467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f433468b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource$applicantState$$inlined$map$1$2", f = "ApplicantRemoteDataSource.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.c$a$a$a, reason: collision with other inner class name */
            public static final class C12469a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f433469a;

                /* renamed from: b, reason: collision with root package name */
                int f433470b;

                public C12469a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f433469a = obj;
                    this.f433470b |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C12468a.this.emit(null, this);
                }
            }

            public C12468a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f433467a = interfaceC43172j;
                this.f433468b = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ru.cyberity.cbr.core.data.source.applicant.remote.c.a.C12468a.C12469a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ru.cyberity.cbr.core.data.source.applicant.remote.c$a$a$a r0 = (ru.cyberity.cbr.core.data.source.applicant.remote.c.a.C12468a.C12469a) r0
                    int r1 = r0.f433470b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f433470b = r1
                    goto L18
                L13:
                    ru.cyberity.cbr.core.data.source.applicant.remote.c$a$a$a r0 = new ru.cyberity.cbr.core.data.source.applicant.remote.c$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f433469a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f433470b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L4d
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f433467a
                    java.lang.String r6 = (java.lang.String) r6
                    ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage$j r2 = ru.cyberity.cbr.core.data.model.CBRMessage.ServerMessage.INSTANCE
                    ru.cyberity.cbr.core.data.source.applicant.remote.c r4 = r5.f433468b
                    kotlinx.serialization.json.a r4 = ru.cyberity.cbr.core.data.source.applicant.remote.c.a(r4)
                    ru.cyberity.cbr.core.data.model.CBRMessage$ServerMessage r6 = r2.a(r4, r6)
                    r0.f433470b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4d
                    return r1
                L4d:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a.C12468a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, c cVar) {
            this.f433465a = interfaceC43160i;
            this.f433466b = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public Object collect(@Y61.k InterfaceC43172j<? super CBRMessage.ServerMessage> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f433465a.collect(new C12468a(interfaceC43172j, this.f433466b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/c$b", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/m;", "sink", "Lkotlin/G0;", "writeTo", "(Lokio/m;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends RequestBody {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaType f433472a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f433473b;

        public b(MediaType mediaType, InputStream inputStream) {
            this.f433472a = mediaType;
            this.f433473b = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f433473b.available();
        }

        @Override // okhttp3.RequestBody
        @Y61.l
        /* renamed from: contentType, reason: from getter */
        public MediaType getF338465c() {
            return this.f433472a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(@Y61.k InterfaceC44803m sink) {
            okio.e0 e0VarG = M.g(this.f433473b);
            try {
                sink.h2(e0VarG);
                kotlin.io.c.a(e0VarG, null);
            } finally {
            }
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {226}, m = "availableLanguages", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.c$c, reason: collision with other inner class name */
    public static final class C12470c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433474a;

        /* renamed from: c, reason: collision with root package name */
        int f433476c;

        public C12470c(Continuation<? super C12470c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433474a = obj;
            this.f433476c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a(this);
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {203}, m = "getApplicantAddress", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433477a;

        /* renamed from: c, reason: collision with root package name */
        int f433479c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433477a = obj;
            this.f433479c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.e(null, this);
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {148}, m = "setCustomFields", n = {}, s = {})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433480a;

        /* renamed from: c, reason: collision with root package name */
        int f433482c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433480a = obj;
            this.f433482c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a(null, null, null, null, null, this);
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {134}, m = "setFields", n = {}, s = {})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433483a;

        /* renamed from: c, reason: collision with root package name */
        int f433485c;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433483a = obj;
            this.f433485c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((String) null, (Map<String, ? extends Object>) null, (List<String>) null, this);
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {117}, m = "setPending", n = {}, s = {})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433486a;

        /* renamed from: c, reason: collision with root package name */
        int f433488c;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433486a = obj;
            this.f433488c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((String) null, this);
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {79}, m = "uploadFile", n = {}, s = {})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433489a;

        /* renamed from: c, reason: collision with root package name */
        int f433491c;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433489a = obj;
            this.f433491c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((String) null, (String) null, (InputStream) null, (String) null, (IdentitySide) null, (Map<String, String>) null, (DocumentType) null, this);
        }
    }

    /* compiled from: ApplicantRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantRemoteDataSource", f = "ApplicantRemoteDataSource.kt", i = {}, l = {111}, m = "uploadFile", n = {}, s = {})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433492a;

        /* renamed from: c, reason: collision with root package name */
        int f433494c;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433492a = obj;
            this.f433494c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((String) null, (String) null, (File) null, (String) null, (IdentitySide) null, (Map<String, String>) null, (DocumentType) null, this);
        }
    }

    public c(@Y61.k ru.cyberity.cbr.core.data.source.applicant.remote.d dVar, @Y61.k OkHttpClient okHttpClient, @Y61.k String str) {
        this.service = dVar;
        this.httpClient = okHttpClient;
        this.baseUrl = str;
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object d(@Y61.k String str, @Y61.k Continuation<? super z> continuation) {
        return this.service.d(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.applicant.remote.c.d
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.applicant.remote.c$d r0 = (ru.cyberity.cbr.core.data.source.applicant.remote.c.d) r0
            int r1 = r0.f433479c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433479c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.applicant.remote.c$d r0 = new ru.cyberity.cbr.core.data.source.applicant.remote.c$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433477a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433479c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            ru.cyberity.cbr.core.data.source.applicant.remote.d r6 = r4.service
            r0.f433479c = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$d r6 = (ru.cyberity.cbr.core.data.model.remote.response.d.c.C12460d) r6
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r5 = r6.getFixedInfo()
            if (r5 == 0) goto L54
            java.util.List r5 = r5.n()
            if (r5 == 0) goto L54
            java.lang.Object r5 = kotlin.collections.C42745f0.G(r5)
            java.util.Map r5 = (java.util.Map) r5
            goto L55
        L54:
            r5 = 0
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object f(@Y61.k String str, @Y61.k Continuation<? super t> continuation) {
        return this.service.f(str, continuation);
    }

    private final RequestBody a(InputStream inputStream, MediaType mediaType) {
        return new b(mediaType, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.lang.String r23, @Y61.k java.lang.String r24, @Y61.k java.io.InputStream r25, @Y61.l java.lang.String r26, @Y61.l ru.cyberity.cbr.core.data.model.IdentitySide r27, @Y61.k java.util.Map<java.lang.String, java.lang.String> r28, @Y61.l ru.cyberity.cbr.core.data.model.DocumentType r29, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.remote.k> r30) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String, ru.cyberity.cbr.core.data.model.IdentitySide, java.util.Map, ru.cyberity.cbr.core.data.model.DocumentType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.lang.String r24, @Y61.k java.lang.String r25, @Y61.k java.io.File r26, @Y61.l java.lang.String r27, @Y61.l ru.cyberity.cbr.core.data.model.IdentitySide r28, @Y61.k java.util.Map<java.lang.String, java.lang.String> r29, @Y61.l ru.cyberity.cbr.core.data.model.DocumentType r30, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.remote.k> r31) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a(java.lang.String, java.lang.String, java.io.File, java.lang.String, ru.cyberity.cbr.core.data.model.IdentitySide, java.util.Map, ru.cyberity.cbr.core.data.model.DocumentType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k String str, int i12, @Y61.k Continuation<? super G0> continuation) {
        Object objA = this.service.a(str, i12, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.data.source.applicant.remote.c.g
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.data.source.applicant.remote.c$g r0 = (ru.cyberity.cbr.core.data.source.applicant.remote.c.g) r0
            int r1 = r0.f433488c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433488c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.applicant.remote.c$g r0 = new ru.cyberity.cbr.core.data.source.applicant.remote.c$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f433486a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433488c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            ru.cyberity.cbr.core.data.source.applicant.remote.d r6 = r4.service
            r0.f433488c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            ru.cyberity.cbr.core.data.source.applicant.remote.f r6 = (ru.cyberity.cbr.core.data.source.applicant.remote.f) r6
            java.lang.Integer r5 = r6.getOk()
            if (r5 != 0) goto L48
            goto L4f
        L48:
            int r5 = r5.intValue()
            if (r5 != r3) goto L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.k
    public InterfaceC43160i<CBRMessage.ServerMessage> a(@Y61.k ru.cyberity.cbr.core.c<String> accessTokenProvider) {
        return new a(b1.a(this.httpClient, this.baseUrl + "ws/iframe?token=", accessTokenProvider), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.lang.String r12, @Y61.k java.util.Map<java.lang.String, ? extends java.lang.Object> r13, @Y61.l java.util.List<java.lang.String> r14, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g.a> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ru.cyberity.cbr.core.data.source.applicant.remote.c.f
            if (r0 == 0) goto L13
            r0 = r15
            ru.cyberity.cbr.core.data.source.applicant.remote.c$f r0 = (ru.cyberity.cbr.core.data.source.applicant.remote.c.f) r0
            int r1 = r0.f433485c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433485c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.applicant.remote.c$f r0 = new ru.cyberity.cbr.core.data.source.applicant.remote.c$f
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f433483a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433485c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r15)
            goto L99
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            kotlin.C42729a0.b(r15)
            kotlinx.serialization.json.a r15 = r11.json
            kotlinx.serialization.modules.f r2 = r15.f412956b
            kotlin.reflect.t$a r5 = kotlin.reflect.t.f410463c
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            kotlin.reflect.r r6 = kotlin.jvm.internal.m0.c(r6)
            r5.getClass()
            kotlin.reflect.t r5 = kotlin.reflect.t.a.a(r6)
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            kotlin.reflect.r r6 = kotlin.jvm.internal.m0.c(r6)
            kotlin.reflect.t r6 = kotlin.reflect.t.a.a(r6)
            kotlin.reflect.r r5 = kotlin.jvm.internal.m0.d(r5, r6)
            kotlinx.serialization.KSerializer r2 = kotlinx.serialization.C.e(r2, r5)
            java.lang.String r13 = r15.c(r2, r13)
            ru.cyberity.log.a r5 = ru.cyberity.log.a.f436064a
            java.lang.String r6 = ru.cyberity.log.c.a(r11)
            java.lang.String r15 = "setFields: "
            java.lang.String r7 = r15.concat(r13)
            r10 = 0
            r8 = 0
            r9 = 4
            ru.cyberity.log.logger.Logger.d$default(r5, r6, r7, r8, r9, r10)
            ru.cyberity.cbr.core.data.source.applicant.remote.d r15 = r11.service
            okhttp3.RequestBody$Companion r2 = okhttp3.RequestBody.INSTANCE
            okhttp3.MediaType$Companion r5 = okhttp3.MediaType.INSTANCE
            java.lang.String r6 = "application/json; charset=utf-8"
            okhttp3.MediaType r5 = r5.parse(r6)
            okhttp3.RequestBody r13 = r2.create(r13, r5)
            if (r14 == 0) goto L8f
            r8 = 0
            r9 = 0
            java.lang.String r6 = ","
            r7 = 0
            r10 = 62
            r5 = r14
            java.lang.String r14 = kotlin.collections.C42745f0.O(r5, r6, r7, r8, r9, r10)
            goto L90
        L8f:
            r14 = r3
        L90:
            r0.f433485c = r4
            java.lang.Object r15 = r15.a(r12, r13, r14, r0)
            if (r15 != r1) goto L99
            return r1
        L99:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$c r15 = (ru.cyberity.cbr.core.data.model.remote.response.d.c.C12459c) r15
            ru.cyberity.cbr.core.data.model.g$a r12 = ru.cyberity.cbr.core.data.model.remote.response.e.a(r15, r3, r4, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a(java.lang.String, java.util.Map, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.lang.String r12, @Y61.l java.lang.String r13, @Y61.l java.lang.String r14, @Y61.k java.util.List<ru.cyberity.cbr.core.data.model.remote.e> r15, @Y61.l java.util.List<java.lang.String> r16, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g> r17) {
        /*
            r11 = this;
            r0 = r11
            r1 = r17
            boolean r2 = r1 instanceof ru.cyberity.cbr.core.data.source.applicant.remote.c.e
            if (r2 == 0) goto L16
            r2 = r1
            ru.cyberity.cbr.core.data.source.applicant.remote.c$e r2 = (ru.cyberity.cbr.core.data.source.applicant.remote.c.e) r2
            int r3 = r2.f433482c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f433482c = r3
            goto L1b
        L16:
            ru.cyberity.cbr.core.data.source.applicant.remote.c$e r2 = new ru.cyberity.cbr.core.data.source.applicant.remote.c$e
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f433480a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f433482c
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            kotlin.C42729a0.b(r1)
            goto L63
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            kotlin.C42729a0.b(r1)
            ru.cyberity.cbr.core.data.source.applicant.remote.d r1 = r0.service
            ru.cyberity.cbr.core.data.model.remote.d r4 = new ru.cyberity.cbr.core.data.model.remote.d
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r4.<init>(r12, r13, r14, r15)
            if (r16 == 0) goto L59
            r6 = 0
            r7 = 0
            java.lang.String r8 = ","
            r9 = 0
            r10 = 62
            r12 = r16
            r13 = r8
            r14 = r9
            r15 = r6
            r16 = r7
            r17 = r10
            java.lang.String r6 = kotlin.collections.C42745f0.O(r12, r13, r14, r15, r16, r17)
            goto L5a
        L59:
            r6 = 0
        L5a:
            r2.f433482c = r5
            java.lang.Object r1 = r1.a(r4, r6, r2)
            if (r1 != r3) goto L63
            return r3
        L63:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$d r1 = (ru.cyberity.cbr.core.data.model.remote.response.d.c.C12460d) r1
            ru.cyberity.cbr.core.data.model.g r1 = ru.cyberity.cbr.core.data.model.remote.response.e.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k String str, @Y61.k w wVar, @Y61.k Continuation<? super x> continuation) {
        return this.service.a(str, wVar, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Continuation<? super x> continuation) {
        return this.service.a(str, str2, str3, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k r rVar, @Y61.k Continuation<? super t> continuation) {
        return this.service.a(rVar, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k String str, @Y61.k byte[] bArr, @Y61.k Continuation<? super Map<String, ? extends Object>> continuation) {
        return this.service.a(str, RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, MediaType.INSTANCE.parse("application/json"), 0, 0, 6, (Object) null), continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k String str, @Y61.k ru.cyberity.cbr.core.data.source.applicant.remote.b bVar, @Y61.k Continuation<? super a0> continuation) {
        return this.service.a(str, bVar, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.a
    @Y61.l
    public Object a(@Y61.k String str, @Y61.k String str2, @Y61.k ru.cyberity.cbr.core.data.source.applicant.remote.a aVar, @Y61.k Continuation<? super a0> continuation) {
        return this.service.a(str, str2, aVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super java.util.List<ru.cyberity.cbr.core.data.source.applicant.remote.k>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.core.data.source.applicant.remote.c.C12470c
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.core.data.source.applicant.remote.c$c r0 = (ru.cyberity.cbr.core.data.source.applicant.remote.c.C12470c) r0
            int r1 = r0.f433476c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433476c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.applicant.remote.c$c r0 = new ru.cyberity.cbr.core.data.source.applicant.remote.c$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f433474a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433476c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            ru.cyberity.cbr.core.data.source.applicant.remote.d r5 = r4.service
            r0.f433476c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            ru.cyberity.cbr.core.data.source.applicant.remote.e r5 = (ru.cyberity.cbr.core.data.source.applicant.remote.e) r5
            java.util.List r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.applicant.remote.c.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package ru.cyberity.cbr.core.data.source.common;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.r;
import kotlin.reflect.t;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.serialization.C;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.modules.f;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ru.cyberity.cbr.core.common.g0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBRStateChangedHandler;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.remote.response.d;
import ru.cyberity.log.logger.Logger;

/* compiled from: RealCommonRepository.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\f\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0017J#\u0010\f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\f\u0010!\"\u0004\b\f\u0010\"R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0016\u0010*R\u001e\u0010.\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lru/cyberity/cbr/core/data/source/common/c;", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/common/b;", "remote", "<init>", "(Lru/cyberity/cbr/core/data/source/common/b;)V", "", "id", "", "force", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "a", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicantId", "language", "Lkotlin/G0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", VoiceInfo.STATE, "(Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", "Ljava/util/Locale;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "applicant", "Lru/cyberity/cbr/core/data/model/b;", "agreement", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/common/b;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "selectedCountry", "Lkotlinx/coroutines/flow/Z1;", "Lkotlinx/coroutines/flow/Z1;", "_sdkStateFlow", "Lkotlinx/coroutines/flow/n2;", "d", "Lkotlinx/coroutines/flow/n2;", "()Lkotlinx/coroutines/flow/n2;", "sdkStateFlow", "e", "Lru/cyberity/cbr/core/data/model/g;", "action", "f", "Ljava/util/Map;", "clientIntegrationSettings", "Lkotlinx/serialization/json/a;", "g", "Lkotlinx/serialization/json/a;", "json", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c implements ru.cyberity.cbr.core.data.source.common.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.b remote;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private String selectedCountry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final Z1<CBRSDKState> _sdkStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<CBRSDKState> sdkStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private g action;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, ? extends Object> clientIntegrationSettings;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final AbstractC43443a json;

    /* compiled from: RealCommonRepository.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.common.RealCommonRepository", f = "RealCommonRepository.kt", i = {0}, l = {35}, m = "getActionById", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433625a;

        /* renamed from: b, reason: collision with root package name */
        Object f433626b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433627c;

        /* renamed from: e, reason: collision with root package name */
        int f433629e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433627c = obj;
            this.f433629e |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((String) null, false, (Continuation<? super g>) this);
        }
    }

    /* compiled from: RealCommonRepository.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.common.RealCommonRepository", f = "RealCommonRepository.kt", i = {0}, l = {72}, m = "getClientIntegrationSettings", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433630a;

        /* renamed from: b, reason: collision with root package name */
        Object f433631b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433632c;

        /* renamed from: e, reason: collision with root package name */
        int f433634e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433632c = obj;
            this.f433634e |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a(this);
        }
    }

    /* compiled from: RealCommonRepository.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.common.RealCommonRepository", f = "RealCommonRepository.kt", i = {}, l = {78}, m = "postAgreement", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.data.source.common.c$c, reason: collision with other inner class name */
    public static final class C12472c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433635a;

        /* renamed from: c, reason: collision with root package name */
        int f433637c;

        public C12472c(Continuation<? super C12472c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433635a = obj;
            this.f433637c |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((g) null, (ru.cyberity.cbr.core.data.model.b) null, this);
        }
    }

    public c(@k ru.cyberity.cbr.core.data.source.common.b bVar) {
        this.remote = bVar;
        Z1<CBRSDKState> z1A = p2.a(null);
        this._sdkStateFlow = z1A;
        this.sdkStateFlow = C43175k.b(z1A);
        this.json = g0.a(false, 1, null);
    }

    @Override // ru.cyberity.cbr.core.data.source.common.a
    @l
    /* renamed from: a, reason: from getter */
    public String getSelectedCountry() {
        return this.selectedCountry;
    }

    @Override // ru.cyberity.cbr.core.data.source.common.a
    @k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2<CBRSDKState> b() {
        return this.sdkStateFlow;
    }

    @Override // ru.cyberity.cbr.core.data.source.common.a
    public void a(@l String str) {
        this.selectedCountry = str;
    }

    @Override // ru.cyberity.cbr.core.data.source.common.a
    @l
    public Object c(@k Continuation<? super Locale> continuation) {
        return n0.f432787a.getLocale();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.common.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k java.lang.String r11, boolean r12, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ru.cyberity.cbr.core.data.source.common.c.a
            if (r0 == 0) goto L13
            r0 = r13
            ru.cyberity.cbr.core.data.source.common.c$a r0 = (ru.cyberity.cbr.core.data.source.common.c.a) r0
            int r1 = r0.f433629e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433629e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.common.c$a r0 = new ru.cyberity.cbr.core.data.source.common.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f433627c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433629e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f433626b
            ru.cyberity.cbr.core.data.source.common.c r11 = (ru.cyberity.cbr.core.data.source.common.c) r11
            java.lang.Object r12 = r0.f433625a
            ru.cyberity.cbr.core.data.source.common.c r12 = (ru.cyberity.cbr.core.data.source.common.c) r12
            kotlin.C42729a0.b(r13)
            goto L78
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            kotlin.C42729a0.b(r13)
            ru.cyberity.log.a r4 = ru.cyberity.log.a.f436064a
            java.lang.String r5 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to get an action("
            r13.<init>(r2)
            r13.append(r11)
            java.lang.String r2 = "). Force flag is "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r6 = r13.toString()
            r8 = 4
            r9 = 0
            r7 = 0
            ru.cyberity.log.logger.Logger.d$default(r4, r5, r6, r7, r8, r9)
            ru.cyberity.cbr.core.data.model.g r13 = r10.action
            if (r13 == 0) goto L67
            if (r12 == 0) goto L65
            goto L67
        L65:
            r12 = r10
            goto L80
        L67:
            ru.cyberity.cbr.core.data.source.common.b r12 = r10.remote
            r0.f433625a = r10
            r0.f433626b = r10
            r0.f433629e = r3
            java.lang.Object r13 = r12.a(r11, r0)
            if (r13 != r1) goto L76
            return r1
        L76:
            r11 = r10
            r12 = r11
        L78:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$d r13 = (ru.cyberity.cbr.core.data.model.remote.response.d.c.C12460d) r13
            ru.cyberity.cbr.core.data.model.g r13 = ru.cyberity.cbr.core.data.model.remote.response.e.b(r13)
            r11.action = r13
        L80:
            ru.cyberity.cbr.core.data.model.g r11 = r12.action
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.common.c.a(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.data.source.common.a
    @l
    public Object a(@k String str, @k String str2, @k Continuation<? super G0> continuation) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), e.n("Set language ", str2, " for applicant ", str), null, 4, null);
        AbstractC43443a abstractC43443a = this.json;
        Map mapG = P0.g(new Q("id", str), new Q("lang", str2));
        f fVar = abstractC43443a.f412956b;
        t.a aVar = t.f410463c;
        r rVarC = m0.c(String.class);
        aVar.getClass();
        Object objA = this.remote.a(RequestBody.INSTANCE.create(abstractC43443a.c(C.e(fVar, m0.d(t.a.a(rVarC), t.a.a(m0.c(String.class)))), mapG), MediaType.INSTANCE.parse("application/json; charset=utf-8")), (Continuation<? super d>) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // ru.cyberity.cbr.core.data.source.common.a
    public void a(@k CBRSDKState state) {
        CBRSDKState value = this._sdkStateFlow.getValue();
        if (L.f(value, state)) {
            return;
        }
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "The SDK state was changed: " + value + " -> " + state, null, 4, null);
        if (value != null) {
            try {
                CBRStateChangedHandler stateChangedHandler = n0.f432787a.getStateChangedHandler();
                if (stateChangedHandler != null) {
                    stateChangedHandler.onStateChanged(value, state);
                }
            } catch (Exception e12) {
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                String strA = ru.cyberity.log.c.a(this);
                String message = e12.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(strA, message, e12);
            }
        }
        n0.f432787a.a(state);
        this._sdkStateFlow.setValue(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.common.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.core.data.source.common.c.b
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.core.data.source.common.c$b r0 = (ru.cyberity.cbr.core.data.source.common.c.b) r0
            int r1 = r0.f433634e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433634e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.common.c$b r0 = new ru.cyberity.cbr.core.data.source.common.c$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f433632c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433634e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f433631b
            ru.cyberity.cbr.core.data.source.common.c r1 = (ru.cyberity.cbr.core.data.source.common.c) r1
            java.lang.Object r0 = r0.f433630a
            ru.cyberity.cbr.core.data.source.common.c r0 = (ru.cyberity.cbr.core.data.source.common.c) r0
            kotlin.C42729a0.b(r5)
            goto L51
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.C42729a0.b(r5)
            java.util.Map<java.lang.String, ? extends java.lang.Object> r5 = r4.clientIntegrationSettings
            if (r5 != 0) goto L56
            ru.cyberity.cbr.core.data.source.common.b r5 = r4.remote
            r0.f433630a = r4
            r0.f433631b = r4
            r0.f433634e = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
            r1 = r0
        L51:
            java.util.Map r5 = (java.util.Map) r5
            r1.clientIntegrationSettings = r5
            goto L57
        L56:
            r0 = r4
        L57:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r5 = r0.clientIntegrationSettings
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.common.c.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.data.source.common.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.core.data.model.g r5, @Y61.k ru.cyberity.cbr.core.data.model.b r6, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.model.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.data.source.common.c.C12472c
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.data.source.common.c$c r0 = (ru.cyberity.cbr.core.data.source.common.c.C12472c) r0
            int r1 = r0.f433637c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433637c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.common.c$c r0 = new ru.cyberity.cbr.core.data.source.common.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f433635a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433637c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            ru.cyberity.cbr.core.data.source.common.b r7 = r4.remote
            java.lang.String r5 = r5.getId()
            r0.f433637c = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            ru.cyberity.cbr.core.data.model.remote.response.d$c$d r7 = (ru.cyberity.cbr.core.data.model.remote.response.d.c.C12460d) r7
            ru.cyberity.cbr.core.data.model.g r5 = ru.cyberity.cbr.core.data.model.remote.response.e.a(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.common.c.a(ru.cyberity.cbr.core.data.model.g, ru.cyberity.cbr.core.data.model.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package com.avito.android.publish.drafts;

import arrow.core.X0;
import arrow.core.Y0;
import be0.C25640c;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SaveDraftResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.maybe.h0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.U;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDraftRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/x;", "Lcom/avito/android/publish/drafts/PublishDraftRepository;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class x implements PublishDraftRepository {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f235416a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C25640c f235417b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f235418c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f235419d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app.work.c f235420e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H f235421f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235422g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f235423h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, com.avito.android.publish.A> f235424i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f235425j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final U f235426k;

    /* compiled from: PublishDraftRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SaveDraftResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C33842h f235427b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f235428c;

        public a(C33842h c33842h, x xVar) {
            this.f235427b = c33842h;
            this.f235428c = xVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (!(typedResult instanceof TypedResult.Success)) {
                boolean z12 = typedResult instanceof TypedResult.Error;
                return;
            }
            SaveDraftResponse saveDraftResponse = (SaveDraftResponse) ((TypedResult.Success) typedResult).getResult();
            if (!(saveDraftResponse instanceof SaveDraftResponse.Ok)) {
                if (saveDraftResponse instanceof SaveDraftResponse.Conflict) {
                    return;
                }
                boolean z13 = saveDraftResponse instanceof SaveDraftResponse.Skipped;
                return;
            }
            SaveDraftResponse.Ok.Draft draft = ((SaveDraftResponse.Ok) saveDraftResponse).getDraft();
            String id2 = draft.getId();
            C33842h c33842hA = C33842h.a(this.f235427b, draft.getVersion(), id2, null, 16295);
            x xVar = this.f235428c;
            C25640c c25640c = xVar.f235417b;
            synchronized (c25640c) {
                c25640c.f57314a.putString(c33842hA.f235376b, c25640c.f57315b.l(c33842hA));
                c25640c.b(c33842hA);
            }
            xVar.f235423h.accept(draft.getId());
        }
    }

    public x(@Y61.k H0 h02, @Y61.k C25640c c25640c, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k com.avito.android.app.work.c cVar, @Y61.k com.avito.android.remote.H h12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.jakewharton.rxrelay3.c cVar2, @Y61.k Y41.l lVar) {
        this.f235416a = h02;
        this.f235417b = c25640c;
        this.f235418c = categoryParametersConverter;
        this.f235419d = attributesTreeConverter;
        this.f235420e = cVar;
        this.f235421f = h12;
        this.f235422g = interfaceC35745a5;
        this.f235423h = cVar2;
        this.f235424i = lVar;
        io.reactivex.rxjava3.core.H hF2 = interfaceC35745a5.f();
        this.f235425j = hF2;
        this.f235426k = new C42007e(new l41.s() { // from class: com.avito.android.publish.drafts.u
            @Override // l41.s
            public final Object get() {
                x xVar = this.f235411b;
                C33842h c33842hA = xVar.f235417b.a();
                if (c33842hA != null) {
                    return (c33842hA.f235379e ? new io.reactivex.rxjava3.internal.operators.completable.v(g1.a(xVar.f(c33842hA, null))) : C41823n.f402260b).h(xVar.f235424i.invoke(c33842hA.f235376b).a(new z(xVar)).B(G0.f406611a).n(new A()));
                }
                return io.reactivex.rxjava3.core.I.q(PublishDraftRepository.DraftSyncResult.f235332b);
            }
        }).F().x0(hF2).p0().S().A(15L, TimeUnit.SECONDS).u(new C32102w0(10));
    }

    @Override // com.avito.android.publish.drafts.PublishDraftRepository
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final U getF235426k() {
        return this.f235426k;
    }

    @Override // com.avito.android.publish.drafts.D
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Y0<String>> b() {
        com.jakewharton.rxrelay3.c<Y0<String>> cVar = this.f235417b.f57316c;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.publish.drafts.PublishDraftRepository
    @Y61.k
    public final h0 c(@Y61.k final String str, @Y61.k final String str2, @Y61.k final CategoryParameters categoryParameters, @Y61.k final String str3, final boolean z12, final boolean z13, @Y61.l final String str4, @Y61.l final Integer num, @Y61.k final Navigation navigation2, @Y61.l final String str5, @Y61.k final LocalPublishState localPublishState, boolean z14, final boolean z15) {
        return new io.reactivex.rxjava3.internal.operators.single.D(new io.reactivex.rxjava3.internal.operators.single.G(new Callable() { // from class: com.avito.android.publish.drafts.t
            /* JADX WARN: Removed duplicated region for block: B:4:0x0022 A[PHI: r3
  0x0022: PHI (r3v12 java.lang.Integer) = (r3v2 java.lang.Integer), (r3v4 java.lang.Integer) binds: [B:3:0x0020, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r19 = this;
                    r1 = r19
                    com.avito.android.publish.drafts.x r0 = r1.f235398b
                    be0.c r2 = r0.f235417b
                    com.avito.android.publish.drafts.h r2 = r2.a()
                    com.avito.android.remote.model.category_parameters.CategoryParameters r15 = r2
                    java.util.List r3 = r15.getParametersExceptOwnedBySlots()
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    com.avito.android.remote.model.category_parameters.AttributesTreeConverter r4 = r0.f235419d
                    java.util.List r11 = r4.convertToSlotAttributesTree(r3)
                    java.util.List r12 = r4.convertToParameterAttributesTree(r3)
                    com.avito.android.publish.drafts.h r14 = new com.avito.android.publish.drafts.h
                    java.lang.Integer r3 = r6
                    if (r3 == 0) goto L28
                L22:
                    int r3 = r3.intValue()
                L26:
                    r7 = r3
                    goto L37
                L28:
                    if (r2 == 0) goto L31
                    int r3 = r2.f235378d
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    goto L32
                L31:
                    r3 = 0
                L32:
                    if (r3 == 0) goto L35
                    goto L22
                L35:
                    r3 = 0
                    goto L26
                L37:
                    if (r2 == 0) goto L40
                    java.lang.String r2 = r2.f235381g
                    if (r2 != 0) goto L3e
                    goto L40
                L3e:
                    r10 = r2
                    goto L43
                L40:
                    java.lang.String r2 = r9
                    goto L3e
                L43:
                    java.lang.String r4 = r3
                    java.lang.String r2 = r4
                    java.lang.String r6 = r5
                    boolean r8 = r7
                    boolean r9 = r8
                    com.avito.android.remote.model.Navigation r13 = r10
                    java.lang.String r5 = r11
                    com.avito.android.publish.drafts.LocalPublishState r3 = r12
                    r18 = r0
                    boolean r0 = r13
                    r16 = r3
                    r3 = r14
                    r17 = r5
                    r5 = r2
                    r1 = r14
                    r14 = r17
                    r17 = r15
                    r15 = r16
                    r16 = r17
                    r17 = r0
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                    r0 = r18
                    be0.c r3 = r0.f235417b
                    monitor-enter(r3)
                    AK0.l r0 = r3.f57314a     // Catch: java.lang.Throwable -> L80
                    com.google.gson.Gson r4 = r3.f57315b     // Catch: java.lang.Throwable -> L80
                    java.lang.String r4 = r4.l(r1)     // Catch: java.lang.Throwable -> L80
                    r0.putString(r2, r4)     // Catch: java.lang.Throwable -> L80
                    r3.b(r1)     // Catch: java.lang.Throwable -> L80
                    monitor-exit(r3)
                    return r1
                L80:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.drafts.t.call():java.lang.Object");
            }
        }), new w(z12, this, z14)).p(this.f235425j);
    }

    @Override // com.avito.android.publish.drafts.PublishDraftRepository
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r d() {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new s(this, 1));
    }

    @Override // com.avito.android.publish.drafts.PublishDraftRepository
    @Y61.k
    public final U e() {
        W wZ2 = new io.reactivex.rxjava3.internal.operators.single.G(new s(this, 0)).z(this.f235425j);
        Y0.f56266a.getClass();
        return wZ2.v(X0.f56264b);
    }

    public final io.reactivex.rxjava3.core.I<TypedResult<SaveDraftResponse>> f(C33842h c33842h, Boolean bool) {
        if (c33842h.f235388n) {
            return io.reactivex.rxjava3.core.I.q(new TypedResult.Success(SaveDraftResponse.Skipped.INSTANCE));
        }
        Navigation navigation2 = c33842h.f235384j;
        CategoryParametersConverter categoryParametersConverter = this.f235418c;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(navigation2);
        List<AttributeNode> list = c33842h.f235382h;
        AttributesTreeConverter attributesTreeConverter = this.f235419d;
        Map<String, String> mapConvertToSlotAttributesMap = attributesTreeConverter.convertToSlotAttributesMap(list);
        Map<String, String> mapConvertToParameterAttributesMap = attributesTreeConverter.convertToParameterAttributesMap(c33842h.f235383i);
        Map<String, String> mapConvertToFieldMap2 = categoryParametersConverter.convertToFieldMap(new Q(VoiceInfo.STATE, c33842h.f235386l));
        String f253025a = this.f235421f.getF253025a();
        Integer numValueOf = Integer.valueOf(c33842h.f235378d);
        return this.f235416a.P(c33842h.f235375a, f253025a, mapConvertToFieldMap, mapConvertToParameterAttributesMap, mapConvertToSlotAttributesMap, mapConvertToFieldMap2, c33842h.f235381g, numValueOf, c33842h.f235385k, bool).B(700L, TimeUnit.MILLISECONDS, this.f235422g.c(), null).u(new C32102w0(9)).k(new a(c33842h, this));
    }
}

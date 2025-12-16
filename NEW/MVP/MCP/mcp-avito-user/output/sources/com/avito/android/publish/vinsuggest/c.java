package com.avito.android.publish.vinsuggest;

import If0.InterfaceC14100b;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import dl0.InterfaceC39749a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import lD.C43617a;

/* compiled from: VinSuggestInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/vinsuggest/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PublishParametersInteractor f245709a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C0 f245710b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC39749a f245711c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f245712d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final VinSuggestOpenParams f245713e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PublishDraftRepository f245714f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f245715g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43617a f245716h;

    /* compiled from: VinSuggestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LIf0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.vinsuggest.VinSuggestInteractor$getVinNumberAndByVinSuggestRequest$1", f = "VinSuggestInteractor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9}, l = {53, 54, 63, 68, 72, 74, 80, 84, 91, 98}, m = "invokeSuspend", n = {"$this$flow", "regNumber", "$this$flow", "regNumber", "$this$flow", "regNumber", "$this$flow", "regNumber", "$this$onFailureSuspend$iv", "$this$flow", "regNumber", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$onFailureSuspend$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14100b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f245717q;

        /* renamed from: r, reason: collision with root package name */
        public Object f245718r;

        /* renamed from: s, reason: collision with root package name */
        public int f245719s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f245720t;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f245720t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14100b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:73|(5:204|74|(1:76)|77|201)|(6:79|(1:81)(1:83)|84|(5:86|(3:88|89|90)(1:91)|92|(1:94)(3:95|(1:97)(1:98)|(2:100|(1:102)))|103)(0)|191|192)(2:109|(2:111|(1:113))(2:118|119))|104|199|114|115|124|(2:127|(2:129|(1:131)(2:132|133))(2:135|136))|134|138|(2:142|(1:144))|197|145|(1:147)(3:148|149|(11:196|151|(2:153|(1:155))(2:159|(1:161))|156|162|206|171|183|(2:186|(2:188|(1:190))(2:193|194))|191|192)(3:163|210|(4:165|166|167|(1:169)(7:170|206|171|183|(0)|191|192))(3:179|180|181)))) */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0234, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:177:0x0351, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:178:0x0352, code lost:
        
            r8 = r16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 11, insn: 0x00b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:181), block:B:34:0x00b2 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x00b5: MOVE (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:182), block:B:34:0x00b2 */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01fd A[Catch: all -> 0x01f5, TryCatch #4 {all -> 0x01f5, blocks: (B:90:0x01b9, B:92:0x01bf, B:103:0x01ec, B:95:0x01ca, B:97:0x01d2, B:100:0x01d8, B:102:0x01df, B:109:0x01fd, B:111:0x0203, B:118:0x0236, B:119:0x023b), top: B:201:0x018d }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x029f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x02b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0310 A[Catch: all -> 0x0351, TRY_ENTER, TryCatch #2 {all -> 0x0351, blocks: (B:149:0x02b7, B:163:0x0310, B:165:0x0314, B:145:0x02a0), top: B:197:0x02a0 }] */
        /* JADX WARN: Removed duplicated region for block: B:186:0x036f  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0188 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x018f A[Catch: all -> 0x01f9, TryCatch #7 {all -> 0x01f9, blocks: (B:77:0x0189, B:79:0x018f, B:81:0x01a3, B:86:0x01ab, B:88:0x01b2, B:74:0x0171), top: B:204:0x0171 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
        /* JADX WARN: Type inference failed for: r0v114 */
        /* JADX WARN: Type inference failed for: r0v52 */
        /* JADX WARN: Type inference failed for: r0v53, types: [T, java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r0v89, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v10, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r4v21 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v15, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r5v17, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 956
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.vinsuggest.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k PublishParametersInteractor publishParametersInteractor, @k C0 c02, @k InterfaceC39749a interfaceC39749a, @k R0 r02, @k VinSuggestOpenParams vinSuggestOpenParams, @k PublishDraftRepository publishDraftRepository, @k InterfaceC35745a5 interfaceC35745a5, @k C43617a c43617a) {
        this.f245709a = publishParametersInteractor;
        this.f245710b = c02;
        this.f245711c = interfaceC39749a;
        this.f245712d = r02;
        this.f245713e = vinSuggestOpenParams;
        this.f245714f = publishDraftRepository;
        this.f245715g = interfaceC35745a5;
        this.f245716h = c43617a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.publish.vinsuggest.c r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.avito.android.publish.vinsuggest.b
            if (r0 == 0) goto L16
            r0 = r5
            com.avito.android.publish.vinsuggest.b r0 = (com.avito.android.publish.vinsuggest.b) r0
            int r1 = r0.f245708t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f245708t = r1
            goto L1b
        L16:
            com.avito.android.publish.vinsuggest.b r0 = new com.avito.android.publish.vinsuggest.b
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f245706r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f245708t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.publish.vinsuggest.c r4 = r0.f245705q
            kotlin.C42729a0.b(r5)
            goto L55
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C42729a0.b(r5)
            com.avito.android.publish.drafts.PublishDraftRepository r5 = r4.f245714f
            io.reactivex.rxjava3.internal.operators.single.U r5 = r5.e()
            com.avito.android.util.a5 r2 = r4.f245715g
            io.reactivex.rxjava3.core.H r2 = r2.a()
            io.reactivex.rxjava3.internal.operators.single.W r5 = r5.z(r2)
            r0.f245705q = r4
            r0.f245708t = r3
            java.lang.Object r5 = kotlinx.coroutines.rx3.C43292o.b(r5, r0)
            if (r5 != r1) goto L55
            goto Ld3
        L55:
            arrow.core.Y0 r5 = (arrow.core.Y0) r5
            java.lang.Object r5 = r5.c()
            com.avito.android.publish.drafts.h r5 = (com.avito.android.publish.drafts.C33842h) r5
            r0 = 0
            if (r5 == 0) goto L8a
            java.util.List<com.avito.android.remote.model.category_parameters.AttributeNode> r5 = r5.f235383i
            if (r5 == 0) goto L8a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L6a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.avito.android.remote.model.category_parameters.AttributeNode r2 = (com.avito.android.remote.model.category_parameters.AttributeNode) r2
            java.lang.String r2 = r2.getId()
            com.avito.android.publish.vinsuggest.VinSuggestOpenParams r3 = r4.f245713e
            java.lang.String r3 = r3.f245704h
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 == 0) goto L6a
            goto L87
        L86:
            r1 = r0
        L87:
            com.avito.android.remote.model.category_parameters.AttributeNode r1 = (com.avito.android.remote.model.category_parameters.AttributeNode) r1
            goto L8b
        L8a:
            r1 = r0
        L8b:
            boolean r4 = r1 instanceof com.avito.android.remote.model.category_parameters.AttributeNode.ListNode
            if (r4 == 0) goto L92
            com.avito.android.remote.model.category_parameters.AttributeNode$ListNode r1 = (com.avito.android.remote.model.category_parameters.AttributeNode.ListNode) r1
            goto L93
        L92:
            r1 = r0
        L93:
            if (r1 != 0) goto L98
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
            goto Ld3
        L98:
            java.util.List r4 = r1.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        La7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld3
            java.lang.Object r5 = r4.next()
            com.avito.android.remote.model.category_parameters.AttributeNode r5 = (com.avito.android.remote.model.category_parameters.AttributeNode) r5
            boolean r2 = r5 instanceof com.avito.android.remote.model.category_parameters.AttributeNode.StringNode
            if (r2 == 0) goto Lba
            com.avito.android.remote.model.category_parameters.AttributeNode$StringNode r5 = (com.avito.android.remote.model.category_parameters.AttributeNode.StringNode) r5
            goto Lbb
        Lba:
            r5 = r0
        Lbb:
            if (r5 == 0) goto Lcc
            java.lang.String r5 = r5.getValue()
            if (r5 == 0) goto Lcc
            long r2 = java.lang.Long.parseLong(r5)
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            goto Lcd
        Lcc:
            r5 = r0
        Lcd:
            if (r5 == 0) goto La7
            r1.add(r5)
            goto La7
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.vinsuggest.c.a(com.avito.android.publish.vinsuggest.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final InterfaceC43160i b(c cVar, String str) {
        C0 c02 = cVar.f245710b;
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null) {
            return g();
        }
        return C43175k.Y(new C43152f0(C43175k.I(cVar.f245712d.a(), y.a(cVar.f245709a.k(c02.f231861Y.getNavigation(), categoryParameters, str))), new e(cVar, null)), new d(cVar, null));
    }

    public static final void c(c cVar, String str) {
        ParameterSlot parameterSlotE = cVar.e(cVar.f245713e.f245699c);
        SelectParameter.Flat flat = parameterSlotE instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlotE : null;
        if (flat != null) {
            flat.set_value(str);
            CategoryParameters categoryParameters = cVar.f245710b.f231873k0;
            if (categoryParameters != null) {
                CategoryParameters.cloneWithNewParameters$default(categoryParameters, Collections.singletonList(flat), null, 2, null);
            }
        }
    }

    public static final void d(c cVar, String str) {
        ParameterSlot parameterSlotE = cVar.e(cVar.f245713e.f245698b);
        CharParameter charParameter = parameterSlotE instanceof CharParameter ? (CharParameter) parameterSlotE : null;
        if (charParameter == null || charParameter.getInputType() != CharParameter.InputType.VIN) {
            return;
        }
        charParameter.set_value(str);
        CategoryParameters categoryParameters = cVar.f245710b.f231873k0;
        if (categoryParameters != null) {
            CategoryParameters.cloneWithNewParameters$default(categoryParameters, Collections.singletonList(charParameter), null, 2, null);
        }
    }

    public static C43210w g() {
        V2.f318762a.e("Failed to loadAutoParamsByVin", null);
        return new C43210w(InterfaceC14100b.a.f8466a);
    }

    public final ParameterSlot e(String str) {
        List<ParameterSlot> parameters;
        CategoryParameters categoryParameters = this.f245710b.f231873k0;
        Object obj = null;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            return null;
        }
        Iterator<T> it = parameters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((ParameterSlot) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (ParameterSlot) obj;
    }

    @k
    public final InterfaceC43160i<InterfaceC14100b> f() {
        return C43175k.I(this.f245712d.a(), C43175k.G(new a(null)));
    }
}

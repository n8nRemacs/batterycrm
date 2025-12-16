package com.avito.android.publish.screen.step.request.steps.loader;

import Me0.InterfaceC14477b;
import Y41.p;
import Y61.k;
import Y61.l;
import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.publish.di.S;
import com.avito.android.remote.model.Draft;
import com.avito.android.remote.model.DraftField;
import com.avito.android.remote.model.DraftState;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.MultiGeoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yc.C50213a;

/* compiled from: StepsRequestLoader.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/loader/b;", "Lcom/avito/android/publish/screen/step/request/steps/loader/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.screen.step.request.steps.loader.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f242012a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f242013b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C0 f242014c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC33535v f242015d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC33685d0 f242016e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C50213a f242017f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC19543a f242018g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final PublishParametersInteractor f242019h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC19545c f242020i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Gson f242021j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final R0 f242022k;

    /* compiled from: StepsRequestLoader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/step/request/steps/loader/b$a;", "", "<init>", "()V", "", "MULTI_GEO_ID", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StepsRequestLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl$load$1", f = "StepsRequestLoader.kt", i = {0, 1, 2, 3, 3, 4, 4}, l = {60, 62, 63, 64, 65, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "data", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.avito.android.publish.screen.step.request.steps.loader.b$b, reason: collision with other inner class name */
    public static final class C7251b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14477b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public PublishParametersInteractor.a f242023q;

        /* renamed from: r, reason: collision with root package name */
        public int f242024r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f242025s;

        public C7251b(Continuation<? super C7251b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7251b c7251b = b.this.new C7251b(continuation);
            c7251b.f242025s = obj;
            return c7251b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14477b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7251b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
        
            if (r8 != null) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:53:0x00cd, B:54:0x00cf, B:13:0x002d, B:48:0x00ae, B:50:0x00b2, B:16:0x0037, B:42:0x008e, B:43:0x0091, B:45:0x0095, B:19:0x0040, B:35:0x007b, B:39:0x0082, B:22:0x0049, B:28:0x0063, B:30:0x0069, B:32:0x006f, B:25:0x0055), top: B:64:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00cc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.steps.loader.b.C7251b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@com.avito.android.publish.screen.step.request.steps.di.d boolean z12, @com.avito.android.publish.screen.step.request.steps.di.f boolean z13, @k C0 c02, @k InterfaceC33535v interfaceC33535v, @k InterfaceC33685d0 interfaceC33685d0, @k C50213a c50213a, @k InterfaceC19543a interfaceC19543a, @k PublishParametersInteractor publishParametersInteractor, @k InterfaceC19545c interfaceC19545c, @k @S.a Gson gson, @k R0 r02) {
        this.f242012a = z12;
        this.f242013b = z13;
        this.f242014c = c02;
        this.f242015d = interfaceC33535v;
        this.f242016e = interfaceC33685d0;
        this.f242017f = c50213a;
        this.f242018g = interfaceC19543a;
        this.f242019h = publishParametersInteractor;
        this.f242020i = interfaceC19545c;
        this.f242021j = gson;
        this.f242022k = r02;
    }

    public static final String a(b bVar, CategoryPublishStep categoryPublishStep, Draft draft, String str) {
        List<DraftField> fields;
        Object next;
        bVar.getClass();
        Object obj = null;
        if (draft == null) {
            Iterator<T> it = categoryPublishStep.getFields().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (L.f((String) next2, str)) {
                    obj = next2;
                    break;
                }
            }
            return (String) obj;
        }
        DraftState state = draft.getState();
        if (state == null || (fields = state.getFields()) == null) {
            return null;
        }
        Iterator<T> it2 = fields.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (L.f(((DraftField) next).getId(), str)) {
                break;
            }
        }
        DraftField draftField = (DraftField) next;
        if (draftField != null) {
            return draftField.getValue();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.publish.screen.step.request.steps.loader.b r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.avito.android.publish.screen.step.request.steps.loader.e
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.publish.screen.step.request.steps.loader.e r0 = (com.avito.android.publish.screen.step.request.steps.loader.e) r0
            int r1 = r0.f242034s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f242034s = r1
            goto L1b
        L16:
            com.avito.android.publish.screen.step.request.steps.loader.e r0 = new com.avito.android.publish.screen.step.request.steps.loader.e
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f242032q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242034s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.C42729a0.b(r7)
            com.avito.android.util.R0 r7 = r5.f242022k
            kotlinx.coroutines.scheduling.b r7 = r7.a()
            com.avito.android.publish.screen.step.request.steps.loader.f r2 = new com.avito.android.publish.screen.step.request.steps.loader.f
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f242034s = r3
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r7, r2, r0)
            if (r7 != r1) goto L4c
            goto L4d
        L4c:
            r1 = r7
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.steps.loader.b.b(com.avito.android.publish.screen.step.request.steps.loader.b, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.publish.screen.step.request.steps.loader.b r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.avito.android.publish.screen.step.request.steps.loader.g
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.publish.screen.step.request.steps.loader.g r0 = (com.avito.android.publish.screen.step.request.steps.loader.g) r0
            int r1 = r0.f242040s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f242040s = r1
            goto L1b
        L16:
            com.avito.android.publish.screen.step.request.steps.loader.g r0 = new com.avito.android.publish.screen.step.request.steps.loader.g
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f242038q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242040s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.C42729a0.b(r6)
            com.avito.android.util.R0 r6 = r5.f242022k
            kotlinx.coroutines.scheduling.b r6 = r6.a()
            com.avito.android.publish.screen.step.request.steps.loader.h r2 = new com.avito.android.publish.screen.step.request.steps.loader.h
            r4 = 0
            r2.<init>(r5, r4)
            r0.f242040s = r3
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r6, r2, r0)
            if (r6 != r1) goto L4c
            goto L4d
        L4c:
            r1 = r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.steps.loader.b.c(com.avito.android.publish.screen.step.request.steps.loader.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void d(b bVar, CategoryParameters categoryParameters, PublishState publishState) throws NotFoundException {
        PhotoParameter photoParameter;
        ArrayList arrayList;
        List<ImageUploadResult> onlyUploaded;
        List<ImageUploadResult> onlyUploaded2;
        List<ImageUploadResult> onlyUploaded3;
        bVar.f242015d.K(categoryParameters.getNavigation());
        Draft draft = categoryParameters.getDraft();
        Navigation navigation2 = categoryParameters.getNavigation();
        if (draft != null) {
            C50213a c50213a = bVar.f242017f;
            String publishSessionId = draft.getPublishSessionId();
            c50213a.f443211c = publishSessionId;
            c50213a.f443210b = publishSessionId;
            if (bVar.f242013b) {
                bVar.f242018g.a(navigation2, draft.getDraftId());
            }
        }
        if (bVar.f242012a) {
            C0 c02 = bVar.f242014c;
            if ((c02.f231865c0 != null || c02.Be() || c02.le()) && (photoParameter = (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class)) != null) {
                PhotoParameter.ImageUploadListWrapper value = photoParameter.getValue();
                if (value == null || (onlyUploaded3 = value.getOnlyUploaded()) == null) {
                    arrayList = null;
                } else {
                    List<ImageUploadResult> list = onlyUploaded3;
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ImageUploadResult) it.next()).getUploadId());
                    }
                }
                bVar.f242015d.l(arrayList);
                InterfaceC33685d0 interfaceC33685d0 = bVar.f242016e;
                interfaceC33685d0.a();
                PhotoParameter.ImageUploadListWrapper value2 = photoParameter.getValue();
                if (value2 != null && (onlyUploaded2 = value2.getOnlyUploaded()) != null) {
                    int i12 = 0;
                    for (Object obj : onlyUploaded2) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        ImageUploadResult imageUploadResult = (ImageUploadResult) obj;
                        interfaceC33685d0.b(i12, imageUploadResult.getImage(), imageUploadResult.getUploadId());
                        i12 = i13;
                    }
                }
                PhotoParameter.ImageUploadListWrapper value3 = photoParameter.getValue();
                c02.f231876n0 = (value3 == null || (onlyUploaded = value3.getOnlyUploaded()) == null) ? null : Integer.valueOf(onlyUploaded.size());
            }
        }
        MultiGeoParameter multiGeoParameter = (MultiGeoParameter) categoryParameters.getFirstParameterOfType(MultiGeoParameter.class);
        if (multiGeoParameter != null && L.f(multiGeoParameter.getId(), "165430")) {
            bVar.f242015d.E0();
        }
        C0 c03 = bVar.f242014c;
        if ((c03.f231863a0 || c03.f231864b0) && publishState != null) {
            c03.Je(categoryParameters, publishState);
        } else {
            List<CategoryPublishStep> listUe = c03.ue();
            c03.Ke(categoryParameters);
            if (!(listUe != null ? c03.Se(listUe) : false)) {
                c03.xe(null);
            }
        }
        c03.f231875m0 = false;
    }

    public static final void e(b bVar, CategoryPublishStep categoryPublishStep, PublishState publishState, int i12, Navigation navigation2, Navigation navigation3, Navigation navigation4, Navigation navigation5) {
        bVar.getClass();
        if (categoryPublishStep instanceof CategoryPublishStep.Wizard) {
            publishState.k().put(Integer.valueOf(i12), new PublishState.StepState.Wizard(navigation2, navigation4, navigation3));
        } else if (categoryPublishStep instanceof CategoryPublishStep.SuggestCategory) {
            Map<Integer, PublishState.StepState> mapK = publishState.k();
            Integer numValueOf = Integer.valueOf(i12);
            String title = navigation5.getTitle();
            if (title == null) {
                title = "";
            }
            mapK.put(numValueOf, new PublishState.StepState.CategoriesSuggestions(navigation2, new WizardParameter(navigation5, title, navigation5.getDescription(), null, null, false, null, 120, null), null, null, 12, null));
        }
    }

    @Override // com.avito.android.publish.screen.step.request.steps.loader.a
    @k
    public final InterfaceC43160i<InterfaceC14477b> load() {
        return C43175k.G(new C7251b(null));
    }
}

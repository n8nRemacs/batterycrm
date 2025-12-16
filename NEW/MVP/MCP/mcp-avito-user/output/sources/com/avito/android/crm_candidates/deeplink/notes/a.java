package com.avito.android.crm_candidates.deeplink.notes;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import Ys.InterfaceC18322a;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_candidates.deeplink.notes.JobCrmNotesDeeplink;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Note;
import com.avito.android.crm_candidates.view.list_items.notes_list.JobCrmNoteItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30070i4;
import com.avito.android.util.C35755b0;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47918a;
import sv.C48421d;

/* compiled from: JobCrmNotesDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/notes/a;", "Lev/a;", "Lcom/avito/android/crm_candidates/deeplink/notes/JobCrmNotesDeeplink;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<JobCrmNotesDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC18322a f129175f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f129176g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f129177h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final E f129178i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.date_time_formatter.b f129179j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C43238h f129180k;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_candidates.deeplink.notes.a$a, reason: collision with other inner class name */
    public static final class C3830a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f129181b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f129182c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.crm_candidates.deeplink.notes.a$a$a, reason: collision with other inner class name */
        public static final class C3831a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f129183b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f129184c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_candidates.deeplink.notes.JobCrmNotesDeeplinkHandler$onCreate$$inlined$filter$1$2", f = "JobCrmNotesDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_candidates.deeplink.notes.a$a$a$a, reason: collision with other inner class name */
            public static final class C3832a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f129185q;

                /* renamed from: r, reason: collision with root package name */
                public int f129186r;

                public C3832a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f129185q = obj;
                    this.f129186r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3831a.this.emit(null, this);
                }
            }

            public C3831a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f129183b = interfaceC43172j;
                this.f129184c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.crm_candidates.deeplink.notes.a.C3830a.C3831a.C3832a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_candidates.deeplink.notes.a$a$a$a r0 = (com.avito.android.crm_candidates.deeplink.notes.a.C3830a.C3831a.C3832a) r0
                    int r1 = r0.f129186r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f129186r = r1
                    goto L18
                L13:
                    com.avito.android.crm_candidates.deeplink.notes.a$a$a$a r0 = new com.avito.android.crm_candidates.deeplink.notes.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f129185q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f129186r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.crm_candidates.deeplink.notes.a r2 = r4.f129184c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f129186r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f129183b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.deeplink.notes.a.C3830a.C3831a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C3830a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f129181b = interfaceC43160i;
            this.f129182c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f129181b).collect(new C3831a(interfaceC43172j, this.f129182c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: JobCrmNotesDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.deeplink.notes.JobCrmNotesDeeplinkHandler$onCreate$2", f = "JobCrmNotesDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f129188q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f129188q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((b) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            G0 g02;
            JobCrmApplicationItem jobCrmApplicationItem;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47918a c47918a = (C47918a) this.f129188q;
            int i12 = c47918a.f437156b;
            a aVar = a.this;
            if (i12 != -1) {
                aVar.j(AbstractC14250d.c.f9171c);
            } else {
                Intent intent = c47918a.f437157c;
                if (intent == null || (jobCrmApplicationItem = (JobCrmApplicationItem) intent.getParcelableExtra("job_crm_new_note_result")) == null) {
                    g02 = null;
                } else {
                    aVar.j(new JobCrmNotesDeeplink.b(jobCrmApplicationItem));
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    aVar.j(AbstractC14250d.c.f9171c);
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC18322a interfaceC18322a, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k E e12, @C30070i4.h @k com.avito.android.date_time_formatter.b bVar2, @k R0 r02) {
        this.f129175f = interfaceC18322a;
        this.f129176g = interfaceC4053a;
        this.f129177h = bVar;
        this.f129178i = e12;
        this.f129179j = bVar2;
        this.f129180k = U.a(r02.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2;
        C42784z0 c42784z0;
        String string;
        ArrayList parcelableArrayList;
        JobCrmNotesDeeplink jobCrmNotesDeeplink = (JobCrmNotesDeeplink) deepLink;
        String strA = this.f129178i.a();
        Long lZ02 = strA != null ? C43066x.z0(strA) : null;
        if (lZ02 == null) {
            j(AbstractC14250d.b.f9170c);
            return;
        }
        String str3 = "job_crm_notes_arg";
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("job_crm_notes_arg")) == null) {
            str2 = "job_crm_notes_arg";
            c42784z0 = C42784z0.f406748b;
        } else {
            ArrayList arrayList = new ArrayList(C42745f0.q(parcelableArrayList, 10));
            int i12 = 0;
            for (Object obj : parcelableArrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Note note = (Note) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m0.f406844a.b(JobCrmNoteItem.class));
                sb2.append(i12);
                String str4 = str3;
                arrayList.add(new JobCrmNoteItem(sb2.toString(), note.f130023c, this.f129179j.a(Long.valueOf(note.f130025e), TimeUnit.SECONDS), note.f130024d, note.f130022b == lZ02.longValue()));
                str3 = str4;
                i12 = i13;
            }
            str2 = str3;
            c42784z0 = arrayList;
        }
        if (bundle == null || (string = bundle.getString("job_crm_candidate_name_arg")) == null) {
            string = "";
        }
        Intent intentA = this.f129175f.a();
        intentA.putParcelableArrayListExtra(str2, C35755b0.a(c42784z0));
        intentA.putExtra("job_crm_candidate_name_arg", string);
        intentA.putExtra("job_crm_applicant_id_arg", jobCrmNotesDeeplink.f129170b);
        intentA.putExtra("job_crm_application_id_arg", jobCrmNotesDeeplink.f129171c);
        intentA.putExtra("job_crm_vacancy_id_arg", jobCrmNotesDeeplink.f129172d);
        intentA.putExtra("job_crm_cv_id_arg", jobCrmNotesDeeplink.f129173e);
        this.f129176g.J(intentA, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(null), new C3830a(y.a(this.f129177h.Q()), this)), this.f129180k);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f129180k, null);
    }
}

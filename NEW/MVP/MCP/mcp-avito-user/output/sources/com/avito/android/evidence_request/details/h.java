package com.avito.android.evidence_request.details;

import Rz.InterfaceC15097a;
import androidx.view.M0;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.evidence_request.details.files.FilesInteractor;
import com.avito.android.evidence_request.repository.model.ProofDetailsContent;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EvidenceDetailsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/evidence_request/details/h;", "Landroidx/lifecycle/M0;", "LRz/b;", "LRz/a;", "c", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends M0 implements Rz.b, InterfaceC15097a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.details.params.a f148493E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f148494J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f148495K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final y f148496L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f148497M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final FilesInteractor f148498N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.details.validation.f f148499O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final String f148500P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f148501Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.l f148502R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f148503S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final List<? extends com.avito.conveyor_item.a> f148504T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public List<? extends ParameterSlot> f148505U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public String[] f148506V;

    /* renamed from: W, reason: collision with root package name */
    public long f148507W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final ProofDetailsContent f148508X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<c> f148509Y;

    /* compiled from: EvidenceDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/a;", "Lcom/avito/conveyor_item/a;", "items", "Lkotlin/G0;", "accept", "(LUV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h.this.f148509Y.setValue(new c.e((UV0.a) obj));
        }
    }

    /* compiled from: EvidenceDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f148511b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to update items", (Throwable) obj);
        }
    }

    /* compiled from: EvidenceDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/evidence_request/details/h$c$a;", "Lcom/avito/android/evidence_request/details/h$c$b;", "Lcom/avito/android/evidence_request/details/h$c$c;", "Lcom/avito/android/evidence_request/details/h$c$d;", "Lcom/avito/android/evidence_request/details/h$c$e;", "Lcom/avito/android/evidence_request/details/h$c$f;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: EvidenceDetailsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c$a;", "Lcom/avito/android/evidence_request/details/h$c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PrintableText f148512a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f148513b;

            public a(@Y61.k PrintableText printableText, @Y61.k Throwable th2) {
                super(null);
                this.f148512a = printableText;
                this.f148513b = th2;
            }
        }

        /* compiled from: EvidenceDetailsViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c$b;", "Lcom/avito/android/evidence_request/details/h$c;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f148514a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: EvidenceDetailsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c$c;", "Lcom/avito/android/evidence_request/details/h$c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.evidence_request.details.h$c$c, reason: collision with other inner class name */
        public static final class C4349c extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f148515a;

            public C4349c(@Y61.l String str) {
                super(null);
                this.f148515a = str;
            }
        }

        /* compiled from: EvidenceDetailsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c$d;", "Lcom/avito/android/evidence_request/details/h$c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f148516a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AttributedText f148517b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f148518c;

            public d(@Y61.k AttributedText attributedText, @Y61.k String str, boolean z12) {
                super(null);
                this.f148516a = str;
                this.f148517b = attributedText;
                this.f148518c = z12;
            }
        }

        /* compiled from: EvidenceDetailsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c$e;", "Lcom/avito/android/evidence_request/details/h$c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UV0.a<? extends com.avito.conveyor_item.a> f148519a;

            public e(@Y61.k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
                super(null);
                this.f148519a = aVar;
            }
        }

        /* compiled from: EvidenceDetailsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c$f;", "Lcom/avito/android/evidence_request/details/h$c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends c {

            /* renamed from: a, reason: collision with root package name */
            public final int f148520a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f148521b;

            public f(int i12, boolean z12) {
                super(null);
                this.f148520a = i12;
                this.f148521b = z12;
            }

            public /* synthetic */ f(int i12, boolean z12, int i13, C42822w c42822w) {
                this(i12, (i13 & 2) != 0 ? false : z12);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public h(@Y61.k g gVar, @Y61.k y yVar, @Y61.k FilesInteractor filesInteractor, @Y61.k com.avito.android.evidence_request.details.params.a aVar, @Y61.k com.avito.android.evidence_request.details.validation.f fVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k String str, @Y61.k Set set) {
        this.f148493E = aVar;
        this.f148494J = interfaceC36030r0;
        this.f148495K = set;
        this.f148496L = yVar;
        this.f148497M = interfaceC35741a1;
        this.f148498N = filesInteractor;
        this.f148499O = fVar;
        this.f148500P = str;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f148501Q = cVar;
        this.f148503S = new D<>();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f148504T = c42784z0;
        this.f148505U = c42784z0;
        com.avito.android.evidence_request.details.files.a.f148439a.getClass();
        this.f148506V = (String[]) com.avito.android.evidence_request.details.files.a.f148440b.getValue();
        this.f148507W = 16777216L;
        interfaceC36030r0.i(set);
        com.jakewharton.rxrelay3.c cVarG = interfaceC36030r0.g();
        a aVar2 = new a();
        l41.g<? super Throwable> gVar2 = b.f148511b;
        cVarG.getClass();
        cVar.b(cVarG.v0(aVar2, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
        this.f148508X = gVar.X6(str);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            io.reactivex.rxjava3.disposables.c cVar2 = this.f148501Q;
            if (!zHasNext) {
                u uVar = new u(this);
                FilesInteractor filesInteractor2 = this.f148498N;
                cVar2.b(filesInteractor2.c(uVar, this));
                cVar2.b(filesInteractor2.b());
                ProofDetailsContent proofDetailsContent = this.f148508X;
                this.f148505U = proofDetailsContent.f149205f;
                this.f148504T = proofDetailsContent.f149204e;
                proofDetailsContent.f149202c.setOnDeepLinkClickListener(new com.avito.android.evidence_request.details.c(this, 1));
                this.f148501Q.b(this.f148499O.a(this.f148505U).i(new m(this)).x(new n(this), o.f148540b));
                this.f148509Y = new D<>();
                return;
            }
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof K) {
                io.reactivex.rxjava3.core.z<DeepLink> zVarK = ((K) dVar).k();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                zVarK.getClass();
                cVar2.b(zVarK.C0(100L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new s(this), t.f148558b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // Rz.InterfaceC15097a
    /* renamed from: O0, reason: from getter */
    public final long getF148507W() {
        return this.f148507W;
    }

    @Y61.l
    public final PhotoParameter ke() {
        Object next;
        Iterator<T> it = this.f148505U.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof PhotoParameter) {
                break;
            }
        }
        return (PhotoParameter) (next instanceof PhotoParameter ? next : null);
    }

    @Override // Rz.InterfaceC15097a
    public final boolean l1(long j12) {
        return j12 <= getF148507W();
    }

    public final ArrayList le() {
        return C42745f0.h0(this.f148493E.a(this.f148505U), this.f148504T);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f148494J.a();
        this.f148501Q.e();
        super.onCleared();
    }
}

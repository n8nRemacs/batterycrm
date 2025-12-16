package com.avito.android.crm_candidates.view.ui.counter_view;

import Qs.InterfaceC14928a;
import Y61.k;
import Y61.l;
import android.widget.TextView;
import androidx.view.C22977J;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import l41.InterfaceC43543a;
import l41.g;

/* compiled from: JobCrmCandidatesCounterView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/ui/counter_view/b;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14928a f130271a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f130272b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f130273c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public C22977J f130274d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f130275e = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: JobCrmCandidatesCounterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar = b.this;
            C22977J c22977j = bVar.f130274d;
            if (c22977j != null) {
                C43259k.d(c22977j, null, null, new com.avito.android.crm_candidates.view.ui.counter_view.a(bVar, null), 3);
            }
        }
    }

    /* compiled from: JobCrmCandidatesCounterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.ui.counter_view.b$b, reason: collision with other inner class name */
    public static final class C3873b<T> implements g {
        public C3873b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            b bVar = b.this;
            C22977J c22977j = bVar.f130274d;
            if (c22977j != null) {
                C43259k.d(c22977j, null, null, new com.avito.android.crm_candidates.view.ui.counter_view.a(bVar, null), 3);
            }
        }
    }

    /* compiled from: JobCrmCandidatesCounterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f130278b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2 v22 = V2.f318762a;
            String message = ((Throwable) obj).getMessage();
            if (message == null) {
                message = "";
            }
            v22.d("JobCrmCandidatesCounterView", message);
        }
    }

    @Inject
    public b(@k InterfaceC14928a interfaceC14928a) {
        this.f130271a = interfaceC14928a;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f130275e;
        cVar.e();
        I0 i0J0 = z.a0(5L, 5L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b());
        a aVar = new a();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(i0J0.J(interfaceC43543a, aVar).v0(new C3873b(), c.f130278b, interfaceC43543a));
    }
}

package com.avito.android.extended_profile_ux_feedback;

import com.avito.android.extended_profile_ux_feedback.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.ux.feedback.impl.x;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import l41.o;

/* compiled from: ExtendedProfileUxFeedbackHelperImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ux_feedback/d;", "Lcom/avito/android/extended_profile_ux_feedback/b;", "_avito_extended-profile-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.extended_profile_ux_feedback.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ux.feedback.impl.j f154146a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f154147b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f154148c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f154149d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public y f154150e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.extended_profile_ux_feedback.a> f154151f = C42745f0.U(a.C4501a.f154140b, a.b.f154141b, a.f.f154144b, a.e.f154143b, a.d.f154142b);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f154152g = C42727D.c(new com.avito.android.extended_profile_ux_feedback.c(this));

    /* compiled from: ExtendedProfileUxFeedbackHelperImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f154149d = true;
        }
    }

    /* compiled from: ExtendedProfileUxFeedbackHelperImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/ux/feedback/impl/x;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile_ux_feedback.a f154155c;

        public b(com.avito.android.extended_profile_ux_feedback.a aVar) {
            this.f154155c = aVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).longValue();
            return d.this.f154146a.b(this.f154155c);
        }
    }

    /* compiled from: ExtendedProfileUxFeedbackHelperImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/x;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/ux/feedback/impl/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile_ux_feedback.a f154157c;

        public c(com.avito.android.extended_profile_ux_feedback.a aVar) {
            this.f154157c = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((x) obj) instanceof x.d) {
                i iVar = d.this.f154147b;
                iVar.f154159a.putLong(this.f154157c.f154139a, System.currentTimeMillis());
            }
        }
    }

    /* compiled from: ExtendedProfileUxFeedbackHelperImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_ux_feedback.d$d, reason: collision with other inner class name */
    public static final class C4502d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C4502d<T> f154158b = new C4502d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "ExtendedProfileUxFeedbackHelperImpl", (Throwable) obj);
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.ux.feedback.impl.j jVar, @Y61.k i iVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f154146a = jVar;
        this.f154147b = iVar;
        this.f154148c = interfaceC35745a5;
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void a() {
        g(a.d.f154142b, null);
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void b() {
        g(a.e.f154143b, 5000L);
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void c(@Y61.k String str) {
        g(new a.c(str, null), null);
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void clear() {
        y yVar = this.f154150e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f154150e = null;
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void d() {
        g(a.f.f154144b, null);
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void e() {
        g(a.b.f154141b, null);
    }

    @Override // com.avito.android.extended_profile_ux_feedback.b
    public final void f() {
        g(a.C4501a.f154140b, 5000L);
    }

    public final void g(com.avito.android.extended_profile_ux_feedback.a aVar, Long l12) {
        Object next;
        if (this.f154149d) {
            return;
        }
        InterfaceC42726C interfaceC42726C = this.f154152g;
        Long l13 = (Long) ((Map) interfaceC42726C.getValue()).get(aVar);
        long jLongValue = l13 != null ? l13.longValue() : this.f154147b.f154159a.getLong(aVar.f154139a, 0L);
        if (jLongValue > 0) {
            Map map = (Map) interfaceC42726C.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!L.f(entry, aVar)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((Number) next).longValue() < jLongValue) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (((Long) next) != null) {
                return;
            }
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f154148c;
        I0 i0J0 = (l12 != null ? z.F0(l12.longValue(), TimeUnit.MILLISECONDS, interfaceC35745a5.c()) : z.c0(0L)).j0(interfaceC35745a5.e());
        a aVar2 = new a();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        z zVarT = i0J0.J(interfaceC43543a, aVar2).T(new b(aVar), Integer.MAX_VALUE);
        c cVar = new c(aVar);
        l41.g<? super Throwable> gVar = C4502d.f154158b;
        zVarT.getClass();
        this.f154150e = (y) zVarT.v0(cVar, gVar, interfaceC43543a);
    }
}

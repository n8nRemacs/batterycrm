package com.avito.android.calltracking_core;

import Y61.k;
import am.InterfaceC19907a;
import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.Y5;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.F;
import iz.C42140a;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.reflect.n;
import kotlinx.coroutines.rx3.y;
import l41.o;

/* compiled from: CallTrackingCounterRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking_core/c;", "Lcom/avito/android/calltracking_core/a;", "_avito-discouraged_avito-libs_calltracking-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.calltracking_core.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC19907a> f113794a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f113795b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final gD.f f113796c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<Integer> f113797d = com.jakewharton.rxrelay3.b.N0(0);

    /* compiled from: CallTrackingCounterRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f113798b = new a<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: CallTrackingCounterRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljz/b;", "apply", "(Ljava/lang/Throwable;)Ljz/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.calltracking_core.c$c, reason: collision with other inner class name */
    public static final class C3332c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C3332c<T, R> f113800b = new C3332c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return InterfaceC42451b.a.f405966a;
        }
    }

    /* compiled from: CallTrackingCounterRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljz/b;", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(Ljz/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f113802c;

        public d(E e12) {
            this.f113802c = e12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.d(c.this, this.f113802c.b());
        }
    }

    /* compiled from: CallTrackingCounterRepository.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.this.f113797d.accept(0);
        }
    }

    /* compiled from: CallTrackingCounterRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f113804b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public c(@k h31.e<InterfaceC19907a> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k gD.f fVar, @k E e12, @k InterfaceC41196a interfaceC41196a) {
        this.f113794a = eVar;
        this.f113795b = interfaceC35745a5;
        this.f113796c = fVar;
        e12.g().x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).m0(a.f113798b).t0(new l41.g() { // from class: com.avito.android.calltracking_core.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                c.d(c.this, ((Boolean) obj).booleanValue());
            }
        });
        y.b(interfaceC41196a.g(new C42140a(false, false, 3, null))).x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).m0(C3332c.f113800b).t0(new d(e12));
    }

    public static final void d(c cVar, boolean z12) {
        if (!z12 || !cVar.e()) {
            cVar.f113797d.accept(0);
            return;
        }
        F f12 = new F(new com.avito.android.calltracking_core.b(cVar, 0));
        InterfaceC35745a5 interfaceC35745a5 = cVar.f113795b;
        Y5.a(f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e())).u0(new com.avito.android.calltracking_core.d(cVar), new com.avito.android.calltracking_core.e(cVar));
    }

    @Override // com.avito.android.calltracking_core.a
    public final int a() {
        Integer num = this.f113797d.f364266b.get();
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.avito.android.calltracking_core.a
    @k
    public final C41981q0 b() {
        com.jakewharton.rxrelay3.b<Integer> bVar = this.f113797d;
        bVar.getClass();
        return new C41981q0(bVar);
    }

    @Override // com.avito.android.calltracking_core.a
    public final void c() {
        if (e()) {
            F f12 = new F(new com.avito.android.calltracking_core.b(this, 1));
            InterfaceC35745a5 interfaceC35745a5 = this.f113795b;
            Y5.a(f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e())).u0(new e(), f.f113804b);
        }
    }

    public final boolean e() {
        gD.f fVar = this.f113796c;
        fVar.getClass();
        n<Object>[] nVarArr = gD.f.f396389r;
        n<Object> nVar = nVarArr[4];
        if (((Boolean) fVar.f396393e.a().invoke()).booleanValue()) {
            n<Object> nVar2 = nVarArr[5];
            if (((Boolean) fVar.f396394f.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}

package com.avito.android.messenger;

import com.avito.android.C30277e1;
import com.avito.android.persistence.messenger.S0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DbPurgeInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/c;", "Lcom/avito/android/messenger/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31691c implements InterfaceC31670b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f186699a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f186700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final S0 f186701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32522f f186702d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f186703e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32528l f186704f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186705g = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DbPurgeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.c$a */
    public static final class a implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f186706b;

        public a(Y41.l lVar) {
            this.f186706b = lVar;
        }

        @Override // l41.r
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f186706b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: DbPurgeInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/p0;", "currentUserInfo", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lru/avito/messenger/p0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.c$c, reason: collision with other inner class name */
    public static final class C5480c<T, R> implements l41.o {
        public C5480c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            C31691c c31691c = C31691c.this;
            return c31691c.f186701c.a().o(new C32369d((ru.avito.messenger.p0) obj, c31691c)).r();
        }
    }

    @Inject
    public C31691c(@Y61.k w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k S0 s02, @Y61.k InterfaceC32522f interfaceC32522f, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC32528l interfaceC32528l) {
        this.f186699a = w0Var;
        this.f186700b = interfaceC35745a5;
        this.f186701c = s02;
        this.f186702d = interfaceC32522f;
        this.f186703e = c30277e1;
        this.f186704f = interfaceC32528l;
    }

    @Override // com.avito.android.messenger.InterfaceC31670b
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f186705g;
        cVar.e();
        io.reactivex.rxjava3.internal.operators.observable.L lA2 = this.f186699a.a();
        InterfaceC35745a5 interfaceC35745a5 = this.f186700b;
        AbstractC41768a z12 = new io.reactivex.rxjava3.internal.operators.observable.Z(lA2.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.a()).N(new a(new kotlin.jvm.internal.h0() { // from class: com.avito.android.messenger.c.b
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return Boolean.valueOf(((ru.avito.messenger.p0) obj).f431830d);
            }
        })).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new C5480c());
        C30277e1 c30277e1 = this.f186703e;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[34];
        if (((Boolean) c30277e1.f144961H.a().invoke()).booleanValue()) {
            z12 = z12.g(this.f186704f.a());
        }
        cVar.b(z12.u());
    }
}

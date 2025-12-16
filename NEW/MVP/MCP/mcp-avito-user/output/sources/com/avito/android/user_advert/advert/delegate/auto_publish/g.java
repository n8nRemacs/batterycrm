package com.avito.android.user_advert.advert.delegate.auto_publish;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_advert.advert.delegate.auto_publish.f;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import iI0.C41301f;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: AutoPublishPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_publish/g;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/auto_publish/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends AbstractC40291a implements e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.delegate.auto_publish.c f308529d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f308530e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f308531f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.delegate.auto_publish.a f308532g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC28373a f308533h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public Object f308534i = EmptyDisposable.f401988b;

    /* compiled from: AutoPublishPresenterDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f308535b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AutoPublishPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_advert.advert.items.auto_publish.a f308537c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f308538d;

        public b(com.avito.android.user_advert.advert.items.auto_publish.a aVar, boolean z12) {
            this.f308537c = aVar;
            this.f308538d = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            boolean z13 = this.f308538d;
            com.avito.android.user_advert.advert.items.auto_publish.a aVar = this.f308537c;
            g gVar = g.this;
            if (z12) {
                gVar.getClass();
                gVar.f395801b.accept(new f.a(com.avito.android.user_advert.advert.items.auto_publish.a.a(aVar, z13, true)));
            } else {
                if (p22 instanceof P2.a) {
                    gVar.getClass();
                    com.avito.android.user_advert.advert.items.auto_publish.a aVarA = com.avito.android.user_advert.advert.items.auto_publish.a.a(aVar, !z13, false);
                    com.avito.android.user_advert.advert.delegate.auto_publish.a aVar2 = gVar.f308532g;
                    gVar.f395801b.accept(new f.b(aVarA, z13 ? aVar2.f308521a : aVar2.f308522b));
                    return;
                }
                if (p22 instanceof P2.b) {
                    gVar.getClass();
                    gVar.f395801b.accept(new f.a(com.avito.android.user_advert.advert.items.auto_publish.a.a(aVar, z13, false)));
                }
            }
        }
    }

    /* compiled from: AutoPublishPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f308539b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public g(@k com.avito.android.user_advert.advert.delegate.auto_publish.c cVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar, @k com.avito.android.user_advert.advert.delegate.auto_publish.a aVar, @k InterfaceC28373a interfaceC28373a) {
        this.f308529d = cVar;
        this.f308530e = interfaceC35745a5;
        this.f308531f = fVar;
        this.f308532g = aVar;
        this.f308533h = interfaceC28373a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.auto_publish.e
    public final void L1(@k com.avito.android.user_advert.advert.items.auto_publish.a aVar, boolean z12) throws NumberFormatException {
        String str = aVar.f309237c;
        this.f308533h.c(new C41301f(aVar.f309243i, z12, Long.parseLong(str)));
        this.f308534i.dispose();
        com.avito.android.user_advert.advert.delegate.auto_publish.c cVar = this.f308529d;
        cVar.getClass();
        z zVarR0 = new C42007e(new com.avito.android.advert_core.safedeal.e(str, z12, 1, cVar)).r(a.f308535b).u(new androidx.room.rxjava3.b(this, 20)).F().r0(P2.c.f318721a);
        InterfaceC35745a5 interfaceC35745a5 = this.f308530e;
        this.f308534i = zVarR0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new b(aVar, z12), c.f308539b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.user_advert.advert.delegate.auto_publish.e
    public final void T1(@k com.avito.android.user_advert.advert.items.auto_publish.a aVar, @k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f308534i.dispose();
        super.dispose();
    }
}

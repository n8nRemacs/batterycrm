package com.avito.android.user_advert.advert.delegate.portfolio;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.R0;
import fH0.AbstractC40291a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import rH0.InterfaceC47544a;

/* compiled from: PortfolioWidgetPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/portfolio/b;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/portfolio/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.portfolio.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f308758d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC47544a f308759e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.delegate.portfolio.domain.b f308760f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f308761g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PortfolioWidgetPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/portfolio/b$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f308762b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f308763c;

        static {
            a[] aVarArr = {new a("VIEW_PROJECTS", 0), new a("TOGGLE", 1)};
            f308762b = aVarArr;
            f308763c = kotlin.enums.c.a(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f308762b.clone();
        }
    }

    /* compiled from: PortfolioWidgetPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.portfolio.PortfolioWidgetPresenterDelegateImpl$toggle$1", f = "PortfolioWidgetPresenterDelegate.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_advert.advert.delegate.portfolio.b$b, reason: collision with other inner class name */
    public static final class C9475b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308764q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f308766s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f308767t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9475b(boolean z12, String str, Continuation<? super C9475b> continuation) {
            super(2, continuation);
            this.f308766s = z12;
            this.f308767t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C9475b(this.f308766s, this.f308767t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C9475b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308764q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.user_advert.advert.delegate.portfolio.domain.b bVar = b.this.f308760f;
                this.f308764q = 1;
                if (bVar.a(this.f308767t, this, this.f308766s) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC47544a interfaceC47544a, @k com.avito.android.user_advert.advert.delegate.portfolio.domain.b bVar, @k R0 r02) {
        this.f308758d = aVar;
        this.f308759e = interfaceC47544a;
        this.f308760f = bVar;
        this.f308761g = U.a(r02.a());
    }

    @Override // com.avito.android.user_advert.advert.delegate.portfolio.a
    public final void G1(@k DeepLink deepLink, @k String str) {
        b.a.a(this.f308758d, deepLink, "portfolio_projects", null, 4);
        a[] aVarArr = a.f308762b;
        this.f308759e.a(str, null, "toggle");
    }

    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        U.b(this.f308761g, null);
    }

    @Override // com.avito.android.user_advert.advert.delegate.portfolio.a
    public final void h(@k String str, boolean z12) {
        String strValueOf = String.valueOf(z12);
        a[] aVarArr = a.f308762b;
        this.f308759e.a(str, strValueOf, "view_projects");
        C43259k.d(this.f308761g, null, null, new C9475b(z12, str, null), 3);
    }

    @Override // com.avito.android.user_advert.advert.delegate.portfolio.a
    public final void v0(@k DeepLink deepLink, @k String str) {
        b.a.a(this.f308758d, deepLink, "portfolio_create", null, 4);
        this.f308759e.b(str);
    }
}

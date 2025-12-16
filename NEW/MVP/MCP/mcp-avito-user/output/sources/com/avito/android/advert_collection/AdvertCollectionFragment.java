package com.avito.android.advert_collection;

import I7.a;
import I7.b;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert_collection.A;
import com.avito.android.advert_collection.di.InterfaceC28254b;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.favorites.OrderEntity;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.select.Arguments;
import com.avito.android.select.item_with_iconbutton.ItemWithIconButtonRightEntity;
import com.avito.android.similar_adverts.SimilarAdvertsDialog;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import fv.C40482a;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kv.C43501a;
import lW.InterfaceC43691a;
import z1.AbstractC50339a;

/* compiled from: AdvertCollectionFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_collection/AdvertCollectionFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/select/p;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertCollectionFragment extends TabBaseFragment implements com.avito.android.select.p, InterfaceC33034d.c, InterfaceC33034d.b, com.avito.android.ui.a, InterfaceC28477j.b {

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public static final a f81177V0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection.adapter.a f81178A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f81179B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.o f81180C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC43691a f81181D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f81182E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f81183F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f81184G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.account.E f81185H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f81186I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public A.a f81187J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f81188K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f81189L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.sales_items.m f81190M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public M7.a f81191N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public Class<?> f81192O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public final O0 f81193P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f81194Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f81195R0;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.l
    public Intent f81196S0;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f81197T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f81198U0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f81199t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f81200u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorites.adapter.advert.d f81201v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorites.adapter.loading.c f81202w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorites.adapter.error.c f81203x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection.adapter.author.c f81204y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection.adapter.order.c f81205z0;

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_collection/AdvertCollectionFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AdvertCollectionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert_collection.AdvertCollectionFragment$a$a, reason: collision with other inner class name */
        public static final class C2408a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AdvertCollectionArguments f81206l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Intent f81207m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2408a(AdvertCollectionArguments advertCollectionArguments, Intent intent) {
                super(1);
                this.f81206l = advertCollectionArguments;
                this.f81207m = intent;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("arguments", this.f81206l);
                bundle2.putParcelable("up_intent", this.f81207m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AdvertCollectionFragment a(@Y61.k AdvertCollectionArguments advertCollectionArguments, @Y61.l Intent intent) {
            AdvertCollectionFragment advertCollectionFragment = new AdvertCollectionFragment();
            C35966w1.a(advertCollectionFragment, -1, new C2408a(advertCollectionArguments, intent));
            return advertCollectionFragment;
        }

        public a() {
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Location location = (Location) obj;
            InterfaceC43691a interfaceC43691a = AdvertCollectionFragment.this.f81181D0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(location, null);
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            AdvertCollectionFragment advertCollectionFragment = AdvertCollectionFragment.this;
            InterfaceC43691a interfaceC43691a = advertCollectionFragment.f81181D0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(null, th3.getMessage());
            advertCollectionFragment.E5().accept(a.f.f7959a);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lkotlin/G0;", "invoke", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Location, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Location location) {
            a aVar = AdvertCollectionFragment.f81177V0;
            AdvertCollectionFragment.this.E5().accept(a.e.f7958a);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f81211l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Boolean, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            a aVar = AdvertCollectionFragment.f81177V0;
            AdvertCollectionFragment.this.E5().accept(a.r.f7972a);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionFragment$onViewCreated$1", f = "AdvertCollectionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f81213q;

        /* compiled from: AdvertCollectionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionFragment$onViewCreated$1$1", f = "AdvertCollectionFragment.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f81215q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertCollectionFragment f81216r;

            /* compiled from: AdvertCollectionFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advert_collection.AdvertCollectionFragment$g$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2409a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AdvertCollectionFragment f81217b;

                public C2409a(AdvertCollectionFragment advertCollectionFragment) {
                    this.f81217b = advertCollectionFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    I7.b bVar = (I7.b) obj;
                    a aVar = AdvertCollectionFragment.f81177V0;
                    AdvertCollectionFragment advertCollectionFragment = this.f81217b;
                    if (L.f(bVar, b.a.f7976a)) {
                        advertCollectionFragment.D5();
                    } else {
                        if (bVar instanceof b.c) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = advertCollectionFragment.f81184G0;
                            b.c cVar = (b.c) bVar;
                            (aVar2 != null ? aVar2 : null).r6(cVar.f7979b, cVar.f7978a, cVar.f7980c);
                        } else if (bVar instanceof b.f) {
                            com.avito.android.select.bottom_sheet.c.a(advertCollectionFragment, ((b.f) bVar).f7983a).show(advertCollectionFragment.getParentFragmentManager(), "select_fragment");
                        } else if (bVar instanceof b.j) {
                            SimilarAdvertsDialog.a.a(SimilarAdvertsDialog.f283776w0, ((b.j) bVar).f7991a).show(advertCollectionFragment.getChildFragmentManager(), (String) null);
                        } else if (bVar instanceof b.g) {
                            InterfaceC35845m2 interfaceC35845m2 = advertCollectionFragment.f81182E0;
                            if (interfaceC35845m2 == null) {
                                interfaceC35845m2 = null;
                            }
                            b.g gVar = (b.g) bVar;
                            Intent intentD = interfaceC35845m2.d(gVar.f7984a, gVar.f7985b);
                            InterfaceC35845m2 interfaceC35845m22 = advertCollectionFragment.f81182E0;
                            if (interfaceC35845m22 == null) {
                                interfaceC35845m22 = null;
                            }
                            Class<?> cls = advertCollectionFragment.f81192O0;
                            advertCollectionFragment.startActivity(Intent.createChooser(intentD, advertCollectionFragment.requireContext().getResources().getString(R.string.share), interfaceC35845m22.v(cls != null ? cls : null).getIntentSender()));
                        } else if (L.f(bVar, b.h.f7986a)) {
                            InterfaceC43691a interfaceC43691a = advertCollectionFragment.f81181D0;
                            if (interfaceC43691a == null) {
                                interfaceC43691a = null;
                            }
                            FindLocationPage findLocationPage = FindLocationPage.f181725c;
                            interfaceC43691a.e("advert_collection");
                            InterfaceC33034d interfaceC33034d = advertCollectionFragment.f81179B0;
                            advertCollectionFragment.f81194Q0.b((interfaceC33034d != null ? interfaceC33034d : null).g());
                        } else if (bVar instanceof b.C0449b) {
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, advertCollectionFragment, com.avito.android.printable_text.b.f(((b.C0449b) bVar).f7977a), null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, 942);
                            advertCollectionFragment.D5();
                        } else if (bVar instanceof b.i) {
                            M7.a aVar3 = advertCollectionFragment.f81191N0;
                            b.i iVar = (b.i) bVar;
                            (aVar3 != null ? aVar3 : null).c(iVar.f7987a, iVar.f7988b, iVar.f7990d, iVar.f7989c);
                        } else if (bVar instanceof b.e) {
                            com.avito.android.lib.util.g.a((com.avito.android.lib.design.bottom_sheet.d) advertCollectionFragment.f81197T0.getValue());
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f81217b, AdvertCollectionFragment.class, "collectEvents", "collectEvents(Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AdvertCollectionFragment advertCollectionFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f81216r = advertCollectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f81216r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f81215q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = AdvertCollectionFragment.f81177V0;
                    AdvertCollectionFragment advertCollectionFragment = this.f81216r;
                    InterfaceC43160i<I7.b> events = advertCollectionFragment.E5().getEvents();
                    C2409a c2409a = new C2409a(advertCollectionFragment);
                    this.f81215q = 1;
                    if (events.collect(c2409a, this) == coroutine_suspended) {
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

        /* compiled from: AdvertCollectionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionFragment$onViewCreated$1$2", f = "AdvertCollectionFragment.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f81218q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertCollectionFragment f81219r;

            /* compiled from: AdvertCollectionFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a extends N implements Y41.l<AdvertCollectionState, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ AdvertCollectionFragment f81220l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(AdvertCollectionFragment advertCollectionFragment) {
                    super(1);
                    this.f81220l = advertCollectionFragment;
                }

                @Override // Y41.l
                public final G0 invoke(AdvertCollectionState advertCollectionState) {
                    AdvertCollectionState advertCollectionState2 = advertCollectionState;
                    com.avito.android.favorite.n nVar = this.f81220l.f81183F0;
                    if (nVar == null) {
                        nVar = null;
                    }
                    nVar.c(new UV0.c(advertCollectionState2.f81615b));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AdvertCollectionFragment advertCollectionFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f81219r = advertCollectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f81219r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f81218q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = AdvertCollectionFragment.f81177V0;
                    AdvertCollectionFragment advertCollectionFragment = this.f81219r;
                    n2<AdvertCollectionState> state = advertCollectionFragment.E5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = advertCollectionFragment.f81189L0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    a aVar2 = new a(advertCollectionFragment);
                    this.f81218q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, aVar2, this) == coroutine_suspended) {
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

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = AdvertCollectionFragment.this.new g(continuation);
            gVar.f81213q = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f81213q;
            AdvertCollectionFragment advertCollectionFragment = AdvertCollectionFragment.this;
            C43259k.d(t12, null, null, new a(advertCollectionFragment, null), 3);
            C43259k.d(t12, null, null, new b(advertCollectionFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionFragment$onViewCreated$2", f = "AdvertCollectionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f81221q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = AdvertCollectionFragment.this.new h(continuation);
            hVar.f81221q = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((h) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43501a c43501a = (C43501a) this.f81221q;
            a aVar = AdvertCollectionFragment.f81177V0;
            AdvertCollectionFragment.this.E5().accept(new a.k(c43501a));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "()Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.lib.design.bottom_sheet.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lib.design.bottom_sheet.d invoke() {
            AdvertCollectionFragment advertCollectionFragment = AdvertCollectionFragment.this;
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(advertCollectionFragment.requireContext(), 0, 2, null);
            View viewInflate = ((LayoutInflater) dVar.getContext().getSystemService("layout_inflater")).inflate(R.layout.advert_collection_publish_onboarding_layout, (ViewGroup) null);
            dVar.G(viewInflate, true);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
            View viewFindViewById = viewInflate.findViewById(R.id.close_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById).setOnClickListener(new S7.a(dVar, 4));
            dVar.R(new C28247b(advertCollectionFragment));
            return dVar;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f81225m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.l lVar) {
            super(0);
            this.f81225m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(AdvertCollectionFragment.this, this.f81225m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertCollectionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f81227l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f81227l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f81227l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f81228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f81228l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f81228l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f81229l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f81229l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f81229l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/advert_collection/A;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/advert_collection/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<C23060r0, A> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final A invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            A.a aVar = AdvertCollectionFragment.this.f81187J0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public AdvertCollectionFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f81193P0 = new O0(m0.f406844a.b(A.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f81194Q0 = new io.reactivex.rxjava3.disposables.c();
        this.f81195R0 = new io.reactivex.rxjava3.disposables.c();
        this.f81197T0 = C42727D.c(new i());
        this.f81198U0 = new NavigationState(false, null, 2, null);
    }

    public final void D5() {
        ActivityC22955m activityC22955mL1;
        if (!(l1() instanceof AdvertCollectionActivity)) {
            r5();
            return;
        }
        Intent intent = this.f81196S0;
        if (intent != null && (activityC22955mL1 = l1()) != null) {
            activityC22955mL1.startActivity(intent);
        }
        ActivityC22955m activityC22955mL12 = l1();
        if (activityC22955mL12 != null) {
            activityC22955mL12.finish();
        }
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    public final A E5() {
        return (A) this.f81193P0.getValue();
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        com.avito.android.location.find.o oVar = this.f81180C0;
        if (oVar == null) {
            oVar = null;
        }
        O oK2 = oVar.b(requireActivity(), (4 & 2) == 0, (4 & 4) == 0).K(new b());
        InterfaceC35745a5 interfaceC35745a5 = this.f81186I0;
        this.f81194Q0.b(A1.h(oK2.j0((interfaceC35745a5 != null ? interfaceC35745a5 : null).e()), new c(), new d(), 2));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f81182E0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        E5().accept(a.f.f7959a);
        if (str != null) {
            InterfaceC43691a interfaceC43691a = this.f81181D0;
            if (interfaceC43691a == null) {
                interfaceC43691a = null;
            }
            interfaceC43691a.f(null, str);
        }
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        InterfaceC43691a interfaceC43691a = this.f81181D0;
        if (interfaceC43691a == null) {
            interfaceC43691a = null;
        }
        interfaceC43691a.f(null, "PERMISSION DENIED");
        InterfaceC33034d interfaceC33034d = this.f81179B0;
        this.f81194Q0.b((interfaceC33034d != null ? interfaceC33034d : null).h());
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        if (!str.equals("orderRequestId")) {
            if (str.equals("menuRequestId")) {
                A aE5 = E5();
                Object objG = C42745f0.G(list);
                aE5.accept(new a.g(objG instanceof ItemWithIconButtonRightEntity ? (ItemWithIconButtonRightEntity) objG : null));
                return;
            }
            return;
        }
        com.avito.android.sales_items.m mVar = this.f81190M0;
        if (mVar == null) {
            mVar = null;
        }
        mVar.f(false);
        A aE52 = E5();
        Object objG2 = C42745f0.G(list);
        aE52.accept(new a.q(objG2 instanceof OrderEntity ? (OrderEntity) objG2 : null));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.account.E e12 = this.f81185H0;
        if (e12 == null) {
            e12 = null;
        }
        this.f81195R0.b(A1.h(e12.g().D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L), e.f81211l, new f(), 2));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f81189L0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.advert_collection_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.favorite.n nVar = this.f81183F0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.I();
        this.f81195R0.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC33034d interfaceC33034d = this.f81179B0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        this.f81194Q0.e();
        com.avito.android.advert_collection_toast.a aVar = this.f81188K0;
        (aVar != null ? aVar : null).a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.avito.android.location.find.o oVar = this.f81180C0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.location.find.o oVar = this.f81180C0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.a(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33034d interfaceC33034d = this.f81179B0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        InterfaceC33034d interfaceC33034d = this.f81179B0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f81199t0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f81200u0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        A aE5 = E5();
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.advert_collection.adapter.a aVar3 = this.f81178A0;
        com.avito.android.advert_collection.adapter.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.android.favorites.adapter.advert.d dVar = this.f81201v0;
        com.avito.android.favorites.adapter.advert.d dVar2 = dVar != null ? dVar : null;
        com.avito.android.favorites.adapter.loading.c cVar = this.f81202w0;
        com.avito.android.favorites.adapter.loading.c cVar2 = cVar != null ? cVar : null;
        com.avito.android.favorites.adapter.error.c cVar3 = this.f81203x0;
        com.avito.android.favorites.adapter.error.c cVar4 = cVar3 != null ? cVar3 : null;
        com.avito.android.advert_collection.adapter.author.c cVar5 = this.f81204y0;
        com.avito.android.advert_collection.adapter.author.c cVar6 = cVar5 != null ? cVar5 : null;
        Resources resources = getResources();
        com.avito.android.advert_collection.adapter.order.c cVar7 = this.f81205z0;
        z zVar = new z(view, jVar2, aVar2, aE5, viewLifecycleOwner, dVar2, cVar2, cVar4, cVar6, cVar7 != null ? cVar7 : null, resources, aVar4);
        com.avito.android.favorite.n nVar = this.f81183F0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.s4(zVar);
        InterfaceC33034d interfaceC33034d = this.f81179B0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e(view);
        com.avito.android.advert_collection_toast.a aVar5 = this.f81188K0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        aVar5.d(view, this);
        C22984Q.a(getViewLifecycleOwner()).c(new g(null));
        com.avito.android.deeplink_handler.handler.composite.a aVar6 = this.f81184G0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        C43175k.K(new C43197r1(new h(null), C40482a.b(aVar6)), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f81189L0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        AdvertCollectionArguments advertCollectionArguments = arguments != null ? (AdvertCollectionArguments) arguments.getParcelable("arguments") : null;
        if (advertCollectionArguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        this.f81196S0 = arguments2 != null ? (Intent) arguments2.getParcelable("up_intent") : null;
        com.avito.android.advert_collection.di.B.a().a(cv.c.b(this), (InterfaceC28254b) C29972i.a(C29972i.b(this), InterfaceC28254b.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), com.avito.android.analytics.screens.s.c(this), getResources(), advertCollectionArguments.f81174b, advertCollectionArguments.f81175c, advertCollectionArguments.f81176d, this, requireActivity(), this, getF42820b(), bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f81189L0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF107594z0() {
        return this.f81198U0;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}

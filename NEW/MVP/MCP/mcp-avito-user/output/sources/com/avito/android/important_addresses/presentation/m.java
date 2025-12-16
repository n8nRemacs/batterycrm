package com.avito.android.important_addresses.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.B;
import com.avito.android.important_addresses.ItemCoordinates;
import com.avito.android.important_addresses.domain.TransportType;
import com.avito.android.important_addresses.presentation.DestinationInfo;
import com.avito.android.important_addresses.presentation.ImportantAddressesState;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.important_addresses_selection.deeplink.l;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import com.squareup.anvil.annotations.ContributesBinding;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.FilterVehicleTypes;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: ImportantAddressesPresenter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses/presentation/m;", "Lcom/avito/android/important_addresses/presentation/l;", "LJM/h;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes14.dex */
public final class m implements l, JM.h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MM.c f169646a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169647b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MM.g f169648c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final JM.i f169649d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ItemCoordinates f169650e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final JM.d f169651f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final KM.a f169652g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C43238h f169653h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public ImportantAddressesState f169654i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final HashMap<Integer, MM.f> f169655j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.important_addresses.presentation.g f169656k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.important_addresses.presentation.a> f169657l;

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/important_addresses_selection/deeplink/l$c;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$10", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super l.c>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f169658q;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super l.c> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            a aVar = new a(3, continuation);
            aVar.f169658q = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f169658q);
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/important_addresses/presentation/a;", "kotlin.jvm.PlatformType", "data", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/important_addresses/presentation/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$1", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<com.avito.android.important_addresses.presentation.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f169659q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = m.this.new b(continuation);
            bVar.f169659q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.important_addresses.presentation.a aVar, Continuation<? super G0> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object next;
            DestinationInfo destinationInfoA;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.important_addresses.presentation.a aVar = (com.avito.android.important_addresses.presentation.a) this.f169659q;
            m mVar = m.this;
            ImportantAddressesState importantAddressesState = mVar.f169654i;
            ImportantAddressesState.ContentWithAddresses contentWithAddresses = importantAddressesState instanceof ImportantAddressesState.ContentWithAddresses ? (ImportantAddressesState.ContentWithAddresses) importantAddressesState : null;
            if (contentWithAddresses != null) {
                List<DestinationInfo> list = contentWithAddresses.f169599f;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((DestinationInfo) next).f169586b == aVar.f169615a) {
                        break;
                    }
                }
                DestinationInfo destinationInfo = (DestinationInfo) next;
                if (destinationInfo != null) {
                    int iIndexOf = list.indexOf(destinationInfo);
                    int iOrdinal = aVar.f169616b.ordinal();
                    String str = aVar.f169617c;
                    if (iOrdinal == 0) {
                        destinationInfoA = DestinationInfo.a(destinationInfo, null, null, str, 63);
                    } else if (iOrdinal == 1) {
                        destinationInfoA = DestinationInfo.a(destinationInfo, null, str, null, 95);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        destinationInfoA = DestinationInfo.a(destinationInfo, str, null, null, 111);
                    }
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.set(iIndexOf, destinationInfoA);
                    mVar.e(new ImportantAddressesState.ContentWithAddresses(contentWithAddresses.f169595b, contentWithAddresses.f169596c, contentWithAddresses.f169597d, contentWithAddresses.f169598e, arrayList, contentWithAddresses.f169600g, false));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/important_addresses/presentation/a;", "kotlin.jvm.PlatformType", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$2", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.important_addresses.presentation.a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f169661q;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.important_addresses.presentation.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f169661q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f169661q);
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f169662b = new d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof UserAddressLink.Result.Success.Added;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "apply", "(Lkv/a;)Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f169663b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (UserAddressLink.Result.Success) ((C43501a) obj).f413261b;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$5", f = "ImportantAddressesPresenter.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<UserAddressLink.Result.Success, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f169664q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f169665r;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = m.this.new f(continuation);
            fVar.f169665r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(UserAddressLink.Result.Success success, Continuation<? super G0> continuation) {
            return ((f) create(success, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f169664q;
            m mVar = m.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAddressLink.Result.Success success = (UserAddressLink.Result.Success) this.f169665r;
                int iE2 = mVar.f169649d.e();
                JM.i iVar = mVar.f169649d;
                int iMin = Math.min(iE2 + 1, iVar.b());
                iVar.d(Boxing.boxInt(iMin));
                com.avito.android.important_addresses.presentation.g gVar = mVar.f169656k;
                if (gVar != null) {
                    Context context = gVar.f169629b;
                    ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                    Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                    Activity activity = baseContext instanceof Activity ? (Activity) baseContext : null;
                    View viewFindViewById = activity != null ? activity.findViewById(R.id.bottom_navigation) : null;
                    if (viewFindViewById == null) {
                        viewFindViewById = gVar.f169630c;
                    }
                    com.avito.android.user_address.e.a(viewFindViewById, success);
                }
                if (iE2 != iMin) {
                    mVar.e(new ImportantAddressesState.Initial(mVar.f169654i.getF169612b(), mVar.f169654i.getF169613c(), iMin));
                    this.f169664q = 1;
                    if (m.c(mVar, false, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            b.a.a(mVar.f169647b, new UxFeedbackStartCampaignLink("REAddressAdded", false, P0.c(), null), null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$6", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressLink.Result.Success>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f169667q;

        public g() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserAddressLink.Result.Success> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            g gVar = new g(3, continuation);
            gVar.f169667q = th2;
            return gVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f169667q);
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f169668b = new h<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof l.c;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lcom/avito/android/important_addresses_selection/deeplink/l$c;", "apply", "(Lkv/a;)Lcom/avito/android/important_addresses_selection/deeplink/l$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T, R> f169669b = new i<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (l.c) ((C43501a) obj).f413261b;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/l$c;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/important_addresses_selection/deeplink/l$c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$9", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<l.c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f169670q;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = m.this.new j(continuation);
            jVar.f169670q = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(l.c cVar, Continuation<? super G0> continuation) {
            return ((j) create(cVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ImportantAddressesData importantAddressesData = ((l.c) this.f169670q).f169759b;
            m mVar = m.this;
            mVar.e(m.d(mVar, importantAddressesData));
            m.b(mVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class k {
        static {
            int[] iArr = new int[TransportType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TransportType transportType = TransportType.f169574b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TransportType transportType2 = TransportType.f169574b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public m(@Y61.k R0 r02, @Y61.k MM.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k MM.g gVar, @Y61.k JM.i iVar, @Y61.l ItemCoordinates itemCoordinates, @Y61.k JM.d dVar, @Y61.k KM.a aVar2) {
        this.f169646a = cVar;
        this.f169647b = aVar;
        this.f169648c = gVar;
        this.f169649d = iVar;
        this.f169650e = itemCoordinates;
        this.f169651f = dVar;
        this.f169652g = aVar2;
        C43238h c43238hA = U.a(r02.b());
        this.f169653h = c43238hA;
        this.f169654i = new ImportantAddressesState.Initial(null, 0L, iVar.e(), 3, null);
        this.f169655j = new HashMap<>();
        com.jakewharton.rxrelay3.c<com.avito.android.important_addresses.presentation.a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f169657l = cVar2;
        C43175k.K(new C43152f0(new C43197r1(new b(null), y.a(cVar2)), new c(3, null)), c43238hA);
        C43175k.K(new C43152f0(new C43197r1(new f(null), y.a(aVar.d9().N(d.f169662b).d0(e.f169663b))), new g(3, null)), c43238hA);
        C43175k.K(new C43152f0(new C43197r1(new j(null), y.a(aVar.d9().N(h.f169668b).d0(i.f169669b))), new a(3, null)), c43238hA);
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Long, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final void b(m mVar) {
        m mVar2 = mVar;
        ImportantAddressesState importantAddressesState = mVar2.f169654i;
        ?? r32 = 0;
        ImportantAddressesState.ContentWithAddresses contentWithAddresses = importantAddressesState instanceof ImportantAddressesState.ContentWithAddresses ? (ImportantAddressesState.ContentWithAddresses) importantAddressesState : null;
        if (contentWithAddresses == null) {
            return;
        }
        for (DestinationInfo destinationInfo : contentWithAddresses.f169599f) {
            ItemCoordinates itemCoordinates = mVar2.f169650e;
            if (itemCoordinates == null) {
                return;
            }
            Point point = new Point(itemCoordinates.f169572b, itemCoordinates.f169573c);
            DestinationInfo.Coords coords = destinationInfo.f169587c;
            Point point2 = new Point(coords.f169593b, coords.f169594c);
            HashMap<Integer, MM.f> map = mVar2.f169655j;
            Integer numValueOf = Integer.valueOf(destinationInfo.f169586b);
            p pVar = new p(mVar2, destinationInfo);
            MM.c cVar = mVar2.f169646a;
            cVar.getClass();
            kotlin.collections.builders.b bVarT = C42745f0.t();
            RequestPointType requestPointType = RequestPointType.WAYPOINT;
            bVarT.add(new RequestPoint(point, requestPointType, r32, r32));
            bVarT.add(new RequestPoint(point2, requestPointType, r32, r32));
            kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
            DrivingOptions drivingOptions = new DrivingOptions();
            drivingOptions.setRoutesCount(1);
            VehicleOptions vehicleOptions = new VehicleOptions();
            vehicleOptions.setVehicleType(VehicleType.DEFAULT);
            String str = contentWithAddresses.f169595b;
            DrivingSummarySession drivingSummarySessionRequestRoutesSummary = cVar.f10646b.requestRoutesSummary(bVarP, drivingOptions, vehicleOptions, new MM.a(cVar, pVar, str));
            long j12 = contentWithAddresses.f169596c;
            map.put(numValueOf, new MM.f(drivingSummarySessionRequestRoutesSummary, cVar.f10647c.requestRoutesSummary(bVarP, new TimeOptions(Long.valueOf(j12), r32), new RouteOptions(new FitnessOptions(false)), new MM.b(cVar, pVar, TransportType.f169575c, str)), cVar.f10648d.requestRoutesSummary(bVarP, new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(Long.valueOf(j12), null)), new RouteOptions(new FitnessOptions(false)), new MM.b(cVar, pVar, TransportType.f169576d, str))));
            mVar2 = mVar;
            r32 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.important_addresses.presentation.m r8, boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.avito.android.important_addresses.presentation.q
            if (r0 == 0) goto L17
            r0 = r10
            com.avito.android.important_addresses.presentation.q r0 = (com.avito.android.important_addresses.presentation.q) r0
            int r1 = r0.f169682u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f169682u = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.avito.android.important_addresses.presentation.q r0 = new com.avito.android.important_addresses.presentation.q
            r0.<init>(r8, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r6.f169680s
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f169682u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.C42729a0.b(r10)
            goto L84
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            boolean r9 = r6.f169679r
            com.avito.android.important_addresses.presentation.m r8 = r6.f169678q
            kotlin.C42729a0.b(r10)
            goto L65
        L41:
            kotlin.C42729a0.b(r10)
            com.avito.android.important_addresses.presentation.ImportantAddressesState r10 = r8.f169654i
            java.lang.String r10 = r10.getF169612b()
            r6.f169678q = r8
            r6.f169679r = r9
            r6.f169682u = r3
            MM.g r1 = r8.f169648c
            h31.e<LM.a> r3 = r1.f10656a
            java.lang.Object r3 = r3.get()
            LM.a r3 = (LM.a) r3
            JM.a r1 = r1.f10657b
            java.lang.String r1 = r1.f8925c
            java.lang.Object r10 = r3.a(r10, r1, r6)
            if (r10 != r0) goto L65
            goto L86
        L65:
            r1 = r10
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            com.avito.android.important_addresses.presentation.r r10 = new com.avito.android.important_addresses.presentation.r
            r3 = 0
            r10.<init>(r9, r8, r3)
            com.avito.android.important_addresses.presentation.s r9 = new com.avito.android.important_addresses.presentation.s
            r9.<init>(r8, r3)
            r6.f169678q = r3
            r6.f169682u = r2
            r4 = 0
            r5 = 0
            r7 = 60
            r2 = r10
            r3 = r9
            java.lang.Object r8 = com.avito.android.error.z.s(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L84
            goto L86
        L84:
            kotlin.G0 r0 = kotlin.G0.f406611a
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.important_addresses.presentation.m.c(com.avito.android.important_addresses.presentation.m, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final ImportantAddressesState d(m mVar, ImportantAddressesData importantAddressesData) {
        ImportantAddressesState importantAddressesState = mVar.f169654i;
        ImportantAddressesData.Button button = importantAddressesData.getButton();
        List<ImportantAddressesData.Address> listC = importantAddressesData.c();
        Integer numValueOf = listC != null ? Integer.valueOf(listC.size()) : null;
        JM.i iVar = mVar.f169649d;
        iVar.d(numValueOf);
        iVar.c(Integer.valueOf(importantAddressesData.getMaxShow()));
        List<ImportantAddressesData.Address> list = listC;
        if (list == null || list.isEmpty()) {
            String f169612b = mVar.f169654i.getF169612b();
            Long departureTime = importantAddressesData.getDepartureTime();
            return new ImportantAddressesState.ContentWithoutAddresses(f169612b, departureTime != null ? departureTime.longValue() : importantAddressesState.getF169613c(), importantAddressesData.getTitle(), importantAddressesData.getHint(), importantAddressesData.getPlaceholder(), !iVar.f(), new Button(button.getText(), button.getStyle(), button.getDeepLink()));
        }
        List<ImportantAddressesData.Address> list2 = listC;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (ImportantAddressesData.Address address : list2) {
            int id2 = address.getId();
            DestinationInfo.Coords coords = new DestinationInfo.Coords(address.getCoords().getLat(), address.getCoords().getLng());
            Integer numA = com.avito.android.lib.util.q.a(address.getIcon());
            arrayList.add(new DestinationInfo(id2, coords, numA != null ? numA.intValue() : R.attr.ic_buildingOutline16, address.getTitle(), null, null, null, 112, null));
        }
        String f169612b2 = mVar.f169654i.getF169612b();
        Long departureTime2 = importantAddressesData.getDepartureTime();
        return new ImportantAddressesState.ContentWithAddresses(f169612b2, departureTime2 != null ? departureTime2.longValue() : importantAddressesState.getF169613c(), importantAddressesData.getTitle(), importantAddressesData.getHint(), arrayList, new Button(button.getText(), button.getStyle(), button.getDeepLink()), true);
    }

    @Override // com.avito.android.important_addresses.presentation.l
    public final void a(@Y61.k com.avito.android.important_addresses.presentation.g gVar) {
        this.f169656k = gVar;
        gVar.a(this.f169654i);
        C43197r1 c43197r1 = new C43197r1(new n(this, null), gVar.f169638k);
        C43238h c43238h = this.f169653h;
        C43175k.K(c43197r1, c43238h);
        if (this.f169654i instanceof ImportantAddressesState.Initial) {
            C43259k.d(c43238h, null, null, new o(this, null), 3);
        }
    }

    public final void e(ImportantAddressesState importantAddressesState) {
        this.f169654i = importantAddressesState;
        com.avito.android.important_addresses.presentation.g gVar = this.f169656k;
        if (gVar != null) {
            gVar.a(importantAddressesState);
        }
    }

    @Override // JM.h
    public final void e0() {
        this.f169656k = null;
        U.b(this.f169653h, null);
        this.f169651f.f8926b = null;
        HashMap<Integer, MM.f> map = this.f169655j;
        Iterator<Map.Entry<Integer, MM.f>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            MM.f value = it.next().getValue();
            value.f10653a.cancel();
            value.f10654b.cancel();
            value.f10655c.cancel();
        }
        map.clear();
    }

    @Override // JM.h
    @Y61.k
    public final Kundle f0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f169654i, "key.important_addresses_state");
        return kundle;
    }

    @Override // JM.h
    public final void g0(@Y61.k Kundle kundle) {
        ImportantAddressesState importantAddressesState = (ImportantAddressesState) kundle.d("key.important_addresses_state");
        if (importantAddressesState != null) {
            e(importantAddressesState);
        }
    }
}

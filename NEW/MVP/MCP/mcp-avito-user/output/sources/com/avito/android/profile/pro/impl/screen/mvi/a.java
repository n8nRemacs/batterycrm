package com.avito.android.profile.pro.impl.screen.mvi;

import B90.a;
import D90.a;
import D90.b;
import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y41.p;
import Y41.q;
import cK.InterfaceC27058a;
import com.avito.android.O1;
import com.avito.android.account.E;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.component.user_hat.e;
import com.avito.android.deep_linking.links.CalltrackingDeeplink;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NotificationCenterLink;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deep_linking.links.PassportProfilesListLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.orders.OrdersLink;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug;
import com.avito.android.profile.pro.impl.screen.item.group.row.ProfileProGroupRowItem;
import com.avito.android.service_booking_calendar.link.ServiceBookingCalendarMonthLink;
import com.avito.android.wallet.page.deeplink.WalletLink;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import jz.C42453d;
import jz.InterfaceC42451b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import t90.InterfaceC48524a;

/* compiled from: ProfileProActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LD90/a;", "LD90/b;", "LD90/d;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<D90.a, D90.b, D90.d> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f223623j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.pro.impl.interactor.e f223624a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f223625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f223626c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48524a f223627d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final t90.d f223628e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f223629f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E90.a f223630g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27058a f223631h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calltracking_core.f f223632i;

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/a$a;", "", "<init>", "()V", "", "GROUP_ITEM_AUTO_SUBSCRIBE", "Ljava/lang/String;", "GROUP_ITEM_DELETE_ACCOUNT", "GROUP_ITEM_LOGOUT", "GROUP_ITEM_SAFE_ENTRY", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.pro.impl.screen.mvi.a$a, reason: collision with other inner class name */
    public static final class C6771a {
        public /* synthetic */ C6771a(C42822w c42822w) {
            this();
        }

        public C6771a() {
        }
    }

    /* compiled from: ProfileProActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ItemSlug.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ItemSlug itemSlug = ItemSlug.f223103d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ItemSlug itemSlug2 = ItemSlug.f223103d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ItemSlug itemSlug3 = ItemSlug.f223103d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ItemSlug itemSlug4 = ItemSlug.f223103d;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ItemSlug itemSlug5 = ItemSlug.f223103d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ItemSlug itemSlug6 = ItemSlug.f223103d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ItemSlug itemSlug7 = ItemSlug.f223103d;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$$inlined$flatMapLatest$1", f = "ProfileProActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super D90.b>, InterfaceC42451b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223633q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f223634r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f223635s;

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, InterfaceC42451b interfaceC42451b, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f223634r = interfaceC43172j;
            cVar.f223635s = interfaceC42451b;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223633q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f223634r;
                InterfaceC43160i interfaceC43160iW = C43175k.w();
                this.f223633q = 1;
                if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$10", f = "ProfileProActor.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223636q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223637r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D90.a f223638s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f223639t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(D90.a aVar, a aVar2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f223638s = aVar;
            this.f223639t = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f223638s, this.f223639t, continuation);
            dVar.f223637r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223636q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223637r;
                DeepLink deepLink = ((a.l) this.f223638s).f2995a.f223295f;
                if (deepLink != null) {
                    a aVar = this.f223639t;
                    String strA = aVar.f223625b.a();
                    if (strA != null) {
                        aVar.f223627d.d(strA);
                    }
                    b.i iVar = new b.i(deepLink);
                    this.f223636q = 1;
                    if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$14", f = "ProfileProActor.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223640q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223641r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f223642s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D90.a f223643t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(D90.a aVar, a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f223642s = aVar2;
            this.f223643t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f223643t, this.f223642s, continuation);
            eVar.f223641r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223640q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223641r;
                a aVar = this.f223642s;
                a.k kVar = (a.k) this.f223643t;
                aVar.f223630g.b(kVar.f2994a.f223261b);
                b.e eVar = new b.e(kVar.f2994a);
                this.f223640q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$15", f = "ProfileProActor.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223644q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223645r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f223646s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D90.a f223647t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(D90.a aVar, a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f223646s = aVar2;
            this.f223647t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f223647t, this.f223646s, continuation);
            fVar.f223645r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223644q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223645r;
                a aVar = this.f223646s;
                a.m mVar = (a.m) this.f223647t;
                aVar.f223627d.c(mVar.f2996a);
                b.i iVar = new b.i(mVar.f2996a.f223329c);
                this.f223644q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$16", f = "ProfileProActor.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223648q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223649r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D90.a f223650s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(D90.a aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f223650s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f223650s, continuation);
            gVar.f223649r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223648q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223649r;
                DeepLink deepLink = ((a.A) this.f223650s).f2977a.f223574d;
                if (deepLink != null) {
                    b.i iVar = new b.i(deepLink);
                    this.f223648q = 1;
                    if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$17", f = "ProfileProActor.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223651q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223652r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D90.a f223653s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(D90.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f223653s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f223653s, continuation);
            hVar.f223652r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223651q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223652r;
                DeepLink deepLink = ((a.B) this.f223653s).f2978a.f223588e;
                if (deepLink != null) {
                    b.i iVar = new b.i(deepLink);
                    this.f223651q = 1;
                    if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$3", f = "ProfileProActor.kt", i = {0}, l = {94, 95}, m = "invokeSuspend", n = {"$this$onStart"}, s = {"L$0"})
    public static final class i extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223654q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223655r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D90.a f223656s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(D90.a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f223656s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(this.f223656s, continuation);
            iVar.f223655r = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223654q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f223655r;
                b.w wVar = new b.w(((a.y) this.f223656s).f3007a);
                this.f223655r = interfaceC43172j;
                this.f223654q = 1;
                if (interfaceC43172j.emit(wVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f223655r;
                C42729a0.b(obj);
            }
            b.g gVar = b.g.f3024a;
            this.f223655r = null;
            this.f223654q = 2;
            if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$4", f = "ProfileProActor.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223657q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223658r;

        public j() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(2, continuation);
            jVar.f223658r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223657q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223658r;
                b.g gVar = b.g.f3024a;
                this.f223657q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$5", f = "ProfileProActor.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223659q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223660r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D90.a f223661s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f223662t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(D90.a aVar, a aVar2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f223661s = aVar;
            this.f223662t = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = new k(this.f223661s, this.f223662t, continuation);
            kVar.f223660r = obj;
            return kVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v8, types: [D90.b$j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            b.i iVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223659q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223660r;
                a.s sVar = (a.s) this.f223661s;
                com.avito.android.component.user_hat.e eVar = sVar.f3001a;
                if (eVar instanceof e.a) {
                    iVar = new b.i(new PassportAddProfileLink(((e.a) sVar.f3001a).f125304a));
                } else {
                    DeepLink deepLink = null;
                    boolean z12 = false;
                    if (L.f(eVar, e.c.f125306a)) {
                        iVar = new b.i(new PassportProfilesListLink(false, 1, null));
                    } else {
                        if (!(eVar instanceof e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iVar = L.f(((e.b) sVar.f3001a).f125305a.f125275d, this.f223662t.f223625b.a()) ? b.j.f3027a : new b.i(new PassportSwitchProfileLink(((e.b) sVar.f3001a).f125305a.f125275d, deepLink, 2, z12 ? 1 : 0));
                    }
                }
                this.f223659q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$6", f = "ProfileProActor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223663q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223664r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D90.d f223665s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f223666t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ D90.a f223667u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(D90.d dVar, a aVar, D90.a aVar2, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f223665s = dVar;
            this.f223666t = aVar;
            this.f223667u = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            l lVar = new l(this.f223665s, this.f223666t, this.f223667u, continuation);
            lVar.f223664r = obj;
            return lVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223663q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223664r;
                B90.a aVar = this.f223665s.f3061a;
                a.b bVar = aVar != null ? aVar.f917b : null;
                if (bVar != null && (str = bVar.f930b) != null) {
                    this.f223666t.f223627d.f(str);
                }
                b.i iVar = new b.i(((a.t) this.f223667u).f3002a);
                this.f223663q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$7", f = "ProfileProActor.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223668q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223669r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f223670s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D90.a f223671t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(D90.a aVar, a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f223670s = aVar2;
            this.f223671t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = new m(this.f223671t, this.f223670s, continuation);
            mVar.f223669r = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223668q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223669r;
                this.f223670s.f223627d.b();
                b.i iVar = new b.i(((a.n) this.f223671t).f2997a);
                this.f223668q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$8", f = "ProfileProActor.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223672q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223673r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f223674s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D90.a f223675t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(D90.a aVar, a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f223674s = aVar2;
            this.f223675t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            n nVar = new n(this.f223675t, this.f223674s, continuation);
            nVar.f223673r = obj;
            return nVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223672q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f223673r;
                this.f223674s.f223627d.i();
                b.i iVar = new b.i(((a.r) this.f223675t).f3000a);
                this.f223672q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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

    /* compiled from: ProfileProActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$9", f = "ProfileProActor.kt", i = {0, 1, 3}, l = {154, 156, 160, 158, 160, 160}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class o extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223676q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223677r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D90.d f223679t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(D90.d dVar, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f223679t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            o oVar = a.this.new o(this.f223679t, continuation);
            oVar.f223677r = obj;
            return oVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r3v0, types: [D90.d] */
        /* JADX WARN: Type inference failed for: r3v1, types: [D90.d] */
        /* JADX WARN: Type inference failed for: r3v10, types: [com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams$AvitoFinanceParams] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f223676q
                r2 = 1
                D90.d r3 = r5.f223679t
                r4 = 0
                switch(r1) {
                    case 0: goto L41;
                    case 1: goto L39;
                    case 2: goto L2f;
                    case 3: goto L2a;
                    case 4: goto L1e;
                    case 5: goto L2a;
                    case 6: goto L15;
                    default: goto Ld;
                }
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                java.lang.Object r0 = r5.f223677r
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.C42729a0.b(r6)
                goto Lc8
            L1e:
                java.lang.Object r1 = r5.f223677r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L27
                goto L96
            L27:
                r6 = move-exception
                goto Lb0
            L2a:
                kotlin.C42729a0.b(r6)
                goto Lad
            L2f:
                java.lang.Object r1 = r5.f223677r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L37
                goto L6a
            L37:
                r6 = move-exception
                goto L81
            L39:
                java.lang.Object r1 = r5.f223677r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L56
            L41:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f223677r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                D90.b$g r1 = D90.b.g.f3024a
                r5.f223677r = r6
                r5.f223676q = r2
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L55
                return r0
            L55:
                r1 = r6
            L56:
                com.avito.android.profile.pro.impl.screen.mvi.a r6 = com.avito.android.profile.pro.impl.screen.mvi.a.this     // Catch: java.lang.Throwable -> L37
                com.avito.android.account.a r6 = r6.f223626c     // Catch: java.lang.Throwable -> L37
                io.reactivex.rxjava3.internal.operators.completable.K r6 = r6.a(r4, r2)     // Catch: java.lang.Throwable -> L37
                r5.f223677r = r1     // Catch: java.lang.Throwable -> L37
                r2 = 2
                r5.f223676q = r2     // Catch: java.lang.Throwable -> L37
                java.lang.Object r6 = kotlinx.coroutines.rx3.C43292o.a(r6, r5)     // Catch: java.lang.Throwable -> L37
                if (r6 != r0) goto L6a
                return r0
            L6a:
                D90.b$o r6 = new D90.b$o
                com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams r2 = r3.f3068h
                com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams r3 = r3.f3071k
                com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams$AvitoFinanceParams r3 = r3.f222680h
                r6.<init>(r2, r3)
                r5.f223677r = r4
                r2 = 3
                r5.f223676q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto Lad
                return r0
            L81:
                D90.b$d r2 = new D90.b$d     // Catch: java.lang.Throwable -> L27
                com.avito.android.remote.error.ApiError r6 = com.avito.android.error.z.n(r6)     // Catch: java.lang.Throwable -> L27
                r2.<init>(r6)     // Catch: java.lang.Throwable -> L27
                r5.f223677r = r1     // Catch: java.lang.Throwable -> L27
                r6 = 4
                r5.f223676q = r6     // Catch: java.lang.Throwable -> L27
                java.lang.Object r6 = r1.emit(r2, r5)     // Catch: java.lang.Throwable -> L27
                if (r6 != r0) goto L96
                return r0
            L96:
                D90.b$o r6 = new D90.b$o
                com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams r2 = r3.f3068h
                com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams r3 = r3.f3071k
                com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams$AvitoFinanceParams r3 = r3.f222680h
                r6.<init>(r2, r3)
                r5.f223677r = r4
                r2 = 5
                r5.f223676q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto Lad
                return r0
            Lad:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            Lb0:
                D90.b$o r2 = new D90.b$o
                com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams r4 = r3.f3068h
                com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams r3 = r3.f3071k
                com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams$AvitoFinanceParams r3 = r3.f222680h
                r2.<init>(r4, r3)
                r5.f223677r = r6
                r3 = 6
                r5.f223676q = r3
                java.lang.Object r1 = r1.emit(r2, r5)
                if (r1 != r0) goto Lc7
                return r0
            Lc7:
                r0 = r6
            Lc8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.mvi.a.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C6771a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.profile.pro.impl.interactor.e eVar, @Y61.k E e12, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k InterfaceC48524a interfaceC48524a, @Y61.k t90.d dVar, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k E90.a aVar, @Y61.k InterfaceC27058a interfaceC27058a, @Y61.k com.avito.android.calltracking_core.f fVar) {
        this.f223624a = eVar;
        this.f223625b = e12;
        this.f223626c = interfaceC27663a;
        this.f223627d = interfaceC48524a;
        this.f223628e = dVar;
        this.f223629f = interfaceC41196a;
        this.f223630g = aVar;
        this.f223631h = interfaceC27058a;
        this.f223632i = fVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.profile.pro.impl.screen.mvi.c(this, aVar, null), C43175k.N(C43175k.Y(new C1(this.f223631h.a(), y.a(this.f223632i.b()), com.avito.android.profile.pro.impl.screen.mvi.d.f223688b), new com.avito.android.profile.pro.impl.screen.mvi.e(aVar, null)), c43197r1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<D90.b> b(@Y61.k D90.a aVar, @Y61.k D90.d dVar) {
        InterfaceC43160i<D90.b> c43210w;
        a.C0036a c0036a;
        DeepLink deepLink;
        Object iVar;
        String str;
        boolean zEquals = aVar.equals(a.w.f3005a);
        InterfaceC48524a interfaceC48524a = this.f223627d;
        if (zEquals) {
            B90.a aVar2 = dVar.f3061a;
            a.c cVar = aVar2 != null ? aVar2.f916a : null;
            if (cVar == null) {
                return C43175k.w();
            }
            a.b bVar = aVar2 != null ? aVar2.f917b : null;
            if (bVar != null && (str = bVar.f929a) != null) {
                interfaceC48524a.a(str);
            }
            return new C43210w(new b.l(cVar));
        }
        if (aVar.equals(a.o.f2998a)) {
            return new C43210w(new b.i(new NotificationCenterLink()));
        }
        if (aVar.equals(a.v.f3004a)) {
            interfaceC48524a.h();
            return new C43210w(b.k.f3028a);
        }
        boolean z12 = aVar instanceof a.y;
        com.avito.android.profile.pro.impl.interactor.e eVar = this.f223624a;
        if (z12) {
            c43210w = new C43137a0(new i(aVar, null), eVar.a(((a.y) aVar).f3007a));
        } else {
            boolean z13 = aVar instanceof a.u ? true : aVar instanceof a.i;
            ProfileTabUserType profileTabUserType = dVar.f3073m;
            if (z13) {
                return new C43137a0(new j(2, null), eVar.a(profileTabUserType));
            }
            a.x xVar = a.x.f3006a;
            if (aVar.equals(xVar)) {
                return eVar.a(profileTabUserType);
            }
            if (aVar instanceof a.h) {
                c43210w = new C43210w(new b.i(((a.h) aVar).f2991a));
            } else {
                if (aVar instanceof a.s) {
                    return C43175k.G(new k(aVar, this, null));
                }
                if (aVar instanceof a.z) {
                    c43210w = new C43210w(new b.n(((a.z) aVar).f3008a));
                } else {
                    if (aVar instanceof a.t) {
                        return C43175k.G(new l(dVar, this, aVar, null));
                    }
                    if (aVar instanceof a.n) {
                        return C43175k.G(new m(aVar, this, null));
                    }
                    if (aVar instanceof a.r) {
                        return C43175k.G(new n(aVar, this, null));
                    }
                    if (aVar instanceof a.l) {
                        ProfileProGroupRowItem profileProGroupRowItem = ((a.l) aVar).f2995a;
                        interfaceC48524a.c(profileProGroupRowItem);
                        String str2 = profileProGroupRowItem.f223291b;
                        int iHashCode = str2.hashCode();
                        DeepLink deepLink2 = profileProGroupRowItem.f223295f;
                        switch (iHashCode) {
                            case -1155200795:
                                if (str2.equals("safeEntry")) {
                                    return new C43210w(b.m.f3030a);
                                }
                                break;
                            case -1097329270:
                                if (str2.equals("logout")) {
                                    return C43175k.G(new o(dVar, null));
                                }
                                break;
                            case -514198146:
                                if (str2.equals("deleteProfile")) {
                                    return C43175k.G(new d(aVar, this, null));
                                }
                                break;
                            case 1219080645:
                                if (str2.equals("subscriptionsAuto")) {
                                    if (deepLink2 == null) {
                                        return C43175k.w();
                                    }
                                    String strA = this.f223625b.a();
                                    if (strA != null) {
                                        interfaceC48524a.e(strA);
                                    }
                                    return new C43210w(new b.i(deepLink2));
                                }
                                break;
                        }
                        return deepLink2 != null ? new C43210w(new b.i(deepLink2)) : C43175k.w();
                    }
                    if (aVar instanceof a.p) {
                        int i12 = ((a.p) aVar).f2999a;
                        Integer numValueOf = Integer.valueOf(i12);
                        if (i12 <= 0) {
                            numValueOf = null;
                        }
                        return new C43210w(new b.v(numValueOf != null ? numValueOf.toString() : null));
                    }
                    if (aVar.equals(a.C13378b.f2980a)) {
                        return new C43210w(b.j.f3027a);
                    }
                    if (aVar instanceof a.j) {
                        InterfaceC42451b interfaceC42451b = ((a.j) aVar).f2993a.f223241c ? InterfaceC42451b.C11596b.f405967a : InterfaceC42451b.a.f405966a;
                        C42453d.a aVar3 = C42453d.f405975d;
                        EmployeeModeSwitchSource employeeModeSwitchSource = EmployeeModeSwitchSource.f147572b;
                        aVar3.getClass();
                        return C43175k.Y(this.f223629f.k(new C42453d(interfaceC42451b, false, employeeModeSwitchSource, null)), new c(3, null));
                    }
                    boolean z14 = aVar instanceof a.d;
                    t90.d dVar2 = this.f223628e;
                    if (z14) {
                        a.d dVar3 = (a.d) aVar;
                        ItemSlug itemSlug = dVar3.f2983a;
                        DeepLink deepLink3 = dVar3.f2985c;
                        if (deepLink3 == null) {
                            switch (itemSlug.ordinal()) {
                                case 0:
                                    iVar = new b.i(new UserAdvertsLink("rejected", null, 2, null));
                                    break;
                                case 1:
                                    String str3 = dVar3.f2984b;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    iVar = new b.f(str3);
                                    break;
                                case 2:
                                    iVar = b.q.f3035a;
                                    break;
                                case 3:
                                    iVar = new b.i(new ChannelsLink(null, null, 3, null));
                                    break;
                                case 4:
                                    iVar = new b.i(new OrdersLink(null, null, 3, null));
                                    break;
                                case 5:
                                    iVar = b.C0153b.f3019a;
                                    break;
                                case 6:
                                    iVar = new b.i(new UserAdvertsLink(null, null, 3, null));
                                    break;
                                case 7:
                                    iVar = new b.i(new UserAdvertsLink(null, null, 3, null));
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            iVar = new b.i(deepLink3);
                        }
                        dVar2.b(itemSlug.f223113b, itemSlug.f223114c);
                        return new C43210w(iVar);
                    }
                    if (aVar instanceof a.f) {
                        a.f fVar = (a.f) aVar;
                        dVar2.b("statisticsGeneral", fVar.f2988b);
                        c43210w = new C43210w(new b.i(fVar.f2987a));
                    } else {
                        if (aVar.equals(a.e.f2986a)) {
                            dVar2.a();
                            return new C43210w(b.p.f3034a);
                        }
                        if (aVar instanceof a.g) {
                            a.g gVar = (a.g) aVar;
                            InterfaceC14249c interfaceC14249c = gVar.f2989a;
                            if (interfaceC14249c instanceof UserAddressLink.Result.Success) {
                                c43210w = C43175k.G(new com.avito.android.profile.pro.impl.screen.mvi.b(interfaceC14249c, this, dVar, null));
                            } else {
                                if (interfaceC14249c instanceof AbstractC14250d.c ? true : interfaceC14249c instanceof O1.a ? true : interfaceC14249c instanceof ServiceBookingCalendarMonthLink.c.b ? true : interfaceC14249c instanceof WalletLink.a.b) {
                                    if (gVar.f2990b instanceof CalltrackingDeeplink) {
                                        return new C43210w(new b.u(dVar.f3069i, -1));
                                    }
                                    c43210w = b(xVar, dVar);
                                } else if (interfaceC14249c instanceof WalletLink.a.C10160a) {
                                    String str4 = ((WalletLink.a.C10160a) interfaceC14249c).f327765b;
                                    c43210w = str4 != null ? new C43210w(new b.t(com.avito.android.printable_text.b.f(str4))) : C43175k.w();
                                } else {
                                    c43210w = b(xVar, dVar);
                                }
                            }
                        } else {
                            if (aVar instanceof a.k) {
                                return C43175k.G(new e(aVar, this, null));
                            }
                            if (aVar instanceof a.c) {
                                a.c cVar2 = (a.c) aVar;
                                c43210w = new C43210w(new b.u(cVar2.f2981a, cVar2.f2982b));
                            } else if (aVar instanceof a.q) {
                                c43210w = new C43210w(new b.n(null));
                            } else {
                                if (aVar instanceof a.m) {
                                    return C43175k.G(new f(aVar, this, null));
                                }
                                if (aVar instanceof a.A) {
                                    return C43175k.G(new g(aVar, null));
                                }
                                if (aVar instanceof a.B) {
                                    interfaceC48524a.c(((a.B) aVar).f2978a);
                                    return C43175k.G(new h(aVar, null));
                                }
                                if (!(aVar instanceof a.C0152a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                B90.a aVar4 = dVar.f3061a;
                                c43210w = new C43210w((aVar4 == null || (c0036a = aVar4.f922g) == null || (deepLink = c0036a.f926d) == null) ? b.h.f3025a : new b.i(deepLink));
                            }
                        }
                    }
                }
            }
        }
        return c43210w;
    }
}

package com.avito.android.str_calendar.seller.core;

import SK0.b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.H;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.x;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import com.avito.android.str_calendar.seller.SellerCalendarActivity;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment;
import com.avito.android.str_calendar.seller.core.d;
import com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment;
import com.avito.android.str_calendar.seller.reject.StrCalendarRejectFragment;
import com.avito.android.ui.fragments.BaseDialogFragment;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;

/* compiled from: StrSellerCalendarCoreDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/StrSellerCalendarCoreDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/str_calendar/seller/core/di/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerCalendarCoreDialogFragment extends BaseDialogFragment implements K<com.avito.android.str_calendar.seller.core.di.b>, InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f287776l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public com.avito.android.str_calendar.seller.core.di.b f287777h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.core.c f287778i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public SK0.b f287779j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public String f287780k0;

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/StrSellerCalendarCoreDialogFragment$a;", "", "<init>", "()V", "", "EXTRA_RQ_KEY", "Ljava/lang/String;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static StrSellerCalendarCoreDialogFragment a(@k String str, @l String str2, @l String str3, @l String str4, boolean z12) {
            StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = new StrSellerCalendarCoreDialogFragment();
            strSellerCalendarCoreDialogFragment.setArguments(C22777e.b(new Q("advert_id", str), new Q("first_selected_date", str2), new Q("last_selected_date", str3), new Q("rq_key", str4), new Q("should_close_flow_after_apply", Boolean.valueOf(z12))));
            return strSellerCalendarCoreDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$onCreate$1", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287781q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f287783s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f287784t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f287785u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f287786v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f287783s = str;
            this.f287784t = str2;
            this.f287785u = str3;
            this.f287786v = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return StrSellerCalendarCoreDialogFragment.this.new b(this.f287783s, this.f287784t, this.f287785u, this.f287786v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287781q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.str_calendar.seller.core.c cVar = StrSellerCalendarCoreDialogFragment.this.f287778i0;
                if (cVar == null) {
                    cVar = null;
                }
                com.avito.android.str_calendar.seller.core.c cVar2 = cVar;
                this.f287781q = 1;
                if (cVar2.j(this.f287783s, this.f287784t, this.f287785u, this.f287786v, this) == coroutine_suspended) {
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

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$onCreateDialog$1", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {92, 96}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287787q;

        /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$onCreateDialog$1$1", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f287789q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287790r;

            /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C8641a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287791b;

                public C8641a(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment) {
                    this.f287791b = strSellerCalendarCoreDialogFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    String str;
                    String str2;
                    com.avito.android.str_calendar.seller.core.d dVar = (com.avito.android.str_calendar.seller.core.d) obj;
                    a aVar = StrSellerCalendarCoreDialogFragment.f287776l0;
                    StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = this.f287791b;
                    if (dVar instanceof d.l) {
                        StrSellerCalendarFragment.a aVar2 = StrSellerCalendarFragment.f287476x0;
                        d.l lVar = (d.l) dVar;
                        String str3 = lVar.f287819a;
                        aVar2.getClass();
                        StrSellerCalendarFragment strSellerCalendarFragment = new StrSellerCalendarFragment();
                        strSellerCalendarFragment.setArguments(C22777e.b(new Q("advert_id", str3), new Q("first_selected_date", lVar.f287820b), new Q("last_selected_date", lVar.f287821c), new Q("should_close_flow_after_apply", Boolean.valueOf(lVar.f287822d))));
                        H hE2 = strSellerCalendarCoreDialogFragment.getChildFragmentManager().e();
                        hE2.j(R.id.fragment_container, strSellerCalendarFragment, null, 1);
                        hE2.c(null);
                        hE2.e();
                    } else if (dVar instanceof d.i) {
                        H hE3 = strSellerCalendarCoreDialogFragment.getChildFragmentManager().e();
                        hE3.o(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                        StrCalendarParametersFragment.a aVar3 = StrCalendarParametersFragment.f286684D0;
                        d.i iVar = (d.i) dVar;
                        String str4 = iVar.f287812a;
                        aVar3.getClass();
                        StrCalendarParametersFragment strCalendarParametersFragment = new StrCalendarParametersFragment();
                        strCalendarParametersFragment.setArguments(C22777e.b(new Q("advert_id", str4), new Q("extra_start_date", iVar.f287813b), new Q("extra_end_date", iVar.f287814c), new Q("should_close_flow_after_apply", Boolean.valueOf(iVar.f287815d))));
                        hE3.n(R.id.fragment_container, strCalendarParametersFragment, null);
                        hE3.c(StrCalendarParametersFragment.class.getName());
                        hE3.e();
                    } else if (dVar instanceof d.k) {
                        H hE4 = strSellerCalendarCoreDialogFragment.getChildFragmentManager().e();
                        hE4.o(0, 0, R.anim.enter_from_left, R.anim.exit_to_right);
                        StrCalendarRejectFragment.a aVar4 = StrCalendarRejectFragment.f288015x0;
                        StrSellerCalendarRejectInfo strSellerCalendarRejectInfo = ((d.k) dVar).f287818a;
                        aVar4.getClass();
                        StrCalendarRejectFragment strCalendarRejectFragment = new StrCalendarRejectFragment();
                        strCalendarRejectFragment.setArguments(C22777e.b(new Q("reject_info", strSellerCalendarRejectInfo)));
                        hE4.n(R.id.fragment_container, strCalendarRejectFragment, null);
                        hE4.c(StrCalendarRejectFragment.class.getName());
                        hE4.e();
                    } else if (dVar instanceof d.j) {
                        H hE5 = strSellerCalendarCoreDialogFragment.getChildFragmentManager().e();
                        hE5.o(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                        LastMinuteOfferFragment.a aVar5 = LastMinuteOfferFragment.f287978s0;
                        d.j jVar = (d.j) dVar;
                        String str5 = jVar.f287816a;
                        aVar5.getClass();
                        LastMinuteOfferFragment lastMinuteOfferFragment = new LastMinuteOfferFragment();
                        lastMinuteOfferFragment.setArguments(C22777e.b(new Q("selected_date_range_param", jVar.f287817b), new Q("advert_id_param", str5)));
                        hE5.n(R.id.fragment_container, lastMinuteOfferFragment, null);
                        hE5.c(null);
                        hE5.e();
                    } else {
                        if (dVar instanceof d.e ? true : dVar instanceof d.f ? true : dVar instanceof d.g) {
                            strSellerCalendarCoreDialogFragment.getChildFragmentManager().Y();
                        } else if (dVar instanceof d.C8643d) {
                            strSellerCalendarCoreDialogFragment.getChildFragmentManager().Y();
                            d.C8643d c8643d = (d.C8643d) dVar;
                            UpdatedParametersInfo updatedParametersInfo = c8643d.f287809b;
                            if (updatedParametersInfo != null && (str2 = strSellerCalendarCoreDialogFragment.f287780k0) != null) {
                                C22960s.a(C22777e.b(new Q("updatedDateRangeInfoKey", updatedParametersInfo)), strSellerCalendarCoreDialogFragment, str2);
                            }
                            if (c8643d.f287808a) {
                                C43259k.d(C22981N.a(strSellerCalendarCoreDialogFragment.getLifecycle()), null, null, new com.avito.android.str_calendar.seller.core.a(strSellerCalendarCoreDialogFragment, null), 3);
                            }
                        } else if (dVar instanceof d.a) {
                            strSellerCalendarCoreDialogFragment.getChildFragmentManager().a0(0, StrCalendarParametersFragment.class.getName());
                        } else if (dVar instanceof d.c) {
                            strSellerCalendarCoreDialogFragment.getChildFragmentManager().Y();
                            d.c cVar = (d.c) dVar;
                            UpdatedParametersInfo updatedParametersInfo2 = cVar.f287807b;
                            if (updatedParametersInfo2 != null && (str = strSellerCalendarCoreDialogFragment.f287780k0) != null) {
                                C22960s.a(C22777e.b(new Q("updatedDateRangeInfoKey", updatedParametersInfo2)), strSellerCalendarCoreDialogFragment, str);
                            }
                            if (cVar.f287806a) {
                                C43259k.d(C22981N.a(strSellerCalendarCoreDialogFragment.getLifecycle()), null, null, new com.avito.android.str_calendar.seller.core.a(strSellerCalendarCoreDialogFragment, null), 3);
                            }
                        } else if (dVar instanceof d.m) {
                            SK0.b bVar = strSellerCalendarCoreDialogFragment.f287779j0;
                            b.a.a(bVar != null ? bVar : null, new com.avito.android.str_calendar.seller.calandar_parameters.domain.a(), null, ((d.m) dVar).f287823a, null, 10);
                        } else if (dVar instanceof d.h) {
                            strSellerCalendarCoreDialogFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((d.h) dVar).f287811a)));
                        } else if (dVar instanceof d.b) {
                            strSellerCalendarCoreDialogFragment.dismiss();
                            strSellerCalendarCoreDialogFragment.f5();
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f287791b, StrSellerCalendarCoreDialogFragment.class, "handleRouterEvent", "handleRouterEvent(Lcom/avito/android/str_calendar/seller/core/StrSellerCalendarCoreRouterEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f287790r = strSellerCalendarCoreDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f287790r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f287789q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = this.f287790r;
                    com.avito.android.str_calendar.seller.core.c cVar = strSellerCalendarCoreDialogFragment.f287778i0;
                    if (cVar == null) {
                        cVar = null;
                    }
                    e2 e2VarG = cVar.getF287826a();
                    C8641a c8641a = new C8641a(strSellerCalendarCoreDialogFragment);
                    this.f287789q = 1;
                    e2VarG.getClass();
                    if (e2.g(e2VarG, c8641a, this) == coroutine_suspended) {
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

        /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$onCreateDialog$1$2", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f287792q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287793r;

            /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287794b;

                public a(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment) {
                    this.f287794b = strSellerCalendarCoreDialogFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    ActivityC22955m activityC22955mRequireActivity = this.f287794b.requireActivity();
                    SellerCalendarActivity sellerCalendarActivity = activityC22955mRequireActivity instanceof SellerCalendarActivity ? (SellerCalendarActivity) activityC22955mRequireActivity : null;
                    if (sellerCalendarActivity == null) {
                        return G0.f406611a;
                    }
                    sellerCalendarActivity.f286661n = zBooleanValue;
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f287793r = strSellerCalendarCoreDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f287793r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f287792q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = this.f287793r;
                    com.avito.android.str_calendar.seller.core.c cVar = strSellerCalendarCoreDialogFragment.f287778i0;
                    if (cVar == null) {
                        cVar = null;
                    }
                    e2 e2VarN = cVar.getF287828c();
                    a aVar = new a(strSellerCalendarCoreDialogFragment);
                    this.f287792q = 1;
                    e2VarN.getClass();
                    if (e2.g(e2VarN, aVar, this) == coroutine_suspended) {
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

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return StrSellerCalendarCoreDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287787q;
            StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = StrSellerCalendarCoreDialogFragment.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                a aVar = new a(strSellerCalendarCoreDialogFragment, null);
                this.f287787q = 1;
                if (C23056p0.b(strSellerCalendarCoreDialogFragment, state, aVar, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            Lifecycle.State state2 = Lifecycle.State.f46682e;
            b bVar = new b(strSellerCalendarCoreDialogFragment, null);
            this.f287787q = 2;
            if (C23056p0.b(strSellerCalendarCoreDialogFragment, state2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f287795l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            com.avito.android.lib.util.i.j(com.avito.android.lib.util.i.f181373a, view);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrSellerCalendarCoreDialogFragment.f287776l0;
            StrSellerCalendarCoreDialogFragment.this.f5();
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<x, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f287798m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(1);
            this.f287798m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = StrSellerCalendarCoreDialogFragment.this;
            if (strSellerCalendarCoreDialogFragment.getChildFragmentManager().L() > 1) {
                strSellerCalendarCoreDialogFragment.getChildFragmentManager().Y();
            } else {
                this.f287798m.dismiss();
                strSellerCalendarCoreDialogFragment.f5();
            }
            return G0.f406611a;
        }
    }

    public StrSellerCalendarCoreDialogFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.str_calendar.seller.core.di.b bVar = this.f287777h0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.Bf(this);
    }

    public final void f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        SellerCalendarActivity sellerCalendarActivity = activityC22955mRequireActivity instanceof SellerCalendarActivity ? (SellerCalendarActivity) activityC22955mRequireActivity : null;
        if (sellerCalendarActivity != null) {
            sellerCalendarActivity.finish();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        this.f287777h0 = com.avito.android.str_calendar.seller.core.di.a.a().a((com.avito.android.str_calendar.seller.core.di.e) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.core.di.e.class));
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle bundleRequireArguments = requireArguments();
            String string = bundleRequireArguments.getString("advert_id");
            String string2 = bundleRequireArguments.getString("first_selected_date");
            String string3 = bundleRequireArguments.getString("last_selected_date");
            this.f287780k0 = bundleRequireArguments.getString("rq_key");
            C43259k.d(C22981N.a(getLifecycle()), null, null, new b(string, string2, string3, bundleRequireArguments.getBoolean("should_close_flow_after_apply"), null), 3);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.E(R.layout.str_seller_calendar_dialog_content, false, d.f287795l);
        dVar.K(true);
        dVar.J(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
        dVar.R(new e());
        C19918B.a(dVar.f21241d, requireActivity(), new f(dVar), 2);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        String str = this.f287780k0;
        if (str == null) {
            return;
        }
        C22960s.a(C22777e.b(new Q("clearOrdersCalendarSelectionKey", Boolean.TRUE)), this, str);
        super.onDismiss(dialogInterface);
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.str_calendar.seller.core.di.b bVar = this.f287777h0;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}

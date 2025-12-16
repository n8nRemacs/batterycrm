package com.avito.android.sx_address.new_address.view;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.core.widget.NestedScrollView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.SxAddAddressSource;
import com.avito.android.date_time_picker.PickerHeaderType;
import com.avito.android.date_time_picker.TimePickerArguments;
import com.avito.android.date_time_picker.TimePickerDialog;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.phone_confirmation.C33153i;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sx_address.new_address.analytics.FormInputFieldName;
import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.domain.DetailItem;
import com.avito.android.sx_address.new_address.domain.HideAddress;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.mvi.InterfaceC35192g;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import com.avito.android.sx_address.new_address.view.B;
import com.avito.android.sx_address.new_address.view.C35199f;
import com.avito.android.sx_address.new_address.view.l;
import com.avito.android.sx_address.new_address.view.s;
import com.avito.android.util.ApiException;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;

/* compiled from: SxNewAddressView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/r;", "Lcom/avito/android/sx_address/new_address/view/n;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class r implements com.avito.android.sx_address.new_address.view.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f293931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f293932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.d f293933c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SxAddAddressSource f293934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f293935e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.analytics.e f293936f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.analytics.c f293937g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C35196c f293938h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f293939i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final z f293940j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final B f293941k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C35199f f293942l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.view.l f293943m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final NestedScrollView f293944n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f293945o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final View f293946p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f293947q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final t f293948r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final SpinnerOverlay f293949s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Toolbar f293950t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final FrameLayout f293951u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public LinearLayout f293952v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final ImageView f293953w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final TextView f293954x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final TextView f293955y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final Button f293956z;

    /* compiled from: SxNewAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SxAddAddressSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SxAddAddressSource sxAddAddressSource = SxAddAddressSource.f67543b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.new_address.g f293957l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f293958m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.sx_address.new_address.g gVar, r rVar) {
            super(1);
            this.f293957l = gVar;
            this.f293958m = rVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f293957l.accept(new InterfaceC35192g.a(str));
            r.a(this.f293958m, FormInputFieldName.f293565b);
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.new_address.g f293959l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f293960m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.sx_address.new_address.g gVar, r rVar) {
            super(0);
            this.f293959l = gVar;
            this.f293960m = rVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f293959l.accept(InterfaceC35192g.b.f293779a);
            r.a(this.f293960m, FormInputFieldName.f293565b);
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.new_address.g f293961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.sx_address.new_address.g gVar) {
            super(1);
            this.f293961l = gVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f293961l.accept(new InterfaceC35192g.i(str));
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/s;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/new_address/view/s;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<s, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.new_address.g f293962l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.sx_address.new_address.g gVar) {
            super(1);
            this.f293962l = gVar;
        }

        @Override // Y41.l
        public final G0 invoke(s sVar) {
            this.f293962l.accept(new InterfaceC35192g.k(sVar));
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.new_address.g f293963l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.sx_address.new_address.g gVar) {
            super(1);
            this.f293963l = gVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            this.f293963l.accept(new InterfaceC35192g.h(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1", f = "SxNewAddressView.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f293964q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f293965r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ r f293966s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.new_address.g f293967t;

        /* compiled from: SxNewAddressView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1", f = "SxNewAddressView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f293968q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ r f293969r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.sx_address.new_address.g f293970s;

            /* compiled from: SxNewAddressView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1$1", f = "SxNewAddressView.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$a, reason: collision with other inner class name */
            public static final class C8928a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293971q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ r f293972r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.new_address.g f293973s;

                /* compiled from: SxNewAddressView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/DetailItem;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/new_address/domain/DetailItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$a$a, reason: collision with other inner class name */
                public static final class C8929a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.new_address.g f293974b;

                    public C8929a(com.avito.android.sx_address.new_address.g gVar) {
                        this.f293974b = gVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293974b.accept(new InterfaceC35192g.f((DetailItem) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8928a(r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super C8928a> continuation) {
                    super(2, continuation);
                    this.f293972r = rVar;
                    this.f293973s = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8928a(this.f293972r, this.f293973s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8928a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293971q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293972r.f293942l.f293890c;
                        C8929a c8929a = new C8929a(this.f293973s);
                        this.f293971q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8929a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: SxNewAddressView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1$2", f = "SxNewAddressView.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293975q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ r f293976r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.new_address.g f293977s;

                /* compiled from: SxNewAddressView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/AddressType;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/new_address/domain/AddressType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$b$a, reason: collision with other inner class name */
                public static final class C8930a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.new_address.g f293978b;

                    public C8930a(com.avito.android.sx_address.new_address.g gVar) {
                        this.f293978b = gVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293978b.accept(new InterfaceC35192g.m((AddressType) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f293976r = rVar;
                    this.f293977s = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f293976r, this.f293977s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293975q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293976r.f293941k.f293855e;
                        C8930a c8930a = new C8930a(this.f293977s);
                        this.f293975q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8930a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: SxNewAddressView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1$3", f = "SxNewAddressView.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293979q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ r f293980r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.new_address.g f293981s;

                /* compiled from: SxNewAddressView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/ScheduleType;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/new_address/domain/ScheduleType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$c$a, reason: collision with other inner class name */
                public static final class C8931a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.new_address.g f293982b;

                    public C8931a(com.avito.android.sx_address.new_address.g gVar) {
                        this.f293982b = gVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293982b.accept(new InterfaceC35192g.j((ScheduleType) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f293980r = rVar;
                    this.f293981s = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f293980r, this.f293981s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293979q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293980r.f293943m.f293906d;
                        C8931a c8931a = new C8931a(this.f293981s);
                        this.f293979q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8931a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: SxNewAddressView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1$4", f = "SxNewAddressView.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
            public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293983q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ r f293984r;

                /* compiled from: SxNewAddressView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$d$a, reason: collision with other inner class name */
                public static final class C8932a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f293985b;

                    public C8932a(r rVar) {
                        this.f293985b = rVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        ((Boolean) obj).getClass();
                        r rVar = this.f293985b;
                        rVar.f293944n.post(new o(rVar, 4));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(r rVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f293984r = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new d(this.f293984r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293983q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        r rVar = this.f293984r;
                        e2 e2Var = rVar.f293943m.f293911i;
                        C8932a c8932a = new C8932a(rVar);
                        this.f293983q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8932a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: SxNewAddressView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1$5", f = "SxNewAddressView.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
            public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293986q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ r f293987r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.new_address.g f293988s;

                /* compiled from: SxNewAddressView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/i;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/new_address/view/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$e$a, reason: collision with other inner class name */
                public static final class C8933a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.new_address.g f293989b;

                    public C8933a(com.avito.android.sx_address.new_address.g gVar) {
                        this.f293989b = gVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.sx_address.new_address.view.i iVar = (com.avito.android.sx_address.new_address.view.i) obj;
                        this.f293989b.accept(new InterfaceC35192g.e(iVar.f293900a, iVar.f293901b));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f293987r = rVar;
                    this.f293988s = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new e(this.f293987r, this.f293988s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293986q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293987r.f293943m.f293908f;
                        C8933a c8933a = new C8933a(this.f293988s);
                        this.f293986q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8933a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: SxNewAddressView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.new_address.view.SxNewAddressViewImpl$bindTo$9$1$1$6", f = "SxNewAddressView.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
            public static final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293990q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ r f293991r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.new_address.g f293992s;

                /* compiled from: SxNewAddressView.kt */
                @s0
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/s;", "click", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/new_address/view/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.new_address.view.r$g$a$f$a, reason: collision with other inner class name */
                public static final class C8934a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.new_address.g f293993b;

                    public C8934a(com.avito.android.sx_address.new_address.g gVar) {
                        this.f293993b = gVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        s sVar = (s) obj;
                        com.avito.android.sx_address.new_address.g gVar = this.f293993b;
                        WorkingHours.Day day = gVar.getState().getValue().f293720h.f293736b.f293632b.get(sVar.getF293996a());
                        if (day != null) {
                            gVar.accept(new InterfaceC35192g.l(sVar, day));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f293991r = rVar;
                    this.f293992s = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new f(this.f293991r, this.f293992s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293990q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293991r.f293943m.f293910h;
                        C8934a c8934a = new C8934a(this.f293992s);
                        this.f293990q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8934a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f293969r = rVar;
                this.f293970s = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f293969r, this.f293970s, continuation);
                aVar.f293968q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f293968q;
                r rVar = this.f293969r;
                com.avito.android.sx_address.new_address.g gVar = this.f293970s;
                C43259k.d(t12, null, null, new C8928a(rVar, gVar, null), 3);
                C43259k.d(t12, null, null, new b(rVar, gVar, null), 3);
                C43259k.d(t12, null, null, new c(rVar, gVar, null), 3);
                C43259k.d(t12, null, null, new d(rVar, null), 3);
                C43259k.d(t12, null, null, new e(rVar, gVar, null), 3);
                C43259k.d(t12, null, null, new f(rVar, gVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC22983P interfaceC22983P, r rVar, com.avito.android.sx_address.new_address.g gVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f293965r = interfaceC22983P;
            this.f293966s = rVar;
            this.f293967t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new g(this.f293965r, this.f293966s, this.f293967t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f293964q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f293966s, this.f293967t, null);
                this.f293964q = 1;
                if (C23056p0.b(this.f293965r, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<String, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            if (str.equals("IS_FOR_BUYER".toLowerCase(Locale.ROOT))) {
                r.a(r.this, FormInputFieldName.f293568e);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends H implements Y41.l<FormInputFieldName, G0> {
        @Override // Y41.l
        public final G0 invoke(FormInputFieldName formInputFieldName) {
            r.a((r) this.receiver, formInputFieldName);
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends H implements Y41.l<FormInputFieldName, G0> {
        @Override // Y41.l
        public final G0 invoke(FormInputFieldName formInputFieldName) {
            r.a((r) this.receiver, formInputFieldName);
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class k extends H implements Y41.l<FormInputFieldName, G0> {
        @Override // Y41.l
        public final G0 invoke(FormInputFieldName formInputFieldName) {
            r.a((r) this.receiver, formInputFieldName);
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class l extends H implements Y41.l<FormInputFieldName, G0> {
        @Override // Y41.l
        public final G0 invoke(FormInputFieldName formInputFieldName) {
            r.a((r) this.receiver, formInputFieldName);
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<String, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            if (str.equals("IS_FOR_BUYER".toLowerCase(Locale.ROOT))) {
                r.a(r.this, FormInputFieldName.f293568e);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SxNewAddressView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class n extends H implements Y41.l<FormInputFieldName, G0> {
        @Override // Y41.l
        public final G0 invoke(FormInputFieldName formInputFieldName) {
            r.a((r) this.receiver, formInputFieldName);
            return G0.f406611a;
        }
    }

    public r(@Y61.k View view, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.sx_address.new_address.d dVar, @Y61.k SxAddAddressSource sxAddAddressSource, boolean z12, @Y61.k com.avito.android.sx_address.new_address.analytics.e eVar, @Y61.k com.avito.android.sx_address.new_address.analytics.c cVar) {
        TextView textView;
        TextView textView2;
        this.f293931a = view;
        this.f293932b = interfaceC22983P;
        this.f293933c = dVar;
        this.f293934d = sxAddAddressSource;
        this.f293935e = z12;
        this.f293936f = eVar;
        this.f293937g = cVar;
        View viewFindViewById = view.findViewById(R.id.address_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f293938h = new C35196c(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.title_item);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f293939i = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f293940j = new z(viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.types_item);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f293941k = new B(viewFindViewById4);
        View viewFindViewById5 = view.findViewById(R.id.details_item);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f293942l = new C35199f((ViewGroup) viewFindViewById5);
        View viewFindViewById6 = view.findViewById(R.id.work_schedule_item);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f293943m = new com.avito.android.sx_address.new_address.view.l(viewFindViewById6, dVar);
        View viewFindViewById7 = view.findViewById(R.id.scroll_view);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById7;
        this.f293944n = nestedScrollView;
        View viewFindViewById8 = view.findViewById(R.id.save_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f293945o = (Button) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.save_block);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f293946p = viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.legal);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293947q = (TextView) viewFindViewById10;
        this.f293948r = new t(view.getContext());
        View viewFindViewById11 = view.findViewById(R.id.spinner_overlay);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        this.f293949s = (SpinnerOverlay) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.toolbar);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById12;
        View viewFindViewById13 = toolbar.findViewById(R.id.toolbar_title);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        I5.a((TextView) viewFindViewById13, dVar.getF293660a(), false);
        this.f293950t = toolbar;
        View viewFindViewById14 = view.findViewById(R.id.error_frame);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById14;
        this.f293951u = frameLayout;
        View viewFindViewById15 = frameLayout.findViewById(R.id.error_layout);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById15;
        this.f293952v = linearLayout;
        View viewFindViewById16 = linearLayout.findViewById(R.id.error_icon);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f293953w = (ImageView) viewFindViewById16;
        LinearLayout linearLayout2 = this.f293952v;
        Button button = null;
        if (linearLayout2 != null) {
            View viewFindViewById17 = linearLayout2.findViewById(R.id.error_title);
            if (viewFindViewById17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            textView = (TextView) viewFindViewById17;
        } else {
            textView = null;
        }
        this.f293954x = textView;
        LinearLayout linearLayout3 = this.f293952v;
        if (linearLayout3 != null) {
            View viewFindViewById18 = linearLayout3.findViewById(R.id.error_subtitle);
            if (viewFindViewById18 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            textView2 = (TextView) viewFindViewById18;
        } else {
            textView2 = null;
        }
        this.f293955y = textView2;
        LinearLayout linearLayout4 = this.f293952v;
        if (linearLayout4 != null) {
            View viewFindViewById19 = linearLayout4.findViewById(R.id.retry_button);
            if (viewFindViewById19 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button = (Button) viewFindViewById19;
        }
        this.f293956z = button;
        nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.sx_address.new_address.view.q
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                l lVar = this.f293930b.f293943m;
                LinearLayout linearLayout5 = lVar.f293914l;
                linearLayout5.getViewTreeObserver().removeOnDrawListener(lVar.f293912j);
                linearLayout5.setLayoutTransition(null);
                view2.performClick();
                return view2.onTouchEvent(motionEvent);
            }
        });
    }

    public static final void a(r rVar, FormInputFieldName formInputFieldName) {
        if (rVar.f293935e) {
            rVar.f293936f.b(null, null, formInputFieldName);
        } else {
            rVar.f293936f.b(rVar.f293937g.f293575b, rVar.f293937g.f293576c, formInputFieldName);
        }
    }

    public final void b(@Y61.k final com.avito.android.sx_address.new_address.g gVar) {
        Button button = this.f293956z;
        if (button != null) {
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.new_address.view.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            gVar.accept(InterfaceC35192g.C8926g.f293785a);
                            break;
                        case 1:
                            gVar.accept(InterfaceC35192g.d.f293781a);
                            break;
                        default:
                            gVar.accept(InterfaceC35192g.c.f293780a);
                            break;
                    }
                }
            });
        }
        b bVar = new b(gVar, this);
        C35196c c35196c = this.f293938h;
        c35196c.getClass();
        c35196c.f293879c.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(28, bVar, c35196c));
        c cVar = new c(gVar, this);
        c35196c.getClass();
        c35196c.f293879c.setClearButtonListener(new C35197d(cVar));
        d dVar = new d(gVar);
        z zVar = this.f293940j;
        zVar.getClass();
        com.avito.android.lib.design.input.n.c(zVar.f294010b, new y(dVar));
        this.f293948r.f294003b = new e(gVar);
        final int i13 = 1;
        this.f293945o.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.new_address.view.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        gVar.accept(InterfaceC35192g.C8926g.f293785a);
                        break;
                    case 1:
                        gVar.accept(InterfaceC35192g.d.f293781a);
                        break;
                    default:
                        gVar.accept(InterfaceC35192g.c.f293780a);
                        break;
                }
            }
        });
        final f fVar = new f(gVar);
        c35196c.getClass();
        c35196c.f293882f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.avito.android.sx_address.new_address.view.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                fVar.invoke(Boolean.valueOf(z12));
            }
        });
        final int i14 = 2;
        this.f293950t.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.new_address.view.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        gVar.accept(InterfaceC35192g.C8926g.f293785a);
                        break;
                    case 1:
                        gVar.accept(InterfaceC35192g.d.f293781a);
                        break;
                    default:
                        gVar.accept(InterfaceC35192g.c.f293780a);
                        break;
                }
            }
        });
        InterfaceC22983P interfaceC22983P = this.f293932b;
        C43259k.d(C22984Q.a(interfaceC22983P), null, null, new g(interfaceC22983P, this, gVar, null), 3);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    public final void c(@Y61.k SxNewAddressMviViewState sxNewAddressMviViewState) {
        String f293669j;
        boolean z12 = sxNewAddressMviViewState instanceof SxNewAddressMviViewState.Content;
        FrameLayout frameLayout = this.f293951u;
        View view = this.f293946p;
        NestedScrollView nestedScrollView = this.f293944n;
        SpinnerOverlay spinnerOverlay = this.f293949s;
        Button button = this.f293945o;
        if (!z12) {
            if (sxNewAddressMviViewState instanceof SxNewAddressMviViewState.Loading) {
                D6.H(spinnerOverlay);
                D6.w(frameLayout);
                D6.w(nestedScrollView);
                D6.w(view);
                return;
            }
            if (sxNewAddressMviViewState instanceof SxNewAddressMviViewState.SaveLoading) {
                button.setLoading(true);
                button.setClickable(false);
                return;
            } else {
                if (sxNewAddressMviViewState instanceof SxNewAddressMviViewState.NetworkError) {
                    Throwable th2 = ((SxNewAddressMviViewState.NetworkError) sxNewAddressMviViewState).f293745b;
                    if ((th2 instanceof ApiException) && (((ApiException) th2).f318522b instanceof ApiError.NetworkIOError)) {
                        h();
                        return;
                    } else {
                        g(th2);
                        return;
                    }
                }
                return;
            }
        }
        SxNewAddressMviViewState.Content content = (SxNewAddressMviViewState.Content) sxNewAddressMviViewState;
        SxNewAddressMviState.AddressContent addressContent = content.f293738b;
        String strD = d(addressContent);
        int iOrdinal = this.f293934d.ordinal();
        com.avito.android.sx_address.new_address.d dVar = this.f293933c;
        if (iOrdinal == 0) {
            f293669j = dVar.getF293669j();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f293669j = dVar.getF293670k();
        }
        String str = f293669j;
        this.f293938h.a(str, addressContent.f293722b, strD, this.f293935e, addressContent.f293724d, new h());
        HideAddress hideAddress = addressContent.f293724d;
        View view2 = this.f293939i;
        if (hideAddress != null) {
            D6.c(view2.getRootView(), null, Integer.valueOf(y6.b(24)), null, null, 13);
        } else {
            D6.c(view2.getRootView(), null, Integer.valueOf(y6.b(34)), null, null, 13);
        }
        SxNewAddressMviState.TitleContent titleContent = content.f293739c;
        String str2 = titleContent.f293732b;
        final i iVar = new i(1, this, r.class, "onFieldFocused", "onFieldFocused(Lcom/avito/android/sx_address/new_address/analytics/FormInputFieldName;)V", 0);
        final z zVar = this.f293940j;
        Input.t(zVar.f294010b, str2, false, 6);
        zVar.f294010b.setOnFocusChangeListener(new View.OnFocusChangeListener(zVar, iVar) { // from class: com.avito.android.sx_address.new_address.view.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l f294005b;

            {
                this.f294005b = iVar;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z13) {
                if (z13) {
                    this.f294005b.invoke(FormInputFieldName.f293566c);
                }
            }
        });
        zVar.f294011c = new x(zVar, titleContent.f293733c);
        SxNewAddressMviState.TypesContent typesContent = content.f293740d;
        ?? r62 = typesContent.f293734b;
        j jVar = new j(1, this, r.class, "onFieldFocused", "onFieldFocused(Lcom/avito/android/sx_address/new_address/analytics/FormInputFieldName;)V", 0);
        B b12 = this.f293941k;
        b12.getClass();
        ArrayList arrayList = new ArrayList();
        Iterable iterable = (Iterable) r62;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AddressType addressType = (AddressType) it.next();
            String str3 = addressType.f293603c;
            Iterator it2 = it;
            boolean z13 = addressType.f293604d;
            B.a aVar = new B.a(str3, z13, addressType.f293605e);
            if (z13) {
                arrayList.add(aVar);
            }
            arrayList2.add(aVar);
            it = it2;
        }
        Chips chips = b12.f293852b;
        chips.setData(arrayList2);
        chips.r(arrayList);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            b12.a((B.a) it3.next());
        }
        b12.f293856f = new C(b12, typesContent.f293735c);
        chips.setChipsSelectedListener(new D(r62, b12, jVar));
        Object obj = content.f293741e.f293725b;
        k kVar = new k(1, this, r.class, "onFieldFocused", "onFieldFocused(Lcom/avito/android/sx_address/new_address/analytics/FormInputFieldName;)V", 0);
        C35199f c35199f = this.f293942l;
        ViewGroup viewGroup = c35199f.f293888a;
        viewGroup.removeAllViews();
        Iterator it4 = ((Iterable) obj).iterator();
        int i12 = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            DetailItem detailItem = (DetailItem) next;
            View viewB = C0.b(viewGroup, R.layout.detail_layout, viewGroup, false);
            View viewFindViewById = viewB.findViewById(R.id.detail_item_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = viewB.findViewById(R.id.detail_item_chips);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
            }
            Chips chips2 = (Chips) viewFindViewById2;
            Iterator it5 = it4;
            chips2.setTag(detailItem.f293610f);
            textView.setText(detailItem.f293610f);
            ArrayList arrayList3 = detailItem.f293609e;
            View view3 = view;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it6 = arrayList3.iterator();
            C35199f.a aVar2 = null;
            while (it6.hasNext()) {
                DetailItem.Option option = (DetailItem.Option) it6.next();
                Iterator it7 = it6;
                NestedScrollView nestedScrollView2 = nestedScrollView;
                String str4 = option.f293613c;
                FrameLayout frameLayout2 = frameLayout;
                String str5 = detailItem.f293611g;
                String str6 = option.f293612b;
                SpinnerOverlay spinnerOverlay2 = spinnerOverlay;
                C35199f.a aVar3 = new C35199f.a(str4, L.f(str5, str6));
                if (L.f(str5, str6)) {
                    aVar2 = aVar3;
                }
                arrayList4.add(aVar3);
                it6 = it7;
                nestedScrollView = nestedScrollView2;
                frameLayout = frameLayout2;
                spinnerOverlay = spinnerOverlay2;
            }
            FrameLayout frameLayout3 = frameLayout;
            NestedScrollView nestedScrollView3 = nestedScrollView;
            SpinnerOverlay spinnerOverlay3 = spinnerOverlay;
            chips2.setData(arrayList4);
            if (aVar2 != null) {
                chips2.q(aVar2, true);
            }
            if (i12 == 0) {
                D6.c(viewB, null, Integer.valueOf(y6.b(16)), null, null, 13);
            } else {
                D6.c(viewB, null, Integer.valueOf(y6.b(24)), null, null, 13);
            }
            if (detailItem.f293608d) {
                c35199f.f293891d.put(detailItem.f293606b, new C35200g(chips2, detailItem));
            }
            chips2.setChipsSelectedListener(new com.avito.android.sx_address.new_address.view.h(detailItem, c35199f, kVar, chips2));
            viewGroup.addView(viewB);
            view = view3;
            it4 = it5;
            i12 = i13;
            nestedScrollView = nestedScrollView3;
            frameLayout = frameLayout3;
            spinnerOverlay = spinnerOverlay3;
        }
        FrameLayout frameLayout4 = frameLayout;
        View view4 = view;
        NestedScrollView nestedScrollView4 = nestedScrollView;
        SpinnerOverlay spinnerOverlay4 = spinnerOverlay;
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = content.f293742f;
        WorkingHours workingHours = workingSchedulerContent.f293736b;
        l lVar = new l(1, this, r.class, "onFieldFocused", "onFieldFocused(Lcom/avito/android/sx_address/new_address/analytics/FormInputFieldName;)V", 0);
        com.avito.android.sx_address.new_address.view.l lVar2 = this.f293943m;
        lVar2.getClass();
        ScheduleType scheduleType = ScheduleType.f293617b;
        String f293671l = workingHours.f293634d;
        com.avito.android.sx_address.new_address.d dVar2 = lVar2.f293904b;
        if (f293671l == null) {
            f293671l = dVar2.getF293671l();
        }
        l.a aVar4 = new l.a(scheduleType, f293671l);
        l.a aVar5 = new l.a(ScheduleType.f293618c, dVar2.getF293672m());
        List<? extends com.avito.android.lib.design.chips.h> listU = C42745f0.U(aVar4, aVar5);
        Chips chips3 = lVar2.f293913k;
        chips3.setData(listU);
        ScheduleType scheduleType2 = workingSchedulerContent.f293737c;
        int iOrdinal2 = scheduleType2.ordinal();
        if (iOrdinal2 == 0) {
            chips3.q(aVar4, true);
        } else if (iOrdinal2 == 1) {
            chips3.q(aVar5, true);
        }
        chips3.setChipsSelectedListener(new com.avito.android.sx_address.new_address.view.m(lVar2, lVar));
        lVar2.a(workingHours, scheduleType2, lVar);
        com.avito.android.util.text.j.a(this.f293947q, content.f293743g, null);
        D6.w(spinnerOverlay4);
        D6.w(frameLayout4);
        D6.H(nestedScrollView4);
        D6.H(view4);
        button.setLoading(false);
        button.setClickable(true);
        String str7 = addressContent.f293722b;
        button.setEnabled(true ^ (str7 == null || C43066x.K(str7)));
    }

    public final String d(SxNewAddressMviState.AddressContent addressContent) {
        int iOrdinal = this.f293934d.ordinal();
        com.avito.android.sx_address.new_address.d dVar = this.f293933c;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return addressContent.f293723c ? dVar.getF293667h() : dVar.getF293668i();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (addressContent.f293723c) {
            return dVar.getF293667h();
        }
        return null;
    }

    public final void e(@Y61.k SxNewAddressMviState sxNewAddressMviState) {
        String f293669j;
        SxNewAddressMviViewState sxNewAddressMviViewState = sxNewAddressMviState.f293715c;
        boolean z12 = sxNewAddressMviViewState instanceof SxNewAddressMviViewState.Content;
        FrameLayout frameLayout = this.f293951u;
        View view = this.f293946p;
        NestedScrollView nestedScrollView = this.f293944n;
        SpinnerOverlay spinnerOverlay = this.f293949s;
        Button button = this.f293945o;
        if (!z12) {
            if (sxNewAddressMviViewState instanceof SxNewAddressMviViewState.Loading) {
                D6.H(spinnerOverlay);
                D6.w(frameLayout);
                D6.w(nestedScrollView);
                D6.w(view);
                return;
            }
            if (sxNewAddressMviViewState instanceof SxNewAddressMviViewState.SaveLoading) {
                button.setLoading(true);
                button.setClickable(false);
                return;
            } else {
                if (sxNewAddressMviViewState instanceof SxNewAddressMviViewState.NetworkError) {
                    Throwable th2 = ((SxNewAddressMviViewState.NetworkError) sxNewAddressMviViewState).f293745b;
                    if ((th2 instanceof ApiException) && (((ApiException) th2).f318522b instanceof ApiError.NetworkIOError)) {
                        h();
                        return;
                    } else {
                        g(th2);
                        return;
                    }
                }
                return;
            }
        }
        SxNewAddressMviState.AddressContent addressContent = sxNewAddressMviState.f293716d;
        String strD = d(addressContent);
        int iOrdinal = this.f293934d.ordinal();
        com.avito.android.sx_address.new_address.d dVar = this.f293933c;
        if (iOrdinal == 0) {
            f293669j = dVar.getF293669j();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f293669j = dVar.getF293670k();
        }
        String str = f293669j;
        this.f293938h.a(str, addressContent.f293722b, strD, this.f293935e, addressContent.f293724d, new m());
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = sxNewAddressMviState.f293720h;
        this.f293943m.a(workingSchedulerContent.f293736b, workingSchedulerContent.f293737c, new n(1, this, r.class, "onFieldFocused", "onFieldFocused(Lcom/avito/android/sx_address/new_address/analytics/FormInputFieldName;)V", 0));
        D6.w(spinnerOverlay);
        D6.H(nestedScrollView);
        D6.w(frameLayout);
        D6.H(view);
        button.setLoading(false);
        button.setClickable(true);
        String str2 = addressContent.f293722b;
        button.setEnabled(true ^ (str2 == null || C43066x.K(str2)));
    }

    public final void f(@Y61.k s sVar, @Y61.k WorkingHours.Day day) {
        int i12;
        boolean z12 = sVar instanceof s.a;
        if (z12) {
            i12 = R.string.sx_new_address_start_working_day_title;
        } else {
            if (!(sVar instanceof s.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.sx_new_address_end_working_day_title;
        }
        int i13 = i12;
        t tVar = this.f293948r;
        tVar.getClass();
        WorkingHours.Day.Time time = day.f293635b;
        org.threeten.bp.f fVarG = org.threeten.bp.f.G(org.threeten.bp.e.L(), org.threeten.bp.g.u((int) time.f293638b, (int) time.f293639c));
        if (z12) {
            fVarG = null;
        } else {
            if (!(sVar instanceof s.b)) {
                throw new NoWhenBranchMatchedException();
            }
            time = day.f293637d;
        }
        org.threeten.bp.f fVarG2 = org.threeten.bp.f.G(org.threeten.bp.e.L(), org.threeten.bp.g.u((int) time.f293638b, (int) time.f293639c));
        int i14 = 0;
        TimePickerDialog.PickerWheel pickerWheel = null;
        int i15 = 15;
        int i16 = 0;
        TimePickerDialog timePickerDialog = new TimePickerDialog(tVar.f294002a, new TimePickerArguments(PickerHeaderType.f132602c, i14, pickerWheel, TimePickerDialog.ValidationErrorType.f132636d, fVarG2, i15, i16, new Validation(fVarG), i13, false, 70, null), new C33153i(1, sVar, tVar));
        timePickerDialog.f132623M = timePickerDialog.getContext().getString(R.string.sx_new_address_shedule_error);
        com.avito.android.lib.util.g.a(timePickerDialog);
    }

    public final void g(Throwable th2) {
        String f293666g;
        ApiError apiErrorN = th2 != null ? com.avito.android.error.z.n(th2) : null;
        View viewFindViewById = this.f293931a.findViewById(R.id.error_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f293952v = (LinearLayout) viewFindViewById;
        ImageView imageView = this.f293953w;
        com.avito.android.sx_address.new_address.d dVar = this.f293933c;
        if (imageView != null) {
            imageView.setImageResource(dVar.getF293664e());
        }
        TextView textView = this.f293954x;
        if (textView != null) {
            I5.a(textView, dVar.getF293665f(), false);
        }
        TextView textView2 = this.f293955y;
        if (textView2 != null) {
            if (apiErrorN == null || (f293666g = apiErrorN.getF244063c()) == null) {
                f293666g = dVar.getF293666g();
            }
            I5.a(textView2, f293666g, false);
        }
        D6.H(this.f293951u);
        D6.w(this.f293949s);
    }

    public final void h() {
        if (this.f293952v != null) {
            ImageView imageView = this.f293953w;
            com.avito.android.sx_address.new_address.d dVar = this.f293933c;
            if (imageView != null) {
                imageView.setImageResource(dVar.getF293661b());
            }
            TextView textView = this.f293954x;
            if (textView != null) {
                I5.a(textView, dVar.getF293662c(), false);
            }
            TextView textView2 = this.f293955y;
            if (textView2 != null) {
                I5.a(textView2, dVar.getF293663d(), false);
            }
        }
        D6.H(this.f293951u);
        D6.w(this.f293949s);
    }
}

package com.avito.android.edit_address;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23069w;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.edit_address.dialog.time_interval.TimeIntervalPicker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import dy.InterfaceC39825a;
import e11.ViewOnClickListenerC39879j1;
import hy.C41191c;
import hy.C41194f;
import hy.DialogC41189a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jy.C42446d;
import jy.InterfaceC42443a;
import jy.InterfaceC42445c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditAddressMviView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/o;", "Lcom/avito/android/edit_address/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f145975a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditAddressMviFragment f145976b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f145977c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f145978d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f145979e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC42443a, G0> f145980f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f145981g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f145982h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f145983i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final H2 f145984j;

    /* compiled from: EditAddressMviView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_address.EditAddressMviViewImpl$1$1", f = "EditAddressMviView.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145985q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f145986r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ o f145987s;

        /* compiled from: EditAddressMviView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.edit_address.EditAddressMviViewImpl$1$1$1", f = "EditAddressMviView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.edit_address.o$a$a, reason: collision with other inner class name */
        public static final class C4242a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f145988q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ o f145989r;

            /* compiled from: EditAddressMviView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.edit_address.EditAddressMviViewImpl$1$1$1$1", f = "EditAddressMviView.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.edit_address.o$a$a$a, reason: collision with other inner class name */
            public static final class C4243a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f145990q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ o f145991r;

                /* compiled from: EditAddressMviView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.edit_address.o$a$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C4244a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ o f145992b;

                    public C4244a(o oVar) {
                        this.f145992b = oVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        o oVar = this.f145992b;
                        oVar.getClass();
                        C42446d.c cVar = ((C42446d) obj).f405935a;
                        oVar.f145979e.l(cVar.f405945a, null);
                        Button button = oVar.f145983i;
                        boolean z12 = cVar.f405946b;
                        button.setLoading(z12);
                        button.setEnabled(!z12);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f145992b, o.class, "render", "render(Lcom/avito/android/edit_address/mvi/entity/EditAddressState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4243a(o oVar, Continuation<? super C4243a> continuation) {
                    super(2, continuation);
                    this.f145991r = oVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4243a(this.f145991r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4243a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f145990q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        o oVar = this.f145991r;
                        s sVar = oVar.f145977c;
                        C4244a c4244a = new C4244a(oVar);
                        this.f145990q = 1;
                        if (sVar.le(c4244a, this) == coroutine_suspended) {
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

            /* compiled from: EditAddressMviView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.edit_address.EditAddressMviViewImpl$1$1$1$2", f = "EditAddressMviView.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.edit_address.o$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f145993q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ o f145994r;

                /* compiled from: EditAddressMviView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.edit_address.o$a$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C4245a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ o f145995b;

                    public C4245a(o oVar) {
                        this.f145995b = oVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v23 */
                    /* JADX WARN: Type inference failed for: r3v24 */
                    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
                        Boolean[] boolArr;
                        C41194f c41194f;
                        InterfaceC42445c interfaceC42445c = (InterfaceC42445c) obj;
                        o oVar = this.f145995b;
                        oVar.getClass();
                        boolean z12 = interfaceC42445c instanceof InterfaceC42445c.C11593c;
                        u uVar = oVar.f145978d;
                        if (z12) {
                            uVar.d(oVar.f145976b);
                        } else {
                            boolean z13 = interfaceC42445c instanceof InterfaceC42445c.d;
                            Context context = oVar.f145982h;
                            if (z13) {
                                InterfaceC42445c.d dVar = (InterfaceC42445c.d) interfaceC42445c;
                                TimeIntervalPicker.Mode mode = dVar.f405928a;
                                com.avito.android.lib.util.g.a(new TimeIntervalPicker(context, mode, dVar.f405929b, new r(mode, oVar, dVar.f405930c)));
                            } else if (interfaceC42445c instanceof InterfaceC42445c.b) {
                                InterfaceC42445c.b bVar = (InterfaceC42445c.b) interfaceC42445c;
                                Object obj2 = bVar.f405924a;
                                ?? r32 = obj2;
                                if (obj2 == null) {
                                    r32 = C42784z0.f406748b;
                                }
                                List list = bVar.f405925b;
                                if (list == null) {
                                    list = C42784z0.f406748b;
                                }
                                q qVar = new q(oVar, bVar.f405926c);
                                DialogC41189a dialogC41189a = new DialogC41189a(context, 0, 2, null);
                                boolean z14 = true;
                                dialogC41189a.D(R.layout.ext_profile_address_edit_days_dialog, true);
                                com.avito.android.lib.design.bottom_sheet.d.M(dialogC41189a, null, false, true, 7);
                                com.avito.android.lib.design.bottom_sheet.d.I(dialogC41189a, true);
                                LinearLayout linearLayout = (LinearLayout) dialogC41189a.findViewById(R.id.ext_profile_days_picker_container);
                                ArrayList arrayList = new ArrayList();
                                for (String str : context.getResources().getStringArray(R.array.days_picker_items)) {
                                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.ext_profile_address_edit_days_dialog_item, (ViewGroup) linearLayout, false);
                                    ((ListItemCheckmark) viewInflate).setTitle(str);
                                    linearLayout.addView(viewInflate);
                                    arrayList.add(viewInflate);
                                }
                                C41191c c41191c = new C41191c(r32, list, qVar);
                                c41191c.f398316d = new C41194f(arrayList, c41191c);
                                if (!list.isEmpty() && (c41194f = c41191c.f398316d) != null) {
                                    c41194f.b(0);
                                }
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    int iIntValue = ((Number) it.next()).intValue();
                                    C41194f c41194f2 = c41191c.f398316d;
                                    if (c41194f2 != null) {
                                        c41194f2.b(iIntValue + 1);
                                    }
                                }
                                Iterator it2 = c41191c.f398313a.iterator();
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    boolArr = c41191c.f398317e;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    int iIntValue2 = ((Number) it2.next()).intValue();
                                    boolArr[iIntValue2] = Boolean.TRUE;
                                    C41194f c41194f3 = c41191c.f398316d;
                                    if (c41194f3 != null) {
                                        c41194f3.a(iIntValue2 + 1, true);
                                    }
                                }
                                int length = boolArr.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        C41194f c41194f4 = c41191c.f398316d;
                                        if (c41194f4 != null) {
                                            int length2 = boolArr.length;
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 >= length2) {
                                                    break;
                                                }
                                                if (!boolArr[i13].booleanValue()) {
                                                    z14 = false;
                                                    break;
                                                }
                                                i13++;
                                            }
                                            c41194f4.a(0, z14);
                                        }
                                    } else {
                                        if (!boolArr[i12].booleanValue()) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                                dialogC41189a.findViewById(R.id.ext_profile_days_picker_close_icon).setOnClickListener(new ViewOnClickListenerC39879j1(dialogC41189a, 7));
                                dialogC41189a.findViewById(R.id.ext_profile_days_picker_save_link).setOnClickListener(new com.avito.android.verification.verification_input_inn.o(15, c41191c, dialogC41189a));
                                com.avito.android.lib.util.g.a(dialogC41189a);
                            } else {
                                boolean z15 = interfaceC42445c instanceof InterfaceC42445c.f;
                                View view = oVar.f145975a;
                                if (z15) {
                                    String str2 = ((InterfaceC42445c.f) interfaceC42445c).f405932a;
                                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                    PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
                                    f.c.f125255c.getClass();
                                    com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                                } else if (interfaceC42445c instanceof InterfaceC42445c.e) {
                                    com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, view, ((InterfaceC42445c.e) interfaceC42445c).f405931a, oVar.f145981g, null);
                                } else if (interfaceC42445c instanceof InterfaceC42445c.a) {
                                    uVar.b(((InterfaceC42445c.a) interfaceC42445c).f405923a);
                                }
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f145995b, o.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/edit_address/mvi/entity/EditAddressOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(o oVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f145994r = oVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f145994r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f145993q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        o oVar = this.f145994r;
                        s sVar = oVar.f145977c;
                        C4245a c4245a = new C4245a(oVar);
                        this.f145993q = 1;
                        if (sVar.ke(c4245a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4242a(o oVar, Continuation<? super C4242a> continuation) {
                super(2, continuation);
                this.f145989r = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4242a c4242a = new C4242a(this.f145989r, continuation);
                c4242a.f145988q = obj;
                return c4242a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4242a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f145988q;
                o oVar = this.f145989r;
                C43259k.d(t12, null, null, new C4243a(oVar, null), 3);
                C43259k.d(t12, null, null, new b(oVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22983P interfaceC22983P, o oVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f145986r = interfaceC22983P;
            this.f145987s = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f145986r, this.f145987s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145985q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                C4242a c4242a = new C4242a(this.f145987s, null);
                this.f145985q = 1;
                if (C23056p0.b(this.f145986r, state, c4242a, this) == coroutine_suspended) {
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

    /* compiled from: EditAddressMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljy/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Ljy/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_address.EditAddressMviViewImpl$2$1", f = "EditAddressMviView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC42443a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f145996q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = o.this.new b(continuation);
            bVar.f145996q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC42443a interfaceC42443a, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC42443a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            o.this.f145980f.invoke((InterfaceC42443a) this.f145996q);
            return G0.f406611a;
        }
    }

    /* compiled from: EditAddressMviView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljy/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_address.EditAddressMviViewImpl$2$2", f = "EditAddressMviView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC42443a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f145998q;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC42443a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f145998q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f145998q;
            V2.f318762a.b("Error on action handle " + th2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: EditAddressMviView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Boolean, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            o oVar = o.this;
            if (zBooleanValue) {
                D6.w(oVar.f145983i);
            } else {
                oVar.f145983i.postDelayed(new p(oVar), 300L);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k View view, @Y61.k EditAddressMviFragment editAddressMviFragment, @Y61.k s sVar, @Y61.k u uVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.l<? super InterfaceC42443a, G0> lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Set<? extends TV0.d<?, ?>> set) {
        this.f145975a = view;
        this.f145976b = editAddressMviFragment;
        this.f145977c = sVar;
        this.f145978d = uVar;
        this.f145979e = dVar;
        this.f145980f = lVar;
        this.f145981g = screenPerformanceTracker;
        this.f145982h = view.getContext();
        View viewFindViewById = view.findViewById(R.id.edit_address_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.edit_address_save_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f145983i = (Button) viewFindViewById2;
        recyclerView.setItemAnimator(null);
        recyclerView.l(new PV.a(0, y6.b(116), 0, 0, 12, null), -1);
        recyclerView.setAdapter(dVar);
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new a(interfaceC22983P, this, null), 3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof InterfaceC39825a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C43175k.K(new C43152f0(new C43197r1(new b(null), C23069w.a(((InterfaceC39825a) it.next()).getF145788b(), interfaceC22983P.getLifecycle(), Lifecycle.State.f46682e)), new c(3, null)), C22981N.a(interfaceC22983P.getLifecycle()));
        }
        final int i12 = 0;
        this.f145983i.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_address.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f145974c;

            {
                this.f145974c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f145974c.f145980f.invoke(InterfaceC42443a.b.f405898a);
                        break;
                    default:
                        this.f145974c.f145980f.invoke(InterfaceC42443a.C11591a.f405897a);
                        break;
                }
            }
        });
        View viewFindViewById3 = this.f145975a.findViewById(R.id.toolbar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById3;
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTintList(C35835l0.e(R.attr.black, toolbar.getContext()));
        }
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_address.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f145974c;

            {
                this.f145974c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f145974c.f145980f.invoke(InterfaceC42443a.b.f405898a);
                        break;
                    default:
                        this.f145974c.f145980f.invoke(InterfaceC42443a.C11591a.f405897a);
                        break;
                }
            }
        });
        this.f145984j = K2.a(this.f145976b.requireActivity(), new d());
    }
}

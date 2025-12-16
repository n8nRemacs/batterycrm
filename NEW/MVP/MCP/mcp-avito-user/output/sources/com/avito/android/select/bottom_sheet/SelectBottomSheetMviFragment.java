package com.avito.android.select.bottom_sheet;

import Cd.C13243a;
import Xp0.AbstractC17036a;
import Y41.p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.RunnableC22211b;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import aq0.InterfaceC23653b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.SelectBottomSheetScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.select.A;
import com.avito.android.select.Arguments;
import com.avito.android.select.SelectSignificantState;
import com.avito.android.select.bottom_sheet.di.b;
import com.avito.android.select.bottom_sheet.result.SelectBottomSheetResult;
import com.avito.android.select.o;
import com.avito.android.select.t;
import com.avito.android.select.u;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import dq0.C39779a;
import dq0.C39783e;
import dq0.InterfaceC39781c;
import dq0.InterfaceC39782d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;
import ur.InterfaceC49101b;
import z1.AbstractC50339a;

/* compiled from: SelectBottomSheetMviFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/bottom_sheet/SelectBottomSheetMviFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/select/o;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectBottomSheetMviFragment extends BaseDialogFragment implements o, InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f265004s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public u.f f265005h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f265006i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f265007j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f265008k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f265009l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public SelectSignificantState f265010m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.select.bottom_sheet.g f265011n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f265012o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f265013p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f265014q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public A f265015r0;

    /* compiled from: SelectBottomSheetMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/select/bottom_sheet/SelectBottomSheetMviFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_SIGNIFICANT_STATE", "REQUEST_ITEM_SELECTION_DATA", "REQUEST_ITEM_SELECTION_KEY", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectBottomSheetMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Object, G0> {
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            u uVar = (u) this.receiver;
            uVar.getClass();
            if (obj instanceof String) {
                uVar.f266822N.K5(obj);
            } else if (obj instanceof AbstractC17036a) {
                uVar.f266823O.K5(obj);
            } else if (obj instanceof InterfaceC39781c) {
                uVar.accept(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectBottomSheetMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$onCreateDialog$2", f = "SelectBottomSheetMviFragment.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f265016q;

        /* compiled from: SelectBottomSheetMviFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$onCreateDialog$2$1", f = "SelectBottomSheetMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f265018q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SelectBottomSheetMviFragment f265019r;

            /* compiled from: SelectBottomSheetMviFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$onCreateDialog$2$1$1", f = "SelectBottomSheetMviFragment.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$c$a$a, reason: collision with other inner class name */
            public static final class C7911a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f265020q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectBottomSheetMviFragment f265021r;

                /* compiled from: SelectBottomSheetMviFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldq0/e;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ldq0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C7912a extends N implements Y41.l<C39783e, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ SelectBottomSheetMviFragment f265022l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C7912a(SelectBottomSheetMviFragment selectBottomSheetMviFragment) {
                        super(1);
                        this.f265022l = selectBottomSheetMviFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(C39783e c39783e) {
                        Input input;
                        C39783e c39783e2 = c39783e;
                        a aVar = SelectBottomSheetMviFragment.f265004s0;
                        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f265022l;
                        Set<ParcelableEntity<String>> set = c39783e2.f394139f;
                        String str = c39783e2.f394137d;
                        selectBottomSheetMviFragment.f265010m0 = new SelectSignificantState(str, set);
                        com.avito.android.select.bottom_sheet.g gVar = selectBottomSheetMviFragment.f265011n0;
                        if (gVar != null) {
                            C39779a c39779a = c39783e2.f394146m;
                            PrintableText printableText = c39779a.f394095a;
                            ViewGroup viewGroup = gVar.f265289a;
                            boolean z12 = c39783e2.f394135b;
                            int iD2 = gVar.f265293e ? C35835l0.d(R.attr.components_link_button_secondary, viewGroup.getContext()) : z12 ? C35835l0.d(R.attr.gray54, viewGroup.getContext()) : C35835l0.d(R.attr.blue, viewGroup.getContext());
                            int iD3 = z12 ? C35835l0.d(R.attr.gray54, viewGroup.getContext()) : C35835l0.d(R.attr.gray28, viewGroup.getContext());
                            TextView textView = gVar.f265301m;
                            textView.setText(printableText.k0(textView.getContext()));
                            int iOrdinal = c39783e2.f394136c.ordinal();
                            if (iOrdinal == 0) {
                                D6.H(textView);
                                textView.setClickable(true);
                                textView.setTextColor(iD2);
                                textView.setOnClickListener(new com.avito.android.select.bottom_sheet.f(gVar, 1));
                            } else if (iOrdinal != 2) {
                                D6.w(textView);
                                textView.setOnClickListener(null);
                            } else {
                                D6.H(textView);
                                textView.setClickable(false);
                                textView.setTextColor(iD3);
                            }
                            I5.a(gVar.f265295g, c39783e2.f394147n, false);
                            Button button = gVar.f265303o;
                            button.setText(c39779a.f394097c.k0(button.getContext()));
                            boolean z13 = c39783e2.f394138e;
                            D6.G(button, z13);
                            if (z13) {
                                button.setOnClickListener(new com.avito.android.select.bottom_sheet.f(gVar, 0));
                            } else {
                                button.setOnClickListener(null);
                            }
                            D6.G(gVar.f265291c, z13);
                            if (c39779a.f394096b) {
                                if (gVar.f265299k == null) {
                                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                                    ViewGroup viewGroup2 = gVar.f265294f;
                                    View viewInflate = layoutInflaterFrom.inflate(R.layout.select_sheet_dialog_search_view, viewGroup2, false);
                                    View viewFindViewById = viewInflate.findViewById(R.id.select_dialog_search_view_container);
                                    if (viewFindViewById == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                                    }
                                    View viewFindViewById2 = viewInflate.findViewById(R.id.select_dialog_search_view);
                                    if (viewFindViewById2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                                    }
                                    Input input2 = (Input) viewFindViewById2;
                                    View viewFindViewById3 = viewInflate.findViewById(R.id.clear_button);
                                    if (viewFindViewById3 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                                    }
                                    D6.c(viewFindViewById, null, null, null, 0, 7);
                                    viewGroup2.addView(viewInflate, 0);
                                    m mVar = new m(input2, gVar);
                                    input2.b(mVar);
                                    gVar.f265298j = mVar;
                                    gVar.f265299k = input2;
                                    gVar.f265300l = (Button) viewFindViewById3;
                                }
                                Input input3 = gVar.f265299k;
                                String strValueOf = String.valueOf(input3 != null ? input3.m53getText() : null);
                                if (str.length() != 0 && !strValueOf.equals(str) && (input = gVar.f265299k) != null) {
                                    Input.t(input, str, false, 6);
                                }
                            } else {
                                Input input4 = gVar.f265299k;
                                if (input4 != null) {
                                    viewGroup.removeView(input4);
                                    m mVar2 = gVar.f265298j;
                                    if (mVar2 != null) {
                                        input4.h(mVar2);
                                    }
                                    Button button2 = gVar.f265300l;
                                    if (button2 != null) {
                                        button2.setOnClickListener(null);
                                    }
                                    input4.setOnFocusChangeListener(null);
                                    gVar.f265299k = null;
                                    gVar.f265300l = null;
                                }
                            }
                            boolean z14 = c39779a.f394106l;
                            RecyclerView recyclerView = gVar.f265296h;
                            if ((!z14 && !c39779a.f394099e) || c39779a.f394100f) {
                                recyclerView.setItemAnimator(null);
                            } else if (recyclerView.getItemAnimator() == null) {
                                new l(gVar);
                            }
                            gVar.f265290b.l(c39783e2.f394141h, new RunnableC22211b(11, new k(gVar, new com.avito.android.select.bottom_sheet.h(gVar, c39783e2), c39783e2)));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7911a(SelectBottomSheetMviFragment selectBottomSheetMviFragment, Continuation<? super C7911a> continuation) {
                    super(2, continuation);
                    this.f265021r = selectBottomSheetMviFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7911a(this.f265021r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7911a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f265020q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SelectBottomSheetMviFragment.f265004s0;
                        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f265021r;
                        n2<C39783e> state = ((u) selectBottomSheetMviFragment.f265006i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = selectBottomSheetMviFragment.f265007j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C7912a c7912a = new C7912a(selectBottomSheetMviFragment);
                        this.f265020q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c7912a, this) == coroutine_suspended) {
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

            /* compiled from: SelectBottomSheetMviFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$onCreateDialog$2$1$2", f = "SelectBottomSheetMviFragment.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f265023q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectBottomSheetMviFragment f265024r;

                /* compiled from: SelectBottomSheetMviFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7913a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SelectBottomSheetMviFragment f265025b;

                    public C7913a(SelectBottomSheetMviFragment selectBottomSheetMviFragment) {
                        this.f265025b = selectBottomSheetMviFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Input input;
                        Input input2;
                        InterfaceC39782d interfaceC39782d = (InterfaceC39782d) obj;
                        a aVar = SelectBottomSheetMviFragment.f265004s0;
                        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f265025b;
                        if (interfaceC39782d instanceof InterfaceC39782d.b) {
                            com.avito.android.select.bottom_sheet.g gVar = selectBottomSheetMviFragment.f265011n0;
                            if (gVar != null) {
                                Input input3 = gVar.f265299k;
                                Editable editableM53getText = input3 != null ? input3.m53getText() : null;
                                if (editableM53getText != null && editableM53getText.length() != 0 && (input2 = gVar.f265299k) != null) {
                                    input2.requestFocus();
                                }
                            }
                        } else if (interfaceC39782d instanceof InterfaceC39782d.a) {
                            com.avito.android.select.bottom_sheet.g gVar2 = selectBottomSheetMviFragment.f265011n0;
                            if (gVar2 != null && (input = gVar2.f265299k) != null) {
                                K2.d(input, true);
                            }
                        } else if (interfaceC39782d instanceof InterfaceC39782d.C11040d) {
                            InterfaceC39782d.C11040d c11040d = (InterfaceC39782d.C11040d) interfaceC39782d;
                            List<ParcelableEntity<String>> list = c11040d.f394132a;
                            String str = c11040d.f394133b;
                            selectBottomSheetMviFragment.f265014q0 = true;
                            com.avito.android.select.p pVarF5 = selectBottomSheetMviFragment.f5();
                            String str2 = selectBottomSheetMviFragment.f265012o0;
                            if (str2 == null) {
                                str2 = null;
                            }
                            selectBottomSheetMviFragment.getParentFragmentManager().o0(C22777e.b(new Q("REQUEST_ITEM_SELECTION_DATA", new SelectBottomSheetResult.Select(str2, list, str))), "REQUEST_ITEM_SELECTION_KEY");
                            if (pVarF5 != null) {
                                String str3 = selectBottomSheetMviFragment.f265012o0;
                                pVarF5.j(str3 != null ? str3 : null, str, list);
                            }
                            A a12 = selectBottomSheetMviFragment.f265015r0;
                            if (a12 != null) {
                                List<ParcelableEntity<String>> list2 = list;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((String) ((ParcelableEntity) it.next()).getId());
                                }
                                a12.a(new InlineFilterValue.InlineFilterMultiSelectValue(arrayList));
                            }
                            selectBottomSheetMviFragment.dismissAllowingStateLoss();
                        } else if (interfaceC39782d instanceof InterfaceC39782d.c) {
                            String str4 = ((InterfaceC39782d.c) interfaceC39782d).f394131a;
                            String str5 = selectBottomSheetMviFragment.f265012o0;
                            selectBottomSheetMviFragment.getParentFragmentManager().o0(C22777e.b(new Q("REQUEST_ITEM_SELECTION_DATA", new SelectBottomSheetResult.Reset(str5 != null ? str5 : null))), "REQUEST_ITEM_SELECTION_KEY");
                            com.avito.android.select.p pVarF52 = selectBottomSheetMviFragment.f5();
                            if (pVarF52 != null) {
                                pVarF52.s3(str4);
                            }
                            A a13 = selectBottomSheetMviFragment.f265015r0;
                            if (a13 != null) {
                                a13.onDialogClose();
                            }
                            selectBottomSheetMviFragment.dismissAllowingStateLoss();
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
                        return new C42801a(2, this.f265025b, SelectBottomSheetMviFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/select/mvi/entity/SelectOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SelectBottomSheetMviFragment selectBottomSheetMviFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f265024r = selectBottomSheetMviFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f265024r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f265023q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SelectBottomSheetMviFragment.f265004s0;
                        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f265024r;
                        InterfaceC43160i<InterfaceC39782d> events = ((u) selectBottomSheetMviFragment.f265006i0.getValue()).getEvents();
                        C7913a c7913a = new C7913a(selectBottomSheetMviFragment);
                        this.f265023q = 1;
                        if (events.collect(c7913a, this) == coroutine_suspended) {
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
            public a(SelectBottomSheetMviFragment selectBottomSheetMviFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f265019r = selectBottomSheetMviFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f265019r, continuation);
                aVar.f265018q = obj;
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
                T t12 = (T) this.f265018q;
                SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f265019r;
                C43259k.d(t12, null, null, new C7911a(selectBottomSheetMviFragment, null), 3);
                C43259k.d(t12, null, null, new b(selectBottomSheetMviFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return SelectBottomSheetMviFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f265016q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SelectBottomSheetMviFragment selectBottomSheetMviFragment = SelectBottomSheetMviFragment.this;
                a aVar = new a(selectBottomSheetMviFragment, null);
                this.f265016q = 1;
                if (C23056p0.b(selectBottomSheetMviFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SelectBottomSheetMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldq0/c;", "it", "Lkotlin/G0;", "invoke", "(Ldq0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC39781c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC39781c interfaceC39781c) {
            a aVar = SelectBottomSheetMviFragment.f265004s0;
            ((u) SelectBottomSheetMviFragment.this.f265006i0.getValue()).accept(interfaceC39781c);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f265027l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f265027l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f265027l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectBottomSheetMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f265029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f265029l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f265029l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265030l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f265030l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265031l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f265031l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectBottomSheetMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/select/u;", "invoke", "()Lcom/avito/android/select/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<u> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final u invoke() {
            u.f fVar = SelectBottomSheetMviFragment.this.f265005h0;
            if (fVar == null) {
                fVar = null;
            }
            return fVar.create();
        }
    }

    public SelectBottomSheetMviFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f265006i0 = new O0(m0.f406844a.b(u.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        SelectSignificantState selectSignificantState;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        Object parcelable = i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", Arguments.class) : bundleRequireArguments.getParcelable("arguments");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Arguments argumentsCopy = (Arguments) parcelable;
        if (argumentsCopy.getVariants().isEmpty()) {
            InterfaceC23487e targetFragment = getTargetFragment();
            t tVar = targetFragment instanceof t ? (t) targetFragment : null;
            if (tVar == null) {
                androidx.core.content.j jVarL1 = l1();
                tVar = jVarL1 instanceof t ? (t) jVarL1 : null;
            }
            List<ParcelableEntity<String>> listP3 = tVar != null ? tVar.p3() : null;
            if (listP3 != null) {
                argumentsCopy = argumentsCopy.copy(((-9) & 1) != 0 ? argumentsCopy.isRedesigned : false, ((-9) & 2) != 0 ? argumentsCopy.requestId : null, ((-9) & 4) != 0 ? argumentsCopy.groups : null, ((-9) & 8) != 0 ? argumentsCopy.variants : listP3, ((-9) & 16) != 0 ? argumentsCopy.selected : null, ((-9) & 32) != 0 ? argumentsCopy.title : null, ((-9) & 64) != 0 ? argumentsCopy.description : null, ((-9) & 128) != 0 ? argumentsCopy.showSearch : false, ((-9) & 256) != 0 ? argumentsCopy.hideHeader : false, ((-9) & 512) != 0 ? argumentsCopy.showSearchClearButton : false, ((-9) & 1024) != 0 ? argumentsCopy.multiSelect : false, ((-9) & 2048) != 0 ? argumentsCopy.canClear : false, ((-9) & 4096) != 0 ? argumentsCopy.requestFocus : false, ((-9) & 8192) != 0 ? argumentsCopy.areGroupsCollapsible : false, ((-9) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? argumentsCopy.typoCorrectionEnabled : false, ((-9) & 32768) != 0 ? argumentsCopy.attributeId : null, ((-9) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? argumentsCopy.withImages : false, ((-9) & 131072) != 0 ? argumentsCopy.titlePattern : null, ((-9) & 262144) != 0 ? argumentsCopy.imageParams : null, ((-9) & 524288) != 0 ? argumentsCopy.confirmButtonTitle : null, ((-9) & 1048576) != 0 ? argumentsCopy.variantIdForEmptySearch : null, ((-9) & 2097152) != 0 ? argumentsCopy.isFromFilters : false, ((-9) & 4194304) != 0 ? argumentsCopy.isFromInlineFilters : false, ((-9) & 8388608) != 0 ? argumentsCopy.isPaginationSuggest : false, ((-9) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? argumentsCopy.withLeftIcon : false, ((-9) & 33554432) != 0 ? argumentsCopy.needFooter : false, ((-9) & 67108864) != 0 ? argumentsCopy.hideClear : false, ((-9) & 134217728) != 0 ? argumentsCopy.showCloseButton : false, ((-9) & 268435456) != 0 ? argumentsCopy.defaultValue : null, ((-9) & 536870912) != 0 ? argumentsCopy.optionImageSize : null, ((-9) & 1073741824) != 0 ? argumentsCopy.searchParams : null, ((-9) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? argumentsCopy.candy : false, (255 & 1) != 0 ? argumentsCopy.isChips : false, (255 & 2) != 0 ? argumentsCopy.itemsStyle : null, (255 & 4) != 0 ? argumentsCopy.submitButtonEnabled : false, (255 & 8) != 0 ? argumentsCopy.isFullScreen : false, (255 & 16) != 0 ? argumentsCopy.isSectionedPagination : false, (255 & 32) != 0 ? argumentsCopy.titleMaxLinesCount : 0, (255 & 64) != 0 ? argumentsCopy.searchErrorTextRes : null, (255 & 128) != 0 ? argumentsCopy.searchErrorGravity : null);
            }
        }
        if (bundle != null) {
            selectSignificantState = (SelectSignificantState) (i12 >= 34 ? (Parcelable) bundle.getParcelable("significant_state", SelectSignificantState.class) : bundle.getParcelable("significant_state"));
        } else {
            selectSignificantState = null;
        }
        this.f265010m0 = selectSignificantState;
        b.a aVarA = com.avito.android.select.bottom_sheet.di.a.a();
        aVarA.d((InterfaceC23653b) C29972i.a(C29972i.b(this), InterfaceC23653b.class));
        aVarA.a(cv.c.b(this));
        aVarA.h(argumentsCopy);
        aVarA.b(getResources());
        com.avito.android.select.p pVarF5 = f5();
        aVarA.e(pVarF5 != null ? pVarF5.E4(argumentsCopy) : null);
        aVarA.g(this.f265010m0);
        aVarA.c(new C28478k(SelectBottomSheetScreen.f90478d, s.b(this), null, 4, null));
        aVarA.f(new d());
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f265007j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.select.p f5() {
        InterfaceC23487e targetFragment = getTargetFragment();
        com.avito.android.select.p pVar = targetFragment instanceof com.avito.android.select.p ? (com.avito.android.select.p) targetFragment : null;
        if (pVar != null) {
            return pVar;
        }
        androidx.core.content.j jVarL1 = l1();
        if (jVarL1 instanceof com.avito.android.select.p) {
            return (com.avito.android.select.p) jVarL1;
        }
        return null;
    }

    public final com.avito.android.lib.design.bottom_sheet.d g5(Arguments arguments) {
        boolean z12 = arguments.isFullScreen() || arguments.isPaginationSuggest();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(com.avito.android.lib.deprecated_design.f.a(requireContext(), Theme.AVITO_RE_23.getResName()), R.style.Re23_BottomSheet_Default);
        dVar.D(R.layout.select_sheet_dialog, true);
        if (arguments.getHideHeader()) {
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        } else {
            String str = this.f265013p0;
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, str != null ? str : null, arguments.getShowCloseButton(), true, 2);
        }
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new com.avito.android.bottom_sheet_group.o(2));
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(arguments.isFromFilters() || z12);
        dVar.J(arguments.isFromFilters() || z12);
        D6.w(dVar.findViewById(R.id.header_divider));
        if (arguments.isFromFilters() || arguments.isFromInlineFilters()) {
            q qVar = dVar.f178530x;
            if (qVar != null) {
                qVar.g7(1);
            }
        } else {
            int titleMaxLinesCount = arguments.getTitleMaxLinesCount();
            q qVar2 = dVar.f178530x;
            if (qVar2 != null) {
                qVar2.g7(titleMaxLinesCount);
            }
        }
        Integer searchErrorTextRes = arguments.getSearchErrorTextRes();
        int iIntValue = searchErrorTextRes != null ? searchErrorTextRes.intValue() : R.string.no_found_response;
        Integer searchErrorGravity = arguments.getSearchErrorGravity();
        int iIntValue2 = searchErrorGravity != null ? searchErrorGravity.intValue() : 17;
        TextView textView = (TextView) dVar.findViewById(android.R.id.empty);
        if (textView != null) {
            textView.setText(iIntValue);
        }
        if (textView != null) {
            textView.setGravity(iIntValue2);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVarG5;
        ScreenPerformanceTracker screenPerformanceTracker = this.f265007j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", Arguments.class) : bundleRequireArguments.getParcelable("arguments");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Arguments arguments = (Arguments) parcelable;
        this.f265012o0 = arguments.getRequestId();
        this.f265013p0 = arguments.getTitle();
        if (arguments.isRedesigned()) {
            dVarG5 = g5(arguments);
            q qVar = dVarG5.f178530x;
            if (qVar != null) {
                qVar.g7(1);
            }
        } else {
            dVarG5 = g5(arguments);
        }
        ViewGroup viewGroup = (ViewGroup) dVarG5.findViewById(R.id.bottom_sheet);
        com.avito.konveyor.adapter.d dVar = this.f265008k0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        View viewFindViewById = dVarG5.findViewById(R.id.footer_container);
        b bVar = new b(1, (u) this.f265006i0.getValue(), u.class, "collectViewSignals", "collectViewSignals(Ljava/lang/Object;)V", 0);
        InterfaceC49101b interfaceC49101b = this.f265009l0;
        if (interfaceC49101b == null) {
            interfaceC49101b = null;
        }
        this.f265011n0 = new com.avito.android.select.bottom_sheet.g(viewGroup, dVar2, viewFindViewById, bVar, interfaceC49101b.c());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f265007j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVarG5;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f265014q0) {
            return;
        }
        dismissAllowingStateLoss();
        A a12 = this.f265015r0;
        if (a12 != null) {
            a12.onDialogClose();
        }
        String str = this.f265012o0;
        if (str == null) {
            str = null;
        }
        C22960s.a(C22777e.b(new Q("REQUEST_ITEM_SELECTION_DATA", new SelectBottomSheetResult.Cancel(str))), this, "REQUEST_ITEM_SELECTION_KEY");
        com.avito.android.select.p pVarF5 = f5();
        if (pVarF5 == null) {
            return;
        }
        String str2 = this.f265012o0;
        pVarF5.q(str2 != null ? str2 : null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        SelectSignificantState selectSignificantState = this.f265010m0;
        if (selectSignificantState != null) {
            bundle.putParcelable("significant_state", selectSignificantState);
        }
    }
}

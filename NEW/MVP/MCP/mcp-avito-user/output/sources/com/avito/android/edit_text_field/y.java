package com.avito.android.edit_text_field;

import Ay.InterfaceC13103a;
import Ay.c;
import Ay.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.profile_management_core.edit_text_field.AboutPopup;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.PopupTab;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import yy.C50322a;

/* compiled from: EditTextFieldView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/y;", "Lcom/avito/android/edit_text_field/w;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f147035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditTextFieldFragment f147036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final EditTextFieldFragment.Mode f147037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f147038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f147039e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f147040f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f147041g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Toolbar f147042h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ImageView f147043i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f147044j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f147045k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f147046l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TabGroup f147047m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f147048n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f147049o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f147050p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final PageIndicatorRe23 f147051q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f147052r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Z1<String> f147053s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f147054t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f147055u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final J f147056v;

    /* compiled from: EditTextFieldView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldViewImpl$7$1", f = "EditTextFieldView.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147057q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f147058r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ y f147059s;

        /* compiled from: EditTextFieldView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldViewImpl$7$1$1", f = "EditTextFieldView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.edit_text_field.y$a$a, reason: collision with other inner class name */
        public static final class C4278a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f147060q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ y f147061r;

            /* compiled from: EditTextFieldView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldViewImpl$7$1$1$1", f = "EditTextFieldView.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.edit_text_field.y$a$a$a, reason: collision with other inner class name */
            public static final class C4279a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f147062q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ y f147063r;

                /* compiled from: EditTextFieldView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.edit_text_field.y$a$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C4280a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ y f147064b;

                    public C4280a(y yVar) {
                        this.f147064b = yVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.lib.design.modal.a aVar;
                        com.avito.android.lib.design.modal.a aVar2;
                        Ay.d dVar = (Ay.d) obj;
                        y yVar = this.f147064b;
                        yVar.getClass();
                        boolean z12 = dVar.f759b;
                        Button button = yVar.f147046l;
                        button.setLoading(z12);
                        boolean z13 = !z12;
                        button.setClickable(z13);
                        yVar.f147044j.setEnabled(z13);
                        EditTextFieldFragment editTextFieldFragment = yVar.f147036b;
                        FormattedAlertSettings formattedAlertSettings = dVar.f762e;
                        if (formattedAlertSettings != null && ((aVar2 = yVar.f147055u) == null || !aVar2.isShowing())) {
                            com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, editTextFieldFragment.requireContext(), new D(formattedAlertSettings, yVar));
                            com.avito.android.lib.util.g.a(aVarC);
                            yVar.f147055u = aVarC;
                        }
                        NotSavedAlertSettings notSavedAlertSettings = dVar.f763f;
                        if (notSavedAlertSettings != null && ((aVar = yVar.f147054t) == null || !aVar.isShowing())) {
                            com.avito.android.lib.design.modal.a aVarC2 = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, editTextFieldFragment.requireContext(), new I(notSavedAlertSettings, yVar));
                            com.avito.android.lib.util.g.a(aVarC2);
                            yVar.f147054t = aVarC2;
                        }
                        TextView textView = yVar.f147045k;
                        d.b bVar = dVar.f760c;
                        if (bVar != null) {
                            View view = yVar.f147035a;
                            textView.setTextColor(C35835l0.d(R.attr.red, view.getContext()));
                            D6.H(textView);
                            String string = bVar.f764a;
                            if (string == null) {
                                string = view.getContext().getString(R.string.extended_profile_settings_edit_text_error);
                            }
                            I5.a(textView, string, true);
                        } else {
                            D6.g(textView);
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
                        return new C42801a(2, this.f147064b, y.class, "render", "render(Lcom/avito/android/edit_text_field/mvi/entity/EditTextFieldState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4279a(y yVar, Continuation<? super C4279a> continuation) {
                    super(2, continuation);
                    this.f147063r = yVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4279a(this.f147063r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4279a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f147062q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        y yVar = this.f147063r;
                        n nVar = yVar.f147038d;
                        C4280a c4280a = new C4280a(yVar);
                        this.f147062q = 1;
                        if (nVar.le(c4280a, this) == coroutine_suspended) {
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

            /* compiled from: EditTextFieldView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldViewImpl$7$1$1$2", f = "EditTextFieldView.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.edit_text_field.y$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f147065q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ y f147066r;

                /* compiled from: EditTextFieldView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.edit_text_field.y$a$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C4281a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ y f147067b;

                    public C4281a(y yVar) {
                        this.f147067b = yVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        View view;
                        Ay.c cVar = (Ay.c) obj;
                        y yVar = this.f147067b;
                        yVar.getClass();
                        if (cVar instanceof c.b) {
                            c.b bVar = (c.b) cVar;
                            Throwable th2 = bVar.f754a;
                            if (yVar.f147052r) {
                                Fragment parentFragment = yVar.f147036b.getParentFragment();
                                view = parentFragment != null ? parentFragment.getView() : null;
                            } else {
                                view = yVar.f147035a;
                            }
                            if (view != null) {
                                com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, view, th2, yVar.f147041g, new A(yVar, bVar.f755b));
                            }
                        } else if (cVar instanceof c.a) {
                            yVar.a(((c.a) cVar).f753a);
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
                        return new C42801a(2, this.f147067b, y.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/edit_text_field/mvi/entity/EditTextFieldOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(y yVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f147066r = yVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f147066r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f147065q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        y yVar = this.f147066r;
                        n nVar = yVar.f147038d;
                        C4281a c4281a = new C4281a(yVar);
                        this.f147065q = 1;
                        if (nVar.ke(c4281a, this) == coroutine_suspended) {
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

            /* compiled from: EditTextFieldView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldViewImpl$7$1$1$3", f = "EditTextFieldView.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.edit_text_field.y$a$a$c */
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f147068q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ y f147069r;

                /* compiled from: EditTextFieldView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.edit_text_field.y$a$a$c$a, reason: collision with other inner class name */
                public static final class C4282a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ y f147070b;

                    public C4282a(y yVar) {
                        this.f147070b = yVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f147070b.f147038d.accept(new InterfaceC13103a.f((String) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(y yVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f147069r = yVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f147069r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f147068q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        y yVar = this.f147069r;
                        Z1<String> z12 = yVar.f147053s;
                        C4282a c4282a = new C4282a(yVar);
                        this.f147068q = 1;
                        if (z12.collect(c4282a, this) == coroutine_suspended) {
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
            public C4278a(y yVar, Continuation<? super C4278a> continuation) {
                super(2, continuation);
                this.f147061r = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4278a c4278a = new C4278a(this.f147061r, continuation);
                c4278a.f147060q = obj;
                return c4278a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4278a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f147060q;
                y yVar = this.f147061r;
                C43259k.d(t12, null, null, new C4279a(yVar, null), 3);
                C43259k.d(t12, null, null, new b(yVar, null), 3);
                C43259k.d(t12, null, null, new c(yVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22983P interfaceC22983P, y yVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f147058r = interfaceC22983P;
            this.f147059s = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f147058r, this.f147059s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147057q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                C4278a c4278a = new C4278a(this.f147059s, null);
                this.f147057q = 1;
                if (C23056p0.b(this.f147058r, state, c4278a, this) == coroutine_suspended) {
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

    /* compiled from: EditTextFieldView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            y.this.f147053s.setValue(str);
            return G0.f406611a;
        }
    }

    /* compiled from: EditTextFieldView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "text", "", "hint", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<String, CharSequence, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, CharSequence charSequence) {
            y yVar = y.this;
            yVar.f147053s.setValue(str);
            int iD2 = C35835l0.d(R.attr.gray54, yVar.f147035a.getContext());
            TextView textView = yVar.f147045k;
            textView.setTextColor(iD2);
            I5.a(textView, charSequence, true);
            return G0.f406611a;
        }
    }

    public y(@Y61.k View view, @Y61.k EditTextFieldFragment editTextFieldFragment, @Y61.k EditTextFieldFragment.Mode mode, @Y61.k n nVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k p pVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        J l12;
        this.f147035a = view;
        this.f147036b = editTextFieldFragment;
        this.f147037c = mode;
        this.f147038d = nVar;
        this.f147039e = pVar;
        this.f147040f = aVar;
        this.f147041g = screenPerformanceTracker;
        this.f147042h = (Toolbar) view.findViewById(R.id.toolbar);
        this.f147043i = (ImageView) view.findViewById(R.id.close_button);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f147044j = input;
        View viewFindViewById3 = view.findViewById(R.id.error_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f147045k = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.save_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f147046l = button;
        View viewFindViewById5 = view.findViewById(R.id.about_tabs);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_group.TabGroup");
        }
        TabGroup tabGroup = (TabGroup) viewFindViewById5;
        this.f147047m = tabGroup;
        View viewFindViewById6 = view.findViewById(R.id.list_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById6;
        this.f147048n = linearLayout;
        View viewFindViewById7 = view.findViewById(R.id.story_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById7;
        this.f147049o = linearLayout2;
        View viewFindViewById8 = view.findViewById(R.id.recycler_stories);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f147050p = (RecyclerView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.stories_indicator_snap_scroll);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23");
        }
        this.f147051q = (PageIndicatorRe23) viewFindViewById9;
        this.f147052r = editTextFieldFragment.getResources().getBoolean(R.bool.is_tablet);
        this.f147053s = p2.a("");
        if (mode instanceof EditTextFieldFragment.Mode.Basic) {
            l12 = new C30325a(input, button, new b());
        } else {
            if (!(mode instanceof EditTextFieldFragment.Mode.Extended)) {
                throw new NoWhenBranchMatchedException();
            }
            l12 = new L(input, button, ((EditTextFieldFragment.Mode.Extended) mode).f146905i, new c());
        }
        this.f147056v = l12;
        l12.a();
        I5.a(textView, mode.getF146899c(), false);
        String f146901e = mode.getF146901e();
        if (f146901e == null || f146901e.length() == 0) {
            input.setHint(mode.getF146902f());
        } else {
            Input.t(input, mode.getF146901e(), false, 4);
        }
        EditTextFieldFragment.Mode.Extended extended = mode instanceof EditTextFieldFragment.Mode.Extended ? (EditTextFieldFragment.Mode.Extended) mode : null;
        AboutPopup aboutPopup = extended != null ? extended.f146908l : null;
        D6.w(linearLayout);
        D6.w(linearLayout2);
        ArrayList arrayList = aboutPopup != null ? aboutPopup.f226608b : null;
        if (arrayList == null || arrayList.isEmpty()) {
            D6.w(tabGroup);
        } else {
            D6.H(tabGroup);
            ArrayList arrayList2 = aboutPopup.f226608b;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((PopupTab) it.next()).getF226618b()), null, false, 6, null));
            }
            this.f147035a.post(new RunnableC28882d(3, this, aboutPopup));
            com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList3, 0);
            tabGroup.d(new z(aboutPopup, this));
        }
        Toolbar toolbar = this.f147042h;
        if (toolbar != null) {
            final int i12 = 0;
            toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_text_field.x

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ y f147034c;

                {
                    this.f147034c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                            break;
                        case 1:
                            this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                            break;
                        case 2:
                            y yVar = this.f147034c;
                            yVar.f147038d.accept(new InterfaceC13103a.g(String.valueOf(yVar.f147044j.m53getText())));
                            break;
                        default:
                            K2.d(this.f147034c.f147044j, true);
                            break;
                    }
                }
            });
        }
        ImageView imageView = this.f147043i;
        if (imageView != null) {
            final int i13 = 1;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_text_field.x

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ y f147034c;

                {
                    this.f147034c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                            break;
                        case 1:
                            this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                            break;
                        case 2:
                            y yVar = this.f147034c;
                            yVar.f147038d.accept(new InterfaceC13103a.g(String.valueOf(yVar.f147044j.m53getText())));
                            break;
                        default:
                            K2.d(this.f147034c.f147044j, true);
                            break;
                    }
                }
            });
        }
        final int i14 = 2;
        this.f147046l.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_text_field.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f147034c;

            {
                this.f147034c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                        break;
                    case 1:
                        this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                        break;
                    case 2:
                        y yVar = this.f147034c;
                        yVar.f147038d.accept(new InterfaceC13103a.g(String.valueOf(yVar.f147044j.m53getText())));
                        break;
                    default:
                        K2.d(this.f147034c.f147044j, true);
                        break;
                }
            }
        });
        this.f147044j.setOnEditorActionListener(new C27140f(this, 4));
        final int i15 = 3;
        this.f147035a.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_text_field.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f147034c;

            {
                this.f147034c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                        break;
                    case 1:
                        this.f147034c.f147038d.accept(InterfaceC13103a.C0031a.f735a);
                        break;
                    case 2:
                        y yVar = this.f147034c;
                        yVar.f147038d.accept(new InterfaceC13103a.g(String.valueOf(yVar.f147044j.m53getText())));
                        break;
                    default:
                        K2.d(this.f147034c.f147044j, true);
                        break;
                }
            }
        });
        RecyclerView recyclerView = this.f147050p;
        new androidx.recyclerview.widget.J().b(recyclerView);
        recyclerView.l(new PV.a(0, 0, y6.b(8), y6.b(8)), -1);
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new a(interfaceC22983P, this, null), 3);
    }

    public final void a(boolean z12) {
        EditTextFieldFragment editTextFieldFragment = this.f147036b;
        FragmentManager parentFragmentManager = editTextFieldFragment.getParentFragmentManager();
        EditTextFieldFragment.Mode mode = editTextFieldFragment.f146892m0;
        if (mode == null) {
            mode = null;
        }
        parentFragmentManager.o0(C22777e.b(new Q("edit_text_field_result_has_changed", Boolean.valueOf(z12))), mode.getF146903g());
        this.f147039e.d();
    }

    public final void b(PopupTab popupTab) {
        boolean z12 = popupTab instanceof PopupTab.ListTab;
        LinearLayout linearLayout = this.f147049o;
        LinearLayout linearLayout2 = this.f147048n;
        if (!z12) {
            if (popupTab instanceof PopupTab.StoryTab) {
                D6.H(linearLayout);
                D6.w(linearLayout2);
                C50322a c50322a = new C50322a(((PopupTab.StoryTab) popupTab).f226619c);
                RecyclerView recyclerView = this.f147050p;
                recyclerView.setAdapter(c50322a);
                com.avito.android.lib.design.page_indicator_re23.b.a(this.f147051q, recyclerView);
                return;
            }
            return;
        }
        D6.H(linearLayout2);
        D6.w(linearLayout);
        linearLayout2.removeAllViews();
        for (String str : ((PopupTab.ListTab) popupTab).f226617c) {
            View viewInflate = LayoutInflater.from(this.f147035a.getContext()).inflate(R.layout.edit_text_list_item, (ViewGroup) linearLayout2, false);
            View viewFindViewById = viewInflate.findViewById(R.id.text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById).setText(str);
            linearLayout2.addView(viewInflate);
        }
    }
}

package com.avito.android.extended_profile_selection_create.image;

import Cd.C13243a;
import JA.a;
import JA.b;
import Y41.p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.photo_uploader_appending.PhotoUploaderAppending;
import com.avito.android.lib.design.photo_uploader_image.PhotoUploaderImage;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/ExtendedProfileSetSelectionImageFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSetSelectionImageFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f151634E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f151635F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151636A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151637B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151638C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151639D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_selection_create.image.n f151640n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f151641o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f151642p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_selection_create.image.g f151643q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f151644r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f151645s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151646t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151647u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151648v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151649w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151650x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151651y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151652z0;

    /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/ExtendedProfileSetSelectionImageFragment$a;", "", "<init>", "()V", "", "ARGS", "Ljava/lang/String;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_selection_create/image/ExtendedProfileSetSelectionImageConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ExtendedProfileSetSelectionImageConfig> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileSetSelectionImageConfig invoke() {
            Bundle bundleRequireArguments = ExtendedProfileSetSelectionImageFragment.this.requireArguments();
            return (ExtendedProfileSetSelectionImageConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("extended_profile_set_selection_image.args", ExtendedProfileSetSelectionImageConfig.class) : bundleRequireArguments.getParcelable("extended_profile_set_selection_image.args"));
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment$onCreate$1", f = "ExtendedProfileSetSelectionImageFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151654q;

        /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJA/b;", "event", "Lkotlin/G0;", "emit", "(LJA/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151656b;

            public a(ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment) {
                this.f151656b = extendedProfileSetSelectionImageFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                JA.b bVar = (JA.b) obj;
                a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151656b;
                if (bVar instanceof b.c) {
                    com.avito.android.extended_profile_selection_create.image.g gVar = extendedProfileSetSelectionImageFragment.f151643q0;
                    (gVar != null ? gVar : null).b(((b.c) bVar).f8832a);
                } else if (bVar instanceof b.C0514b) {
                    com.avito.android.extended_profile_selection_create.image.g gVar2 = extendedProfileSetSelectionImageFragment.f151643q0;
                    (gVar2 != null ? gVar2 : null).a(((b.C0514b) bVar).f8831a);
                } else {
                    boolean z12 = bVar instanceof b.e;
                    C47313c c47313c = extendedProfileSetSelectionImageFragment.f151647u0;
                    if (z12) {
                        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                        kotlin.reflect.n<Object> nVar = ExtendedProfileSetSelectionImageFragment.f151635F0[1];
                        View view = (View) c47313c.a();
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.e) bVar).f8835a);
                        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                    } else if (bVar instanceof b.d) {
                        com.avito.android.extended_profile_ui_components.p pVar = com.avito.android.extended_profile_ui_components.p.f153373a;
                        kotlin.reflect.n<Object> nVar2 = ExtendedProfileSetSelectionImageFragment.f151635F0[1];
                        View view2 = (View) c47313c.a();
                        b.d dVar = (b.d) bVar;
                        Throwable th2 = dVar.f8833a;
                        ScreenPerformanceTracker screenPerformanceTracker = extendedProfileSetSelectionImageFragment.f151642p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        a.b bVar2 = dVar.f8834b;
                        com.avito.android.extended_profile_ui_components.p.c(pVar, view2, th2, screenPerformanceTracker, bVar2 != null ? new com.avito.android.extended_profile_selection_create.image.b(extendedProfileSetSelectionImageFragment, bVar2) : null);
                    } else if (bVar instanceof b.a) {
                        extendedProfileSetSelectionImageFragment.requireActivity().finish();
                    }
                }
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSetSelectionImageFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151654q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = ExtendedProfileSetSelectionImageFragment.this;
                com.avito.android.extended_profile_selection_create.image.m mVarS5 = extendedProfileSetSelectionImageFragment.s5();
                a aVar2 = new a(extendedProfileSetSelectionImageFragment);
                this.f151654q = 1;
                if (mVarS5.ke(aVar2, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment$onCreateView$1", f = "ExtendedProfileSetSelectionImageFragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151657q;

        /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment$onCreateView$1$1", f = "ExtendedProfileSetSelectionImageFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f151659q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151660r;

            /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment$onCreateView$1$1$1", f = "ExtendedProfileSetSelectionImageFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment$d$a$a, reason: collision with other inner class name */
            public static final class C4433a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f151661q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151662r;

                /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJA/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LJA/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment$d$a$a$a, reason: collision with other inner class name */
                public static final class C4434a extends N implements Y41.l<JA.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151663l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4434a(ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment) {
                        super(1);
                        this.f151663l = extendedProfileSetSelectionImageFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(JA.c cVar) {
                        JA.c cVar2 = cVar;
                        a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151663l;
                        boolean z12 = cVar2.f8840d;
                        Image image = cVar2.f8838b;
                        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = cVar2.f8839c;
                        boolean z13 = ((z12 || image == null) && imageFromPhotoPicker == null) ? false : true;
                        C47313c c47313c = extendedProfileSetSelectionImageFragment.f151648v0;
                        if (z13) {
                            kotlin.reflect.n<Object> nVar = ExtendedProfileSetSelectionImageFragment.f151635F0[2];
                            ((TextView) c47313c.a()).setText(R.string.extended_profile_set_selection_image_title);
                            if (z12 || image == null) {
                                s.c(extendedProfileSetSelectionImageFragment.r5(), imageFromPhotoPicker != null ? imageFromPhotoPicker.f226689j : null, true, null, null);
                            } else {
                                s.b(extendedProfileSetSelectionImageFragment.r5(), image, null, 30);
                            }
                        } else {
                            kotlin.reflect.n<Object> nVar2 = ExtendedProfileSetSelectionImageFragment.f151635F0[2];
                            ((TextView) c47313c.a()).setText(R.string.extended_profile_set_selection_image_empty_title);
                        }
                        C47313c c47313c2 = extendedProfileSetSelectionImageFragment.f151638C0;
                        kotlin.reflect.n<Object>[] nVarArr = ExtendedProfileSetSelectionImageFragment.f151635F0;
                        kotlin.reflect.n<Object> nVar3 = nVarArr[9];
                        ((View) c47313c2.a()).setVisibility(z13 ? 0 : 8);
                        C47313c c47313c3 = extendedProfileSetSelectionImageFragment.f151639D0;
                        kotlin.reflect.n<Object> nVar4 = nVarArr[10];
                        ((ImageView) c47313c3.a()).setVisibility(!z13 ? 0 : 8);
                        C47313c c47313c4 = extendedProfileSetSelectionImageFragment.f151650x0;
                        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
                        ((PhotoUploaderAppending) c47313c4.a()).setVisibility(!z13 ? 0 : 8);
                        C47313c c47313c5 = extendedProfileSetSelectionImageFragment.f151651y0;
                        kotlin.reflect.n<Object> nVar6 = nVarArr[5];
                        ((Button) c47313c5.a()).setVisibility(!z13 ? 0 : 8);
                        extendedProfileSetSelectionImageFragment.q5().setVisibility(z13 ? 0 : 8);
                        Button buttonQ5 = extendedProfileSetSelectionImageFragment.q5();
                        boolean z14 = cVar2.f8841e;
                        buttonQ5.setLoading(z14);
                        C47313c c47313c6 = extendedProfileSetSelectionImageFragment.f151652z0;
                        kotlin.reflect.n<Object> nVar7 = nVarArr[6];
                        ((Button) c47313c6.a()).setVisibility(z13 ? 0 : 8);
                        boolean z15 = !z14;
                        extendedProfileSetSelectionImageFragment.r5().setClickable(z15);
                        kotlin.reflect.n<Object> nVar8 = nVarArr[5];
                        ((Button) c47313c5.a()).setClickable(z15);
                        extendedProfileSetSelectionImageFragment.q5().setClickable(z15);
                        kotlin.reflect.n<Object> nVar9 = nVarArr[6];
                        ((Button) c47313c6.a()).setClickable(z15);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4433a(ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment, Continuation<? super C4433a> continuation) {
                    super(2, continuation);
                    this.f151662r = extendedProfileSetSelectionImageFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4433a(this.f151662r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4433a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f151661q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151662r;
                        n2<JA.c> state = extendedProfileSetSelectionImageFragment.s5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = extendedProfileSetSelectionImageFragment.f151642p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C4434a c4434a = new C4434a(extendedProfileSetSelectionImageFragment);
                        this.f151661q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c4434a, this) == coroutine_suspended) {
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
            public a(ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f151660r = extendedProfileSetSelectionImageFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f151660r, continuation);
                aVar.f151659q = obj;
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
                C43259k.d((T) this.f151659q, null, null, new C4433a(this.f151660r, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSetSelectionImageFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151657q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = ExtendedProfileSetSelectionImageFragment.this;
                a aVar = new a(extendedProfileSetSelectionImageFragment, null);
                this.f151657q = 1;
                if (C23056p0.b(extendedProfileSetSelectionImageFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJA/a;", "it", "Lkotlin/G0;", "invoke", "(LJA/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<JA.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JA.a aVar) {
            a aVar2 = ExtendedProfileSetSelectionImageFragment.f151634E0;
            ExtendedProfileSetSelectionImageFragment.this.s5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ExtendedProfileSetSelectionImageFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ExtendedProfileSetSelectionImageFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return ExtendedProfileSetSelectionImageFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f151668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f151668l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f151668l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileSetSelectionImageFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f151670l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f151670l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f151670l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151671l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151671l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f151671l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151672l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151672l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f151672l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_selection_create/image/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.extended_profile_selection_create.image.m> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_selection_create.image.m invoke() {
            com.avito.android.extended_profile_selection_create.image.n nVar = ExtendedProfileSetSelectionImageFragment.this.f151640n0;
            if (nVar == null) {
                nVar = null;
            }
            return (com.avito.android.extended_profile_selection_create.image.m) nVar.get();
        }
    }

    static {
        Y y12 = new Y(ExtendedProfileSetSelectionImageFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f151635F0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "contentView", "getContentView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "uploaderAppendingView", "getUploaderAppendingView()Lcom/avito/android/lib/design/photo_uploader_appending/PhotoUploaderAppending;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "skipButton", "getSkipButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "removeButton", "getRemoveButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "imageView", "getImageView()Lcom/avito/android/lib/design/photo_uploader_image/PhotoUploaderImage;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "imageViewContainer", "getImageViewContainer()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionImageFragment.class, "uploaderBoarderView", "getUploaderBoarderView()Landroid/widget/ImageView;", 0, n0Var)};
        f151634E0 = new a(null);
    }

    public ExtendedProfileSetSelectionImageFragment() {
        super(R.layout.extended_profile_set_selection_image_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        n0 n0Var = m0.f406844a;
        this.f151641o0 = new O0(n0Var.b(com.avito.android.extended_profile_selection_create.image.m.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f151644r0 = new O0(n0Var.b(HA.e.class), new f(), new h(), new g());
        this.f151645s0 = C42727D.c(new b());
        this.f151646t0 = new C47313c(null, 1, null);
        this.f151647u0 = new C47313c(null, 1, null);
        this.f151648v0 = new C47313c(null, 1, null);
        this.f151649w0 = new C47313c(null, 1, null);
        this.f151650x0 = new C47313c(null, 1, null);
        this.f151651y0 = new C47313c(null, 1, null);
        this.f151652z0 = new C47313c(null, 1, null);
        this.f151636A0 = new C47313c(null, 1, null);
        this.f151637B0 = new C47313c(null, 1, null);
        this.f151638C0 = new C47313c(null, 1, null);
        this.f151639D0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f151642p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.extended_profile_set_selection_image_nav_bar);
        C47313c c47313c = this.f151646t0;
        kotlin.reflect.n<Object>[] nVarArr = f151635F0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        ((NavBar) c47313c.a()).c(R.attr.ic_arrowBack24, new com.avito.android.extended_profile_selection_create.image.c(this));
        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
        NavBar.e((NavBar) c47313c.a(), getString(R.string.extended_profile_set_selection_image_nav_bar_title), R.attr.textM20, 4);
        View viewFindViewById = view.findViewById(R.id.extended_profile_set_selection_image_root);
        C47313c c47313c2 = this.f151647u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        c47313c2.b(this, viewFindViewById);
        TextView textView = (TextView) view.findViewById(R.id.extended_profile_set_selection_image_title);
        C47313c c47313c3 = this.f151648v0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[2];
        c47313c3.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.extended_profile_set_selection_image_description);
        C47313c c47313c4 = this.f151649w0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[3];
        c47313c4.b(this, textView2);
        PhotoUploaderAppending photoUploaderAppending = (PhotoUploaderAppending) view.findViewById(R.id.extended_profile_set_selection_image_photo_uploader_appending);
        C47313c c47313c5 = this.f151650x0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[4];
        c47313c5.b(this, photoUploaderAppending);
        kotlin.reflect.n<Object> nVar8 = nVarArr[4];
        final int i12 = 0;
        ((PhotoUploaderAppending) c47313c5.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.image.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151676c;

            {
                this.f151676c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151676c;
                switch (i12) {
                    case 0:
                        ExtendedProfileSetSelectionImageFragment.a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 1:
                        ExtendedProfileSetSelectionImageFragment.a aVar2 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 2:
                        ExtendedProfileSetSelectionImageFragment.a aVar3 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.b.f8825a);
                        break;
                    case 3:
                        ExtendedProfileSetSelectionImageFragment.a aVar4 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.e.f8828a);
                        break;
                    default:
                        ExtendedProfileSetSelectionImageFragment.a aVar5 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.C0513a.f8824a);
                        break;
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.extended_profile_set_selection_image_photo_uploader_boarder);
        C47313c c47313c6 = this.f151639D0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[10];
        c47313c6.b(this, imageView);
        PhotoUploaderImage photoUploaderImage = (PhotoUploaderImage) view.findViewById(R.id.extended_profile_set_selection_image_image);
        C47313c c47313c7 = this.f151637B0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[8];
        c47313c7.b(this, photoUploaderImage);
        final int i13 = 1;
        r5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.image.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151676c;

            {
                this.f151676c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151676c;
                switch (i13) {
                    case 0:
                        ExtendedProfileSetSelectionImageFragment.a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 1:
                        ExtendedProfileSetSelectionImageFragment.a aVar2 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 2:
                        ExtendedProfileSetSelectionImageFragment.a aVar3 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.b.f8825a);
                        break;
                    case 3:
                        ExtendedProfileSetSelectionImageFragment.a aVar4 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.e.f8828a);
                        break;
                    default:
                        ExtendedProfileSetSelectionImageFragment.a aVar5 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.C0513a.f8824a);
                        break;
                }
            }
        });
        r5().j();
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_set_selection_image_container);
        C47313c c47313c8 = this.f151638C0;
        kotlin.reflect.n<Object> nVar11 = nVarArr[9];
        c47313c8.b(this, viewFindViewById2);
        Button button = (Button) view.findViewById(R.id.extended_profile_set_selection_image_skip_button);
        C47313c c47313c9 = this.f151651y0;
        kotlin.reflect.n<Object> nVar12 = nVarArr[5];
        c47313c9.b(this, button);
        kotlin.reflect.n<Object> nVar13 = nVarArr[5];
        final int i14 = 2;
        ((Button) c47313c9.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.image.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151676c;

            {
                this.f151676c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151676c;
                switch (i14) {
                    case 0:
                        ExtendedProfileSetSelectionImageFragment.a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 1:
                        ExtendedProfileSetSelectionImageFragment.a aVar2 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 2:
                        ExtendedProfileSetSelectionImageFragment.a aVar3 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.b.f8825a);
                        break;
                    case 3:
                        ExtendedProfileSetSelectionImageFragment.a aVar4 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.e.f8828a);
                        break;
                    default:
                        ExtendedProfileSetSelectionImageFragment.a aVar5 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.C0513a.f8824a);
                        break;
                }
            }
        });
        Button button2 = (Button) view.findViewById(R.id.extended_profile_set_selection_image_remove_button);
        C47313c c47313c10 = this.f151652z0;
        kotlin.reflect.n<Object> nVar14 = nVarArr[6];
        c47313c10.b(this, button2);
        kotlin.reflect.n<Object> nVar15 = nVarArr[6];
        final int i15 = 3;
        ((Button) c47313c10.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.image.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151676c;

            {
                this.f151676c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151676c;
                switch (i15) {
                    case 0:
                        ExtendedProfileSetSelectionImageFragment.a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 1:
                        ExtendedProfileSetSelectionImageFragment.a aVar2 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 2:
                        ExtendedProfileSetSelectionImageFragment.a aVar3 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.b.f8825a);
                        break;
                    case 3:
                        ExtendedProfileSetSelectionImageFragment.a aVar4 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.e.f8828a);
                        break;
                    default:
                        ExtendedProfileSetSelectionImageFragment.a aVar5 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.C0513a.f8824a);
                        break;
                }
            }
        });
        Button button3 = (Button) view.findViewById(R.id.extended_profile_set_selection_image_continue_button);
        C47313c c47313c11 = this.f151636A0;
        kotlin.reflect.n<Object> nVar16 = nVarArr[7];
        c47313c11.b(this, button3);
        final int i16 = 4;
        q5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.image.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionImageFragment f151676c;

            {
                this.f151676c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment = this.f151676c;
                switch (i16) {
                    case 0:
                        ExtendedProfileSetSelectionImageFragment.a aVar = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 1:
                        ExtendedProfileSetSelectionImageFragment.a aVar2 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.f.f8829a);
                        break;
                    case 2:
                        ExtendedProfileSetSelectionImageFragment.a aVar3 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.b.f8825a);
                        break;
                    case 3:
                        ExtendedProfileSetSelectionImageFragment.a aVar4 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.e.f8828a);
                        break;
                    default:
                        ExtendedProfileSetSelectionImageFragment.a aVar5 = ExtendedProfileSetSelectionImageFragment.f151634E0;
                        extendedProfileSetSelectionImageFragment.s5().accept(a.C0513a.f8824a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker = this.f151642p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.extended_profile_selection_create.image.di.a.a().a(this, getResources(), (ExtendedProfileSetSelectionImageConfig) this.f151645s0.getValue(), ((HA.e) this.f151644r0.getValue()).f6972E, (com.avito.android.extended_profile_selection_create.select.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_selection_create.select.di.c.class), com.avito.android.analytics.screens.s.c(this), ExtendedProfileSetSelectionImageScreen.f151674d, this, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f151642p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final Button q5() {
        C47313c c47313c = this.f151636A0;
        kotlin.reflect.n<Object> nVar = f151635F0[7];
        return (Button) c47313c.a();
    }

    public final PhotoUploaderImage r5() {
        C47313c c47313c = this.f151637B0;
        kotlin.reflect.n<Object> nVar = f151635F0[8];
        return (PhotoUploaderImage) c47313c.a();
    }

    public final com.avito.android.extended_profile_selection_create.image.m s5() {
        return (com.avito.android.extended_profile_selection_create.image.m) this.f151641o0.getValue();
    }
}

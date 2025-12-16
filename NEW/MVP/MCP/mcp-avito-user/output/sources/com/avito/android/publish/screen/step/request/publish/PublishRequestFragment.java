package com.avito.android.publish.screen.step.request.publish;

import Cd.C13243a;
import Le0.InterfaceC14384a;
import Le0.InterfaceC14386c;
import Y41.p;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.photo_cache.q;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.publish.uploading_dialog.UploadingErrorFragment;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import l41.r;
import z1.AbstractC50339a;

/* compiled from: PublishRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/PublishRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/publish/uploading_dialog/a;", "Lcom/avito/android/ui/fragments/c;", "LId0/f;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishRequestFragment extends BaseFragment implements InterfaceC28477j.a, com.avito.android.publish.uploading_dialog.a, com.avito.android.ui.fragments.c, Id0.f {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final b f241833r0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.screen.step.request.publish.c f241834n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f241835o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f241836p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_cache.j f241837q0;

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/PublishRequestFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final TextView f241838a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ProgressBar f241839b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.progress_overlay.l f241840c;

        public a(@Y61.k TextView textView, @Y61.k ProgressBar progressBar, @Y61.k com.avito.android.progress_overlay.l lVar) {
            this.f241838a = textView;
            this.f241839b = progressBar;
            this.f241840c = lVar;
        }
    }

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/PublishRequestFragment$b;", "", "<init>", "()V", "", "ARG_DRAFT_ID", "Ljava/lang/String;", "", "ERROR_DIALOG_REQUEST_CODE", "I", "ERROR_DIALOG_TAG", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* compiled from: PublishRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f241841l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(1);
                this.f241841l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("arg_draft_id", this.f241841l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static PublishRequestFragment a(@Y61.k String str) {
            PublishRequestFragment publishRequestFragment = new PublishRequestFragment();
            C35966w1.a(publishRequestFragment, -1, new a(str));
            return publishRequestFragment;
        }

        public b() {
        }
    }

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = PublishRequestFragment.f241833r0;
            PublishRequestFragment.this.q5().accept(InterfaceC14384a.b.f10048a);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.PublishRequestFragment$onViewCreated$2", f = "PublishRequestFragment.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f241843q;

        /* compiled from: PublishRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.PublishRequestFragment$onViewCreated$2$1", f = "PublishRequestFragment.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f241845q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PublishRequestFragment f241846r;

            /* compiled from: PublishRequestFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "it", "", "test", "(Lcom/avito/android/photo_cache/q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.publish.screen.step.request.publish.PublishRequestFragment$d$a$a, reason: collision with other inner class name */
            public static final class C7244a<T> implements r {

                /* renamed from: b, reason: collision with root package name */
                public static final C7244a<T> f241847b = new C7244a<>();

                @Override // l41.r
                public final boolean test(Object obj) {
                    return ((q) obj) instanceof q.c;
                }
            }

            /* compiled from: PublishRequestFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/photo_cache/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class b<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PublishRequestFragment f241848b;

                public b(PublishRequestFragment publishRequestFragment) {
                    this.f241848b = publishRequestFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    b bVar = PublishRequestFragment.f241833r0;
                    this.f241848b.q5().accept(new InterfaceC14384a.e((q) obj));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PublishRequestFragment publishRequestFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f241846r = publishRequestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f241846r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f241845q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PublishRequestFragment publishRequestFragment = this.f241846r;
                    com.avito.android.photo_cache.j jVar = publishRequestFragment.f241837q0;
                    if (jVar == null) {
                        jVar = null;
                    }
                    InterfaceC43160i interfaceC43160iA = y.a(jVar.b().B0(C7244a.f241847b));
                    b bVar = new b(publishRequestFragment);
                    this.f241845q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(bVar, this) == coroutine_suspended) {
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

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return PublishRequestFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f241843q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                PublishRequestFragment publishRequestFragment = PublishRequestFragment.this;
                a aVar = new a(publishRequestFragment, null);
                this.f241843q = 1;
                if (C23056p0.b(publishRequestFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC14386c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14386c interfaceC14386c) {
            FragmentManager supportFragmentManager;
            PublishRequestFragment publishRequestFragment = (PublishRequestFragment) this.receiver;
            b bVar = PublishRequestFragment.f241833r0;
            publishRequestFragment.getClass();
            if (!L.f(interfaceC14386c, InterfaceC14386c.a.f10057a)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityC22955m activityC22955mL1 = publishRequestFragment.l1();
            if (activityC22955mL1 != null && (supportFragmentManager = activityC22955mL1.getSupportFragmentManager()) != null) {
                Fragment fragmentH = supportFragmentManager.H("photo_upload_error");
                DialogFragment dialogFragment = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
                if (dialogFragment != null) {
                    dialogFragment.dismissAllowingStateLoss();
                }
                UploadingErrorFragment uploadingErrorFragment = new UploadingErrorFragment();
                uploadingErrorFragment.setTargetFragment(publishRequestFragment, 4);
                uploadingErrorFragment.show(supportFragmentManager, "photo_upload_error");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLe0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LLe0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Le0.d, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f241850m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar) {
            super(1);
            this.f241850m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Le0.d dVar) {
            Le0.d dVar2 = dVar;
            b bVar = PublishRequestFragment.f241833r0;
            PublishRequestFragment publishRequestFragment = PublishRequestFragment.this;
            boolean z12 = dVar2.f10060a;
            a aVar = this.f241850m;
            com.avito.android.progress_overlay.l lVar = aVar.f241840c;
            if (z12) {
                lVar.k(null);
            } else {
                String str = dVar2.f10061b;
                if (str != null) {
                    lVar.a(str);
                } else {
                    ProgressBar progressBar = aVar.f241839b;
                    int i12 = dVar2.f10062c;
                    progressBar.setMax(i12);
                    int i13 = dVar2.f10063d;
                    progressBar.setProgress(i13);
                    aVar.f241838a.setText(publishRequestFragment.getString(R.string.photo_upload_info, Integer.valueOf(i13), Integer.valueOf(i12)));
                    lVar.j();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f241851l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f241851l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f241851l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PublishRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f241853l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f241853l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f241853l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f241854l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f241854l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f241854l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f241855l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f241855l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f241855l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PublishRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/screen/step/request/publish/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.publish.screen.step.request.publish.b> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.screen.step.request.publish.b invoke() {
            com.avito.android.publish.screen.step.request.publish.c cVar = PublishRequestFragment.this.f241834n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.publish.screen.step.request.publish.b) cVar.get();
        }
    }

    public PublishRequestFragment() {
        super(R.layout.publish_advert_request_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f241835o0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.step.request.publish.b.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // com.avito.android.publish.uploading_dialog.a
    public final void V2() {
        q5().accept(InterfaceC14384a.d.f10050a);
    }

    @Override // com.avito.android.publish.uploading_dialog.a
    public final void Y0() {
        q5().accept(InterfaceC14384a.c.f10049a);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(InterfaceC14384a.C0621a.f10047a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.image_upload_info);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_indicator);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f241836p0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.image_upload_content, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_confirm_progress_overlay, 0, 16, null);
        a aVar = new a(textView, progressBar, lVar);
        lVar.f231600j = new c();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(null), 3);
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new e(1, this, PublishRequestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/step/request/publish/mvi/entity/PublishRequestOneTimeEvent;)V", 0), new f(aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String string = requireArguments().getString("arg_draft_id");
        if (string == null) {
            string = "";
        }
        com.avito.android.publish.screen.step.request.publish.di.a.a().a((com.avito.android.publish.screen.step.request.publish.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.request.publish.di.c.class), new C33930m(string)).a(this);
    }

    public final com.avito.android.publish.screen.step.request.publish.b q5() {
        return (com.avito.android.publish.screen.step.request.publish.b) this.f241835o0.getValue();
    }
}

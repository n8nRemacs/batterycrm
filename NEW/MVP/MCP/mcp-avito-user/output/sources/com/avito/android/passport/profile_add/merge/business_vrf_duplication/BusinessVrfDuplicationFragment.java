package com.avito.android.passport.profile_add.merge.business_vrf_duplication;

import Cd.C13243a;
import Z50.a;
import Z50.b;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.m;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.Flow;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.o;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import dagger.internal.u;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: BusinessVrfDuplicationFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/BusinessVrfDuplicationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BusinessVrfDuplicationFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f212459D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f212460E0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212461A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212462B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212463C0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f212464n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f212465o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212466p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f212467q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f212468r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f212469s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212470t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212471u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212472v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212473w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212474x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212475y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212476z0;

    /* compiled from: BusinessVrfDuplicationFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/BusinessVrfDuplicationFragment$a;", "", "<init>", "()V", "", "ARGS_VRF_CREATE", "Ljava/lang/String;", "ARGS_VRF_MERGE", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BusinessVrfDuplicationFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.business_vrf_duplication.BusinessVrfDuplicationFragment$a$a, reason: collision with other inner class name */
        public static final class C6349a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ BusinessVrfDuplication f212477l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6349a(BusinessVrfDuplication businessVrfDuplication) {
                super(1);
                this.f212477l = businessVrfDuplication;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("profile_add.merge.business_vrf_duplication.vrf", this.f212477l);
                return G0.f406611a;
            }
        }

        /* compiled from: BusinessVrfDuplicationFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f212478l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f212478l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("profile_add.create.business_vrf_duplication.vrf", this.f212478l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BusinessVrfDuplicationFragment a(@Y61.k BusinessVrfDuplication businessVrfDuplication) {
            BusinessVrfDuplicationFragment businessVrfDuplicationFragment = new BusinessVrfDuplicationFragment();
            C35966w1.a(businessVrfDuplicationFragment, -1, new C6349a(businessVrfDuplication));
            return businessVrfDuplicationFragment;
        }

        @Y61.k
        public static BusinessVrfDuplicationFragment b(@Y61.k String str) {
            BusinessVrfDuplicationFragment businessVrfDuplicationFragment = new BusinessVrfDuplicationFragment();
            C35966w1.a(businessVrfDuplicationFragment, -1, new b(str));
            return businessVrfDuplicationFragment;
        }

        public a() {
        }
    }

    /* compiled from: BusinessVrfDuplicationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            Bundle arguments = BusinessVrfDuplicationFragment.this.getArguments();
            if (arguments != null) {
                return arguments.getString("profile_add.create.business_vrf_duplication.vrf");
            }
            return null;
        }
    }

    /* compiled from: BusinessVrfDuplicationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Z50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Z50.b bVar) {
            Z50.b bVar2 = bVar;
            BusinessVrfDuplicationFragment businessVrfDuplicationFragment = (BusinessVrfDuplicationFragment) this.receiver;
            a aVar = BusinessVrfDuplicationFragment.f212459D0;
            businessVrfDuplicationFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.passport.profile_add.merge.b.a(businessVrfDuplicationFragment.requireActivity());
            } else if (bVar2 instanceof b.C1419b) {
                ActivityC22955m activityC22955mRequireActivity = businessVrfDuplicationFragment.requireActivity();
                activityC22955mRequireActivity.setResult(-1);
                com.avito.android.passport.profile_add.merge.b.a(activityC22955mRequireActivity);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BusinessVrfDuplicationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ50/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LZ50/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Z50.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Z50.c cVar) {
            Uri uri;
            Image singleImage;
            Z50.c cVar2 = cVar;
            a aVar = BusinessVrfDuplicationFragment.f212459D0;
            BusinessVrfDuplicationFragment businessVrfDuplicationFragment = BusinessVrfDuplicationFragment.this;
            if (cVar2.f19882b) {
                businessVrfDuplicationFragment.r5().k(null);
            } else {
                String str = cVar2.f19884d;
                if (str != null) {
                    businessVrfDuplicationFragment.r5().a(str);
                } else {
                    Z50.d dVar = cVar2.f19883c;
                    if (dVar != null) {
                        businessVrfDuplicationFragment.r5().j();
                        C47313c c47313c = businessVrfDuplicationFragment.f212471u0;
                        n<Object>[] nVarArr = BusinessVrfDuplicationFragment.f212460E0;
                        n<Object> nVar = nVarArr[1];
                        I5.a((TextView) c47313c.a(), dVar.f19888d, false);
                        C47313c c47313c2 = businessVrfDuplicationFragment.f212472v0;
                        n<Object> nVar2 = nVarArr[2];
                        com.avito.android.util.text.j.a((TextView) c47313c2.a(), dVar.f19890f, null);
                        Flow flow = Flow.f212550b;
                        Flow flow2 = dVar.f19892h;
                        C47313c c47313c3 = businessVrfDuplicationFragment.f212470t0;
                        if (flow2 == flow) {
                            businessVrfDuplicationFragment.r5().f231600j = new com.avito.android.passport.profile_add.merge.business_vrf_duplication.c(businessVrfDuplicationFragment);
                            D6.w(businessVrfDuplicationFragment.q5());
                            n<Object> nVar3 = nVarArr[0];
                            ((NavBar) c47313c3.a()).c(R.attr.ic_close24, new com.avito.android.passport.profile_add.merge.business_vrf_duplication.d(businessVrfDuplicationFragment));
                        } else {
                            n<Object> nVar4 = nVarArr[0];
                            NavBar navBar = (NavBar) c47313c3.a();
                            com.avito.android.passport.profile_add.merge.business_vrf_duplication.e eVar = new com.avito.android.passport.profile_add.merge.business_vrf_duplication.e(businessVrfDuplicationFragment);
                            int i12 = NavBar.f179818g;
                            navBar.c(R.attr.ic_arrowBack24, eVar);
                        }
                        C47313c c47313c4 = businessVrfDuplicationFragment.f212474x0;
                        n<Object> nVar5 = nVarArr[4];
                        I5.a((TextView) c47313c4.a(), dVar.f19885a, false);
                        C47313c c47313c5 = businessVrfDuplicationFragment.f212475y0;
                        n<Object> nVar6 = nVarArr[5];
                        I5.a((TextView) c47313c5.a(), dVar.f19886b, false);
                        C47313c c47313c6 = businessVrfDuplicationFragment.f212476z0;
                        n<Object> nVar7 = nVarArr[6];
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) c47313c6.a();
                        PassportListAvatar passportListAvatar = dVar.f19887c;
                        C35949t5.c(simpleDraweeView, (passportListAvatar == null || (uri = passportListAvatar.getUri()) == null || (singleImage = ImageKt.toSingleImage(uri)) == null) ? null : com.avito.android.image_loader.b.b(singleImage), null, null, null, 14);
                        n<Object> nVar8 = nVarArr[6];
                        C29574b.a((SimpleDraweeView) c47313c6.a());
                        com.avito.konveyor.adapter.a aVar2 = businessVrfDuplicationFragment.f212468r0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        aVar2.c(new UV0.c(dVar.f19891g));
                        com.avito.konveyor.adapter.j jVar = businessVrfDuplicationFragment.f212467q0;
                        (jVar != null ? jVar : null).notifyDataSetChanged();
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BusinessVrfDuplicationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/o;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<o, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            o oVar2 = oVar;
            a aVar = BusinessVrfDuplicationFragment.f212459D0;
            ((com.avito.android.passport.profile_add.merge.business_vrf_duplication.k) BusinessVrfDuplicationFragment.this.f212465o0.getValue()).accept(new a.c(oVar2.f212574a, oVar2.f212575b));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f212482l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f212482l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212482l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BusinessVrfDuplicationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f212484l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f212484l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212484l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212485l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212485l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212485l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212486l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212486l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212486l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BusinessVrfDuplicationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.passport.profile_add.merge.business_vrf_duplication.k> {
        public k() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final com.avito.android.passport.profile_add.merge.business_vrf_duplication.k invoke() {
            u uVar = BusinessVrfDuplicationFragment.this.f212464n0;
            if (uVar == null) {
                uVar = null;
            }
            return (com.avito.android.passport.profile_add.merge.business_vrf_duplication.k) uVar.get();
        }
    }

    static {
        Y y12 = new Y(BusinessVrfDuplicationFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f212460E0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "description", "getDescription()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "profileView", "getProfileView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "profileTitle", "getProfileTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "profileName", "getProfileName()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "profileAvatar", "getProfileAvatar()Lcom/facebook/drawee/view/SimpleDraweeView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "profileCheckmark", "getProfileCheckmark()Lcom/avito/android/lib/design/toggle/Checkmark;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "actionsList", "getActionsList()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BusinessVrfDuplicationFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f212459D0 = new a(null);
    }

    public BusinessVrfDuplicationFragment() {
        super(R.layout.passport_business_vrf_duplication_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f212465o0 = new O0(m0.f406844a.b(com.avito.android.passport.profile_add.merge.business_vrf_duplication.k.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f212469s0 = C42727D.c(new b());
        this.f212470t0 = new C47313c(null, 1, null);
        this.f212471u0 = new C47313c(null, 1, null);
        this.f212472v0 = new C47313c(null, 1, null);
        this.f212473w0 = new C47313c(null, 1, null);
        this.f212474x0 = new C47313c(null, 1, null);
        this.f212475y0 = new C47313c(null, 1, null);
        this.f212476z0 = new C47313c(null, 1, null);
        this.f212461A0 = new C47313c(null, 1, null);
        this.f212462B0 = new C47313c(null, 1, null);
        this.f212463C0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212466p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f212466p0;
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.passport.profile_add.merge.business_vrf_duplication.k) this.f212465o0.getValue(), new c(1, this, BusinessVrfDuplicationFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationOneTimeEvent;)V", 0), new d());
        return viewOnCreateView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.passport_business_vrf_duplication_root), 0, null, 0, 0, 30, null);
        C47313c c47313c = this.f212463C0;
        n<Object>[] nVarArr = f212460E0;
        n<Object> nVar = nVarArr[9];
        c47313c.b(this, lVar);
        NavBar navBar = (NavBar) view.findViewById(R.id.passport_business_vrf_duplication_nav_bar);
        C47313c c47313c2 = this.f212470t0;
        n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, navBar);
        TextView textView = (TextView) view.findViewById(R.id.passport_business_vrf_duplication_title);
        C47313c c47313c3 = this.f212471u0;
        n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.passport_business_vrf_duplication_description);
        C47313c c47313c4 = this.f212472v0;
        n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, textView2);
        View viewFindViewById = view.findViewById(R.id.passport_business_vrf_duplication_profile);
        C47313c c47313c5 = this.f212473w0;
        n<Object> nVar5 = nVarArr[3];
        c47313c5.b(this, viewFindViewById);
        TextView textView3 = (TextView) q5().findViewById(R.id.passport_profile_list_item_type);
        C47313c c47313c6 = this.f212474x0;
        n<Object> nVar6 = nVarArr[4];
        c47313c6.b(this, textView3);
        TextView textView4 = (TextView) q5().findViewById(R.id.passport_profile_list_item_name);
        C47313c c47313c7 = this.f212475y0;
        n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, textView4);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) q5().findViewById(R.id.passport_profile_list_item_avatar);
        C47313c c47313c8 = this.f212476z0;
        n<Object> nVar8 = nVarArr[6];
        c47313c8.b(this, simpleDraweeView);
        Checkmark checkmark = (Checkmark) q5().findViewById(R.id.passport_profile_list_item_current_check);
        C47313c c47313c9 = this.f212461A0;
        n<Object> nVar9 = nVarArr[7];
        c47313c9.b(this, checkmark);
        n<Object> nVar10 = nVarArr[7];
        ((Checkmark) c47313c9.a()).setChecked(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.passport_business_vrf_duplication_actions);
        C47313c c47313c10 = this.f212462B0;
        n<Object> nVar11 = nVarArr[8];
        c47313c10.b(this, recyclerView);
        n<Object> nVar12 = nVarArr[8];
        RecyclerView recyclerView2 = (RecyclerView) c47313c10.a();
        com.avito.konveyor.adapter.j jVar = this.f212467q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f212466p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        BusinessVrfDuplication businessVrfDuplication;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new m.c();
        InterfaceC42726C interfaceC42726C = this.f212469s0;
        boolean z12 = ((String) interfaceC42726C.getValue()) != null;
        Bundle arguments = getArguments();
        if (arguments != null) {
            businessVrfDuplication = (BusinessVrfDuplication) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("profile_add.merge.business_vrf_duplication.vrf", BusinessVrfDuplication.class) : arguments.getParcelable("profile_add.merge.business_vrf_duplication.vrf"));
        } else {
            businessVrfDuplication = null;
        }
        m.b bVar = new m.b((com.avito.android.passport.profile_add.merge.business_vrf_duplication.b) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.merge.business_vrf_duplication.b.class), cv.c.b(this), Boolean.valueOf(z12), businessVrfDuplication, new e(), s.c(this), (String) interfaceC42726C.getValue(), null);
        this.f212464n0 = bVar.f212521o;
        this.f212466p0 = bVar.f212516j.get();
        this.f212467q0 = bVar.f212527u.get();
        this.f212468r0 = bVar.f212526t.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f212466p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final View q5() {
        C47313c c47313c = this.f212473w0;
        n<Object> nVar = f212460E0[3];
        return (View) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l r5() {
        C47313c c47313c = this.f212463C0;
        n<Object> nVar = f212460E0[9];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}

package com.avito.android.publish.screen.step.request.mergedpretendpremoderation;

import Cd.C13243a;
import Id0.InterfaceC14062b;
import Ke0.InterfaceC14307a;
import Ke0.InterfaceC14309c;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.publish.premoderation.AdvertDuplicateFragment;
import com.avito.android.publish.premoderation.p;
import com.avito.android.publish.screen.wrongcategory.WrongCategoryFragment;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: MergedPretendPremoderationFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/MergedPretendPremoderationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/publish/premoderation/a;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "Companion", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MergedPretendPremoderationFragment extends BaseFragment implements com.avito.android.ui.fragments.c, com.avito.android.publish.premoderation.a, InterfaceC14062b, InterfaceC28477j.a {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final Companion f241715s0 = new Companion(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.screen.step.request.mergedpretendpremoderation.c f241716n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f241717o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f241718p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public Q1 f241719q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f241720r0;

    /* compiled from: MergedPretendPremoderationFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/MergedPretendPremoderationFragment$Companion;", "", "<init>", "()V", "", "KEY_STRATEGY", "Ljava/lang/String;", "", "REQ_ADVERT_DUPLICATE_DIALOG", "I", "TAG_ADVERT_DUPLICATE_DIALOG", "Strategy", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MergedPretendPremoderationFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/MergedPretendPremoderationFragment$Companion$Strategy;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Strategy {

            /* renamed from: b, reason: collision with root package name */
            public static final Strategy f241721b;

            /* renamed from: c, reason: collision with root package name */
            public static final Strategy f241722c;

            /* renamed from: d, reason: collision with root package name */
            public static final Strategy f241723d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Strategy[] f241724e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f241725f;

            static {
                Strategy strategy = new Strategy("PRETEND", 0);
                f241721b = strategy;
                Strategy strategy2 = new Strategy("PREMODERATION", 1);
                f241722c = strategy2;
                Strategy strategy3 = new Strategy("BOTH", 2);
                f241723d = strategy3;
                Strategy[] strategyArr = {strategy, strategy2, strategy3};
                f241724e = strategyArr;
                f241725f = kotlin.enums.c.a(strategyArr);
            }

            public Strategy() {
                throw null;
            }

            public static Strategy valueOf(String str) {
                return (Strategy) Enum.valueOf(Strategy.class, str);
            }

            public static Strategy[] values() {
                return (Strategy[]) f241724e.clone();
            }
        }

        /* compiled from: MergedPretendPremoderationFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Strategy f241726l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Strategy strategy) {
                super(1);
                this.f241726l = strategy;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putSerializable("key.strategy", this.f241726l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public static MergedPretendPremoderationFragment a(@k Strategy strategy) {
            MergedPretendPremoderationFragment mergedPretendPremoderationFragment = new MergedPretendPremoderationFragment();
            C35966w1.a(mergedPretendPremoderationFragment, -1, new a(strategy));
            return mergedPretendPremoderationFragment;
        }

        public Companion() {
        }
    }

    /* compiled from: MergedPretendPremoderationFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/MergedPretendPremoderationFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.progress_overlay.l f241727a;

        public a(@k com.avito.android.progress_overlay.l lVar) {
            this.f241727a = lVar;
        }
    }

    /* compiled from: MergedPretendPremoderationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Companion companion = MergedPretendPremoderationFragment.f241715s0;
            MergedPretendPremoderationFragment.this.q5().accept(InterfaceC14307a.e.f9577a);
            return G0.f406611a;
        }
    }

    /* compiled from: MergedPretendPremoderationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<InterfaceC14309c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14309c interfaceC14309c) {
            Fragment fragmentA;
            FragmentManager supportFragmentManager;
            InterfaceC14309c interfaceC14309c2 = interfaceC14309c;
            MergedPretendPremoderationFragment mergedPretendPremoderationFragment = (MergedPretendPremoderationFragment) this.receiver;
            Companion companion = MergedPretendPremoderationFragment.f241715s0;
            mergedPretendPremoderationFragment.getClass();
            if (interfaceC14309c2 instanceof InterfaceC14309c.b) {
                InterfaceC14309c.b bVar = (InterfaceC14309c.b) interfaceC14309c2;
                ActivityC22955m activityC22955mL1 = mergedPretendPremoderationFragment.l1();
                if (activityC22955mL1 != null && (supportFragmentManager = activityC22955mL1.getSupportFragmentManager()) != null) {
                    AdvertDuplicateFragment advertDuplicateFragmentA = com.avito.android.publish.premoderation.b.a(bVar.f9586a);
                    advertDuplicateFragmentA.setTargetFragment(mergedPretendPremoderationFragment, 4);
                    advertDuplicateFragmentA.show(supportFragmentManager, "tag_advert_duplicate_dialog");
                }
            } else if (interfaceC14309c2 instanceof InterfaceC14309c.C0588c) {
                InterfaceC14309c.C0588c c0588c = (InterfaceC14309c.C0588c) interfaceC14309c2;
                Q1 q12 = mergedPretendPremoderationFragment.f241719q0;
                if (q12 == null) {
                    q12 = null;
                }
                q12.getClass();
                n<Object> nVar = Q1.f67448x0[32];
                boolean zBooleanValue = ((Boolean) q12.f67455G.a().invoke()).booleanValue();
                AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = c0588c.f9587a;
                if (zBooleanValue) {
                    WrongCategoryFragment.f242558s0.getClass();
                    fragmentA = WrongCategoryFragment.b.a(wrongCategorySuggest);
                } else {
                    fragmentA = p.a(wrongCategorySuggest);
                }
                androidx.fragment.app.H hE2 = mergedPretendPremoderationFragment.getChildFragmentManager().e();
                hE2.n(R.id.progress_overlay_container, fragmentA, null);
                hE2.c(null);
                hE2.e();
            } else {
                if (!(interfaceC14309c2 instanceof InterfaceC14309c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC14309c.a aVar = (InterfaceC14309c.a) interfaceC14309c2;
                ActivityC22955m activityC22955mL12 = mergedPretendPremoderationFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = mergedPretendPremoderationFragment.f241720r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, aVar.f9584a, null, aVar.f9585b, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MergedPretendPremoderationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKe0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LKe0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<Ke0.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f241729l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MergedPretendPremoderationFragment mergedPretendPremoderationFragment, a aVar) {
            super(1);
            this.f241729l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Ke0.d dVar) {
            Ke0.d dVar2 = dVar;
            Companion companion = MergedPretendPremoderationFragment.f241715s0;
            boolean z12 = dVar2.f9590b;
            com.avito.android.progress_overlay.l lVar = this.f241729l.f241727a;
            if (z12) {
                lVar.k(null);
            } else {
                String str = dVar2.f9591c;
                if (str == null || str.length() == 0) {
                    lVar.j();
                } else {
                    lVar.a(str);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f241730l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f241730l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f241730l);
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
            return MergedPretendPremoderationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f241732l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f241732l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f241732l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f241733l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f241733l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f241733l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f241734l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f241734l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f241734l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: MergedPretendPremoderationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.publish.screen.step.request.mergedpretendpremoderation.b> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.screen.step.request.mergedpretendpremoderation.b invoke() {
            com.avito.android.publish.screen.step.request.mergedpretendpremoderation.c cVar = MergedPretendPremoderationFragment.this.f241716n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.publish.screen.step.request.mergedpretendpremoderation.b) cVar.get();
        }
    }

    public MergedPretendPremoderationFragment() {
        super(R.layout.loading_progress_overlay_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f241717o0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.step.request.mergedpretendpremoderation.b.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.publish.premoderation.a
    public final void H0() {
        q5().accept(InterfaceC14307a.d.f9576a);
    }

    @Override // com.avito.android.publish.premoderation.a
    public final void Q1() {
        q5().accept(InterfaceC14307a.c.f9575a);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(InterfaceC14307a.C0586a.f9573a);
        return true;
    }

    @Override // com.avito.android.publish.premoderation.a
    public final void n3(@k DeepLink deepLink) {
        q5().accept(new InterfaceC14307a.b(deepLink));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f241718p0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.progress_overlay_container, interfaceC28373a2, R.layout.publish_progress_overlay, 0, 16, null);
        a aVar = new a(lVar);
        lVar.f231600j = new b();
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, MergedPretendPremoderationFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/mvi/entity/MergedPretendPremoderationOneTimeEvent;)V", 0), new d(this, aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.a.a().a((com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.c.class), cv.c.b(this), (Companion.Strategy) requireArguments().getSerializable("key.strategy")).a(this);
    }

    public final com.avito.android.publish.screen.step.request.mergedpretendpremoderation.b q5() {
        return (com.avito.android.publish.screen.step.request.mergedpretendpremoderation.b) this.f241717o0.getValue();
    }
}

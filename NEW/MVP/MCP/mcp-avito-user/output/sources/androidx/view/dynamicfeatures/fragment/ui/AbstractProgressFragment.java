package androidx.view.dynamicfeatures.fragment.ui;

import L91.o;
import Y61.k;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23040h0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.dynamicfeatures.l;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.h;
import com.avito.android.R;
import com.google.android.play.core.splitinstall.AbstractC37204f;
import com.google.android.play.core.splitinstall.InterfaceC37201c;
import i.b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: AbstractProgressFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "b", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractProgressFragment extends Fragment {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f53061k0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53062f0;

    /* renamed from: g0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53063g0;

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53064h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f53065i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final h<IntentSenderRequest> f53066j0;

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment$a;", "", "<init>", "()V", "", "INSTALL_REQUEST_CODE", "I", "", "TAG", "Ljava/lang/String;", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment$b;", "Landroidx/lifecycle/h0;", "Lcom/google/android/play/core/splitinstall/f;", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements InterfaceC23040h0<AbstractC37204f> {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final l f53067b;

        public b(@k l lVar) {
            this.f53067b = lVar;
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(AbstractC37204f abstractC37204f) {
            AbstractC37204f abstractC37204f2 = abstractC37204f;
            boolean zD2 = abstractC37204f2.d();
            l lVar = this.f53067b;
            if (zD2) {
                lVar.f53099a.removeObserver(this);
            }
            int i12 = abstractC37204f2.i();
            AbstractProgressFragment abstractProgressFragment = AbstractProgressFragment.this;
            switch (i12) {
                case 0:
                    abstractProgressFragment.d5();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 9:
                    abstractProgressFragment.e5(abstractC37204f2.a(), abstractC37204f2.j());
                    break;
                case 5:
                    abstractProgressFragment.b5();
                    break;
                case 6:
                    abstractProgressFragment.d5();
                    break;
                case 7:
                    abstractProgressFragment.c5();
                    break;
                case 8:
                    try {
                        InterfaceC37201c interfaceC37201c = lVar.f53102d;
                        if (interfaceC37201c == null) {
                            abstractProgressFragment.d5();
                        } else {
                            interfaceC37201c.d(abstractC37204f2, new Ae0.c(abstractProgressFragment, 15));
                        }
                        break;
                    } catch (IntentSender.SendIntentException unused) {
                        abstractProgressFragment.d5();
                        return;
                    }
            }
        }
    }

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Bundle> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Bundle invoke() {
            return AbstractProgressFragment.this.requireArguments().getBundle("dfn:destinationArgs");
        }
    }

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(AbstractProgressFragment.this.requireArguments().getInt("dfn:destinationId"));
        }
    }

    /* compiled from: AbstractProgressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/b;", "invoke", "()Landroidx/navigation/dynamicfeatures/fragment/ui/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends N implements Y41.a<androidx.view.dynamicfeatures.fragment.ui.b> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.view.dynamicfeatures.fragment.ui.b invoke() {
            AbstractProgressFragment abstractProgressFragment = AbstractProgressFragment.this;
            S0 f42820b = abstractProgressFragment.getF42820b();
            androidx.view.dynamicfeatures.fragment.ui.b.f53078J.getClass();
            return (androidx.view.dynamicfeatures.fragment.ui.b) new P0(f42820b, androidx.view.dynamicfeatures.fragment.ui.b.f53079K, abstractProgressFragment.getDefaultViewModelCreationExtras()).a(androidx.view.dynamicfeatures.fragment.ui.b.class);
        }
    }

    static {
        new a(null);
    }

    public AbstractProgressFragment() {
        this.f53062f0 = C42727D.c(new e());
        this.f53063g0 = C42727D.c(new d());
        this.f53064h0 = C42727D.c(new c());
        this.f53066j0 = registerForActivityResult(new b.n(), new o(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b5() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment.b5():void");
    }

    public abstract void c5();

    public abstract void d5();

    public abstract void e5(long j12, long j13);

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f53065i0 = bundle.getBoolean("dfn:navigated", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("dfn:navigated", this.f53065i0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        if (this.f53065i0) {
            androidx.view.fragment.e.a(this).p();
            return;
        }
        InterfaceC42726C interfaceC42726C = this.f53062f0;
        l lVar = ((androidx.view.dynamicfeatures.fragment.ui.b) interfaceC42726C.getValue()).f53080E;
        if (lVar == null) {
            b5();
            lVar = ((androidx.view.dynamicfeatures.fragment.ui.b) interfaceC42726C.getValue()).f53080E;
        }
        if (lVar != null) {
            lVar.f53099a.observe(getViewLifecycleOwner(), new b(lVar));
        }
    }

    public AbstractProgressFragment(int i12) {
        super(R.layout.dynamic_feature_install_fragment);
        this.f53062f0 = C42727D.c(new e());
        this.f53063g0 = C42727D.c(new d());
        this.f53064h0 = C42727D.c(new c());
        this.f53066j0 = registerForActivityResult(new b.n(), new o((DefaultProgressFragment) this, 4));
    }
}

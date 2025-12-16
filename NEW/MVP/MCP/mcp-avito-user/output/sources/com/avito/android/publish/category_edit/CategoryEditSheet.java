package com.avito.android.publish.category_edit;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.publish.category_edit.di.a;
import com.avito.android.publish.category_edit.i;
import com.avito.android.publish.category_edit.k;
import com.avito.android.publish.drafts.K;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.util.C35966w1;
import com.avito.android.util.p6;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryEditSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/category_edit/CategoryEditSheet;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CategoryEditSheet extends DialogFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f232325n0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.category_edit.di.d f232326f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public k f232327g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public K f232328h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f232329i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f232330j0;

    /* renamed from: k0, reason: collision with root package name */
    public ViewSwitcher f232331k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.avito.android.publish.screen.step.wizard.b f232332l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232333m0 = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CategoryEditSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/category_edit/CategoryEditSheet$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CategoryEditSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.category_edit.CategoryEditSheet$a$a, reason: collision with other inner class name */
        public static final class C7063a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f232334l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Navigation f232335m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7063a(Navigation navigation2, String str) {
                super(1);
                this.f232334l = str;
                this.f232335m = navigation2;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("item_id", this.f232334l);
                bundle2.putParcelable("navigation", this.f232335m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CategoryEditSheet a(@Y61.k Navigation navigation2, @Y61.l String str) {
            CategoryEditSheet categoryEditSheet = new CategoryEditSheet();
            C35966w1.a(categoryEditSheet, -1, new C7063a(navigation2, str));
            return categoryEditSheet;
        }

        public a() {
        }
    }

    /* compiled from: CategoryEditSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[NavigationButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationButtonType navigationButtonType = NavigationButtonType.f232336b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CategoryEditSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            CategoryEditSheet categoryEditSheet = (CategoryEditSheet) this.receiver;
            a aVar = CategoryEditSheet.f232325n0;
            categoryEditSheet.getClass();
            categoryEditSheet.f232330j0 = view2.findViewById(R.id.category_edit_skeleton_root);
            categoryEditSheet.f232331k0 = (ViewSwitcher) view2.findViewById(R.id.categories_lists);
            RecyclerView.t tVar = new RecyclerView.t();
            ViewSwitcher viewSwitcher = categoryEditSheet.f232331k0;
            if (viewSwitcher == null) {
                viewSwitcher = null;
            }
            p6 p6Var = new p6(viewSwitcher);
            while (p6Var.hasNext()) {
                ((RecyclerView) ((View) p6Var.next())).setRecycledViewPool(tVar);
            }
            return G0.f406611a;
        }
    }

    public static final void b5(CategoryEditSheet categoryEditSheet, com.avito.android.lib.design.bottom_sheet.d dVar, NavigationButtonType navigationButtonType) {
        int iOrdinal = navigationButtonType.ordinal();
        if (iOrdinal == 0) {
            dVar.y(R.drawable.ic_close_24);
            dVar.R(new d(dVar));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            dVar.y(R.drawable.ic_back_24);
            dVar.R(new e(categoryEditSheet));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        this.f232332l0 = (com.avito.android.publish.screen.step.wizard.b) requireActivity();
        String string = requireArguments().getString("item_id");
        Navigation navigation2 = (Navigation) requireArguments().getParcelable("navigation");
        a.InterfaceC7064a interfaceC7064aA = com.avito.android.publish.category_edit.di.j.a();
        interfaceC7064aA.a(this);
        interfaceC7064aA.c((com.avito.android.publish.category_edit.di.b) C29972i.a(C29972i.b(this), com.avito.android.publish.category_edit.di.b.class));
        interfaceC7064aA.b(navigation2);
        interfaceC7064aA.e(string);
        interfaceC7064aA.build().a(this);
        k kVar = this.f232327g0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f232395N.setValue(k.a.c.f232402a);
        WizardParameter wizardParameter = kVar.f232396O;
        if (wizardParameter != null) {
            kVar.le(wizardParameter, CategoriesListMove.f232320b);
        } else {
            kVar.f232394M.b(z.u(kVar.f232390E.a().s(kVar.f232392K.e()), new l(kVar), new m(kVar)));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.CategoryEditDialog);
        dVar.C(R.layout.category_edit_sheet, new c(1, this, CategoryEditSheet.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, "", true, true, 2);
        dVar.setCancelable(true);
        dVar.T();
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.N(true);
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 27));
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        k kVar = this.f232327g0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f232395N.observe(this, new i.a(new f(this, dVar)));
        Set<TV0.d<?, ?>> set = this.f232329i0;
        if (set == null) {
            set = null;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar2 = (TV0.d) it.next();
            if (dVar2 instanceof com.avito.android.blueprints.publish.checkable.d) {
                io.reactivex.rxjava3.core.z<String> zVarD = ((com.avito.android.blueprints.publish.checkable.d) dVar2).d();
                k kVar2 = this.f232327g0;
                this.f232333m0.b(A1.h(zVarD, h.f232388l, new g(1, kVar2 != null ? kVar2 : null, k.class, "onItemClicked", "onItemClicked(Ljava/lang/String;)V", 0), 2));
            }
        }
        return dVar;
    }
}

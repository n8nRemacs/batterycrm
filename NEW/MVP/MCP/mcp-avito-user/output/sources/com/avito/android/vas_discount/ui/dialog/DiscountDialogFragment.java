package com.avito.android.vas_discount.ui.dialog;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.vas_discount.di.g;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import com.avito.android.vas_discount.ui.dialog.DiscountDialogFragment;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import nL0.C44290a;

/* compiled from: DiscountDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_discount/ui/dialog/DiscountDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class DiscountDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f319679q0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public RecyclerView f319680h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f319681i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f319682j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public e f319683k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f319684l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f319685m0;

    /* renamed from: n0, reason: collision with root package name */
    public com.avito.android.vas_discount.e f319686n0;

    /* renamed from: o0, reason: collision with root package name */
    public LinearLayoutManager f319687o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f319688p0;

    /* compiled from: DiscountDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_discount/ui/dialog/DiscountDialogFragment$a;", "", "<init>", "()V", "", "KEY_DISCOUNT_DATA", "Ljava/lang/String;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DiscountDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f319689b;

        public b(Y41.l lVar) {
            this.f319689b = lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f319689b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f319689b;
        }

        public final int hashCode() {
            return this.f319689b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f319689b.invoke(obj);
        }
    }

    public DiscountDialogFragment() {
        super(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        com.avito.android.vas_discount.e eVar = context instanceof com.avito.android.vas_discount.e ? (com.avito.android.vas_discount.e) context : null;
        if (eVar == null) {
            throw new IllegalStateException("context must implement DiscountListener");
        }
        this.f319686n0 = eVar;
        Bundle arguments = getArguments();
        if (arguments != null) {
            DiscountResponse discountResponse = (DiscountResponse) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("discount_data", DiscountResponse.class) : arguments.getParcelable("discount_data"));
            if (discountResponse != null) {
                g.a aVarA = com.avito.android.vas_discount.di.a.a();
                aVarA.b((com.avito.android.vas_discount.di.h) C29972i.a(C29972i.b(this), com.avito.android.vas_discount.di.h.class));
                aVarA.a(cv.c.b(this));
                aVarA.c(new com.avito.android.vas_discount.di.i(this, discountResponse));
                aVarA.build().a(this);
                e eVar2 = this.f319683k0;
                if (eVar2 == null) {
                    eVar2 = null;
                }
                Set<TV0.d<?, ?>> set = this.f319684l0;
                eVar2.z(set != null ? set : null);
                return;
            }
        }
        throw new IllegalStateException("DiscountResponse must be set");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, 0 == true ? 1 : 0);
        this.f319688p0 = dVar;
        dVar.D(R.layout.vas_discount_dialog, true);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(getResources().getDimensionPixelOffset(R.dimen.dialog_peek_height));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, true, false, 10);
        this.f319680h0 = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f319687o0 = linearLayoutManager;
        RecyclerView recyclerView = this.f319680h0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.konveyor.adapter.a aVar = this.f319682j0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f319681i0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        RecyclerView recyclerView2 = this.f319680h0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(jVar);
        RecyclerView recyclerView3 = this.f319680h0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.l(new C44290a(getResources()), -1);
        e eVar = this.f319683k0;
        if (eVar == null) {
            eVar = null;
        }
        final int i12 = 0;
        eVar.getF319711Q().observe(requireActivity(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_discount.ui.dialog.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DiscountDialogFragment f319691c;

            {
                this.f319691c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                DiscountDialogFragment discountDialogFragment = this.f319691c;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.konveyor.adapter.a aVar3 = discountDialogFragment.f319682j0;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar3, list);
                            RecyclerView recyclerView4 = discountDialogFragment.f319680h0;
                            if (recyclerView4 == null) {
                                recyclerView4 = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView4.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                            RecyclerView recyclerView5 = discountDialogFragment.f319680h0;
                            (recyclerView5 != null ? recyclerView5 : null).post(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(discountDialogFragment, 3));
                            break;
                        } else {
                            DiscountDialogFragment.a aVar4 = DiscountDialogFragment.f319679q0;
                            break;
                        }
                    default:
                        Throwable th2 = (Throwable) obj;
                        if (th2 != null) {
                            com.avito.android.vas_discount.e eVar2 = discountDialogFragment.f319686n0;
                            (eVar2 != null ? eVar2 : null).Y(th2);
                            break;
                        } else {
                            DiscountDialogFragment.a aVar5 = DiscountDialogFragment.f319679q0;
                            break;
                        }
                }
            }
        });
        e eVar2 = this.f319683k0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        eVar2.k0().observe(requireActivity(), new b(new c(this)));
        e eVar3 = this.f319683k0;
        final int i13 = 1;
        (eVar3 != null ? eVar3 : null).getF319713S().observe(requireActivity(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_discount.ui.dialog.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DiscountDialogFragment f319691c;

            {
                this.f319691c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                DiscountDialogFragment discountDialogFragment = this.f319691c;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.konveyor.adapter.a aVar3 = discountDialogFragment.f319682j0;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar3, list);
                            RecyclerView recyclerView4 = discountDialogFragment.f319680h0;
                            if (recyclerView4 == null) {
                                recyclerView4 = null;
                            }
                            RecyclerView.Adapter adapter = recyclerView4.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                            RecyclerView recyclerView5 = discountDialogFragment.f319680h0;
                            (recyclerView5 != null ? recyclerView5 : null).post(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(discountDialogFragment, 3));
                            break;
                        } else {
                            DiscountDialogFragment.a aVar4 = DiscountDialogFragment.f319679q0;
                            break;
                        }
                    default:
                        Throwable th2 = (Throwable) obj;
                        if (th2 != null) {
                            com.avito.android.vas_discount.e eVar22 = discountDialogFragment.f319686n0;
                            (eVar22 != null ? eVar22 : null).Y(th2);
                            break;
                        } else {
                            DiscountDialogFragment.a aVar5 = DiscountDialogFragment.f319679q0;
                            break;
                        }
                }
            }
        });
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f319688p0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }
}

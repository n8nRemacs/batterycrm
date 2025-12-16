package com.avito.android.rubricator.list.service;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.rubricator.list.service.di.c;
import com.avito.android.rubricator.list.service.g;
import com.avito.android.rubricator.list.service.model.ServiceListArguments;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rubricator/list/service/ServiceListFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/rubricator/list/service/item/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ServiceListFragment extends BaseDialogFragment implements com.avito.android.rubricator.list.service.item.a, InterfaceC28477j.b {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f255945k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public h f255946h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f255947i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public j f255948j0;

    /* compiled from: ServiceListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/list/service/ServiceListFragment$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ServiceListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rubricator.list.service.ServiceListFragment$a$a, reason: collision with other inner class name */
        public static final class C7662a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ServiceListArguments f255949l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7662a(ServiceListArguments serviceListArguments) {
                super(1);
                this.f255949l = serviceListArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f255949l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(@k FragmentManager fragmentManager, @k ServiceListArguments serviceListArguments) {
            ServiceListFragment serviceListFragment = new ServiceListFragment();
            C35966w1.a(serviceListFragment, -1, new C7662a(serviceListArguments));
            serviceListFragment.show(fragmentManager, "ServiceListDialog");
        }

        public a() {
        }
    }

    public ServiceListFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        ServiceListArguments serviceListArguments;
        super.onCreate(bundle);
        c.a aVarA = com.avito.android.rubricator.list.service.di.a.a();
        com.avito.android.rubricator.list.service.di.d dVar = (com.avito.android.rubricator.list.service.di.d) C29972i.a(C29972i.b(this), com.avito.android.rubricator.list.service.di.d.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serviceListArguments = (ServiceListArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arguments", ServiceListArguments.class) : arguments.getParcelable("arguments"));
        } else {
            serviceListArguments = null;
        }
        ServiceListArguments serviceListArguments2 = serviceListArguments;
        if (serviceListArguments2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(dVar, interfaceC39417aB, serviceListArguments2, this, getResources(), this).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), R.style.Re23_BottomSheet_Default);
        dVar.D(R.layout.service_list_content, true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        h hVar = this.f255946h0;
        if (hVar == null) {
            hVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f255947i0;
        if (aVar == null) {
            aVar = null;
        }
        j jVar = this.f255948j0;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        dVar.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.s();
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        hVar.getF255989E().observe(this, new g.a(new e(dVar)));
        hVar.getF255990J().observe(this, new g.a(new f(aVar)));
        return dVar;
    }

    @Override // com.avito.android.rubricator.list.service.item.a
    public final void s1() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}

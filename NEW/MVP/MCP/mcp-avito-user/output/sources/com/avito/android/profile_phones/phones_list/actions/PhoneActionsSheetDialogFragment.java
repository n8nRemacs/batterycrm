package com.avito.android.profile_phones.phones_list.actions;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.profile_phones.phones_list.actions.di.b;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneActionsSheetDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/PhoneActionsSheetDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionsSheetDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f227470h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<com.avito.konveyor.adapter.b> f227471i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_phones.phones_list.actions.items.d f227472j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public a f227473k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f227474l0;

    /* renamed from: m0, reason: collision with root package name */
    public RecyclerView f227475m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public y f227476n0;

    public PhoneActionsSheetDialogFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        b.a aVarA = com.avito.android.profile_phones.phones_list.actions.di.a.a();
        aVarA.a((com.avito.android.profile_phones.phones_list.actions.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.phones_list.actions.di.c.class));
        aVarA.build().a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        PhoneActionsSheetDialogArguments phoneActionsSheetDialogArguments = (PhoneActionsSheetDialogArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", PhoneActionsSheetDialogArguments.class) : bundleRequireArguments.getParcelable("arguments"));
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.A(R.layout.phone_actions_sheet, -1);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        this.f227475m0 = (RecyclerView) dVar.findViewById(R.id.actions_list);
        a aVar = this.f227473k0;
        if (aVar == null) {
            aVar = null;
        }
        ArrayList arrayListA = aVar.a(phoneActionsSheetDialogArguments.f227469c, phoneActionsSheetDialogArguments.f227468b);
        com.avito.android.profile_phones.phones_list.actions.items.d dVar2 = this.f227472j0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        z<com.avito.android.profile_phones.phones_list.actions.items.a> zVarH = dVar2.h();
        d dVar3 = new d(this);
        l41.g<? super Throwable> gVar = e.f227496b;
        zVarH.getClass();
        this.f227476n0 = (y) zVarH.v0(dVar3, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
        RecyclerView recyclerView = this.f227475m0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter = this.f227471i0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        RecyclerView recyclerView2 = this.f227475m0;
        RecyclerView recyclerView3 = recyclerView2 == null ? null : recyclerView2;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.a aVar2 = this.f227470h0;
        (aVar2 != null ? aVar2 : null).c(new UV0.c(arrayListA));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        y yVar = this.f227476n0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        super.onDestroyView();
    }
}

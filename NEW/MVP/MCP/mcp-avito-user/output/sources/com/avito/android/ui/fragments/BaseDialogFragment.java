package com.avito.android.ui.fragments;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.deeplink_handler.view.impl.h;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.di.C29972i;
import com.avito.android.memory.consumption.f;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.ui.fragments.a;
import com.avito.android.util.C35960v2;
import j.I;
import j.InterfaceC42153i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BaseDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment extends DialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public final long f304594f0;

    /* renamed from: g0, reason: collision with root package name */
    @k
    public final BaseFragment.a f304595g0;

    public BaseDialogFragment() {
        this(0, 1, null);
    }

    @k
    public a.g b5() {
        return new i(requireActivity());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public a.i c5() {
        return new com.avito.android.deeplink_handler.view.impl.k(requireActivity(), null, 2, 0 == true ? 1 : 0);
    }

    @k
    public final f.a d5() {
        f.a aVar = this.f304595g0.f304606c;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC42153i
    public void onActivityResult(int i12, int i13, @l Intent intent) {
        BaseFragment.a aVar = this.f304595g0;
        if (intent != null) {
            ActivityC22955m activityC22955mRequireActivity = requireActivity();
            InterfaceC28373a interfaceC28373a = aVar.f304605b;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C35960v2.a(intent, activityC22955mRequireActivity, interfaceC28373a);
        }
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = aVar.f304604a;
        (dVar != null ? dVar : null).a(i12, i13, intent);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Sb().a(this, cv.c.d(this)).a(this.f304595g0);
        e5(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        com.avito.android.deeplink_handler.view.d dVar = this.f304595g0.f304604a;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b(this, b5(), c5(), new h(requireActivity()), new d.a(this));
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void startActivity(@k Intent intent, @l Bundle bundle) {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        InterfaceC28373a interfaceC28373a = this.f304595g0.f304605b;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C35960v2.a(intent, activityC22955mRequireActivity, interfaceC28373a);
        super.startActivity(intent, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void startActivityForResult(@k Intent intent, int i12, @l Bundle bundle) {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        InterfaceC28373a interfaceC28373a = this.f304595g0.f304605b;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C35960v2.a(intent, activityC22955mRequireActivity, interfaceC28373a);
        super.startActivityForResult(intent, i12, bundle);
    }

    public BaseDialogFragment(@I int i12) {
        super(i12);
        com.avito.android.time.c.f301452a.getClass();
        this.f304594f0 = com.avito.android.time.c.f301453b.a();
        this.f304595g0 = new BaseFragment.a();
    }

    public /* synthetic */ BaseDialogFragment(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    public void e5(@l Bundle bundle) {
    }
}

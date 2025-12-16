package com.avito.beduin.v2.repository.environment;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AndroidEnvironmentClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/c;", "Landroidx/lifecycle/q;", "environment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f338210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f338211c;

    /* compiled from: AndroidEnvironmentClient.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "v", "Landroidx/core/view/J0;", "<anonymous parameter 1>", "invoke", "(Landroid/view/View;Landroidx/core/view/J0;)Landroidx/core/view/J0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<View, J0, J0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f338212l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final J0 invoke(View view, J0 j02) {
            return C22823h0.o(view);
        }
    }

    public c(Fragment fragment, g gVar) {
        this.f338210b = fragment;
        this.f338211c = gVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onCreate(@Y61.k InterfaceC22983P interfaceC22983P) {
        ViewGroup viewGroup;
        View view = this.f338210b.getView();
        if (view == null) {
            return;
        }
        View view2 = view;
        while (true) {
            viewGroup = null;
            if (view2 == null) {
                break;
            }
            if (view2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) view2;
                break;
            } else {
                ViewParent parent = view2.getParent();
                view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            }
        }
        if (viewGroup != null) {
            this.f338211c.b(viewGroup, view.getContext(), a.f338212l);
        }
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        interfaceC22983P.getLifecycle().c(this);
    }
}

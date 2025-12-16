package com.avito.android.favorite_comparison.presentation;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.comparison.remote.model.EmptyStateInfo;
import com.avito.android.component.toast.c;
import com.avito.android.di.C29972i;
import com.avito.android.favorite_comparison.presentation.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import sC.AbstractC48027d;

/* compiled from: FavoriteComparisonFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/FavoriteComparisonFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteComparisonFragment extends TabBaseFragment implements InterfaceC28477j.a {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f155307x0 = new a(null);

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f155308t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public o f155309u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f155310v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public n f155311w0;

    /* compiled from: FavoriteComparisonFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/FavoriteComparisonFragment$a;", "", "<init>", "()V", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public FavoriteComparisonFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.favorite_comparison_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f155311w0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        n nVar = this.f155311w0;
        if (nVar != null) {
            io.reactivex.rxjava3.internal.observers.y yVar = nVar.f155356l;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            nVar.f155356l = null;
            io.reactivex.rxjava3.internal.observers.y yVar2 = nVar.f155357m;
            if (yVar2 != null) {
                DisposableHelper.a(yVar2);
            }
            nVar.f155357m = null;
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        final n nVar = this.f155311w0;
        if (nVar != null) {
            o oVar = nVar.f155346b;
            C41981q0 state = oVar.getState();
            InterfaceC35745a5 interfaceC35745a5 = nVar.f155347c;
            I0 i0J0 = state.j0(interfaceC35745a5.e());
            l41.g gVar = new l41.g() { // from class: com.avito.android.favorite_comparison.presentation.k
                @Override // l41.g
                public final void accept(Object obj) {
                    f fVar = (f) obj;
                    n nVar2 = nVar;
                    nVar2.getClass();
                    com.avito.android.progress_overlay.l lVar = nVar2.f155355k;
                    if (fVar.f155319a) {
                        lVar.k(null);
                    } else if (fVar.f155322d != null) {
                        lVar.j();
                        lVar.a("");
                    } else {
                        RecyclerView recyclerView = nVar2.f155348d;
                        View view = nVar2.f155350f;
                        EmptyStateInfo emptyStateInfo = fVar.f155320b;
                        if (emptyStateInfo != null) {
                            D6.G(view, true);
                            D6.w(recyclerView);
                            lVar.j();
                            nVar2.f155351g.setText(emptyStateInfo.getDescription());
                            String buttonText = emptyStateInfo.getButtonText();
                            Button button = nVar2.f155352h;
                            button.setText(buttonText);
                            button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(6, nVar2, emptyStateInfo));
                        } else {
                            List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> list = fVar.f155321c;
                            if (list != null) {
                                D6.w(view);
                                D6.G(recyclerView, true);
                                lVar.j();
                                nVar2.f155353i.f338510e = new UV0.c(list);
                                nVar2.f155354j.notifyDataSetChanged();
                            }
                        }
                    }
                    nVar2.f155349e.setRefreshing(false);
                }
            };
            final V2 v22 = V2.f318762a;
            l41.g<? super Throwable> gVar2 = new l41.g() { // from class: com.avito.android.favorite_comparison.presentation.l
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            };
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            nVar.f155356l = (io.reactivex.rxjava3.internal.observers.y) i0J0.v0(gVar, gVar2, interfaceC43543a);
            nVar.f155357m = (io.reactivex.rxjava3.internal.observers.y) oVar.ea().j0(interfaceC35745a5.e()).v0(new l41.g() { // from class: com.avito.android.favorite_comparison.presentation.i
                @Override // l41.g
                public final void accept(Object obj) {
                    AbstractC48027d abstractC48027d = (AbstractC48027d) obj;
                    n nVar2 = nVar;
                    nVar2.getClass();
                    if (!(abstractC48027d instanceof AbstractC48027d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC48027d.a aVar = (AbstractC48027d.a) abstractC48027d;
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(aVar.f437537a);
                    View view = nVar2.f155345a;
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
                    m mVar = new m(nVar2, aVar);
                    com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, Collections.singletonList(new c.a.C3719a(aVar.f437538b, false, null, mVar, 6, null)), null, null, 0, null, null, false, false, null, contextThemeWrapper, 2042);
                }
            }, new l41.g() { // from class: com.avito.android.favorite_comparison.presentation.j
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            }, interfaceC43543a);
        }
        o oVar2 = this.f155309u0;
        if (oVar2 == null) {
            oVar2 = null;
        }
        oVar2.m1().onNext(a.C4551a.f155312a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        com.avito.konveyor.a aVar = this.f155308t0;
        if (aVar == null) {
            aVar = null;
        }
        o oVar = this.f155309u0;
        if (oVar == null) {
            oVar = null;
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f155310v0;
        this.f155311w0 = new n(view, aVar, oVar, interfaceC35745a5 != null ? interfaceC35745a5 : null);
        super.onViewCreated(view, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.favorite_comparison.di.a.a().a((com.avito.android.favorite_comparison.di.f) C29972i.a(C29972i.b(this), com.avito.android.favorite_comparison.di.f.class), cv.c.b(this), new d(this), getResources()).a(this);
    }
}

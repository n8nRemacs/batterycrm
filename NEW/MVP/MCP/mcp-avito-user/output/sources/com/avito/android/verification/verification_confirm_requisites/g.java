package com.avito.android.verification.verification_confirm_requisites;

import LM0.a;
import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: VerificationConfirmRequisitesView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/g;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f324944a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f324945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f324946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l<LM0.a, G0> f324947d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f324948e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final NavBar f324949f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C49864d f324950g;

    /* compiled from: VerificationConfirmRequisitesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f324947d.invoke(a.C0611a.f9924a);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return g.this.f324944a.findViewById(R.id.verification_confirm_requisites_content_container);
        }
    }

    public g(@Y61.k l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f324944a = view;
        this.f324945b = jVar;
        this.f324946c = aVar;
        this.f324947d = lVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_confirm_requisites_list);
        this.f324948e = recyclerView;
        NavBar navBar = (NavBar) view.findViewById(R.id.verification_confirm_requisites_navbar);
        this.f324949f = navBar;
        C49864d c49864d = new C49864d((ViewGroup) view.findViewById(R.id.verification_confirm_requisites_progress_root), new b(), 0, 4, null);
        this.f324950g = c49864d;
        final int i12 = 0;
        final int i13 = 1;
        c49864d.a(new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_confirm_requisites.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f324943c;

            {
                this.f324943c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f324943c.f324947d.invoke(a.g.f9929a);
                        break;
                    default:
                        g gVar = this.f324943c;
                        gVar.f324947d.invoke(new a.e(gVar.f324950g.f442450h));
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_confirm_requisites.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f324943c;

            {
                this.f324943c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f324943c.f324947d.invoke(a.g.f9929a);
                        break;
                    default:
                        g gVar = this.f324943c;
                        gVar.f324947d.invoke(new a.e(gVar.f324950g.f442450h));
                        break;
                }
            }
        });
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new a(), false, null, null, null, null, 124, null));
        recyclerView.setAdapter(jVar);
        recyclerView.l(new PV.a(0, y6.b(16), 0, 0, 12, null), -1);
    }
}

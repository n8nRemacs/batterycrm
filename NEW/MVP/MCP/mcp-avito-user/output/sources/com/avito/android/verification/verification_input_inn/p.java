package com.avito.android.verification.verification_input_inn;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: VerificationInputInnView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/p;", "Lcom/avito/android/verification/verification_input_inn/m;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v f325635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f325636b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f325637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavBar f325638d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f325639e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C49864d f325640f;

    /* compiled from: VerificationInputInnView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f325641l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f325641l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f325641l.findViewById(R.id.verification_input_inn_list);
        }
    }

    /* compiled from: VerificationInputInnView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f325642b;

        public b(Y41.l lVar) {
            this.f325642b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return ((InterfaceC43072x) this.f325642b).equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return (InterfaceC43072x) this.f325642b;
        }

        public final int hashCode() {
            return ((InterfaceC43072x) this.f325642b).hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f325642b.invoke(obj);
        }
    }

    public p(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k v vVar, @Y61.k Y41.a<G0> aVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f325635a = vVar;
        this.f325636b = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_input_inn_list);
        this.f325637c = recyclerView;
        NavBar navBar = (NavBar) view.findViewById(R.id.verification_input_inn_navbar);
        this.f325638d = navBar;
        Button button = (Button) view.findViewById(R.id.verification_input_inn_button);
        this.f325639e = button;
        C49864d c49864d = new C49864d((ViewGroup) view.findViewById(R.id.verification_input_inn_progress_root), new a(view), 0, 4, null);
        this.f325640f = c49864d;
        final int i12 = 0;
        final int i13 = 1;
        c49864d.a(new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_input_inn.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f325631c;

            {
                this.f325631c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f325631c.f325635a.W1();
                        break;
                    default:
                        p pVar = this.f325631c;
                        pVar.f325635a.i7(pVar.f325640f.f442450h);
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_input_inn.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f325631c;

            {
                this.f325631c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f325631c.f325635a.W1();
                        break;
                    default:
                        p pVar = this.f325631c;
                        pVar.f325635a.i7(pVar.f325640f.f442450h);
                        break;
                }
            }
        });
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), aVar, false, null, null, null, null, 124, null));
        recyclerView.setAdapter(jVar);
        recyclerView.m(new q(this));
        vVar.o0().observe(interfaceC22983P, new b(new s(1, this, p.class, "setState", "setState(Lcom/avito/android/verification/verification_input_inn/VerificationInputInnScreenState;)V", 0)));
        vVar.getF325656T().observe(interfaceC22983P, new b(new t(1, button, Button.class, "setLoading", "setLoading(Z)V", 0)));
        vVar.getF325657U().observe(interfaceC22983P, new b(new u(1, this, p.class, "showToastBarError", "showToastBarError(Ljava/lang/String;)Lcom/avito/android/lib/design/toast_bar/ToastBarViewBase;", 8)));
    }
}

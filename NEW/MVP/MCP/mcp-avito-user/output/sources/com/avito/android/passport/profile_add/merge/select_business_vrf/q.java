package com.avito.android.passport.profile_add.merge.select_business_vrf;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfFragment;
import g60.InterfaceC40537a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectBusinessVrfView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/q;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f213484a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40537a, G0> f213485b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f213486c;

    /* renamed from: d, reason: collision with root package name */
    public final MotionLayout f213487d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f213488e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f213489f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f213490g;

    /* renamed from: h, reason: collision with root package name */
    public final Button f213491h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f213492i;

    /* renamed from: j, reason: collision with root package name */
    public final Input f213493j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.status_view.g f213494k;

    public q(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f213484a = aVar;
        this.f213485b = lVar;
        ((NavBar) view.findViewById(R.id.passport_select_business_vrf_nav_bar)).c(R.attr.ic_arrowBack24, new n(this));
        this.f213486c = view.getContext();
        this.f213487d = (MotionLayout) view.findViewById(R.id.passport_select_business_vrf_root);
        this.f213488e = (TextView) view.findViewById(R.id.passport_select_business_vrf_title);
        TextView textView = (TextView) view.findViewById(R.id.passport_select_business_vrf_subtitle);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f213489f = textView;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.passport_select_business_vrf_items);
        recyclerView.setAdapter(jVar);
        this.f213490g = recyclerView;
        Button button = (Button) view.findViewById(R.id.passport_select_business_vrf_accept_button);
        final int i12 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.passport.profile_add.merge.select_business_vrf.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f213415c;

            {
                this.f213415c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        ((SelectBusinessVrfFragment.d) this.f213415c.f213485b).invoke(new InterfaceC40537a.c(null, 1, null));
                        break;
                    default:
                        this.f213415c.f213485b.invoke(InterfaceC40537a.C11190a.f396287a);
                        break;
                }
            }
        });
        this.f213491h = button;
        Button button2 = (Button) view.findViewById(R.id.passport_select_business_vrf_cancel_button);
        final int i13 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.passport.profile_add.merge.select_business_vrf.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f213415c;

            {
                this.f213415c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        ((SelectBusinessVrfFragment.d) this.f213415c.f213485b).invoke(new InterfaceC40537a.c(null, 1, null));
                        break;
                    default:
                        this.f213415c.f213485b.invoke(InterfaceC40537a.C11190a.f396287a);
                        break;
                }
            }
        });
        this.f213492i = button2;
        Input input = (Input) view.findViewById(R.id.passport_select_business_vrf_search);
        com.avito.android.lib.design.input.n.c(input, new p(this));
        this.f213493j = input;
        this.f213494k = new com.avito.android.status_view.g(view, null, new o(this), 2, null);
    }
}

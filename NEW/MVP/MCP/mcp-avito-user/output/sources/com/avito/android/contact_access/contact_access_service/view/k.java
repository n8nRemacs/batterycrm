package com.avito.android.contact_access.contact_access_service.view;

import Er.AbstractC13522a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: ContactAccessServiceView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/view/k;", "", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f126052a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f126053b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f126054c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<AbstractC13522a, G0> f126055d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Context f126056e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DescriptionListParameterLine f126057f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f126058g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f126059h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f126060i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C42670a f126061j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final CollapsingTitleAppBarLayout f126062k;

    /* compiled from: ContactAccessServiceView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return k.this.f126052a.findViewById(R.id.content_container);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k ViewGroup viewGroup, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.l<? super AbstractC13522a, G0> lVar) {
        this.f126052a = viewGroup;
        this.f126053b = interfaceC28373a;
        this.f126054c = aVar;
        this.f126055d = lVar;
        this.f126056e = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.contacts_and_price);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine");
        }
        this.f126057f = (DescriptionListParameterLine) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.agreement_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f126058g = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.button_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f126059h = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.select_payment_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f126060i = viewFindViewById4;
        this.f126061j = new C42670a((ViewGroup) viewGroup.findViewById(R.id.progress_root), new b(), 0, 4, null);
        View viewFindViewById5 = viewGroup.findViewById(R.id.app_bar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.CollapsingTitleAppBarLayout");
        }
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) viewFindViewById5;
        this.f126062k = collapsingTitleAppBarLayout;
        viewFindViewById4.setOnClickListener(new j(this, 0));
        collapsingTitleAppBarLayout.setClickListener(new a());
    }

    /* compiled from: ContactAccessServiceView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/contact_access/contact_access_service/view/k$a", "Lru/avito/component/toolbar/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ru.avito.component.toolbar.a {
        public a() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            k.this.f126055d.invoke(AbstractC13522a.C0261a.f4345a);
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
        }
    }
}

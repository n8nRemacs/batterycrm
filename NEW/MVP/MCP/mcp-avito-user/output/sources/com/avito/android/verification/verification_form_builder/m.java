package com.avito.android.verification.verification_form_builder;

import TM0.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: FormBuilderView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/m;", "", "b", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f325398k = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f325399a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f325400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f325401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<TM0.a, G0> f325402d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f325403e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f325404f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f325405g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f325406h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final NavBar f325407i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C49864d f325408j;

    /* compiled from: FormBuilderView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f325402d.invoke(a.d.f15614a);
            return G0.f406611a;
        }
    }

    /* compiled from: FormBuilderView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/m$b;", "", "<init>", "()V", "", "MILLISECONDS_PER_INCH", "F", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: FormBuilderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[FormBuilderScreenData.Button.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FormBuilderScreenData.Button.Style style = FormBuilderScreenData.Button.Style.f325360b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FormBuilderScreenData.Button.Style style2 = FormBuilderScreenData.Button.Style.f325360b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: FormBuilderView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return m.this.f325399a.findViewById(R.id.verification_form_builder_content_container);
        }
    }

    static {
        new b(null);
    }

    public m(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f325399a = view;
        this.f325400b = jVar;
        this.f325401c = aVar;
        this.f325402d = lVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_form_builder_list);
        this.f325403e = recyclerView;
        this.f325404f = (Button) view.findViewById(R.id.verification_form_builder_button);
        this.f325405g = (TextView) view.findViewById(R.id.verification_form_builder_top_footer);
        this.f325406h = (TextView) view.findViewById(R.id.verification_form_builder_bottom_footer);
        NavBar navBar = (NavBar) view.findViewById(R.id.verification_form_builder_nav_bar);
        this.f325407i = navBar;
        C49864d c49864d = new C49864d((ViewGroup) view.findViewById(R.id.verification_form_builder_progress_root), new d(), 0, 4, null);
        this.f325408j = c49864d;
        final int i12 = 0;
        final int i13 = 1;
        c49864d.a(new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_form_builder.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f325397c;

            {
                this.f325397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f325397c.f325402d.invoke(a.g.f15618a);
                        break;
                    default:
                        m mVar = this.f325397c;
                        mVar.f325402d.invoke(new a.b(mVar.f325408j.f442450h));
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_form_builder.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f325397c;

            {
                this.f325397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f325397c.f325402d.invoke(a.g.f15618a);
                        break;
                    default:
                        m mVar = this.f325397c;
                        mVar.f325402d.invoke(new a.b(mVar.f325408j.f442450h));
                        break;
                }
            }
        });
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new a(), false, null, null, null, null, 124, null));
        recyclerView.setAdapter(jVar);
        recyclerView.l(new RM0.a(), -1);
    }
}

package nq;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.C35835l0;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnq/c;", "Lnq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements InterfaceC44465a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f419163a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f419164b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f419165c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f419166d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f419167e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f419168f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f419169g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Toolbar f419170h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f419171i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f419172j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f419173k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f419174l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f419175m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Input f419176n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final TextView f419177o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final NestedScrollView f419178p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final FrameLayout f419179q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final FrameLayout f419180r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final Button f419181s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final Button f419182t;

    /* compiled from: PromoView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nq/c$a", "Lcom/avito/android/util/u5;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC35956u5 {
        public a() {
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
            c.this.f419166d.invoke(charSequence.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k View view, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3, @k j jVar, @k l<? super String, G0> lVar, @k l<? super DeepLink, G0> lVar2, @k com.avito.konveyor.adapter.a aVar4) {
        this.f419163a = aVar;
        this.f419164b = aVar2;
        this.f419165c = aVar3;
        this.f419166d = lVar;
        this.f419167e = lVar2;
        this.f419168f = aVar4;
        this.f419169g = view.getContext();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f419170h = toolbar;
        this.f419171i = (ImageView) view.findViewById(R.id.image_header);
        this.f419172j = (TextView) view.findViewById(R.id.title);
        this.f419173k = (TextView) view.findViewById(R.id.subtitle);
        this.f419174l = (TextView) view.findViewById(R.id.input_title);
        this.f419175m = (TextView) view.findViewById(R.id.input_description);
        Input input = (Input) view.findViewById(R.id.input_phone);
        this.f419176n = input;
        TextView textView = (TextView) view.findViewById(R.id.input_hint);
        this.f419177o = textView;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_rv);
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.scroll);
        this.f419178p = nestedScrollView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.proceed_button);
        this.f419179q = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.proceed_button_bottom);
        this.f419180r = frameLayout2;
        View viewFindViewById2 = frameLayout.findViewById(R.id.button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        this.f419181s = button;
        View viewFindViewById3 = frameLayout2.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById3;
        this.f419182t = button2;
        a aVar5 = new a();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
        toolbar.setNavigationIcon(C35835l0.h(R.attr.ic_arrowBack24, toolbar.getContext()));
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTintList(C35835l0.e(R.attr.black, toolbar.getContext()));
        }
        final int i12 = 2;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: nq.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f419162c;

            {
                this.f419162c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f419162c.f419164b.invoke();
                        break;
                    case 1:
                        this.f419162c.f419165c.invoke();
                        break;
                    default:
                        this.f419162c.f419163a.invoke();
                        break;
                }
            }
        });
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: nq.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f419162c;

            {
                this.f419162c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f419162c.f419164b.invoke();
                        break;
                    case 1:
                        this.f419162c.f419165c.invoke();
                        break;
                    default:
                        this.f419162c.f419163a.invoke();
                        break;
                }
            }
        });
        final int i14 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: nq.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f419162c;

            {
                this.f419162c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f419162c.f419164b.invoke();
                        break;
                    case 1:
                        this.f419162c.f419165c.invoke();
                        break;
                    default:
                        this.f419162c.f419163a.invoke();
                        break;
                }
            }
        });
        input.b(aVar5);
        nestedScrollView.setOnScrollChangeListener(new e(this, 4));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

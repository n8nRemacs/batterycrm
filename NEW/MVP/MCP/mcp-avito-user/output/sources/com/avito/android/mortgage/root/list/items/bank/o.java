package com.avito.android.mortgage.root.list.items.bank;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BankView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/bank/m;", "a", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f202370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f202371c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f202372d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f202373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f202374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f202375g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<b> f202376h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f202377i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f202378j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f202379k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f202380l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f202381m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f202382n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f202383o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f202384p;

    /* compiled from: BankView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/o$a;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@Y61.k View view, @Y61.k Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getHeight() / 2.0f);
        }
    }

    /* compiled from: BankView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/o$b;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f202385a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f202386b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f202387c;

        public b(@Y61.k ViewGroup viewGroup, @Y61.k TextView textView, @Y61.k TextView textView2) {
            this.f202385a = viewGroup;
            this.f202386b = textView;
            this.f202387c = textView2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f202385a, bVar.f202385a) && L.f(this.f202386b, bVar.f202386b) && L.f(this.f202387c, bVar.f202387c);
        }

        public final int hashCode() {
            return this.f202387c.hashCode() + ((this.f202386b.hashCode() + (this.f202385a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "CreditInfoField(field=" + this.f202385a + ", title=" + this.f202386b + ", value=" + this.f202387c + ')';
        }
    }

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.bank_card);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f202370b = viewGroup;
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f202372d = imageView;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202373e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.chevron);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202374f = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.subtitle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202375g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.first_field);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.first_field_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.first_field_value);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        b bVar = new b(viewGroup2, textView, (TextView) viewFindViewById8);
        View viewFindViewById9 = view.findViewById(R.id.second_field);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.second_field_title);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.second_field_value);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        b bVar2 = new b(viewGroup3, textView2, (TextView) viewFindViewById11);
        View viewFindViewById12 = view.findViewById(R.id.third_field);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup4 = (ViewGroup) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.third_field_title);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.third_field_value);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        b bVar3 = new b(viewGroup4, textView3, (TextView) viewFindViewById14);
        View viewFindViewById15 = view.findViewById(R.id.fourth_field);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup5 = (ViewGroup) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.fourth_field_title);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.fourth_field_value);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        b bVar4 = new b(viewGroup5, textView4, (TextView) viewFindViewById17);
        View viewFindViewById18 = view.findViewById(R.id.fifth_field);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup6 = (ViewGroup) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.fifth_field_title);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView5 = (TextView) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.fifth_field_value);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202376h = C42745f0.U(bVar, bVar2, bVar3, bVar4, new b(viewGroup6, textView5, (TextView) viewFindViewById20));
        View viewFindViewById21 = view.findViewById(R.id.comment_field_title);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202377i = (TextView) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(R.id.comment_field_value);
        if (viewFindViewById22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202378j = (TextView) viewFindViewById22;
        View viewFindViewById23 = view.findViewById(R.id.select_bank);
        if (viewFindViewById23 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById23;
        this.f202379k = button;
        View viewFindViewById24 = view.findViewById(R.id.chat_manager);
        if (viewFindViewById24 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById24;
        this.f202381m = button2;
        View viewFindViewById25 = view.findViewById(R.id.open_application);
        if (viewFindViewById25 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button3 = (Button) viewFindViewById25;
        this.f202383o = button3;
        imageView.setOutlineProvider(new a());
        imageView.setClipToOutline(true);
        final int i12 = 0;
        viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.mortgage.root.list.items.bank.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f202369c;

            {
                this.f202369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f202369c.f202371c;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f202369c.f202380l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f202369c.f202382n;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f202369c.f202384p;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.mortgage.root.list.items.bank.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f202369c;

            {
                this.f202369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f202369c.f202371c;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f202369c.f202380l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f202369c.f202382n;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f202369c.f202384p;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.mortgage.root.list.items.bank.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f202369c;

            {
                this.f202369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        Y41.a<G0> aVar = this.f202369c.f202371c;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f202369c.f202380l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f202369c.f202382n;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f202369c.f202384p;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 3;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.mortgage.root.list.items.bank.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f202369c;

            {
                this.f202369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        Y41.a<G0> aVar = this.f202369c.f202371c;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f202369c.f202380l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f202369c.f202382n;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f202369c.f202384p;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void El(@Y61.k Y41.a<G0> aVar) {
        this.f202380l = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void Hy(boolean z12) {
        this.f202383o.setLoading(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void JM(@Y61.k List<e> list) {
        int i12 = 0;
        for (Object obj : this.f202376h) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            b bVar = (b) obj;
            ViewGroup viewGroup = bVar.f202385a;
            e eVar = (e) C42745f0.K(i12, list);
            if (eVar == null) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
                bVar.f202386b.setText(eVar.f202353a);
                bVar.f202387c.setText(eVar.f202354b);
            }
            i12 = i13;
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void NK(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f202383o, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void PQ(@Y61.k Y41.a<G0> aVar) {
        this.f202371c = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void R(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f202375g, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void Rm(@Y61.l f fVar) {
        Button button = this.f202379k;
        if (fVar == null) {
            button.setVisibility(8);
            return;
        }
        button.setVisibility(0);
        button.setText(fVar.f202355a);
        button.setEnabled(fVar.f202356b);
        button.setLoading(fVar.f202357c);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void WJ(boolean z12) {
        this.f202370b.setClickable(z12);
        this.f202374f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void Wy(@Y61.k Y41.a<G0> aVar) {
        this.f202382n = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void Z(@Y61.k String str) {
        ImageView imageView = this.f202372d;
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        Drawable drawableU = D6.u(imageView, R.drawable.placeholder_circle_bg);
        ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
        aVar.f169492j = drawableU;
        aVar.f169493k = scaleType;
        aVar.f169485c = Integer.valueOf(R.drawable.placeholder_circle_bg);
        aVar.f(Uri.parse(str));
        aVar.c();
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void bZ(@Y61.l ApplicationAppealComment applicationAppealComment) {
        I5.a(this.f202377i, applicationAppealComment != null ? applicationAppealComment.getTitle() : null, false);
        com.avito.android.util.text.j.a(this.f202378j, applicationAppealComment != null ? applicationAppealComment.getText() : null, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void bt(boolean z12) {
        this.f202381m.setLoading(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void li(@Y61.k Y41.a<G0> aVar) {
        this.f202384p = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void setEnabled(boolean z12) {
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
            this.itemView.setEnabled(false);
        }
        this.f202370b.setEnabled(z12);
        this.f202379k.setEnabled(z12);
        this.f202381m.setEnabled(z12);
        this.f202383o.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void setTitle(@Y61.k String str) {
        this.f202373e.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank.m
    public final void xi(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f202381m, str, false);
    }
}

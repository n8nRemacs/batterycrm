package com.avito.android.credits.calculator;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.WheelGravity;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: CreditCalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/calculator/q;", "Lcom/avito/android/credits/calculator/l;", "Lcom/avito/konveyor/adapter/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class q extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f128699p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f128700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.x f128701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f128702d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f128703e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f128704f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final View f128705g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f128706h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final View f128707i;

    /* renamed from: j, reason: collision with root package name */
    public final long f128708j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.credits.p f128709k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f128710l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f128711m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public H2 f128712n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public N f128713o;

    public q(@Y61.k View view, @Y61.k com.avito.android.credits.x xVar) {
        super(view);
        this.f128700b = view;
        this.f128701c = xVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128702d = (TextView) viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.subtitle);
        this.f128703e = textView;
        View viewFindViewById2 = view.findViewById(R.id.show_form_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f128704f = (Button) viewFindViewById2;
        this.f128705g = view.findViewById(R.id.privacy_info_container);
        TextView textView2 = (TextView) view.findViewById(R.id.privacy_info);
        this.f128706h = textView2;
        this.f128707i = view.findViewById(R.id.divider_top);
        this.f128708j = view.getResources().getInteger(android.R.integer.config_shortAnimTime);
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void D80(q qVar, int i12, final int[] iArr, Y41.l lVar, final Y41.l lVar2) {
        com.avito.android.lib.design.bottom_sheet.d dVar = qVar.f128711m;
        if (dVar != null) {
            dVar.r();
        }
        com.avito.android.lib.design.picker.k<?> kVar = null;
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(qVar.f128700b.getContext(), 0, 2, 0 == true ? 1 : 0);
        dVar2.D(R.layout.advert_details_credit_terms_picker, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        final Picker picker = (Picker) dVar2.findViewById(R.id.picker);
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = i14 + 1;
            com.avito.android.lib.design.picker.k<?> kVar2 = new com.avito.android.lib.design.picker.k<>(Integer.valueOf(i14), (String) lVar.invoke(Integer.valueOf(iArr[i13])));
            if (i12 == iArr[i14]) {
                kVar = kVar2;
            }
            arrayList.add(kVar2);
            i13++;
            i14 = i15;
        }
        Picker.d(picker, arrayList, new com.avito.android.lib.design.picker.m(WheelGravity.f179989d, false, -1), 12);
        picker.setFirstWheelValue(kVar);
        picker.postDelayed(new Runnable(iArr, lVar2) { // from class: com.avito.android.credits.calculator.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int[] f128690c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ N f128691d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f128691d = (N) lVar2;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // java.lang.Runnable
            public final void run() {
                int i16 = q.f128699p;
                this.f128689b.b(new p(this.f128690c, this.f128691d));
            }
        }, 100L);
        com.avito.android.lib.util.g.a(dVar2);
        qVar.f128711m = dVar2;
    }

    @Y61.k
    public final String B80(int i12, boolean z12) {
        int i13 = i12 / 12;
        return z12 ? this.f128701c.a(i13) : String.valueOf(i13);
    }

    public abstract boolean C80();

    @Override // com.avito.android.credits.calculator.l
    public final void Gw(@Y61.k com.avito.android.credits.p pVar) {
        this.f128709k = pVar;
    }

    @Override // com.avito.android.credits.calculator.l
    public final void T60(@Y61.l Integer num) {
        if (num != null) {
            D6.c(this.f128700b, null, Integer.valueOf(num.intValue()), null, null, 13);
        }
    }

    @Override // com.avito.android.credits.calculator.l
    public final void Yv(boolean z12) {
        View view = this.f128707i;
        if (view != null) {
            D6.G(view, z12);
        }
    }

    @Override // com.avito.android.credits.calculator.l
    public final void gH(@Y61.l AttributedText attributedText, @Y61.k String str, @Y61.l String str2) {
        Button button = this.f128704f;
        button.setText(str);
        if (str2 != null) {
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(str2));
        }
        button.setOnClickListener(new ViewOnClickListenerC29614a(2, button, this));
        View view = this.f128705g;
        TextView textView = this.f128706h;
        if (attributedText == null) {
            D6.w(view);
            D6.w(textView);
            return;
        }
        D6.H(view);
        D6.H(textView);
        if (textView != null) {
            attributedText.setOnUrlClickListener(new com.avito.android.auction.details.i(this, 5));
            attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 1));
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f128709k = null;
        ?? r12 = this.f128713o;
        if (r12 != 0) {
            r12.invoke();
        }
        this.f128713o = null;
        H2 h22 = this.f128712n;
        if (h22 != null) {
            h22.dispose();
        }
        this.f128712n = null;
    }

    @Override // com.avito.android.credits.calculator.l
    public final void sg(@Y61.k String str) {
        C42822w c42822w = null;
        View viewInflate = LayoutInflater.from(this.f128700b.getContext()).inflate(R.layout.credits_bottom_sheet_dialog, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(str);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f128710l;
        if (dVar != null) {
            dVar.r();
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(viewInflate.getContext(), 0, 2, c42822w);
        dVar2.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        dVar2.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 15));
        this.f128710l = dVar2;
        com.avito.android.lib.util.g.a(dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.credits.calculator.l
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f128713o = (N) aVar;
    }

    @Override // com.avito.android.credits.calculator.l
    public final void tJ() {
        H2 h22 = this.f128712n;
        if (h22 == null || h22.f318621e) {
            if (h22 != null) {
                h22.dispose();
            }
            l0.a aVar = new l0.a();
            l0.a aVar2 = new l0.a();
            aVar2.f406838b = true;
            this.f128712n = K2.b(this.f128700b.getRootView(), new o(aVar, aVar2, this));
        }
    }

    public void yp(@Y61.l AttributedText attributedText, @Y61.k String str, @Y61.l String str2) {
        I5.a(this.f128702d, str, false);
        TextView textView = this.f128703e;
        if (textView != null) {
            if (attributedText == null) {
                I5.a(textView, str2, false);
                return;
            }
            attributedText.setOnUrlClickListener(new com.avito.android.auction.details.i(this, 5));
            attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 1));
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }
}

package com.avito.android.serp.adapter.reformulations;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.google.android.flexbox.FlexboxLayout;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReformulationsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/r;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/reformulations/q;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends com.avito.android.serp.c implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.reformulations.a f270650b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f270651c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f270652d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f270653e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public N f270654f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f270655g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ButtonStyle f270656h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f270657i;

    /* compiled from: ReformulationsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f270659a;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f270659a = iArr;
        }
    }

    /* compiled from: ReformulationsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f270660l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public r(@Y61.k View view, @Y61.k com.avito.android.serp.adapter.reformulations.a aVar) {
        super(view);
        this.f270650b = aVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270651c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chips_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f270652d = (FlexboxLayout) viewFindViewById2;
        this.f270653e = LayoutInflater.from(view.getContext());
        this.f270654f = c.f270660l;
        this.f270655g = true;
        this.f270657i = new com.jakewharton.rxrelay3.c<>();
        view.addOnAttachStateChangeListener(new a());
    }

    public final void B80(ViewGroup viewGroup, ReformulationElement reformulationElement) {
        Button button = (Button) this.f270653e.inflate(R.layout.reformulation_chip, viewGroup, false);
        button.setText(reformulationElement.f270620b);
        button.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(16, this, reformulationElement));
        ButtonStyle buttonStyle = this.f270656h;
        if (buttonStyle != null) {
            C80(button, buttonStyle);
        }
        viewGroup.addView(button);
    }

    public final void C80(Button button, ButtonStyle buttonStyle) {
        int iD2;
        int i12;
        int[] iArr = b.f270659a;
        int i13 = iArr[buttonStyle.ordinal()];
        FlexboxLayout flexboxLayout = this.f270652d;
        if (i13 == 1) {
            iD2 = C35835l0.d(R.attr.white, flexboxLayout.getContext());
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iD2 = C35835l0.d(R.attr.black, flexboxLayout.getContext());
        }
        int i14 = iArr[buttonStyle.ordinal()];
        if (i14 == 1) {
            i12 = R.drawable.reformulation_bg_black;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.reformulation_bg_green;
        }
        button.setTextColor(iD2);
        button.setIconColor(ColorStateList.valueOf(iD2));
        button.setBackgroundResource(i12);
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    public final void G10(@Y61.k List<ReformulationElement> list, boolean z12) {
        int i12;
        FlexboxLayout flexboxLayout = this.f270652d;
        flexboxLayout.removeAllViews();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f270651c.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i13 = 0;
        for (ReformulationElement reformulationElement : list) {
            if (z12) {
                B80(flexboxLayout, reformulationElement);
                flexboxLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                if (flexboxLayout.getFlexLines().size() == 4) {
                    flexboxLayout.removeViews(i13, 1);
                    Button button = (Button) this.f270653e.inflate(R.layout.reformulation_chip, (ViewGroup) flexboxLayout, false);
                    button.setText("Ещё");
                    button.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(15, this, list));
                    Button.h(button, 0, R.drawable.ic_expand_20x7_black, 1);
                    ButtonStyle buttonStyle = this.f270656h;
                    if (buttonStyle != null) {
                        C80(button, buttonStyle);
                    }
                    flexboxLayout.addView(button);
                    flexboxLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    if (flexboxLayout.getFlexLines().size() != 4 || (i12 = i13 - 1) <= 0) {
                        return;
                    }
                    flexboxLayout.removeViews(i12, 1);
                    return;
                }
                i13++;
            } else {
                B80(flexboxLayout, reformulationElement);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    @Y61.k
    public final String NT() {
        return this.f270651c.getText().toString();
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    public final void Px(@Y61.k String str) {
        I5.a(this.f270651c, str, false);
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    public final int Se() {
        return this.f270652d.getChildCount();
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    @Y61.k
    public final W V1() {
        return this.f270657i.N(new s(this));
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    public final void X5(int i12) {
        this.f270651c.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.reformulations.q
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f270654f = (N) aVar;
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    public final void hy(@Y61.l ButtonStyle buttonStyle) {
        this.f270656h = buttonStyle;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f270654f.invoke();
    }

    @Override // com.avito.android.serp.adapter.reformulations.q
    @Y61.k
    public final ArrayList qr() {
        CharSequence text;
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = new C22829k0(this.f270652d).iterator();
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                return C42745f0.C(arrayList);
            }
            View view = (View) c22833m0.next();
            String string = null;
            Button button = view instanceof Button ? (Button) view : null;
            if (button != null && (text = button.getText()) != null) {
                string = text.toString();
            }
            arrayList.add(string);
        }
    }

    /* compiled from: ReformulationsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/reformulations/r$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            r.this.f270657i.accept(G0.f406611a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}

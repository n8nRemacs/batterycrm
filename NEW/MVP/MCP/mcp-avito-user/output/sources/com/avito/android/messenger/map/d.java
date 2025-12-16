package com.avito.android.messenger.map;

import L91.p;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.map.MapBottomSheet;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42161q;
import j.e0;
import j.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import l41.g;

/* compiled from: MapBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/d;", "Lcom/avito/android/messenger/map/MapBottomSheet;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements MapBottomSheet {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f196447r = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/map/MapBottomSheet$State;", d.class))};

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f196448b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f196449c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C35971x f196450d = new C35971x();

    /* renamed from: e, reason: collision with root package name */
    public final Resources f196451e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f196452f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BottomSheet f196453g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f196454h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f196455i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f196456j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f196457k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final NestedScrollView f196458l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ArrayList f196459m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Button f196460n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final z<BottomSheet.d> f196461o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final z<G0> f196462p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f196463q;

    /* compiled from: MapBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "visibility", "Lkotlin/G0;", "accept", "(Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f196464b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f196465c;

        public a(View view, d dVar) {
            this.f196464b = view;
            this.f196465c = dVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((BottomSheet.d) obj).equals(BottomSheet.d.c.f177838a)) {
                return;
            }
            this.f196464b.post(new com.avito.android.messenger.map.c(this.f196465c, 1));
        }
    }

    /* compiled from: MapBottomSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/d$b;", "Landroid/text/style/ImageSpan;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ImageSpan {
        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final void draw(@k Canvas canvas, @l CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
            Drawable drawable = getDrawable();
            canvas.save();
            canvas.translate(f12, (i16 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* compiled from: MapBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[MapBottomSheet.State.ActionButtonState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MapBottomSheet.State.ActionButtonState actionButtonState = MapBottomSheet.State.ActionButtonState.f196431b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MapBottomSheet.State.ActionButtonState actionButtonState2 = MapBottomSheet.State.ActionButtonState.f196431b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(@k View view, @f0 int i12, @e0 int i13, boolean z12) throws Resources.NotFoundException {
        this.f196448b = view;
        this.f196449c = z12;
        Resources resources = view.getResources();
        this.f196451e = resources;
        this.f196452f = LayoutInflater.from(view.getContext());
        BottomSheet.a aVar = BottomSheet.f177825a;
        View viewFindViewById = view.findViewById(R.id.messenger_map_bottom_sheet_layout);
        aVar.getClass();
        BottomSheet bottomSheetA = BottomSheet.a.a(viewFindViewById);
        this.f196453g = bottomSheetA;
        this.f196459m = new ArrayList();
        com.jakewharton.rxrelay3.b f177856o = bottomSheetA.getF177856o();
        this.f196461o = f177856o;
        this.f196463q = new com.jakewharton.rxrelay3.c<>();
        D6.g(bottomSheetA.getF177843b());
        bottomSheetA.n2(z12);
        bottomSheetA.u2();
        View viewX2 = bottomSheetA.x2(R.layout.messenger_platform_map_bottom_sheet_content);
        View viewFindViewById2 = viewX2.findViewById(R.id.messenger_map_bottom_sheet_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f196454h = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = viewX2.findViewById(R.id.messenger_map_bottom_sheet_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f196455i = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewX2.findViewById(R.id.messenger_map_bottom_sheet_collapsed_title_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f196456j = viewFindViewById4;
        View viewFindViewById5 = viewX2.findViewById(R.id.messenger_map_bottom_sheet_collapsed_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f196457k = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewX2.findViewById(R.id.messenger_map_bottom_sheet_description_scroll);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById6;
        this.f196458l = nestedScrollView;
        View viewFindViewById7 = viewX2.findViewById(R.id.messenger_map_bottom_sheet_action_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById7;
        this.f196460n = button;
        this.f196462p = C37722i.a(button);
        button.setAppearance(i12);
        button.setText(resources.getString(i13));
        nestedScrollView.setOnTouchListener(new p(2, this, viewX2));
        f177856o.getClass();
        f177856o.D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new a(viewX2, this));
    }

    public static void c(TextView textView) {
        Drawable drawableM = C35835l0.m(textView.getRootView().getContext(), R.attr.ic_outline_edit_16, R.attr.black);
        if (drawableM != null) {
            drawableM.setBounds(0, 0, drawableM.getIntrinsicWidth(), drawableM.getIntrinsicHeight());
            String str = ((Object) textView.getText()) + "  ";
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new b(drawableM, 0), str.length() - 1, str.length(), 17);
            textView.setText(spannableString);
        }
    }

    public static void e(View view, @InterfaceC42161q int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = view.getResources().getDimensionPixelSize(i12);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final MapBottomSheet.State a(com.avito.android.mvi.e<MapBottomSheet.State> eVar) {
        C35971x c35971x = this.f196450d;
        n<Object> nVar = f196447r[0];
        return (MapBottomSheet.State) c35971x.f319122b;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.avito.android.messenger.map.MapBottomSheet$State] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        C35971x c35971x = this.f196450d;
        n<Object> nVar = f196447r[0];
        c35971x.f319122b = (MapBottomSheet.State) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<MapBottomSheet.State> eVar, MapBottomSheet.State state, MapBottomSheet.State state2) throws Resources.NotFoundException {
        final int i12 = 0;
        MapBottomSheet.State state3 = state2;
        V2.f318762a.i("MapBottomSheet", "render() \n\t prevState = " + state + " \n\t curState = " + state3, null);
        boolean z12 = state3 instanceof MapBottomSheet.State.a;
        BottomSheet bottomSheet = this.f196453g;
        if (z12) {
            bottomSheet.l2(true);
            bottomSheet.close();
        } else {
            if (!(state3 instanceof MapBottomSheet.State.b)) {
                throw new NoWhenBranchMatchedException();
            }
            MapBottomSheet.State.b bVar = (MapBottomSheet.State.b) state3;
            D6.H(bottomSheet.getF177843b());
            bottomSheet.l2(bVar.f196439c);
            String str = bVar.f196437a;
            boolean zK2 = C43066x.K(str);
            boolean z13 = bVar.f196441e;
            boolean z14 = zK2 && z13;
            ArrayList arrayList = this.f196459m;
            boolean zIsEmpty = arrayList.isEmpty();
            LinearLayout linearLayout = this.f196454h;
            List<CharSequence> list = bVar.f196438b;
            if (!zIsEmpty || !list.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linearLayout.removeView((View) it.next());
                }
                arrayList.clear();
                if (!list.isEmpty()) {
                    int dimensionPixelSize = this.f196448b.getResources().getDimensionPixelSize(R.dimen.messenger_platform_map_bottom_sheet_descr_text_vertical_margin);
                    int i13 = 0;
                    for (Object obj : list) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        TextView textView = (TextView) this.f196452f.inflate(R.layout.messenger_platform_map_bottom_sheet_description_text, (ViewGroup) linearLayout, false);
                        textView.setText((CharSequence) obj);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setId(View.generateViewId());
                        textView.setTag("messenger_map_bottom_sheet_description_text");
                        if (i13 == 0 && z14) {
                            c(textView);
                            final int i15 = 1;
                            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.map.b

                                /* renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ d f196444c;

                                {
                                    this.f196444c = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    d dVar = this.f196444c;
                                    switch (i15) {
                                        case 0:
                                            n<Object>[] nVarArr = d.f196447r;
                                            dVar.f196463q.accept(G0.f406611a);
                                            break;
                                        default:
                                            n<Object>[] nVarArr2 = d.f196447r;
                                            dVar.f196463q.accept(G0.f406611a);
                                            break;
                                    }
                                }
                            });
                        }
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.bottomMargin = dimensionPixelSize;
                        linearLayout.addView(textView, i14, layoutParams);
                        arrayList.add(textView);
                        i13 = i14;
                    }
                }
            }
            int iOrdinal = bVar.f196440d.ordinal();
            Button button = this.f196460n;
            if (iOrdinal == 0) {
                button.setEnabled(true);
                button.setClickable(true);
                button.setLoading(false);
            } else if (iOrdinal == 1) {
                button.setEnabled(false);
                button.setClickable(false);
                button.setLoading(false);
            } else if (iOrdinal == 2) {
                button.setEnabled(true);
                button.setClickable(false);
                button.setLoading(true);
            }
            if (bVar.f196442f) {
                bottomSheet.j2();
            } else {
                bottomSheet.k2();
            }
            boolean zK3 = C43066x.K(str);
            View view = this.f196456j;
            NestedScrollView nestedScrollView = this.f196458l;
            TextView textView2 = this.f196455i;
            if (zK3) {
                D6.w(view);
                D6.w(textView2);
                e(nestedScrollView, R.dimen.messenger_platform_map_bottom_sheet_scroll_view_margin_top_no_title);
                e(linearLayout, R.dimen.messenger_platform_map_bottom_sheet_content_margin_top_no_title);
                nestedScrollView.setOnScrollChangeListener((NestedScrollView.e) null);
            } else {
                textView2.setText(str);
                this.f196457k.setText(str);
                if (z13) {
                    c(textView2);
                    textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.map.b

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ d f196444c;

                        {
                            this.f196444c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d dVar = this.f196444c;
                            switch (i12) {
                                case 0:
                                    n<Object>[] nVarArr = d.f196447r;
                                    dVar.f196463q.accept(G0.f406611a);
                                    break;
                                default:
                                    n<Object>[] nVarArr2 = d.f196447r;
                                    dVar.f196463q.accept(G0.f406611a);
                                    break;
                            }
                        }
                    });
                }
                D6.H(textView2);
                if (nestedScrollView.getScrollY() <= 0) {
                    D6.g(view);
                } else {
                    D6.H(view);
                }
                e(nestedScrollView, R.dimen.messenger_platform_map_bottom_sheet_scroll_view_margin_top);
                e(linearLayout, R.dimen.messenger_platform_map_bottom_sheet_content_margin_top);
                nestedScrollView.setOnScrollChangeListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 26));
            }
        }
        G0 g02 = G0.f406611a;
    }
}

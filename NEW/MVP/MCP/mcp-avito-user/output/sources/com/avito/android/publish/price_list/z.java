package com.avito.android.publish.price_list;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.input.Input;
import com.avito.android.publish.ActionMode;
import com.avito.android.publish.C33862g0;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;
import t3.l0;

/* compiled from: SelectPriceListView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/z;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f238939a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f238940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f238941c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f238942d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f238943e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f238944f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f238945g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f238946h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f238947i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f238948j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ImageView f238949k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Input f238950l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f238951m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f238952n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C33862g0 f238953o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f238954p;

    /* JADX WARN: Multi-variable type inference failed */
    public z(boolean z12, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar2) throws Resources.NotFoundException {
        this.f238939a = view;
        this.f238940b = cVar;
        this.f238941c = aVar;
        this.f238942d = lVar;
        this.f238943e = aVar2;
        this.f238944f = aVar3;
        this.f238945g = aVar4;
        this.f238946h = lVar2;
        View viewFindViewById = view.findViewById(R.id.select_price_list_header_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238947i = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_price_list_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238948j = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.select_price_list_clear_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f238949k = imageView;
        View viewFindViewById4 = view.findViewById(R.id.select_price_list_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        this.f238950l = input;
        View viewFindViewById5 = view.findViewById(R.id.select_price_list_recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f238951m = recyclerView;
        View viewFindViewById6 = view.findViewById(R.id.select_price_list_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f238952n = button;
        C33862g0 c33862g0 = new C33862g0(view.getRootView(), null);
        c33862g0.c(C35835l0.j(R.attr.ic_arrowBack24, view.getContext()));
        this.f238953o = c33862g0;
        this.f238954p = new com.avito.android.progress_overlay.l((ViewGroup) view, R.id.select_price_list_recycler, null, R.layout.publish_progress_overlay, 0, 20, null);
        view.getContext();
        recyclerView.setLayoutManager(new UnpredictiveLinearLayoutManager());
        ((O) recyclerView.getItemAnimator()).f53727g = false;
        recyclerView.setAdapter(jVar);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = c33862g0.f236022a;
        appBarLayoutWithTextAction.setNavigationTitle(null);
        TextView textView = appBarLayoutWithTextAction.f430576C;
        (textView != null ? textView : null).setText("");
        c33862g0.a(z12 ? ActionMode.f231832b : ActionMode.f231834d);
        c33862g0.b(new x(this), aVar4);
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.publish.price_list.w

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f238934c;

            {
                this.f238934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f238934c.f238941c.invoke();
                        break;
                    default:
                        this.f238934c.f238944f.invoke();
                        break;
                }
            }
        });
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.publish.price_list.w

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f238934c;

            {
                this.f238934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f238934c.f238941c.invoke();
                        break;
                    default:
                        this.f238934c.f238944f.invoke();
                        break;
                }
            }
        });
        if (!lVar2.f439745a.f439749b.b()) {
            com.avito.android.lib.design.input.n.c(input, lVar);
            input.setFocusByClearButton(false);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(R.style.Re23_Input_SearchDefaultL, d.n.f178939P);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(15);
        typedArrayObtainStyledAttributes.recycle();
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : y6.b(24);
        int iB2 = y6.b(16);
        int iB3 = y6.b(6);
        input.setFocusByClearButton(false);
        input.setLeftIconColor(colorStateList);
        input.k(intrinsicWidth + iB2 + iB3, input.f179335g);
        D6.f(input.findViewById(R.id.design_input_left_container), iB2, 0, iB3, 0, 10);
        com.avito.android.lib.design.input.n.c(input, new y(this, colorStateList, colorStateList2));
    }
}

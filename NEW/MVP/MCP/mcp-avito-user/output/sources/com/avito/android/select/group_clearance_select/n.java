package com.avito.android.select.group_clearance_select;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.util.C1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import cq0.InterfaceC39397a;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupClearanceView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/n;", "Lcom/avito/android/select/group_clearance_select/i;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC39397a, G0> f265532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Chips f265533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f265534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f265535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f265536e;

    /* renamed from: f, reason: collision with root package name */
    public final int f265537f;

    /* renamed from: g, reason: collision with root package name */
    public final int f265538g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f265539h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f265540i;

    /* renamed from: j, reason: collision with root package name */
    public float f265541j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f265542k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f265543l;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.k ViewGroup viewGroup, @Y61.k Button button, @Y61.k Y41.l<? super InterfaceC39397a, G0> lVar) {
        this.f265532a = lVar;
        View viewFindViewById = viewGroup.findViewById(R.id.chips_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.ui.Chips");
        }
        this.f265533b = (Chips) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.description_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265534c = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265535d = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.bottom_sheet_action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f265536e = textView;
        this.f265537f = C35835l0.d(R.attr.blue, viewGroup.getContext());
        this.f265538g = C35835l0.d(R.attr.gray28, viewGroup.getContext());
        View viewFindViewById5 = viewGroup.findViewById(R.id.clearance_image_car);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById5;
        this.f265539h = imageView;
        View viewFindViewById6 = viewGroup.findViewById(R.id.godzilla_image_view);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f265540i = (ImageView) viewFindViewById6;
        this.f265541j = imageView.getTranslationY();
        button.setOnClickListener(new j(this, 0));
        com.avito.android.lib.design.button.b.a(button, com.avito.android.printable_text.b.c(R.string.accept, new Serializable[0]).k0(viewGroup.getContext()), false);
        I5.a(textView, com.avito.android.printable_text.b.c(R.string.reset, new Serializable[0]).k0(viewGroup.getContext()), false);
    }

    public final void a(float f12) {
        C1.f318564a.getClass();
        if (C1.a()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f265541j, f12);
            valueAnimatorOfFloat.addUpdateListener(new AV.a(this, 16));
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
        }
    }
}

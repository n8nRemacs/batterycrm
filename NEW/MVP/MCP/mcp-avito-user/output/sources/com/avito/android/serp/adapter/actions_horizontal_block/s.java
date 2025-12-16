package com.avito.android.serp.adapter.actions_horizontal_block;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsHorizontalBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/s;", "Lcom/avito/android/serp/adapter/actions_horizontal_block/r;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f268695k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f268696b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f268697c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f268698d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Spinner f268699e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f268700f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f268701g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f268702h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Spinner f268703i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f268704j;

    public s(@Y61.k View view) {
        super(view);
        this.f268696b = view;
        View viewFindViewById = view.findViewById(R.id.left_block);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f268697c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon_left);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f268698d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icon_left_spinner);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f268699e = (Spinner) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title_left);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268700f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.right_block);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f268701g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.icon_right);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f268702h = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.icon_right_spinner);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f268703i = (Spinner) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.title_right);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268704j = (TextView) viewFindViewById8;
    }

    public static void B80(String str, ImageView imageView) {
        if (str == null) {
            D6.w(imageView);
            return;
        }
        Integer numValueOf = str.equals("Каталог новостроек") ? Integer.valueOf(R.drawable.ic_building_16) : str.equals("Квартиры") ? Integer.valueOf(R.drawable.ic_apartment_bold_12) : null;
        if (numValueOf != null) {
            imageView.setImageResource(numValueOf.intValue());
            D6.H(imageView);
            return;
        }
        Integer numA = com.avito.android.lib.util.q.a(str);
        if (numA != null) {
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), imageView.getContext()));
            D6.H(imageView);
        }
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void ES(@Y61.k Y41.a<G0> aVar) {
        this.f268697c.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(24, aVar));
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void IN() {
        D6.H(this.f268698d);
        D6.w(this.f268699e);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void Lr() {
        D6.w(this.f268701g);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void MB() {
        D6.w(this.f268697c);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void QY() {
        D6.H(this.f268702h);
        D6.w(this.f268703i);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void WQ() {
        D6.H(this.f268701g);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void X40(@Y61.l String str) {
        B80(str, this.f268702h);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void YM(@Y61.k String str) {
        if (str.length() > 0) {
            I5.a(this.f268700f, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void br() {
        D6.w(this.f268698d);
        D6.H(this.f268699e);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void e00(@Y61.k String str) {
        if (str.length() > 0) {
            I5.a(this.f268704j, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void gT(@Y61.l String str) {
        B80(str, this.f268698d);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void gW(@Y61.k Y41.a<G0> aVar) {
        this.f268701g.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(23, aVar));
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void setVisible(boolean z12) {
        D6.G(this.f268696b, z12);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void w00() {
        D6.w(this.f268702h);
        D6.H(this.f268703i);
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.r
    public final void z60() {
        D6.H(this.f268697c);
    }
}

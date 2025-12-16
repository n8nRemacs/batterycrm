package com.avito.android.serp.adapter.mini_menu.item;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MiniMenuElementItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/mini_menu/item/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f270358g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f270359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f270361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f270362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f270363f;

    public g(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.mini_menu_badge_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f270359b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.mini_menu_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f270360c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.mini_menu_badge_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270361d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.mini_menu_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270362e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.mini_menu_skeleton);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f270363f = viewFindViewById5;
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.f
    public final void R5(@Y61.k UniversalImage universalImage) {
        C35949t5.c(this.f270360c, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext()))), androidx.core.content.d.getDrawable(this.itemView.getContext(), R.drawable.mini_menu_icon_placeholder), null, null, 12);
        D6.H(this.f270360c);
        D6.w(this.f270361d);
        D6.H(this.f270359b);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.f
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new o(20, aVar));
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.f
    public final void bs(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        TextView textView = this.f270361d;
        textView.setText(str);
        Integer numA = com.avito.android.lib.util.e.a(str2);
        if (numA != null) {
            textView.setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(numA.intValue(), this.itemView.getContext())));
        }
        Integer numA2 = com.avito.android.lib.util.e.a(str3);
        if (numA2 != null) {
            textView.setTextColor(ColorStateList.valueOf(C35835l0.d(numA2.intValue(), this.itemView.getContext())));
        }
        D6.H(textView);
        D6.w(this.f270360c);
        D6.H(this.f270359b);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.f
    public final void s3() {
        D6.H(this.f270363f);
        D6.w(this.f270359b);
        D6.w(this.f270362e);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.f
    public final void setTitle(@Y61.k String str) {
        this.f270362e.setText(str);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.item.f
    public final void tc() {
        D6.w(this.f270363f);
        D6.H(this.f270359b);
        D6.H(this.f270362e);
    }
}

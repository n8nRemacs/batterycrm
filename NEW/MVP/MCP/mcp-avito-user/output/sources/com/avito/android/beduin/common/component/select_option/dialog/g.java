package com.avito.android.beduin.common.component.select_option.dialog;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OptionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/select_option/dialog/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f102487e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f102488b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f102489c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f102490d;

    public g(@k View view) {
        super(view);
        this.f102488b = view;
        View viewFindViewById = view.findViewById(R.id.option_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102489c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.option_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f102490d = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.beduin.common.component.select_option.dialog.f
    public final void Np(boolean z12) {
        this.f102490d.setVisibility(z12 ? 0 : 4);
    }

    @Override // com.avito.android.beduin.common.component.select_option.dialog.f
    public final void c(@k Y41.a<G0> aVar) {
        this.f102488b.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(28, aVar));
    }

    @Override // com.avito.android.beduin.common.component.select_option.dialog.f
    public final void setText(@k String str) {
        this.f102489c.setText(str);
    }
}

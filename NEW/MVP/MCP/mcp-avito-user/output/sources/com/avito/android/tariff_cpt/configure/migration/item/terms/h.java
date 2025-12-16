package com.avito.android.tariff_cpt.configure.migration.item.terms;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: CptMigrationTermsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/item/terms/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/configure/migration/item/terms/g;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f298071b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f298072c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f298073d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f298074e;

    public h(@k View view) {
        super(view);
        this.f298071b = (ImageView) view.findViewById(R.id.cpt_migration_terms_image_icon);
        this.f298072c = (TextView) view.findViewById(R.id.cpt_migration_terms_text_icon);
        TextView textView = (TextView) view.findViewById(R.id.cpt_migration_terms_text_title);
        this.f298073d = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.cpt_migration_terms_text_subtitle);
        this.f298074e = textView2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.item.terms.g
    public final void Wx(@l UniversalColor universalColor, @l Integer num) {
        Context context = this.itemView.getContext();
        Drawable drawableM = null;
        if (num != null) {
            if (universalColor != null) {
                Drawable drawableH = C35835l0.h(num.intValue(), context);
                if (drawableH != null) {
                    V0.a(drawableH, C48063a.f437606a.a(context, universalColor));
                    drawableM = drawableH;
                }
            } else {
                drawableM = C35835l0.m(context, num.intValue(), R.attr.gray48);
            }
        }
        C35821j2.a(this.f298071b, drawableM);
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.item.terms.g
    public final void cA(@l AttributedText attributedText) {
        j.a(this.f298072c, attributedText, null);
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.item.terms.g
    public final void e(@k AttributedText attributedText) {
        j.c(this.f298073d, attributedText, null);
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.item.terms.g
    public final void k(@l AttributedText attributedText) {
        j.a(this.f298074e, attributedText, null);
    }
}

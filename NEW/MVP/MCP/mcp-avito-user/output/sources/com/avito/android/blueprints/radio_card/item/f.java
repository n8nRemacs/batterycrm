package com.avito.android.blueprints.radio_card.item;

import Ca1.ViewOnClickListenerC13236c;
import JO.m;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RadioCardSelectItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/radio_card/item/f;", "LTV0/d;", "Lcom/avito/android/blueprints/radio_card/item/g;", "LJO/m;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.d<g, m> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<m, Boolean, G0> f106519b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, G0> f106520c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f106521d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k p<? super m, ? super Boolean, G0> pVar, @k l<? super String, G0> lVar, @k l<? super DeepLink, G0> lVar2) {
        this.f106519b = pVar;
        this.f106520c = lVar;
        this.f106521d = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numA;
        g gVar = (g) eVar;
        m mVar = (m) aVar;
        c cVar = new c(this);
        d dVar = new d(this);
        e eVar2 = new e(this);
        I5.a(gVar.f106524c, mVar.f8962c, false);
        I5.a(gVar.f106525d, mVar.f8975p, false);
        Context context = gVar.f106531j;
        UniversalImage universalImage = mVar.f8969j;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        SimpleDraweeView simpleDraweeView = gVar.f106526e;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView);
            C35949t5.c(gVar.f106526e, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
        }
        boolean z12 = mVar.f8964e;
        ConstraintLayout constraintLayout = gVar.f106523b;
        constraintLayout.setSelected(z12);
        gVar.f106530i.setChecked(mVar.f8964e);
        constraintLayout.setBackground(androidx.core.content.d.getDrawable(context, mVar.f8971l ? R.drawable.background_radio_card_error : mVar.f8964e ? R.drawable.background_radio_card_checked : R.drawable.background_radio_card_unchecked));
        SelectParameter.Value.LinkButton linkButton = mVar.f8973n;
        if (linkButton != null) {
            String title = linkButton.getTitle();
            TextView textView = gVar.f106529h;
            I5.a(textView, title, false);
            if (linkButton.getIconType() != null && (numA = q.a(linkButton.getIconType())) != null) {
                I5.d(textView, C35835l0.h(numA.intValue(), context), null, 14);
            }
            textView.setOnClickListener(new ViewOnClickListenerC13236c(linkButton, cVar, dVar, 20));
        }
        List<SelectParameter.Value.Paragraph> list = mVar.f8972m;
        if (list != null) {
            LinearLayout linearLayout = gVar.f106528g;
            linearLayout.removeAllViews();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setIntrinsicHeight(y6.b(1));
            shapeDrawable.getPaint().setColor(androidx.core.content.d.getColor(context, R.color.warmGray8));
            for (SelectParameter.Value.Paragraph paragraph : list) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.paragraph_row_view, (ViewGroup) linearLayout, false);
                LinearLayout linearLayout2 = viewInflate instanceof LinearLayout ? (LinearLayout) viewInflate : null;
                TextView textView2 = linearLayout2 != null ? (TextView) linearLayout2.findViewById(R.id.paragraph_title) : null;
                TextView textView3 = linearLayout2 != null ? (TextView) linearLayout2.findViewById(R.id.paragraph_text) : null;
                if (textView2 != null) {
                    I5.a(textView2, paragraph.getTitle(), false);
                }
                if (textView3 != null) {
                    I5.a(textView3, paragraph.getValue(), false);
                }
                linearLayout.addView(linearLayout2);
            }
            linearLayout.setDividerDrawable(shapeDrawable);
            linearLayout.setShowDividers(2);
        }
        String str = mVar.f8974o;
        if (str != null) {
            I5.a(gVar.f106527f, str, false);
        }
        constraintLayout.setOnClickListener(new ViewOnClickListenerC13236c(gVar, mVar, eVar2, 19));
    }
}

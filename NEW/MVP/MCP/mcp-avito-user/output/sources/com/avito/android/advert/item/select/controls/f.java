package com.avito.android.advert.item.select.controls;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.auto_select.SelectControlsButtonParams;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: AutoSelectControlsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/controls/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/select/controls/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f79408e = {m0.f406844a.e(new Y(f.class, "deepLinkListener", "getDeepLinkListener()Lkotlin/jvm/functions/Function1;", 0))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f79409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f79410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.properties.h f79411d;

    public f(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.first_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f79409b = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.second_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f79410c = (Button) viewFindViewById2;
        kotlin.properties.c.f406879a.getClass();
        this.f79411d = kotlin.properties.c.a();
    }

    public final void B80(Button button, SelectControlsButtonParams selectControlsButtonParams) {
        Integer numA;
        if (selectControlsButtonParams == null) {
            D6.w(button);
            button.setOnClickListener(null);
            return;
        }
        String style = selectControlsButtonParams.getStyle();
        if (style != null) {
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(style));
        }
        D6.H(button);
        if (selectControlsButtonParams.getIcon() != null) {
            String icon = selectControlsButtonParams.getIcon();
            if (icon != null && (numA = q.a(icon)) != null) {
                Drawable drawableH = C35835l0.h(numA.intValue(), button.getContext());
                if (drawableH != null) {
                    button.setImageDrawable(drawableH);
                }
            }
        } else {
            button.setText(selectControlsButtonParams.getText());
            String secondaryText = selectControlsButtonParams.getSecondaryText();
            if (secondaryText != null) {
                button.setSubtitle(secondaryText);
            }
        }
        button.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(7, this, selectControlsButtonParams));
        DeepLink onShowDeeplink = selectControlsButtonParams.getOnShowDeeplink();
        if (onShowDeeplink != null) {
            ((Y41.l) this.f79411d.getValue(this, f79408e[0])).invoke(onShowDeeplink);
        }
    }

    @Override // com.avito.android.advert.item.select.controls.e
    public final void BX(@Y61.l SelectControlsButtonParams selectControlsButtonParams) {
        B80(this.f79410c, selectControlsButtonParams);
    }

    @Override // com.avito.android.advert.item.select.controls.e
    public final int N8() {
        int[] iArr = new int[2];
        Button button = this.f79409b;
        button.getLocationOnScreen(iArr);
        return button.getHeight() + iArr[1];
    }

    @Override // com.avito.android.advert.item.select.controls.e
    public final void SD(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f79411d.setValue(this, f79408e[0], lVar);
    }

    @Override // com.avito.android.advert.item.select.controls.e
    public final void bP(@Y61.l SelectControlsButtonParams selectControlsButtonParams) {
        B80(this.f79409b, selectControlsButtonParams);
    }
}

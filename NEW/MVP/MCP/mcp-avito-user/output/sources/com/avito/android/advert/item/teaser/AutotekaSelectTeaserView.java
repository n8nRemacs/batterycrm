package com.avito.android.advert.item.teaser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaSelectTeaserView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/teaser/AutotekaSelectTeaserView;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "b", "Lkotlin/C;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "c", "getDescriptionView", "descriptionView", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AutotekaSelectTeaserView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C titleView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C descriptionView;

    @X41.j
    public AutotekaSelectTeaserView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final TextView getDescriptionView() {
        return (TextView) this.descriptionView.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.getValue();
    }

    public final void a(@Y61.l AttributedText attributedText, @Y61.l String str) {
        I5.a(getTitleView(), str, false);
        com.avito.android.util.text.j.a(getDescriptionView(), attributedText, null);
    }

    public AutotekaSelectTeaserView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.titleView = C42727D.c(new e(this));
        this.descriptionView = C42727D.c(new d(this));
        View.inflate(context, R.layout.advert_details_select_teaser_container, this);
    }
}

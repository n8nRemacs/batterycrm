package com.avito.android.component.advert_contact_bar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.insights.Insight;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsContactBarUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/o;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.component.advert_contact_bar.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29568o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C29568o f125193a = new C29568o();

    /* renamed from: b, reason: collision with root package name */
    public static final int f125194b = y6.b(6);

    @Y61.l
    public static TextView a(@Y61.k Insight insight, @Y61.k LinearLayout linearLayout) {
        View viewFindViewById = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_contact_bar_insight, (ViewGroup) linearLayout, false).findViewById(R.id.adv_det_contact_bar_insight);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        AttributedText text = insight.getText();
        if (text == null) {
            return null;
        }
        com.avito.android.util.text.j.a(textView, text, null);
        return textView;
    }
}

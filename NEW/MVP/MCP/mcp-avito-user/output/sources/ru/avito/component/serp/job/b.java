package ru.avito.component.serp.job;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: SerpAdvertRichJobAdvantagesRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/b;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f430466a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f430467b;

    public b(@Y61.k LayoutInflater layoutInflater, @Y61.k LinearLayout linearLayout) {
        this.f430466a = layoutInflater;
        this.f430467b = linearLayout;
    }

    public final void a(@InterfaceC42150f int i12, @Y61.l List list) {
        LinearLayout linearLayout = this.f430467b;
        linearLayout.removeAllViews();
        List list2 = list;
        boolean z12 = list2 == null || list2.isEmpty();
        linearLayout.setVisibility(!z12 ? 0 : 8);
        if (z12 || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SellerInfoAdvantage sellerInfoAdvantage = (SellerInfoAdvantage) it.next();
            View viewInflate = this.f430466a.inflate(R.layout.advert_item_rich_job_advantage_item, (ViewGroup) linearLayout, false);
            LinearLayout linearLayout2 = viewInflate instanceof LinearLayout ? (LinearLayout) viewInflate : null;
            if (linearLayout2 != null) {
                View viewFindViewById = linearLayout2.findViewById(R.id.advantage_item_logo);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById;
                imageView.setImageTintList(ColorStateList.valueOf(C48063a.f437606a.a(linearLayout2.getContext(), sellerInfoAdvantage.getColor())));
                Integer numA = q.a(sellerInfoAdvantage.getIcon());
                imageView.setImageDrawable(numA != null ? C35835l0.h(numA.intValue(), imageView.getContext()) : null);
                View viewFindViewById2 = linearLayout2.findViewById(R.id.advantage_item_title);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById2;
                textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
                I5.a(textView, sellerInfoAdvantage.getText(), false);
                linearLayout.addView(linearLayout2);
            }
        }
    }
}

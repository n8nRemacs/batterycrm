package com.avito.android.publish.imv;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.category_parameters.slot.imv.MarketValueItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesInstantMarketValueViewDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/imv/c;", "Lcom/avito/android/publish/imv/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutInflater f236062a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ShadowFrameLayout f236063b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f236064c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f236065d;

    /* renamed from: e, reason: collision with root package name */
    public final Flow f236066e;

    public c(@k Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f236062a = layoutInflaterFrom;
        ShadowFrameLayout shadowFrameLayout = (ShadowFrameLayout) layoutInflaterFrom.inflate(R.layout.services_instant_market_value_layout, (ViewGroup) null);
        this.f236063b = shadowFrameLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) shadowFrameLayout.findViewById(R.id.container);
        this.f236064c = constraintLayout;
        this.f236065d = (TextView) constraintLayout.findViewById(R.id.imv_title);
        this.f236066e = (Flow) constraintLayout.findViewById(R.id.bubbles);
    }

    public final void a(@k a aVar, @k l<? super BubbleInfo, G0> lVar) {
        ConstraintLayout constraintLayout;
        int i12;
        for (MarketValueItem marketValueItem : aVar.f236061a) {
            if (marketValueItem instanceof MarketValueItem.Description) {
                com.avito.android.util.text.j.a(this.f236065d, ((MarketValueItem.Description) marketValueItem).getText(), null);
            } else if (marketValueItem instanceof MarketValueItem.Bubbles) {
                List<BubbleInfo> list = ((MarketValueItem.Bubbles) marketValueItem).getList();
                Flow flow = this.f236066e;
                int[] referencedIds = flow.getReferencedIds();
                int length = referencedIds.length;
                int i13 = 0;
                while (true) {
                    constraintLayout = this.f236064c;
                    if (i13 >= length) {
                        break;
                    }
                    View viewById = constraintLayout.getViewById(referencedIds[i13]);
                    constraintLayout.removeView(viewById);
                    int id2 = viewById.getId();
                    if (id2 != -1) {
                        flow.f44237f = null;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= flow.f44234c) {
                                break;
                            }
                            if (flow.f44233b[i14] == id2) {
                                while (true) {
                                    i12 = flow.f44234c - 1;
                                    if (i14 >= i12) {
                                        break;
                                    }
                                    int[] iArr = flow.f44233b;
                                    int i15 = i14 + 1;
                                    iArr[i14] = iArr[i15];
                                    i14 = i15;
                                }
                                flow.f44233b[i12] = 0;
                                flow.f44234c = i12;
                            } else {
                                i14++;
                            }
                        }
                        flow.requestLayout();
                    }
                    i13++;
                }
                for (BubbleInfo bubbleInfo : list) {
                    Button button = (Button) this.f236062a.inflate(R.layout.services_instant_market_value_bubble_item, (ViewGroup) constraintLayout, false);
                    button.setId(View.generateViewId());
                    button.setText(bubbleInfo.getText());
                    button.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(lVar, bubbleInfo));
                    constraintLayout.addView(button);
                    if (button != flow && button.getId() != -1 && button.getParent() != null) {
                        flow.f44237f = null;
                        flow.d(button.getId());
                        flow.requestLayout();
                    }
                }
            }
        }
    }
}

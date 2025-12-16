package com.avito.android.comfortable_deal.deal.item.agent;

import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AgentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/agent/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/agent/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f121175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f121176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f121177d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f121178e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f121179f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f121180g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DescriptionListParameterLine f121181h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.a<G0> f121182i;

    public i(@Y61.k View view) {
        super(view);
        this.f121175b = view.getContext();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.agent_item);
        this.f121176c = (ImageView) view.findViewById(R.id.agent_item_image);
        this.f121177d = (ImageView) view.findViewById(R.id.agent_item_image_icon);
        this.f121178e = (TextView) view.findViewById(R.id.agent_item_price);
        this.f121179f = (TextView) view.findViewById(R.id.agent_item_title);
        this.f121180g = (TextView) view.findViewById(R.id.agent_item_address);
        this.f121181h = (DescriptionListParameterLine) view.findViewById(R.id.agent_item_stats);
        constraintLayout.setOnClickListener(new h(this, 0));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void C(@Y61.k String str) {
        this.f121180g.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void OW(@Y61.k List<k> list) {
        List<k> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (k kVar : list2) {
            String str = kVar.f121183a;
            StringBuilder sb2 = new StringBuilder();
            int i12 = kVar.f121184b;
            sb2.append(i12);
            Integer num = kVar.f121185c;
            if (num != null) {
                sb2.append(" +");
                sb2.append(num.intValue());
            }
            String string = sb2.toString();
            if (num != null) {
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.d.getColor(this.f121175b, R.color.green600)), String.valueOf(i12).length(), string.length(), 17);
                string = spannableString;
            }
            arrayList.add(new com.avito.android.lib.design.description_list.a(str, string, null, null, null, 28, null));
        }
        DescriptionListParameterLine descriptionListParameterLine = this.f121181h;
        descriptionListParameterLine.setItems(arrayList);
        D6.G(descriptionListParameterLine, !list.isEmpty());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void XG(@Y61.k Y41.a<G0> aVar) {
        this.f121182i = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void Z(@l String str) {
        Integer numA = str != null ? q.a(str) : null;
        Context context = this.f121175b;
        Drawable drawableH = numA != null ? C35835l0.h(numA.intValue(), context) : null;
        if (drawableH != null) {
            V0.a(drawableH, C35835l0.d(R.attr.constantWhite, context));
        }
        this.f121177d.setImageDrawable(drawableH);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void j1(@l Uri uri) {
        if (uri == null) {
            return;
        }
        com.avito.android.image_loader.glide.utils.b.b(this.f121176c, uri, 0, y6.b(12));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void p(@Y61.k String str) {
        this.f121178e.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.agent.g
    public final void setTitle(@Y61.k String str) {
        this.f121179f.setText(str);
    }
}

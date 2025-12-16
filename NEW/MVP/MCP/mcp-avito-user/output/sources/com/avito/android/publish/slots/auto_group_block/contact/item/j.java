package com.avito.android.publish.slots.auto_group_block.contact.item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.slots.auto_group_block.contact.item.c;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GroupContactView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/contact/item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/auto_group_block/contact/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f243092d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f243093b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f243094c;

    public j(@k View view) {
        super(view);
        this.f243093b = (LinearLayout) view.findViewById(R.id.group_contact_blocks_container);
        this.f243094c = (Button) view.findViewById(R.id.group_contact_button);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.contact.item.i
    public final void V0(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f243094c, str, false);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.contact.item.i
    public final void a0(@k Y41.a<G0> aVar) {
        this.f243094c.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(26, aVar));
    }

    @Override // com.avito.android.publish.slots.auto_group_block.contact.item.i
    public final void kz(@k ArrayList arrayList) {
        LinearLayout linearLayout = this.f243093b;
        linearLayout.removeAllViews();
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            c.a aVar = (c.a) obj;
            com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
            aVar2.setTextAppearance(C35835l0.j(aVar.f243080a.f243085b, aVar2.getContext()));
            aVar2.setText(aVar.f243080a.f243084a);
            linearLayout.addView(aVar2);
            com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
            Context context = aVar3.getContext();
            c.a.C7287a c7287a = aVar.f243081b;
            aVar3.setTextAppearance(C35835l0.j(c7287a.f243083b, context));
            aVar3.setText(c7287a.f243082a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(y6.b(0), y6.b(2), y6.b(0), i12 != arrayList.size() + (-1) ? y6.b(16) : y6.b(0));
            aVar3.setLayoutParams(layoutParams);
            linearLayout.addView(aVar3);
            i12 = i13;
        }
    }
}

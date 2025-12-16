package com.avito.android.realty_agency.blueprint.text_block;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.realty_agency.blueprint.text_block.TextBlockItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: TextBlockItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/blueprint/text_block/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/realty_agency/blueprint/text_block/e;", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f250898b;

    /* compiled from: TextBlockItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TextBlockItem.Alignment.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextBlockItem.Alignment alignment = TextBlockItem.Alignment.f250889b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(@k View view) {
        super(view);
        this.f250898b = (TextView) view;
    }

    @Override // com.avito.android.realty_agency.blueprint.text_block.e
    public final void Ea(int i12, int i13) {
        D6.f(this.f250898b, 0, y6.b(i12), 0, y6.b(i13), 5);
    }

    @Override // com.avito.android.realty_agency.blueprint.text_block.e
    public final void Y2(@k PrintableText printableText) {
        TextView textView = this.f250898b;
        I5.a(textView, printableText.Y4(textView.getContext()), false);
    }

    @Override // com.avito.android.realty_agency.blueprint.text_block.e
    public final void mE(@k TextBlockItem.Alignment alignment) {
        int iOrdinal = alignment.ordinal();
        this.f250898b.setGravity(iOrdinal != 1 ? iOrdinal != 2 ? 8388611 : 8388613 : 17);
    }

    @Override // com.avito.android.realty_agency.blueprint.text_block.e
    public final void setAppearance(@InterfaceC42150f int i12) {
        TextView textView = this.f250898b;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }

    @Override // com.avito.android.realty_agency.blueprint.text_block.e
    public final void setColor(@InterfaceC42150f int i12) {
        TextView textView = this.f250898b;
        textView.setTextColor(C35835l0.e(i12, textView.getContext()));
    }
}

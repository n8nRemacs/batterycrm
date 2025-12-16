package com.avito.android.advert_core.block_header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: BlockHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/block_header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/block_header/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f83008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f83009c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f83010d;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f83008b = aVar;
        this.f83009c = view.findViewById(R.id.block_header_divider_top);
        this.f83010d = (TextView) view.findViewById(R.id.block_header_title);
    }

    @Override // com.avito.android.advert_core.block_header.f
    public final void bq() {
        D6.w(this.f83009c);
    }

    @Override // com.avito.android.advert_core.block_header.f
    public final void e(@l AttributedText attributedText) {
        TextView textView = this.f83010d;
        if (textView != null) {
            j.a(textView, attributedText, this.f83008b);
        }
    }

    @Override // com.avito.android.advert_core.block_header.f
    public final void nt() {
        D6.H(this.f83009c);
    }
}

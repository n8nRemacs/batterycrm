package com.avito.android.publish.items.promo_block;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBlockRedesignedItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/promo_block/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/promo_block/j;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f237069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f237070c;

    /* compiled from: PromoBlockRedesignedItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/items/promo_block/e$a;", "", "<init>", "()V", "", "BOTTOM_MARGIN", "I", "HORIZONTAL_MARGIN", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.publish_promo_block);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f237069b = (Banner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.publish_promo_block_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f237070c = viewFindViewById2;
    }

    @Override // com.avito.android.publish.items.promo_block.j
    public final void F5() {
        Banner banner = this.f237069b;
        D6.b(this.f237070c, Integer.valueOf(D6.i(10, banner.getContext())), 0, Integer.valueOf(D6.i(10, banner.getContext())), Integer.valueOf(D6.i(32, banner.getContext())));
    }

    @Override // com.avito.android.publish.items.promo_block.j
    public final void X4(int i12) {
        this.f237069b.setAppearanceFromAttr(i12);
    }

    @Override // com.avito.android.publish.items.promo_block.j
    public final void b(@l String str) {
        TextView textView = (TextView) this.f237069b.findViewById(R.id.publish_promo_block_title);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.avito.android.publish.items.promo_block.j
    public final void cF() {
        Banner banner = this.f237069b;
        D6.b(this.f237070c, Integer.valueOf(D6.i(10, banner.getContext())), 0, Integer.valueOf(D6.i(10, banner.getContext())), 0);
    }

    @Override // com.avito.android.publish.items.promo_block.j
    public final void x3(@l String str) {
        TextView textView = (TextView) this.f237069b.findViewById(R.id.publish_promo_block_info);
        if (textView != null) {
            textView.setText(str);
        }
    }
}

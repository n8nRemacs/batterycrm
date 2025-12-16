package com.avito.android.publish.price_list.items.group;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectPriceListGroupItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/group/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/group/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f238646e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f238647b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f238648c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f238649d;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select_price_list_group_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f238647b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_price_list_group_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238648c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.select_price_list_group_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f238649d = (ImageView) viewFindViewById3;
    }

    @Override // com.avito.android.publish.price_list.items.group.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f238647b.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(4, aVar));
    }

    @Override // com.avito.android.publish.price_list.items.group.k
    public final void n3(boolean z12) {
        Integer numValueOf = Integer.valueOf(z12 ? R.drawable.common_ic_arrow_up_20 : R.drawable.common_ic_arrow_down_20);
        ImageView imageView = this.f238649d;
        imageView.setImageResource(numValueOf.intValue());
        D6.H(imageView);
    }

    @Override // com.avito.android.publish.price_list.items.group.k
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f238648c, str, false);
    }
}

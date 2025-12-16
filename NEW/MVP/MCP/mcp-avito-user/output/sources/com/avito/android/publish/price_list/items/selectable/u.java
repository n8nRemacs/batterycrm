package com.avito.android.publish.price_list.items.selectable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectablePriceListItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/u;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/selectable/r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f238705f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f238706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f238707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f238708d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f238709e;

    public u(@Y61.k View view) {
        super(view);
        this.f238706b = view;
        this.f238707c = (TextView) view.findViewById(R.id.selectable_price_list_title);
        this.f238708d = (TextView) view.findViewById(R.id.selectable_price_list_subtitle);
        this.f238709e = (ImageView) view.findViewById(R.id.selectable_price_list_icon);
    }

    @Override // com.avito.android.publish.price_list.items.selectable.r
    public final void Zd(@Y61.k t tVar) {
        this.f238709e.setImageResource(tVar.getF238704b());
    }

    @Override // com.avito.android.publish.price_list.items.selectable.r
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f238706b.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(7, aVar));
    }

    @Override // com.avito.android.publish.price_list.items.selectable.r
    public final void f(@Y61.l String str) {
        TextView textView = this.f238708d;
        I5.a(textView, str, false);
        textView.setTextColor(C35835l0.d(R.attr.black, this.f238706b.getContext()));
    }

    @Override // com.avito.android.publish.price_list.items.selectable.r
    public final void setError(@Y61.k String str) {
        TextView textView = this.f238708d;
        I5.a(textView, str, false);
        textView.setTextColor(C35835l0.d(R.attr.red600, this.f238706b.getContext()));
    }

    @Override // com.avito.android.publish.price_list.items.selectable.r
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f238707c, str, false);
    }
}

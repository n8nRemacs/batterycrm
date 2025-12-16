package com.avito.android.profile.pro.impl.screen.item.orders;

import D90.a;
import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.horizontal_scroll_widget.HorizontalScrollView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProOrdersView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/orders/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/orders/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f223376f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f223377b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f223378c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f223379d;

    /* renamed from: e, reason: collision with root package name */
    public final HorizontalScrollView f223380e;

    public h(@k View view, @k com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f223377b = dVar;
        this.f223378c = (TextView) view.findViewById(R.id.orders_title);
        this.f223379d = (TextView) view.findViewById(R.id.orders_badge);
        this.f223380e = (HorizontalScrollView) view.findViewById(R.id.orders);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.profile.pro.impl.screen.item.orders.f
    public final void V60(@k final ProfileProOrdersItem profileProOrdersItem, @k final l<? super D90.a, G0> lVar) {
        String str = profileProOrdersItem.f223360c;
        TextView textView = this.f223378c;
        I5.a(textView, str, false);
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.orders.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                ProfileProOrdersItem profileProOrdersItem2 = profileProOrdersItem;
                switch (i12) {
                    case 0:
                        int i13 = h.f223376f;
                        DeepLink deepLink = profileProOrdersItem2.f223362e;
                        if (deepLink != null) {
                            lVar2.invoke(new a.r(deepLink));
                            break;
                        }
                        break;
                    default:
                        int i14 = h.f223376f;
                        DeepLink deepLink2 = profileProOrdersItem2.f223362e;
                        if (deepLink2 != null) {
                            lVar2.invoke(new a.r(deepLink2));
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView2 = this.f223379d;
        I5.a(textView2, profileProOrdersItem.f223361d, false);
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.orders.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                ProfileProOrdersItem profileProOrdersItem2 = profileProOrdersItem;
                switch (i13) {
                    case 0:
                        int i132 = h.f223376f;
                        DeepLink deepLink = profileProOrdersItem2.f223362e;
                        if (deepLink != null) {
                            lVar2.invoke(new a.r(deepLink));
                            break;
                        }
                        break;
                    default:
                        int i14 = h.f223376f;
                        DeepLink deepLink2 = profileProOrdersItem2.f223362e;
                        if (deepLink2 != null) {
                            lVar2.invoke(new a.r(deepLink2));
                            break;
                        }
                        break;
                }
            }
        });
        HorizontalScrollView horizontalScrollView = this.f223380e;
        D6.w(horizontalScrollView.f222313h);
        D6.w(horizontalScrollView.f222311f);
        D6.w(horizontalScrollView.f222310e);
        RecyclerView recyclerView = horizontalScrollView.f222312g;
        com.avito.konveyor.adapter.d dVar = this.f223377b;
        recyclerView.setAdapter(dVar);
        dVar.l(profileProOrdersItem.f223364g, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223378c.setOnClickListener(null);
        this.f223379d.setOnClickListener(null);
    }
}

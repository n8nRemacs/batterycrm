package com.avito.android.item_map.view;

import android.net.Uri;
import com.avito.android.R;
import com.avito.android.item_map.ItemMapFragment;
import com.avito.android.webview.l;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.item_map.view.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31077n extends kotlin.jvm.internal.N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f173629l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31077n(I i12) {
        super(1);
        this.f173629l = i12;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        ItemMapFragment itemMapFragment = this.f173629l.f173424k;
        if (itemMapFragment != null) {
            com.avito.android.webview.m mVar = itemMapFragment.f173244M0;
            if (mVar == null) {
                mVar = null;
            }
            itemMapFragment.startActivity(l.a.a(mVar, Uri.parse(itemMapFragment.getString(R.string.osm_url)), null, 6));
        }
        return G0.f406611a;
    }
}

package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import TV0.g;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import zw0.InterfaceC50637a;

/* compiled from: NdTrxEntryPointBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/w;", "LTV0/b;", "Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/t;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements TV0.b<t, ShortcutNavigationItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f283332a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50637a f283333b;

    /* compiled from: NdTrxEntryPointBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/u;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, u> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final u invoke(ViewGroup viewGroup, View view) {
            return new u(view, w.this.f283333b);
        }
    }

    public w(@Y61.k s sVar, @Y61.k InterfaceC50637a interfaceC50637a) {
        this.f283332a = sVar;
        this.f283333b = interfaceC50637a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f283332a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.nd_trx_horizontal_chips_item, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        Uri uri;
        if (aVar instanceof ShortcutNavigationItem) {
            DeepLink f283245d = ((ShortcutNavigationItem) aVar).getF283245d();
            if (L.f((f283245d == null || (uri = f283245d.getUri()) == null) ? null : uri.getPath(), "/realtyAgency/search")) {
                return true;
            }
        }
        return false;
    }
}

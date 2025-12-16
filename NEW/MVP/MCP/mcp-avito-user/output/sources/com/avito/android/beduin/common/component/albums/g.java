package com.avito.android.beduin.common.component.albums;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.albums.items.AlbumItem;
import com.avito.android.beduin.common.component.image.OverlayStyle;
import com.avito.android.beduin.common.component.image.Size;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.util.D6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAlbumLayout.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000e\u001a\u00020\u00052!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/g;", "Landroid/widget/LinearLayout;", "", "Lcom/avito/android/beduin/common/component/albums/AlbumElement;", "items", "Lkotlin/G0;", "setImages", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "position", "listener", "setAlbumClickListener", "(LY41/l;)V", "b", "Ljava/lang/Integer;", "getInterItemSpacing", "()Ljava/lang/Integer;", "interItemSpacing", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "c", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "getOverlay", "()Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "overlay", "", "d", "Ljava/lang/Boolean;", "getShowsPageIndicator", "()Ljava/lang/Boolean;", "showsPageIndicator", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public final Integer interItemSpacing;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public final OverlayStyle overlay;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public final Boolean showsPageIndicator;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f100635e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f100636f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f100637g;

    /* renamed from: h, reason: collision with root package name */
    public int f100638h;

    /* renamed from: i, reason: collision with root package name */
    public int f100639i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final PageIndicatorRe23 f100640j;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context, AttributeSet attributeSet, int i12, Integer num, Size size, OverlayStyle overlayStyle, Boolean bool, int i13, C42822w c42822w) throws BlueprintCollisionException {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        num = (i13 & 8) != 0 ? null : num;
        size = (i13 & 16) != 0 ? null : size;
        overlayStyle = (i13 & 32) != 0 ? null : overlayStyle;
        bool = (i13 & 64) != 0 ? null : bool;
        super(context, attributeSet, i12);
        this.interItemSpacing = num;
        this.overlay = overlayStyle;
        this.showsPageIndicator = bool;
        LayoutInflater.from(context).inflate(R.layout.beduin_component_album, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.albums_recycler);
        this.f100635e = recyclerView;
        this.f100640j = (PageIndicatorRe23) findViewById(R.id.gallery_page_indicator);
        I.b(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        com.avito.android.beduin.common.component.albums.items.b bVar = new com.avito.android.beduin.common.component.albums.items.b(new com.avito.android.beduin.common.component.albums.items.d(new f(this)), size);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        h hVar = new h(aVarA, aVarA, null, 4, null);
        this.f100636f = hVar;
        recyclerView.setAdapter(new j(hVar, aVarA));
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @Override // android.view.ViewGroup, android.view.View
    @l
    public final OverlayStyle getOverlay() {
        return this.overlay;
    }

    @l
    public final Boolean getShowsPageIndicator() {
        return this.showsPageIndicator;
    }

    public final void setAlbumClickListener(@k Y41.l<? super Integer, G0> listener) {
        this.f100637g = listener;
    }

    public final void setImages(@k List<AlbumElement> items) {
        List<AlbumElement> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        boolean z12 = false;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new AlbumItem(String.valueOf(i12), (AlbumElement) obj, this.f100638h, this.f100639i, this.overlay));
            i12 = i13;
        }
        this.f100636f.f338510e = new UV0.c(arrayList);
        RecyclerView recyclerView = this.f100635e;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (L.f(this.showsPageIndicator, Boolean.TRUE) && items.size() > 1) {
            z12 = true;
        }
        PageIndicatorRe23 pageIndicatorRe23 = this.f100640j;
        if (pageIndicatorRe23 != null) {
            com.avito.android.lib.design.page_indicator_re23.b.c(pageIndicatorRe23);
        }
        D6.G(pageIndicatorRe23, z12);
        if (!z12 || pageIndicatorRe23 == null) {
            return;
        }
        com.avito.android.lib.design.page_indicator_re23.b.a(pageIndicatorRe23, recyclerView);
    }
}

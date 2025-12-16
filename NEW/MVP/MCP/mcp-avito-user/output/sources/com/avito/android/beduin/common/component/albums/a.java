package com.avito.android.beduin.common.component.albums;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinAlbumComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/albums/BeduinAlbumComponentModel;", "Lcom/avito/android/beduin/common/component/albums/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinAlbumComponentModel, g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100623e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinAlbumComponentModel f100624f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100625g = true;

    /* compiled from: BeduinAlbumComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.albums.a$a, reason: collision with other inner class name */
    public static final class C3020a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3020a f100626a = new C3020a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f100627b = Collections.singletonList("album");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinAlbumComponentModel> f100628c = BeduinAlbumComponentModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinAlbumComponentModel> S() {
            return f100628c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f100627b;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinAlbumComponentModel beduinAlbumComponentModel) {
        this.f100623e = interfaceC15523b;
        this.f100624f = beduinAlbumComponentModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100624f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF100735h() {
        return this.f100625g;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Context context = viewGroup.getContext();
        BeduinAlbumComponentModel beduinAlbumComponentModel = this.f100624f;
        g gVar = new g(context, null, 0, Integer.valueOf(beduinAlbumComponentModel.getInterItemSpacing()), beduinAlbumComponentModel.getCellSize(), beduinAlbumComponentModel.getOverlay(), beduinAlbumComponentModel.getShowsPageIndicator(), 6, null);
        gVar.setId(View.generateViewId());
        gVar.setLayoutParams(layoutParams);
        return gVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        BeduinContainerIndent padding;
        Integer all;
        BeduinContainerIndent padding2;
        Integer all2;
        g gVar = (g) view;
        BeduinAlbumComponentModel beduinAlbumComponentModel = this.f100624f;
        BeduinContainerIndent padding3 = beduinAlbumComponentModel.getPadding();
        int iB2 = ((padding3 == null || (all = padding3.getLeft()) == null) && ((padding = beduinAlbumComponentModel.getPadding()) == null || (all = padding.getAll()) == null)) ? this.f395324b : y6.b(all.intValue());
        BeduinContainerIndent padding4 = beduinAlbumComponentModel.getPadding();
        int iB3 = ((padding4 == null || (all2 = padding4.getRight()) == null) && ((padding2 = beduinAlbumComponentModel.getPadding()) == null || (all2 = padding2.getAll()) == null)) ? this.f395325c : y6.b(all2.intValue());
        gVar.f100638h = iB2;
        gVar.f100639i = iB3;
        RecyclerView recyclerView = gVar.f100635e;
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.s0(0);
        }
        Integer num = gVar.interItemSpacing;
        recyclerView.l(new com.avito.android.beduin.common.component.albums.items.g(gVar.f100638h, gVar.f100639i, (num == null || num.intValue() == 0) ? ((gVar.f100638h + gVar.f100639i) / 2) / 2 : y6.d(num.intValue())), -1);
        gVar.setImages(beduinAlbumComponentModel.getElements());
        gVar.setAlbumClickListener(new b(this));
    }
}

package com.avito.android.beduin.common.component.albums.items;

import TV0.g;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.beduin.common.component.image.Size;
import kotlin.Metadata;

/* compiled from: AlbumItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/b;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/albums/items/e;", "Lcom/avito/android/beduin/common/component/albums/items/AlbumItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<e, AlbumItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f100647a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Size f100648b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<f> f100649c = new g.a<>(R.layout.beduin_component_album_item, new a(this));

    public b(@k d dVar, @l Size size) {
        this.f100647a = dVar;
        this.f100648b = size;
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, AlbumItem> a() {
        return this.f100647a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f100649c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AlbumItem;
    }
}

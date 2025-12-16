package com.avito.android.cyclic_gallery_widget.image_carousel;

import com.avito.android.cyclic_gallery_widget.image_carousel.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselActionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/b;", "Lcom/avito/conveyor_item/a;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f131998b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f131999c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f132000d;

    public b(@Y61.k String str, @Y61.k a aVar, @Y61.k l lVar) {
        this.f131998b = str;
        this.f131999c = aVar;
        this.f132000d = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f131998b, bVar.f131998b) && L.f(this.f131999c, bVar.f131999c) && L.f(this.f132000d, bVar.f132000d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF131998b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131998b() {
        return this.f131998b;
    }

    public final int hashCode() {
        return this.f132000d.hashCode() + ((this.f131999c.hashCode() + (this.f131998b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "CarouselActionItem(stringId=" + this.f131998b + ", data=" + this.f131999c + ", itemStyle=" + this.f132000d + ')';
    }

    public /* synthetic */ b(String str, a aVar, l lVar, int i12, C42822w c42822w) {
        this(str, aVar, (i12 & 4) != 0 ? l.a.f132035h : lVar);
    }
}

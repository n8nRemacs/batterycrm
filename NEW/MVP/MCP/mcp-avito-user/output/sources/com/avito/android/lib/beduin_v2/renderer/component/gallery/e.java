package com.avito.android.lib.beduin_v2.renderer.component.gallery;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryComponentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/renderer/component/gallery/e;", "Lcom/avito/android/lib/design/gallery/c;", "_design-modules_beduin-v2_renderer_component_gallery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements com.avito.android.lib.design.gallery.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC36249i f176414a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.theme.k f176415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC36343m f176416c;

    public e(@k InterfaceC36249i interfaceC36249i, @k com.avito.beduin.v2.theme.k kVar, @k InterfaceC36343m interfaceC36343m) {
        this.f176414a = interfaceC36249i;
        this.f176415b = kVar;
        this.f176416c = interfaceC36343m;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f176414a, eVar.f176414a) && L.f(this.f176415b, eVar.f176415b) && L.f(this.f176416c, eVar.f176416c);
    }

    public final int hashCode() {
        return this.f176416c.hashCode() + ((this.f176415b.hashCode() + (this.f176414a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "GalleryComponentItem(componentState=" + this.f176414a + ", styleProvider=" + this.f176415b + ", component=" + this.f176416c + ')';
    }
}

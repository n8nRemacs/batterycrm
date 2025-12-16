package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vf0.C49320a;
import wf0.InterfaceC49616a;

/* compiled from: BedTypeItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/bed_type/e;", "LTV0/f;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/bed_type/g;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/bed_type/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.f<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC49616a, G0> f245004b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC49616a, G0> lVar) {
        this.f245004b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Image image = aVar2.f244996f;
        gVar.JU(image != null ? com.avito.android.image_loader.b.b(image) : null);
        gVar.A50(aVar2.f244994d);
        gVar.O3(aVar2.f244995e);
        gVar.setSelected(aVar2.f244997g);
        gVar.X(new d(this, aVar2));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C49320a) {
                obj = obj2;
            }
        }
        if (!(obj instanceof C49320a)) {
            obj = null;
        }
        C49320a c49320a = (C49320a) obj;
        if (c49320a == null) {
            Image image = aVar2.f244996f;
            gVar.JU(image != null ? com.avito.android.image_loader.b.b(image) : null);
            gVar.A50(aVar2.f244994d);
            gVar.O3(aVar2.f244995e);
            gVar.setSelected(aVar2.f244997g);
            gVar.X(new d(this, aVar2));
            return;
        }
        Boolean bool = c49320a.f440917a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            Image image2 = aVar2.f244996f;
            gVar.JU(image2 != null ? com.avito.android.image_loader.b.b(image2) : null);
            gVar.setSelected(zBooleanValue);
        }
        gVar.X(new d(this, aVar2));
    }
}

package com.avito.android.photo_picker.legacy.details_list;

import android.net.Uri;
import androidx.collection.C20199a;
import com.avito.android.device_orientation.c;
import com.avito.android.util.C35809h6;
import com.avito.android.util.rx3.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PreviewItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/details_list/m;", "Lcom/avito/android/photo_picker/legacy/details_list/i;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.i f219657b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.subscribers.n f219658c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C20199a<n, com.avito.android.photo_picker.legacy.thumbnail_list.a> f219659d = new C20199a<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public com.avito.android.device_orientation.c f219660e = new c.a();

    public m(@Y61.k com.avito.android.device_orientation.i iVar) {
        this.f219657b = iVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        com.avito.android.photo_picker.legacy.thumbnail_list.a aVar2 = (com.avito.android.photo_picker.legacy.thumbnail_list.a) aVar;
        if (this.f219658c == null) {
            this.f219658c = r.a(this.f219657b.a().b(k.f219655b), new l(this));
        }
        this.f219659d.put(nVar, aVar2);
        nVar.J3(aVar2.f219883d);
        if (aVar2 instanceof com.avito.android.photo_picker.legacy.thumbnail_list.l) {
            Uri uri = ((com.avito.android.photo_picker.legacy.thumbnail_list.l) aVar2).f219905e;
            if (C35809h6.a(uri)) {
                nVar.p0();
            } else {
                nVar.Km(uri, this.f219660e);
            }
        }
        nVar.t(new j(this, nVar));
    }
}

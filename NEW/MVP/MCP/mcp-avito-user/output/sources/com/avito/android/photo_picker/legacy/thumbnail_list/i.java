package com.avito.android.photo_picker.legacy.thumbnail_list;

import android.net.Uri;
import com.avito.android.device_orientation.c;
import com.avito.android.photo_picker.legacy.thumbnail_list.d;
import com.avito.android.util.C35809h6;
import com.avito.android.util.rx3.r;
import io.reactivex.rxjava3.internal.subscribers.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ThumbnailItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/thumbnail_list/i;", "Lcom/avito/android/photo_picker/legacy/thumbnail_list/d;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends d.a> f219894b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.i f219895c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public n f219897e;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public com.avito.android.device_orientation.c f219896d = new c.a();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList<j> f219898f = new ArrayList<>();

    public i(@Y61.k h31.e eVar, @Y61.k com.avito.android.device_orientation.i iVar) {
        this.f219894b = eVar;
        this.f219895c = iVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        if (this.f219897e == null) {
            this.f219897e = r.a(this.f219895c.a().b(g.f219892b), new h(this));
        }
        this.f219898f.add(jVar);
        jVar.FW(this.f219896d, false);
        jVar.setSelected(aVar2.f219882c);
        jVar.c(new e(this, aVar2));
        if (aVar2 instanceof l) {
            l lVar = (l) aVar2;
            Uri uri = lVar.f219905e;
            if (C35809h6.a(uri)) {
                jVar.J3(lVar.f219883d);
                jVar.p0();
            } else {
                jVar.M4(uri);
                jVar.J3(false);
            }
        }
        jVar.d(new f(this, jVar));
    }
}

package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC23085i;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class o extends AbstractServiceC23085i.C1812i<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.j f47072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f47073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.f f47074h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractServiceC23085i.f fVar, String str, AbstractServiceC23085i.j jVar, Bundle bundle) {
        super(str);
        this.f47074h = fVar;
        this.f47072f = jVar;
        this.f47073g = bundle;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void a() {
        this.f47072f.f47064a.detach();
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> listA = list;
        AbstractServiceC23085i.j jVar = this.f47072f;
        if (listA == null) {
            jVar.a(null);
            return;
        }
        if ((this.f47063e & 1) != 0) {
            AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
            listA = AbstractServiceC23085i.a(listA, this.f47073g);
        }
        ArrayList arrayList = new ArrayList(listA.size());
        for (MediaBrowserCompat.MediaItem mediaItem : listA) {
            Parcel parcelObtain = Parcel.obtain();
            mediaItem.writeToParcel(parcelObtain, 0);
            arrayList.add(parcelObtain);
        }
        jVar.a(arrayList);
    }
}

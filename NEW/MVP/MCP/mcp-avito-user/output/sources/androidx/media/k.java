package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC23085i;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class k extends AbstractServiceC23085i.C1812i<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.j f47070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, AbstractServiceC23085i.j jVar) {
        super(str);
        this.f47070f = jVar;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void a() {
        this.f47070f.f47064a.detach();
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList(list2.size());
            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                arrayList.add(parcelObtain);
            }
        } else {
            arrayList = null;
        }
        this.f47070f.a(arrayList);
    }
}

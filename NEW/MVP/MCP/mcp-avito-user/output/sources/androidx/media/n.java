package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC23085i;
import j.P;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class n extends AbstractServiceC23085i.C1812i<MediaBrowserCompat.MediaItem> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.j f47071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, AbstractServiceC23085i.j jVar) {
        super(str);
        this.f47071f = jVar;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void a() {
        this.f47071f.f47064a.detach();
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        AbstractServiceC23085i.j jVar = this.f47071f;
        if (mediaItem2 == null) {
            jVar.a(null);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        mediaItem2.writeToParcel(parcelObtain, 0);
        jVar.a(parcelObtain);
    }
}

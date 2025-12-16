package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.AbstractServiceC23085i;
import j.P;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23083g extends AbstractServiceC23085i.C1812i<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f47028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23083g(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f47028f = resultReceiver;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        int i12 = this.f47063e & 4;
        ResultReceiver resultReceiver = this.f47028f;
        if (i12 != 0 || list2 == null) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
        resultReceiver.send(0, bundle);
    }
}

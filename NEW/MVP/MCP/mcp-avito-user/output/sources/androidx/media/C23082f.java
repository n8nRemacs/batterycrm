package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.AbstractServiceC23085i;
import j.P;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23082f extends AbstractServiceC23085i.C1812i<MediaBrowserCompat.MediaItem> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f47027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23082f(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f47027f = resultReceiver;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        int i12 = this.f47063e & 2;
        ResultReceiver resultReceiver = this.f47027f;
        if (i12 != 0) {
            resultReceiver.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem2);
        resultReceiver.send(0, bundle);
    }
}

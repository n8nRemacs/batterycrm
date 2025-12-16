package androidx.media3.session;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import androidx.media3.session.C23257s;
import androidx.media3.session.L1;
import java.util.List;

/* compiled from: MediaBrowserImplLegacy.java */
/* loaded from: classes.dex */
class E extends MediaControllerImplLegacy implements C23257s.c {

    /* compiled from: MediaBrowserImplLegacy.java */
    public class b extends MediaBrowserCompat.ConnectionCallback {
        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnected() {
            throw null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionFailed() {
            C23252q.b(-3, null);
            throw null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionSuspended() {
            onConnectionFailed();
            throw null;
        }
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy
    public final J Z() {
        return null;
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.J.d
    public final void release() {
        throw null;
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.J.d
    public final L1 u() {
        if (this.f52153h == null) {
            return this.f52158m.f52164b;
        }
        L1 l12 = this.f52158m.f52164b;
        l12.getClass();
        L1.b bVar = new L1.b(l12, null);
        bVar.a(K1.f52110f);
        return bVar.b();
    }

    /* compiled from: MediaBrowserImplLegacy.java */
    public class a extends MediaBrowserCompat.SubscriptionCallback {
        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list) {
            if (!TextUtils.isEmpty(str)) {
                throw null;
            }
            androidx.media3.common.util.s.g();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onError(String str) {
            C23252q.b(-1, null);
            throw null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onError(String str, Bundle bundle) {
            C23252q.b(-1, null);
            throw null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                androidx.media3.common.util.s.g();
                return;
            }
            throw null;
        }
    }

    /* compiled from: MediaBrowserImplLegacy.java */
    public class c extends MediaBrowserCompat.SubscriptionCallback {
        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list) {
            if (!TextUtils.isEmpty(str)) {
                throw null;
            }
            androidx.media3.common.util.s.g();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onError(String str) {
            C23252q.b(-1, null);
            throw null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onError(String str, Bundle bundle) {
            C23252q.b(-1, null);
            throw null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                androidx.media3.common.util.s.g();
                return;
            }
            throw null;
        }
    }
}

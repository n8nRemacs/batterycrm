package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class y69 extends MediaSession.Callback {
    public final /* synthetic */ z69 a;

    public y69(z69 z69Var) {
        this.a = z69Var;
    }

    public static void b(b79 b79Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = b79Var.a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        b79Var.c(new b89(str, -1, -1));
    }

    public final b79 a() {
        b79 b79Var;
        z69 z69Var;
        synchronized (this.a.a) {
            b79Var = (b79) this.a.d.get();
        }
        if (b79Var == null) {
            return null;
        }
        z69 z69Var2 = this.a;
        synchronized (b79Var.d) {
            z69Var = b79Var.l;
        }
        if (z69Var2 == z69Var) {
            return b79Var;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        g0h g0hVar;
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        try {
            if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    g79 g79Var = b79VarA.c;
                    db7 db7VarA = g79Var.a();
                    bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, db7VarA == null ? null : db7VarA.asBinder());
                    synchronized (g79Var.a) {
                        g0hVar = g79Var.d;
                    }
                    rmb.e(bundle2, g0hVar);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                if (bundle != null) {
                    this.a.b((wy8) n28.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), wy8.CREATOR));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                if (bundle != null) {
                    this.a.c((wy8) n28.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), wy8.CREATOR), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                if (bundle != null) {
                    this.a.q((wy8) n28.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), wy8.CREATOR));
                }
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                List list = b79VarA.h;
                if (list != null && bundle != null) {
                    int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                    e79 e79Var = (i < 0 || i >= list.size()) ? null : (e79) list.get(i);
                    if (e79Var != null) {
                        this.a.q(e79Var.a);
                    }
                }
            } else {
                this.a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        try {
            boolean zEquals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
            z69 z69Var = this.a;
            if (zEquals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                    Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    h79.w(bundle2);
                    z69Var.l(uri, bundle2);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                z69Var.m();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                if (bundle != null) {
                    String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                    Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    h79.w(bundle3);
                    z69Var.n(string, bundle3);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                if (bundle != null) {
                    String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                    Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    h79.w(bundle4);
                    z69Var.o(string2, bundle4);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                    Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                    h79.w(bundle5);
                    z69Var.p(uri2, bundle5);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                if (bundle != null) {
                    bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                if (bundle != null) {
                    z69Var.w(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                if (bundle != null) {
                    z69Var.x(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                }
            } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                if (bundle != null) {
                    j8d j8dVar = (j8d) n28.a(bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), j8d.CREATOR);
                    h79.w(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                    z69Var.v(j8dVar);
                }
            } else if (!str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                z69Var.e(str, bundle);
            } else if (bundle != null) {
                z69Var.t(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.f();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return false;
        }
        b(b79VarA);
        boolean zG = this.a.g(intent);
        b79VarA.c(null);
        return zG || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.h();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.i();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        this.a.j(str, bundle);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        this.a.k(str, bundle);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        this.a.l(uri, bundle);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.m();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        this.a.n(str, bundle);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        this.a.o(str, bundle);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        h79.w(bundle);
        b(b79VarA);
        this.a.p(uri, bundle);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.r();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.s(j);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.t(f);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.u(j8d.a(rating));
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.y();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.z();
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.A(j);
        b79VarA.c(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        b79 b79VarA = a();
        if (b79VarA == null) {
            return;
        }
        b(b79VarA);
        this.a.B();
        b79VarA.c(null);
    }
}

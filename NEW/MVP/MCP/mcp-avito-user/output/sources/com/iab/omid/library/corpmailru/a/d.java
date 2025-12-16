package com.iab.omid.library.corpmailru.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f363947a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f363948b;

    /* renamed from: c, reason: collision with root package name */
    private final a f363949c;

    /* renamed from: d, reason: collision with root package name */
    private final c f363950d;

    /* renamed from: e, reason: collision with root package name */
    private float f363951e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f363947a = context;
        this.f363948b = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f363949c = aVar;
        this.f363950d = cVar;
    }

    private float c() {
        return this.f363949c.a(this.f363948b.getStreamVolume(3), this.f363948b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f363950d.a(this.f363951e);
    }

    public void a() {
        this.f363951e = c();
        d();
        this.f363947a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f363947a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z12) {
        super.onChange(z12);
        float fC2 = c();
        if (a(fC2)) {
            this.f363951e = fC2;
            d();
        }
    }

    private boolean a(float f12) {
        return f12 != this.f363951e;
    }
}

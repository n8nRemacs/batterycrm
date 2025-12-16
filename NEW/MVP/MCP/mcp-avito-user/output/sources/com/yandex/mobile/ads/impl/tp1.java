package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public final class tp1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f390279a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f390280b;

    /* renamed from: c, reason: collision with root package name */
    private final so1 f390281c;

    /* renamed from: d, reason: collision with root package name */
    private final pp1 f390282d;

    /* renamed from: e, reason: collision with root package name */
    private float f390283e;

    public tp1(Handler handler, Context context, so1 so1Var, pp1 pp1Var) {
        super(handler);
        this.f390279a = context;
        this.f390280b = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f390281c = so1Var;
        this.f390282d = pp1Var;
    }

    public final void a() {
        float f12;
        int streamVolume = this.f390280b.getStreamVolume(3);
        int streamMaxVolume = this.f390280b.getStreamMaxVolume(3);
        this.f390281c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f12 = 0.0f;
        } else {
            f12 = streamVolume / streamMaxVolume;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
        }
        this.f390283e = f12;
        ((cq1) this.f390282d).a(f12);
        this.f390279a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f390279a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12) {
        float f12;
        super.onChange(z12);
        int streamVolume = this.f390280b.getStreamVolume(3);
        int streamMaxVolume = this.f390280b.getStreamMaxVolume(3);
        this.f390281c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f12 = 0.0f;
        } else {
            f12 = streamVolume / streamMaxVolume;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
        }
        if (f12 != this.f390283e) {
            this.f390283e = f12;
            ((cq1) this.f390282d).a(f12);
        }
    }
}

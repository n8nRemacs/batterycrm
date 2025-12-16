package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public interface ac0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ec0 f383458a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f383459b;

        /* renamed from: c, reason: collision with root package name */
        public final vw f383460c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final Surface f383461d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final MediaCrypto f383462e;

        private a(ec0 ec0Var, MediaFormat mediaFormat, vw vwVar, @j.P Surface surface, @j.P MediaCrypto mediaCrypto) {
            this.f383458a = ec0Var;
            this.f383459b = mediaFormat;
            this.f383460c = vwVar;
            this.f383461d = surface;
            this.f383462e = mediaCrypto;
        }

        public static a a(ec0 ec0Var, MediaFormat mediaFormat, vw vwVar, @j.P MediaCrypto mediaCrypto) {
            return new a(ec0Var, mediaFormat, vwVar, null, mediaCrypto);
        }

        public static a a(ec0 ec0Var, MediaFormat mediaFormat, vw vwVar, @j.P Surface surface, @j.P MediaCrypto mediaCrypto) {
            return new a(ec0Var, mediaFormat, vwVar, surface, mediaCrypto);
        }
    }

    public interface b {
        ac0 a(a aVar);
    }

    public interface c {
        void a(long j12);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    void a();

    void a(int i12);

    void a(int i12, int i13, long j12, int i14);

    @j.X
    void a(int i12, long j12);

    void a(int i12, um umVar, long j12);

    @j.X
    void a(Bundle bundle);

    @j.X
    void a(Surface surface);

    @j.X
    void a(c cVar, Handler handler);

    void a(boolean z12, int i12);

    MediaFormat b();

    @j.P
    ByteBuffer b(int i12);

    int c();

    @j.P
    ByteBuffer c(int i12);

    void flush();

    void release();
}

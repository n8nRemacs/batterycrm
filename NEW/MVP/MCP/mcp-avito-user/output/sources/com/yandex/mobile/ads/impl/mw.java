package com.yandex.mobile.ads.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.impl.vw;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class mw {

    /* renamed from: a, reason: collision with root package name */
    public final int f388098a;

    /* renamed from: b, reason: collision with root package name */
    public final int f388099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f388100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f388101d;

    /* renamed from: e, reason: collision with root package name */
    public final int f388102e;

    /* renamed from: f, reason: collision with root package name */
    public final int f388103f;

    /* renamed from: g, reason: collision with root package name */
    public final int f388104g;

    /* renamed from: h, reason: collision with root package name */
    public final int f388105h;

    /* renamed from: i, reason: collision with root package name */
    public final int f388106i;

    /* renamed from: j, reason: collision with root package name */
    public final long f388107j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public final a f388108k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private final Metadata f388109l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f388110a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f388111b;

        public a(long[] jArr, long[] jArr2) {
            this.f388110a = jArr;
            this.f388111b = jArr2;
        }
    }

    public mw(int i12, byte[] bArr) {
        or0 or0Var = new or0(bArr);
        or0Var.c(i12 * 8);
        this.f388098a = or0Var.b(16);
        this.f388099b = or0Var.b(16);
        this.f388100c = or0Var.b(24);
        this.f388101d = or0Var.b(24);
        int iB2 = or0Var.b(20);
        this.f388102e = iB2;
        this.f388103f = b(iB2);
        this.f388104g = or0Var.b(3) + 1;
        int iB3 = or0Var.b(5) + 1;
        this.f388105h = iB3;
        this.f388106i = a(iB3);
        this.f388107j = or0Var.g();
        this.f388108k = null;
        this.f388109l = null;
    }

    private static int a(int i12) {
        if (i12 == 8) {
            return 1;
        }
        if (i12 == 12) {
            return 2;
        }
        if (i12 == 16) {
            return 4;
        }
        if (i12 != 20) {
            return i12 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i12) {
        switch (i12) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a(long j12) {
        long j13 = (j12 * this.f388102e) / 1000000;
        long j14 = this.f388107j - 1;
        int i12 = pc1.f388768a;
        return Math.max(0L, Math.min(j13, j14));
    }

    public final long b() {
        long j12 = this.f388107j;
        if (j12 == 0) {
            return -9223372036854775807L;
        }
        return (j12 * 1000000) / this.f388102e;
    }

    public final mw b(List<String> list) {
        Metadata metadataA = zk1.a(list);
        Metadata metadata = this.f388109l;
        if (metadata != null) {
            metadataA = metadata.a(metadataA);
        }
        return new mw(this.f388098a, this.f388099b, this.f388100c, this.f388101d, this.f388102e, this.f388104g, this.f388105h, this.f388107j, this.f388108k, metadataA);
    }

    public final long a() {
        long j12;
        long j13;
        int i12 = this.f388101d;
        if (i12 > 0) {
            j12 = (i12 + this.f388100c) / 2;
            j13 = 1;
        } else {
            int i13 = this.f388098a;
            j12 = ((((i13 != this.f388099b || i13 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i13) * this.f388104g) * this.f388105h) / 8;
            j13 = 64;
        }
        return j12 + j13;
    }

    public final vw a(byte[] bArr, @j.P Metadata metadata) {
        bArr[4] = -128;
        int i12 = this.f388101d;
        if (i12 <= 0) {
            i12 = -1;
        }
        Metadata metadata2 = this.f388109l;
        if (metadata2 != null) {
            metadata = metadata2.a(metadata);
        }
        return new vw.a().f("audio/flac").i(i12).c(this.f388104g).n(this.f388102e).a(Collections.singletonList(bArr)).a(metadata).a();
    }

    private mw(int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, @j.P a aVar, @j.P Metadata metadata) {
        this.f388098a = i12;
        this.f388099b = i13;
        this.f388100c = i14;
        this.f388101d = i15;
        this.f388102e = i16;
        this.f388103f = b(i16);
        this.f388104g = i17;
        this.f388105h = i18;
        this.f388106i = a(i18);
        this.f388107j = j12;
        this.f388108k = aVar;
        this.f388109l = metadata;
    }

    public final mw a(@j.P a aVar) {
        return new mw(this.f388098a, this.f388099b, this.f388100c, this.f388101d, this.f388102e, this.f388104g, this.f388105h, this.f388107j, aVar, this.f388109l);
    }

    public final mw a(List<PictureFrame> list) {
        Metadata metadata = new Metadata(list);
        Metadata metadata2 = this.f388109l;
        if (metadata2 != null) {
            metadata = metadata2.a(metadata);
        }
        return new mw(this.f388098a, this.f388099b, this.f388100c, this.f388101d, this.f388102e, this.f388104g, this.f388105h, this.f388107j, this.f388108k, metadata);
    }
}

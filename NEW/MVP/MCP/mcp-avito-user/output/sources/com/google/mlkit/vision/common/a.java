package com.google.mlkit.vision.common;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.mlkit.common.sdkinternal.InterfaceC37641j;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@J41.b
/* loaded from: classes6.dex */
public class a implements InterfaceC37641j {

    /* renamed from: a, reason: collision with root package name */
    @P
    public volatile Bitmap f362443a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public volatile ByteBuffer f362444b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public volatile f f362445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362446d;

    /* renamed from: e, reason: collision with root package name */
    public final int f362447e;

    /* renamed from: f, reason: collision with root package name */
    public final int f362448f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC10743a
    public final int f362449g;

    /* compiled from: com.google.mlkit:vision-common@@17.2.0 */
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.vision.common.a$a, reason: collision with other inner class name */
    public @interface InterfaceC10743a {
    }

    public a(@N Bitmap bitmap) {
        C36729v.j(bitmap);
        this.f362443a = bitmap;
        this.f362446d = bitmap.getWidth();
        this.f362447e = bitmap.getHeight();
        this.f362448f = 0;
        this.f362449g = -1;
    }

    @N
    public static a a(@N Bitmap bitmap) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(bitmap);
        zzli.zza(zzlg.zzb("vision-common"), -1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), 0);
        return aVar;
    }

    @RX0.a
    @P
    public final Image b() {
        if (this.f362445c == null) {
            return null;
        }
        return this.f362445c.f362450a;
    }

    @RX0.a
    @P
    public final Image.Plane[] c() {
        if (this.f362445c == null) {
            return null;
        }
        return this.f362445c.f362450a.getPlanes();
    }

    public a(@N Image image, int i12, int i13, int i14) {
        this.f362445c = new f(image);
        this.f362446d = i12;
        this.f362447e = i13;
        this.f362448f = i14;
        this.f362449g = 35;
    }

    public a(int i12, @N ByteBuffer byteBuffer, int i13, int i14) {
        C36729v.j(byteBuffer);
        this.f362444b = byteBuffer;
        C36729v.a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i12 * i13);
        byteBuffer.rewind();
        this.f362446d = i12;
        this.f362447e = i13;
        this.f362448f = i14;
        this.f362449g = 17;
    }
}

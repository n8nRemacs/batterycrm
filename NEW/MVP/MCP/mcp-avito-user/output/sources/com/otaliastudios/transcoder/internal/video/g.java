package com.otaliastudios.transcoder.internal.video;

import Y61.k;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.compose.foundation.H;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.pipeline.l;
import com.otaliastudios.transcoder.internal.utils.j;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;
import t11.InterfaceC48462c;

/* compiled from: VideoRenderer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/transcoder/internal/video/g;", "Lcom/otaliastudios/transcoder/internal/pipeline/l;", "Lcom/otaliastudios/transcoder/internal/codec/c;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g implements l<com.otaliastudios.transcoder.internal.codec.c, com.otaliastudios.transcoder.internal.codec.b, Long, com.otaliastudios.transcoder.internal.pipeline.b>, com.otaliastudios.transcoder.internal.codec.b {

    /* renamed from: b, reason: collision with root package name */
    public final int f366243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366244c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final MediaFormat f366245d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f366246e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g f366247f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f366248g;

    /* renamed from: h, reason: collision with root package name */
    public c f366249h;

    public g(int i12, int i13, MediaFormat mediaFormat, boolean z12, int i14, C42822w c42822w) {
        z12 = (i14 & 8) != 0 ? false : z12;
        this.f366243b = i12;
        this.f366244c = i13;
        this.f366245d = mediaFormat;
        this.f366246e = new j();
        this.f366247f = this;
        this.f366248g = C42727D.c(new f(z12));
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        boolean z13 = i13 % 180 != 0;
        mediaFormat.setInteger("width", z13 ? integer2 : integer);
        mediaFormat.setInteger("height", z13 ? integer : integer2);
    }

    @Override // com.otaliastudios.transcoder.internal.codec.b
    @k
    public final Surface b(@k MediaFormat mediaFormat) {
        Object bVar;
        float f12;
        mediaFormat.toString();
        this.f366246e.getClass();
        try {
            int i12 = Z.f406624c;
            bVar = Integer.valueOf(mediaFormat.getInteger("rotation-degrees"));
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (Z.b(bVar) != null) {
            bVar = 0;
        }
        int iIntValue = ((Number) bVar).intValue();
        int i14 = this.f366243b;
        if (iIntValue != i14) {
            throw new IllegalStateException(H.j(i14, iIntValue, "Unexpected difference in rotation. DataSource=", ", MediaFormat=").toString());
        }
        mediaFormat.setInteger("rotation-degrees", 0);
        int i15 = (iIntValue + this.f366244c) % 360;
        InterfaceC42726C interfaceC42726C = this.f366248g;
        ((a) interfaceC42726C.getValue()).f366230g = i15;
        boolean z12 = i15 % 180 != 0;
        float integer = mediaFormat.getInteger("width") / mediaFormat.getInteger("height");
        MediaFormat mediaFormat2 = this.f366245d;
        float integer2 = (z12 ? mediaFormat2.getInteger("height") : mediaFormat2.getInteger("width")) / (z12 ? mediaFormat2.getInteger("width") : mediaFormat2.getInteger("height"));
        float f13 = 1.0f;
        if (integer > integer2) {
            float f14 = integer / integer2;
            f12 = 1.0f;
            f13 = f14;
        } else {
            f12 = integer < integer2 ? integer2 / integer : 1.0f;
        }
        a aVar = (a) interfaceC42726C.getValue();
        aVar.f366228e = f13;
        aVar.f366229f = f12;
        this.f366249h = new c(mediaFormat.getInteger("frame-rate"), mediaFormat2.getInteger("frame-rate"));
        return ((a) interfaceC42726C.getValue()).f366225b;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366247f;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
        a aVar = (a) this.f366248g.getValue();
        com.otaliastudios.opengl.program.g gVar = aVar.f366226c;
        if (!gVar.f365937d) {
            if (gVar.f365935b) {
                int i12 = s0.f410475c;
                GLES20.glDeleteProgram(gVar.f365934a);
            }
            for (com.otaliastudios.opengl.program.f fVar : gVar.f365936c) {
                fVar.getClass();
                int i13 = s0.f410475c;
                GLES20.glDeleteShader(fVar.f365948a);
            }
            gVar.f365937d = true;
        }
        Object obj = gVar.f365951h;
        if (obj instanceof InterfaceC48462c) {
            ((InterfaceC48462c) obj).dispose();
        }
        com.otaliastudios.opengl.texture.c cVar = gVar.f365958o;
        if (cVar != null) {
            int i14 = s0.f410475c;
            GLES20.glDeleteTextures(1, new int[]{cVar.f365965g}, 0);
            G0 g02 = G0.f406611a;
        }
        gVar.f365958o = null;
        aVar.f366225b.release();
        aVar.f366225b = null;
        aVar.f366224a = null;
        aVar.f366227d = null;
        aVar.f366226c = null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @k
    public final com.otaliastudios.transcoder.internal.pipeline.k<Long> s(@k k.b<com.otaliastudios.transcoder.internal.codec.c> bVar, boolean z12) {
        if (bVar instanceof k.a) {
            bVar.f366179a.f366055c.invoke(Boolean.FALSE);
            return new k.a(0L);
        }
        c cVar = this.f366249h;
        if (cVar == null) {
            cVar = null;
        }
        com.otaliastudios.transcoder.internal.codec.c cVar2 = bVar.f366179a;
        long j12 = cVar2.f366054b;
        double d12 = cVar.f366237c + cVar.f366235a;
        cVar.f366237c = d12;
        int i12 = cVar.f366238d;
        cVar.f366238d = i12 + 1;
        if (i12 != 0) {
            double d13 = cVar.f366236b;
            if (d12 <= d13) {
                cVar2.f366055c.invoke(Boolean.FALSE);
                return k.d.f366181a;
            }
            cVar.f366237c = d12 - d13;
        }
        cVar2.f366055c.invoke(Boolean.TRUE);
        a aVar = (a) this.f366248g.getValue();
        synchronized (aVar.f366233j) {
            while (!aVar.f366232i) {
                try {
                    aVar.f366233j.wait(10000L);
                    if (!aVar.f366232i) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e12) {
                    throw new RuntimeException(e12);
                }
            }
            aVar.f366232i = false;
        }
        aVar.f366224a.updateTexImage();
        aVar.f366224a.getTransformMatrix(aVar.f366226c.f365949f);
        float f12 = 1.0f / aVar.f366228e;
        float f13 = 1.0f / aVar.f366229f;
        Matrix.translateM(aVar.f366226c.f365949f, 0, (1.0f - f12) / 2.0f, (1.0f - f13) / 2.0f, 0.0f);
        Matrix.scaleM(aVar.f366226c.f365949f, 0, f12, f13, 1.0f);
        Matrix.translateM(aVar.f366226c.f365949f, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(aVar.f366226c.f365949f, 0, aVar.f366230g, 0.0f, 0.0f, 1.0f);
        if (aVar.f366231h) {
            Matrix.scaleM(aVar.f366226c.f365949f, 0, 1.0f, -1.0f, 1.0f);
        }
        Matrix.translateM(aVar.f366226c.f365949f, 0, -0.5f, -0.5f, 0.0f);
        aVar.f366226c.a(aVar.f366227d);
        return new k.b(Long.valueOf(bVar.f366179a.f366054b));
    }

    @Override // com.otaliastudios.transcoder.internal.codec.b
    public final void c(@Y61.k MediaFormat mediaFormat) {
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final void t(@Y61.k com.otaliastudios.transcoder.internal.pipeline.b bVar) {
    }
}

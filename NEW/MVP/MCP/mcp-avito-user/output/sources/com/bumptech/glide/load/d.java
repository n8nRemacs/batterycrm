package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.z;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes5.dex */
class d implements g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.data.m f338847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.j f338848b;

    public d(com.bumptech.glide.load.data.m mVar, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f338847a = mVar;
        this.f338848b = jVar;
    }

    @Override // com.bumptech.glide.load.g.b
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
        com.bumptech.glide.load.data.m mVar = this.f338847a;
        z zVar = null;
        try {
            z zVar2 = new z(new FileInputStream(mVar.a().getFileDescriptor()), this.f338848b);
            try {
                ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(zVar2);
                try {
                    zVar2.close();
                } catch (IOException unused) {
                }
                mVar.a();
                return imageTypeC;
            } catch (Throwable th2) {
                th = th2;
                zVar = zVar2;
                if (zVar != null) {
                    try {
                        zVar.close();
                    } catch (IOException unused2) {
                    }
                }
                mVar.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

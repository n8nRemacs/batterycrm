package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.g;
import java.nio.ByteBuffer;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes5.dex */
class c implements g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f338846a;

    public c(ByteBuffer byteBuffer) {
        this.f338846a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.g.b
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        return imageHeaderParser.b(this.f338846a);
    }
}

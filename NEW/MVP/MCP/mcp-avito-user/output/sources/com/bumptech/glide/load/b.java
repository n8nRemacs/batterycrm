package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.g;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes5.dex */
class b implements g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputStream f338845a;

    public b(InputStream inputStream) {
        this.f338845a = inputStream;
    }

    @Override // com.bumptech.glide.load.g.b
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        InputStream inputStream = this.f338845a;
        try {
            return imageHeaderParser.c(inputStream);
        } finally {
            inputStream.reset();
        }
    }
}

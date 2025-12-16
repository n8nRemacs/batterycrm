package com.squareup.picasso;

import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import okio.M;

/* compiled from: FileRequestHandler.java */
/* loaded from: classes7.dex */
class n extends C37871h {
    @Override // com.squareup.picasso.C37871h, com.squareup.picasso.C
    public final boolean b(A a12) {
        return "file".equals(a12.f366289a.getScheme());
    }

    @Override // com.squareup.picasso.C37871h, com.squareup.picasso.C
    public final C.a e(A a12, int i12) {
        return new C.a(null, M.g(this.f366433a.getContentResolver().openInputStream(a12.f366289a)), Picasso.LoadedFrom.DISK, new androidx.exifinterface.media.a(a12.f366289a.getPath()).e(1, "Orientation"));
    }
}

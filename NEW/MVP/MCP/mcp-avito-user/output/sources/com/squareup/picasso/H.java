package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* compiled from: TargetAction.java */
/* loaded from: classes7.dex */
final class H extends AbstractC37864a<G> {
    @Override // com.squareup.picasso.AbstractC37864a
    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        G gD2 = d();
        if (gD2 != null) {
            gD2.a();
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.AbstractC37864a
    public final void c(Exception exc) {
        G gD2 = d();
        if (gD2 != null) {
            gD2.b();
        }
    }
}

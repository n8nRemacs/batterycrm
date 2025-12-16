package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.internal.g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.s;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.infer.annotation.Nullsafe;

@J41.d
@g
@TargetApi(19)
@Nullsafe
/* loaded from: classes13.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c, reason: collision with root package name */
    public final s f340507c;

    @g
    public KitKatPurgeableDecoder(s sVar) {
        this.f340507c = sVar;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(com.facebook.common.references.a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        aVar.i().size();
        this.f340507c.getClass();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(com.facebook.common.references.a<PooledByteBuffer> aVar, int i12, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.e(aVar, i12);
        if (!(i12 <= aVar.i().size())) {
            throw new IllegalArgumentException();
        }
        this.f340507c.getClass();
        throw null;
    }
}

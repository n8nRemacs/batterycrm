package com.vk.id.group.subscription.compose.util;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.runtime.internal.P;
import coil.view.C27253g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: UserImageTransformation.kt */
@P
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/vk/id/group/subscription/compose/util/UserImageTransformation;", "LL2/c;", "", "backgroundColor", "<init>", "(I)V", "Landroid/graphics/Canvas;", "Landroid/graphics/Bitmap;", "input", "", "radius", "Lkotlin/G0;", "drawSurroundingCircle", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;F)V", "Lcoil/size/g;", "size", "transform", "(Landroid/graphics/Bitmap;Lcoil/size/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "Companion", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserImageTransformation implements L2.c {
    private final int backgroundColor;

    public UserImageTransformation(int i12) {
        this.backgroundColor = i12;
    }

    private final void drawSurroundingCircle(Canvas canvas, Bitmap bitmap, float f12) {
        Paint paint = new Paint();
        paint.setColor(this.backgroundColor);
        paint.setStyle(Paint.Style.FILL);
        G0 g02 = G0.f406611a;
        canvas.drawCircle(((-bitmap.getWidth()) / 24.0f) * 9, bitmap.getHeight() / 2.0f, f12, paint);
    }

    @Override // L2.c
    @k
    /* renamed from: getCacheKey */
    public String getF9753a() {
        return String.valueOf(this.backgroundColor);
    }

    @Override // L2.c
    @l
    public Object transform(@k Bitmap bitmap, @k C27253g c27253g, @k Continuation<? super Bitmap> continuation) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f12 = iMin / 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f12, f12, f12, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f12 - (bitmap.getWidth() / 2.0f), f12 - (bitmap.getHeight() / 2.0f), paint);
        drawSurroundingCircle(canvas, bitmap, f12);
        return bitmapCreateBitmap;
    }
}

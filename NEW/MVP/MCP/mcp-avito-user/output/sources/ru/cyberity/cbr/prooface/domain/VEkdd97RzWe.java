package ru.cyberity.cbr.prooface.domain;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.Metadata;
import kotlin.Q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/prooface/domain/VEkdd97RzWe;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "image", "Lkotlin/Q;", "", "", "AnZ4ntgRZiVOQFYAd", "(Landroid/graphics/Bitmap;)Lkotlin/Q;", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class VEkdd97RzWe {

    @k
    public static final VEkdd97RzWe AnZ4ntgRZiVOQFYAd = new VEkdd97RzWe();

    private VEkdd97RzWe() {
    }

    @k
    public final Q<Integer, Float> AnZ4ntgRZiVOQFYAd(@k Bitmap image) {
        try {
            return new Q<>(Integer.valueOf(Bitmap.createScaledBitmap(image, 1, 1, false).getPixel(0, 0)), Float.valueOf(200 * ((float) (((Color.blue(r13) / 255.0d) * 0.0722d) + ((Color.green(r13) / 255.0d) * 0.7152d) + ((Color.red(r13) / 255.0d) * 0.2126d)))));
        } catch (Exception unused) {
            return new Q<>(0, Float.valueOf(0.0f));
        }
    }
}

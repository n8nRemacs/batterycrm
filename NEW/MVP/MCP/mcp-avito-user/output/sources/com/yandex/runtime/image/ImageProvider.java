package com.yandex.runtime.image;

import AK.c;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.camera.camera2.internal.G;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* loaded from: classes8.dex */
public abstract class ImageProvider {
    private final boolean cacheable;

    public static abstract class ImageProviderImpl extends ImageProvider {

        /* renamed from: id, reason: collision with root package name */
        private final String f392921id;

        public ImageProviderImpl(String str, boolean z12) {
            super(z12);
            this.f392921id = str;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public String getId() {
            return this.f392921id;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public Bitmap getImage() {
            return loadBitmap();
        }

        public abstract Bitmap loadBitmap();
    }

    public ImageProvider() {
        this(true);
    }

    public static ImageProvider fromAsset(Context context, String str) {
        return fromAsset(context, str, true);
    }

    public static ImageProvider fromBitmap(Bitmap bitmap) {
        return fromBitmap(bitmap, true, "bitmap:" + UUID.randomUUID().toString());
    }

    public static ImageProvider fromFile(String str) {
        return fromFile(str, true);
    }

    public static ImageProvider fromResource(Context context, int i12) {
        return fromResource(context, i12, true);
    }

    public abstract String getId();

    public abstract Bitmap getImage();

    public boolean isCacheable() {
        return this.cacheable;
    }

    public ImageProvider(boolean z12) {
        this.cacheable = z12;
    }

    public static ImageProvider fromAsset(Context context, final String str, boolean z12) {
        final AssetManager assets = context.getAssets();
        return new ImageProviderImpl(G.f("asset:", str), z12) { // from class: com.yandex.runtime.image.ImageProvider.2
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() throws IOException {
                Bitmap bitmapDecodeStream = null;
                try {
                    InputStream inputStreamOpen = assets.open(str);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        inputStreamOpen.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            }
        };
    }

    public static ImageProvider fromBitmap(final Bitmap bitmap, boolean z12, final String str) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return new ImageProvider(z12) { // from class: com.yandex.runtime.image.ImageProvider.1
                @Override // com.yandex.runtime.image.ImageProvider
                public String getId() {
                    return str;
                }

                @Override // com.yandex.runtime.image.ImageProvider
                public Bitmap getImage() {
                    return bitmap;
                }
            };
        }
        throw new IllegalArgumentException("Bitmap config value should be ARGB_8888");
    }

    public static ImageProvider fromFile(final String str, boolean z12) {
        return new ImageProviderImpl(G.f("file:", str), z12) { // from class: com.yandex.runtime.image.ImageProvider.4
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                return BitmapFactory.decodeFile(str);
            }
        };
    }

    public static ImageProvider fromResource(Context context, final int i12, boolean z12) {
        final Resources resources = context.getResources();
        return new ImageProviderImpl(c.g(i12, "resource:"), z12) { // from class: com.yandex.runtime.image.ImageProvider.3
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            public Bitmap loadBitmap() {
                return BitmapFactory.decodeResource(resources, i12);
            }
        };
    }
}

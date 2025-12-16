package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.mobile.ads.R;
import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class kn1 implements bn {

    /* renamed from: a, reason: collision with root package name */
    private final Context f387213a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f387214b;

    public kn1(@Y61.k Context context) {
        this.f387213a = context.getApplicationContext();
        this.f387214b = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.bn
    @Y61.k
    public final byte[][] a() throws Resources.NotFoundException {
        try {
            InputStream inputStreamOpenRawResource = this.f387214b.getResources().openRawResource(R.raw.yandexinternalca);
            try {
                byte[] bArrC = kotlin.io.b.c(inputStreamOpenRawResource);
                kotlin.io.c.a(inputStreamOpenRawResource, null);
                try {
                    inputStreamOpenRawResource = this.f387213a.getResources().openRawResource(R.raw.bundled_cert);
                    try {
                        byte[] bArrC2 = kotlin.io.b.c(inputStreamOpenRawResource);
                        kotlin.io.c.a(inputStreamOpenRawResource, null);
                        return (byte[][]) C42756l.X(new byte[][]{bArrC2}, new byte[][]{bArrC});
                    } finally {
                    }
                } catch (IOException e12) {
                    throw new IllegalStateException("Failed to create cert", e12);
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (IOException e13) {
            throw new IllegalStateException("Failed to create cert", e13);
        }
    }
}

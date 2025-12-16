package com.avito.android.photo_picker.legacy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.avito.android.photo_cache.EnhanceState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.collections.C42745f0;
import u80.C48862a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class G implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219596b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f219597c;

    public /* synthetic */ G(X x12) {
        this.f219597c = x12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i12 = 0;
        Object obj = this.f219597c;
        switch (this.f219596b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, new BitmapFactory.Options());
                float fA2 = C48862a.a(bArr);
                if (fA2 == 0.0f) {
                    return bitmapDecodeByteArray;
                }
                int width = bitmapDecodeByteArray.getWidth();
                int height = bitmapDecodeByteArray.getHeight();
                Matrix matrix = new Matrix();
                matrix.postRotate(fA2);
                G0 g02 = G0.f406611a;
                return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix, true);
            default:
                X x12 = (X) obj;
                List list = (List) x12.g().e();
                Iterator it = C42745f0.d0(list, x12.f219638l).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    com.avito.android.photo_cache.b bVar = x12.f219627a;
                    if (zHasNext) {
                        bVar.b(((PickerPhoto) it.next()).f219613b);
                    } else {
                        Iterator it2 = C42745f0.d0(x12.f219638l, list).iterator();
                        while (true) {
                            boolean zHasNext2 = it2.hasNext();
                            String str = x12.f219631e;
                            if (!zHasNext2) {
                                for (Object obj2 : x12.f219638l) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        C42745f0.H0();
                                        throw null;
                                    }
                                    bVar.f(str, ((PickerPhoto) obj2).f219618g, i12);
                                    i12 = i13;
                                }
                                return G0.f406611a;
                            }
                            PickerPhoto pickerPhoto = (PickerPhoto) it2.next();
                            x12.f219627a.i(x12.f219632f, str, null, pickerPhoto.f219615d, pickerPhoto.f219616e, pickerPhoto.f219618g, (384 & 64) != 0 ? null : pickerPhoto.f219614c, (384 & 512) != 0 ? EnhanceState.f216287c : pickerPhoto.f219620i.f216292b ? EnhanceState.f216289e : EnhanceState.f216287c);
                        }
                    }
                }
        }
    }

    public /* synthetic */ G(byte[] bArr, H h12) {
        this.f219597c = bArr;
    }
}

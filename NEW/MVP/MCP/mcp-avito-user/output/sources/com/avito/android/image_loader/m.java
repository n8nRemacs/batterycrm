package com.avito.android.image_loader;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.adaptive.image.ImageContentMode;
import com.avito.android.adaptive.image.ImageFallbackQuality;
import com.avito.android.adaptive.image.d;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35795g0;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.android.util.Z1;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RemotePicture.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/m;", "Lcom/avito/android/image_loader/k;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Image f169556a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Boolean f169557b;

    public m(@Y61.l Image image, @Y61.l Boolean bool) {
        this.f169556a = image;
        this.f169557b = bool;
    }

    @Override // com.avito.android.image_loader.k
    @Y61.k
    public final Uri a(@Y61.k View view) {
        ImageContentMode imageContentMode;
        Map<Size, Uri> variants;
        if (view instanceof SimpleDraweeView) {
            GW0.a hierarchy = ((SimpleDraweeView) view).getHierarchy();
            s.c cVar = !(hierarchy.k(2) instanceof r) ? null : hierarchy.l(2).f340122f;
            if (cVar != null) {
                if (cVar.equals(s.c.f340137i) ? true : cVar.equals(s.c.f340138j) ? true : cVar.equals(s.c.f340129a) ? true : cVar.equals(s.c.f340130b) ? true : cVar.equals(s.c.f340131c)) {
                    imageContentMode = ImageContentMode.f68474b;
                } else {
                    imageContentMode = cVar.equals(s.c.f340133e) ? true : cVar.equals(s.c.f340132d) ? true : cVar.equals(s.c.f340134f) ? true : cVar.equals(s.c.f340139k) ? true : cVar.equals(s.c.f340136h) ? true : cVar.equals(s.c.f340135g) ? ImageContentMode.f68475c : ImageContentMode.f68474b;
                }
            } else {
                imageContentMode = ImageContentMode.f68474b;
            }
        } else if (view instanceof ImageView) {
            switch (Z1.a.f318786a[((ImageView) view).getScaleType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    imageContentMode = ImageContentMode.f68474b;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    imageContentMode = ImageContentMode.f68475c;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            imageContentMode = ImageContentMode.f68474b;
        }
        ImageContentMode imageContentMode2 = imageContentMode;
        Image f169556a = getF169517c();
        if (f169556a == null || (variants = f169556a.getVariants()) == null) {
            return Uri.EMPTY;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
        Iterator<T> it = variants.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(new d.c(((Size) entry.getKey()).getWidth(), ((Size) entry.getKey()).getHeight()), entry.getValue());
        }
        try {
            C35795g0 c35795g0 = C35795g0.f318877a;
            Context context = view.getContext();
            int iR2 = D6.r(view);
            int iS2 = D6.s(view);
            ImageFallbackQuality[] imageFallbackQualityArr = ImageFallbackQuality.f68478b;
            return C35795g0.b(c35795g0, context, iS2, iR2, linkedHashMap, imageContentMode2);
        } catch (Exception e12) {
            V2.f318762a.f(e12);
            return Uri.EMPTY;
        }
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public Image getF169517c() {
        return this.f169556a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(getF169517c(), ((m) obj).getF169517c());
    }

    public int hashCode() {
        Image f169556a = getF169517c();
        if (f169556a != null) {
            return f169556a.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "RemotePicture(image=" + getF169517c() + ')';
    }

    public /* synthetic */ m(Image image, Boolean bool, int i12, C42822w c42822w) {
        this(image, (i12 & 2) != 0 ? null : bool);
    }
}

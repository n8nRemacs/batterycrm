package ru.cyberity.cbr.core.theme;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import androidx.appcompat.app.r;
import androidx.core.content.res.i;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.theme.b;
import ru.cyberity.log.logger.Logger;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001\u0007J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R@\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bRD\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00152\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0007\u0010\u001bRD\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u00152\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR@\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0018\u00010\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/theme/d;", "Lru/cyberity/cbr/core/theme/CBRCustomizationTheme;", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/theme/b$c;", "element", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Lru/cyberity/cbr/core/theme/b$c;)Landroid/graphics/Bitmap;", "", "name", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/res/AssetManager;", "assetManager", "file", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Bitmap;", "Lkotlin/G0;", "(Landroid/content/Context;)V", "Lru/cyberity/cbr/core/theme/CBRCustomizationFileFormat;", "Lru/cyberity/cbr/core/theme/CBRCustomizationFileFormat;", "format", "", "Lru/cyberity/cbr/core/theme/b$g;", "<set-?>", "b", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "typography", "Lru/cyberity/cbr/core/theme/b$a;", "c", "colors", "Lru/cyberity/cbr/core/theme/b;", "metrics", "e", "images", "f", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d implements CBRCustomizationTheme {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final CBRCustomizationFileFormat format;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, b.g> typography;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, b.a> colors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, ? extends ru.cyberity.cbr.core.theme.b> metrics;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, ? extends ru.cyberity.cbr.core.theme.b> images;

    /* compiled from: Theme.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434224a;

        static {
            int[] iArr = new int[CBRCustomizationFileFormat.values().length];
            iArr[CBRCustomizationFileFormat.CORDOVA.ordinal()] = 1;
            iArr[CBRCustomizationFileFormat.REACT_NATIVE.ordinal()] = 2;
            iArr[CBRCustomizationFileFormat.FLUTTER.ordinal()] = 3;
            iArr[CBRCustomizationFileFormat.NATIVE.ordinal()] = 4;
            f434224a = iArr;
        }
    }

    /* compiled from: Theme.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u008a\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0014"}, d2 = {"ru/cyberity/cbr/core/theme/d$c", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "name", "b", "I", "d", "size", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int size;

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.name, cVar.name) && this.size == cVar.size;
        }

        public int hashCode() {
            return Integer.hashCode(this.size) + (this.name.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Font(name=");
            sb2.append(this.name);
            sb2.append(", size=");
            return r.t(sb2, this.size, ')');
        }
    }

    @l
    public final Map<String, b.a> a() {
        return this.colors;
    }

    @l
    public final Map<String, ru.cyberity.cbr.core.theme.b> b() {
        return this.images;
    }

    @l
    public final Map<String, ru.cyberity.cbr.core.theme.b> c() {
        return this.metrics;
    }

    @l
    public final Map<String, b.g> d() {
        return this.typography;
    }

    private final String a(String name) {
        return C43066x.r0(C43066x.a0(C43066x.a0(C43066x.a0(name, " ", "", false), "/", "_", false), "-", "", false), '.').toLowerCase(Locale.ROOT);
    }

    @SuppressLint({"DiscouragedApi"})
    public final void a(@k Context context) {
        String str;
        Collection<? extends ru.cyberity.cbr.core.theme.b> collectionValues;
        Bitmap bitmapA;
        Collection<b.g> collectionValues2;
        Collection<? extends ru.cyberity.cbr.core.theme.b> collectionValues3;
        Collection<b.g> collectionValues4;
        int i12 = b.f434224a[this.format.ordinal()];
        if (i12 == 1 || i12 == 2) {
            str = "";
        } else {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            str = "flutter_assets/";
        }
        CBRCustomizationFileFormat cBRCustomizationFileFormat = this.format;
        if (cBRCustomizationFileFormat != CBRCustomizationFileFormat.CORDOVA && cBRCustomizationFileFormat != CBRCustomizationFileFormat.FLUTTER) {
            if (cBRCustomizationFileFormat == CBRCustomizationFileFormat.REACT_NATIVE) {
                Map<String, b.g> map = this.typography;
                if (map != null && (collectionValues4 = map.values()) != null) {
                    for (b.g gVar : collectionValues4) {
                        try {
                            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                            Logger.d$default(aVar, ru.cyberity.log.c.a(this), "Loading typeface " + gVar.getFilename(), null, 4, null);
                            String strA = a(gVar.getFilename());
                            Logger.d$default(aVar, ru.cyberity.log.c.a(this), "filename=" + strA, null, 4, null);
                            int identifier = context.getResources().getIdentifier(strA, "raw", context.getPackageName());
                            Logger.d$default(aVar, ru.cyberity.log.c.a(this), "resId=" + identifier, null, 4, null);
                            gVar.a(i.c(identifier, context));
                        } catch (Exception e12) {
                            ru.cyberity.log.a aVar2 = ru.cyberity.log.a.f436064a;
                            String strA2 = ru.cyberity.log.c.a(this);
                            String message = e12.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            aVar2.e(strA2, message, e12);
                        }
                    }
                }
                Map<String, ? extends ru.cyberity.cbr.core.theme.b> map2 = this.images;
                if (map2 == null || (collectionValues3 = map2.values()) == null) {
                    return;
                }
                for (ru.cyberity.cbr.core.theme.b bVar : collectionValues3) {
                    if (bVar instanceof b.c) {
                        b.c cVar = (b.c) bVar;
                        cVar.a(a(context, cVar));
                    } else if (bVar instanceof b.d) {
                        for (b.c cVar2 : ((b.d) bVar).b().values()) {
                            cVar2.a(a(context, cVar2));
                        }
                    } else {
                        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Theme: Invalid element in images: " + bVar, null, 4, null);
                    }
                }
                return;
            }
            return;
        }
        Map<String, b.g> map3 = this.typography;
        if (map3 != null && (collectionValues2 = map3.values()) != null) {
            for (b.g gVar2 : collectionValues2) {
                try {
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Loading typeface " + gVar2.getFilename(), null, 4, null);
                    gVar2.a(Typeface.createFromAsset(context.getResources().getAssets(), str + gVar2.getFilename()));
                } catch (Exception e13) {
                    ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "", e13);
                }
            }
        }
        Map<String, ? extends ru.cyberity.cbr.core.theme.b> map4 = this.images;
        if (map4 == null || (collectionValues = map4.values()) == null) {
            return;
        }
        for (ru.cyberity.cbr.core.theme.b bVar2 : collectionValues) {
            if (bVar2 instanceof b.c) {
                b.c cVar3 = (b.c) bVar2;
                String image = cVar3.getImage();
                cVar3.a(image != null ? a(context.getResources().getAssets(), str.concat(image)) : null);
            } else if (bVar2 instanceof b.d) {
                for (b.c cVar4 : ((b.d) bVar2).b().values()) {
                    String image2 = cVar4.getImage();
                    if (image2 != null) {
                        bitmapA = a(context.getResources().getAssets(), str.concat(image2));
                        Integer scale = cVar4.getScale();
                        if ((scale != null ? scale.intValue() : 1) > 1 && bitmapA != null) {
                            Integer scale2 = cVar4.getScale();
                            int iIntValue = scale2 != null ? scale2.intValue() : 1;
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, bitmapA.getWidth() * iIntValue, bitmapA.getHeight() * iIntValue, true);
                            bitmapA.recycle();
                            bitmapA = bitmapCreateScaledBitmap;
                        }
                    } else {
                        bitmapA = null;
                    }
                    cVar4.a(bitmapA);
                }
            } else {
                Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Theme: Invalid element in images: " + bVar2, null, 4, null);
            }
        }
    }

    @SuppressLint({"DiscouragedApi"})
    private final Bitmap a(Context context, b.c element) {
        String strA;
        if (element.getImage() == null || (strA = a(element.getImage())) == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(strA, "drawable", context.getPackageName());
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), identifier);
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        String strA2 = ru.cyberity.log.c.a(this);
        StringBuilder sb2 = new StringBuilder("loadRNImage: ");
        sb2.append(element);
        sb2.append(", filename: ");
        sb2.append(strA);
        sb2.append(", resId: ");
        sb2.append(identifier);
        sb2.append(", result=");
        sb2.append(bitmapDecodeResource != null ? Integer.valueOf(bitmapDecodeResource.getWidth()) : null);
        sb2.append('x');
        sb2.append(bitmapDecodeResource != null ? Integer.valueOf(bitmapDecodeResource.getHeight()) : null);
        Logger.d$default(aVar, strA2, sb2.toString(), null, 4, null);
        return bitmapDecodeResource;
    }

    private final Bitmap a(AssetManager assetManager, String file) {
        try {
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Loading image " + file, null, 4, null);
            return BitmapFactory.decodeStream(assetManager.open(file));
        } catch (Exception e12) {
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            String strA = ru.cyberity.log.c.a(this);
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.d(strA, message, e12);
            return null;
        }
    }
}

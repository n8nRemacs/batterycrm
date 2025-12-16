package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import androidx.core.provider.n;
import com.adjust.sdk.Constants;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: TypefaceCompatApi29Impl.java */
@RestrictTo
@X
/* loaded from: classes.dex */
public class E extends F {
    public static Font j(@N FontFamily fontFamily, int i12) {
        FontStyle fontStyle = new FontStyle((i12 & 1) != 0 ? 700 : Constants.MINIMAL_ERROR_STATUS_CODE, (i12 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iL2 = l(fontStyle, font.getStyle());
        for (int i13 = 1; i13 < fontFamily.getSize(); i13++) {
            Font font2 = fontFamily.getFont(i13);
            int iL3 = l(fontStyle, font2.getStyle());
            if (iL3 < iL2) {
                font = font2;
                iL2 = iL3;
            }
        }
        return font;
    }

    @P
    public static FontFamily k(@N n.c[] cVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (n.c cVar : cVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(cVar.f44843a, "r", null);
            } catch (IOException unused) {
                continue;
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cVar.f44845c).setSlant(cVar.f44846d ? 1 : 0).setTtcIndex(cVar.f44844b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int l(@N FontStyle fontStyle, @N FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.F
    @P
    public final Typeface a(Context context, f.d dVar, Resources resources, int i12) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (f.e eVar : dVar.f44659a) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.f44665f).setWeight(eVar.f44661b).setSlant(eVar.f44662c ? 1 : 0).setTtcIndex(eVar.f44664e).setFontVariationSettings(eVar.f44663d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(j(fontFamilyBuild, i12).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.F
    @P
    public final Typeface b(Context context, @N n.c[] cVarArr, int i12) {
        try {
            FontFamily fontFamilyK = k(cVarArr, context.getContentResolver());
            if (fontFamilyK == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyK).setStyle(j(fontFamilyK, i12).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.F
    @P
    public final Typeface c(@N Context context, @N List list, int i12) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyK = k((n.c[]) list.get(0), contentResolver);
            if (fontFamilyK == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyK);
            for (int i13 = 1; i13 < list.size(); i13++) {
                FontFamily fontFamilyK2 = k((n.c[]) list.get(i13), contentResolver);
                if (fontFamilyK2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyK2);
                }
            }
            return customFallbackBuilder.setStyle(j(fontFamilyK, i12).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.F
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.F
    @P
    public final Typeface e(Context context, Resources resources, int i12, String str, int i13) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i12).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.F
    @N
    public final Typeface f(@N Context context, @N Typeface typeface, int i12, boolean z12) {
        return Typeface.create(typeface, i12, z12);
    }

    @Override // androidx.core.graphics.F
    public final n.c h(n.c[] cVarArr, int i12) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

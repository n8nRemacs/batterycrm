package ru.cyberity.cbr.core.theme;

import Y61.k;
import Y61.l;
import android.graphics.Typeface;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRTheme.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeFont;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "sizeSp", "I", "getSizeSp", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final /* data */ class CBRThemeFont {
    private final int sizeSp;

    @k
    private final Typeface typeface;

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRThemeFont)) {
            return false;
        }
        CBRThemeFont cBRThemeFont = (CBRThemeFont) other;
        return L.f(this.typeface, cBRThemeFont.typeface) && this.sizeSp == cBRThemeFont.sizeSp;
    }

    public int hashCode() {
        return Integer.hashCode(this.sizeSp) + (this.typeface.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRThemeFont(typeface=");
        sb2.append(this.typeface);
        sb2.append(", sizeSp=");
        return r.t(sb2, this.sizeSp, ')');
    }
}

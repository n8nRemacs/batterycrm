package ru.cyberity.cbr.core.theme;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRTheme.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeColor;", "", "", FontStyleKt.LIGHT, "dark", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getLight", "getDark", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final /* data */ class CBRThemeColor {
    private final int dark;
    private final int light;

    public CBRThemeColor(int i12, int i13) {
        this.light = i12;
        this.dark = i13;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRThemeColor)) {
            return false;
        }
        CBRThemeColor cBRThemeColor = (CBRThemeColor) other;
        return this.light == cBRThemeColor.light && this.dark == cBRThemeColor.dark;
    }

    public int hashCode() {
        return Integer.hashCode(this.dark) + (Integer.hashCode(this.light) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRThemeColor(light=");
        sb2.append(this.light);
        sb2.append(", dark=");
        return r.t(sb2, this.dark, ')');
    }

    public /* synthetic */ CBRThemeColor(int i12, int i13, int i14, C42822w c42822w) {
        this(i12, (i14 & 2) != 0 ? i12 : i13);
    }
}

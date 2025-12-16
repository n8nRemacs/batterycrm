package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.d0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidPreloadedFont.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/a;", "Landroidx/compose/ui/text/font/l;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "Landroidx/compose/ui/text/font/e0;", "weight", "Landroidx/compose/ui/text/font/Z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/d0$e;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/e0;ILandroidx/compose/ui/text/font/d0$e;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22604a extends AbstractC22618l {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AssetManager f42220h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f42221i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f42222j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C22604a(AssetManager assetManager, String str, e0 e0Var, int i12, d0.e eVar, int i13, C42822w c42822w) {
        if ((i13 & 4) != 0) {
            e0.f42240c.getClass();
            e0Var = e0.f42247j;
        }
        e0 e0Var2 = e0Var;
        if ((i13 & 8) != 0) {
            Z.f42217b.getClass();
            i12 = 0;
        }
        this(assetManager, str, e0Var2, i12, eVar, null);
    }

    @Override // androidx.compose.ui.text.font.AbstractC22618l
    @Y61.l
    public final Typeface c(@Y61.l Context context) {
        v0.f42320a.getClass();
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(this.f42220h, this.f42221i).setFontVariationSettings(v0.a(this.f42232c, context)).build();
    }

    @Override // androidx.compose.ui.text.font.AbstractC22618l
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF42222j() {
        return this.f42222j;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22604a)) {
            return false;
        }
        C22604a c22604a = (C22604a) obj;
        if (kotlin.jvm.internal.L.f(this.f42221i, c22604a.f42221i)) {
            return kotlin.jvm.internal.L.f(this.f42232c, c22604a.f42232c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42232c.f42238a.hashCode() + (this.f42221i.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "Font(assetManager, path=" + this.f42221i + ", weight=" + this.f42269d + ", style=" + ((Object) Z.c(this.f42270e)) + ')';
    }

    public C22604a(AssetManager assetManager, String str, e0 e0Var, int i12, d0.e eVar, C42822w c42822w) {
        super(e0Var, i12, eVar, null);
        this.f42220h = assetManager;
        this.f42221i = str;
        this.f42272g = c(null);
        this.f42222j = androidx.camera.camera2.internal.G.f("asset:", str);
    }
}

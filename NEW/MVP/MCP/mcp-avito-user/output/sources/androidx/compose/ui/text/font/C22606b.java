package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.d0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidPreloadedFont.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/l;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "Landroidx/compose/ui/text/font/e0;", "weight", "Landroidx/compose/ui/text/font/Z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/d0$e;", "variationSettings", "<init>", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/e0;ILandroidx/compose/ui/text/font/d0$e;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.ui.text.font.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22606b extends AbstractC22618l {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ParcelFileDescriptor f42228h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C22606b(ParcelFileDescriptor parcelFileDescriptor, e0 e0Var, int i12, d0.e eVar, int i13, C42822w c42822w) {
        if ((i13 & 2) != 0) {
            e0.f42240c.getClass();
            e0Var = e0.f42247j;
        }
        e0 e0Var2 = e0Var;
        if ((i13 & 4) != 0) {
            Z.f42217b.getClass();
            i12 = 0;
        }
        this(parcelFileDescriptor, e0Var2, i12, eVar, null);
    }

    @Override // androidx.compose.ui.text.font.AbstractC22618l
    @Y61.l
    public final Typeface c(@Y61.l Context context) {
        v0.f42320a.getClass();
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(this.f42228h.getFileDescriptor()).setFontVariationSettings(v0.a(this.f42232c, context)).build();
    }

    @Override // androidx.compose.ui.text.font.AbstractC22618l
    @Y61.l
    public final String d() {
        return null;
    }

    @Y61.k
    public final String toString() {
        return "Font(fileDescriptor=" + this.f42228h + ", weight=" + this.f42269d + ", style=" + ((Object) Z.c(this.f42270e)) + ')';
    }

    public C22606b(ParcelFileDescriptor parcelFileDescriptor, e0 e0Var, int i12, d0.e eVar, C42822w c42822w) {
        super(e0Var, i12, eVar, null);
        this.f42228h = parcelFileDescriptor;
        this.f42272g = c(null);
    }
}

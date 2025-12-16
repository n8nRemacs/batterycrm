package androidx.compose.ui.platform;

import androidx.compose.ui.text.font.C22605a0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/H1;", "", "Landroidx/compose/ui/graphics/T;", "color", "Landroidx/compose/ui/unit/y;", "fontSize", "Landroidx/compose/ui/text/font/e0;", "fontWeight", "Landroidx/compose/ui/text/font/Z;", "fontStyle", "Landroidx/compose/ui/text/font/a0;", "fontSynthesis", "Landroidx/compose/ui/text/font/E;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/n;", "textGeometricTransform", "Lz0/f;", "localeList", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Landroidx/compose/ui/text/style/j;", "textDecoration", "Landroidx/compose/ui/graphics/f1;", "shadow", "<init>", "(JJLandroidx/compose/ui/text/font/e0;Landroidx/compose/ui/text/font/Z;Landroidx/compose/ui/text/font/a0;Landroidx/compose/ui/text/font/E;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/n;Lz0/f;JLandroidx/compose/ui/text/style/j;Landroidx/compose/ui/graphics/f1;Lkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H1 {
    public H1(long j12, long j13, androidx.compose.ui.text.font.e0 e0Var, androidx.compose.ui.text.font.Z z12, C22605a0 c22605a0, androidx.compose.ui.text.font.E e12, String str, long j14, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, z0.f fVar, long j15, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.graphics.f1 f1Var, C42822w c42822w) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public H1(long j12, long j13, androidx.compose.ui.text.font.e0 e0Var, androidx.compose.ui.text.font.Z z12, C22605a0 c22605a0, androidx.compose.ui.text.font.E e12, String str, long j14, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, z0.f fVar, long j15, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.graphics.f1 f1Var, int i12, C42822w c42822w) {
        long j16;
        long j17;
        long j18;
        long j19;
        if ((i12 & 1) != 0) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            j16 = androidx.compose.ui.graphics.T.f39330l;
        } else {
            j16 = j12;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j17 = androidx.compose.ui.unit.y.f42876d;
        } else {
            j17 = j13;
        }
        androidx.compose.ui.text.font.e0 e0Var2 = (i12 & 4) != 0 ? null : e0Var;
        androidx.compose.ui.text.font.Z z13 = (i12 & 8) != 0 ? null : z12;
        C22605a0 c22605a02 = (i12 & 16) != 0 ? null : c22605a0;
        androidx.compose.ui.text.font.E e13 = (i12 & 32) != 0 ? null : e12;
        String str2 = (i12 & 64) != 0 ? null : str;
        if ((i12 & 128) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j18 = androidx.compose.ui.unit.y.f42876d;
        } else {
            j18 = j14;
        }
        androidx.compose.ui.text.style.a aVar2 = (i12 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.n nVar2 = (i12 & 512) != 0 ? null : nVar;
        z0.f fVar2 = (i12 & 1024) != 0 ? null : fVar;
        if ((i12 & 2048) != 0) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            j19 = androidx.compose.ui.graphics.T.f39330l;
        } else {
            j19 = j15;
        }
        this(j16, j17, e0Var2, z13, c22605a02, e13, str2, j18, aVar2, nVar2, fVar2, j19, (i12 & 4096) != 0 ? null : jVar, (i12 & 8192) != 0 ? null : f1Var, null);
    }
}

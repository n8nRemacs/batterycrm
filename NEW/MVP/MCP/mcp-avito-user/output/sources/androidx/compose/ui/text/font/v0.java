package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import androidx.compose.ui.text.InterfaceC22675w;
import androidx.compose.ui.text.font.d0;
import androidx.compose.ui.unit.C22711a;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: AndroidPreloadedFont.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/v0;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final v0 f42320a = new v0();

    @InterfaceC22675w
    @j.X
    public static FontVariationAxis[] a(d0.e eVar, Context context) {
        androidx.compose.ui.unit.d dVarA;
        if (context != null) {
            dVarA = C22711a.a(context);
        } else {
            if (eVar.f42239b) {
                throw new IllegalStateException("Required density, but not provided");
            }
            dVarA = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
        }
        ArrayList arrayList = eVar.f42238a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d0.a aVar = (d0.a) arrayList.get(i12);
            arrayList2.add(new FontVariationAxis(aVar.getF42236a(), aVar.c(dVarA)));
        }
        return (FontVariationAxis[]) arrayList2.toArray(new FontVariationAxis[0]);
    }
}

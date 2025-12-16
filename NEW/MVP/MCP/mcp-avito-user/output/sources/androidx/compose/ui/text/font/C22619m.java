package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AbstractC22610d;
import kotlin.Metadata;

/* compiled from: AndroidPreloadedFont.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/m;", "Landroidx/compose/ui/text/font/d$a;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22619m implements AbstractC22610d.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22619m f42274a = new C22619m();

    @Override // androidx.compose.ui.text.font.AbstractC22610d.a
    @Y61.l
    public final Object a() {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.ui.text.font.AbstractC22610d.a
    @Y61.l
    public final Typeface b(@Y61.k Context context, @Y61.k AbstractC22610d abstractC22610d) {
        AbstractC22618l abstractC22618l = abstractC22610d instanceof AbstractC22618l ? (AbstractC22618l) abstractC22610d : null;
        if (abstractC22618l == null) {
            return null;
        }
        if (!abstractC22618l.f42271f && abstractC22618l.f42272g == null) {
            abstractC22618l.f42272g = abstractC22618l.c(context);
        }
        abstractC22618l.f42271f = true;
        return abstractC22618l.f42272g;
    }
}

package androidx.compose.ui.text.platform;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.collection.m1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.font.AbstractC22610d;
import androidx.compose.ui.text.font.AbstractC22618l;
import androidx.compose.ui.text.font.D;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidFontListTypeface.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/platform/p;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f42580a = new p();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final m1<String, Typeface> f42581b = new m1<>(16, 16, null, null, null, 28, null);

    @Y61.k
    public static Typeface a(@Y61.k Context context, @Y61.k D d12) throws Resources.NotFoundException {
        String f42222j;
        Typeface typefaceB;
        Typeface typefaceB2;
        boolean z12 = d12 instanceof androidx.compose.ui.text.font.s0;
        if (z12) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((androidx.compose.ui.text.font.s0) d12).f42303a, typedValue, true);
            CharSequence charSequence = typedValue.string;
            f42222j = "res:".concat(charSequence != null ? charSequence.toString() : null);
        } else {
            if (!(d12 instanceof AbstractC22618l)) {
                throw new IllegalArgumentException("Unknown font type: " + d12);
            }
            f42222j = ((AbstractC22618l) d12).getF42222j();
        }
        m1<String, Typeface> m1Var = f42581b;
        if (f42222j != null && (typefaceB2 = m1Var.b(f42222j)) != null) {
            return typefaceB2;
        }
        if (z12) {
            j jVar = j.f42568a;
            int i12 = ((androidx.compose.ui.text.font.s0) d12).f42303a;
            jVar.getClass();
            typefaceB = context.getResources().getFont(i12);
        } else {
            if (!(d12 instanceof AbstractC22610d)) {
                throw new IllegalArgumentException("Unknown font type: " + d12);
            }
            AbstractC22610d abstractC22610d = (AbstractC22610d) d12;
            typefaceB = abstractC22610d.f42231b.b(context, abstractC22610d);
        }
        if (typefaceB != null) {
            if (f42222j != null) {
                m1Var.d(f42222j, typefaceB);
            }
            return typefaceB;
        }
        throw new IllegalArgumentException("Unable to load font " + d12);
    }
}

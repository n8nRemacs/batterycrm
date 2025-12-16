package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidPreloadedFont.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/l;", "Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/a;", "Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/c;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22618l extends AbstractC22610d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e0 f42269d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42270e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42271f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Typeface f42272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22618l(e0 e0Var, int i12, d0.e eVar, C42822w c42822w) {
        super(0, C22619m.f42274a, eVar, null);
        X.f42213b.getClass();
        this.f42269d = e0Var;
        this.f42270e = i12;
    }

    @Override // androidx.compose.ui.text.font.D
    /* renamed from: b, reason: from getter */
    public final int getF42270e() {
        return this.f42270e;
    }

    @Y61.l
    public abstract Typeface c(@Y61.l Context context);

    @Y61.l
    public abstract String d();

    @Override // androidx.compose.ui.text.font.D
    @Y61.k
    /* renamed from: getWeight, reason: from getter */
    public final e0 getF42269d() {
        return this.f42269d;
    }
}

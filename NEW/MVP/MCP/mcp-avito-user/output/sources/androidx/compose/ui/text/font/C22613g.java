package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.core.content.res.i;
import kotlin.Metadata;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/g;", "Landroidx/core/content/res/i$f;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22613g extends i.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f42261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f42262b;

    public C22613g(kotlinx.coroutines.r rVar, s0 s0Var) {
        this.f42261a = rVar;
        this.f42262b = s0Var;
    }

    @Override // androidx.core.content.res.i.f
    public final void b(int i12) {
        this.f42261a.f(new IllegalStateException("Unable to load font " + this.f42262b + " (reason=" + i12 + ')'));
    }

    @Override // androidx.core.content.res.i.f
    public final void c(Typeface typeface) {
        int i12 = kotlin.Z.f406624c;
        this.f42261a.resumeWith(typeface);
    }
}

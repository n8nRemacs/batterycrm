package androidx.compose.ui.text.platform.style;

import Y61.k;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: ShaderBrushSpan.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/platform/style/e;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends CharacterStyle implements UpdateAppearance {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d1 f42602b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42603c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f42604d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final I3<Shader> f42605e;

    /* compiled from: ShaderBrushSpan.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Shader> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Shader invoke() {
            e eVar = e.this;
            if (((n) ((C22082i3) eVar.f42604d).getF42167b()).f413404a != 9205357640488583168L) {
                InterfaceC22204y1 interfaceC22204y1 = eVar.f42604d;
                if (!n.f(((n) ((C22082i3) interfaceC22204y1).getF42167b()).f413404a)) {
                    return eVar.f42602b.b(((n) ((C22082i3) interfaceC22204y1).getF42167b()).f413404a);
                }
            }
            return null;
        }
    }

    public e(@k d1 d1Var, float f12) {
        this.f42602b = d1Var;
        this.f42603c = f12;
        n.f413402b.getClass();
        this.f42604d = C22126m3.g(n.a(n.f413403c));
        this.f42605e = C22126m3.d(new a());
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        androidx.compose.ui.text.platform.n.a(textPaint, this.f42603c);
        textPaint.setShader(this.f42605e.getF42167b());
    }
}

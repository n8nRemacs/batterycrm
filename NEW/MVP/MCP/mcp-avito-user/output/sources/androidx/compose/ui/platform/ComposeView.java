package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComposeView.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/a;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "content", "setContent", "(LY41/p;)V", "", "<set-?>", "k", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeView extends AbstractC22450a {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f41092l = 0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0>> f41093j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    @X41.j
    public ComposeView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.C(420213850);
        Y41.p pVar = (Y41.p) ((C22082i3) this.f41093j).getF42167b();
        if (pVar == null) {
            a12.C(358356153);
        } else {
            a12.C(150107208);
            pVar.invoke(a12, 0);
        }
        a12.h();
        a12.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @InterfaceC22137p
    public final void setContent(@Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        ((C22082i3) this.f41093j).setValue(content);
        if (isAttachedToWindow()) {
            c();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f41093j = C22126m3.g(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

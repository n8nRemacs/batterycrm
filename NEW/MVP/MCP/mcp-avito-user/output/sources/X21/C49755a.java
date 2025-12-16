package x21;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j.InterfaceC42153i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import x21.c;

/* compiled from: BackHandlingRecyclerView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx21/a;", "Landroidx/recyclerview/widget/RecyclerView;", "Lx21/b;", "Lx21/c$a;", "listener", "Lkotlin/G0;", "setOnBackClickListener", "(Lx21/c$a;)V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: x21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49755a extends RecyclerView implements b {

    /* renamed from: F0, reason: collision with root package name */
    @k
    public final c f442142F0;

    public /* synthetic */ C49755a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    @Override // android.view.View
    @j.InterfaceC42153i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyPreIme(int r6, @Y61.k android.view.KeyEvent r7) {
        /*
            r5 = this;
            x21.c r0 = r5.f442142F0
            x21.c$a r1 = r0.f442144b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L48
            r1 = 4
            if (r6 != r1) goto L48
            int r1 = r7.getAction()
            x21.a r4 = r0.f442143a
            if (r1 != 0) goto L25
            int r1 = r7.getRepeatCount()
            if (r1 != 0) goto L25
            android.view.KeyEvent$DispatcherState r1 = r4.getKeyDispatcherState()
            if (r1 != 0) goto L20
            goto L23
        L20:
            r1.startTracking(r7, r0)
        L23:
            r0 = r3
            goto L49
        L25:
            int r1 = r7.getAction()
            if (r1 != r3) goto L48
            android.view.KeyEvent$DispatcherState r1 = r4.getKeyDispatcherState()
            if (r1 != 0) goto L32
            goto L35
        L32:
            r1.handleUpEvent(r7)
        L35:
            boolean r1 = r7.isTracking()
            if (r1 == 0) goto L48
            boolean r1 = r7.isCanceled()
            if (r1 != 0) goto L48
            x21.c$a r0 = r0.f442144b
            boolean r0 = r0.a()
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 != 0) goto L51
            boolean r6 = super.onKeyPreIme(r6, r7)
            if (r6 == 0) goto L52
        L51:
            r2 = r3
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x21.C49755a.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    @InterfaceC42153i
    public final void onVisibilityChanged(@k View view, int i12) {
        this.f442142F0.a();
    }

    @Override // android.view.View
    @InterfaceC42153i
    public final void onWindowFocusChanged(boolean z12) {
        super.onWindowFocusChanged(z12);
        c cVar = this.f442142F0;
        if (z12) {
            cVar.a();
        } else {
            cVar.getClass();
        }
    }

    public void setOnBackClickListener(@l c.a listener) {
        setDescendantFocusability(listener != null ? 131072 : 262144);
        c cVar = this.f442142F0;
        cVar.f442144b = listener;
        cVar.a();
    }

    public C49755a(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f442142F0 = new c(this);
    }
}

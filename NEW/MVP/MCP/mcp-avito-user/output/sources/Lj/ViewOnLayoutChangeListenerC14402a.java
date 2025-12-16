package Lj;

import Y61.k;
import android.view.View;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.blurlayout.BlurLayout;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: Lj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC14402a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlurLayout f10091b;

    public ViewOnLayoutChangeListenerC14402a(BlurLayout blurLayout) {
        this.f10091b = blurLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        BlurLayout blurLayout = this.f10091b;
        C22833m0 c22833m0 = (C22833m0) new C22829k0(blurLayout).iterator();
        Object obj = null;
        if (c22833m0.hasNext()) {
            Object next = c22833m0.next();
            if (!c22833m0.hasNext()) {
                obj = next;
            }
        }
        View view2 = (View) obj;
        if (view2 == null || blurLayout.f106793c != null) {
            return;
        }
        blurLayout.f106793c = view2;
        blurLayout.c();
    }
}

package com.avito.android.publish.scanner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner/q;", "Lcom/avito/android/publish/scanner/p;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f239263a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f239264b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f239265c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f239266d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f239267e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f239268f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f239269g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final z<G0> f239270h;

    public q(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a) {
        View viewFindViewById = view.findViewById(R.id.scanner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239263a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.scanner_caption);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239264b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.scanner_help_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f239265c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.frame_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f239266d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.close_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f239267e = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.camera_buttons_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f239268f = viewFindViewById6;
        this.f239269g = new com.avito.android.progress_overlay.l((ViewGroup) view, 0, interfaceC28373a, 0, 0, 26, null);
        ViewGroup.LayoutParams layoutParams = viewFindViewById6.getLayoutParams();
        CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
        if (gVar != null) {
            gVar.b(new FloatingButtonBehavior());
            viewFindViewById6.setLayoutParams(gVar);
        }
        this.f239270h = C37722i.a(viewFindViewById5);
    }
}

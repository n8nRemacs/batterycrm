package com.avito.android.feed_shortcuts.element;

import Y61.l;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.image_loader.i;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: ImageRequests.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f157684b;

    public f(g gVar) {
        this.f157684b = gVar;
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        g gVar = this.f157684b;
        D6.w(gVar.f157690f);
        D6.H(gVar.f157689e);
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
        g gVar = this.f157684b;
        ImageView imageView = gVar.f157689e;
        imageView.setBackground(C43852a.a(imageView.getContext(), R.drawable.bg_warmgray_r16_clickable));
        D6.H(gVar.f157690f);
        D6.g(gVar.f157689e);
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@l Throwable th2) {
        g gVar = this.f157684b;
        gVar.f157689e.setBackground(null);
        D6.w(gVar.f157690f);
    }
}

package com.avito.android.profile_settings_extended.adapter.gallery.gallery_header;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/gallery_header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/gallery/gallery_header/g;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, InterfaceC15026b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229416c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f229417d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f229418e;

    public h(@k View view) {
        super(view);
        this.f229415b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229416c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229417d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.g
    public final void Vj(@k GalleryHeaderItem galleryHeaderItem) {
        I5.a(this.f229416c, galleryHeaderItem.f229404c, false);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f229417d;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, galleryHeaderItem.f229405d, null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.g
    public final void d(@l Y41.a<G0> aVar) {
        this.f229418e = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f229418e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f229418e = null;
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229415b.xT(z12);
    }
}

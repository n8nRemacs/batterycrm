package Ng;

import com.avito.android.barcode.g;
import com.avito.android.deep_linking.links.C29677c;
import com.avito.android.deep_linking.links.C29678d;
import com.avito.android.deep_linking.links.ShowBarcodeLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ShowBarcodeLinkHandlerModule_ProvideShowBarcodeLinkHandlerFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f11704a;

    /* renamed from: b, reason: collision with root package name */
    public final C29678d f11705b;

    public b(g gVar, C29678d c29678d) {
        this.f11704a = gVar;
        this.f11705b = c29678d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f11705b.getClass();
        C29677c c29677c = new C29677c();
        g gVar = this.f11704a;
        C14574a.f11703a.getClass();
        return new C43834a(ShowBarcodeLink.class, c29677c, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ShowBarcodeLink.class), gVar));
    }
}

package Fb;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoNetworkImageViewHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"LFb/d;", "LFb/c;", "Lcom/avito/android/serp/c;", "LFb/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fb.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13554d extends com.avito.android.serp.c implements InterfaceC13553c, InterfaceC13551a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13552b f4796b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f4797c;

    public C13554d(@k View view, @k AdStyle adStyle) {
        super(view);
        this.f4796b = new C13552b(view, adStyle);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        C13552b c13552b = this.f4796b;
        c13552b.getClass();
        return c.a.b(c13552b);
    }

    @Override // Fb.InterfaceC13551a
    public final void N7() {
        this.f4796b.N7();
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        this.f4796b.getClass();
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // Fb.InterfaceC13551a
    public final void a(@k Y41.a<G0> aVar) {
        this.f4796b.a(aVar);
    }

    @Override // Fb.InterfaceC13553c
    public final void d(@l Y41.a<G0> aVar) {
        this.f4797c = aVar;
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle */
    public final AdStyle getF4793c() {
        return this.f4796b.f4793c;
    }

    @Override // Fb.InterfaceC13551a
    @k
    public final View getView() {
        return this.f4796b.f4792b;
    }

    @Override // Fb.InterfaceC13551a
    public final void j1(@l Uri uri) {
        this.f4796b.j1(uri);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f4797c;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f4797c = null;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        C13552b c13552b = this.f4796b;
        c13552b.getClass();
        return c.a.a(c13552b);
    }
}

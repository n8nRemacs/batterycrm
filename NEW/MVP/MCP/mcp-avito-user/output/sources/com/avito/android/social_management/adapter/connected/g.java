package com.avito.android.social_management.adapter.connected;

import Y61.k;
import Y61.l;
import android.view.View;
import com.jakewharton.rxbinding4.view.C37722i;
import gr.C40723b;
import gr.InterfaceC40722a;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConnectedItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social_management/adapter/connected/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/social_management/adapter/connected/f;", "Lgr/a;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, InterfaceC40722a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f284516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C40723b f284517c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f284518d;

    public g(@k View view) {
        super(view);
        this.f284516b = view;
        this.f284517c = new C40723b(view);
    }

    @Override // com.avito.android.social_management.adapter.connected.f
    @k
    public final z<G0> A() {
        return C37722i.a(this.f284516b);
    }

    @Override // com.avito.android.social_management.adapter.connected.f
    public final void d(@l Y41.a<G0> aVar) {
        this.f284518d = aVar;
    }

    @Override // OU.c
    public final void g0(@l CharSequence charSequence) {
        throw null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f284518d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // gr.InterfaceC40722a
    public final void m6(@l CharSequence charSequence) {
        this.f284517c.m6(charSequence);
    }

    @Override // gr.InterfaceC40722a
    public final void setIcon(@InterfaceC42165v int i12) {
        this.f284517c.setIcon(i12);
    }
}

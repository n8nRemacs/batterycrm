package com.avito.android.authorization.select_social.adapter;

import android.view.View;
import com.jakewharton.rxbinding4.view.C37722i;
import gr.C40723b;
import gr.InterfaceC40722a;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42165v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SocialItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/select_social/adapter/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/authorization/select_social/adapter/i;", "Lgr/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements i, InterfaceC40722a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f94486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C40723b f94487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f94488d;

    public j(@Y61.k View view) {
        super(view);
        this.f94486b = view;
        this.f94487c = new C40723b(view);
    }

    @Override // com.avito.android.authorization.select_social.adapter.i
    @Y61.k
    public final z<G0> A() {
        return C37722i.a(this.f94486b);
    }

    @Override // com.avito.android.authorization.select_social.adapter.i
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f94488d = aVar;
    }

    @Override // OU.c
    public final void g0(@Y61.l CharSequence charSequence) {
        throw null;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f94488d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // gr.InterfaceC40722a
    public final void m6(@Y61.l CharSequence charSequence) {
        this.f94487c.m6(charSequence);
    }

    @Override // gr.InterfaceC40722a
    public final void setIcon(@InterfaceC42165v int i12) {
        this.f94487c.setIcon(i12);
    }
}

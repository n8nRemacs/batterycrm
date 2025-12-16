package com.avito.android.social_management.adapter.header;

import Y61.k;
import Y61.l;
import android.view.View;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HeaderItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social_management/adapter/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/social_management/adapter/header/f;", "LOU/a;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, OU.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f284528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OU.b f284529c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f284530d;

    public g(@k View view) {
        super(view);
        this.f284528b = view;
        this.f284529c = new OU.b(view);
    }

    @Override // com.avito.android.social_management.adapter.header.f
    @k
    public final z<G0> A() {
        return C37722i.a(this.f284528b);
    }

    @Override // com.avito.android.social_management.adapter.header.f
    public final void d(@l Y41.a<G0> aVar) {
        this.f284530d = aVar;
    }

    @Override // OU.c
    public final void g0(@l CharSequence charSequence) {
        this.f284529c.g0(charSequence);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f284530d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}

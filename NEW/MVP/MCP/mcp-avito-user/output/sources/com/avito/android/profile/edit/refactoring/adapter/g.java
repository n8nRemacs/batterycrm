package com.avito.android.profile.edit.refactoring.adapter;

import android.view.View;
import com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: EditTextPhoneItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/adapter/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/edit/refactoring/adapter/f;", "Lcom/avito/android/lib/deprecated_design/edit_text/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, InterfaceC31492e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.deprecated_design.edit_text.l f222243b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f222244c;

    public g(@Y61.k View view) {
        super(view);
        this.f222243b = new com.avito.android.lib.deprecated_design.edit_text.l(view, null, (char) 0, 6, null);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    @Y61.k
    @InterfaceC42830m
    public final io.reactivex.rxjava3.internal.observers.y Vz(@Y61.k Y41.l lVar) {
        return this.f222243b.Vz(lVar);
    }

    @Override // com.avito.android.profile.edit.refactoring.adapter.f
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f222244c = aVar;
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    public final void g0(@Y61.k CharSequence charSequence) {
        this.f222243b.g0(charSequence);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f222244c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    public final void m3(@Y61.k CharSequence charSequence) {
        this.f222243b.m3(charSequence);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    @Y61.k
    @InterfaceC42830m
    public final io.reactivex.rxjava3.internal.observers.y t1(@Y61.k Y41.l lVar) {
        return this.f222243b.t1(lVar);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.InterfaceC31492e
    public final void w3(boolean z12) {
        this.f222243b.w3(z12);
    }
}

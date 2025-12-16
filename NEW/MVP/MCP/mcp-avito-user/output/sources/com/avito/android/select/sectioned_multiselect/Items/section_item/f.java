package com.avito.android.select.sectioned_multiselect.Items.section_item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.select.bottom_sheet.blueprints.q;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionImageItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/f;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_item/d;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f266331b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f266332c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f266331b = cVar;
        this.f266332c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        a aVar2 = (a) aVar;
        qVar.setTitle(aVar2.f266319c);
        qVar.f(aVar2.f266320d);
        qVar.l(aVar2.f266324h);
        qVar.setChecked(aVar2.f266323g);
        qVar.Kd(aVar2.f266321e);
        qVar.c3(aVar2.f266322f);
        qVar.a(new e(this, aVar2));
    }

    @Override // com.avito.android.select.sectioned_multiselect.Items.section_item.d
    @k
    public final z<a> d() {
        return this.f266332c;
    }
}

package com.avito.android.compose_items.chips_select;

import Y61.k;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChipsSelectComposeItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/compose_items/chips_select/f;", "Lcom/avito/android/compose_items/chips_select/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f125389d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f125390e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q1 f125391f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f125392g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f125393h;

    @Inject
    public f(@k com.avito.android.util.text.a aVar, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f125389d = aVar;
        this.f125390e = interfaceC35807h4;
        this.f125391f = q12;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f125392g = cVar;
        this.f125393h = new C41981q0(cVar);
    }

    @Override // com.avito.android.compose_items.views.j
    @k
    public final C22096n O(@k ParameterElement.C.b bVar) {
        return new C22096n(1666663385, new e(bVar, this), true);
    }

    @Override // com.avito.android.compose_items.views.j
    @k
    /* renamed from: V, reason: from getter */
    public final Q1 getF125391f() {
        return this.f125391f;
    }

    @Override // com.avito.android.compose_items.views.j
    @k
    /* renamed from: Y, reason: from getter */
    public final InterfaceC35807h4 getF125390e() {
        return this.f125390e;
    }

    @Override // com.avito.android.compose_items.chips_select.c
    @k
    public final z<Ij.b> h() {
        return this.f125393h;
    }

    @Override // com.avito.android.compose_items.views.j
    @k
    /* renamed from: k, reason: from getter */
    public final com.avito.android.util.text.a getF125389d() {
        return this.f125389d;
    }
}

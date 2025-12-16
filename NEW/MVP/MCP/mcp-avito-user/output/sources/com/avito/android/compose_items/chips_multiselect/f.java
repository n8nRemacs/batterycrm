package com.avito.android.compose_items.chips_multiselect;

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

/* compiled from: ChipsMultiselectComposeItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/compose_items/chips_multiselect/f;", "Lcom/avito/android/compose_items/chips_multiselect/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f125371d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f125372e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q1 f125373f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f125374g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f125375h;

    @Inject
    public f(@k com.avito.android.util.text.a aVar, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f125371d = aVar;
        this.f125372e = interfaceC35807h4;
        this.f125373f = q12;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f125374g = cVar;
        this.f125375h = new C41981q0(cVar);
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    public final C22096n O(@k ParameterElement.v vVar) {
        return new C22096n(-420667086, new e(vVar, this), true);
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    /* renamed from: V, reason: from getter */
    public final Q1 getF125373f() {
        return this.f125373f;
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    /* renamed from: Y, reason: from getter */
    public final InterfaceC35807h4 getF125372e() {
        return this.f125372e;
    }

    @Override // com.avito.android.compose_items.chips_multiselect.c
    @k
    public final z<Ij.b> h() {
        return this.f125375h;
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    /* renamed from: k, reason: from getter */
    public final com.avito.android.util.text.a getF125371d() {
        return this.f125371d;
    }
}

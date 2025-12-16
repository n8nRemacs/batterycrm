package com.avito.android.select;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SelectDialogPaginationInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/m;", "Lcom/avito/android/select/g;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> f265554a;

    @Inject
    public m(@Y61.k InterfaceC19588c<? super InterfaceC19587b> interfaceC19588c) {
        this.f265554a = interfaceC19588c;
    }

    @Override // com.avito.android.select.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Zp0.e> a(@Y61.k InterfaceC19587b interfaceC19587b) {
        return this.f265554a.a(interfaceC19587b).r(l.f265553b).F();
    }

    @Override // com.avito.android.select.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Zp0.e> b(@Y61.k String str) {
        return this.f265554a.b(C43066x.A0(str).toString()).r(l.f265553b).F();
    }
}

package com.avito.android.user_advert.advert;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;
import wx.InterfaceC49694a;

/* compiled from: MyDraftAdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/L1;", "Lcom/avito/android/user_advert/advert/I1;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class L1 implements I1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43640a> f308256a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f308257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f308258c;

    @Inject
    public L1(@Y61.k h31.e<InterfaceC43640a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @InterfaceC49694a @Y61.k com.jakewharton.rxrelay3.c<String> cVar) {
        this.f308256a = eVar;
        this.f308257b = interfaceC35745a5;
        this.f308258c = cVar;
    }

    @Override // com.avito.android.user_advert.advert.I1
    @Y61.k
    public final C41936b0 a(@Y61.k String str) {
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(str), this.f308258c.N(new J1(str)));
        K1 k12 = new K1(this, str);
        zVarQ.getClass();
        return new C41936b0(zVarQ, k12);
    }
}

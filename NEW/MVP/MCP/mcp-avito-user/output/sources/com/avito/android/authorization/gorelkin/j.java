package com.avito.android.authorization.gorelkin;

import Wd.InterfaceC15745b;
import Yd.InterfaceC18254a;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ParsingPermissionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/j;", "Lcom/avito/android/authorization/gorelkin/h;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f93925a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f93926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18254a f93927c;

    @Inject
    public j(@Y61.k InterfaceC34258d interfaceC34258d, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC18254a interfaceC18254a) {
        this.f93925a = interfaceC34258d;
        this.f93926b = interfaceC35745a5;
        this.f93927c = interfaceC18254a;
    }

    @Override // com.avito.android.authorization.gorelkin.h
    @Y61.k
    public final W a(@Y61.l String str, @Y61.k String str2, @Y61.k ParsingAllowance parsingAllowance) {
        InterfaceC15745b.C1278b c1278b = new InterfaceC15745b.C1278b();
        return g1.a(this.f93925a.o(str, str2, parsingAllowance.f93864b, c1278b.f17994a)).h(new i(this, c1278b)).z(this.f93926b.a());
    }

    @Override // com.avito.android.authorization.gorelkin.h
    @Y61.k
    public final W b(@Y61.l String str, @Y61.k String str2, @Y61.k ParsingAllowance parsingAllowance) {
        InterfaceC15745b.C1278b c1278b = new InterfaceC15745b.C1278b();
        return g1.a(this.f93925a.h(str, str2, parsingAllowance.f93864b, c1278b.f17994a)).h(new i(this, c1278b)).z(this.f93926b.a());
    }
}

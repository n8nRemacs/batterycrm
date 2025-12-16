package com.avito.android.account;

import Wd.InterfaceC15745b;
import com.avito.android.account.X;
import com.avito.android.remote.InterfaceC34258d;
import kotlin.Metadata;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg0/e;", "tokenData", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/LoginResult;", "apply", "(Lfg0/e;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27670h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27672j f68131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X.a f68132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f68133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f68134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f68135f;

    public C27670h(C27672j c27672j, X.a aVar, String str, String str2, InterfaceC15745b.C1278b c1278b) {
        this.f68131b = c27672j;
        this.f68132c = aVar;
        this.f68133d = str;
        this.f68134e = str2;
        this.f68135f = c1278b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        fg0.e eVar = (fg0.e) obj;
        C27672j c27672j = this.f68131b;
        InterfaceC34258d interfaceC34258d = c27672j.f68145a.get();
        X.a aVar = this.f68132c;
        boolean z12 = !c27672j.f68154j.v().invoke().booleanValue();
        InterfaceC15745b.C1278b c1278b = this.f68135f;
        return interfaceC34258d.d(aVar.f68086a, aVar.f68087b, eVar.f396036a, eVar.f396037b, z12, this.f68133d, this.f68134e, c1278b.f17994a);
    }
}

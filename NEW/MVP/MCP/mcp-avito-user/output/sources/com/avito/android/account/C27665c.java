package com.avito.android.account;

import Wd.InterfaceC15745b;
import kotlin.Metadata;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg0/e;", "tokenData", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SocialProceedResult;", "apply", "(Lfg0/e;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27665c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27672j f68118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f68119c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f68120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f68121e;

    public C27665c(C27672j c27672j, String str, String str2, InterfaceC15745b.C1278b c1278b) {
        this.f68118b = c27672j;
        this.f68119c = str;
        this.f68120d = str2;
        this.f68121e = c1278b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        fg0.e eVar = (fg0.e) obj;
        C27672j c27672j = this.f68118b;
        return c27672j.f68145a.get().j(this.f68119c, eVar.f396036a, eVar.f396037b, !c27672j.f68154j.v().invoke().booleanValue(), this.f68120d, this.f68121e.f17994a);
    }
}

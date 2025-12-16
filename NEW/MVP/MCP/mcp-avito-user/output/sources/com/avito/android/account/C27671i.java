package com.avito.android.account;

import Wd.InterfaceC15745b;
import com.avito.android.account.X;
import com.avito.android.remote.InterfaceC34258d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AccountInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfg0/e;", "tokenData", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SocialAuthResult;", "apply", "(Lfg0/e;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27671i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X.b f68136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C27672j f68137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f68138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f68139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f68140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f68141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f68142h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f68143i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f68144j;

    public C27671i(X.b bVar, C27672j c27672j, String str, String str2, InterfaceC15745b.C1278b c1278b, String str3, String str4, String str5, String str6) {
        this.f68136b = bVar;
        this.f68137c = c27672j;
        this.f68138d = str;
        this.f68139e = str2;
        this.f68140f = c1278b;
        this.f68141g = str3;
        this.f68142h = str4;
        this.f68143i = str5;
        this.f68144j = str6;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        fg0.e eVar = (fg0.e) obj;
        X.b bVar = this.f68136b;
        boolean z12 = bVar instanceof X.b.C2130b;
        InterfaceC15745b.C1278b c1278b = this.f68140f;
        C27672j c27672j = this.f68137c;
        if (!z12) {
            if (!(bVar instanceof X.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            X.b.a aVar = (X.b.a) bVar;
            return c27672j.f68145a.get().m(aVar.f68089b, eVar.f396036a, eVar.f396037b, aVar.f68090c, null, this.f68138d, !c27672j.f68154j.v().invoke().booleanValue(), this.f68139e, c1278b.f17994a);
        }
        InterfaceC34258d interfaceC34258d = c27672j.f68145a.get();
        X.b.C2130b c2130b = (X.b.C2130b) bVar;
        String str = c2130b.f68091b;
        if (str.length() == 0) {
            str = null;
        }
        return interfaceC34258d.p(bVar.f68088a, str, eVar.f396036a, eVar.f396037b, c2130b.f68092c, this.f68138d, !c27672j.f68154j.v().invoke().booleanValue(), this.f68139e, c1278b.f17994a, this.f68141g, this.f68142h, this.f68143i, this.f68144j);
    }
}

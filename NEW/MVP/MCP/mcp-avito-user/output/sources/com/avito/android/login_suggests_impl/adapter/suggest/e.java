package com.avito.android.login_suggests_impl.adapter.suggest;

import Y61.k;
import com.avito.android.login_suggests_impl.Suggest;
import com.avito.android.login_suggests_impl.w;
import kotlin.Metadata;

/* compiled from: SuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/suggest/e;", "Lcom/avito/android/login_suggests_impl/adapter/suggest/b;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f182887b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final w f182888c;

    public e(@k com.jakewharton.rxrelay3.c cVar, @k w wVar) {
        this.f182887b = cVar;
        this.f182888c = wVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String strE;
        f fVar = (f) eVar;
        SuggestItem suggestItem = (SuggestItem) aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.d(new c(fVar, cVar));
        cVar.b(fVar.A().t0(new d(this, suggestItem)));
        Suggest suggest = suggestItem.f182879c;
        fVar.J(suggest.getF182858b());
        fVar.h1(suggest.getF182859c());
        if (suggest instanceof Suggest.Login) {
            fVar.setHint(((Suggest.Login) suggest).f182857d);
            return;
        }
        if (suggest instanceof Suggest.Social) {
            String str = ((Suggest.Social) suggest).f182860d;
            int iHashCode = str.hashCode();
            w wVar = this.f182888c;
            switch (iHashCode) {
                case -1905968092:
                    if (str.equals("avitofake")) {
                        strE = wVar.e();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                case -1459150334:
                    if (str.equals("esia-id")) {
                        strE = wVar.f();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                case 3305:
                    if (str.equals("gp")) {
                        strE = wVar.c();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                case 3548:
                    if (str.equals("ok")) {
                        strE = wVar.b();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                case 3765:
                    if (str.equals("vk")) {
                        strE = wVar.d();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                case 93029210:
                    if (str.equals("apple")) {
                        strE = wVar.a();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                case 112209715:
                    if (str.equals("vk-id")) {
                        strE = wVar.d();
                        fVar.setHint(strE);
                        return;
                    }
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
                default:
                    throw new IllegalArgumentException(AK.c.k("Social ", str, " isn't supported"));
            }
        }
    }
}

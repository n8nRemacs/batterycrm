package com.avito.android.virtual_deal_room_client_creation.create;

import android.content.Context;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CreateScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class B extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RN0.c f326707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f326708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<RN0.a, G0> f326709n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(RN0.c cVar, Context context, Y41.l<? super RN0.a, G0> lVar) {
        super(1);
        this.f326707l = cVar;
        this.f326708m = context;
        this.f326709n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        String strK0;
        m0 m0Var2 = m0Var;
        C36102a.f326740a.getClass();
        m0Var2.c(null, null, C36102a.f326741b);
        m0Var2.c(null, null, C36102a.f326742c);
        m0Var2.c(null, null, C36102a.f326743d);
        RN0.c cVar = this.f326707l;
        Y41.l<RN0.a, G0> lVar = this.f326709n;
        m0Var2.c(null, null, new C22096n(256219941, new o(cVar, lVar), true));
        m0Var2.c(null, null, C36102a.f326744e);
        m0Var2.c(null, null, new C22096n(282365735, new r(cVar, lVar), true));
        m0Var2.c(null, null, C36102a.f326745f);
        m0Var2.c(null, null, new C22096n(308511529, new t(cVar, lVar), true));
        m0Var2.c(null, null, C36102a.f326746g);
        PrintableText printableText = cVar.f14435j.f14444i;
        if (printableText != null && (strK0 = printableText.k0(this.f326708m)) != null) {
            m0Var2.c(null, null, new C22096n(-1141712692, new u(strK0), true));
        }
        m0Var2.c(null, null, C36102a.f326747h);
        RN0.d dVar = cVar.f14435j;
        if (dVar.f14438c) {
            m0Var2.c(null, null, C36102a.f326748i);
        }
        v vVar = v.f326890l;
        x xVar = x.f326893l;
        List<PN0.a> list = dVar.f14443h;
        m0Var2.a(list.size(), vVar != null ? new y(vVar, list) : null, new z(xVar, list), new C22096n(-632812321, new A(lVar, list), true));
        return G0.f406611a;
    }
}

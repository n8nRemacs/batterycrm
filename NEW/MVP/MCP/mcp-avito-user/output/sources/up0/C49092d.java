package up0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import com.avito.android.util.A4;
import com.google.gson.Gson;
import hh.InterfaceC40935c;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import jh.h;
import jh.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import up0.C49089a;

/* compiled from: BbipV2Mapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lup0/d;", "Lup0/c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: up0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49092d implements InterfaceC49091c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f440296a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f440297b;

    /* compiled from: BbipV2Mapper.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"up0/d$a", "Lcom/google/gson/reflect/a;", "", "", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: up0.d$a */
    public static final class a extends com.google.gson.reflect.a<Map<String, ? extends Object>> {
    }

    @Inject
    public C49092d(@InterfaceC40935c @k String str, @k Gson gson) {
        this.f440296a = str;
        this.f440297b = gson;
    }

    @Override // up0.InterfaceC49091c
    @k
    public final Map<String, String> a(@k Object obj) {
        Gson gson = this.f440297b;
        return A4.j(A4.f318516a, (Map) gson.e(gson.l(obj), new a().getType()));
    }

    @Override // up0.InterfaceC49091c
    @k
    public final C49090b b(@k j jVar) {
        Integer numValueOf;
        Object next;
        Integer budget;
        Iterator<T> it = jVar.getBudgetSection().a().iterator();
        while (true) {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((h) next).getRecommended()) {
                break;
            }
        }
        h hVar = (h) next;
        String checkoutContext = jVar.getCheckoutContext();
        if (hVar != null && (budget = hVar.getBudget()) != null) {
            numValueOf = budget;
        } else if (hVar != null) {
            numValueOf = Integer.valueOf(hVar.getPrice());
        }
        return new C49090b(checkoutContext, numValueOf, Integer.valueOf(jVar.getDurationsSection().getPreselected()));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    @Override // up0.InterfaceC49091c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(@Y61.k jh.j r22) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: up0.C49092d.c(jh.j):java.util.ArrayList");
    }

    @Override // up0.InterfaceC49091c
    @k
    public final C49090b d(@l String str, @l b.a aVar, @l b.a aVar2) {
        Integer numValueOf;
        if (aVar == null || (numValueOf = aVar.f261579g) == null) {
            numValueOf = aVar != null ? Integer.valueOf(aVar.f261576d) : null;
        }
        return new C49090b(str, numValueOf, aVar2 != null ? Integer.valueOf(aVar2.f261619a) : null);
    }

    @Override // up0.InterfaceC49091c
    @k
    public final C49089a e(@l String str, @l b.a aVar, @l b.a aVar2) {
        return new C49089a(this.f440296a, str, new C49089a.C12731a(aVar != null ? Integer.valueOf(aVar.f261576d) : null, aVar != null ? aVar.f261579g : null, aVar != null ? aVar.f261575c : null, aVar != null ? Boolean.valueOf(aVar.f261577e) : null), new C49089a.b(aVar2 != null ? Integer.valueOf(aVar2.f261619a) : null, aVar2 != null ? Boolean.valueOf(aVar2.f261622d) : null, aVar2 != null ? Boolean.valueOf(aVar2.f261623e) : null));
    }
}

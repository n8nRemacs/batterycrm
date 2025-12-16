package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.b;
import BI0.d;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SearchReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/A;", "Lcom/avito/android/arch/mvi/u;", "LBI0/b;", "LBI0/d;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A implements com.avito.android.arch.mvi.u<BI0.b, BI0.d> {
    @Inject
    public A() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final BI0.d a(BI0.b bVar, BI0.d dVar) {
        d.C0052d c0052dA;
        BI0.b bVar2 = bVar;
        BI0.d dVar2 = dVar;
        if (bVar2 instanceof b.a) {
            boolean z12 = ((b.a) bVar2).f1303a;
            return (z12 && ((dVar2 instanceof d.b) || (dVar2 instanceof d.c))) ? new d.C0052d(false, false, false, false, new d.a(true, "", "", ""), null, null, null, null, null, null, null, 4079, null) : (z12 || !(dVar2 instanceof d.C0052d)) ? dVar2 : d.b.f1322a;
        }
        if (bVar2 instanceof b.C0051b) {
            b.C0051b c0051b = (b.C0051b) bVar2;
            if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                return dVar2;
            }
            if (!(dVar2 instanceof d.C0052d)) {
                throw new NoWhenBranchMatchedException();
            }
            d.C0052d c0052d = (d.C0052d) dVar2;
            return d.C0052d.a(c0052d, false, false, false, false, null, d.a.a(c0052d.f1329f, false, null, Boolean.valueOf(c0051b.f1304a), 6), null, null, null, null, null, null, 4063);
        }
        if (bVar2 instanceof b.e) {
            b.e eVar = (b.e) bVar2;
            if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                return dVar2;
            }
            if (!(dVar2 instanceof d.C0052d)) {
                throw new NoWhenBranchMatchedException();
            }
            d.C0052d c0052d2 = (d.C0052d) dVar2;
            d.a<Boolean> aVar = c0052d2.f1329f;
            boolean z13 = eVar.f1308a;
            d.a<String> aVar2 = c0052d2.f1328e;
            c0052dA = z13 ? d.C0052d.a(c0052d2, true, false, false, false, d.a.a(aVar2, false, aVar2.f1321d, null, 12), d.a.a(aVar, true, aVar.f1321d, null, 12), null, null, null, null, null, null, 4038) : d.C0052d.a(c0052d2, false, false, false, false, d.a.a(aVar2, true, null, aVar2.f1319b, 6), d.a.a(aVar, true, null, aVar.f1319b, 6), null, null, null, null, null, C42784z0.f406748b, 1990);
        } else if (bVar2 instanceof b.f) {
            b.f fVar = (b.f) bVar2;
            if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                return dVar2;
            }
            if (!(dVar2 instanceof d.C0052d)) {
                throw new NoWhenBranchMatchedException();
            }
            d.C0052d c0052d3 = (d.C0052d) dVar2;
            nI0.i.f414995a.getClass();
            boolean zEquals = fVar.f1309a.equals("draft");
            boolean zEquals2 = c0052d3.f1333j.equals("draft");
            d.a<Boolean> aVar3 = c0052d3.f1329f;
            d.a<String> aVar4 = c0052d3.f1328e;
            c0052dA = zEquals ? d.C0052d.a(c0052d3, false, false, false, false, d.a.a(aVar4, true, null, null, 14), d.a.a(aVar3, true, null, null, 14), null, null, null, fVar.f1309a, null, null, 3531) : zEquals2 ? d.C0052d.a(c0052d3, false, false, true, false, d.a.a(aVar4, true, null, null, 14), d.a.a(aVar3, true, null, null, 14), null, null, null, fVar.f1309a, null, null, 3531) : d.C0052d.a(c0052d3, false, false, false, false, null, null, null, null, null, fVar.f1309a, null, null, 3583);
        } else {
            if (bVar2 instanceof b.g) {
                b.g gVar = (b.g) bVar2;
                if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                    return dVar2;
                }
                if (!(dVar2 instanceof d.C0052d)) {
                    throw new NoWhenBranchMatchedException();
                }
                d.C0052d c0052d4 = (d.C0052d) dVar2;
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = UserAdvertsSearchStartFromType.f312779c;
                String str = c0052d4.f1328e.f1321d;
                boolean zBooleanValue = c0052d4.f1329f.f1321d.booleanValue();
                Map<String, Object> map = gVar.f1310a;
                Map<String, Object> map2 = gVar.f1311b;
                return d.C0052d.a(c0052d4, false, false, false, true, null, null, map, map2, userAdvertsSearchStartFromType, null, new d.e(userAdvertsSearchStartFromType, str, map, map2, zBooleanValue), null, 2615);
            }
            if (!(bVar2 instanceof b.h)) {
                if (bVar2 instanceof b.i) {
                    b.i iVar = (b.i) bVar2;
                    if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                        return dVar2;
                    }
                    if (!(dVar2 instanceof d.C0052d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d.C0052d c0052d5 = (d.C0052d) dVar2;
                    List<String> list = iVar.f1313a;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a((String) it.next()));
                    }
                    return d.C0052d.a(c0052d5, false, false, false, false, null, null, null, null, null, null, null, arrayList, 2047);
                }
                if (bVar2 instanceof b.j) {
                    b.j jVar = (b.j) bVar2;
                    if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                        return dVar2;
                    }
                    if (!(dVar2 instanceof d.C0052d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d.C0052d c0052d6 = (d.C0052d) dVar2;
                    boolean z14 = c0052d6.f1324a;
                    boolean z15 = !z14;
                    d.a aVarA = d.a.a(c0052d6.f1328e, false, null, jVar.f1314a, 6);
                    return d.C0052d.a(c0052d6, false, false, false, z15, aVarA, null, null, null, null, null, !z14 ? new d.e(UserAdvertsSearchStartFromType.f312778b, (String) aVarA.f1321d, c0052d6.f1330g, c0052d6.f1331h, c0052d6.f1329f.f1321d.booleanValue()) : c0052d6.f1334k, null, 3047);
                }
                if (!(bVar2 instanceof b.k)) {
                    if ((bVar2 instanceof b.c) || (bVar2 instanceof b.d)) {
                        return dVar2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                b.k kVar = (b.k) bVar2;
                if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                    return dVar2;
                }
                if (dVar2 instanceof d.C0052d) {
                    return d.C0052d.a((d.C0052d) dVar2, false, kVar.f1315a, false, false, null, null, null, null, null, null, null, null, 4093);
                }
                throw new NoWhenBranchMatchedException();
            }
            b.h hVar = (b.h) bVar2;
            if (dVar2 instanceof d.b ? true : dVar2 instanceof d.c) {
                return dVar2;
            }
            if (!(dVar2 instanceof d.C0052d)) {
                throw new NoWhenBranchMatchedException();
            }
            d.C0052d c0052d7 = (d.C0052d) dVar2;
            String str2 = hVar.f1312a;
            boolean z16 = str2 == null || C43066x.K(str2);
            d.a<Boolean> aVar5 = c0052d7.f1329f;
            d.a<String> aVar6 = c0052d7.f1328e;
            if (z16) {
                d.a aVarA2 = d.a.a(aVar6, false, aVar6.f1321d, null, 12);
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType2 = UserAdvertsSearchStartFromType.f312778b;
                c0052dA = d.C0052d.a(c0052d7, false, false, false, true, aVarA2, null, null, null, userAdvertsSearchStartFromType2, null, new d.e(userAdvertsSearchStartFromType2, (String) aVarA2.f1321d, c0052d7.f1330g, c0052d7.f1331h, aVar5.f1321d.booleanValue()), C42784z0.f406748b, 742);
            } else {
                String str3 = hVar.f1312a;
                d.a aVarA3 = d.a.a(aVar6, true, str3, str3, 4);
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType3 = UserAdvertsSearchStartFromType.f312778b;
                c0052dA = d.C0052d.a(c0052d7, false, false, false, true, aVarA3, null, null, null, userAdvertsSearchStartFromType3, null, new d.e(userAdvertsSearchStartFromType3, (String) aVarA3.f1321d, c0052d7.f1330g, c0052d7.f1331h, aVar5.f1321d.booleanValue()), C42784z0.f406748b, 742);
            }
        }
        return c0052dA;
    }
}

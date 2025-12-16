package com.avito.android.offlinization;

import com.squareup.anvil.annotations.ContributesBinding;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.Request;
import s40.C47994a;
import s40.InterfaceC47995b;
import t40.InterfaceC48498a;
import z40.InterfaceC50372a;

/* compiled from: OfflineInfoExtractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/f;", "Lcom/avito/android/offlinization/e;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208581c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48498a f208582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50372a f208583b;

    /* compiled from: OfflineInfoExtractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/offlinization/f$a;", "", "<init>", "()V", "", "OFFLINE_ANNOTATION_DESCRIPTION_START", "Ljava/lang/String;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final String a(a aVar, String str) {
            aVar.getClass();
            return "Offline annotation error: " + str;
        }

        public a() {
        }
    }

    @Inject
    public f(@Y61.k InterfaceC48498a interfaceC48498a, @Y61.k InterfaceC50372a interfaceC50372a) {
        this.f208582a = interfaceC48498a;
        this.f208583b = interfaceC50372a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    @Override // com.avito.android.offlinization.e
    @Y61.k
    public final InterfaceC47995b a(@Y61.k Request request) {
        Annotation annotation;
        l lVar;
        String strA;
        o[] oVarArrExcludeQueryIfDefault;
        String[] strArrIncludeOnlyQuery;
        String[] strArrExcludeQuery;
        Annotation[] annotations;
        retrofit2.j jVar = (retrofit2.j) request.tag(retrofit2.j.class);
        l lVar2 = null;
        Method method = jVar != null ? jVar.f430007a : null;
        if (method == null || (annotations = method.getAnnotations()) == null) {
            annotation = null;
        } else {
            int length = annotations.length;
            for (int i12 = 0; i12 < length; i12++) {
                annotation = annotations[i12];
                if (annotation instanceof C) {
                    break;
                }
            }
            annotation = null;
        }
        C c12 = annotation instanceof C ? (C) annotation : null;
        if (c12 == null) {
            return this.f208583b.a(request);
        }
        long jTimeoutMs = c12.timeoutMs();
        Parameter[] parameters = method.getParameters();
        C32916d c32916d = new C32916d(null, null, 3, null);
        int length2 = parameters.length;
        int i13 = 0;
        while (true) {
            List<j> list = c32916d.f208579a;
            List<j> list2 = c32916d.f208580b;
            if (i13 >= length2) {
                return new InterfaceC47995b.C12608b(jTimeoutMs, new C47994a(C42745f0.P0(list), C42745f0.P0(list2)));
            }
            Annotation[] annotations2 = parameters[i13].getAnnotations();
            int length3 = annotations2.length;
            l lVar3 = lVar2;
            l lVar4 = lVar3;
            J81.t tVar = lVar4;
            Object obj = tVar;
            int i14 = 0;
            boolean z12 = false;
            boolean z13 = false;
            n nVar = lVar4;
            while (i14 < length3) {
                Annotation annotation2 = annotations2[i14];
                z13 = z13 || (annotation2 instanceof k);
                z12 = z12 || (annotation2 instanceof m);
                if (lVar3 == null) {
                    lVar3 = annotation2 instanceof l ? (l) annotation2 : null;
                }
                Parameter[] parameterArr = parameters;
                if (tVar == null) {
                    tVar = annotation2 instanceof J81.t ? (J81.t) annotation2 : null;
                }
                if (obj == null) {
                    obj = annotation2 instanceof J81.u ? (J81.u) annotation2 : null;
                }
                if (nVar == 0) {
                    nVar = annotation2 instanceof n ? (n) annotation2 : 0;
                }
                i14++;
                parameters = parameterArr;
                nVar = nVar;
            }
            Parameter[] parameterArr2 = parameters;
            if (z12 || z13 || lVar3 != null || nVar != 0) {
                boolean z14 = tVar != null && !z13 && z12 && lVar3 == null;
                boolean z15 = tVar != null && z13 && !z12 && lVar3 == null;
                boolean z16 = (tVar == null || z13 || z12 || lVar3 == null) ? false : true;
                boolean z17 = (obj == null || nVar == 0) ? false : true;
                if (z14) {
                    lVar = null;
                    list.add(i.a(tVar.value(), null));
                } else {
                    if (z15) {
                        list2.add(i.a(tVar.value(), null));
                    } else if (z16) {
                        list2.add(i.a(tVar.value(), lVar3.defaultValue()));
                    } else if (z17) {
                        List<j> list3 = list;
                        String[] strArrIncludeOnlyQuery2 = nVar.includeOnlyQuery();
                        ArrayList arrayList = new ArrayList(strArrIncludeOnlyQuery2.length);
                        for (String str : strArrIncludeOnlyQuery2) {
                            arrayList.add(i.a(str, null));
                        }
                        C42745f0.h(arrayList, list3);
                        List<j> list4 = list2;
                        String[] strArrExcludeQuery2 = nVar.excludeQuery();
                        ArrayList arrayList2 = new ArrayList(strArrExcludeQuery2.length);
                        for (String str2 : strArrExcludeQuery2) {
                            arrayList2.add(i.a(str2, null));
                        }
                        lVar = null;
                        C42745f0.h(arrayList2, list4);
                        o[] oVarArrExcludeQueryIfDefault2 = nVar.excludeQueryIfDefault();
                        ArrayList arrayList3 = new ArrayList(oVarArrExcludeQueryIfDefault2.length);
                        for (o oVar : oVarArrExcludeQueryIfDefault2) {
                            arrayList3.add(i.a(oVar.name(), oVar.key()));
                        }
                        C42745f0.h(arrayList3, list4);
                    } else {
                        lVar = null;
                        a aVar = f208581c;
                        aVar.getClass();
                        StringBuilder sb2 = new StringBuilder("Parameter Annotation: Query: ");
                        sb2.append(tVar != null ? tVar.value() : null);
                        sb2.append(", Excluded ");
                        sb2.append(z13);
                        sb2.append(",ForceIncluded: ");
                        sb2.append(z12);
                        sb2.append(", DefaultExcluded:");
                        sb2.append(lVar3);
                        sb2.append(",QueryMap: IsQueryMap - ");
                        sb2.append(obj != null);
                        sb2.append(", OfflineQueryMap Exclude ");
                        sb2.append((nVar == 0 || (strArrExcludeQuery = nVar.excludeQuery()) == null) ? null : C42756l.P(strArrExcludeQuery, null, null, null, null, 63));
                        sb2.append(", Include ");
                        sb2.append((nVar == 0 || (strArrIncludeOnlyQuery = nVar.includeOnlyQuery()) == null) ? null : C42756l.P(strArrIncludeOnlyQuery, null, null, null, null, 63));
                        sb2.append(",IncludeDefault ");
                        sb2.append((nVar == 0 || (oVarArrExcludeQueryIfDefault = nVar.excludeQueryIfDefault()) == null) ? null : C42756l.P(oVarArrExcludeQueryIfDefault, null, null, null, null, 63));
                        String string = sb2.toString();
                        if (tVar != null && ((z13 && z12) || ((z13 && lVar3 != null) || (z12 && lVar3 != null)))) {
                            strA = a.a(aVar, "Multiple OfflineQueryExclude or OfflineQueryInclude or OfflineQueryExcludeDefault cannot be specified on the same query parameter " + string);
                        } else if (obj != null || nVar == 0) {
                            strA = a.a(aVar, "Unknown error parsing offline annotation " + string);
                        } else {
                            strA = a.a(aVar, "OfflineQueryMap is set to a different parameter type than QueryMap " + string);
                        }
                        this.f208582a.a(new IllegalArgumentException(strA));
                    }
                    lVar = null;
                }
            } else {
                lVar = null;
            }
            i13++;
            parameters = parameterArr2;
            lVar2 = lVar;
        }
    }
}

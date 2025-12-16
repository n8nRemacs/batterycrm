package ru.cyberity.cbr.core.data.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.text.C43066x;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.cyberity.cbr.core.data.model.h;

/* compiled from: AppConfig.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a;\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0000*\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\n\u001a\u001d\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0005\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0005\u0010\u0014\u001a\u0019\u0010\u0005\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0012\")\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\u0004\u0018\u0001`\u0002*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0015\"#\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"#\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"#\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"#\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015\"\u001b\u0010$\u001a\u00020\u0010*\u00020\u000b8F¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\"\u001b\u0010&\u001a\u00020\u0010*\u00020\u000b8F¢\u0006\f\u0012\u0004\b%\u0010#\u001a\u0004\b\u0011\u0010!\"\u001b\u0010(\u001a\u00020\u0010*\u00020\u000b8F¢\u0006\f\u0012\u0004\b'\u0010#\u001a\u0004\b\r\u0010!\"\u001b\u0010+\u001a\u00020\u0010*\u00020\u000b8F¢\u0006\f\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010!\"\u001b\u0010.\u001a\u00020\u0010*\u00020\u000b8F¢\u0006\f\u0012\u0004\b-\u0010#\u001a\u0004\b,\u0010!*\"\u0010/\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000*\"\u00100\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d0\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d0\u0000¨\u00061"}, d2 = {"", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "a", "(Ljava/util/Map;Lru/cyberity/cbr/core/data/model/g;)Ljava/util/Map;", "Lru/cyberity/cbr/core/data/model/remote/a;", "", "Lru/cyberity/cbr/core/data/model/j;", "(Lru/cyberity/cbr/core/data/model/remote/a;)Ljava/util/Map;", "Lru/cyberity/cbr/core/data/model/e;", "titleKey", "b", "(Lru/cyberity/cbr/core/data/model/e;Ljava/lang/String;)Ljava/lang/String;", "documentType", "", "d", "(Lru/cyberity/cbr/core/data/model/e;Ljava/lang/String;)Z", "isBack", "(Lru/cyberity/cbr/core/data/model/e;Ljava/lang/String;Z)Z", "(Lru/cyberity/cbr/core/data/model/e;)Ljava/util/Map;", "countries", "k", "genders", "p", "warnings", "j", "errors", "Lru/cyberity/cbr/core/data/model/remote/c;", "o", "phoneMasks", "f", "(Lru/cyberity/cbr/core/data/model/e;)Z", "getDisableStepsScreen$annotations", "(Lru/cyberity/cbr/core/data/model/e;)V", "disableStepsScreen", "getDisablePendingScreen$annotations", "disablePendingScreen", "getDisableFinalStateStatusScreen$annotations", "disableFinalStateStatusScreen", "h", "getDisableTemporarilyDeclinedStatusScreen$annotations", "disableTemporarilyDeclinedStatusScreen", "m", "getLivenessSaveMode$annotations", "livenessSaveMode", "CountryCodeToNameMap", "PhoneCountryCodeWithMasks", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> a(@Y61.k java.util.Map<java.lang.String, java.lang.String> r3, @Y61.l ru.cyberity.cbr.core.data.model.g r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L4a
            ru.cyberity.cbr.core.data.model.g$c r1 = r4.getRequiredIdDocs()
            if (r1 == 0) goto L4a
            java.util.List r1 = r1.i()
            if (r1 == 0) goto L4a
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L16
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L4a
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.put(r2, r0)
            goto L26
        L48:
            r3 = r4
            goto L90
        L4a:
            if (r4 == 0) goto L90
            ru.cyberity.cbr.core.data.model.g$c r4 = r4.getRequiredIdDocs()
            if (r4 == 0) goto L90
            java.util.List r4 = r4.h()
            if (r4 == 0) goto L90
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L5f
            r0 = r4
        L5f:
            if (r0 == 0) goto L90
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L6e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.put(r2, r1)
            goto L6e
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.a(java.util.Map, ru.cyberity.cbr.core.data.model.g):java.util.Map");
    }

    @Y61.l
    public static final String b(@Y61.k e eVar, @Y61.l String str) {
        Object objC;
        if (str == null || (objC = eVar.C()) == null) {
            return null;
        }
        List<String> listF0 = C43066x.f0(str, new String[]{"."}, 0, 6);
        if (listF0.isEmpty()) {
            return null;
        }
        for (String str2 : listF0) {
            if (objC instanceof Map) {
                objC = ((Map) objC).get(str2);
            }
            if (objC instanceof String) {
                return (String) objC;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(@Y61.k ru.cyberity.cbr.core.data.model.e r9, @Y61.k java.lang.String r10) {
        /*
            r0 = 1
            java.util.Map r1 = r9.E()     // Catch: java.lang.Exception -> L44
            r2 = 0
            if (r1 == 0) goto La2
            java.lang.String r3 = "steps"
            java.lang.String r4 = "documentSelectorMode"
            java.lang.String[] r10 = new java.lang.String[]{r3, r10, r4}     // Catch: java.lang.Exception -> L44
            java.util.List r10 = kotlin.collections.C42745f0.U(r10)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f406842b = r1     // Catch: java.lang.Exception -> L44
            int r1 = r10.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 - r0
            r4 = 0
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r4, r1)     // Catch: java.lang.Exception -> L44
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L29:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L44
            if (r4 == 0) goto L8e
            int r4 = r1.a()     // Catch: java.lang.Exception -> L44
            T r5 = r3.f406842b     // Catch: java.lang.Exception -> L44
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r10.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r5 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r5 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r10 = move-exception
            goto La9
        L47:
            r4 = r2
        L48:
            if (r4 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r5.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L87
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L44
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L6c
            r7 = r2
        L6c:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L44
            if (r7 != 0) goto L71
            goto L7a
        L71:
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L44
            if (r6 != 0) goto L78
            r6 = r2
        L78:
            if (r6 != 0) goto L7c
        L7a:
            r8 = r2
            goto L81
        L7c:
            kotlin.Q r8 = new kotlin.Q     // Catch: java.lang.Exception -> L44
            r8.<init>(r7, r6)     // Catch: java.lang.Exception -> L44
        L81:
            if (r8 == 0) goto L57
            r5.add(r8)     // Catch: java.lang.Exception -> L44
            goto L57
        L87:
            java.util.Map r4 = kotlin.collections.P0.p(r5)     // Catch: java.lang.Exception -> L44
            r3.f406842b = r4     // Catch: java.lang.Exception -> L44
            goto L29
        L8e:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r10 = kotlin.collections.C42745f0.S(r10)     // Catch: java.lang.Exception -> L44
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Exception -> L44
            boolean r1 = r10 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r1 != 0) goto L9f
            goto La0
        L9f:
            r2 = r10
        La0:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L44
        La2:
            java.lang.String r10 = "disabled"
            boolean r0 = kotlin.jvm.internal.L.f(r2, r10)     // Catch: java.lang.Exception -> L44
            goto Lc4
        La9:
            ru.cyberity.log.a r1 = ru.cyberity.log.a.f436064a
            java.lang.String r2 = ru.cyberity.log.c.a(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't parse documentSelectorMode "
            r3.<init>(r4)
            java.util.Map r9 = r9.E()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            ru.cyberity.log.b.b(r1, r2, r9, r10)
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.d(ru.cyberity.cbr.core.data.model.e, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(@Y61.k ru.cyberity.cbr.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto Lbe
            java.lang.String r2 = "disableStepsScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L3e
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r1     // Catch: java.lang.Exception -> L3e
            int r1 = r2.size()     // Catch: java.lang.Exception -> L3e
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> L3e
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L3e
        L22:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L3e
            r5 = 0
            if (r4 == 0) goto L88
            int r4 = r1.a()     // Catch: java.lang.Exception -> L3e
            T r6 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L3e
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L41
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            r1 = move-exception
            goto La3
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L9c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r6.<init>()     // Catch: java.lang.Exception -> L3e
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3e
        L51:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r7 == 0) goto L81
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L3e
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L3e
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L3e
            if (r9 != 0) goto L66
            r8 = r5
        L66:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3e
            if (r8 != 0) goto L6b
            goto L74
        L6b:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L3e
            if (r7 != 0) goto L72
            r7 = r5
        L72:
            if (r7 != 0) goto L76
        L74:
            r9 = r5
            goto L7b
        L76:
            kotlin.Q r9 = new kotlin.Q     // Catch: java.lang.Exception -> L3e
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L3e
        L7b:
            if (r9 == 0) goto L51
            r6.add(r9)     // Catch: java.lang.Exception -> L3e
            goto L51
        L81:
            java.util.Map r4 = kotlin.collections.P0.p(r6)     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r4     // Catch: java.lang.Exception -> L3e
            goto L22
        L88:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = kotlin.collections.C42745f0.S(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L3e
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L3e
            if (r2 != 0) goto L99
            goto L9a
        L99:
            r5 = r1
        L9a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L3e
        L9c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3e
            boolean r0 = kotlin.jvm.internal.L.f(r5, r1)     // Catch: java.lang.Exception -> L3e
            goto Lbe
        La3:
            ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
            java.lang.String r3 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            ru.cyberity.log.b.b(r2, r3, r10, r1)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.f(ru.cyberity.cbr.core.data.model.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(@Y61.k ru.cyberity.cbr.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto Lbe
            java.lang.String r2 = "disableTemporarilyDeclinedStatusScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L3e
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r1     // Catch: java.lang.Exception -> L3e
            int r1 = r2.size()     // Catch: java.lang.Exception -> L3e
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> L3e
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L3e
        L22:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L3e
            r5 = 0
            if (r4 == 0) goto L88
            int r4 = r1.a()     // Catch: java.lang.Exception -> L3e
            T r6 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L3e
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L41
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            r1 = move-exception
            goto La3
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L9c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r6.<init>()     // Catch: java.lang.Exception -> L3e
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3e
        L51:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r7 == 0) goto L81
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L3e
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L3e
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L3e
            if (r9 != 0) goto L66
            r8 = r5
        L66:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3e
            if (r8 != 0) goto L6b
            goto L74
        L6b:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L3e
            if (r7 != 0) goto L72
            r7 = r5
        L72:
            if (r7 != 0) goto L76
        L74:
            r9 = r5
            goto L7b
        L76:
            kotlin.Q r9 = new kotlin.Q     // Catch: java.lang.Exception -> L3e
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L3e
        L7b:
            if (r9 == 0) goto L51
            r6.add(r9)     // Catch: java.lang.Exception -> L3e
            goto L51
        L81:
            java.util.Map r4 = kotlin.collections.P0.p(r6)     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r4     // Catch: java.lang.Exception -> L3e
            goto L22
        L88:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = kotlin.collections.C42745f0.S(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L3e
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L3e
            if (r2 != 0) goto L99
            goto L9a
        L99:
            r5 = r1
        L9a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L3e
        L9c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3e
            boolean r0 = kotlin.jvm.internal.L.f(r5, r1)     // Catch: java.lang.Exception -> L3e
            goto Lbe
        La3:
            ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
            java.lang.String r3 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse disableTemporarilyDeclinedStatusScreen "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            ru.cyberity.log.b.b(r2, r3, r10, r1)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.h(ru.cyberity.cbr.core.data.model.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> j(@Y61.k ru.cyberity.cbr.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "idDocErrors"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Q r4 = new kotlin.Q
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.P0.p(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.j(ru.cyberity.cbr.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> k(@Y61.k ru.cyberity.cbr.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "genders"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Q r4 = new kotlin.Q
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.P0.p(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.k(ru.cyberity.cbr.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m(@Y61.k ru.cyberity.cbr.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto Lbe
            java.lang.String r2 = "livenessSaveMode"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L3e
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r1     // Catch: java.lang.Exception -> L3e
            int r1 = r2.size()     // Catch: java.lang.Exception -> L3e
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> L3e
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L3e
        L22:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L3e
            r5 = 0
            if (r4 == 0) goto L88
            int r4 = r1.a()     // Catch: java.lang.Exception -> L3e
            T r6 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L3e
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L41
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            r1 = move-exception
            goto La3
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L9c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r6.<init>()     // Catch: java.lang.Exception -> L3e
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3e
        L51:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r7 == 0) goto L81
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L3e
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L3e
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L3e
            if (r9 != 0) goto L66
            r8 = r5
        L66:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3e
            if (r8 != 0) goto L6b
            goto L74
        L6b:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L3e
            if (r7 != 0) goto L72
            r7 = r5
        L72:
            if (r7 != 0) goto L76
        L74:
            r9 = r5
            goto L7b
        L76:
            kotlin.Q r9 = new kotlin.Q     // Catch: java.lang.Exception -> L3e
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L3e
        L7b:
            if (r9 == 0) goto L51
            r6.add(r9)     // Catch: java.lang.Exception -> L3e
            goto L51
        L81:
            java.util.Map r4 = kotlin.collections.P0.p(r6)     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r4     // Catch: java.lang.Exception -> L3e
            goto L22
        L88:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = kotlin.collections.C42745f0.S(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L3e
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L3e
            if (r2 != 0) goto L99
            goto L9a
        L99:
            r5 = r1
        L9a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L3e
        L9c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3e
            boolean r0 = kotlin.jvm.internal.L.f(r5, r1)     // Catch: java.lang.Exception -> L3e
            goto Lbe
        La3:
            ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
            java.lang.String r3 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse livenessSaveMode "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            ru.cyberity.log.b.b(r2, r3, r10, r1)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.m(ru.cyberity.cbr.core.data.model.e):boolean");
    }

    @Y61.l
    public static final Map<String, ru.cyberity.cbr.core.data.model.remote.c> o(@Y61.k e eVar) {
        Map<String, ru.cyberity.cbr.core.data.model.remote.c> mapB = eVar.B();
        if (mapB == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapB.size()));
        Iterator<T> it = mapB.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((ru.cyberity.cbr.core.data.model.remote.c) entry.getValue()).h());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> p(@Y61.k ru.cyberity.cbr.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "idDocWarnings"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Q r4 = new kotlin.Q
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.P0.p(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.p(ru.cyberity.cbr.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(@Y61.k ru.cyberity.cbr.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto Lbe
            java.lang.String r2 = "disableFinalStateStatusScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L3e
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r1     // Catch: java.lang.Exception -> L3e
            int r1 = r2.size()     // Catch: java.lang.Exception -> L3e
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> L3e
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L3e
        L22:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L3e
            r5 = 0
            if (r4 == 0) goto L88
            int r4 = r1.a()     // Catch: java.lang.Exception -> L3e
            T r6 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L3e
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L41
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            r1 = move-exception
            goto La3
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L9c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r6.<init>()     // Catch: java.lang.Exception -> L3e
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3e
        L51:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r7 == 0) goto L81
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L3e
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L3e
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L3e
            if (r9 != 0) goto L66
            r8 = r5
        L66:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3e
            if (r8 != 0) goto L6b
            goto L74
        L6b:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L3e
            if (r7 != 0) goto L72
            r7 = r5
        L72:
            if (r7 != 0) goto L76
        L74:
            r9 = r5
            goto L7b
        L76:
            kotlin.Q r9 = new kotlin.Q     // Catch: java.lang.Exception -> L3e
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L3e
        L7b:
            if (r9 == 0) goto L51
            r6.add(r9)     // Catch: java.lang.Exception -> L3e
            goto L51
        L81:
            java.util.Map r4 = kotlin.collections.P0.p(r6)     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r4     // Catch: java.lang.Exception -> L3e
            goto L22
        L88:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = kotlin.collections.C42745f0.S(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L3e
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L3e
            if (r2 != 0) goto L99
            goto L9a
        L99:
            r5 = r1
        L9a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L3e
        L9c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3e
            boolean r0 = kotlin.jvm.internal.L.f(r5, r1)     // Catch: java.lang.Exception -> L3e
            goto Lbe
        La3:
            ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
            java.lang.String r3 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse disableFinalStateStatusScreen "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            ru.cyberity.log.b.b(r2, r3, r10, r1)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.b(ru.cyberity.cbr.core.data.model.e):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    @Y61.k
    public static final Map<String, List<j>> a(@Y61.k ru.cyberity.cbr.core.data.model.remote.a aVar) {
        Set<Map.Entry<String, List<ru.cyberity.cbr.core.data.model.remote.h>>> setEntrySet;
        ?? I12;
        String strF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ru.cyberity.ff.a aVar2 = ru.cyberity.ff.a.f435638a;
        JSONObject jSONObject = (!aVar2.g().g() || (strF = aVar2.g().f()) == null) ? null : new JSONObject(strF);
        Map<String, List<ru.cyberity.cbr.core.data.model.remote.h>> mapB = aVar.b();
        if (mapB != null && (setEntrySet = mapB.entrySet()) != null && (r1 = setEntrySet.iterator()) != null) {
            for (Map.Entry<String, List<ru.cyberity.cbr.core.data.model.remote.h>> entry : setEntrySet) {
                ArrayList arrayList = new ArrayList();
                String key = entry.getKey();
                JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(key) : null;
                for (ru.cyberity.cbr.core.data.model.remote.h hVar : entry.getValue()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(hVar.k()) : null;
                    if (jSONObjectOptJSONObject2 != null) {
                        List<h.d> listI = hVar.i();
                        if (listI != null) {
                            I12 = new ArrayList(C42745f0.q(listI, 10));
                            for (h.d dVarA : listI) {
                                FieldName name = dVarA.getName();
                                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(name != null ? name.getValue() : null);
                                List<String> listB = jSONArrayOptJSONArray != null ? ru.cyberity.cbr.core.theme.c.b(jSONArrayOptJSONArray) : null;
                                if (listB != null) {
                                    dVarA = h.d.a(dVarA, null, false, null, null, listB, null, null, 103, null);
                                }
                                I12.add(dVarA);
                            }
                        } else {
                            I12 = 0;
                        }
                    } else {
                        I12 = hVar.i();
                    }
                    arrayList.add(new j(hVar.k(), hVar.g(), hVar.e(), I12));
                }
                linkedHashMap.put(key, arrayList);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(@Y61.k ru.cyberity.cbr.core.data.model.e r10) {
        /*
            r0 = 0
            java.util.Map r1 = r10.E()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto Lbe
            java.lang.String r2 = "disablePendingScreen"
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Exception -> L3e
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r1     // Catch: java.lang.Exception -> L3e
            int r1 = r2.size()     // Catch: java.lang.Exception -> L3e
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> L3e
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L3e
        L22:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L3e
            r5 = 0
            if (r4 == 0) goto L88
            int r4 = r1.a()     // Catch: java.lang.Exception -> L3e
            T r6 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Exception -> L3e
            boolean r6 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L41
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L3e
            goto L42
        L3e:
            r1 = move-exception
            goto La3
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L9c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r6.<init>()     // Catch: java.lang.Exception -> L3e
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3e
        L51:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r7 == 0) goto L81
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Exception -> L3e
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L3e
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L3e
            if (r9 != 0) goto L66
            r8 = r5
        L66:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3e
            if (r8 != 0) goto L6b
            goto L74
        L6b:
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L3e
            if (r7 != 0) goto L72
            r7 = r5
        L72:
            if (r7 != 0) goto L76
        L74:
            r9 = r5
            goto L7b
        L76:
            kotlin.Q r9 = new kotlin.Q     // Catch: java.lang.Exception -> L3e
            r9.<init>(r8, r7)     // Catch: java.lang.Exception -> L3e
        L7b:
            if (r9 == 0) goto L51
            r6.add(r9)     // Catch: java.lang.Exception -> L3e
            goto L51
        L81:
            java.util.Map r4 = kotlin.collections.P0.p(r6)     // Catch: java.lang.Exception -> L3e
            r3.f406842b = r4     // Catch: java.lang.Exception -> L3e
            goto L22
        L88:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L3e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L3e
            java.lang.Object r2 = kotlin.collections.C42745f0.S(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L3e
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L3e
            if (r2 != 0) goto L99
            goto L9a
        L99:
            r5 = r1
        L9a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L3e
        L9c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3e
            boolean r0 = kotlin.jvm.internal.L.f(r5, r1)     // Catch: java.lang.Exception -> L3e
            goto Lbe
        La3:
            ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
            java.lang.String r3 = ru.cyberity.log.c.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't parse disablePendingScreen "
            r4.<init>(r5)
            java.util.Map r10 = r10.E()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            ru.cyberity.log.b.b(r2, r3, r10, r1)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.d(ru.cyberity.cbr.core.data.model.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> a(@Y61.k ru.cyberity.cbr.core.data.model.e r5) {
        /*
            java.util.Map r5 = r5.C()
            r0 = 0
            if (r5 == 0) goto Le
            java.lang.String r1 = "countries"
            java.lang.Object r5 = r5.get(r1)
            goto Lf
        Le:
            r5 = r0
        Lf:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L16
            java.util.Map r5 = (java.util.Map) r5
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L4e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L26
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L5a
            boolean r5 = r1.isEmpty()
            r2 = 1
            r5 = r5 ^ r2
            if (r5 != r2) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L84
            goto L91
        L84:
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L8d
            r2 = r0
        L8d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
        L91:
            r4 = r0
            goto L98
        L93:
            kotlin.Q r4 = new kotlin.Q
            r4.<init>(r3, r2)
        L98:
            if (r4 == 0) goto L6a
            r5.add(r4)
            goto L6a
        L9e:
            java.util.Map r0 = kotlin.collections.P0.p(r5)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.a(ru.cyberity.cbr.core.data.model.e):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@Y61.k ru.cyberity.cbr.core.data.model.e r8, @Y61.k java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            java.util.Map r1 = r8.E()     // Catch: java.lang.Exception -> Lf
            r2 = 0
            if (r1 == 0) goto La7
            java.lang.String r3 = "steps"
            if (r10 == 0) goto L12
            java.lang.String r10 = "backsideInstructionsScreen"
            goto L14
        Lf:
            r9 = move-exception
            goto Lae
        L12:
            java.lang.String r10 = "introScreen"
        L14:
            java.lang.String[] r9 = new java.lang.String[]{r3, r9, r10}     // Catch: java.lang.Exception -> Lf
            java.util.List r9 = kotlin.collections.C42745f0.U(r9)     // Catch: java.lang.Exception -> Lf
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> Lf
            r10.<init>()     // Catch: java.lang.Exception -> Lf
            r10.f406842b = r1     // Catch: java.lang.Exception -> Lf
            int r1 = r9.size()     // Catch: java.lang.Exception -> Lf
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> Lf
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> Lf
        L31:
            boolean r3 = r1.f406910d     // Catch: java.lang.Exception -> Lf
            if (r3 == 0) goto L93
            int r3 = r1.a()     // Catch: java.lang.Exception -> Lf
            T r4 = r10.f406842b     // Catch: java.lang.Exception -> Lf
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lf
            java.lang.Object r3 = r9.get(r3)     // Catch: java.lang.Exception -> Lf
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> Lf
            boolean r4 = r3 instanceof java.util.Map     // Catch: java.lang.Exception -> Lf
            if (r4 == 0) goto L4c
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> Lf
            goto L4d
        L4c:
            r3 = r2
        L4d:
            if (r3 == 0) goto La7
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lf
            r4.<init>()     // Catch: java.lang.Exception -> Lf
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Exception -> Lf
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Lf
        L5c:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> Lf
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> Lf
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> Lf
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> Lf
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r7 != 0) goto L71
            r6 = r2
        L71:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf
            if (r6 != 0) goto L76
            goto L7f
        L76:
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> Lf
            if (r5 != 0) goto L7d
            r5 = r2
        L7d:
            if (r5 != 0) goto L81
        L7f:
            r7 = r2
            goto L86
        L81:
            kotlin.Q r7 = new kotlin.Q     // Catch: java.lang.Exception -> Lf
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> Lf
        L86:
            if (r7 == 0) goto L5c
            r4.add(r7)     // Catch: java.lang.Exception -> Lf
            goto L5c
        L8c:
            java.util.Map r3 = kotlin.collections.P0.p(r4)     // Catch: java.lang.Exception -> Lf
            r10.f406842b = r3     // Catch: java.lang.Exception -> Lf
            goto L31
        L93:
            T r10 = r10.f406842b     // Catch: java.lang.Exception -> Lf
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Exception -> Lf
            java.lang.Object r9 = kotlin.collections.C42745f0.S(r9)     // Catch: java.lang.Exception -> Lf
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Exception -> Lf
            boolean r10 = r9 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> Lf
            if (r10 != 0) goto La4
            goto La5
        La4:
            r2 = r9
        La5:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> Lf
        La7:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lf
            boolean r0 = kotlin.jvm.internal.L.f(r2, r9)     // Catch: java.lang.Exception -> Lf
            goto Lc9
        Lae:
            ru.cyberity.log.a r10 = ru.cyberity.log.a.f436064a
            java.lang.String r1 = ru.cyberity.log.c.a(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't parse showIntroScreen "
            r2.<init>(r3)
            java.util.Map r8 = r8.E()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            ru.cyberity.log.b.b(r10, r1, r8, r9)
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.a(ru.cyberity.cbr.core.data.model.e, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@Y61.k ru.cyberity.cbr.core.data.model.e r9, @Y61.k java.lang.String r10) {
        /*
            r0 = 0
            java.util.Map r1 = r9.E()     // Catch: java.lang.Exception -> L44
            r2 = 0
            if (r1 == 0) goto La2
            java.lang.String r3 = "steps"
            java.lang.String r4 = "allowManualUpload"
            java.lang.String[] r10 = new java.lang.String[]{r3, r10, r4}     // Catch: java.lang.Exception -> L44
            java.util.List r10 = kotlin.collections.C42745f0.U(r10)     // Catch: java.lang.Exception -> L44
            kotlin.jvm.internal.l0$h r3 = new kotlin.jvm.internal.l0$h     // Catch: java.lang.Exception -> L44
            r3.<init>()     // Catch: java.lang.Exception -> L44
            r3.f406842b = r1     // Catch: java.lang.Exception -> L44
            int r1 = r10.size()     // Catch: java.lang.Exception -> L44
            int r1 = r1 + (-1)
            kotlin.ranges.l r1 = kotlin.ranges.s.r(r0, r1)     // Catch: java.lang.Exception -> L44
            kotlin.ranges.k r1 = r1.iterator()     // Catch: java.lang.Exception -> L44
        L29:
            boolean r4 = r1.f406910d     // Catch: java.lang.Exception -> L44
            if (r4 == 0) goto L8e
            int r4 = r1.a()     // Catch: java.lang.Exception -> L44
            T r5 = r3.f406842b     // Catch: java.lang.Exception -> L44
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r10.get(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Exception -> L44
            boolean r5 = r4 instanceof java.util.Map     // Catch: java.lang.Exception -> L44
            if (r5 == 0) goto L47
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r10 = move-exception
            goto La9
        L47:
            r4 = r2
        L48:
            if (r4 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L44
            r5.<init>()     // Catch: java.lang.Exception -> L44
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L44
        L57:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> L44
            if (r6 == 0) goto L87
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Exception -> L44
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L44
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L6c
            r7 = r2
        L6c:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L44
            if (r7 != 0) goto L71
            goto L7a
        L71:
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L44
            if (r6 != 0) goto L78
            r6 = r2
        L78:
            if (r6 != 0) goto L7c
        L7a:
            r8 = r2
            goto L81
        L7c:
            kotlin.Q r8 = new kotlin.Q     // Catch: java.lang.Exception -> L44
            r8.<init>(r7, r6)     // Catch: java.lang.Exception -> L44
        L81:
            if (r8 == 0) goto L57
            r5.add(r8)     // Catch: java.lang.Exception -> L44
            goto L57
        L87:
            java.util.Map r4 = kotlin.collections.P0.p(r5)     // Catch: java.lang.Exception -> L44
            r3.f406842b = r4     // Catch: java.lang.Exception -> L44
            goto L29
        L8e:
            T r1 = r3.f406842b     // Catch: java.lang.Exception -> L44
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r10 = kotlin.collections.C42745f0.S(r10)     // Catch: java.lang.Exception -> L44
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Exception -> L44
            boolean r1 = r10 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L44
            if (r1 != 0) goto L9f
            goto La0
        L9f:
            r2 = r10
        La0:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L44
        La2:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L44
            boolean r0 = kotlin.jvm.internal.L.f(r2, r10)     // Catch: java.lang.Exception -> L44
            goto Lc4
        La9:
            ru.cyberity.log.a r1 = ru.cyberity.log.a.f436064a
            java.lang.String r2 = ru.cyberity.log.c.a(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't parse allowManualUpload "
            r3.<init>(r4)
            java.util.Map r9 = r9.E()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            ru.cyberity.log.b.b(r1, r2, r9, r10)
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.model.f.a(ru.cyberity.cbr.core.data.model.e, java.lang.String):boolean");
    }
}

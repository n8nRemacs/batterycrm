package n40;

import Y61.k;
import com.avito.android.offlinization.beduin.PatternCachingFallbackRequiredException;
import com.avito.android.offlinization.beduin.analytics.BeduinPatternCacheErrorType;
import com.avito.android.offlinization.beduin.i;
import com.avito.android.offlinization.beduin.o;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import o40.InterfaceC44578a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AepPatternHandler.kt */
@C11.a
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln40/a;", "Lcom/avito/android/offlinization/beduin/o;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44181a implements o {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f414896a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44578a f414897b;

    @Inject
    public C44181a(@k i iVar, @k InterfaceC44578a interfaceC44578a) {
        this.f414896a = iVar;
        this.f414897b = interfaceC44578a;
    }

    @Override // com.avito.android.offlinization.beduin.o
    @k
    public final List<String> a(@k String str) {
        return this.f414896a.a(str);
    }

    @Override // com.avito.android.offlinization.beduin.o
    public final boolean b(@k String str) {
        return C43066x.h0(str.toLowerCase(Locale.ROOT), "aep_", false);
    }

    @Override // com.avito.android.offlinization.beduin.o
    @k
    public final String c(@k String str, @k String str2, @k JSONObject jSONObject, boolean z12) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("main");
        boolean z13 = false;
        boolean z14 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.optJSONObject("rootComponent") == null) ? false : true;
        boolean z15 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.optJSONObject("params") == null) ? false : true;
        if (z14 && z15) {
            z13 = true;
        }
        i iVar = this.f414896a;
        String strB = iVar.b(str2, str);
        InterfaceC44578a interfaceC44578a = this.f414897b;
        if (z13) {
            if (strB == null) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("main");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.remove("params");
                }
                jSONObject2.remove("cacheKey");
                iVar.c(str2, str, jSONObject2.toString());
                InterfaceC44578a.b.a(this.f414897b, str2, str, z12, null, 48);
            } else {
                BeduinPatternCacheErrorType beduinPatternCacheErrorType = BeduinPatternCacheErrorType.f208515c;
                InterfaceC44578a.b.b(interfaceC44578a, str2, str, null, 16);
            }
            return jSONObject.toString();
        }
        if (z13) {
            throw new NoWhenBranchMatchedException();
        }
        if (strB == null) {
            InterfaceC44578a.b.a(this.f414897b, str2, str, z12, BeduinPatternCacheErrorType.f208517e, 20);
            throw new PatternCachingFallbackRequiredException();
        }
        com.avito.android.time.c.f301452a.getClass();
        long jA2 = com.avito.android.time.c.f301453b.a();
        JSONObject jSONObject3 = jSONObject.getJSONObject("main").getJSONObject("params");
        JSONObject jSONObject4 = new JSONObject(strB);
        jSONObject4.getJSONObject("main").put("params", jSONObject3);
        long jA3 = com.avito.android.time.c.f301453b.a() - jA2;
        String string = jSONObject4.toString();
        InterfaceC44578a.b.b(interfaceC44578a, str2, str, Long.valueOf(jA3), 48);
        return string;
    }
}

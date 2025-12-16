package Fc1;

import i31.InterfaceC41220a;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Named;
import kotlin.text.C43066x;
import xyz.n.a.ke;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ke f4844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13753v4 f4845b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f4846c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f4847d;

    @i31.c
    public D1(@InterfaceC41220a @Y61.k ke keVar, @Y61.k InterfaceC13753v4 interfaceC13753v4, @Y61.k @Named("appId") String str, @Y61.k @Named("defaultApiUrl") String str2, @Y61.k @Named("defaultApiVer") String str3) {
        this.f4844a = keVar;
        this.f4845b = interfaceC13753v4;
        this.f4846c = str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("{apiVersion}", str3);
        linkedHashMap.put("{appId}", str);
        this.f4847d = linkedHashMap;
    }

    @Y61.k
    public final String a() {
        String string = this.f4844a.f442790b;
        for (Map.Entry entry : this.f4847d.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            int I12 = C43066x.I(string, str, 0, true, 2);
            if (I12 >= 0) {
                string = C43066x.d0(string, I12, str.length() + I12, str2).toString();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String strA = W1.a(this.f4845b.d());
        if (strA.length() == 0) {
            strA = this.f4846c;
        }
        return AK.c.s(sb2, strA, string);
    }
}

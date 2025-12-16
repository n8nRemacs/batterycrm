package com.avito.android.lib.beduin_v2.feature.tracker;

import cT.C27093a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.lib.beduin_v2.feature.di.C31113b;
import com.avito.android.util.C;
import com.avito.beduin.v2.engine.exception.AbstractBeduinException;
import com.avito.beduin.v2.engine.exception.BeduinExceptionType;
import gT.C40620a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: BeduinErrorAnalyticsSender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/a;", "LaU0/b;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/BeduinErrorTracker;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements aU0.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f176368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ZS.b f176369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C f176370d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C40620a f176371e;

    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ZS.b bVar, @Y61.k C c12, @Y61.k C40620a c40620a) {
        this.f176368b = interfaceC28373a;
        this.f176369c = bVar;
        this.f176370d = c12;
        this.f176371e = c40620a;
    }

    @Override // aU0.b
    public final void a(@Y61.k AbstractBeduinException abstractBeduinException, @Y61.k String str) {
        ZS.b bVar;
        String str2;
        CharSequence charSequence;
        C40620a c40620a = this.f176371e;
        String str3 = c40620a.f396482b;
        String str4 = c40620a.f396481a;
        ZS.b bVar2 = this.f176369c;
        String str5 = bVar2.f20168a;
        ArrayList arrayList = bVar2.f20172e;
        C31113b.f176076a.getClass();
        String str6 = (String) C42745f0.E(C43066x.f0("26.0", new String[]{"."}, 0, 6));
        String strName = abstractBeduinException.getF336733b().name();
        String f336734c = abstractBeduinException.getF336734c();
        List listA = com.avito.beduin.v2.engine.utils.d.a(abstractBeduinException);
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = (ArrayList) listA;
        if (arrayList2.isEmpty()) {
            bVar = bVar2;
            str2 = ".";
            charSequence = "26.0";
        } else {
            String str7 = (String) C42745f0.E(listA);
            sb2.append(str7);
            bVar = bVar2;
            charSequence = "26.0";
            if (arrayList2.size() != 1) {
                String str8 = " > ";
                String str9 = " > " + ((String) C42745f0.Q(listA));
                int length = ((1000 - str7.length()) - str9.length()) - 6;
                int size = arrayList2.size() - 1;
                str2 = ".";
                int i12 = 1;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    int i13 = size;
                    StringBuilder sb3 = new StringBuilder(str8);
                    String str10 = str8;
                    sb3.append((String) arrayList2.get(i12));
                    String string = sb3.toString();
                    if (length - string.length() <= 0) {
                        sb2.append(" > ...");
                        break;
                    }
                    sb2.append(string);
                    length -= string.length();
                    i12++;
                    size = i13;
                    str8 = str10;
                }
                sb2.append(str9);
            } else {
                str2 = ".";
            }
        }
        C27093a c27093a = new C27093a(str3, str4, str5, arrayList, str6, strName, f336734c, sb2.toString(), str);
        InterfaceC28373a interfaceC28373a = this.f176368b;
        interfaceC28373a.c(c27093a);
        BeduinExceptionType f336733b = abstractBeduinException.getF336733b();
        interfaceC28373a.c(new y.a("resources.monitoring.bdui.14742." + bVar.f20168a + ".Android." + ((String) C42745f0.E(C43066x.f0(charSequence, new String[]{str2}, 0, 6))) + '.' + f336733b, 0L, 2, null));
    }
}

package com.avito.android.error_reporting.app_state;

import androidx.compose.runtime.C22026a;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.C35755b0;
import j.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AppStateCollectorAllAbTests.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/error_reporting/app_state/d;", "Lcom/avito/android/error_reporting/app_state/a;", "a", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.error_reporting.app_state.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30365d implements InterfaceC30362a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147802a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f147803b;

    /* compiled from: AppStateCollectorAllAbTests.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/d$a;", "", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.error_reporting.app_state.d$a */
    public interface a {
        @Y61.k
        Map<String, String> b();
    }

    /* compiled from: AppStateCollectorAllAbTests.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.error_reporting.app_state.d$b */
    public static final class b extends N implements Y41.l<Map.Entry<? extends String, ? extends String>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f147804l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
            Map.Entry<? extends String, ? extends String> entry2 = entry;
            StringBuilder sb2 = new StringBuilder("\"");
            sb2.append(entry2.getKey());
            sb2.append("\":\"");
            return C22026a.c(sb2, entry2.getValue(), '\"');
        }
    }

    @Inject
    public C30365d(@Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a, @Y61.k a aVar) {
        this.f147802a = interfaceC4322a;
        this.f147803b = aVar;
    }

    @l0
    public final void a() {
        Set<Map.Entry<String, String>> setEntrySet = this.f147803b.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (!C43066x.K((CharSequence) ((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C43066x.K((CharSequence) ((Map.Entry) next).getValue())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!C43066x.h0((String) ((Map.Entry) next2).getValue(), "control", false)) {
                arrayList3.add(next2);
            }
        }
        InterfaceC30362a.InterfaceC4322a interfaceC4322a = this.f147802a;
        interfaceC4322a.e("ab_tests.all", C35755b0.g(arrayList3, interfaceC4322a.d(), b.f147804l, ""));
    }
}

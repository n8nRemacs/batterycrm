package com.avito.android.error_reporting.app_state;

import androidx.compose.runtime.C22026a;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppStateCollectorTouchedFeaturesToggles.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/J;", "Lcom/avito/android/error_reporting/app_state/a;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class J implements InterfaceC30362a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f147790a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap<String, String> f147792c = new LinkedHashMap<>();

    /* compiled from: AppStateCollectorTouchedFeaturesToggles.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Map.Entry<String, String>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f147793l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Map.Entry<String, String> entry) {
            Map.Entry<String, String> entry2 = entry;
            StringBuilder sb2 = new StringBuilder("\"");
            sb2.append(entry2.getKey());
            sb2.append("\":\"");
            return C22026a.c(sb2, entry2.getValue(), '\"');
        }
    }

    @Inject
    public J(@Y61.k com.avito.android.util.C c12, @Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a) {
        this.f147790a = c12;
        this.f147791b = interfaceC4322a;
    }

    public final void a(@Y61.k String str, boolean z12, @Y61.k Object obj) {
        if (z12) {
            this.f147790a.o().getClass();
            LinkedHashMap<String, String> linkedHashMap = this.f147792c;
            linkedHashMap.put(str, obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? "1" : "0" : obj.toString());
            Set<Map.Entry<String, String>> setEntrySet = linkedHashMap.entrySet();
            InterfaceC30362a.InterfaceC4322a interfaceC4322a = this.f147791b;
            interfaceC4322a.e("toggles.changed", C35755b0.g(setEntrySet, interfaceC4322a.d(), a.f147793l, ""));
        }
    }
}

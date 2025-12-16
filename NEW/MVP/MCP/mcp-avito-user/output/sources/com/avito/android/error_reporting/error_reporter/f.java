package com.avito.android.error_reporting.error_reporter;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorAppStateConsumer.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/f;", "Lcom/avito/android/error_reporting/app_state/a$a;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class f implements InterfaceC30362a.InterfaceC4322a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f147868a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f147869b = new LinkedHashMap();

    @Inject
    public f(@Y61.k n nVar) {
        this.f147868a = nVar;
    }

    @Override // com.avito.android.error_reporting.app_state.InterfaceC30362a.InterfaceC4322a
    public final void b(@Y61.k String str, @Y61.k String str2) {
        n nVar = this.f147868a;
        if (!nVar.getF318637a()) {
            nVar.a();
        }
        nVar.b(str, str2);
    }

    @Override // com.avito.android.error_reporting.app_state.InterfaceC30362a.InterfaceC4322a
    public final int d() {
        return this.f147868a.d();
    }

    @Override // com.avito.android.error_reporting.app_state.InterfaceC30362a.InterfaceC4322a
    public final void e(@Y61.k String str, @Y61.k List list) {
        n nVar = this.f147868a;
        if (!nVar.getF318637a()) {
            nVar.a();
        }
        if (list.isEmpty()) {
            nVar.b(str.concat(".0"), "{}");
        } else {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                nVar.b(str + '.' + i12, (String) obj);
                i12 = i13;
            }
        }
        int size = list.size();
        LinkedHashMap linkedHashMap = this.f147869b;
        Integer num = (Integer) linkedHashMap.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        if (size <= iIntValue) {
            while (true) {
                nVar.b(str + '.' + size, "");
                if (size == iIntValue) {
                    break;
                } else {
                    size++;
                }
            }
        }
        linkedHashMap.put(str, Integer.valueOf(list.size() - 1));
    }

    @Override // com.avito.android.error_reporting.app_state.InterfaceC30362a.InterfaceC4322a
    public final void log(@Y61.k String str) {
        this.f147868a.log(str);
    }
}

package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.q;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppStateCollectorLogcat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "log", "Lcom/avito/android/error_reporting/app_state/q$a;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/error_reporting/app_state/q$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class s extends N implements Y41.l<String, q.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f147838l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f147839m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, long j12) {
        super(1);
        this.f147838l = qVar;
        this.f147839m = j12;
    }

    @Override // Y41.l
    public final q.a invoke(String str) {
        Long lValueOf;
        Date date;
        String str2 = str;
        q qVar = this.f147838l;
        qVar.getClass();
        try {
            date = qVar.q().parse(str2.substring(0, 17));
        } catch (Throwable unused) {
        }
        if (date != null) {
            date.setYear(((Number) qVar.f147829e.getValue()).intValue());
            lValueOf = Long.valueOf(date.getTime());
        } else {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        if (jLongValue > this.f147839m) {
            return new q.a(jLongValue, str2.substring(6));
        }
        return null;
    }
}

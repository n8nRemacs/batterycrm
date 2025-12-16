package com.avito.android.error_reporting.app_state;

import androidx.compose.runtime.C22026a;
import com.avito.android.error_reporting.app_state.x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: AppStateCollectorOpenedScreens.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/error_reporting/app_state/x$b;", "it", "", "invoke", "(Lcom/avito/android/error_reporting/app_state/x$b;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class y extends N implements Y41.l<x.b, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final y f147855l = new y();

    public y() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(x.b bVar) {
        x.b bVar2 = bVar;
        StringBuilder sb2 = new StringBuilder("\"");
        sb2.append(bVar2.f147852a);
        sb2.append("\":\"");
        return C22026a.c(sb2, C42745f0.O(bVar2.f147853b, ",", "{", "}", null, 56), '\"');
    }
}

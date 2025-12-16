package com.avito.android.error_reporting.app_state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AppStateCollectorExposedAbTests.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "it", "", "invoke", "(Lkotlin/Q;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.error_reporting.app_state.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30373l extends N implements Y41.l<Q<? extends String, ? extends String>, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C30373l f147819l = new C30373l();

    public C30373l() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final CharSequence invoke(Q<? extends String, ? extends String> q12) {
        Q<? extends String, ? extends String> q13 = q12;
        StringBuilder sb2 = new StringBuilder("\"");
        sb2.append((String) q13.f406619b);
        sb2.append("\":\"");
        return C22026a.c(sb2, (String) q13.f406620c, '\"');
    }
}

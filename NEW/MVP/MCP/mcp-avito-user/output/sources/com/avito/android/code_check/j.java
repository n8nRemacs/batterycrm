package com.avito.android.code_check;

import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.util.R0;
import hD.C40806a;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;

/* compiled from: CodeCheckDI.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/j;", "Lcom/avito/android/di/h;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
/* loaded from: classes12.dex */
public interface j extends InterfaceC29971h {
    @Y61.k
    C40806a R();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    R0 c();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    Map<Class<? extends CodeCheckLink.Flow>, Provider<com.avito.android.code_check_public.e>> w4();
}

package com.avito.android.recall_me.di;

import android.app.Application;
import com.avito.android.code_confirmation.code_confirmation.C29391d;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import kotlin.Metadata;
import wi0.InterfaceC49631b;

/* compiled from: RecallMeDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/di/e;", "Lcom/avito/android/di/h;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
/* loaded from: classes16.dex */
public interface e extends InterfaceC29971h {
    @Y61.k
    com.avito.android.server_time.a T();

    @Y61.k
    C29391d a5();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    InterfaceC49631b j5();

    @Y61.k
    Application k();

    @Y61.k
    Gson s();
}

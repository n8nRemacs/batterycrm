package com.avito.android.silent_update.download;

import Y61.l;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UpdateDownloader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/download/e;", "", "_avito_silent-update_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e {
    long a(@Y61.k String str);

    @l
    Object b(long j12, @Y61.k SuspendLambda suspendLambda);

    @l
    String c(long j12);

    void d(long j12, @Y61.k String str);

    @l
    Object e(long j12, @Y61.k Continuation<? super Integer> continuation);

    void f(long j12);

    void g();

    @l
    Object h(long j12, @Y61.k Continuation<? super Boolean> continuation);

    void i(long j12, @l String str);

    @l
    Object j(long j12, @Y61.k Continuation<? super Uri> continuation);

    void k(long j12);

    @l
    String l(long j12);

    long m();
}

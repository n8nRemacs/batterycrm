package com.avito.android.messenger.connection;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: AvitoMessengerKeepConnectionProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T> f188850b = new e<>();

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).longValue();
        V2.f318762a.i("KeepConnectionProvider", "Background timeout has passed", null);
    }
}

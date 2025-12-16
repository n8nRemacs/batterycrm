package com.avito.android.messenger.service;

import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.I;
import java.io.File;
import kotlin.Metadata;
import n80.InterfaceC44212a;
import ru.avito.messenger.InterfaceC47728a0;

/* compiled from: MessengerImageUploadInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/c;", "Ln80/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47728a0 f197221a;

    public c(@Y61.k InterfaceC47728a0 interfaceC47728a0) {
        this.f197221a = interfaceC47728a0;
    }

    @Override // n80.InterfaceC44212a
    @Y61.k
    public final I a(@Y61.k File file, @Y61.k String str) {
        return this.f197221a.a(file);
    }
}

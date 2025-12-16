package com.avito.android.stub;

import com.google.gson.Gson;
import io.reactivex.rxjava3.core.I;
import java.io.File;
import kotlin.G;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47728a0;
import ru.avito.messenger.InterfaceC47835s;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerApi;

/* compiled from: StubMessengerModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stub/e;", "Lru/avito/messenger/s;", "Lru/avito/messenger/MessengerApi;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC47835s<MessengerApi> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f291478a = new a();

    /* compiled from: StubMessengerModule.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/stub/e$a", "Lru/avito/messenger/a0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC47728a0 {
        @Override // ru.avito.messenger.InterfaceC47728a0
        @Y61.k
        public final I<String> a(@Y61.k File file) {
            throw new G("An operation is not implemented: not implemented");
        }
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: a */
    public final Y81.c getF430739d() {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    public final MessengerApi b() {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: c */
    public final Gson getF430738c() {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: d */
    public final InterfaceC47842z getF430736a() {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: e */
    public final InterfaceC47728a0 getF430737b() {
        return this.f291478a;
    }
}

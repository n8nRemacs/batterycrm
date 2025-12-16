package xG0;

import com.avito.android.socketEvents.SocketEventParserByClass;
import dagger.internal.x;
import dagger.internal.y;
import wG0.C49504b;

/* compiled from: TransactionSocketEventMappingModule_ProvideTransactionSocketEventMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final e f442314a;

    public f(e eVar) {
        this.f442314a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f442314a.getClass();
        return new mx0.c(C49504b.class, new mx0.e("trxPageChanged", null, true, 2, null), new SocketEventParserByClass(C49504b.class));
    }
}

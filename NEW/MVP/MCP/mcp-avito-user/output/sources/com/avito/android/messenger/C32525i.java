package com.avito.android.messenger;

import android.content.SharedPreferences;
import com.avito.android.messenger.di.U0;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;

/* compiled from: DbPurgeIsNeededDataSource.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/i;", "Lcom/avito/android/messenger/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32525i implements InterfaceC32522f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f196373a;

    @Inject
    public C32525i(@U0.d @Y61.k AK0.l lVar) {
        this.f196373a = lVar;
    }

    @Override // com.avito.android.messenger.InterfaceC32522f
    @Y61.k
    public final Set<String> a() {
        try {
            SharedPreferences f316a = this.f196373a.getF316a();
            B0 b02 = B0.f406639b;
            Set<String> stringSet = f316a.getStringSet("idsToPurge", b02);
            return stringSet == null ? b02 : stringSet;
        } catch (Throwable unused) {
            return B0.f406639b;
        }
    }

    @Override // com.avito.android.messenger.InterfaceC32522f
    @Y61.k
    public final C41826q b() {
        return new C41826q(new C32523g(this, 0));
    }

    @Override // com.avito.android.messenger.InterfaceC32522f
    @Y61.k
    public final C41826q c() {
        return new C41826q(new C32523g(this, 1));
    }

    @Override // com.avito.android.messenger.InterfaceC32522f
    @Y61.k
    public final C41826q d(@Y61.k String str) {
        return new C41826q(new C32524h(this, str, 1));
    }

    @Override // com.avito.android.messenger.InterfaceC32522f
    @Y61.k
    public final C41826q e(@Y61.k String str) {
        return new C41826q(new C32524h(this, str, 0));
    }

    @Override // com.avito.android.messenger.InterfaceC32522f
    public final boolean f() {
        try {
            return this.f196373a.getF316a().getBoolean("dbPurgeIsNeeded", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}

package com.avito.android.auto_contacts.presentation.mvi;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoContactsPackagesActor_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/c;", "Ldagger/internal/h;", "Lcom/avito/android/auto_contacts/presentation/mvi/b;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f94938b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_contacts.domain.c f94939a;

    /* compiled from: AutoContactsPackagesActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/c$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k com.avito.android.auto_contacts.domain.c cVar) {
        this.f94939a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auto_contacts.domain.b bVar = (com.avito.android.auto_contacts.domain.b) this.f94939a.get();
        f94938b.getClass();
        return new b(bVar);
    }
}

package com.avito.android.auto_contacts.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import we.InterfaceC49611a;

/* compiled from: AutoContactsPackagesInteractor_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/domain/c;", "Ldagger/internal/h;", "Lcom/avito/android/auto_contacts/domain/b;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f94873b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC49611a> f94874a;

    /* compiled from: AutoContactsPackagesInteractor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/domain/c$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<InterfaceC49611a> provider) {
        this.f94874a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49611a interfaceC49611a = this.f94874a.get();
        f94873b.getClass();
        return new b(interfaceC49611a);
    }
}

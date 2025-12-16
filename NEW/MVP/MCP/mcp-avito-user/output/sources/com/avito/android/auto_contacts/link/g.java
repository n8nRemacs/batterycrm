package com.avito.android.auto_contacts.link;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoContactsPackagesLinkHandler_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/link/g;", "Ldagger/internal/h;", "Lcom/avito/android/auto_contacts/link/f;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f94903d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f94904a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C25721c f94905b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C30102l3 f94906c;

    /* compiled from: AutoContactsPackagesLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/link/g$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k C25721c c25721c, @k C30102l3 c30102l3, @k dv.b bVar) {
        this.f94904a = bVar;
        this.f94905b = c25721c;
        this.f94906c = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f94904a.get();
        C25719a c25719a = (C25719a) this.f94905b.get();
        Context context = (Context) this.f94906c.get();
        f94903d.getClass();
        return new f(context, c25719a, interfaceC4053a);
    }
}

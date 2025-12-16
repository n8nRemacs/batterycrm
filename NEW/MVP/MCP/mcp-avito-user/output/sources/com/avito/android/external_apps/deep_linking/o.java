package com.avito.android.external_apps.deep_linking;

import android.content.Context;
import com.avito.android.InterfaceC32900o;
import com.avito.android.account.G;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.C;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendEmailLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/o;", "Ldagger/internal/h;", "Lcom/avito/android/external_apps/deep_linking/m;", "a", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f155056g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f155057a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C35868p2 f155058b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f155059c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC32900o> f155060d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<G> f155061e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f155062f;

    /* compiled from: SendEmailLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/o$a;", "", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k dv.b bVar, @Y61.k C35868p2 c35868p2, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k C30102l3 c30102l3) {
        this.f155057a = bVar;
        this.f155058b = c35868p2;
        this.f155059c = provider;
        this.f155060d = provider2;
        this.f155061e = provider3;
        this.f155062f = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f155057a.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f155058b.get();
        C c12 = this.f155059c.get();
        InterfaceC32900o interfaceC32900o = this.f155060d.get();
        G g12 = this.f155061e.get();
        Context context = (Context) this.f155062f.get();
        f155056g.getClass();
        return new m(interfaceC4053a, interfaceC35845m2, c12, interfaceC32900o, g12, context);
    }
}

package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.help_center.C30753j;
import com.avito.android.help_center.InterfaceC30751h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wN.InterfaceC49541a;

/* compiled from: OAuthOneTimeEventProducer_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/G;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/presentation/mvi/F;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208273c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final wN.c f208274a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30753j f208275b;

    /* compiled from: OAuthOneTimeEventProducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/G$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public G(@Y61.k wN.c cVar, @Y61.k C30753j c30753j) {
        this.f208274a = cVar;
        this.f208275b = c30753j;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49541a interfaceC49541a = (InterfaceC49541a) this.f208274a.get();
        InterfaceC30751h interfaceC30751h = (InterfaceC30751h) this.f208275b.get();
        f208273c.getClass();
        return new F(interfaceC49541a, interfaceC30751h);
    }
}

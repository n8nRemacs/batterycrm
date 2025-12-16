package com.avito.android.remote.analytics.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.analytics.messenger.j;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42148d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerNetworkResponsesRelayImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/k;", "Lcom/avito/android/remote/analytics/messenger/j;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes17.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f253219a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d f253220b;

    /* compiled from: MessengerNetworkResponsesRelayImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lcom/avito/android/remote/analytics/messenger/j$a;", "kotlin.jvm.PlatformType", "Lj41/e;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.jakewharton.rxrelay3.d<j.a>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f253221l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<j.a> invoke() {
            return C31685o.m();
        }
    }

    @Inject
    public k() {
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, a.f253221l);
        this.f253219a = interfaceC42726CB;
        this.f253220b = (com.jakewharton.rxrelay3.d) interfaceC42726CB.getValue();
    }

    @Override // com.avito.android.remote.analytics.messenger.j
    @Y61.k
    public final z<j.a> a() {
        return this.f253220b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.messenger.j
    @InterfaceC42148d
    public final void b(@Y61.k String str, @Y61.k Throwable th2) {
        ((com.jakewharton.rxrelay3.d) this.f253219a.getValue()).accept(new j.a(str, th2));
    }
}

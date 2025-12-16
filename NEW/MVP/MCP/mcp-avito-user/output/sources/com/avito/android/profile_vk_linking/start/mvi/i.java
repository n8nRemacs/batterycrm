package com.avito.android.profile_vk_linking.start.mvi;

import ad0.InterfaceC19871b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: VkLinkingStartBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lad0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements com.avito.android.arch.mvi.b<InterfaceC19871b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.start.b f231463a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f231464b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231465c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f231466d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f231467e;

    @Inject
    public i(@Y61.k com.avito.android.profile_vk_linking.start.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f231463a = bVar;
        this.f231464b = aVar;
        this.f231465c = interfaceC28373a;
        this.f231466d = e12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC19871b> a() {
        return C43175k.N(C43175k.B(new g(this, null), new f(y.a(this.f231464b.d9()))), this.f231463a.a(), C43175k.G(new h(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

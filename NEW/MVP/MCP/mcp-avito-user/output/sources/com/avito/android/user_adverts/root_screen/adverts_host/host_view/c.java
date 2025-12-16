package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;

/* compiled from: HostViewRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c;", "", "a", "b", "c", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void d(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.host_view.a aVar);
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$b;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.host_view.c$c, reason: collision with other inner class name */
    public static final class C9591c implements b, InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.host_view.a> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f313011c = new a(null);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y1<com.avito.android.user_adverts.root_screen.adverts_host.host_view.a> f313012b;

        /* compiled from: HostViewRenderer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/c$c$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.host_view.c$c$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public C9591c() {
            throw null;
        }

        public C9591c(Y1 y12, C42822w c42822w) {
            this.f313012b = y12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.user_adverts.root_screen.adverts_host.host_view.a> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
            return this.f313012b.collect(interfaceC43172j, continuation);
        }

        @Override // com.avito.android.user_adverts.root_screen.adverts_host.host_view.c.b
        public final void d(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.host_view.a aVar) {
            this.f313012b.K5(aVar);
        }
    }
}

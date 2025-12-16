package com.avito.android.messenger.conversation.mvi.channel_feature;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.utils.n;
import com.avito.android.messenger.conversation.mvi.channel_feature.message_list.InterfaceC31954a;
import com.avito.android.messenger.conversation.mvi.channel_feature.message_list.M;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ChannelActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/a;", "Lcom/avito/android/arch/mvi/a;", "LMY/b;", "LMY/d;", "LMY/g;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<MY.b, MY.d, MY.g> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f189689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31954a f189690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f189691c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f189692d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f189693e;

    /* compiled from: ChannelActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a$b;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.a$a, reason: collision with other inner class name */
    public interface InterfaceC5598a {

        /* compiled from: ChannelActor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5599a implements InterfaceC5598a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5599a f189694a = new C5599a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C5599a);
            }

            public final int hashCode() {
                return -1077375174;
            }

            @Y61.k
            public final String toString() {
                return "PassThrough";
            }
        }

        /* compiled from: ChannelActor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a$b;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.a$a$b */
        public static final /* data */ class b implements InterfaceC5598a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f189695a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2097264843;
            }

            @Y61.k
            public final String toString() {
                return "Process";
            }
        }

        /* compiled from: ChannelActor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a$c;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.a$a$c */
        public static final /* data */ class c implements InterfaceC5598a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f189696a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -833763812;
            }

            @Y61.k
            public final String toString() {
                return "ProcessWithMessageListPrivateStateAccess";
            }
        }
    }

    @Inject
    public a(@InterfaceC32438g0 @Y61.k String str, @Y61.k M m12, @Y61.k InterfaceC31954a interfaceC31954a, @Y61.k R0 r02) {
        this.f189689a = m12;
        this.f189690b = interfaceC31954a;
        this.f189691c = r02;
        this.f189692d = "Mvi-Chat" + str.hashCode() + "_A";
        n.a aVar = com.avito.android.arch.mvi.utils.n.f92111a;
        NY.h.f11574g.getClass();
        NY.h hVar = NY.h.f11575h;
        aVar.getClass();
        this.f189693e = new com.avito.android.arch.mvi.utils.o(hVar);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.I(this.f189691c.c(), C43175k.C(new e(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(new C43197r1(new c(this, null), new C43137a0(new b(2, null), C43175k.N(c43197r1, this.f189689a.a(this.f189693e)))), d.f189701l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<MY.d> b(MY.b bVar, MY.g gVar) {
        return c(bVar);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k MY.b bVar) {
        if (!(bVar instanceof MY.k)) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.arch.mvi.utils.o oVar = this.f189693e;
        return this.f189690b.a((MY.k) bVar, oVar);
    }
}

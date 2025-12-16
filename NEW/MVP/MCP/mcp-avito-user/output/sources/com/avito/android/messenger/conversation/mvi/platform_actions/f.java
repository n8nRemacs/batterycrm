package com.avito.android.messenger.conversation.mvi.platform_actions;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.ItemsRequest;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PlatformActionsPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0006\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/A;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/e;", "a", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f extends S20.a<InterfaceC5732f>, A, com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.e {

    /* compiled from: PlatformActionsPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ContextActionHandler f193883a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f193884b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f193885c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f193886d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f193887e;

        public b(@Y61.k ContextActionHandler contextActionHandler, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f193883a = contextActionHandler;
            this.f193884b = str;
            this.f193885c = str2;
            this.f193886d = str3;
            this.f193887e = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f193883a, bVar.f193883a) && L.f(this.f193884b, bVar.f193884b) && L.f(this.f193885c, bVar.f193885c) && L.f(this.f193886d, bVar.f193886d) && L.f(this.f193887e, bVar.f193887e);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f193883a.hashCode() * 31, 31, this.f193884b);
            String str = this.f193885c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f193886d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f193887e;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionPayload(handler=");
            sb2.append(this.f193883a);
            sb2.append(", channelId=");
            sb2.append(this.f193884b);
            sb2.append(", messageId=");
            sb2.append(this.f193885c);
            sb2.append(", flow=");
            sb2.append(this.f193886d);
            sb2.append(", data=");
            return C22026a.c(sb2, this.f193887e, ')');
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f193888a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f193889b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f193890c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PlatformActions f193891d;

        public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.k PlatformActions platformActions) {
            this.f193888a = messengerUserHashInfo;
            this.f193889b = str;
            this.f193890c = str2;
            this.f193891d = platformActions;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f193888a, cVar.f193888a) && L.f(this.f193889b, cVar.f193889b) && L.f(this.f193890c, cVar.f193890c) && L.f(this.f193891d, cVar.f193891d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f193888a.hashCode() * 31, 31, this.f193889b);
            String str = this.f193890c;
            return this.f193891d.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ChannelData(currentUserInfo=" + this.f193888a + ", channelId=" + this.f193889b + ", flow=" + this.f193890c + ", actions=" + this.f193891d + ')';
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f193892a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f193893b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f193894c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f193895d;

        public d(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f193892a = str;
            this.f193893b = str2;
            this.f193894c = str3;
            this.f193895d = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f193892a, dVar.f193892a) && L.f(this.f193893b, dVar.f193893b) && L.f(this.f193894c, dVar.f193894c) && L.f(this.f193895d, dVar.f193895d);
        }

        public final int hashCode() {
            String str = this.f193892a;
            return this.f193895d.hashCode() + H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f193893b), 31, this.f193894c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Confirmation(title=");
            sb2.append(this.f193892a);
            sb2.append(", message=");
            sb2.append(this.f193893b);
            sb2.append(", okTitle=");
            sb2.append(this.f193894c);
            sb2.append(", cancelTitle=");
            return C22026a.c(sb2, this.f193895d, ')');
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: PlatformActionsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f193896a = new a();
        }

        /* compiled from: PlatformActionsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final d f193897a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final a f193898b;

            public b(@Y61.k a aVar, @Y61.k d dVar) {
                this.f193897a = dVar;
                this.f193898b = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f193897a, bVar.f193897a) && L.f(this.f193898b, bVar.f193898b);
            }

            public final int hashCode() {
                return this.f193898b.hashCode() + (this.f193897a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Shown(confirmation=" + this.f193897a + ", actionButtonAwaitingConfirmation=" + this.f193898b + ')';
            }
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f, reason: collision with other inner class name */
    public interface InterfaceC5732f {

        /* compiled from: PlatformActionsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$a */
        public static final class a implements InterfaceC5732f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f193899a = new a();
        }

        /* compiled from: PlatformActionsPresenter.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "a", "b", "c", "d", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b */
        public interface b extends InterfaceC5732f {

            /* compiled from: PlatformActionsPresenter.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b;", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$a */
            public interface a extends b {

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$a$a, reason: collision with other inner class name */
                public static final /* data */ class C5733a implements a {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193900a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.l
                    public final String f193901b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.k
                    public final ArrayList f193902c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.l
                    public final ContextActionHandler.MethodCall f193903d;

                    public C5733a(@Y61.k c cVar, @Y61.l String str, @Y61.k ArrayList arrayList, @Y61.l ContextActionHandler.MethodCall methodCall) {
                        this.f193900a = cVar;
                        this.f193901b = str;
                        this.f193902c = arrayList;
                        this.f193903d = methodCall;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.a
                    @Y61.l
                    /* renamed from: a, reason: from getter */
                    public final ContextActionHandler.MethodCall getF193907d() {
                        return this.f193903d;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.a
                    @Y61.k
                    public final List<a> b() {
                        return this.f193902c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193900a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C5733a)) {
                            return false;
                        }
                        C5733a c5733a = (C5733a) obj;
                        return L.f(this.f193900a, c5733a.f193900a) && L.f(this.f193901b, c5733a.f193901b) && this.f193902c.equals(c5733a.f193902c) && L.f(this.f193903d, c5733a.f193903d);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.a
                    @Y61.l
                    public final CharSequence getTitle() {
                        return this.f193901b;
                    }

                    public final int hashCode() {
                        int iHashCode = this.f193900a.hashCode() * 31;
                        String str = this.f193901b;
                        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f193902c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                        ContextActionHandler.MethodCall methodCall = this.f193903d;
                        return iG2 + (methodCall != null ? methodCall.hashCode() : 0);
                    }

                    @Y61.k
                    public final String toString() {
                        return "ActionInProgress(channelData=" + this.f193900a + ", title=" + ((Object) this.f193901b) + ", actionButtons=" + this.f193902c + ", closeHandler=" + this.f193903d + ')';
                    }
                }

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$a$b, reason: collision with other inner class name */
                public static final /* data */ class C5734b implements a {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193904a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.l
                    public final String f193905b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.k
                    public final ArrayList f193906c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.l
                    public final ContextActionHandler.MethodCall f193907d;

                    /* renamed from: e, reason: collision with root package name */
                    @Y61.k
                    public final e f193908e;

                    public C5734b(@Y61.k c cVar, @Y61.l String str, @Y61.k ArrayList arrayList, @Y61.l ContextActionHandler.MethodCall methodCall, @Y61.k e eVar) {
                        this.f193904a = cVar;
                        this.f193905b = str;
                        this.f193906c = arrayList;
                        this.f193907d = methodCall;
                        this.f193908e = eVar;
                    }

                    public static C5734b e(C5734b c5734b, e eVar) {
                        return new C5734b(c5734b.f193904a, c5734b.f193905b, c5734b.f193906c, c5734b.f193907d, eVar);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.a
                    @Y61.l
                    /* renamed from: a, reason: from getter */
                    public final ContextActionHandler.MethodCall getF193907d() {
                        return this.f193907d;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.a
                    @Y61.k
                    public final List<a> b() {
                        return this.f193906c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193904a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C5734b)) {
                            return false;
                        }
                        C5734b c5734b = (C5734b) obj;
                        return L.f(this.f193904a, c5734b.f193904a) && L.f(this.f193905b, c5734b.f193905b) && this.f193906c.equals(c5734b.f193906c) && L.f(this.f193907d, c5734b.f193907d) && L.f(this.f193908e, c5734b.f193908e);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.a
                    @Y61.l
                    public final CharSequence getTitle() {
                        return this.f193905b;
                    }

                    public final int hashCode() {
                        int iHashCode = this.f193904a.hashCode() * 31;
                        String str = this.f193905b;
                        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f193906c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                        ContextActionHandler.MethodCall methodCall = this.f193907d;
                        return this.f193908e.hashCode() + ((iG2 + (methodCall != null ? methodCall.hashCode() : 0)) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        return "Idle(channelData=" + this.f193904a + ", title=" + ((Object) this.f193905b) + ", actionButtons=" + this.f193906c + ", closeHandler=" + this.f193907d + ", confirmationAlertState=" + this.f193908e + ')';
                    }
                }

                @Y61.l
                /* renamed from: a */
                ContextActionHandler.MethodCall getF193907d();

                @Y61.k
                List<a> b();

                @Y61.l
                CharSequence getTitle();
            }

            /* compiled from: PlatformActionsPresenter.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b;", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$b, reason: collision with other inner class name */
            public interface InterfaceC5735b extends b {

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$b$a */
                public static final /* data */ class a implements InterfaceC5735b {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193909a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.l
                    public final String f193910b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.k
                    public final ArrayList f193911c;

                    public a(@Y61.k c cVar, @Y61.l String str, @Y61.k ArrayList arrayList) {
                        this.f193909a = cVar;
                        this.f193910b = str;
                        this.f193911c = arrayList;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.InterfaceC5735b
                    @Y61.k
                    public final List<a> b() {
                        return this.f193911c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193909a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return L.f(this.f193909a, aVar.f193909a) && L.f(this.f193910b, aVar.f193910b) && this.f193911c.equals(aVar.f193911c);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.InterfaceC5735b
                    @Y61.l
                    public final CharSequence getTitle() {
                        return this.f193910b;
                    }

                    public final int hashCode() {
                        int iHashCode = this.f193909a.hashCode() * 31;
                        String str = this.f193910b;
                        return this.f193911c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("ActionInProgress(channelData=");
                        sb2.append(this.f193909a);
                        sb2.append(", title=");
                        sb2.append((Object) this.f193910b);
                        sb2.append(", actionButtons=");
                        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f193911c, ')');
                    }
                }

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$b$b, reason: collision with other inner class name */
                public static final /* data */ class C5736b implements InterfaceC5735b {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193912a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.l
                    public final String f193913b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.k
                    public final ArrayList f193914c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.k
                    public final e f193915d;

                    public C5736b(@Y61.k c cVar, @Y61.l String str, @Y61.k ArrayList arrayList, @Y61.k e eVar) {
                        this.f193912a = cVar;
                        this.f193913b = str;
                        this.f193914c = arrayList;
                        this.f193915d = eVar;
                    }

                    public static C5736b e(C5736b c5736b, e eVar) {
                        return new C5736b(c5736b.f193912a, c5736b.f193913b, c5736b.f193914c, eVar);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.InterfaceC5735b
                    @Y61.k
                    public final List<a> b() {
                        return this.f193914c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193912a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C5736b)) {
                            return false;
                        }
                        C5736b c5736b = (C5736b) obj;
                        return L.f(this.f193912a, c5736b.f193912a) && L.f(this.f193913b, c5736b.f193913b) && this.f193914c.equals(c5736b.f193914c) && L.f(this.f193915d, c5736b.f193915d);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.InterfaceC5735b
                    @Y61.l
                    public final CharSequence getTitle() {
                        return this.f193913b;
                    }

                    public final int hashCode() {
                        int iHashCode = this.f193912a.hashCode() * 31;
                        String str = this.f193913b;
                        return this.f193915d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f193914c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                    }

                    @Y61.k
                    public final String toString() {
                        return "Idle(channelData=" + this.f193912a + ", title=" + ((Object) this.f193913b) + ", actionButtons=" + this.f193914c + ", confirmationAlertState=" + this.f193915d + ')';
                    }
                }

                @Y61.k
                List<a> b();

                @Y61.l
                CharSequence getTitle();
            }

            /* compiled from: PlatformActionsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b;", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$c */
            public interface c extends b {

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c$a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$c$a */
                public static final /* data */ class a implements c {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193916a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f193917b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.l
                    public final ContextActionHandler.MethodCall f193918c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.k
                    public final ItemsRequest f193919d;

                    /* renamed from: e, reason: collision with root package name */
                    @Y61.k
                    public final UV0.c f193920e;

                    public a(@Y61.k c cVar, @Y61.k String str, @Y61.l ContextActionHandler.MethodCall methodCall, @Y61.k ItemsRequest itemsRequest, @Y61.k UV0.c cVar2) {
                        this.f193916a = cVar;
                        this.f193917b = str;
                        this.f193918c = methodCall;
                        this.f193919d = itemsRequest;
                        this.f193920e = cVar2;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.l
                    /* renamed from: a, reason: from getter */
                    public final ContextActionHandler.MethodCall getF193928c() {
                        return this.f193918c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.k
                    public final UV0.a<com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.f> c() {
                        return this.f193920e;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193916a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return L.f(this.f193916a, aVar.f193916a) && L.f(this.f193917b, aVar.f193917b) && L.f(this.f193918c, aVar.f193918c) && L.f(this.f193919d, aVar.f193919d) && this.f193920e.equals(aVar.f193920e);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.k
                    public final CharSequence getTitle() {
                        return this.f193917b;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.f193917b.hashCode() + (this.f193916a.hashCode() * 31)) * 31;
                        ContextActionHandler.MethodCall methodCall = this.f193918c;
                        return this.f193920e.f16399b.hashCode() + ((this.f193919d.hashCode() + ((iHashCode + (methodCall == null ? 0 : methodCall.hashCode())) * 31)) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        return "Loaded(channelData=" + this.f193916a + ", title=" + ((Object) this.f193917b) + ", closeHandler=" + this.f193918c + ", itemsRequest=" + this.f193919d + ", itemsDataSource=" + this.f193920e + ')';
                    }
                }

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c$b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$c$b, reason: collision with other inner class name */
                public static final /* data */ class C5737b implements c {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193921a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f193922b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.l
                    public final ContextActionHandler.MethodCall f193923c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.k
                    public final ItemsRequest f193924d;

                    /* renamed from: e, reason: collision with root package name */
                    @Y61.k
                    public final UV0.c f193925e = new UV0.c(C42784z0.f406748b);

                    public C5737b(@Y61.k c cVar, @Y61.k String str, @Y61.l ContextActionHandler.MethodCall methodCall, @Y61.k ItemsRequest itemsRequest) {
                        this.f193921a = cVar;
                        this.f193922b = str;
                        this.f193923c = methodCall;
                        this.f193924d = itemsRequest;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.l
                    /* renamed from: a, reason: from getter */
                    public final ContextActionHandler.MethodCall getF193928c() {
                        return this.f193923c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.k
                    public final UV0.a<com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.f> c() {
                        return this.f193925e;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193921a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C5737b)) {
                            return false;
                        }
                        C5737b c5737b = (C5737b) obj;
                        return L.f(this.f193921a, c5737b.f193921a) && L.f(this.f193922b, c5737b.f193922b) && L.f(this.f193923c, c5737b.f193923c) && L.f(this.f193924d, c5737b.f193924d);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.k
                    public final CharSequence getTitle() {
                        return this.f193922b;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.f193922b.hashCode() + (this.f193921a.hashCode() * 31)) * 31;
                        ContextActionHandler.MethodCall methodCall = this.f193923c;
                        return this.f193924d.hashCode() + ((iHashCode + (methodCall == null ? 0 : methodCall.hashCode())) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        return "LoadingError(channelData=" + this.f193921a + ", title=" + ((Object) this.f193922b) + ", closeHandler=" + this.f193923c + ", itemsRequest=" + this.f193924d + ')';
                    }
                }

                /* compiled from: PlatformActionsPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c$c;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$c$c, reason: collision with other inner class name */
                public static final /* data */ class C5738c implements c {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final c f193926a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f193927b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.l
                    public final ContextActionHandler.MethodCall f193928c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.k
                    public final ItemsRequest f193929d;

                    /* renamed from: e, reason: collision with root package name */
                    @Y61.k
                    public final UV0.c f193930e = new UV0.c(C42784z0.f406748b);

                    public C5738c(@Y61.k c cVar, @Y61.k String str, @Y61.l ContextActionHandler.MethodCall methodCall, @Y61.k ItemsRequest itemsRequest) {
                        this.f193926a = cVar;
                        this.f193927b = str;
                        this.f193928c = methodCall;
                        this.f193929d = itemsRequest;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.l
                    /* renamed from: a, reason: from getter */
                    public final ContextActionHandler.MethodCall getF193928c() {
                        return this.f193928c;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.k
                    public final UV0.a<com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.f> c() {
                        return this.f193930e;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                    @Y61.k
                    /* renamed from: d, reason: from getter */
                    public final c getF193931a() {
                        return this.f193926a;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C5738c)) {
                            return false;
                        }
                        C5738c c5738c = (C5738c) obj;
                        return L.f(this.f193926a, c5738c.f193926a) && L.f(this.f193927b, c5738c.f193927b) && L.f(this.f193928c, c5738c.f193928c) && L.f(this.f193929d, c5738c.f193929d);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b.c
                    @Y61.k
                    public final CharSequence getTitle() {
                        return this.f193927b;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.f193927b.hashCode() + (this.f193926a.hashCode() * 31)) * 31;
                        ContextActionHandler.MethodCall methodCall = this.f193928c;
                        return this.f193929d.hashCode() + ((iHashCode + (methodCall == null ? 0 : methodCall.hashCode())) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        return "LoadingInProgress(channelData=" + this.f193926a + ", title=" + ((Object) this.f193927b) + ", closeHandler=" + this.f193928c + ", itemsRequest=" + this.f193929d + ')';
                    }
                }

                @Y61.l
                /* renamed from: a */
                ContextActionHandler.MethodCall getF193928c();

                @Y61.k
                UV0.a<com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.f> c();

                @Y61.k
                CharSequence getTitle();
            }

            /* compiled from: PlatformActionsPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b$d;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.f$f$b$d */
            public static final class d implements b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final c f193931a;

                public d(@Y61.k c cVar) {
                    this.f193931a = cVar;
                }

                @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f.b
                @Y61.k
                /* renamed from: d, reason: from getter */
                public final c getF193931a() {
                    return this.f193931a;
                }
            }

            @Y61.k
            /* renamed from: d */
            c getF193931a();
        }
    }

    @Y61.k
    D G0();

    void J6(@Y61.k a aVar);

    void M3();

    @Y61.k
    D N0();

    void O3(@Y61.k a aVar);

    @Y61.k
    D Ob();

    @Y61.k
    D T();

    void T5();

    void X8(@Y61.k ContextActionHandler.MethodCall methodCall);

    void Ya();

    void c7();

    void nd();

    void r5();

    /* compiled from: PlatformActionsPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f193879a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f193880b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final b f193881c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final d f193882d;

        public a(@Y61.k CharSequence charSequence, boolean z12, @Y61.k b bVar, @Y61.l d dVar) {
            this.f193879a = charSequence;
            this.f193880b = z12;
            this.f193881c = bVar;
            this.f193882d = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f193879a, aVar.f193879a) && this.f193880b == aVar.f193880b && L.f(this.f193881c, aVar.f193881c) && L.f(this.f193882d, aVar.f193882d);
        }

        public final int hashCode() {
            int iHashCode = (this.f193881c.hashCode() + androidx.appcompat.app.r.i(this.f193879a.hashCode() * 31, 31, this.f193880b)) * 31;
            d dVar = this.f193882d;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return AK.c.r(new StringBuilder("Action(title="), this.f193879a, ')');
        }

        public /* synthetic */ a(CharSequence charSequence, boolean z12, b bVar, d dVar, int i12, C42822w c42822w) {
            this(charSequence, z12, bVar, (i12 & 8) != 0 ? null : dVar);
        }
    }
}

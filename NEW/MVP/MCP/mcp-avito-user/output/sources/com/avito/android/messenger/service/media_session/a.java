package com.avito.android.messenger.service.media_session;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23091e;
import androidx.media3.common.H;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.media3.exoplayer.source.C23161l;
import androidx.media3.extractor.C23192k;
import androidx.media3.session.AbstractServiceC23212c1;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.K1;
import androidx.media3.session.L1;
import androidx.media3.session.O0;
import androidx.media3.session.O1;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.voice.O;
import com.avito.android.messenger.di.C32495r0;
import com.avito.android.messenger.di.x2;
import com.avito.android.messenger.di.y2;
import com.avito.android.messenger.w0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import dZ.C39685c;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import io.reactivex.rxjava3.internal.operators.observable.U;
import io.reactivex.rxjava3.internal.operators.observable.Z;
import j.S;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VoiceMessageMediaSessionService.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a;", "Landroidx/media3/session/c1;", "<init>", "()V", "a", "b", "c", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractServiceC23212c1 {

    /* renamed from: k, reason: collision with root package name */
    @Inject
    public w0 f197265k;

    /* renamed from: l, reason: collision with root package name */
    @Inject
    public InterfaceC32024m f197266l;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f197267m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public O0 f197268n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f197269o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<C5807a.InterfaceC5808a> f197270p = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: q, reason: collision with root package name */
    @k
    public final C23091e f197271q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final C23091e f197272r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final e f197273s;

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a;", "", "<init>", "()V", "", "COMMAND_SWITCH_TO_EARPIECE", "Ljava/lang/String;", "COMMAND_SWITCH_TO_SPEAKER", "TAG", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.service.media_session.a$a, reason: collision with other inner class name */
    public static final class C5807a {

        /* compiled from: VoiceMessageMediaSessionService.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a;", "", "a", "b", "c", "Lcom/avito/android/messenger/service/media_session/a$a$a$a;", "Lcom/avito/android/messenger/service/media_session/a$a$a$b;", "Lcom/avito/android/messenger/service/media_session/a$a$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.service.media_session.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC5808a {

            /* compiled from: VoiceMessageMediaSessionService.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a$a;", "Lcom/avito/android/messenger/service/media_session/a$a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.service.media_session.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C5809a implements InterfaceC5808a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f197274a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f197275b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final MessengerUserHashInfo f197276c;

                public C5809a(@k String str, @k String str2, @k MessengerUserHashInfo messengerUserHashInfo) {
                    this.f197274a = str;
                    this.f197275b = str2;
                    this.f197276c = messengerUserHashInfo;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5809a)) {
                        return false;
                    }
                    C5809a c5809a = (C5809a) obj;
                    return L.f(this.f197274a, c5809a.f197274a) && L.f(this.f197275b, c5809a.f197275b) && L.f(this.f197276c, c5809a.f197276c);
                }

                public final int hashCode() {
                    return this.f197276c.hashCode() + H.d(this.f197274a.hashCode() * 31, 31, this.f197275b);
                }

                @k
                public final String toString() {
                    return "Ended(localId=" + this.f197274a + ", channelId=" + this.f197275b + ", userInfo=" + this.f197276c + ')';
                }
            }

            /* compiled from: VoiceMessageMediaSessionService.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a$b;", "Lcom/avito/android/messenger/service/media_session/a$a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.service.media_session.a$a$a$b */
            public static final /* data */ class b implements InterfaceC5808a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f197277a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f197278b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final MessengerUserHashInfo f197279c;

                public b(@k String str, @k String str2, @k MessengerUserHashInfo messengerUserHashInfo) {
                    this.f197277a = str;
                    this.f197278b = str2;
                    this.f197279c = messengerUserHashInfo;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return L.f(this.f197277a, bVar.f197277a) && L.f(this.f197278b, bVar.f197278b) && L.f(this.f197279c, bVar.f197279c);
                }

                public final int hashCode() {
                    return this.f197279c.hashCode() + H.d(this.f197277a.hashCode() * 31, 31, this.f197278b);
                }

                @k
                public final String toString() {
                    return "Idle(localId=" + this.f197277a + ", channelId=" + this.f197278b + ", userInfo=" + this.f197279c + ')';
                }
            }

            /* compiled from: VoiceMessageMediaSessionService.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a$c;", "Lcom/avito/android/messenger/service/media_session/a$a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.service.media_session.a$a$a$c */
            public static final /* data */ class c implements InterfaceC5808a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f197280a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f197281b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final MessengerUserHashInfo f197282c;

                public c(@k String str, @k String str2, @k MessengerUserHashInfo messengerUserHashInfo) {
                    this.f197280a = str;
                    this.f197281b = str2;
                    this.f197282c = messengerUserHashInfo;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return L.f(this.f197280a, cVar.f197280a) && L.f(this.f197281b, cVar.f197281b) && L.f(this.f197282c, cVar.f197282c);
                }

                public final int hashCode() {
                    return this.f197282c.hashCode() + H.d(this.f197280a.hashCode() * 31, 31, this.f197281b);
                }

                @k
                public final String toString() {
                    return "Playing(localId=" + this.f197280a + ", channelId=" + this.f197281b + ", userInfo=" + this.f197282c + ')';
                }
            }
        }

        public /* synthetic */ C5807a(C42822w c42822w) {
            this();
        }

        public C5807a() {
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$b;", "Landroidx/media3/session/w0$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements AbstractServiceC23270w0.c.b {
        public b() {
        }

        @Override // androidx.media3.session.O0.d
        @k
        public final D0 b(@k List list) {
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z zVarA = (z) it.next();
                if (zVarA.f47983g.f48082b != null) {
                    z.c cVar = new z.c(zVarA, null);
                    cVar.f47989b = zVarA.f47983g.f48082b;
                    zVarA = cVar.a();
                }
                arrayList.add(zVarA);
            }
            return C37568u0.d(new ArrayList(arrayList));
        }

        @Override // androidx.media3.session.O0.d
        @k
        public final D0<O1> c(@k O0 o02, @k O0.g gVar, @k K1 k12, @k Bundle bundle) {
            String str = k12.f52116c;
            int iHashCode = str.hashCode();
            a aVar = a.this;
            if (iHashCode != 163927026) {
                if (iHashCode == 2115548069 && str.equals("COMMAND_SWITCH_TO_EARPIECE")) {
                    androidx.media3.common.H hB2 = o02.b();
                    InterfaceC23144m interfaceC23144m = hB2 instanceof InterfaceC23144m ? (InterfaceC23144m) hB2 : null;
                    if (interfaceC23144m != null) {
                        interfaceC23144m.X(aVar.f197271q, false);
                        G0 g02 = G0.f406611a;
                        X2.f318778a.c("VoiceMessageMediaSessionService", "onCustomCommand: applied audioAttributesForEarpiece", null);
                    }
                    return C37568u0.d(new O1(0));
                }
            } else if (str.equals("COMMAND_SWITCH_TO_SPEAKER")) {
                androidx.media3.common.H hB3 = o02.b();
                InterfaceC23144m interfaceC23144m2 = hB3 instanceof InterfaceC23144m ? (InterfaceC23144m) hB3 : null;
                if (interfaceC23144m2 != null) {
                    interfaceC23144m2.X(aVar.f197272r, true);
                    G0 g03 = G0.f406611a;
                    X2.f318778a.c("VoiceMessageMediaSessionService", "onCustomCommand: applied audioAttributesForSpeaker", null);
                }
                return C37568u0.d(new O1(0));
            }
            return super.c(o02, gVar, k12, bundle);
        }

        @Override // androidx.media3.session.O0.d
        @k
        public final O0.e d(@k O0 o02, @k O0.g gVar) {
            O0.e eVarD = super.d(o02, gVar);
            L1 l12 = eVarD.f52216b;
            l12.getClass();
            L1.b bVar = new L1.b(l12, null);
            K1 k12 = new K1(new Bundle(), "COMMAND_SWITCH_TO_SPEAKER");
            HashSet hashSet = bVar.f52127a;
            hashSet.add(k12);
            hashSet.add(new K1(new Bundle(), "COMMAND_SWITCH_TO_EARPIECE"));
            return new O0.e(true, bVar.b(), eVarD.f52217c, null);
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @S
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$c;", "Landroidx/media3/session/c1$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c implements AbstractServiceC23212c1.c {
        public c() {
            throw null;
        }

        @Override // androidx.media3.session.AbstractServiceC23212c1.c
        public final void a() {
            V2.f318762a.d("VoiceMessageMediaSessionService", "onForegroundServiceStartNotAllowedException");
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f197284a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f197285b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final MessengerUserHashInfo f197286c;

        public d(@l String str, @l String str2, @l MessengerUserHashInfo messengerUserHashInfo) {
            this.f197284a = str;
            this.f197285b = str2;
            this.f197286c = messengerUserHashInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f197284a, dVar.f197284a) && L.f(this.f197285b, dVar.f197285b) && L.f(this.f197286c, dVar.f197286c);
        }

        public final int hashCode() {
            String str = this.f197284a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f197285b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            MessengerUserHashInfo messengerUserHashInfo = this.f197286c;
            return iHashCode2 + (messengerUserHashInfo != null ? messengerUserHashInfo.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "PlaybackInfo(localId=" + this.f197284a + ", channelId=" + this.f197285b + ", userInfo=" + this.f197286c + ')';
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/service/media_session/a$e", "Landroidx/media3/common/H$g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements H.g {
        public e() {
        }

        public final d c() {
            androidx.media3.common.H hB2;
            z zVarB;
            z.i iVar;
            O0 o02 = a.this.f197268n;
            Bundle bundle = (o02 == null || (hB2 = o02.b()) == null || (zVarB = hB2.B()) == null || (iVar = zVarB.f47983g) == null) ? null : iVar.f48084d;
            return new d(bundle != null ? bundle.getString("localId") : null, bundle != null ? bundle.getString("channelId") : null, bundle != null ? (MessengerUserHashInfo) O.a().a(new C39685c(bundle)) : null);
        }

        @Override // androidx.media3.common.H.g
        public final void onIsPlayingChanged(boolean z12) {
            String str;
            String str2;
            MessengerUserHashInfo messengerUserHashInfo;
            d dVarC = c();
            if (!z12 || (str = dVarC.f197284a) == null || (str2 = dVarC.f197285b) == null || (messengerUserHashInfo = dVarC.f197286c) == null) {
                return;
            }
            a.this.f197270p.accept(new C5807a.InterfaceC5808a.c(str, str2, messengerUserHashInfo));
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackStateChanged(int i12) {
            String str;
            MessengerUserHashInfo messengerUserHashInfo;
            d dVarC = c();
            String str2 = dVarC.f197284a;
            if (str2 == null || (str = dVarC.f197285b) == null || (messengerUserHashInfo = dVarC.f197286c) == null) {
                return;
            }
            com.jakewharton.rxrelay3.c<C5807a.InterfaceC5808a> cVar = a.this.f197270p;
            if (i12 == 1) {
                cVar.accept(new C5807a.InterfaceC5808a.b(str2, str, messengerUserHashInfo));
            } else {
                if (i12 != 4) {
                    return;
                }
                cVar.accept(new C5807a.InterfaceC5808a.C5809a(str2, str, messengerUserHashInfo));
            }
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC23144m f197288b;

        public f(InterfaceC23144m interfaceC23144m) {
            this.f197288b = interfaceC23144m;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new C41826q(new C31684n(this.f197288b, 6)).r();
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "it", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f197289b = new g<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/messenger/service/media_session/a$a$a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T, R> implements o {
        public h() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            C5807a.InterfaceC5808a interfaceC5808a = (C5807a.InterfaceC5808a) obj;
            if (!(interfaceC5808a instanceof C5807a.InterfaceC5808a.c)) {
                return U.f403867b;
            }
            a aVar = a.this;
            InterfaceC32024m interfaceC32024m = aVar.f197266l;
            if (interfaceC32024m == null) {
                interfaceC32024m = null;
            }
            C5807a.InterfaceC5808a.c cVar = (C5807a.InterfaceC5808a.c) interfaceC5808a;
            C41934a1 c41934a1I = interfaceC32024m.i(cVar.f197281b, cVar.f197280a, cVar.f197282c);
            InterfaceC35745a5 interfaceC35745a5 = aVar.f197267m;
            return c41934a1I.x0((interfaceC35745a5 != null ? interfaceC35745a5 : null).a()).N(com.avito.android.messenger.service.media_session.b.f197293b).z0(1L).d0(com.avito.android.messenger.service.media_session.c.f197294b);
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014 \u0002*\t\u0018\u00010\u0000¢\u0006\u0002\b\u00010\u0000¢\u0006\u0002\b\u00012\u0018\u0010\u0004\u001a\u0014 \u0002*\t\u0018\u00010\u0000¢\u0006\u0002\b\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a;", "Lj41/e;", "kotlin.jvm.PlatformType", "prev", "new", "", "test", "(Lcom/avito/android/messenger/service/media_session/a$a$a;Lcom/avito/android/messenger/service/media_session/a$a$a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final i<T1, T2> f197291a = new i<>();

        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            C5807a.InterfaceC5808a interfaceC5808a = (C5807a.InterfaceC5808a) obj;
            C5807a.InterfaceC5808a interfaceC5808a2 = (C5807a.InterfaceC5808a) obj2;
            return ((interfaceC5808a instanceof C5807a.InterfaceC5808a.c) && (interfaceC5808a2 instanceof C5807a.InterfaceC5808a.C5809a) && L.f(((C5807a.InterfaceC5808a.c) interfaceC5808a).f197280a, ((C5807a.InterfaceC5808a.C5809a) interfaceC5808a2).f197274a)) ? false : true;
        }
    }

    /* compiled from: VoiceMessageMediaSessionService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/service/media_session/a$a$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "apply", "(Lcom/avito/android/messenger/service/media_session/a$a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T, R> f197292b = new j<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return G0.f406611a;
        }
    }

    static {
        new C5807a(null);
    }

    public a() {
        C23091e.C1816e c1816e = new C23091e.C1816e();
        c1816e.f47660c = 2;
        c1816e.f47658a = 1;
        this.f197271q = c1816e.a();
        C23091e.C1816e c1816e2 = new C23091e.C1816e();
        c1816e2.f47660c = 1;
        c1816e2.f47658a = 1;
        this.f197272r = c1816e2.a();
        this.f197273s = new e();
    }

    @Override // androidx.media3.session.AbstractServiceC23212c1
    @l
    public final O0 d(@k O0.g gVar) {
        return this.f197268n;
    }

    @Override // androidx.media3.session.AbstractServiceC23212c1, android.app.Service
    @S
    public final void onCreate() {
        super.onCreate();
        x2.a aVarA = C32495r0.a();
        aVarA.a((y2) C29972i.a(C29972i.b(this), y2.class));
        aVarA.build().a(this);
        C23192k c23192k = new C23192k();
        synchronized (c23192k) {
            c23192k.f50613b = true;
        }
        InterfaceC23144m.c cVar = new InterfaceC23144m.c(this, new C23161l(this, c23192k));
        C23091e c23091e = this.f197272r;
        C23110a.g(!cVar.f49243v);
        c23091e.getClass();
        cVar.f49231j = c23091e;
        cVar.f49232k = true;
        C23110a.g(!cVar.f49243v);
        cVar.f49233l = true;
        InterfaceC23144m interfaceC23144mA = cVar.a();
        interfaceC23144mA.F(this.f197273s);
        O0.b bVar = new O0.b(this, interfaceC23144mA);
        bVar.b(new b());
        this.f197268n = bVar.a();
        c cVar2 = new c();
        synchronized (this.f52403b) {
            this.f52410i = cVar2;
        }
        w0 w0Var = this.f197265k;
        if (w0Var == null) {
            w0Var = null;
        }
        io.reactivex.rxjava3.core.z zVarE0 = io.reactivex.rxjava3.core.z.e0(w0Var.g().q0(1L).D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(g.f197289b), this.f197270p.y0(new h()), this.f197270p.B(i.f197291a).q0(1L).d0(j.f197292b));
        InterfaceC35745a5 interfaceC35745a5 = this.f197267m;
        this.f197269o.b(new Z(zVarE0.x0((interfaceC35745a5 != null ? interfaceC35745a5 : null).a()).j0(io.reactivex.rxjava3.android.schedulers.b.b()), new f(interfaceC23144mA)).u());
    }

    @Override // androidx.media3.session.AbstractServiceC23212c1, android.app.Service
    @S
    public final void onDestroy() {
        this.f197269o.e();
        synchronized (this.f52403b) {
            this.f52410i = null;
        }
        O0 o02 = this.f197268n;
        if (o02 != null) {
            o02.b().E(this.f197273s);
            o02.b().release();
            o02.c();
            this.f197268n = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(@l Intent intent) {
        super.onTaskRemoved(intent);
        O0 o02 = this.f197268n;
        if (o02 != null) {
            o02.b().E(this.f197273s);
            o02.b().release();
            o02.c();
            this.f197268n = null;
        }
        stopSelf();
    }
}

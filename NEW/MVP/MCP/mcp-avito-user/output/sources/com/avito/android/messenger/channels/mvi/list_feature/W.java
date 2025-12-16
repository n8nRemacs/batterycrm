package com.avito.android.messenger.channels.mvi.list_feature;

import HY.m;
import androidx.compose.runtime.C22026a;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.AbstractC32562p;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.util.K5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsListActorSubscriptions.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/W;", "LHY/n;", "LHY/k;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class W implements HY.n, HY.k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f187864a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f187865b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.M f187866c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.user_last_activity.a f187867d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f187868e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f187869f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187870g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f187871h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C33126v0 f187872i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final C33126v0 f187873j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.interactor.A f187874k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.filter.j f187875l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h31.e<WY.a> f187876m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f187877n = C42727D.c(new c());

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final String f187878o = "ChannelsListActorSubscriptions";

    /* compiled from: ChannelsListActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/W$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f187879a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f187880b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<String> f187881c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<String> f187882d;

        public a() {
            this(null, false, null, null, 15, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f187879a, aVar.f187879a) && this.f187880b == aVar.f187880b && kotlin.jvm.internal.L.f(this.f187881c, aVar.f187881c) && kotlin.jvm.internal.L.f(this.f187882d, aVar.f187882d);
        }

        public final int hashCode() {
            String str = this.f187879a;
            return this.f187882d.hashCode() + androidx.compose.foundation.H.e(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f187880b), 31, this.f187881c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelTagInfo(userId=");
            sb2.append(this.f187879a);
            sb2.append(", userIsEmployee=");
            sb2.append(this.f187880b);
            sb2.append(", checkedChannelsIds=");
            sb2.append(this.f187881c);
            sb2.append(", newChannelsIds=");
            return androidx.compose.foundation.H.p(sb2, this.f187882d, ')');
        }

        public a(String str, boolean z12, List list, List list2, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            z12 = (i12 & 2) != 0 ? false : z12;
            list = (i12 & 4) != 0 ? C42784z0.f406748b : list;
            list2 = (i12 & 8) != 0 ? C42784z0.f406748b : list2;
            this.f187879a = str;
            this.f187880b = z12;
            this.f187881c = list;
            this.f187882d = list2;
        }
    }

    /* compiled from: ChannelsListActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/W$b;", "", "a", "b", "Lcom/avito/android/messenger/channels/mvi/list_feature/W$b$a;", "Lcom/avito/android/messenger/channels/mvi/list_feature/W$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ChannelsListActorSubscriptions.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/W$b$a;", "Lcom/avito/android/messenger/channels/mvi/list_feature/W$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f187883a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f187884b;

            public a(@Y61.k String str, @Y61.k String str2) {
                this.f187883a = str;
                this.f187884b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f187883a, aVar.f187883a) && kotlin.jvm.internal.L.f(this.f187884b, aVar.f187884b);
            }

            @Override // com.avito.android.messenger.channels.mvi.list_feature.W.b
            @Y61.k
            /* renamed from: getChannelId, reason: from getter */
            public final String getF187885a() {
                return this.f187883a;
            }

            @Override // com.avito.android.messenger.channels.mvi.list_feature.W.b
            @Y61.k
            /* renamed from: getFromId, reason: from getter */
            public final String getF187886b() {
                return this.f187884b;
            }

            public final int hashCode() {
                return this.f187884b.hashCode() + (this.f187883a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Start(channelId=");
                sb2.append(this.f187883a);
                sb2.append(", fromId=");
                return C22026a.c(sb2, this.f187884b, ')');
            }
        }

        /* compiled from: ChannelsListActorSubscriptions.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/W$b$b;", "Lcom/avito/android/messenger/channels/mvi/list_feature/W$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.W$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5523b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f187885a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f187886b;

            public C5523b(@Y61.k String str, @Y61.k String str2) {
                this.f187885a = str;
                this.f187886b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5523b)) {
                    return false;
                }
                C5523b c5523b = (C5523b) obj;
                return kotlin.jvm.internal.L.f(this.f187885a, c5523b.f187885a) && kotlin.jvm.internal.L.f(this.f187886b, c5523b.f187886b);
            }

            @Override // com.avito.android.messenger.channels.mvi.list_feature.W.b
            @Y61.k
            /* renamed from: getChannelId, reason: from getter */
            public final String getF187885a() {
                return this.f187885a;
            }

            @Override // com.avito.android.messenger.channels.mvi.list_feature.W.b
            @Y61.k
            /* renamed from: getFromId, reason: from getter */
            public final String getF187886b() {
                return this.f187886b;
            }

            public final int hashCode() {
                return this.f187886b.hashCode() + (this.f187885a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Stop(channelId=");
                sb2.append(this.f187885a);
                sb2.append(", fromId=");
                return C22026a.c(sb2, this.f187886b, ')');
            }
        }

        @Y61.k
        /* renamed from: getChannelId */
        String getF187885a();

        @Y61.k
        /* renamed from: getFromId */
        String getF187886b();
    }

    /* compiled from: ChannelsListActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/x;", "invoke", "()Lcom/avito/android/messenger/analytics/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<C31667x> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C31667x invoke() {
            W w12 = W.this;
            return new C31667x(w12.f187870g, w12.f187871h);
        }
    }

    @Inject
    public W(@Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.channels.mvi.data.M m12, @Y61.k com.avito.android.messenger.service.user_last_activity.a aVar, @Y61.k com.avito.android.util.R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1, @Y61.k C33126v0 c33126v0, @Y61.l @I41.h C33126v0 c33126v02, @Y61.k com.avito.android.messenger.channels.mvi.interactor.A a12, @Y61.k com.avito.android.messenger.channels.filter.j jVar, @Y61.k h31.e<WY.a> eVar) {
        this.f187864a = w0Var;
        this.f187865b = interfaceC47842z;
        this.f187866c = m12;
        this.f187867d = aVar;
        this.f187868e = r02;
        this.f187869f = aVar2;
        this.f187870g = interfaceC28373a;
        this.f187871h = c30277e1;
        this.f187872i = c33126v0;
        this.f187873j = c33126v02;
        this.f187874k = a12;
        this.f187875l = jVar;
        this.f187876m = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(W w12, List list) {
        w12.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Channel) ((kotlin.Q) obj).f406619b).getTags().contains("s")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Channel) ((kotlin.Q) it.next()).f406619b).getChannelId());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Set b(W w12, List list, String str) {
        w12.getClass();
        if (list.isEmpty() || str == null || C43066x.K(str)) {
            return kotlin.collections.B0.f406639b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<User> users = ((Channel) ((kotlin.Q) it.next()).f406619b).getUsers();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : users) {
                if (!kotlin.jvm.internal.L.f(((User) obj).getId(), str)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((User) it2.next()).getId());
            }
            C42745f0.h(arrayList3, arrayList);
        }
        return C42745f0.K0(arrayList);
    }

    public static final boolean c(W w12, HY.m mVar) {
        w12.getClass();
        m.c cVar = mVar.f7251b;
        m.c[] cVarArr = {mVar.f7252c, mVar.f7253d};
        if (!(cVar instanceof m.c.a) || !e((m.c.a) cVar)) {
            for (int i12 = 0; i12 < 2; i12++) {
                m.c cVar2 = cVarArr[i12];
                if (!(cVar2 instanceof m.c.a) || !e((m.c.a) cVar2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static C43152f0 d(InterfaceC43160i interfaceC43160i, String str) {
        return new C43152f0(interfaceC43160i, new X(str, null));
    }

    public static boolean e(m.c.a aVar) {
        int i12 = AbstractC32562p.f196931a;
        Throwable th2 = aVar.f7264a;
        return (K5.a(th2) ? AbstractC32562p.d.f196934b : K5.e(th2) ? AbstractC32562p.b.f196932b : AbstractC32562p.c.f196933b) == AbstractC32562p.d.f196934b;
    }
}

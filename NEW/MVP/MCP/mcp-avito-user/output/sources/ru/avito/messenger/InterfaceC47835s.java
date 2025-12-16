package ru.avito.messenger;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.remote.analytics.messenger.j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import l91.C43607c;
import l91.C43608d;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p91.InterfaceC46925b;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.internal.connection.InterfaceC47748a;
import ru.avito.messenger.v0;

/* compiled from: Messenger.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/s;", "Lru/avito/messenger/MessengerApi;", "T", "", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47835s<T extends MessengerApi> {

    /* compiled from: Messenger.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/s$a;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.s$a */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        @Y61.l
        public r0 f431831A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.l
        public Headers f431832B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.l
        public InterfaceC46925b f431833C;

        /* renamed from: D, reason: collision with root package name */
        public boolean f431834D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.l
        public InterfaceC47839w f431835E;

        /* renamed from: F, reason: collision with root package name */
        @Y61.l
        public C31667x f431836F;

        /* renamed from: I, reason: collision with root package name */
        @Y61.l
        public InterfaceC47734d0 f431839I;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public C47830m f431847h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public String f431848i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public String f431849j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public C0 f431850k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public InterfaceC28373a f431851l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public j0 f431852m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public InterfaceC47832o f431853n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public InterfaceC47748a f431854o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public C30277e1 f431855p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public Y81.d f431856q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public Long f431857r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public Long f431858s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public Long f431859t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public Map<String, String> f431860u;

        /* renamed from: w, reason: collision with root package name */
        @Y61.l
        public Integer f431862w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.l
        public v0.b f431863x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public HttpUrl f431864y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public Long f431865z;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f431840a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f431841b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f431842c = new LinkedHashMap();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f431843d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f431844e = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f431845f = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public h31.e<OkHttpClient> f431846g = new r();

        /* renamed from: v, reason: collision with root package name */
        @Y61.k
        public com.avito.android.remote.analytics.messenger.j f431861v = j.b.f253218a;

        /* renamed from: G, reason: collision with root package name */
        @Y61.k
        public C47740g0 f431837G = new C47740g0();

        /* renamed from: H, reason: collision with root package name */
        @Y61.k
        public Set<mx0.c> f431838H = kotlin.collections.B0.f406639b;

        @Y61.k
        public final void a(@Y61.k String str, @Y61.k Class cls, @Y61.l com.google.gson.h hVar) {
            this.f431841b.put(new C43607c(str, null, 2, null), new C43608d(cls, hVar));
        }

        @Y61.k
        public final void b(@Y61.k Class cls, @Y61.k com.google.gson.h hVar) {
            this.f431844e.add(new C43608d(cls, hVar));
        }

        @Y61.k
        public final void c(@Y61.k Class cls, @Y61.k TypeAdapter typeAdapter) {
            this.f431844e.add(new C43608d(cls, typeAdapter));
        }

        @Y61.k
        public final void d(@Y61.k String str, @Y61.l String str2, @Y61.k Class cls, @Y61.l com.google.gson.h hVar) {
            this.f431840a.put(new C43607c(str, str2), new C43608d(cls, hVar));
        }
    }

    @Y61.k
    /* renamed from: a */
    Y81.c getF430739d();

    @Y61.k
    T b();

    @Y61.k
    /* renamed from: c */
    Gson getF430738c();

    @Y61.k
    /* renamed from: d */
    InterfaceC47842z getF430736a();

    @Y61.k
    /* renamed from: e */
    InterfaceC47728a0 getF430737b();
}

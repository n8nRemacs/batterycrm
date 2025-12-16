package lv;

import Ku.AbstractC14350a;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import ev.AbstractC40162b;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;

/* compiled from: DeeplinkMapping.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Llv/a;", "", "a", "b", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43834a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C11807a f414235d = new C11807a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<DeepLink> f414236a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AbstractC14350a<? extends DeepLink> f414237b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f414238c;

    /* compiled from: DeeplinkMapping.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llv/a$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lv.a$a, reason: collision with other inner class name */
    public static final class C11807a {
        public /* synthetic */ C11807a(C42822w c42822w) {
            this();
        }

        @k
        public static C43834a a(@k d dVar, @l AbstractC14350a abstractC14350a) {
            return new C43834a(((InterfaceC42819t) dVar).f(), abstractC14350a, null);
        }

        public C11807a() {
        }
    }

    /* compiled from: DeeplinkMapping.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Llv/a$b;", "", "<init>", "()V", "a", "b", "Llv/a$b$a;", "Llv/a$b$b;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lv.a$b */
    public static abstract class b {

        /* compiled from: DeeplinkMapping.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llv/a$b$a;", "Llv/a$b;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: lv.a$b$a, reason: collision with other inner class name */
        public static final class C11808a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f414239a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Provider<AbstractC40161a<DeepLink>> f414240b;

            public C11808a(@k String str, @k Provider provider) {
                super(null);
                this.f414239a = str;
                this.f414240b = provider;
            }
        }

        /* compiled from: DeeplinkMapping.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llv/a$b$b;", "Llv/a$b;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: lv.a$b$b, reason: collision with other inner class name */
        public static final class C11809b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Provider<AbstractC40162b<DeepLink>> f414241a;

            public C11809b(@k Provider provider) {
                super(null);
                this.f414241a = provider;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public C43834a(@k Class<DeepLink> cls, @l AbstractC14350a<? extends DeepLink> abstractC14350a, @l b bVar) {
        this.f414236a = cls;
        this.f414237b = abstractC14350a;
        this.f414238c = bVar;
    }
}

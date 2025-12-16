package com.avito.android.di;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C30563f;
import com.avito.android.D2;
import com.avito.android.N2;
import com.avito.android.P2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.adapter.MyAdvertDetailsDeserializer;
import com.avito.android.remote.adapter.MyAdvertSafeDealServiceDeserializer;
import com.avito.android.remote.adapter.MyAdvertStatsDeserializer;
import com.avito.android.remote.adapter.UserAdvertDeserializer;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.UserAdvert;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lD.C43617a;
import lD.C43619c;

/* compiled from: UserAdvertJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/b0;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "a", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b0 implements dagger.internal.h<Set<X5>> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f139269h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P2 f139270a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30563f f139271b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43619c f139272c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C24193b f139273d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LO.b f139274e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final D2 f139275f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f139276g;

    /* compiled from: UserAdvertJsonModule_ProvideTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/b0$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b0(@Y61.k P2 p22, @Y61.k C30563f c30563f, @Y61.k C43619c c43619c, @Y61.k C24193b c24193b, @Y61.k LO.b bVar, @Y61.k D2 d22, @Y61.k dagger.internal.f fVar) {
        this.f139270a = p22;
        this.f139271b = c30563f;
        this.f139272c = c43619c;
        this.f139273d = c24193b;
        this.f139274e = bVar;
        this.f139275f = d22;
        this.f139276g = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N2 n22 = (N2) this.f139270a.get();
        C29640d c29640d = (C29640d) this.f139271b.get();
        C43617a c43617a = (C43617a) this.f139272c.get();
        C19616a c19616a = (C19616a) this.f139273d.get();
        KO.a aVar = (KO.a) this.f139274e.get();
        B2 b22 = (B2) this.f139275f.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f139276g.get();
        f139269h.getClass();
        Y.f139266a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(MyAdvertDetails.Stats.class, new MyAdvertStatsDeserializer()));
        linkedHashSet.add(new X5(MyAdvertDetails.class, new MyAdvertDetailsDeserializer(n22, b22, c29640d, c43617a, c19616a, aVar, interfaceC28373a)));
        linkedHashSet.add(new X5(UserAdvert.class, new UserAdvertDeserializer(n22)));
        linkedHashSet.add(new X5(MyAdvertSafeDeal.Service.class, new MyAdvertSafeDealServiceDeserializer()));
        return linkedHashSet;
    }
}

package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.ScreenContent;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/a;", "", "a", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.entity.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C29126a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C3299a f112054c = new C3299a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C29126a f112055d = new C29126a(null, null, 3, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ScreenContent f112056a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<b> f112057b;

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/a$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C3299a {
        public /* synthetic */ C3299a(C42822w c42822w) {
            this();
        }

        public C3299a() {
        }
    }

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/a$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112058a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final l1 f112059b;

        public b(@Y61.k String str, @Y61.l l1 l1Var) {
            this.f112058a = str;
            this.f112059b = l1Var;
        }

        public static b a(b bVar, l1 l1Var) {
            String str = bVar.f112058a;
            bVar.getClass();
            return new b(str, l1Var);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f112058a, bVar.f112058a) && L.f(this.f112059b, bVar.f112059b);
        }

        public final int hashCode() {
            int iHashCode = this.f112058a.hashCode() * 31;
            l1 l1Var = this.f112059b;
            return iHashCode + (l1Var == null ? 0 : l1Var.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "NativeBlock(id=" + this.f112058a + ", item=" + this.f112059b + ')';
        }
    }

    public C29126a() {
        this(null, null, 3, null);
    }

    @Y61.k
    public static C29126a a(@Y61.l ScreenContent screenContent, @Y61.k C42784z0 c42784z0) {
        return new C29126a(screenContent, c42784z0);
    }

    public static C29126a b(C29126a c29126a, ArrayList arrayList) {
        ScreenContent screenContent = c29126a.f112056a;
        c29126a.getClass();
        return new C29126a(screenContent, arrayList);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29126a)) {
            return false;
        }
        C29126a c29126a = (C29126a) obj;
        return L.f(this.f112056a, c29126a.f112056a) && L.f(this.f112057b, c29126a.f112057b);
    }

    public final int hashCode() {
        ScreenContent screenContent = this.f112056a;
        return this.f112057b.hashCode() + ((screenContent == null ? 0 : screenContent.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinScreenContentState(content=");
        sb2.append(this.f112056a);
        sb2.append(", nativeBlocks=");
        return H.p(sb2, this.f112057b, ')');
    }

    public C29126a(ScreenContent screenContent, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : screenContent, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }

    public C29126a(@Y61.l ScreenContent screenContent, @Y61.k List<b> list) {
        this.f112056a = screenContent;
        this.f112057b = list;
    }
}

package com.avito.android.sbc.autodispatches;

import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.autodispatches.C34466b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesCache.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatches/C;", "", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class C {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f258817c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C f258818d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34466b f258819a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C34466b f258820b;

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/autodispatches/C$a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C34466b.a aVar = C34466b.f258846c;
        aVar.getClass();
        C34466b c34466b = C34466b.f258847d;
        aVar.getClass();
        f258818d = new C(c34466b, c34466b);
    }

    public C(@Y61.k C34466b c34466b, @Y61.k C34466b c34466b2) {
        this.f258819a = c34466b;
        this.f258820b = c34466b2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return L.f(this.f258819a, c12.f258819a) && L.f(this.f258820b, c12.f258820b);
    }

    public final int hashCode() {
        return this.f258820b.hashCode() + (this.f258819a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SbcDispatchCacheModel(activeAutoDispatches=" + this.f258819a + ", inactiveAutoDispatches=" + this.f258820b + ')';
    }
}

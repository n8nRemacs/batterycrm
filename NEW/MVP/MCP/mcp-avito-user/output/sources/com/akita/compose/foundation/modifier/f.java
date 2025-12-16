package com.akita.compose.foundation.modifier;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.modifier.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Shadow.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/foundation/modifier/f;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f63621c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final f f63622d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f63623a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f63624b;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/foundation/modifier/f$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        e.a aVar = e.f63615e;
        aVar.getClass();
        e eVar = e.f63616f;
        aVar.getClass();
        f63622d = new f(eVar, eVar);
    }

    public f(@k e eVar, @k e eVar2) {
        this.f63623a = eVar;
        this.f63624b = eVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f63623a, fVar.f63623a) && L.f(this.f63624b, fVar.f63624b);
    }

    public final int hashCode() {
        return this.f63624b.hashCode() + (this.f63623a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ShadowsParams(upper=" + this.f63623a + ", bottom=" + this.f63624b + ')';
    }
}

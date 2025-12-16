package com.akita.compose.foundation;

import androidx.compose.runtime.F3;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ColorStateValues.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/foundation/c;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f63573e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final c f63574f = new c(null, null, null, null, 15, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f63575a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f63576b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f63577c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f63578d;

    /* compiled from: ColorStateValues.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/foundation/c$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f63575a, cVar.f63575a) && L.f(this.f63576b, cVar.f63576b) && L.f(this.f63577c, cVar.f63577c) && L.f(this.f63578d, cVar.f63578d);
    }

    public final int hashCode() {
        return this.f63578d.hashCode() + s.b(this.f63577c, s.b(this.f63576b, this.f63575a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "ColorStateValues(default=" + this.f63575a + ", error=" + this.f63576b + ", disabled=" + this.f63577c + ", selected=" + this.f63578d + ')';
    }

    public c(@Y61.k p pVar, @Y61.k p pVar2, @Y61.k p pVar3, @Y61.k p pVar4) {
        this.f63575a = pVar;
        this.f63576b = pVar2;
        this.f63577c = pVar3;
        this.f63578d = pVar4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(p pVar, p pVar2, p pVar3, p pVar4, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            p.f63635e.getClass();
            pVar = p.f63636f;
        }
        if ((i12 & 2) != 0) {
            p.f63635e.getClass();
            pVar2 = p.f63636f;
        }
        if ((i12 & 4) != 0) {
            p.f63635e.getClass();
            pVar3 = p.f63636f;
        }
        if ((i12 & 8) != 0) {
            p.f63635e.getClass();
            pVar4 = p.f63636f;
        }
        this(pVar, pVar2, pVar3, pVar4);
    }
}

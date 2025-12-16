package com.avito.android.beduin.common.component.checkbox;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxPayload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox/g;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class g {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f100939d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final CheckboxState f100940a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.beduin.common.component.k<Boolean> f100941b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100942c;

    /* compiled from: CheckboxPayload.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox/g$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@l CheckboxState checkboxState, @l com.avito.android.beduin.common.component.k<Boolean> kVar) {
        this.f100940a = checkboxState;
        this.f100941b = kVar;
        this.f100942c = checkboxState == null && kVar == null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f100940a == gVar.f100940a && L.f(this.f100941b, gVar.f100941b);
    }

    public final int hashCode() {
        CheckboxState checkboxState = this.f100940a;
        int iHashCode = (checkboxState == null ? 0 : checkboxState.hashCode()) * 31;
        com.avito.android.beduin.common.component.k<Boolean> kVar = this.f100941b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CheckboxPayload(state=" + this.f100940a + ", isEnabled=" + this.f100941b + ')';
    }
}

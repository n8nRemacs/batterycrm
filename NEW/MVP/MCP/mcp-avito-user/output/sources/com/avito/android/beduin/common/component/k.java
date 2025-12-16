package com.avito.android.beduin.common.component;

import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FieldPayload.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/k;", "T", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class k<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f101647b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Boolean f101648a;

    /* compiled from: FieldPayload.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/k$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.l Boolean bool) {
        this.f101648a = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && L.f(this.f101648a, ((k) obj).f101648a);
    }

    public final int hashCode() {
        Boolean bool = this.f101648a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C0.g(new StringBuilder("FieldPayload(value="), this.f101648a, ')');
    }
}

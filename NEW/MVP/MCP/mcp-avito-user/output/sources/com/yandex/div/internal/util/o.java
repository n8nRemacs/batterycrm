package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Size.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/util/o;", "", "a", "px", "", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f370184a;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/util/o$a;", "", "<init>", "()V", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f370184a == ((o) obj).f370184a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f370184a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("Size(px="), this.f370184a, ')');
    }
}

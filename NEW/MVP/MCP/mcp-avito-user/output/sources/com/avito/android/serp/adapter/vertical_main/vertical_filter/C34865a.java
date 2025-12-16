package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersErrorsDelegate.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/a;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C34865a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C8113a f273427c = new C8113a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f273428a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f273429b;

    /* compiled from: InlineFiltersErrorsDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/a$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.a$a, reason: collision with other inner class name */
    public static final class C8113a {
        public /* synthetic */ C8113a(C42822w c42822w) {
            this();
        }

        public C8113a() {
        }
    }

    public C34865a(@Y61.k String str, @Y61.k PrintableText printableText) {
        this.f273428a = str;
        this.f273429b = printableText;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34865a)) {
            return false;
        }
        C34865a c34865a = (C34865a) obj;
        return kotlin.jvm.internal.L.f(this.f273428a, c34865a.f273428a) && kotlin.jvm.internal.L.f(this.f273429b, c34865a.f273429b);
    }

    public final int hashCode() {
        return this.f273429b.hashCode() + (this.f273428a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InlineFilterError(filterTitle=");
        sb2.append(this.f273428a);
        sb2.append(", errorText=");
        return AK.c.m(sb2, this.f273429b, ')');
    }
}

package com.avito.android.autoteka.helpers;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputDataDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/helpers/k;", "", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    /* compiled from: InputDataDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/autoteka/helpers/k$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/autoteka/helpers/k$a$a;", "Lcom/avito/android/autoteka/helpers/k$a$b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: InputDataDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/helpers/k$a$a;", "Lcom/avito/android/autoteka/helpers/k$a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.autoteka.helpers.k$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2871a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PrintableText f96666a;

            public C2871a(@Y61.k PrintableText printableText) {
                super(null);
                this.f96666a = printableText;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2871a) && L.f(this.f96666a, ((C2871a) obj).f96666a);
            }

            public final int hashCode() {
                return this.f96666a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.m(new StringBuilder("Error(printableText="), this.f96666a, ')');
            }
        }

        /* compiled from: InputDataDelegate.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/helpers/k$a$b;", "Lcom/avito/android/autoteka/helpers/k$a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f96667a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }
}

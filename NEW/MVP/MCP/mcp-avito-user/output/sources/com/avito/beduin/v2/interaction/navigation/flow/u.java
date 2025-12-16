package com.avito.beduin.v2.interaction.navigation.flow;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScreenKey.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/u;", "", "a", "b", "c", "Lcom/avito/beduin/v2/interaction/navigation/flow/u$b;", "Lcom/avito/beduin/v2/interaction/navigation/flow/u$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f337549b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f337550a;

    /* compiled from: ScreenKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/u$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static u a(@Y61.k String str) {
            b bVar = b.f337551c;
            return str.equals(bVar.f337550a) ? bVar : new c(str);
        }

        public a() {
        }
    }

    /* compiled from: ScreenKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/u$b;", "Lcom/avito/beduin/v2/interaction/navigation/flow/u;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends u {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f337551c = new b();

        public b() {
            super("Root", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1144320936;
        }

        @Y61.k
        public final String toString() {
            return "Root";
        }
    }

    /* compiled from: ScreenKey.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/u$c;", "Lcom/avito/beduin/v2/interaction/navigation/flow/u;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends u {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f337552c;

        public c(@Y61.k String str) {
            super(str, null);
            this.f337552c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f337552c, ((c) obj).f337552c);
        }

        public final int hashCode() {
            return this.f337552c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("WithName(name="), this.f337552c, ')');
        }
    }

    public u(String str, C42822w c42822w) {
        this.f337550a = str;
    }
}

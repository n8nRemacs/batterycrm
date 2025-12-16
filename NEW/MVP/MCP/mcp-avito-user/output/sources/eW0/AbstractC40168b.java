package ew0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeViewState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lew0/b;", "", "a", "b", "Lew0/b$a;", "Lew0/b$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC40168b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f395453a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f395454b;

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/b$a;", "Lew0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.b$a */
    public static final /* data */ class a extends AbstractC40168b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f395455c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f395456d;

        public a(@k String str, @k String str2) {
            super(str, str2, null);
            this.f395455c = str;
            this.f395456d = str2;
        }

        @Override // ew0.AbstractC40168b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF395454b() {
            return this.f395456d;
        }

        @Override // ew0.AbstractC40168b
        @k
        /* renamed from: b, reason: from getter */
        public final String getF395453a() {
            return this.f395455c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f395455c, aVar.f395455c) && L.f(this.f395456d, aVar.f395456d);
        }

        public final int hashCode() {
            return this.f395456d.hashCode() + (this.f395455c.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(text=");
            sb2.append(this.f395455c);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f395456d, ')');
        }
    }

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/b$b;", "Lew0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11115b extends AbstractC40168b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f395457c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f395458d;

        public C11115b(@k String str, @k String str2) {
            super(str, str2, null);
            this.f395457c = str;
            this.f395458d = str2;
        }

        @Override // ew0.AbstractC40168b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF395454b() {
            return this.f395458d;
        }

        @Override // ew0.AbstractC40168b
        @k
        /* renamed from: b, reason: from getter */
        public final String getF395453a() {
            return this.f395457c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11115b)) {
                return false;
            }
            C11115b c11115b = (C11115b) obj;
            return L.f(this.f395457c, c11115b.f395457c) && L.f(this.f395458d, c11115b.f395458d);
        }

        public final int hashCode() {
            return this.f395458d.hashCode() + (this.f395457c.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Regular(text=");
            sb2.append(this.f395457c);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f395458d, ')');
        }
    }

    public AbstractC40168b(String str, String str2, C42822w c42822w) {
        this.f395453a = str;
        this.f395454b = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public String getF395454b() {
        return this.f395454b;
    }

    @k
    /* renamed from: b, reason: from getter */
    public String getF395453a() {
        return this.f395453a;
    }
}

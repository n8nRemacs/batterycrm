package fU0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LfU0/a;", "", "<init>", "()V", "a", "b", "LfU0/a$a;", "LfU0/a$b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40338a {

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfU0/a$a;", "LfU0/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fU0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11153a extends AbstractC40338a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395884a;

        public C11153a(@k String str) {
            super(null);
            this.f395884a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11153a) && L.f(this.f395884a, ((C11153a) obj).f395884a);
        }

        public final int hashCode() {
            return this.f395884a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PerfTag(value="), this.f395884a, ')');
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfU0/a$b;", "LfU0/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fU0.a$b */
    public static final /* data */ class b extends AbstractC40338a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395885a;

        public b(@k String str) {
            super(null);
            this.f395885a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395885a, ((b) obj).f395885a);
        }

        public final int hashCode() {
            return this.f395885a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Tag(value="), this.f395885a, ')');
        }
    }

    public /* synthetic */ AbstractC40338a(C42822w c42822w) {
        this();
    }

    public AbstractC40338a() {
    }
}

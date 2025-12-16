package ik;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceBeduinV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lik/b;", "", "a", "Lik/b$a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ik.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC41417b {

    /* compiled from: BrandspaceBeduinV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lik/b$a;", "Lik/b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ik.b$a */
    public static final /* data */ class a implements InterfaceC41417b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398708a;

        public a(@k String str) {
            this.f398708a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f398708a, ((a) obj).f398708a);
        }

        public final int hashCode() {
            return this.f398708a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleBeduinJsonScenario(scenario="), this.f398708a, ')');
        }
    }
}

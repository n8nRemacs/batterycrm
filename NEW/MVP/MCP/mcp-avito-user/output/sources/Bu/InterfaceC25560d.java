package bU;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.gradient.linear.GradientLinearStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GradientStyle.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LbU/d;", "", "a", "b", "c", "LbU/d$b;", "LbU/d$c;", "_design-modules_beduin-v2_renderer-compose_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bU.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC25560d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f57080a = a.f57081a;

    /* compiled from: GradientStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbU/d$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bU.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f57081a = new a();
    }

    /* compiled from: GradientStyle.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbU/d$b;", "LbU/d;", "_design-modules_beduin-v2_renderer-compose_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bU.d$b */
    public static final /* data */ class b implements InterfaceC25560d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GradientLinearStyle f57082b;

        public b(@Y61.k GradientLinearStyle gradientLinearStyle) {
            this.f57082b = gradientLinearStyle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f57082b, ((b) obj).f57082b);
        }

        public final int hashCode() {
            return this.f57082b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Linear(style=" + this.f57082b + ')';
        }
    }

    /* compiled from: GradientStyle.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbU/d$c;", "LbU/d;", "_design-modules_beduin-v2_renderer-compose_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bU.d$c */
    public static final /* data */ class c implements InterfaceC25560d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.component.gradient.radial.c f57083b;

        public c(@Y61.k com.akita.compose.component.gradient.radial.c cVar) {
            this.f57083b = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f57083b, ((c) obj).f57083b);
        }

        public final int hashCode() {
            return this.f57083b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Radial(style=" + this.f57083b + ')';
        }
    }
}

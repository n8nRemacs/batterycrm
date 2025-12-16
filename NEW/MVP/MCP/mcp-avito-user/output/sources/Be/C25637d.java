package be;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import be.InterfaceC25634a;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lbe/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: be.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C25637d extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f57309c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C25637d f57310d = new C25637d(new c(C42784z0.f406748b));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC2008d f57311b;

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbe/d$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbe/d$b;", "Lbe/d$d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.d$b */
    public static final /* data */ class b implements InterfaceC2008d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f57312a;

        public b(@k ArrayList arrayList) {
            this.f57312a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f57312a.equals(((b) obj).f57312a);
        }

        public final int hashCode() {
            return this.f57312a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ContentSocialsState(socials="), this.f57312a, ')');
        }
    }

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbe/d$c;", "Lbe/d$d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.d$c */
    public static final /* data */ class c implements InterfaceC2008d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Object f57313a;

        public c(@k List<InterfaceC25634a.c> list) {
            this.f57313a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f57313a, ((c) obj).f57313a);
        }

        public final int hashCode() {
            return this.f57313a.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("SkeletonSocialsState(skeletons="), this.f57313a, ')');
        }
    }

    /* compiled from: AuthSocialsState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lbe/d$d;", "", "Lbe/d$b;", "Lbe/d$c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.d$d, reason: collision with other inner class name */
    public interface InterfaceC2008d {
    }

    public C25637d(@k InterfaceC2008d interfaceC2008d) {
        this.f57311b = interfaceC2008d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25637d) && L.f(this.f57311b, ((C25637d) obj).f57311b);
    }

    public final int hashCode() {
        return this.f57311b.hashCode();
    }

    @k
    public final String toString() {
        return "AuthSocialsState(state=" + this.f57311b + ')';
    }
}

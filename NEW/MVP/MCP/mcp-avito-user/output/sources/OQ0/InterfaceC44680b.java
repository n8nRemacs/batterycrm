package oQ0;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: GigInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LoQ0/b;", "", "a", "b", "c", "LoQ0/b$a;", "LoQ0/b$b;", "LoQ0/b$c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oQ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC44680b {

    /* compiled from: GigInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoQ0/b$a;", "LoQ0/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oQ0.b$a */
    public static final /* data */ class a implements InterfaceC44680b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f419762a;

        public a(@k ArrayList arrayList) {
            this.f419762a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f419762a.equals(((a) obj).f419762a);
        }

        public final int hashCode() {
            return this.f419762a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ContentLoaded(list="), this.f419762a, ')');
        }
    }

    /* compiled from: GigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoQ0/b$b;", "LoQ0/b;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oQ0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12188b implements InterfaceC44680b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12188b f419763a = new C12188b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12188b);
        }

        public final int hashCode() {
            return -1053337909;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: GigInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoQ0/b$c;", "LoQ0/b;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oQ0.b$c */
    public static final /* data */ class c implements InterfaceC44680b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f419764a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1124777665;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}

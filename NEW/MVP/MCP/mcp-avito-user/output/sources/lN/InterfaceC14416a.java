package Ln;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoriesAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LLn/a;", "", "a", "b", "c", "d", "LLn/a$a;", "LLn/a$b;", "LLn/a$c;", "LLn/a$d;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ln.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14416a {

    /* compiled from: CategoriesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLn/a$a;", "LLn/a;", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ln.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0631a implements InterfaceC14416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0631a f10102a = new C0631a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0631a);
        }

        public final int hashCode() {
            return 702717198;
        }

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: CategoriesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLn/a$b;", "LLn/a;", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ln.a$b */
    public static final /* data */ class b implements InterfaceC14416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f10103a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -465052775;
        }

        @k
        public final String toString() {
            return "BottomButtonClick";
        }
    }

    /* compiled from: CategoriesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLn/a$c;", "LLn/a;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ln.a$c */
    public static final /* data */ class c implements InterfaceC14416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C14417b f10104a;

        public c(@k C14417b c14417b) {
            this.f10104a = c14417b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10104a, ((c) obj).f10104a);
        }

        public final int hashCode() {
            return this.f10104a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemClicked(item=" + this.f10104a + ')';
        }
    }

    /* compiled from: CategoriesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLn/a$d;", "LLn/a;", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ln.a$d */
    public static final /* data */ class d implements InterfaceC14416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f10105a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1645398447;
        }

        @k
        public final String toString() {
            return "RetryClicked";
        }
    }
}

package jk;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Ljk/a;", "", "a", "b", "c", "d", "e", "f", "Ljk/a$a;", "Ljk/a$b;", "Ljk/a$c;", "Ljk/a$d;", "Ljk/a$e;", "Ljk/a$f;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC42390a {

    /* compiled from: BrandspaceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljk/a$a;", "Ljk/a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11577a implements InterfaceC42390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinAction f405780a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f405781b;

        public C11577a(@k BeduinAction beduinAction, @k ApiError apiError) {
            this.f405780a = beduinAction;
            this.f405781b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11577a)) {
                return false;
            }
            C11577a c11577a = (C11577a) obj;
            return L.f(this.f405780a, c11577a.f405780a) && L.f(this.f405781b, c11577a.f405781b);
        }

        public final int hashCode() {
            return this.f405781b.hashCode() + (this.f405780a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExecuteRequestAction(beduinAction=");
            sb2.append(this.f405780a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f405781b, ')');
        }
    }

    /* compiled from: BrandspaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/a$b;", "Ljk/a;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.a$b */
    public static final class b implements InterfaceC42390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f405782a = new b();
    }

    /* compiled from: BrandspaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/a$c;", "Ljk/a;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.a$c */
    public static final class c implements InterfaceC42390a {
        static {
            new c();
        }
    }

    /* compiled from: BrandspaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/a$d;", "Ljk/a;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.a$d */
    public static final class d implements InterfaceC42390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f405783a = new d();
    }

    /* compiled from: BrandspaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/a$e;", "Ljk/a;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.a$e */
    public static final class e implements InterfaceC42390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f405784a = new e();
    }

    /* compiled from: BrandspaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/a$f;", "Ljk/a;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.a$f */
    public static final class f implements InterfaceC42390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f405785a = new f();
    }
}

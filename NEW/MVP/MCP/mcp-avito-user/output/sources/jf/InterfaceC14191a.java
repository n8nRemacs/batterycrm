package Jf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaConfirmEmailAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LJf/a;", "", "a", "b", "LJf/a$a;", "LJf/a$b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14191a {

    /* compiled from: AutotekaConfirmEmailAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJf/a$a;", "LJf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0534a implements InterfaceC14191a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9081a;

        public C0534a(@k String str) {
            this.f9081a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0534a) && L.f(this.f9081a, ((C0534a) obj).f9081a);
        }

        public final int hashCode() {
            return this.f9081a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeEmail(email="), this.f9081a, ')');
        }
    }

    /* compiled from: AutotekaConfirmEmailAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJf/a$b;", "LJf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jf.a$b */
    public static final /* data */ class b implements InterfaceC14191a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9082a;

        public b(@k String str) {
            this.f9082a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f9082a, ((b) obj).f9082a);
        }

        public final int hashCode() {
            return this.f9082a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveEmail(email="), this.f9082a, ')');
        }
    }
}

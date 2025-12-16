package KA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionNameAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LKA/a;", "", "a", "b", "c", "LKA/a$a;", "LKA/a$b;", "LKA/a$c;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: ExtendedProfileSetSelectionNameAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKA/a$a;", "LKA/a;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KA.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0558a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0558a f9336a = new C0558a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0558a);
        }

        public final int hashCode() {
            return 1465398598;
        }

        @k
        public final String toString() {
            return "ContinueClick";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKA/a$b;", "LKA/a;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9337a;

        public b(boolean z12) {
            this.f9337a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f9337a == ((b) obj).f9337a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f9337a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsPublicChange(isPublic="), this.f9337a, ')');
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKA/a$c;", "LKA/a;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9338a;

        public c(@k String str) {
            this.f9338a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9338a, ((c) obj).f9338a);
        }

        public final int hashCode() {
            return this.f9338a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TypingText(text="), this.f9338a, ')');
        }
    }
}

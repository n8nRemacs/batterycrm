package Eg0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TextSheetAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LEg0/a;", "", "a", "b", "c", "LEg0/a$a;", "LEg0/a$b;", "LEg0/a$c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13484a {

    /* compiled from: TextSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/a$a;", "LEg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eg0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0243a implements InterfaceC13484a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4138a;

        public C0243a(@k DeepLink deepLink) {
            this.f4138a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0243a) && L.f(this.f4138a, ((C0243a) obj).f4138a);
        }

        public final int hashCode() {
            return this.f4138a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f4138a, ')');
        }
    }

    /* compiled from: TextSheetAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/a$b;", "LEg0/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eg0.a$b */
    public static final class b implements InterfaceC13484a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f4139a = new b();
    }

    /* compiled from: TextSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/a$c;", "LEg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eg0.a$c */
    public static final /* data */ class c implements InterfaceC13484a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4140a;

        public c(@k String str) {
            this.f4140a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4140a, ((c) obj).f4140a);
        }

        public final int hashCode() {
            return this.f4140a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChanged(text="), this.f4140a, ')');
        }
    }
}

package e60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileToConvertAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Le60/a;", "", "a", "b", "c", "Le60/a$a;", "Le60/a$b;", "Le60/a$c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC39956a {

    /* compiled from: ProfileToConvertAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le60/a$a;", "Le60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e60.a$a, reason: collision with other inner class name */
    public static final class C11053a implements InterfaceC39956a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11053a f394957a = new C11053a();
    }

    /* compiled from: ProfileToConvertAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le60/a$b;", "Le60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e60.a$b */
    public static final /* data */ class b implements InterfaceC39956a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f394958a;

        public b(@k DeepLink deepLink) {
            this.f394958a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f394958a, ((b) obj).f394958a);
        }

        public final int hashCode() {
            return this.f394958a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deeplink="), this.f394958a, ')');
        }
    }

    /* compiled from: ProfileToConvertAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le60/a$c;", "Le60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e60.a$c */
    public static final /* data */ class c implements InterfaceC39956a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394959a;

        public c(@k String str) {
            this.f394959a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f394959a, ((c) obj).f394959a);
        }

        public final int hashCode() {
            return this.f394959a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ItemSelected(userId="), this.f394959a, ')');
        }
    }
}

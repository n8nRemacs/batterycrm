package uy;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditCountFieldOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Luy/b;", "", "a", "b", "c", "Luy/b$a;", "Luy/b$b;", "Luy/b$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49126b {

    /* compiled from: EditCountFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luy/b$a;", "Luy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uy.b$a */
    public static final /* data */ class a implements InterfaceC49126b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440352a;

        public a(boolean z12) {
            this.f440352a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f440352a == ((a) obj).f440352a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440352a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseWithResult(isChanged="), this.f440352a, ')');
        }
    }

    /* compiled from: EditCountFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luy/b$b;", "Luy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uy.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12737b implements InterfaceC49126b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f440353a;

        public C12737b(@k Throwable th2) {
            this.f440353a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12737b) && L.f(this.f440353a, ((C12737b) obj).f440353a);
        }

        public final int hashCode() {
            return this.f440353a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f440353a, ')');
        }
    }

    /* compiled from: EditCountFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luy/b$c;", "Luy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uy.b$c */
    public static final /* data */ class c implements InterfaceC49126b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440354a;

        public c(@k String str) {
            this.f440354a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440354a, ((c) obj).f440354a);
        }

        public final int hashCode() {
            return this.f440354a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToastBar(errorText="), this.f440354a, ')');
        }
    }
}

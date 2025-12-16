package fh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormSelectItemAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lfh0/a;", "", "a", "b", "c", "d", "e", "f", "Lfh0/a$a;", "Lfh0/a$b;", "Lfh0/a$c;", "Lfh0/a$d;", "Lfh0/a$e;", "Lfh0/a$f;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40422a {

    /* compiled from: RatingFormSelectItemAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfh0/a$a;", "Lfh0/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11168a implements InterfaceC40422a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11168a f396041a = new C11168a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11168a);
        }

        public final int hashCode() {
            return -1891219528;
        }

        @k
        public final String toString() {
            return "ContinueButtonClicked";
        }
    }

    /* compiled from: RatingFormSelectItemAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfh0/a$b;", "Lfh0/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.a$b */
    public static final class b implements InterfaceC40422a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f396042a = new b();
    }

    /* compiled from: RatingFormSelectItemAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfh0/a$c;", "Lfh0/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.a$c */
    public static final class c implements InterfaceC40422a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f396043a = new c();
    }

    /* compiled from: RatingFormSelectItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfh0/a$d;", "Lfh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.a$d */
    public static final /* data */ class d implements InterfaceC40422a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.rating_form.api.remote.model.a> f396044a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k List<? extends com.avito.android.rating_form.api.remote.model.a> list) {
            this.f396044a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396044a, ((d) obj).f396044a);
        }

        public final int hashCode() {
            return this.f396044a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ReloadFailedRequest(failedCommands="), this.f396044a, ')');
        }
    }

    /* compiled from: RatingFormSelectItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfh0/a$e;", "Lfh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.a$e */
    public static final /* data */ class e implements InterfaceC40422a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396045a;

        public e(@k String str) {
            this.f396045a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f396045a, ((e) obj).f396045a);
        }

        public final int hashCode() {
            return this.f396045a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Search(query="), this.f396045a, ')');
        }
    }

    /* compiled from: RatingFormSelectItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfh0/a$f;", "Lfh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.a$f */
    public static final /* data */ class f implements InterfaceC40422a {

        /* renamed from: a, reason: collision with root package name */
        public final long f396046a;

        public f(long j12) {
            this.f396046a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f396046a == ((f) obj).f396046a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f396046a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("SelectItem(advertId="), this.f396046a, ')');
        }
    }
}

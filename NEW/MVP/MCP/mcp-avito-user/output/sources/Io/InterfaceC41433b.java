package io;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnsafeNetworkOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/b;", "", "a", "b", "c", "Lio/b$a;", "Lio/b$b;", "Lio/b$c;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: io.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC41433b {

    /* compiled from: UnsafeNetworkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/b$a;", "Lio/b;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: io.b$a */
    public static final /* data */ class a implements InterfaceC41433b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f398770a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1691533760;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: UnsafeNetworkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/b$b;", "Lio/b;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: io.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11395b implements InterfaceC41433b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398771a;

        public C11395b(@k String str) {
            this.f398771a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11395b) && L.f(this.f398771a, ((C11395b) obj).f398771a);
        }

        public final int hashCode() {
            return this.f398771a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenBrowser(url="), this.f398771a, ')');
        }
    }

    /* compiled from: UnsafeNetworkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/b$c;", "Lio/b;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: io.b$c */
    public static final /* data */ class c implements InterfaceC41433b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f398772a;

        public c(@k PrintableText printableText) {
            this.f398772a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398772a, ((c) obj).f398772a);
        }

        public final int hashCode() {
            return this.f398772a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(message="), this.f398772a, ')');
        }
    }
}

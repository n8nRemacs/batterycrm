package oA0;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.SuggestAddress;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import oA0.InterfaceC44613d;

/* compiled from: SuggestAddressesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LoA0/b;", "", "a", "b", "c", "LoA0/b$a;", "LoA0/b$b;", "LoA0/b$c;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44611b {

    /* compiled from: SuggestAddressesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LoA0/b$a;", "LoA0/b;", "a", "b", "c", "LoA0/b$a$a;", "LoA0/b$a$b;", "LoA0/b$a$c;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.b$a */
    public interface a extends InterfaceC44611b {

        /* compiled from: SuggestAddressesOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoA0/b$a$a;", "LoA0/b$a;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oA0.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12167a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12167a f419479a = new C12167a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C12167a);
            }

            public final int hashCode() {
                return 1540497176;
            }

            @k
            public final String toString() {
                return "FinishScreen";
            }
        }

        /* compiled from: SuggestAddressesOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoA0/b$a$b;", "LoA0/b$a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oA0.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C12168b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList<SuggestAddress> f419480a;

            public C12168b(@k ArrayList<SuggestAddress> arrayList) {
                this.f419480a = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12168b) && L.f(this.f419480a, ((C12168b) obj).f419480a);
            }

            public final int hashCode() {
                return this.f419480a.hashCode();
            }

            @k
            public final String toString() {
                return e.p(new StringBuilder("FinishScreenWithResult(addresses="), this.f419480a, ')');
            }
        }

        /* compiled from: SuggestAddressesOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoA0/b$a$c;", "LoA0/b$a;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oA0.b$a$c */
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f419481a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -164875390;
            }

            @k
            public final String toString() {
                return "HideKeyboard";
            }
        }
    }

    /* compiled from: SuggestAddressesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoA0/b$b;", "LoA0/b;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12169b implements InterfaceC44611b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC44613d.b f419482a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f.c f419483b;

        public C12169b(@k InterfaceC44613d.b bVar, @k f.c cVar) {
            ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
            this.f419482a = bVar;
            this.f419483b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12169b)) {
                return false;
            }
            C12169b c12169b = (C12169b) obj;
            if (!L.f(this.f419482a, c12169b.f419482a) || !this.f419483b.equals(c12169b.f419483b)) {
                return false;
            }
            ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
            return true;
        }

        public final int hashCode() {
            this.f419482a.getClass();
            return ToastBarPosition.f181046d.hashCode() + ((this.f419483b.hashCode() + 389078857) * 31);
        }

        @k
        public final String toString() {
            return "Toast(messageType=" + this.f419482a + ", type=" + this.f419483b + ", position=" + ToastBarPosition.f181046d + ')';
        }
    }

    /* compiled from: SuggestAddressesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoA0/b$c;", "LoA0/b;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.b$c */
    public static final /* data */ class c implements InterfaceC44611b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f419484a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1853079190;
        }

        @k
        public final String toString() {
            return "UpdateSuggests";
        }
    }
}

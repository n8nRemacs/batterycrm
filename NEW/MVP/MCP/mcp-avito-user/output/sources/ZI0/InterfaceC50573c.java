package zi0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lzi0/c;", "", "a", "b", "c", "d", "Lzi0/c$a;", "Lzi0/c$b;", "Lzi0/c$c;", "Lzi0/c$d;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50573c {

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzi0/c$a;", "Lzi0/c;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.c$a */
    public static final /* data */ class a implements InterfaceC50573c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444190a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -954864734;
        }

        @k
        public final String toString() {
            return "NoChanges";
        }
    }

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/c$b;", "Lzi0/c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.c$b */
    public static final /* data */ class b implements InterfaceC50573c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f444191a;

        public b(@k String str) {
            this.f444191a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f444191a, ((b) obj).f444191a);
        }

        public final int hashCode() {
            return this.f444191a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OverlayError(text="), this.f444191a, ')');
        }
    }

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/c$c;", "Lzi0/c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12969c implements InterfaceC50573c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f444192a;

        /* JADX WARN: Multi-variable type inference failed */
        public C12969c(@k List<? extends com.avito.conveyor_item.a> list) {
            this.f444192a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12969c) && L.f(this.f444192a, ((C12969c) obj).f444192a);
        }

        public final int hashCode() {
            return this.f444192a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowLoadedState(items="), this.f444192a, ')');
        }
    }

    /* compiled from: RecallMeState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzi0/c$d;", "Lzi0/c;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.c$d */
    public static final /* data */ class d implements InterfaceC50573c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f444193a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 220979372;
        }

        @k
        public final String toString() {
            return "ShowLoadingProgress";
        }
    }
}

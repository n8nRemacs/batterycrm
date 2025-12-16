package cq0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GroupClearanceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcq0/b;", "", "a", "b", "c", "Lcq0/b$a;", "Lcq0/b$b;", "Lcq0/b$c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39398b {

    /* compiled from: GroupClearanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq0/b$a;", "Lcq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.b$a */
    public static final /* data */ class a implements InterfaceC39398b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f392961a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1272388515;
        }

        @k
        public final String toString() {
            return "LeaveWithoutChanges";
        }
    }

    /* compiled from: GroupClearanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq0/b$b;", "Lcq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C10992b implements InterfaceC39398b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C10992b f392962a = new C10992b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C10992b);
        }

        public final int hashCode() {
            return -1995601978;
        }

        @k
        public final String toString() {
            return "ResetAndLeaveScreen";
        }
    }

    /* compiled from: GroupClearanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcq0/b$c;", "Lcq0/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.b$c */
    public static final /* data */ class c implements InterfaceC39398b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Object f392963a;

        public c(@k Map<String, Long> map) {
            this.f392963a = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f392963a.equals(((c) obj).f392963a);
        }

        public final int hashCode() {
            return this.f392963a.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("SubmitAndLeave(selected="), this.f392963a, ')');
        }
    }
}

package Sy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSy0/c;", "", "a", "b", "LSy0/c$a;", "LSy0/c$b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: StrCancellationSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LSy0/c$a;", "LSy0/c;", "a", "LSy0/c$a$a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends c {

        /* compiled from: StrCancellationSettingsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSy0/c$a$a;", "LSy0/c$a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Sy0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1040a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f15232a;

            public C1040a(@k String str) {
                this.f15232a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1040a) && L.f(this.f15232a, ((C1040a) obj).f15232a);
            }

            public final int hashCode() {
                return this.f15232a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f15232a, ')');
            }
        }
    }

    /* compiled from: StrCancellationSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSy0/c$b;", "LSy0/c;", "a", "b", "LSy0/c$b$a;", "LSy0/c$b$b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends c {

        /* compiled from: StrCancellationSettingsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSy0/c$b$a;", "LSy0/c$b;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f15233a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1319238215;
            }

            @k
            public final String toString() {
                return "CloseScreen";
            }
        }

        /* compiled from: StrCancellationSettingsOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSy0/c$b$b;", "LSy0/c$b;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Sy0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1041b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f15234a;

            public C1041b(@k String str) {
                this.f15234a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1041b) && L.f(this.f15234a, ((C1041b) obj).f15234a);
            }

            public final int hashCode() {
                return this.f15234a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("PassNewParameterTitle(newParameterTitle="), this.f15234a, ')');
            }
        }
    }
}

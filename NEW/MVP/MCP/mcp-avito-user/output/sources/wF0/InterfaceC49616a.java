package wf0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SleepingPlacesAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lwf0/a;", "", "a", "b", "Lwf0/a$a;", "Lwf0/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49616a {

    /* compiled from: SleepingPlacesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwf0/a$a;", "Lwf0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wf0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12823a implements InterfaceC49616a {

        /* renamed from: a, reason: collision with root package name */
        public final int f441722a;

        public C12823a(int i12) {
            this.f441722a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12823a) && this.f441722a == ((C12823a) obj).f441722a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f441722a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("BedClicked(bedId="), this.f441722a, ')');
        }
    }

    /* compiled from: SleepingPlacesAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwf0/a$b;", "Lwf0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wf0.a$b */
    public static final /* data */ class b implements InterfaceC49616a {

        /* renamed from: a, reason: collision with root package name */
        public final int f441723a;

        public b(int i12) {
            this.f441723a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f441723a == ((b) obj).f441723a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f441723a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChooseButtonClicked(bedId="), this.f441723a, ')');
        }
    }
}

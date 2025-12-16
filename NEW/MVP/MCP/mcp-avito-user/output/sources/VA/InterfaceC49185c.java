package vA;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerImageEditOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LvA/c;", "", "a", "b", "c", "LvA/c$a;", "LvA/c$b;", "LvA/c$c;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vA.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49185c {

    /* compiled from: BannerImageEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/c$a;", "LvA/c;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.c$a */
    public static final class a implements InterfaceC49185c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440502a = new a();

        @k
        public final String toString() {
            return "LeaveScreen - one time";
        }
    }

    /* compiled from: BannerImageEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/c$b;", "LvA/c;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.c$b */
    public static final /* data */ class b implements InterfaceC49185c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440503a;

        public b(@k String str) {
            this.f440503a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440503a, ((b) obj).f440503a);
        }

        public final int hashCode() {
            return this.f440503a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LeaveScreenWithSuccess(operationId="), this.f440503a, ')');
        }
    }

    /* compiled from: BannerImageEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/c$c;", "LvA/c;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.c$c, reason: collision with other inner class name */
    public static final class C12747c implements InterfaceC49185c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12747c f440504a = new C12747c();

        @k
        public final String toString() {
            return "ShowToastBar - one time";
        }
    }
}

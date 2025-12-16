package Cw;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LCw/d;", "", "a", "b", "c", "d", "LCw/d$a;", "LCw/d$b;", "LCw/d$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d {

    /* compiled from: DealRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/d$a;", "LCw/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C0137d f2787a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f2788b;

        public a(@k C0137d c0137d, @k ArrayList arrayList) {
            this.f2787a = c0137d;
            this.f2788b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2787a.equals(aVar.f2787a) && this.f2788b.equals(aVar.f2788b);
        }

        public final int hashCode() {
            return this.f2788b.hashCode() + (this.f2787a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(toolbar=");
            sb2.append(this.f2787a);
            sb2.append(", items=");
            return e.p(sb2, this.f2788b, ')');
        }
    }

    /* compiled from: DealRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/d$b;", "LCw/d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f2789a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 687912624;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: DealRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/d$c;", "LCw/d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f2790a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 962058552;
        }

        @k
        public final String toString() {
            return "LoadingError";
        }
    }

    /* compiled from: DealRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/d$d;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0137d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f2791a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f2792b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f2793c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f2794d;

        public C0137d(@l Image image, @k String str, @l String str2, @l String str3) {
            this.f2791a = image;
            this.f2792b = str;
            this.f2793c = str2;
            this.f2794d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0137d)) {
                return false;
            }
            C0137d c0137d = (C0137d) obj;
            return L.f(this.f2791a, c0137d.f2791a) && L.f(this.f2792b, c0137d.f2792b) && L.f(this.f2793c, c0137d.f2793c) && L.f(this.f2794d, c0137d.f2794d);
        }

        public final int hashCode() {
            Image image = this.f2791a;
            int iD2 = H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f2792b);
            String str = this.f2793c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2794d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToolbarViewState(avatar=");
            sb2.append(this.f2791a);
            sb2.append(", clientName=");
            sb2.append(this.f2792b);
            sb2.append(", phone=");
            sb2.append(this.f2793c);
            sb2.append(", email=");
            return C22026a.c(sb2, this.f2794d, ')');
        }
    }
}

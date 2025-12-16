package e80;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Le80/b;", "", "a", "b", "Le80/b$a;", "Le80/b$b;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e80.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC39965b {

    /* compiled from: PhotoItemGroupSelectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le80/b$a;", "Le80/b;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e80.b$a */
    public static final /* data */ class a implements InterfaceC39965b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394976a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1096875141;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: PhotoItemGroupSelectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le80/b$b;", "Le80/b;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e80.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11055b implements InterfaceC39965b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394977a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f394978b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f394979c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f394980d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f394981e;

        public C11055b(@k String str, @k String str2, boolean z12, @l String str3, @k String str4) {
            this.f394977a = str;
            this.f394978b = str2;
            this.f394979c = z12;
            this.f394980d = str3;
            this.f394981e = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11055b)) {
                return false;
            }
            C11055b c11055b = (C11055b) obj;
            return L.f(this.f394977a, c11055b.f394977a) && L.f(this.f394978b, c11055b.f394978b) && this.f394979c == c11055b.f394979c && L.f(this.f394980d, c11055b.f394980d) && L.f(this.f394981e, c11055b.f394981e);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(this.f394977a.hashCode() * 31, 31, this.f394978b), 31, this.f394979c);
            String str = this.f394980d;
            return this.f394981e.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GroupSelected(imageId=");
            sb2.append(this.f394977a);
            sb2.append(", groupId=");
            sb2.append(this.f394978b);
            sb2.append(", imageLoaded=");
            sb2.append(this.f394979c);
            sb2.append(", groupTitle=");
            sb2.append(this.f394980d);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f394981e, ')');
        }
    }
}

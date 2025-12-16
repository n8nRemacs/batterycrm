package e80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Le80/a;", "", "a", "b", "Le80/a$a;", "Le80/a$b;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC39964a {

    /* compiled from: PhotoItemGroupSelectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le80/a$a;", "Le80/a;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e80.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11054a implements InterfaceC39964a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394974a;

        public C11054a(@k String str) {
            this.f394974a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11054a) && L.f(this.f394974a, ((C11054a) obj).f394974a);
        }

        public final int hashCode() {
            return this.f394974a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ImageGroupClicked(groupId="), this.f394974a, ')');
        }
    }

    /* compiled from: PhotoItemGroupSelectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le80/a$b;", "Le80/a;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e80.a$b */
    public static final /* data */ class b implements InterfaceC39964a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f394975a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1798010124;
        }

        @k
        public final String toString() {
            return "MainButtonClicked";
        }
    }
}

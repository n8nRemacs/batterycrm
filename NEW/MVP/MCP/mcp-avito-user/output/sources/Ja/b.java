package JA;

import JA.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionImageOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LJA/b;", "", "a", "b", "c", "d", "e", "LJA/b$a;", "LJA/b$b;", "LJA/b$c;", "LJA/b$d;", "LJA/b$e;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ExtendedProfileSetSelectionImageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJA/b$a;", "LJA/b;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f8830a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2075402842;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJA/b$b;", "LJA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: JA.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0514b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ExtendedProfileImageEditConfig f8831a;

        public C0514b(@k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
            this.f8831a = extendedProfileImageEditConfig;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0514b) && L.f(this.f8831a, ((C0514b) obj).f8831a);
        }

        public final int hashCode() {
            return this.f8831a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenImageEditor(config=" + this.f8831a + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJA/b$c;", "LJA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8832a;

        public c(@k String str) {
            this.f8832a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f8832a, ((c) obj).f8832a);
        }

        public final int hashCode() {
            return this.f8832a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPhotoPicker(operationId="), this.f8832a, ')');
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJA/b$d;", "LJA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f8833a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a.b f8834b;

        public d(@k Throwable th2, @l a.b bVar) {
            this.f8833a = th2;
            this.f8834b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f8833a, dVar.f8833a) && L.f(this.f8834b, dVar.f8834b);
        }

        public final int hashCode() {
            return (this.f8833a.hashCode() * 31) + (this.f8834b == null ? 0 : -1096693645);
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f8833a + ", action=" + this.f8834b + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJA/b$e;", "LJA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8835a;

        public e(@k String str) {
            this.f8835a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f8835a, ((e) obj).f8835a);
        }

        public final int hashCode() {
            return this.f8835a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToastBar(message="), this.f8835a, ')');
        }
    }
}

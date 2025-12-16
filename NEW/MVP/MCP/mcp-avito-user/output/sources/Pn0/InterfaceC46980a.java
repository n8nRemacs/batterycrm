package pN0;

import Y61.k;
import Y61.l;
import com.avito.android.video_requirements.view.VideoRequirementsOpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoRequirementsAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LpN0/a;", "", "a", "LpN0/a$a;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC46980a {

    /* compiled from: VideoRequirementsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpN0/a$a;", "LpN0/a;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pN0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12269a implements InterfaceC46980a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VideoRequirementsOpenParams f428508a;

        public C12269a(@k VideoRequirementsOpenParams videoRequirementsOpenParams) {
            this.f428508a = videoRequirementsOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12269a) && L.f(this.f428508a, ((C12269a) obj).f428508a);
        }

        public final int hashCode() {
            return this.f428508a.hashCode();
        }

        @k
        public final String toString() {
            return "ScreenOpened(params=" + this.f428508a + ')';
        }
    }
}

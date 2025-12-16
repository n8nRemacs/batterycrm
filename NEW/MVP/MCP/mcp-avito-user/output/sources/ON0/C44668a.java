package oN0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoRequirements.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LoN0/a;", "", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C44668a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C12184a f419740a;

    /* compiled from: VideoRequirements.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LoN0/a$a;", "", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oN0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12184a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f419741a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f419742b;

        /* compiled from: VideoRequirements.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoN0/a$a$a;", "", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oN0.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12185a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f419743a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f419744b;

            public C12185a(@l String str, @l String str2) {
                this.f419743a = str;
                this.f419744b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12185a)) {
                    return false;
                }
                C12185a c12185a = (C12185a) obj;
                return L.f(this.f419743a, c12185a.f419743a) && L.f(this.f419744b, c12185a.f419744b);
            }

            public final int hashCode() {
                String str = this.f419743a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f419744b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RequirementsParameter(title=");
                sb2.append(this.f419743a);
                sb2.append(", description=");
                return C22026a.c(sb2, this.f419744b, ')');
            }
        }

        public C12184a(@l String str, @l ArrayList arrayList) {
            this.f419741a = str;
            this.f419742b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12184a)) {
                return false;
            }
            C12184a c12184a = (C12184a) obj;
            return L.f(this.f419741a, c12184a.f419741a) && this.f419742b.equals(c12184a.f419742b);
        }

        public final int hashCode() {
            String str = this.f419741a;
            return this.f419742b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Requirements(title=");
            sb2.append(this.f419741a);
            sb2.append(", parameters=");
            return e.p(sb2, this.f419742b, ')');
        }
    }

    public C44668a(@l C12184a c12184a) {
        this.f419740a = c12184a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44668a) && L.f(this.f419740a, ((C44668a) obj).f419740a);
    }

    public final int hashCode() {
        C12184a c12184a = this.f419740a;
        if (c12184a == null) {
            return 0;
        }
        return c12184a.hashCode();
    }

    @k
    public final String toString() {
        return "VideoRequirements(requirements=" + this.f419740a + ')';
    }
}

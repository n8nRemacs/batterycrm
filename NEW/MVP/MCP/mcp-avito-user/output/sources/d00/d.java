package d00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.RemoteFile;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UploadingState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ld00/d;", "", "<init>", "()V", "a", "b", "c", "d", "Ld00/d$a;", "Ld00/d$b;", "Ld00/d$c;", "Ld00/d$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class d {

    /* compiled from: UploadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld00/d$a;", "Ld00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ApiError f393609a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f393609a, ((a) obj).f393609a);
        }

        public final int hashCode() {
            ApiError apiError = this.f393609a;
            if (apiError == null) {
                return 0;
            }
            return apiError.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f393609a, ')');
        }

        public a(@l ApiError apiError) {
            super(null);
            this.f393609a = apiError;
        }

        public /* synthetic */ a(ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : apiError);
        }
    }

    /* compiled from: UploadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld00/d$b;", "Ld00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RemoteFile f393610a;

        public b(@k RemoteFile remoteFile) {
            super(null);
            this.f393610a = remoteFile;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f393610a, ((b) obj).f393610a);
        }

        public final int hashCode() {
            return this.f393610a.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(remoteFile=" + this.f393610a + ')';
        }
    }

    /* compiled from: UploadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld00/d$c;", "Ld00/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final float f393611a;

        public c(float f12) {
            super(null);
            this.f393611a = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.f393611a, ((c) obj).f393611a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f393611a);
        }

        @k
        public final String toString() {
            return r.k(')', this.f393611a, new StringBuilder("Loading(progress="));
        }
    }

    /* compiled from: UploadingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld00/d$d;", "Ld00/d;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d00.d$d, reason: collision with other inner class name */
    public static final /* data */ class C11004d extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11004d f393612a = new C11004d();

        public C11004d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11004d);
        }

        public final int hashCode() {
            return -795014986;
        }

        @k
        public final String toString() {
            return "Waiting";
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}

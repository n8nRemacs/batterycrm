package b60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CodeConfirmEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lb60/b;", "", "a", "b", "Lb60/b$a;", "Lb60/b$b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: CodeConfirmEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb60/b$a;", "Lb60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f56911a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f56912b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f56913c;

        public a() {
            this(null, null, null, 7, null);
        }

        public a(String str, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            apiError = (i12 & 2) != 0 ? null : apiError;
            th2 = (i12 & 4) != 0 ? null : th2;
            this.f56911a = str;
            this.f56912b = apiError;
            this.f56913c = th2;
        }
    }

    /* compiled from: CodeConfirmEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb60/b$b;", "Lb60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b60.b$b, reason: collision with other inner class name */
    public static final class C1992b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1992b f56914a = new C1992b();
    }
}

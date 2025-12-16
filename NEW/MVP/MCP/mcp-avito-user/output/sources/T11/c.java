package T11;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DefaultLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT11/c;", "LT11/f;", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f15308a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // T11.f
    @k
    public final f b(@k String str) {
        String str2 = this.f15308a;
        if (str2 != null) {
            str = H.i(':', str2, str);
        }
        return new c(str);
    }

    @Override // T11.f
    @k
    public final f c(@k Object obj) {
        return b(obj.getClass().getSimpleName());
    }

    public c(@l String str) {
        this.f15308a = str;
    }

    public /* synthetic */ c(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }

    @Override // T11.f
    public final void d() {
    }

    @Override // T11.f
    public final void info(@k String str) {
    }

    @Override // T11.f
    public final void a(@k String str, @l Throwable th2) {
    }

    @Override // T11.f
    public final void error(@k String str, @l Throwable th2) {
    }
}

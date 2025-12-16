package Ua1;

import T11.f;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa1/a;", "LUa1/b;", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f16488a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // T11.f
    public final f b(String str) {
        String str2 = this.f16488a;
        if (str2 != null) {
            str = H.i(':', str2, str);
        }
        return new a(str);
    }

    @Override // T11.f
    @k
    public final f c(@k Object obj) {
        return b(obj.getClass().getSimpleName());
    }

    public a(@l String str) {
        this.f16488a = str;
    }

    public /* synthetic */ a(String str, int i12, C42822w c42822w) {
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

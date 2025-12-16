package K11;

import Y61.k;
import com.vk.api.sdk.utils.log.Logger;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: DefaultApiLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK11/a;", "Lcom/vk/api/sdk/utils/log/Logger;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class a implements Logger {

    /* renamed from: a, reason: collision with root package name */
    @k
    public InterfaceC42726C<? extends Logger.LogLevel> f9215a;

    /* compiled from: DefaultApiLogger.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: K11.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0549a {
        static {
            int[] iArr = new int[Logger.LogLevel.values().length];
            iArr[4] = 1;
            iArr[0] = 2;
            iArr[1] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
        }
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public final void a(@k Logger.LogLevel logLevel) {
        if (this.f9215a.getValue().ordinal() > logLevel.ordinal()) {
            return;
        }
        logLevel.ordinal();
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    @k
    public final InterfaceC42726C<Logger.LogLevel> b() {
        return this.f9215a;
    }
}

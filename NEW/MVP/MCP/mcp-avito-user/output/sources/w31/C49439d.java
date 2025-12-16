package w31;

import android.os.Build;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.N;

/* renamed from: w31.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49439d extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f441250l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49439d(h hVar) {
        super(0);
        this.f441250l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        this.f441250l.getClass();
        String[] strArr = Build.SUPPORTED_ABIS;
        return (strArr == null || strArr.length == 0) ? GrsBaseInfo.CountryCodeSource.UNKNOWN : strArr[0];
    }
}

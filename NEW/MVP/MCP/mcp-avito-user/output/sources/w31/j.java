package w31;

import android.os.LocaleList;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class j extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f441260l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(0);
        this.f441260l = kVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        LocaleList locales = this.f441260l.f441261a.getResources().getConfiguration().getLocales();
        return locales.isEmpty() ? GrsBaseInfo.CountryCodeSource.UNKNOWN : locales.get(0).getLanguage();
    }
}

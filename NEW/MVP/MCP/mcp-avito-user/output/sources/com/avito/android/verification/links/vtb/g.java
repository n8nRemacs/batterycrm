package com.avito.android.verification.links.vtb;

import Y61.l;
import android.content.pm.PackageManager;
import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;

/* compiled from: VerificationVTBLinkInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/vtb/g;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f324730a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PackageManager f324731b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f324732c;

    /* compiled from: VerificationVTBLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/verification/links/vtb/g$a;", "", "<init>", "()V", "", "VTB_APP_2_APP_MIN_PACKAGE_VERSION", "J", "", "VTB_APP_PACKAGE_NAME", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k A1 a12, @Y61.k PackageManager packageManager, @Y61.k R0 r02) {
        this.f324730a = a12;
        this.f324731b = packageManager;
        this.f324732c = r02;
    }

    @l
    public final Object a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f324732c.a(), new h(this, linkedHashMap, null), continuationImpl);
    }
}

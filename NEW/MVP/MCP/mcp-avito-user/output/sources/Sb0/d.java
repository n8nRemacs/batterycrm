package sB0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: TariffCpxConfigureLevelsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LsB0/d;", "", "a", "b", "c", "LsB0/d$a;", "LsB0/d$b;", "LsB0/d$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: TariffCpxConfigureLevelsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsB0/d$a;", "LsB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f437518a = new a();
    }

    /* compiled from: TariffCpxConfigureLevelsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/d$b;", "LsB0/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f437519a;

        public b(@l DeepLink deepLink) {
            this.f437519a = deepLink;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/d$c;", "LsB0/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f437520a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f437521b;

        public c(@l DeepLink deepLink, @l Bundle bundle) {
            this.f437520a = deepLink;
            this.f437521b = bundle;
        }
    }
}

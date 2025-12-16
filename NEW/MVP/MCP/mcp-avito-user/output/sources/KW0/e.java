package Kw0;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.silent_update.DownloadUpdateConfig;
import com.avito.android.silent_update_deeplinks.schedule.SilentUpdateScheduleLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SilentUpdateScheduleLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKw0/e;", "LKu/a;", "Lcom/avito/android/silent_update_deeplinks/schedule/SilentUpdateScheduleLink;", "<init>", "()V", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<SilentUpdateScheduleLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        DownloadUpdateConfig oneTimeDownloadRequest;
        ShortTask.NetworkState networkStateValueOf;
        ShortTask.BackoffPolicy backoffPolicyValueOf;
        Long lZ02;
        Long lZ03;
        ShortTask.NetworkState networkStateValueOf2;
        ShortTask.BackoffPolicy backoffPolicyValueOf2;
        Long lZ04;
        Long lZ05;
        Long lZ06;
        Long lZ07;
        long jLongValue = 30000;
        long jLongValue2 = 1000;
        if (Boolean.parseBoolean(uri.getQueryParameter("isPeriodic"))) {
            String queryParameter = uri.getQueryParameter("repeatIntervalMs");
            long jLongValue3 = (queryParameter == null || (lZ07 = C43066x.z0(queryParameter)) == null) ? 1000L : lZ07.longValue();
            try {
                networkStateValueOf2 = ShortTask.NetworkState.valueOf(uri.getQueryParameter("networkState"));
            } catch (Exception unused) {
                networkStateValueOf2 = ShortTask.NetworkState.f274025d;
            }
            ShortTask.NetworkState networkState = networkStateValueOf2;
            boolean z12 = Boolean.parseBoolean(uri.getQueryParameter("isStorageNotLowRequired"));
            boolean z13 = Boolean.parseBoolean(uri.getQueryParameter("isBatteryNotLowRequired"));
            boolean z14 = Boolean.parseBoolean(uri.getQueryParameter("isChargingRequired"));
            String queryParameter2 = uri.getQueryParameter("flexIntervalMs");
            long jLongValue4 = (queryParameter2 == null || (lZ06 = C43066x.z0(queryParameter2)) == null) ? jLongValue3 : lZ06.longValue();
            String queryParameter3 = uri.getQueryParameter("initialDelayMs");
            if (queryParameter3 != null && (lZ05 = C43066x.z0(queryParameter3)) != null) {
                jLongValue2 = lZ05.longValue();
            }
            long j12 = jLongValue2;
            boolean z15 = Boolean.parseBoolean(uri.getQueryParameter("updateCurrent"));
            try {
                backoffPolicyValueOf2 = ShortTask.BackoffPolicy.valueOf(uri.getQueryParameter("backoffPolicy"));
            } catch (Exception unused2) {
                backoffPolicyValueOf2 = ShortTask.BackoffPolicy.f274019b;
            }
            ShortTask.BackoffPolicy backoffPolicy = backoffPolicyValueOf2;
            String queryParameter4 = uri.getQueryParameter("backoffDelayMs");
            if (queryParameter4 != null && (lZ04 = C43066x.z0(queryParameter4)) != null) {
                jLongValue = lZ04.longValue();
            }
            oneTimeDownloadRequest = new DownloadUpdateConfig.PeriodicDownloadRequest(networkState, z12, z13, z14, false, jLongValue3, jLongValue4, j12, z15, null, backoffPolicy, jLongValue, 512, null);
        } else {
            try {
                networkStateValueOf = ShortTask.NetworkState.valueOf(uri.getQueryParameter("networkState"));
            } catch (Exception unused3) {
                networkStateValueOf = ShortTask.NetworkState.f274025d;
            }
            boolean z16 = Boolean.parseBoolean(uri.getQueryParameter("isStorageNotLowRequired"));
            boolean z17 = Boolean.parseBoolean(uri.getQueryParameter("isBatteryNotLowRequired"));
            boolean z18 = Boolean.parseBoolean(uri.getQueryParameter("isChargingRequired"));
            String queryParameter5 = uri.getQueryParameter("initialDelayMs");
            if (queryParameter5 != null && (lZ03 = C43066x.z0(queryParameter5)) != null) {
                jLongValue2 = lZ03.longValue();
            }
            boolean z19 = Boolean.parseBoolean(uri.getQueryParameter("updateCurrent"));
            try {
                backoffPolicyValueOf = ShortTask.BackoffPolicy.valueOf(uri.getQueryParameter("backoffPolicy"));
            } catch (Exception unused4) {
                backoffPolicyValueOf = ShortTask.BackoffPolicy.f274019b;
            }
            ShortTask.BackoffPolicy backoffPolicy2 = backoffPolicyValueOf;
            String queryParameter6 = uri.getQueryParameter("backoffDelayMs");
            if (queryParameter6 != null && (lZ02 = C43066x.z0(queryParameter6)) != null) {
                jLongValue = lZ02.longValue();
            }
            oneTimeDownloadRequest = new DownloadUpdateConfig.OneTimeDownloadRequest(networkStateValueOf, z16, z17, z18, false, jLongValue2, z19, null, backoffPolicy2, jLongValue, 128, null);
        }
        return new SilentUpdateScheduleLink(oneTimeDownloadRequest, uri.getQueryParameter("sourceScreen"));
    }
}

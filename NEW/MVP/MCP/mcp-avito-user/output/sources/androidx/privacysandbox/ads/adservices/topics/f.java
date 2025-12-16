package androidx.privacysandbox.ads.adservices.topics;

import Y61.k;
import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import j.Y;
import kotlin.Metadata;

/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/f;", "Landroidx/privacysandbox/ads/adservices/topics/g;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@Y
@RestrictTo
/* loaded from: classes.dex */
public final class f extends g {
    @Override // androidx.privacysandbox.ads.adservices.topics.g
    @k
    public final GetTopicsRequest a(@k a aVar) {
        return androidx.privacysandbox.ads.adservices.measurement.b.j().setAdsSdkName(aVar.f53588a).setShouldRecordObservation(aVar.f53589b).build();
    }
}

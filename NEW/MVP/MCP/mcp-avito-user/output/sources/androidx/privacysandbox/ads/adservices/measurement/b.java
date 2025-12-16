package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.net.Uri;
import android.telecom.CallEndpoint;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ DeletionRequest.Builder c() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager e(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ WebSourceParams.Builder f() {
        return new WebSourceParams.Builder(null);
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder i(ArrayList arrayList, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(arrayList, uri);
    }

    public static /* synthetic */ GetTopicsRequest.Builder j() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse n(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic o(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ CallEndpoint q(Object obj) {
        return (CallEndpoint) obj;
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void t() {
    }
}

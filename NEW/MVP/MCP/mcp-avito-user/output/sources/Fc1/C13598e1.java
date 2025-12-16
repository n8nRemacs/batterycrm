package Fc1;

import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.android.volley.VolleyError;
import com.android.volley.w;
import feedback.shared.sdk.api.network.entities.PostScreenshotResponse;
import feedback.shared.sdk.api.network.entities.PostVisitsResponse;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Fc1.e1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C13598e1 implements w.b, w.a, OnGoogleAdIdReadListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.K f5481c;

    public /* synthetic */ C13598e1(io.reactivex.rxjava3.core.K k12, int i12) {
        this.f5480b = i12;
        this.f5481c = k12;
    }

    @Override // com.android.volley.w.a
    public void a(VolleyError volleyError) {
        switch (this.f5480b) {
            case 1:
                io.reactivex.rxjava3.core.K k12 = this.f5481c;
                boolean zI2 = k12.i();
                Boolean boolValueOf = Boolean.valueOf(!zI2);
                if (zI2) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    k12.onError(volleyError.fillInStackTrace());
                    break;
                }
                break;
            default:
                io.reactivex.rxjava3.core.K k13 = this.f5481c;
                boolean zI3 = k13.i();
                Boolean boolValueOf2 = Boolean.valueOf(!zI3);
                if (zI3) {
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    k13.onError(volleyError.fillInStackTrace());
                    break;
                }
                break;
        }
    }

    @Override // com.android.volley.w.b
    public void b(Object obj) {
        switch (this.f5480b) {
            case 0:
                io.reactivex.rxjava3.core.K k12 = this.f5481c;
                boolean zI2 = k12.i();
                Boolean boolValueOf = Boolean.valueOf(!zI2);
                if (zI2) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    k12.onSuccess(new PostScreenshotResponse("ok"));
                    break;
                }
                break;
            default:
                PostVisitsResponse postVisitsResponse = (PostVisitsResponse) obj;
                io.reactivex.rxjava3.core.K k13 = this.f5481c;
                boolean zI3 = k13.i();
                Boolean boolValueOf2 = Boolean.valueOf(!zI3);
                if (zI3) {
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    k13.onSuccess(postVisitsResponse);
                    break;
                }
                break;
        }
    }

    @Override // com.adjust.sdk.OnGoogleAdIdReadListener
    public void onGoogleAdIdRead(String str) {
        io.reactivex.rxjava3.core.K k12 = this.f5481c;
        if (str != null) {
            k12.onSuccess(str);
        } else {
            k12.onError(new Throwable("gaid forbidden"));
        }
    }
}

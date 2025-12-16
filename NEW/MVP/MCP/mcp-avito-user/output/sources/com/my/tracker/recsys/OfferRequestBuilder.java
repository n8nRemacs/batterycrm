package com.my.tracker.recsys;

import android.os.Handler;
import com.my.tracker.obfuscated.C37835i;
import com.my.tracker.recsys.OfferRequest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class OfferRequestBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final String f365906a;

    /* renamed from: e, reason: collision with root package name */
    private OfferRequest.OnCompleteListener f365910e;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f365907b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f365908c = null;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f365909d = null;

    /* renamed from: f, reason: collision with root package name */
    private Handler f365911f = C37835i.f365658a;

    private OfferRequestBuilder(String str) {
        this.f365906a = str;
    }

    public static OfferRequestBuilder newBuilder(String str) {
        return new OfferRequestBuilder(str);
    }

    public OfferRequest build() {
        return new OfferRequest(this.f365906a, this.f365907b, this.f365908c, this.f365909d, this.f365910e, this.f365911f);
    }

    public OfferRequestBuilder withData(String str) {
        this.f365908c = str;
        return this;
    }

    public OfferRequestBuilder withHandler(Handler handler) {
        this.f365911f = handler;
        return this;
    }

    public OfferRequestBuilder withPlacementIds(String... strArr) {
        if (!this.f365907b.isEmpty()) {
            this.f365907b.clear();
        }
        if (strArr == null) {
            return this;
        }
        for (String str : strArr) {
            if (str != null && !this.f365907b.contains(str)) {
                this.f365907b.add(str);
            }
        }
        return this;
    }

    public OfferRequestBuilder withRequestListener(OfferRequest.OnCompleteListener onCompleteListener) {
        this.f365910e = onCompleteListener;
        return this;
    }

    public OfferRequestBuilder withReset(boolean z12) {
        this.f365909d = Boolean.valueOf(z12);
        return this;
    }
}

package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.yandex.mobile.ads.impl.h11;
import j.N;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class NativeAdViewBinder {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final View f392577a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final HashMap f392578b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final h11 f392579c;

    @P
    public TextView getAgeView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("age");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @N
    public Map<String, View> getAssetViews() {
        return this.f392578b;
    }

    @P
    public TextView getBodyView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("body");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public TextView getCallToActionView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("call_to_action");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public TextView getDomainView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("domain");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public ImageView getFaviconView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("favicon");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, obj);
    }

    @P
    public ImageView getFeedbackView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("feedback");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, obj);
    }

    @P
    public ImageView getIconView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("icon");
        h11Var.getClass();
        return (ImageView) h11.a(ImageView.class, obj);
    }

    @P
    public MediaView getMediaView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("media");
        h11Var.getClass();
        return (MediaView) h11.a(MediaView.class, obj);
    }

    @N
    public View getNativeAdView() {
        return this.f392577a;
    }

    @P
    public TextView getPriceView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("price");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public View getRatingView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("rating");
        h11Var.getClass();
        return (View) h11.a(View.class, obj);
    }

    @P
    public TextView getReviewCountView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("review_count");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public TextView getSponsoredView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("sponsored");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public TextView getTitleView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get("title");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    @P
    public TextView getWarningView() {
        h11 h11Var = this.f392579c;
        Object obj = this.f392578b.get(ConstraintKt.WARNING);
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, obj);
    }

    private NativeAdViewBinder(@N Builder builder) {
        this.f392577a = builder.f392580a;
        this.f392578b = builder.f392581b;
        this.f392579c = new h11();
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final View f392580a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final HashMap f392581b;

        @Deprecated
        public Builder(@N View view) {
            this.f392580a = view;
            this.f392581b = new HashMap();
        }

        @N
        public NativeAdViewBinder build() {
            return new NativeAdViewBinder(this);
        }

        @N
        public Builder setAgeView(@P TextView textView) {
            this.f392581b.put("age", textView);
            return this;
        }

        @N
        public Builder setBodyView(@P TextView textView) {
            this.f392581b.put("body", textView);
            return this;
        }

        @N
        public Builder setCallToActionView(@P TextView textView) {
            this.f392581b.put("call_to_action", textView);
            return this;
        }

        @N
        public Builder setDomainView(@P TextView textView) {
            this.f392581b.put("domain", textView);
            return this;
        }

        @N
        public Builder setFaviconView(@P ImageView imageView) {
            this.f392581b.put("favicon", imageView);
            return this;
        }

        @N
        public Builder setFeedbackView(@P ImageView imageView) {
            this.f392581b.put("feedback", imageView);
            return this;
        }

        @N
        public Builder setIconView(@P ImageView imageView) {
            this.f392581b.put("icon", imageView);
            return this;
        }

        @N
        public Builder setMediaView(@P MediaView mediaView) {
            this.f392581b.put("media", mediaView);
            return this;
        }

        @N
        public Builder setPriceView(@P TextView textView) {
            this.f392581b.put("price", textView);
            return this;
        }

        @N
        public <T extends View & Rating> Builder setRatingView(@P T t12) {
            this.f392581b.put("rating", t12);
            return this;
        }

        @N
        public Builder setReviewCountView(@P TextView textView) {
            this.f392581b.put("review_count", textView);
            return this;
        }

        @N
        public Builder setSponsoredView(@P TextView textView) {
            this.f392581b.put("sponsored", textView);
            return this;
        }

        @N
        public Builder setTitleView(@P TextView textView) {
            this.f392581b.put("title", textView);
            return this;
        }

        @N
        public Builder setWarningView(@P TextView textView) {
            this.f392581b.put(ConstraintKt.WARNING, textView);
            return this;
        }

        public Builder(@N NativeAdView nativeAdView) {
            this((View) nativeAdView);
        }
    }
}

package com.facebook.imagepipeline.request;

import I41.h;
import aX0.InterfaceC19835f;
import android.net.Uri;
import com.facebook.common.util.g;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.r;
import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: classes15.dex */
public class ImageRequestBuilder {

    /* renamed from: a, reason: collision with root package name */
    public Uri f340803a = null;

    /* renamed from: b, reason: collision with root package name */
    public ImageRequest.RequestLevel f340804b = ImageRequest.RequestLevel.FULL_FETCH;

    /* renamed from: c, reason: collision with root package name */
    @h
    public UW0.d f340805c = null;

    /* renamed from: d, reason: collision with root package name */
    @h
    public UW0.e f340806d = null;

    /* renamed from: e, reason: collision with root package name */
    public UW0.b f340807e = UW0.b.f16407c;

    /* renamed from: f, reason: collision with root package name */
    public ImageRequest.CacheChoice f340808f = ImageRequest.CacheChoice.f340796c;

    /* renamed from: g, reason: collision with root package name */
    public Priority f340809g;

    /* renamed from: h, reason: collision with root package name */
    @h
    public a f340810h;

    /* renamed from: i, reason: collision with root package name */
    @h
    public InterfaceC19835f f340811i;

    /* renamed from: j, reason: collision with root package name */
    @h
    public UW0.a f340812j;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: ".concat(str));
        }
    }

    public ImageRequestBuilder() {
        r.f340301y.getClass();
        this.f340809g = Priority.f340260c;
        this.f340810h = null;
        this.f340812j = null;
    }

    public static ImageRequestBuilder b(Uri uri) {
        ImageRequestBuilder imageRequestBuilder = new ImageRequestBuilder();
        uri.getClass();
        imageRequestBuilder.f340803a = uri;
        return imageRequestBuilder;
    }

    public final ImageRequest a() {
        Uri uri = this.f340803a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if ("res".equals(g.a(uri))) {
            if (!this.f340803a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f340803a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f340803a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (!"asset".equals(g.a(this.f340803a)) || this.f340803a.isAbsolute()) {
            return new ImageRequest(this);
        }
        throw new BuilderException("Asset URI path must be absolute.");
    }
}

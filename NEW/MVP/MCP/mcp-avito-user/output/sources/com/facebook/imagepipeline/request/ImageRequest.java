package com.facebook.imagepipeline.request;

import I41.h;
import aX0.InterfaceC19835f;
import android.net.Uri;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.facebook.common.internal.i;
import com.facebook.common.internal.n;
import com.facebook.common.util.g;
import com.facebook.imagepipeline.common.Priority;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import vW0.C49274a;
import vW0.C49275b;

@J41.b
/* loaded from: classes15.dex */
public class ImageRequest {

    /* renamed from: o, reason: collision with root package name */
    public static final i<ImageRequest, Uri> f340780o = new a();

    /* renamed from: a, reason: collision with root package name */
    public final CacheChoice f340781a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f340782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340783c;

    /* renamed from: d, reason: collision with root package name */
    @h
    public File f340784d;

    /* renamed from: e, reason: collision with root package name */
    public final UW0.b f340785e;

    /* renamed from: f, reason: collision with root package name */
    @h
    public final UW0.d f340786f;

    /* renamed from: g, reason: collision with root package name */
    public final UW0.e f340787g;

    /* renamed from: h, reason: collision with root package name */
    @h
    public final UW0.a f340788h;

    /* renamed from: i, reason: collision with root package name */
    public final Priority f340789i;

    /* renamed from: j, reason: collision with root package name */
    public final RequestLevel f340790j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f340791k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f340792l;

    /* renamed from: m, reason: collision with root package name */
    @h
    public final com.facebook.imagepipeline.request.a f340793m;

    /* renamed from: n, reason: collision with root package name */
    @h
    public final InterfaceC19835f f340794n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CacheChoice {

        /* renamed from: b, reason: collision with root package name */
        public static final CacheChoice f340795b;

        /* renamed from: c, reason: collision with root package name */
        public static final CacheChoice f340796c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CacheChoice[] f340797d;

        static {
            CacheChoice cacheChoice = new CacheChoice("SMALL", 0);
            f340795b = cacheChoice;
            CacheChoice cacheChoice2 = new CacheChoice("DEFAULT", 1);
            f340796c = cacheChoice2;
            f340797d = new CacheChoice[]{cacheChoice, cacheChoice2};
        }

        public CacheChoice() {
            throw null;
        }

        public static CacheChoice valueOf(String str) {
            return (CacheChoice) Enum.valueOf(CacheChoice.class, str);
        }

        public static CacheChoice[] values() {
            return (CacheChoice[]) f340797d.clone();
        }
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        /* JADX INFO: Fake field, exist only in values array */
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* renamed from: b, reason: collision with root package name */
        public final int f340802b;

        RequestLevel(int i12) {
            this.f340802b = i12;
        }
    }

    public static class a implements i<ImageRequest, Uri> {
        @Override // com.facebook.common.internal.i
        @h
        public final Uri apply(@h Object obj) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (imageRequest != null) {
                return imageRequest.f340782b;
            }
            return null;
        }
    }

    public @interface b {
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.f340781a = imageRequestBuilder.f340808f;
        Uri uri = imageRequestBuilder.f340803a;
        this.f340782b = uri;
        int i12 = -1;
        if (uri != null) {
            if (g.c(uri)) {
                i12 = 0;
            } else if ("file".equals(g.a(uri))) {
                String path = uri.getPath();
                Map<String, String> map = C49274a.f440819a;
                int iLastIndexOf = path.lastIndexOf(46);
                String str = null;
                String strSubstring = (iLastIndexOf < 0 || iLastIndexOf == path.length() - 1) ? null : path.substring(iLastIndexOf + 1);
                if (strSubstring != null) {
                    String lowerCase = strSubstring.toLowerCase(Locale.US);
                    String mimeTypeFromExtension = C49275b.f440822c.get(lowerCase);
                    mimeTypeFromExtension = mimeTypeFromExtension == null ? C49275b.f440820a.getMimeTypeFromExtension(lowerCase) : mimeTypeFromExtension;
                    str = mimeTypeFromExtension == null ? C49274a.f440819a.get(lowerCase) : mimeTypeFromExtension;
                }
                i12 = (str == null || !str.startsWith("video/")) ? 3 : 2;
            } else if ("content".equals(g.a(uri))) {
                i12 = 4;
            } else if ("asset".equals(g.a(uri))) {
                i12 = 5;
            } else if ("res".equals(g.a(uri))) {
                i12 = 6;
            } else if ("data".equals(uri.getScheme())) {
                i12 = 7;
            } else if ("android.resource".equals(uri.getScheme())) {
                i12 = 8;
            }
        }
        this.f340783c = i12;
        this.f340785e = imageRequestBuilder.f340807e;
        this.f340786f = imageRequestBuilder.f340805c;
        UW0.e eVar = imageRequestBuilder.f340806d;
        this.f340787g = eVar == null ? UW0.e.f16416b : eVar;
        this.f340788h = imageRequestBuilder.f340812j;
        this.f340789i = imageRequestBuilder.f340809g;
        this.f340790j = imageRequestBuilder.f340804b;
        this.f340791k = g.c(imageRequestBuilder.f340803a);
        this.f340792l = true;
        this.f340793m = imageRequestBuilder.f340810h;
        this.f340794n = imageRequestBuilder.f340811i;
    }

    public final synchronized File a() {
        try {
            if (this.f340784d == null) {
                this.f340784d = new File(this.f340782b.getPath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340784d;
    }

    public final boolean equals(@h Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        imageRequest.getClass();
        if (this.f340791k == imageRequest.f340791k && this.f340792l == imageRequest.f340792l && n.a(this.f340782b, imageRequest.f340782b) && n.a(this.f340781a, imageRequest.f340781a) && n.a(this.f340784d, imageRequest.f340784d) && n.a(this.f340788h, imageRequest.f340788h) && n.a(this.f340785e, imageRequest.f340785e) && n.a(this.f340786f, imageRequest.f340786f) && n.a(this.f340789i, imageRequest.f340789i) && n.a(this.f340790j, imageRequest.f340790j) && n.a(0, 0)) {
            if (n.a(null, null) && n.a(null, null) && n.a(this.f340787g, imageRequest.f340787g)) {
                com.facebook.imagepipeline.request.a aVar = this.f340793m;
                com.facebook.cache.common.c cVarA = aVar != null ? aVar.a() : null;
                com.facebook.imagepipeline.request.a aVar2 = imageRequest.f340793m;
                return n.a(cVarA, aVar2 != null ? aVar2.a() : null);
            }
        }
        return false;
    }

    public final int hashCode() {
        com.facebook.imagepipeline.request.a aVar = this.f340793m;
        com.facebook.cache.common.c cVarA = aVar != null ? aVar.a() : null;
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{this.f340781a, this.f340782b, bool, this.f340788h, this.f340789i, this.f340790j, 0, Boolean.valueOf(this.f340791k), Boolean.valueOf(this.f340792l), this.f340785e, null, this.f340786f, this.f340787g, cVarA, null, 0, bool});
    }

    public final String toString() {
        n.b bVarB = n.b(this);
        bVarB.b(this.f340782b, TooltipAttribute.PARAM_DEEP_LINK);
        bVarB.b(this.f340781a, "cacheChoice");
        bVarB.b(this.f340785e, "decodeOptions");
        bVarB.b(this.f340793m, "postprocessor");
        bVarB.b(this.f340789i, "priority");
        bVarB.b(this.f340786f, "resizeOptions");
        bVarB.b(this.f340787g, "rotationOptions");
        bVarB.b(this.f340788h, "bytesRange");
        bVarB.b(null, "resizingAllowedOverride");
        bVarB.a("progressiveRenderingEnabled", false);
        bVarB.a("localThumbnailPreviewsEnabled", false);
        bVarB.a("loadThumbnailOnly", false);
        bVarB.b(this.f340790j, "lowestPermittedRequestLevel");
        bVarB.b(String.valueOf(0), "cachesDisabled");
        bVarB.a("isDiskCacheEnabled", this.f340791k);
        bVarB.a("isMemoryCacheEnabled", this.f340792l);
        bVarB.b(null, "decodePrefetches");
        bVarB.b(String.valueOf(0), "delayMs");
        return bVarB.toString();
    }
}

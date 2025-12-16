package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import java.io.FileNotFoundException;
import java.util.List;

/* compiled from: ResourceRequestHandler.java */
/* loaded from: classes7.dex */
class D extends C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f366330a;

    public D(Context context) {
        this.f366330a = context;
    }

    @Override // com.squareup.picasso.C
    public final boolean b(A a12) {
        if (a12.f366290b != 0) {
            return true;
        }
        return "android.resource".equals(a12.f366289a.getScheme());
    }

    @Override // com.squareup.picasso.C
    public final C.a e(A a12, int i12) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        Resources resources;
        int identifier;
        StringBuilder sb2 = K.f366360a;
        int i13 = a12.f366290b;
        Context context = this.f366330a;
        Uri uri = a12.f366289a;
        if (i13 != 0 || uri == null) {
            resources = context.getResources();
        } else {
            String authority = uri.getAuthority();
            if (authority == null) {
                throw new FileNotFoundException(androidx.appcompat.app.r.n(uri, "No package provided: "));
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException(androidx.appcompat.app.r.n(uri, "Unable to obtain resources for package: "));
            }
        }
        int i14 = a12.f366290b;
        if (i14 == 0 && uri != null) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                throw new FileNotFoundException(androidx.appcompat.app.r.n(uri, "No package provided: "));
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException(androidx.appcompat.app.r.n(uri, "No path segments: "));
            }
            if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    throw new FileNotFoundException(androidx.appcompat.app.r.n(uri, "Last path segment is not a resource ID: "));
                }
            } else {
                if (pathSegments.size() != 2) {
                    throw new FileNotFoundException(androidx.appcompat.app.r.n(uri, "More than two path segments: "));
                }
                identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
            i14 = identifier;
        }
        BitmapFactory.Options optionsC = C.c(a12);
        if (optionsC != null && optionsC.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i14, optionsC);
            C.a(a12.f366293e, a12.f366294f, optionsC.outWidth, optionsC.outHeight, optionsC, a12);
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i14, optionsC);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        if (bitmapDecodeResource != null) {
            return new C.a(bitmapDecodeResource, null, loadedFrom, 0);
        }
        throw new NullPointerException("bitmap == null");
    }
}

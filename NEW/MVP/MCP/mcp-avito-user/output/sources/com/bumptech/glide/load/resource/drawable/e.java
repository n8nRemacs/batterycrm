package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.app.r;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import j.N;
import j.P;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes5.dex */
public class e implements l<Uri, Drawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f339423a;

    public e(Context context) {
        this.f339423a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.l
    public final boolean a(@N Uri uri, @N k kVar) {
        return uri.getScheme().equals("android.resource");
    }

    @Override // com.bumptech.glide.load.l
    @P
    public final /* bridge */ /* synthetic */ w<Drawable> b(@N Uri uri, int i12, int i13, @N k kVar) {
        return c(uri);
    }

    @P
    public final w c(@N Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = this.f339423a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e12) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(r.n(uri, "Failed to obtain context or unrecognized Uri format for: "), e12);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(r.n(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(r.n(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e13) {
                throw new IllegalArgumentException(r.n(uri, "Unrecognized Uri format: "), e13);
            }
        }
        Drawable drawableA = a.a(context, contextCreatePackageContext, identifier, null);
        if (drawableA != null) {
            return new d(drawableA);
        }
        return null;
    }
}

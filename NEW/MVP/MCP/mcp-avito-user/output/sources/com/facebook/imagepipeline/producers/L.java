package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.JfifUtil;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import uW0.C48986a;
import uW0.C48987b;

/* compiled from: LocalContentUriThumbnailFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class L extends M implements C0<YW0.d> {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f340564d = {"_id", "_data"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f340565e = {"_data"};

    /* renamed from: f, reason: collision with root package name */
    public static final Rect f340566f = new Rect(0, 0, 512, 384);

    /* renamed from: g, reason: collision with root package name */
    public static final Rect f340567g = new Rect(0, 0, 96, 96);

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f340568c;

    public L(Executor executor, wW0.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f340568c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.C0
    public final boolean a(@I41.h UW0.d dVar) {
        Rect rect = f340566f;
        return D0.a(rect.width(), rect.height(), dVar);
    }

    @Override // com.facebook.imagepipeline.producers.M
    @I41.h
    public final YW0.d d(ImageRequest imageRequest) {
        UW0.d dVar;
        YW0.d dVarF;
        int autoRotateAngleFromOrientation;
        Uri uri = imageRequest.f340782b;
        if (!com.facebook.common.util.g.b(uri) || (dVar = imageRequest.f340786f) == null) {
            return null;
        }
        Cursor cursorQuery = this.f340568c.query(uri, f340564d, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (dVarF = f(dVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (string != null) {
                try {
                    autoRotateAngleFromOrientation = JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(string).getAttributeInt("Orientation", 1));
                } catch (IOException e12) {
                    C48987b c48987b = C48986a.f440079a;
                    if (c48987b.a(6)) {
                        c48987b.c(6, L.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string), e12);
                    }
                }
            } else {
                autoRotateAngleFromOrientation = 0;
            }
            dVarF.f19500d = autoRotateAngleFromOrientation;
            return dVarF;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    @I41.h
    public final YW0.d f(UW0.d dVar, long j12) {
        int i12;
        Rect rect = f340567g;
        if (D0.a(rect.width(), rect.height(), dVar)) {
            i12 = 3;
        } else {
            Rect rect2 = f340566f;
            i12 = D0.a(rect2.width(), rect2.height(), dVar) ? 1 : 0;
        }
        if (i12 == 0) {
            return null;
        }
        Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f340568c, j12, i12, f340565e);
        if (cursorQueryMiniThumbnail == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst()) {
                String string = cursorQueryMiniThumbnail.getString(cursorQueryMiniThumbnail.getColumnIndex("_data"));
                string.getClass();
                if (new File(string).exists()) {
                    return c((int) new File(string).length(), new FileInputStream(string));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}

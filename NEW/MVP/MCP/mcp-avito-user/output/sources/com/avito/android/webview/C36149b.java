package com.avito.android.webview;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import i.AbstractC41201a;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: GetPictureActivityResultContract.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/webview/b;", "Li/a;", "Ljava/lang/Void;", "", "Landroid/net/Uri;", "<init>", "()V", "_avito_webview_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.webview.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36149b extends AbstractC41201a<Void, List<? extends Uri>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Uri f329536b;

    public static File a(Context context) throws IOException {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        File fileCreateTempFile = File.createTempFile("IMG_" + str + '_', ".jpg", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        return fileCreateTempFile;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, Void r92) {
        File fileA;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/mp4", "video/x-msvideo", "video/x-ms-wmv", "video/quicktime", "video/x-flv"});
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        Intent intentPutExtra = new Intent("android.intent.action.CHOOSER").putExtra("android.intent.extra.INTENT", intent);
        ArrayList arrayList = new ArrayList();
        Uri uriForFile = null;
        try {
            fileA = a(context);
        } catch (IOException unused) {
            fileA = null;
        }
        if (fileA != null) {
            uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", fileA);
        }
        this.f329536b = uriForFile;
        if (uriForFile != null) {
            Intent intentPutExtra2 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", this.f329536b);
            intentPutExtra2.setFlags(3);
            arrayList.add(intentPutExtra2);
            intentPutExtra.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        }
        return intentPutExtra;
    }

    @Override // i.AbstractC41201a
    public final List<? extends Uri> parseResult(int i12, Intent intent) {
        Uri data;
        if (i12 != -1) {
            return C42784z0.f406748b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (intent != null && (data = intent.getData()) != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent != null ? intent.getClipData() : null;
        if (clipData == null && linkedHashSet.isEmpty()) {
            Uri uri = this.f329536b;
            if (uri != null) {
                linkedHashSet.add(uri);
            }
        } else if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i13 = 0; i13 < itemCount; i13++) {
                Uri uri2 = clipData.getItemAt(i13).getUri();
                if (uri2 != null) {
                    linkedHashSet.add(uri2);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }
}

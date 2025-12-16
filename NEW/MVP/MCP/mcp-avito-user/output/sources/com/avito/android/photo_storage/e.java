package com.avito.android.photo_storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.avito.android.photo_storage.SharedPhotosStorage;
import j.l0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LegacySharedPhotosStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_storage/e;", "Lcom/avito/android/photo_storage/SharedPhotosStorage;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements SharedPhotosStorage {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f219951b;

    @Inject
    public e(@Y61.k Context context) {
        this.f219951b = context;
    }

    @Override // com.avito.android.photo_storage.SharedPhotosStorage
    public final boolean a(@Y61.k Uri uri) {
        Cursor cursorQuery = this.f219951b.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        boolean z12 = false;
        if (cursorQuery == null) {
            return false;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_display_name");
            if (cursor2.moveToNext()) {
                if (C43066x.z(cursor2.getString(columnIndexOrThrow), "-shot.jpg", false)) {
                    z12 = true;
                }
            }
            kotlin.io.c.a(cursor, null);
            return z12;
        } finally {
        }
    }

    @Override // com.avito.android.photo_storage.SharedPhotosStorage
    @l0
    public final void b(@Y61.k Uri uri) {
        this.f219951b.getContentResolver().delete(uri, null, null);
    }

    @Override // com.avito.android.photo_storage.SharedPhotosStorage
    @Y61.k
    public final Uri c(@Y61.k Bitmap bitmap, @Y61.k String str, @Y61.l String str2, @Y61.l Map<String, String> map, @Y61.k SharedPhotosStorage.a aVar) throws Throwable {
        File file;
        FileDescriptor fileDescriptor;
        ContentResolver contentResolver = this.f219951b.getContentResolver();
        Uri contentUri = MediaStore.Images.Media.getContentUri("external");
        try {
            File file2 = new File(Environment.getExternalStorageDirectory().toString().concat("/Avito"));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file = new File(file2, str);
        } catch (IOException unused) {
            file = null;
        }
        if (file == null) {
            throw new SharedPhotosStorage.CantSaveToSharedVolumeException();
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(file), "w");
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            try {
                fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
            } finally {
            }
        } else {
            fileDescriptor = null;
        }
        if (fileDescriptor == null) {
            throw new SharedPhotosStorage.CantSaveToSharedVolumeException();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
        try {
            bitmap.compress(aVar.f219944a, aVar.f219945b, fileOutputStream);
            kotlin.io.c.a(fileOutputStream, null);
            kotlin.io.c.a(parcelFileDescriptorOpenFileDescriptor, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("_data", file.getAbsolutePath());
            contentValues.put("mime_type", "image/jpeg");
            Uri uriInsert = contentResolver.insert(contentUri, contentValues);
            if (map != null) {
                N70.e.b(new androidx.exifinterface.media.a(file), map);
            }
            if (uriInsert != null) {
                return uriInsert;
            }
            throw new SharedPhotosStorage.CantSaveToSharedVolumeException();
        } finally {
        }
    }

    @Override // com.avito.android.photo_storage.SharedPhotosStorage
    public final boolean d(@Y61.k Uri uri) {
        Cursor cursorQuery = this.f219951b.getContentResolver().query(uri, new String[]{"_id"}, null, null, null);
        if (cursorQuery == null) {
            return false;
        }
        Cursor cursor = cursorQuery;
        try {
            boolean zMoveToNext = cursor.moveToNext();
            kotlin.io.c.a(cursor, null);
            return zMoveToNext;
        } finally {
        }
    }
}

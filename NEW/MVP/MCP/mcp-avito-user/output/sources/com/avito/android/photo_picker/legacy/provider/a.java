package com.avito.android.photo_picker.legacy.provider;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.db.f;
import com.avito.android.photo_picker.legacy.provider.PhotoContentProvider;
import com.avito.android.util.C;
import com.avito.android.util.C35809h6;
import com.avito.android.util.InterfaceC35827k0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PhotoContentProviderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/provider/a;", "Lcom/avito/android/util/k0;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements InterfaceC35827k0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f219836a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C f219837b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ContentResolver f219838c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UriMatcher f219839d;

    public a(@k f fVar, @k C c12, @k ContentResolver contentResolver) {
        this.f219836a = fVar;
        this.f219837b = c12;
        this.f219838c = contentResolver;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f219839d = uriMatcher;
        PhotoContentProvider.a aVar = PhotoContentProvider.f219834c;
        String f125485e = c12.getF125485e();
        aVar.getClass();
        uriMatcher.addURI(f125485e.concat(".provider.photo"), null, 0);
        uriMatcher.addURI(c12.getF125485e().concat(".provider.photo"), "#", 1);
    }

    @Override // com.avito.android.util.InterfaceC35827k0
    @l
    public final Cursor a(@k Uri uri, @l String[] strArr, @l String str, @l String[] strArr2, @l String str2) {
        this.f219837b.getF125491k().getClass();
        if (g(uri)) {
            return null;
        }
        return this.f219836a.getReadableDatabase().query(tu.b.f439641a, strArr, str, strArr2, str2, null, null);
    }

    @Override // com.avito.android.util.InterfaceC35827k0
    @l
    public final Uri b(@k Uri uri, @l ContentValues contentValues) {
        this.f219837b.getF125491k().getClass();
        if (contentValues == null || g(uri)) {
            return null;
        }
        long jInsertWithOnConflict = this.f219836a.getWritableDatabase().insertWithOnConflict(tu.b.f439641a, null, contentValues, 5);
        if (jInsertWithOnConflict <= 0) {
            return null;
        }
        Uri uriE = C35809h6.e(uri, jInsertWithOnConflict);
        this.f219838c.notifyChange(uriE, null);
        return uriE;
    }

    @Override // com.avito.android.util.InterfaceC35827k0
    public final int c(@k Uri uri, @l ContentValues contentValues, @l String str, @l String[] strArr) {
        this.f219837b.getF125491k().getClass();
        if (contentValues == null || g(uri)) {
            return 0;
        }
        int iUpdate = this.f219836a.getWritableDatabase().update(tu.b.f439641a, contentValues, f(uri, str), strArr);
        if (iUpdate > 0) {
            this.f219838c.notifyChange(uri, null);
        }
        return iUpdate;
    }

    @Override // com.avito.android.util.InterfaceC35827k0
    public final int d(@k Uri uri, @l String str, @l String[] strArr) {
        this.f219837b.getF125491k().getClass();
        if (g(uri)) {
            return 0;
        }
        int iDelete = this.f219836a.getWritableDatabase().delete(tu.b.f439641a, f(uri, str), strArr);
        if (iDelete > 0) {
            this.f219838c.notifyChange(uri, null);
        }
        return iDelete;
    }

    @Override // com.avito.android.util.InterfaceC35827k0
    @l
    public final String e(@k Uri uri) {
        int iMatch = this.f219839d.match(uri);
        if (iMatch == 0) {
            return "vnd.android.cursor.dir/" + tu.b.f439641a;
        }
        if (iMatch != 1) {
            return null;
        }
        return "vnd.android.cursor.item/" + tu.b.f439641a;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final String f(Uri uri, String str) {
        if (this.f219839d.match(uri) != 1) {
            return str;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (str == null || C43066x.K(str)) {
            return H.o(new StringBuilder(), tu.b.f439642b, '=', lastPathSegment);
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(tu.b.f439642b);
        sb2.append('=');
        sb2.append(lastPathSegment);
        sb2.append(") AND (");
        return C22026a.c(sb2, str, ')');
    }

    public final boolean g(Uri uri) {
        int iMatch = this.f219839d.match(uri);
        return (iMatch == 0 || iMatch == 1) ? false : true;
    }
}

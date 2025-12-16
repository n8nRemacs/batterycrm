package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.appcompat.app.r;
import com.yandex.metrica.impl.ob.C38842h2;
import com.yandex.metrica.impl.ob.C39137t3;
import com.yandex.metrica.impl.ob.C39161u3;
import com.yandex.metrica.impl.ob.E0;
import com.yandex.metrica.impl.ob.Xd;
import com.yandex.metrica.impl.ob.Y;
import com.yandex.metrica.impl.ob.Yd;
import com.yandex.metrica.impl.ob.Z;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    public boolean f377514b = false;

    /* renamed from: c, reason: collision with root package name */
    public final UriMatcher f377515c = new UriMatcher(-1);

    @Override // android.content.ContentProvider
    public int delete(@N Uri uri, @P String str, @P String[] strArr) {
        C38842h2.b("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f377514b = true;
    }

    @Override // android.content.ContentProvider
    @P
    public String getType(@N Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @P
    public Uri insert(@N Uri uri, @P ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f377514b) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f377515c.match(uri);
                    if (iMatch == 1) {
                        Z z12 = new Z(new Xd(), new Yd(), new E0(), "preload info");
                        Context context = getContext();
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        if (applicationContext != null) {
                            z12.a(applicationContext, contentValues);
                        }
                    } else if (iMatch != 2) {
                        C38842h2.b("Bad content provider uri: %s", uri);
                    } else {
                        Z z13 = new Z(new C39137t3(), new C39161u3(), new E0(), "clids");
                        Context context2 = getContext();
                        Context applicationContext2 = context2 == null ? null : context2.getApplicationContext();
                        if (applicationContext2 != null) {
                            z13.a(applicationContext2, contentValues);
                        }
                    }
                }
                Y.a();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String strQ = r.q(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        UriMatcher uriMatcher = this.f377515c;
        uriMatcher.addURI(strQ, "preloadinfo", 1);
        uriMatcher.addURI(strQ, "clids", 2);
        Y.a(this);
        return true;
    }

    @Override // android.content.ContentProvider
    @P
    public Cursor query(@N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        C38842h2.b("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@N Uri uri, @P ContentValues contentValues, @P String str, @P String[] strArr) {
        C38842h2.b("Updating is not supported", new Object[0]);
        return -1;
    }
}

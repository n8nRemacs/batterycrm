package leakcanary.internal;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.L;
import leakcanary.C43744b;

/* compiled from: MainProcessAppWatcherInstaller.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/internal/MainProcessAppWatcherInstaller;", "Landroid/content/ContentProvider;", "<init>", "()V", "leakcanary-object-watcher-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class MainProcessAppWatcherInstaller extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@k Uri uri, @l String str, @l String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @l
    public final String getType(@k Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @l
    public final Uri insert(@k Uri uri, @l ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            L.k();
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
        C43744b.a(C43744b.f414040d, (Application) applicationContext);
        return true;
    }

    @Override // android.content.ContentProvider
    @l
    public final Cursor query(@k Uri uri, @l String[] strArr, @l String str, @l String[] strArr2, @l String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@k Uri uri, @l ContentValues contentValues, @l String str, @l String[] strArr) {
        return 0;
    }
}

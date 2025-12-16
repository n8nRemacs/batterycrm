package Z1;

import X41.n;
import Y61.k;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import j.X;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"LZ1/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class c {

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/c$a;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    @RestrictTo
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19817a = 0;

        static {
            new a();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/c$b;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    @RestrictTo
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19818a = 0;

        static {
            new b();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/c$c;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    @RestrictTo
    /* renamed from: Z1.c$c, reason: collision with other inner class name */
    public static final class C1411c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19819a = 0;

        static {
            new C1411c();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/c$d;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    @RestrictTo
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19820a = 0;

        static {
            new d();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/c$e;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    @RestrictTo
    public static final class e {
        static {
            new e();
        }

        @n
        @k
        @RestrictTo
        public static final List<Uri> a(@k Cursor cursor) {
            return cursor.getNotificationUris();
        }

        @n
        @RestrictTo
        public static final void b(@k Cursor cursor, @k ContentResolver contentResolver, @k List<? extends Uri> list) {
            cursor.setNotificationUris(contentResolver, list);
        }
    }
}

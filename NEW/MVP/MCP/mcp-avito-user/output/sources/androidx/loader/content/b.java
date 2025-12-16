package androidx.loader.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.core.os.C22778f;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* compiled from: CursorLoader.java */
/* loaded from: classes.dex */
public class b extends a<Cursor> {

    /* renamed from: k, reason: collision with root package name */
    public Cursor f46960k;

    /* renamed from: l, reason: collision with root package name */
    public C22778f f46961l;

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.b(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f46960k);
    }

    @Override // androidx.loader.content.c
    public final void d() {
        c();
        Cursor cursor = this.f46960k;
        if (cursor != null && !cursor.isClosed()) {
            this.f46960k.close();
        }
        this.f46960k = null;
    }

    @Override // androidx.loader.content.c
    public final void e() {
        Cursor cursor = this.f46960k;
        if (cursor != null) {
            a(cursor);
        }
        boolean z12 = this.f46967f;
        this.f46967f = false;
        this.f46968g |= z12;
        if (z12 || this.f46960k == null) {
            k();
        }
    }

    @Override // androidx.loader.content.c
    public final void f() {
        c();
    }

    @Override // androidx.loader.content.a
    public final void g() {
        synchronized (this) {
            try {
                C22778f c22778f = this.f46961l;
                if (c22778f != null) {
                    c22778f.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a
    public final Cursor i() {
        synchronized (this) {
            if (this.f46958j != null) {
                throw new OperationCanceledException();
            }
            this.f46961l = new C22778f();
        }
        try {
            ContentResolver contentResolver = this.f46963b.getContentResolver();
            C22778f c22778f = this.f46961l;
            try {
                Cursor cursorQuery = contentResolver.query(null, null, null, null, null, c22778f != null ? (CancellationSignal) c22778f.b() : null);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(null);
                    } catch (RuntimeException e12) {
                        cursorQuery.close();
                        throw e12;
                    }
                }
                synchronized (this) {
                    this.f46961l = null;
                }
                return cursorQuery;
            } catch (Exception e13) {
                if (e13 instanceof android.os.OperationCanceledException) {
                    throw new OperationCanceledException();
                }
                throw e13;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f46961l = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a
    public final void j(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void a(Cursor cursor) {
        if (this.f46966e) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f46960k;
        this.f46960k = cursor;
        if (this.f46964c) {
            super.a(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }
}

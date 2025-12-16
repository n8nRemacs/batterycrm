package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.view.View;

/* compiled from: SimpleCursorAdapter.java */
/* loaded from: classes.dex */
public class d extends c {

    /* compiled from: SimpleCursorAdapter.java */
    public interface a {
    }

    /* compiled from: SimpleCursorAdapter.java */
    public interface b {
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public final String a(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.a
    public final void e(View view, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.a
    public final Cursor h(Cursor cursor) {
        if (cursor == null) {
            return super.h(cursor);
        }
        throw null;
    }
}

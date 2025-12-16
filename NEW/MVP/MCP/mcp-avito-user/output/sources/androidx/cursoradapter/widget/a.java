package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.cursoradapter.widget.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo
    public boolean f45339b;

    /* renamed from: c, reason: collision with root package name */
    @RestrictTo
    public boolean f45340c;

    /* renamed from: d, reason: collision with root package name */
    @RestrictTo
    public Cursor f45341d;

    /* renamed from: e, reason: collision with root package name */
    @RestrictTo
    public Context f45342e;

    /* renamed from: f, reason: collision with root package name */
    @RestrictTo
    public int f45343f;

    /* renamed from: g, reason: collision with root package name */
    @RestrictTo
    public C1770a f45344g;

    /* renamed from: h, reason: collision with root package name */
    @RestrictTo
    public DataSetObserver f45345h;

    /* renamed from: i, reason: collision with root package name */
    @RestrictTo
    public androidx.cursoradapter.widget.b f45346i;

    /* compiled from: CursorAdapter.java */
    /* renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    public class C1770a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f45347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1770a(c cVar) {
            super(new Handler());
            this.f45347a = cVar;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z12) {
            Cursor cursor;
            c cVar = this.f45347a;
            if (!cVar.f45340c || (cursor = cVar.f45341d) == null || cursor.isClosed()) {
                return;
            }
            cVar.f45339b = cVar.f45341d.requery();
        }
    }

    /* compiled from: CursorAdapter.java */
    public class b extends DataSetObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f45348a;

        public b(c cVar) {
            this.f45348a = cVar;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            c cVar = this.f45348a;
            cVar.f45339b = true;
            cVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            c cVar = this.f45348a;
            cVar.f45339b = false;
            cVar.notifyDataSetInvalidated();
        }
    }

    public String a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public void b(Cursor cursor) {
        Cursor cursorH = h(cursor);
        if (cursorH != null) {
            cursorH.close();
        }
    }

    public Cursor d(CharSequence charSequence) {
        return this.f45341d;
    }

    public abstract void e(View view, Cursor cursor);

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return g(context, cursor, viewGroup);
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f45339b || (cursor = this.f45341d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i12, View view, ViewGroup viewGroup) {
        if (!this.f45339b) {
            return null;
        }
        this.f45341d.moveToPosition(i12);
        if (view == null) {
            view = f(this.f45342e, this.f45341d, viewGroup);
        }
        e(view, this.f45341d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f45346i == null) {
            androidx.cursoradapter.widget.b bVar = new androidx.cursoradapter.widget.b();
            bVar.f45349a = this;
            this.f45346i = bVar;
        }
        return this.f45346i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i12) {
        Cursor cursor;
        if (!this.f45339b || (cursor = this.f45341d) == null) {
            return null;
        }
        cursor.moveToPosition(i12);
        return this.f45341d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i12) {
        Cursor cursor;
        if (this.f45339b && (cursor = this.f45341d) != null && cursor.moveToPosition(i12)) {
            return this.f45341d.getLong(this.f45343f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i12, View view, ViewGroup viewGroup) {
        if (!this.f45339b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f45341d.moveToPosition(i12)) {
            throw new IllegalStateException(AK.c.g(i12, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = g(this.f45342e, this.f45341d, viewGroup);
        }
        e(view, this.f45341d);
        return view;
    }

    public Cursor h(Cursor cursor) {
        Cursor cursor2 = this.f45341d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C1770a c1770a = this.f45344g;
            if (c1770a != null) {
                cursor2.unregisterContentObserver(c1770a);
            }
            DataSetObserver dataSetObserver = this.f45345h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f45341d = cursor;
        if (cursor != null) {
            C1770a c1770a2 = this.f45344g;
            if (c1770a2 != null) {
                cursor.registerContentObserver(c1770a2);
            }
            DataSetObserver dataSetObserver2 = this.f45345h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f45343f = cursor.getColumnIndexOrThrow("_id");
            this.f45339b = true;
            notifyDataSetChanged();
        } else {
            this.f45343f = -1;
            this.f45339b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}

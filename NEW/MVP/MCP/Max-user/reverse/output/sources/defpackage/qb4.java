package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class qb4 extends BaseAdapter implements Filterable {
    public pb4 X;
    public rb4 Y;
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public ob4 o;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                ob4 ob4Var = this.o;
                if (ob4Var != null) {
                    cursor2.unregisterContentObserver(ob4Var);
                }
                pb4 pb4Var = this.X;
                if (pb4Var != null) {
                    cursor2.unregisterDataSetObserver(pb4Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                ob4 ob4Var2 = this.o;
                if (ob4Var2 != null) {
                    cursor.registerContentObserver(ob4Var2);
                }
                pb4 pb4Var2 = this.X;
                if (pb4Var2 != null) {
                    cursor.registerDataSetObserver(pb4Var2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            eqf eqfVar = (eqf) this;
            view = eqfVar.t0.inflate(eqfVar.s0, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.Y == null) {
            rb4 rb4Var = new rb4();
            rb4Var.a = this;
            this.Y = rb4Var;
        }
        return this.Y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(i)) {
            throw new IllegalStateException(ho7.f(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.c);
        return view;
    }
}

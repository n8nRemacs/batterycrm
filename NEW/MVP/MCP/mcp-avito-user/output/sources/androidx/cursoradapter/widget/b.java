package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public androidx.cursoradapter.widget.a f45349a;

    /* compiled from: CursorFilter.java */
    public interface a {
        String a(Cursor cursor);

        void b(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f45349a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorD = this.f45349a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorD != null) {
            filterResults.count = cursorD.getCount();
            filterResults.values = cursorD;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        androidx.cursoradapter.widget.a aVar = this.f45349a;
        Cursor cursor = aVar.f45341d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        aVar.b((Cursor) obj);
    }
}

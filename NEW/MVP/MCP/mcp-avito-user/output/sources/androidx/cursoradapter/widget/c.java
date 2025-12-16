package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cursoradapter.widget.a;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: j, reason: collision with root package name */
    public final int f45350j;

    /* renamed from: k, reason: collision with root package name */
    public final int f45351k;

    /* renamed from: l, reason: collision with root package name */
    public final LayoutInflater f45352l;

    @Deprecated
    public c(Context context, int i12) {
        this.f45340c = true;
        this.f45341d = null;
        this.f45339b = false;
        this.f45342e = context;
        this.f45343f = -1;
        this.f45344g = new a.C1770a(this);
        this.f45345h = new a.b(this);
        this.f45351k = i12;
        this.f45350j = i12;
        this.f45352l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public final View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f45352l.inflate(this.f45351k, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f45352l.inflate(this.f45350j, viewGroup, false);
    }
}

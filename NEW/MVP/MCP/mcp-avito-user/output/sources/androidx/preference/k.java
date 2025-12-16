package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: PreferenceGroupAdapter.java */
@RestrictTo
/* loaded from: classes.dex */
public class k extends RecyclerView.Adapter<u> implements Preference.b, PreferenceGroup.c {

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f53461c;

    /* compiled from: PreferenceGroupAdapter.java */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f53462a;

        /* renamed from: b, reason: collision with root package name */
        public final int f53463b;

        /* renamed from: c, reason: collision with root package name */
        public final String f53464c;

        public b(@N Preference preference) {
            this.f53464c = preference.getClass().getName();
            this.f53462a = preference.f53361v;
            this.f53463b = preference.f53362w;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f53462a == bVar.f53462a && this.f53463b == bVar.f53463b && TextUtils.equals(this.f53464c, bVar.f53464c);
        }

        public final int hashCode() {
            return this.f53464c.hashCode() + ((((527 + this.f53462a) * 31) + this.f53463b) * 31);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        if (hasStableIds()) {
            return k(i12).a();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        new b(k(i12));
        throw null;
    }

    public final void j(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f53389C);
        }
        if (preferenceGroup.f53389C.size() <= 0) {
            return;
        }
        Preference preferenceM = preferenceGroup.m(0);
        arrayList.add(preferenceM);
        new b(preferenceM);
        throw null;
    }

    @P
    public final Preference k(int i12) {
        if (i12 < 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@N RecyclerView.C c12, int i12) {
        ColorStateList colorStateList;
        u uVar = (u) c12;
        Preference preferenceK = k(i12);
        Drawable background = uVar.itemView.getBackground();
        Drawable drawable = uVar.f53475b;
        if (background != drawable) {
            View view = uVar.itemView;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) uVar.B80(R.id.title);
        if (textView != null && (colorStateList = uVar.f53476c) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceK.f(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    public final RecyclerView.C onCreateViewHolder(@N ViewGroup viewGroup, int i12) {
        throw null;
    }
}

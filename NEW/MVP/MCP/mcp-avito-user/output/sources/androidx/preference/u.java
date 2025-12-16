package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j.D;
import j.N;
import j.P;

/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes.dex */
public class u extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @P
    public final Drawable f53475b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f53476c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<View> f53477d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53479f;

    public u(@N View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f53477d = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.avito.android.R.id.icon_frame, view.findViewById(com.avito.android.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f53475b = view.getBackground();
        if (textView != null) {
            this.f53476c = textView.getTextColors();
        }
    }

    public final View B80(@D int i12) {
        SparseArray<View> sparseArray = this.f53477d;
        View view = sparseArray.get(i12);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i12);
        if (viewFindViewById != null) {
            sparseArray.put(i12, viewFindViewById);
        }
        return viewFindViewById;
    }
}

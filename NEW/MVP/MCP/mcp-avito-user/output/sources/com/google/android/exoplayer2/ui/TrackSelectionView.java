package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f347432b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f347433c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f347434d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckedTextView f347435e;

    /* renamed from: f, reason: collision with root package name */
    public final b f347436f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f347437g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f347438h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347439i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347440j;

    /* renamed from: k, reason: collision with root package name */
    public D f347441k;

    /* renamed from: l, reason: collision with root package name */
    public CheckedTextView[][] f347442l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347443m;

    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f347434d;
            HashMap map = trackSelectionView.f347438h;
            boolean z12 = true;
            if (view == checkedTextView) {
                trackSelectionView.f347443m = true;
                map.clear();
            } else if (view == trackSelectionView.f347435e) {
                trackSelectionView.f347443m = false;
                map.clear();
            } else {
                trackSelectionView.f347443m = false;
                Object tag = view.getTag();
                tag.getClass();
                c cVar = (c) tag;
                t0.a aVar = cVar.f347445a;
                V v12 = aVar.f346711c;
                com.google.android.exoplayer2.trackselection.q qVar = (com.google.android.exoplayer2.trackselection.q) map.get(v12);
                int i12 = cVar.f347446b;
                if (qVar == null) {
                    if (!trackSelectionView.f347440j && map.size() > 0) {
                        map.clear();
                    }
                    map.put(v12, new com.google.android.exoplayer2.trackselection.q(v12, AbstractC37401r1.E(Integer.valueOf(i12))));
                } else {
                    ArrayList arrayList = new ArrayList(qVar.f347280c);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z13 = trackSelectionView.f347439i && aVar.f346712d;
                    if (!z13 && (!trackSelectionView.f347440j || trackSelectionView.f347437g.size() <= 1)) {
                        z12 = false;
                    }
                    if (zIsChecked && z12) {
                        arrayList.remove(Integer.valueOf(i12));
                        if (arrayList.isEmpty()) {
                            map.remove(v12);
                        } else {
                            map.put(v12, new com.google.android.exoplayer2.trackselection.q(v12, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z13) {
                            arrayList.add(Integer.valueOf(i12));
                            map.put(v12, new com.google.android.exoplayer2.trackselection.q(v12, arrayList));
                        } else {
                            map.put(v12, new com.google.android.exoplayer2.trackselection.q(v12, AbstractC37401r1.E(Integer.valueOf(i12))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final t0.a f347445a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347446b;

        public c(t0.a aVar, int i12) {
            this.f347445a = aVar;
            this.f347446b = i12;
        }
    }

    public interface d {
    }

    public TrackSelectionView(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f347432b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f347433c = layoutInflaterFrom;
        b bVar = new b(null);
        this.f347436f = bVar;
        this.f347441k = new j(getResources());
        this.f347437g = new ArrayList();
        this.f347438h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f347434d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.avito.android.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.avito.android.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f347435e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.avito.android.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f347434d.setChecked(this.f347443m);
        boolean z12 = this.f347443m;
        HashMap map = this.f347438h;
        this.f347435e.setChecked(!z12 && map.size() == 0);
        for (int i12 = 0; i12 < this.f347442l.length; i12++) {
            com.google.android.exoplayer2.trackselection.q qVar = (com.google.android.exoplayer2.trackselection.q) map.get(((t0.a) this.f347437g.get(i12)).f346711c);
            int i13 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f347442l[i12];
                if (i13 < checkedTextViewArr.length) {
                    if (qVar != null) {
                        Object tag = checkedTextViewArr[i13].getTag();
                        tag.getClass();
                        this.f347442l[i12][i13].setChecked(qVar.f347280c.contains(Integer.valueOf(((c) tag).f347446b)));
                    } else {
                        checkedTextViewArr[i13].setChecked(false);
                    }
                    i13++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f347437g;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f347435e;
        CheckedTextView checkedTextView2 = this.f347434d;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f347442l = new CheckedTextView[arrayList.size()][];
        boolean z12 = this.f347440j && arrayList.size() > 1;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            t0.a aVar = (t0.a) arrayList.get(i12);
            boolean z13 = this.f347439i && aVar.f346712d;
            CheckedTextView[][] checkedTextViewArr = this.f347442l;
            int i13 = aVar.f346710b;
            checkedTextViewArr[i12] = new CheckedTextView[i13];
            c[] cVarArr = new c[i13];
            for (int i14 = 0; i14 < aVar.f346710b; i14++) {
                cVarArr[i14] = new c(aVar, i14);
            }
            for (int i15 = 0; i15 < i13; i15++) {
                LayoutInflater layoutInflater = this.f347433c;
                if (i15 == 0) {
                    addView(layoutInflater.inflate(com.avito.android.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z13 || z12) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f347432b);
                D d12 = this.f347441k;
                c cVar = cVarArr[i15];
                checkedTextView3.setText(d12.a(cVar.f347445a.a(cVar.f347446b)));
                checkedTextView3.setTag(cVarArr[i15]);
                if (aVar.f346713e[i15] != 4) {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                } else {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f347436f);
                }
                this.f347442l[i12][i15] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f347443m;
    }

    public Map<V, com.google.android.exoplayer2.trackselection.q> getOverrides() {
        return this.f347438h;
    }

    public void setAllowAdaptiveSelections(boolean z12) {
        if (this.f347439i != z12) {
            this.f347439i = z12;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z12) {
        if (this.f347440j != z12) {
            this.f347440j = z12;
            if (!z12) {
                HashMap map = this.f347438h;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f347437g;
                    HashMap map2 = new HashMap();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        com.google.android.exoplayer2.trackselection.q qVar = (com.google.android.exoplayer2.trackselection.q) map.get(((t0.a) arrayList.get(i12)).f346711c);
                        if (qVar != null && map2.isEmpty()) {
                            map2.put(qVar.f347279b, qVar);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z12) {
        this.f347434d.setVisibility(z12 ? 0 : 8);
    }

    public void setTrackNameProvider(D d12) {
        d12.getClass();
        this.f347441k = d12;
        b();
    }
}

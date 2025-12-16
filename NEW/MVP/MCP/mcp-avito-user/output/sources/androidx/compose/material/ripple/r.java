package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RippleContainer.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/r;", "Landroid/view/ViewGroup;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final int f34129b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f34130c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f34131d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final t f34132e;

    /* renamed from: f, reason: collision with root package name */
    public int f34133f;

    public r(@Y61.k Context context) {
        super(context);
        this.f34129b = 5;
        ArrayList arrayList = new ArrayList();
        this.f34130c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f34131d = arrayList2;
        this.f34132e = new t();
        setClipChildren(false);
        u uVar = new u(context);
        addView(uVar);
        arrayList.add(uVar);
        arrayList2.add(uVar);
        this.f34133f = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Y61.k
    public final u a(@Y61.k s sVar) {
        t tVar = this.f34132e;
        u uVar = (u) tVar.f34134a.get(sVar);
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList = this.f34131d;
        u uVar2 = (u) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = tVar.f34134a;
        LinkedHashMap linkedHashMap2 = tVar.f34135b;
        if (uVar2 == null) {
            int i12 = this.f34133f;
            ArrayList arrayList2 = this.f34130c;
            if (i12 > C42745f0.J(arrayList2)) {
                uVar2 = new u(getContext());
                addView(uVar2);
                arrayList2.add(uVar2);
            } else {
                uVar2 = (u) arrayList2.get(this.f34133f);
                s sVar2 = (s) linkedHashMap2.get(uVar2);
                if (sVar2 != null) {
                    sVar2.H0();
                    u uVar3 = (u) linkedHashMap.get(sVar2);
                    if (uVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    uVar2.c();
                }
            }
            int i13 = this.f34133f;
            if (i13 < this.f34129b - 1) {
                this.f34133f = i13 + 1;
            } else {
                this.f34133f = 0;
            }
        }
        linkedHashMap.put(sVar, uVar2);
        linkedHashMap2.put(uVar2, sVar);
        return uVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}

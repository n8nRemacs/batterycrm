package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.og9;
import defpackage.vf9;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements og9 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // defpackage.og9
    public final void b(vf9 vf9Var) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}

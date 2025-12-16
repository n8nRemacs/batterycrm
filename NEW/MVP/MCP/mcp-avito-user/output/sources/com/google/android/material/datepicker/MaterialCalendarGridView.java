package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C22807v;
import androidx.core.view.C22823h0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.internal.O;
import j.N;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f356451b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f356452c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f356451b = E.g(null);
        if (MaterialDatePicker.d5(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(com.google.android.material.R.id.cancel_button);
            setNextFocusRightId(com.google.android.material.R.id.confirm_button);
        }
        this.f356452c = MaterialDatePicker.d5(com.google.android.material.R.attr.nestedScrollable, getContext());
        C22823h0.C(this, new p());
    }

    @N
    public final u a() {
        return (u) super.getAdapter();
    }

    public final View b(int i12) {
        return getChildAt(i12 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @N
    public final Adapter getAdapter() {
        return (u) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((u) super.getAdapter()).notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(@N Canvas canvas) {
        int iA2;
        int width;
        int iA3;
        int width2;
        int i12;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        u uVar = (u) super.getAdapter();
        DateSelector<?> dateSelector = uVar.f356555c;
        C37054b c37054b = uVar.f356557e;
        int iMax = Math.max(uVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(uVar.d(), getLastVisiblePosition());
        Long item = uVar.getItem(iMax);
        Long item2 = uVar.getItem(iMin);
        Iterator it = dateSelector.z5().iterator();
        while (it.hasNext()) {
            C22807v c22807v = (C22807v) it.next();
            F f12 = c22807v.f44895a;
            if (f12 != 0) {
                S s5 = c22807v.f44896b;
                if (s5 != 0) {
                    Long l12 = (Long) f12;
                    long jLongValue = l12.longValue();
                    Long l13 = (Long) s5;
                    long jLongValue2 = l13.longValue();
                    if (item == null || item2 == null || l12.longValue() > item2.longValue() || l13.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        iMax = iMax;
                        uVar = uVar;
                        it = it;
                    } else {
                        boolean zF2 = O.f(this);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f356451b;
                        Month month = uVar.f356554b;
                        if (jLongValue < jLongValue3) {
                            width = iMax % month.f356494e == 0 ? 0 : !zF2 ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                            iA2 = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iA2 = uVar.a() + (calendar.get(5) - 1);
                            View viewB = materialCalendarGridView.b(iA2);
                            width = (viewB.getWidth() / 2) + viewB.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            width2 = (iMin + 1) % month.f356494e == 0 ? getWidth() : !zF2 ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                            iA3 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iA3 = uVar.a() + (calendar.get(5) - 1);
                            View viewB2 = materialCalendarGridView.b(iA3);
                            width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                        }
                        int itemId = (int) uVar.getItemId(iA2);
                        int itemId2 = (int) uVar.getItemId(iA3);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            u uVar2 = uVar;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View viewB3 = materialCalendarGridView.b(numColumns);
                            int top = viewB3.getTop() + c37054b.f356513a.f356507a.top;
                            Iterator it2 = it;
                            int bottom = viewB3.getBottom() - c37054b.f356513a.f356507a.bottom;
                            if (zF2) {
                                int i13 = iA3 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iA2 ? getWidth() : width;
                                i12 = i13;
                                width3 = width4;
                            } else {
                                i12 = numColumns > iA2 ? 0 : width;
                                width3 = iA3 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i12, top, width3, bottom, c37054b.f356520h);
                            itemId++;
                            materialCalendarGridView = this;
                            iMax = iMax;
                            uVar = uVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z12, int i12, Rect rect) {
        if (!z12) {
            super.onFocusChanged(false, i12, rect);
            return;
        }
        if (i12 == 33) {
            setSelection(((u) super.getAdapter()).d());
        } else if (i12 == 130) {
            setSelection(((u) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i12, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, KeyEvent keyEvent) {
        if (!super.onKeyDown(i12, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((u) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i12) {
            return false;
        }
        setSelection(((u) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i12, int i13) {
        if (!this.f356452c) {
            super.onMeasure(i12, i13);
            return;
        }
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(16777215, BeduinInputModel.MIN_TEXT_VERSION));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i12) {
        if (i12 < ((u) super.getAdapter()).a()) {
            super.setSelection(((u) super.getAdapter()).a());
        } else {
            super.setSelection(i12);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @N
    public final ListAdapter getAdapter() {
        return (u) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof u)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), u.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}

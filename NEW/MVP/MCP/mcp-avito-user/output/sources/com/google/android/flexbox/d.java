package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes6.dex */
interface d {
    boolean B();

    void d(View view, int i12);

    int e(View view);

    int g(View view, int i12, int i13);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<f> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void m(f fVar);

    void p(View view, int i12, int i13, f fVar);

    View q(int i12);

    int s(int i12, int i13, int i14);

    void setFlexLines(List<f> list);

    View u(int i12);

    int x(int i12, int i13, int i14);
}

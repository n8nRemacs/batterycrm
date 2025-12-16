package com.avito.android.publish.price_list.items.selectable;

import android.view.MotionEvent;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectablePriceListItemRe23View.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/a;", "Landroid/view/View$OnTouchListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItem f238664b;

    public a(@Y61.k ListItem listItem) {
        this.f238664b = listItem;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@Y61.k View view, @Y61.k MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        ListItem listItem = this.f238664b;
        listItem.getLocationOnScreen(iArr2);
        int i12 = iArr[0] - iArr2[0];
        int i13 = iArr[1] - iArr2[1];
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(motionEvent.getX() + i12, motionEvent.getY() + i13);
        if (motionEvent.getAction() == 1) {
            listItem.performClick();
        }
        listItem.onTouchEvent(motionEventObtain);
        return false;
    }
}

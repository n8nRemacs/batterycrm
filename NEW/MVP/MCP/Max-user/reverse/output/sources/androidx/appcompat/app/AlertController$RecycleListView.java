package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.o6d;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o6d.RecycleListView);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o6d.RecycleListView_paddingBottomNoButtons, -1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o6d.RecycleListView_paddingTopNoTitle, -1);
    }
}

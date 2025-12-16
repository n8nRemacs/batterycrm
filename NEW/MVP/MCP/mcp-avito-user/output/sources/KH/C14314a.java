package Kh;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.bar_chart.BarChartTextSettings;
import com.avito.android.beduin.common.component.bar_chart.BarChartVerticalAxis;
import com.avito.android.beduin.common.component.bar_chart.BeduinBarChartModel;
import com.avito.android.beduin.common.component.bar_chart.VerticalAxisPosition;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BarChartSpacingDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14314a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinBarChartModel f9594b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9595c = y6.b(8);

    /* renamed from: d, reason: collision with root package name */
    public final int f9596d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9597e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TextView f9598f;

    /* compiled from: BarChartSpacingDecoration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Kh.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0592a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9599a;

        static {
            int[] iArr = new int[VerticalAxisPosition.values().length];
            try {
                iArr[VerticalAxisPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalAxisPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9599a = iArr;
        }
    }

    public C14314a(@k BeduinBarChartModel beduinBarChartModel) {
        this.f9594b = beduinBarChartModel;
        BeduinHorizontalIndent padding = beduinBarChartModel.getPadding();
        this.f9596d = y6.b(padding != null ? padding.getLeftIndent() : 0);
        BeduinHorizontalIndent padding2 = beduinBarChartModel.getPadding();
        this.f9597e = y6.b(padding2 != null ? padding2.getRightIndent() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        String str;
        int measuredWidth;
        int measuredWidth2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            BeduinBarChartModel beduinBarChartModel = this.f9594b;
            BarChartVerticalAxis verticalAxis = beduinBarChartModel.getVerticalAxis();
            int iB2 = y6.b(beduinBarChartModel.getSpacingBetweenItems());
            List<String> items = beduinBarChartModel.getVerticalAxis().getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int length = ((String) next).length();
                    do {
                        Object next2 = it.next();
                        int length2 = ((String) next2).length();
                        if (length < length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
                str = (String) next;
            } else {
                str = null;
            }
            BarChartTextSettings textSettings = beduinBarChartModel.getVerticalAxis().getTextSettings();
            TextView textViewA = this.f9598f;
            if (textViewA == null) {
                textViewA = e.a(recyclerView, str, textSettings);
                this.f9598f = textViewA;
            }
            int i12 = C0592a.f9599a[verticalAxis.getPosition().ordinal()];
            int i13 = this.f9597e;
            int i14 = this.f9596d;
            int i15 = this.f9595c;
            if (i12 == 1) {
                measuredWidth = textViewA.getMeasuredWidth() + i14 + i15;
                measuredWidth2 = i15 + i13;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                measuredWidth = i14 + i15;
                measuredWidth2 = textViewA.getMeasuredWidth() + i15 + i13;
            }
            int iU2 = RecyclerView.U(view);
            if (iU2 == 0) {
                rect.left = measuredWidth;
                rect.right = iB2 / 2;
            } else if (iU2 == itemCount - 1) {
                rect.right = measuredWidth2;
                rect.left = iB2 / 2;
            } else {
                int i16 = iB2 / 2;
                rect.left = i16;
                rect.right = i16;
            }
        }
    }
}

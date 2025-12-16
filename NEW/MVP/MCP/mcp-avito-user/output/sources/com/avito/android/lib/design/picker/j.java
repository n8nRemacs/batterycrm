package com.avito.android.lib.design.picker;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: WheelAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/j;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/lib/design/picker/j$a;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<k<?>> f180038c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f180039d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180040e = true;

    /* compiled from: WheelAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/picker/j$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f180041b;

        public a(@Y61.k FrameLayout frameLayout) {
            super(frameLayout);
            View viewFindViewById = frameLayout.findViewById(R.id.text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f180041b = (TextView) viewFindViewById;
        }
    }

    /* compiled from: WheelAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[WheelGravity.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WheelGravity wheelGravity = WheelGravity.f179987b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WheelGravity wheelGravity2 = WheelGravity.f179987b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k List<? extends k<?>> list, @Y61.k m mVar) {
        this.f180038c = list;
        this.f180039d = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f180040e) {
            return 50000;
        }
        return this.f180038c.size() + 6;
    }

    @SuppressLint({"RtlHardcoded"})
    public final void j(TextView textView) {
        int i12;
        int iOrdinal = this.f180039d.f180050a.ordinal();
        if (iOrdinal == 0) {
            i12 = 19;
        } else if (iOrdinal == 1) {
            i12 = 21;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 17;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = i12;
        textView.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        TextView textView = ((a) c12).f180041b;
        j(textView);
        boolean z12 = this.f180040e;
        List<k<?>> list = this.f180038c;
        textView.setText(z12 ? list.get(i12 % list.size()).f180047b : (i12 < 3 || i12 > list.size() + 2) ? " " : list.get(i12 - 3).f180047b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        a aVar = new a((FrameLayout) C0.b(viewGroup, R.layout.design_picker_wheel_item, viewGroup, false));
        int iOrdinal = this.f180039d.f180050a.ordinal();
        int i13 = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i13 = 3;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 4;
            }
        }
        TextView textView = aVar.f180041b;
        textView.setTextAlignment(i13);
        j(textView);
        return aVar;
    }
}

package com.avito.android.publish.tag;

import Cf0.C13299a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: OneLineTagView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/tag/OneLineTagView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "([I)V", "a", "_avito_publish_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OneLineTagView extends AppCompatTextView {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f245495c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final int[] f245496d = new int[0];

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final int[] f245497e = {R.attr.state_error};

    /* renamed from: b, reason: collision with root package name */
    @l
    public int[] f245498b;

    /* compiled from: OneLineTagView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/tag/OneLineTagView$a;", "", "<init>", "()V", "_avito_publish_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @j
    public OneLineTagView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.widget.TextView, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        int[] iArr = this.f245498b;
        return iArr != null ? View.mergeDrawableStates(super.onCreateDrawableState(i12 + iArr.length), this.f245498b) : super.onCreateDrawableState(i12);
    }

    public final void setState(@k int[] state) {
        this.f245498b = Arrays.copyOf(state, state.length);
        refreshDrawableState();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OneLineTagView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.oneLineTagView : i12;
        i13 = (i14 & 8) != 0 ? R.style.OneLineTagView : i13;
        super(context, attributeSet, i12);
        this.f245498b = new int[0];
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C13299a.f.f2573a, i12, i13);
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, x.a(typedArrayObtainStyledAttributes, getContext(), 6), null, typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0), x.a(typedArrayObtainStyledAttributes, getContext(), 7), typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0), 98));
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

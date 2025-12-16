package com.avito.android.lib.deprecated_design;

import Y61.k;
import Y61.l;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import hw.InterfaceC41179d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckableImageView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0012\u0013\u0014B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/avito/android/lib/deprecated_design/CheckableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "setChecked", "(Z)V", "Lcom/avito/android/lib/deprecated_design/CheckableImageView$b;", "onCheckedChangeListener", "setOnCheckedChangeListener", "(Lcom/avito/android/lib/deprecated_design/CheckableImageView$b;)V", "a", "b", "SavedState", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class CheckableImageView extends AppCompatImageView implements Checkable {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final int[] f177755e;

    /* renamed from: b, reason: collision with root package name */
    public boolean f177756b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f177757c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public b f177758d;

    /* compiled from: CheckableImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/CheckableImageView$SavedState;", "Landroid/view/View$BaseSavedState;", "b", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @X41.f
        @k
        public static final Parcelable.Creator<SavedState> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public boolean f177759b;

        /* compiled from: CheckableImageView.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/lib/deprecated_design/CheckableImageView$SavedState$a", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/lib/deprecated_design/CheckableImageView$SavedState;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        /* compiled from: CheckableImageView.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/CheckableImageView$SavedState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/lib/deprecated_design/CheckableImageView$SavedState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new b(null);
            CREATOR = new a();
        }

        public SavedState(Parcel parcel, C42822w c42822w) {
            super(parcel);
            Object value = parcel.readValue(null);
            Boolean bool = value instanceof Boolean ? (Boolean) value : null;
            this.f177759b = bool != null ? bool.booleanValue() : false;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CompoundButton.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" checked=");
            return r.x(sb2, this.f177759b, '}');
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeValue(Boolean.valueOf(this.f177759b));
        }
    }

    /* compiled from: CheckableImageView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/deprecated_design/CheckableImageView$a;", "", "<init>", "()V", "", "CHECKED_STATE_SET", "[I", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CheckableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/CheckableImageView$b;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a();
    }

    static {
        new a(null);
        f177755e = new int[]{R.attr.state_checked};
    }

    public CheckableImageView(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f177756b;
    }

    @Override // android.widget.ImageView, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 1);
        if (this.f177756b) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f177755e);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@k Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f177759b);
        requestLayout();
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f177759b = this.f177756b;
        return savedState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.f177756b != checked) {
            this.f177756b = checked;
            refreshDrawableState();
            if (this.f177757c) {
                return;
            }
            this.f177757c = true;
            b bVar = this.f177758d;
            if (bVar != null) {
                bVar.a();
            }
            this.f177757c = false;
        }
    }

    public final void setOnCheckedChangeListener(@l b onCheckedChangeListener) {
        this.f177758d = onCheckedChangeListener;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f177756b);
    }
}

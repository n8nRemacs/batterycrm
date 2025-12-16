package com.avito.android.lib.design.list_item;

import Au.C13079a;
import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.avito.android.lib.design.d;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ListItemCompoundButton.kt */
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;", "Lcom/avito/android/lib/design/list_item/BaseListItem;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "([I)V", "", "enabled", "setToggleByClickEnabled", "(Z)V", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "p", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "getOnCheckedChangeListener", "()Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "onCheckedChangeListener", "Landroid/widget/CompoundButton;", "getButtonView", "()Landroid/widget/CompoundButton;", "buttonView", "a", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ListItemCompoundButton extends BaseListItem implements Checkable {

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ArrayList f179544n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f179545o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final C13079a f179546p;

    /* compiled from: ListItemCompoundButton.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$SavedState;", "Landroid/view/AbsSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Parcelable f179547b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Parcelable f179548c;

        /* compiled from: ListItemCompoundButton.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@l Parcelable parcelable, @k Parcelable parcelable2) {
            super(parcelable2);
            this.f179547b = parcelable;
            this.f179548c = parcelable2;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f179547b, i12);
            parcel.writeParcelable(this.f179548c, i12);
        }
    }

    /* compiled from: ListItemCompoundButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12);
    }

    public ListItemCompoundButton(@l Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e(@k a aVar) {
        this.f179544n.add(aVar);
        g(this.f179546p);
    }

    public abstract void g(@k C13079a c13079a);

    @l
    public abstract CompoundButton getButtonView();

    @k
    public final a getOnCheckedChangeListener() {
        return this.f179546p;
    }

    public final void i() {
        this.f179544n.clear();
    }

    public final void j(@k a aVar) {
        this.f179544n.remove(aVar);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        CompoundButton buttonView = getButtonView();
        if (buttonView != null) {
            buttonView.onRestoreInstanceState(savedState.f179547b);
        }
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        CompoundButton buttonView = getButtonView();
        return new SavedState(buttonView != null ? buttonView.onSaveInstanceState() : null, super.onSaveInstanceState());
    }

    @Override // android.view.View
    public final boolean performClick() {
        CompoundButton buttonView;
        if (this.f179545o && (buttonView = getButtonView()) != null) {
            buttonView.performClick();
        }
        return super.performClick();
    }

    public final void setState(@k int[] state) {
        Arrays.copyOf(state, state.length);
        refreshDrawableState();
    }

    public final void setToggleByClickEnabled(boolean enabled) {
        this.f179545o = enabled;
    }

    public ListItemCompoundButton(@l Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f179544n = new ArrayList();
        this.f179545o = true;
        this.f179546p = new C13079a(this, 3);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178949U, i12, 0);
        this.f179545o = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}

package com.avito.android.beduin.common.component.emotions;

import Fh.C13802a;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EmotionRatingBar.kt */
@s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0006\u0019\u001a\u001b\u001c\u001d\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "selectedPosition", "Lkotlin/G0;", "setItemsSelectedState", "(I)V", "Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$a;", "listener", "setOnChangeListener", "(Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$a;)V", "", "Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$b;", "emotions", "setEmotions", "(Ljava/util/List;)V", "size", "setImageSize", "(Ljava/lang/Integer;)V", "", "selectedId", "setSelectedId", "(Ljava/lang/String;)V", "getSize", "()I", "Alignment", "a", "ContentMode", "b", "c", "State", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmotionRatingBar extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public List<b> f101127b;

    /* renamed from: c, reason: collision with root package name */
    public int f101128c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f101129d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Float f101130e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList<AppCompatImageView> f101131f;

    /* renamed from: g, reason: collision with root package name */
    public int f101132g;

    /* renamed from: h, reason: collision with root package name */
    public int f101133h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public ContentMode f101134i;

    /* renamed from: j, reason: collision with root package name */
    public int f101135j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public Alignment f101136k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EmotionRatingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$Alignment;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        /* renamed from: b, reason: collision with root package name */
        public static final Alignment f101137b;

        /* renamed from: c, reason: collision with root package name */
        public static final Alignment f101138c;

        /* renamed from: d, reason: collision with root package name */
        public static final Alignment f101139d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f101140e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101141f;

        static {
            Alignment alignment = new Alignment("LEFT", 0);
            f101137b = alignment;
            Alignment alignment2 = new Alignment("RIGHT", 1);
            f101138c = alignment2;
            Alignment alignment3 = new Alignment("CENTER", 2);
            f101139d = alignment3;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3};
            f101140e = alignmentArr;
            f101141f = kotlin.enums.c.a(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f101140e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EmotionRatingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$ContentMode;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentMode {

        /* renamed from: b, reason: collision with root package name */
        public static final ContentMode f101142b;

        /* renamed from: c, reason: collision with root package name */
        public static final ContentMode f101143c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ContentMode[] f101144d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101145e;

        static {
            ContentMode contentMode = new ContentMode("FILL_PARENT", 0);
            f101142b = contentMode;
            ContentMode contentMode2 = new ContentMode("FIT_CONTENT", 1);
            f101143c = contentMode2;
            ContentMode[] contentModeArr = {contentMode, contentMode2};
            f101144d = contentModeArr;
            f101145e = kotlin.enums.c.a(contentModeArr);
        }

        public ContentMode() {
            throw null;
        }

        public static ContentMode valueOf(String str) {
            return (ContentMode) Enum.valueOf(ContentMode.class, str);
        }

        public static ContentMode[] values() {
            return (ContentMode[]) f101144d.clone();
        }
    }

    /* compiled from: EmotionRatingBar.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$State;", "Landroid/view/View$BaseSavedState;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f101146b;

        /* renamed from: c, reason: collision with root package name */
        public int f101147c;

        /* compiled from: EmotionRatingBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readParcelable(State.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public /* synthetic */ State(Parcelable parcelable, int i12, int i13, C42822w c42822w) {
            this(parcelable, (i13 & 2) != 0 ? -1 : i12);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f101146b, i12);
            parcel.writeInt(this.f101147c);
        }

        public State(@k Parcelable parcelable, int i12) {
            super(parcelable);
            this.f101146b = parcelable;
            this.f101147c = i12;
        }
    }

    /* compiled from: EmotionRatingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k String str);
    }

    /* compiled from: EmotionRatingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f101148a;

        /* renamed from: b, reason: collision with root package name */
        public final int f101149b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c f101150c;

        public b(String str, int i12, c cVar, int i13, C42822w c42822w) {
            i12 = (i13 & 2) != 0 ? -1 : i12;
            this.f101148a = str;
            this.f101149b = i12;
            this.f101150c = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f101148a, bVar.f101148a) && this.f101149b == bVar.f101149b && L.f(this.f101150c, bVar.f101150c);
        }

        public final int hashCode() {
            return this.f101150c.hashCode() + r.e(this.f101149b, this.f101148a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "Emotion(id=" + this.f101148a + ", intValue=" + this.f101149b + ", icon=" + this.f101150c + ')';
        }
    }

    /* compiled from: EmotionRatingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar$c;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f101151a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final StateListDrawable f101152b;

        public c() {
            this(null, null, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f101151a, cVar.f101151a) && L.f(this.f101152b, cVar.f101152b);
        }

        public final int hashCode() {
            Integer num = this.f101151a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            StateListDrawable stateListDrawable = this.f101152b;
            return iHashCode + (stateListDrawable != null ? stateListDrawable.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "EmotionIcon(drawableAttr=" + this.f101151a + ", drawable=" + this.f101152b + ')';
        }

        public c(Integer num, StateListDrawable stateListDrawable, int i12, C42822w c42822w) {
            num = (i12 & 1) != 0 ? null : num;
            stateListDrawable = (i12 & 2) != 0 ? null : stateListDrawable;
            this.f101151a = num;
            this.f101152b = stateListDrawable;
        }
    }

    /* compiled from: EmotionRatingBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[ContentMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContentMode contentMode = ContentMode.f101142b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Alignment.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Alignment alignment = Alignment.f101137b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Alignment alignment2 = Alignment.f101137b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EmotionRatingBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.emotionRatingBar : i12;
        i13 = (i14 & 8) != 0 ? R.style.EmotionRatingBar : i13;
        super(context, attributeSet, i12);
        this.f101127b = C42784z0.f406748b;
        this.f101128c = -1;
        this.f101131f = new ArrayList<>();
        this.f101134i = ContentMode.f101142b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13802a.i.f5954a, i12, i13);
        this.f101132g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f101133h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f101134i = ContentMode.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        this.f101135j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.f101136k = Alignment.values()[typedArrayObtainStyledAttributes.getInt(0, 0)];
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setItemsSelectedState(int selectedPosition) {
        int i12 = 0;
        for (Object obj : this.f101131f) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
            appCompatImageView.setPressed(false);
            appCompatImageView.setSelected(selectedPosition == i12);
            i12 = i13;
        }
    }

    public final int g(float f12) {
        Iterator<T> it = this.f101131f.iterator();
        int i12 = -1;
        while (it.hasNext()) {
            i12++;
            if (((AppCompatImageView) it.next()).getX() + r2.getWidth() >= f12) {
                break;
            }
        }
        return i12;
    }

    public final int getSize() {
        return this.f101127b.size();
    }

    public final void h() {
        int i12;
        float f12;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(this);
        ArrayList<AppCompatImageView> arrayList = this.f101131f;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator<AppCompatImageView> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(it.next().getId()));
        }
        int[] iArrL0 = C42745f0.L0(arrayList2);
        int iOrdinal = this.f101134i.ordinal();
        if (iOrdinal == 0) {
            i12 = 1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 2;
        }
        dVar.n(i12, null, iArrL0);
        if (this.f101134i == ContentMode.f101143c) {
            int iOrdinal2 = this.f101136k.ordinal();
            if (iOrdinal2 == 0) {
                f12 = 0.0f;
            } else if (iOrdinal2 == 1) {
                f12 = 1.0f;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 0.5f;
            }
            dVar.y(f12, ((AppCompatImageView) C42745f0.E(arrayList)).getId());
            Iterator<AppCompatImageView> it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                AppCompatImageView next = it2.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AppCompatImageView appCompatImageView = next;
                if (i13 > 0) {
                    dVar.z(appCompatImageView.getId(), 1, this.f101135j);
                }
                i13 = i14;
            }
        }
        dVar.c(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof State)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        State state = (State) parcelable;
        super.onRestoreInstanceState(state.getSuperState());
        int i12 = state.f101147c;
        this.f101128c = i12;
        setItemsSelectedState(i12);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState(), 0, 2, null);
        state.f101147c = this.f101128c;
        return state;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        Float f12;
        if (!isEnabled()) {
            return false;
        }
        this.f101130e = Float.valueOf(motionEvent.getX());
        int action = motionEvent.getAction();
        ArrayList<AppCompatImageView> arrayList = this.f101131f;
        if (action == 0) {
            Float f13 = this.f101130e;
            if (f13 != null) {
                int iG2 = g(f13.floatValue());
                Iterator<AppCompatImageView> it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    AppCompatImageView next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    next.setPressed(i12 == iG2);
                    i12 = i13;
                }
            }
        } else if ((action == 1 || action == 3) && (f12 = this.f101130e) != null) {
            int iG3 = g(f12.floatValue());
            if (iG3 >= getSize()) {
                throw new IllegalArgumentException(("Illegal selectedPosition. Maximum selected position = " + (getSize() - 1) + ", selected = " + iG3).toString());
            }
            Iterator<AppCompatImageView> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().setSelected(false);
            }
            if (arrayList.size() > iG3) {
                arrayList.get(iG3).setSelected(true);
            }
            this.f101128c = iG3;
            setItemsSelectedState(iG3);
            b bVar = this.f101127b.get(iG3);
            a aVar = this.f101129d;
            if (aVar != null) {
                aVar.a(bVar.f101148a);
            }
        }
        return true;
    }

    public final void setEmotions(@k List<b> emotions) {
        this.f101127b = emotions;
        removeAllViews();
        ArrayList<AppCompatImageView> arrayList = this.f101131f;
        arrayList.clear();
        int i12 = 0;
        for (Object obj : emotions) {
            int i13 = i12 + 1;
            G0 g02 = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            b bVar = (b) obj;
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(View.generateViewId());
            appCompatImageView.setTag(bVar.f101148a);
            appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(this.f101132g, this.f101133h));
            c cVar = bVar.f101150c;
            if (cVar.f101151a != null) {
                Drawable drawableH = C35835l0.h(cVar.f101151a.intValue(), appCompatImageView.getContext());
                if (drawableH != null) {
                    appCompatImageView.setImageDrawable(drawableH);
                    g02 = G0.f406611a;
                }
            }
            if (g02 == null) {
                appCompatImageView.setImageDrawable(cVar.f101152b);
            }
            appCompatImageView.setSelected(this.f101128c == i12);
            arrayList.add(appCompatImageView);
            addView(appCompatImageView);
            i12 = i13;
        }
        h();
        requestLayout();
        invalidate();
    }

    public final void setImageSize(@l Integer size) {
        if (size == null) {
            return;
        }
        this.f101132g = y6.b(size.intValue());
        this.f101133h = y6.b(size.intValue());
        for (AppCompatImageView appCompatImageView : this.f101131f) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            layoutParams.width = this.f101132g;
            layoutParams.height = this.f101133h;
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    public final void setOnChangeListener(@k a listener) {
        this.f101129d = listener;
    }

    public final void setSelectedId(@l String selectedId) {
        if (selectedId != null) {
            int i12 = 0;
            for (Object obj : this.f101131f) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                boolean zF2 = L.f(appCompatImageView.getTag(), selectedId);
                if (zF2) {
                    this.f101128c = i12;
                }
                appCompatImageView.setPressed(false);
                appCompatImageView.setSelected(zF2);
                i12 = i13;
            }
        }
    }
}

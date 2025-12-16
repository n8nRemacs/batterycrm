package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.o1;
import androidx.preference.Preference;
import androidx.preference.v;
import j.N;
import j.P;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: B, reason: collision with root package name */
    public final o1<String, Long> f53388B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f53389C;

    /* renamed from: D, reason: collision with root package name */
    public final Runnable f53390D;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f53391b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f53391b = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f53391b);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                PreferenceGroup.this.f53388B.clear();
            }
        }
    }

    @RestrictTo
    public interface b {
    }

    public interface c {
    }

    public PreferenceGroup(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f53388B = new o1<>();
        new Handler(Looper.getMainLooper());
        new a();
        this.f53389C = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53489j, i12, 0);
        typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1) && typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)) != Integer.MAX_VALUE) {
            TextUtils.isEmpty(this.f53347h);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void e(boolean z12) {
        super.e(z12);
        int size = this.f53389C.size();
        for (int i12 = 0; i12 < size; i12++) {
            Preference preferenceM = m(i12);
            if (preferenceM.f53353n == z12) {
                preferenceM.f53353n = !z12;
                preferenceM.e(preferenceM.l());
                preferenceM.d();
            }
        }
    }

    @N
    public final Preference m(int i12) {
        return (Preference) this.f53389C.get(i12);
    }

    public PreferenceGroup(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

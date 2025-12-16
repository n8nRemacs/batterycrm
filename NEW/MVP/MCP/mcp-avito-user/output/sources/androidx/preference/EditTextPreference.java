package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.v;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: B, reason: collision with root package name */
    public String f53314B;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final String f53315b;

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
            this.f53315b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeString(this.f53315b);
        }
    }

    public interface a {
    }

    public static final class b implements Preference.f<EditTextPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static b f53316a;

        @Override // androidx.preference.Preference.f
        @P
        public final CharSequence a(@N Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.f53314B) ? editTextPreference.f53341b.getString(R.string.not_set) : editTextPreference.f53314B;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(@N Context context, @P AttributeSet attributeSet) {
        int iA2 = androidx.core.content.res.l.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iA2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53483d, iA2, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (b.f53316a == null) {
                b.f53316a = new b();
            }
            this.f53365z = b.f53316a;
            d();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object i(@N TypedArray typedArray, int i12) {
        return typedArray.getString(i12);
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        return TextUtils.isEmpty(this.f53314B) || super.l();
    }

    public final void m(@P String str) {
        boolean zL2 = l();
        this.f53314B = str;
        boolean zL3 = l();
        if (zL3 != zL2) {
            e(zL3);
        }
        d();
    }
}

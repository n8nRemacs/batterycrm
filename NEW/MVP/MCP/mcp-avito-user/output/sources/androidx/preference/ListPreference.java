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
public class ListPreference extends DialogPreference {

    /* renamed from: B, reason: collision with root package name */
    public final CharSequence[] f53322B;

    /* renamed from: C, reason: collision with root package name */
    public final CharSequence[] f53323C;

    /* renamed from: D, reason: collision with root package name */
    public String f53324D;

    /* renamed from: E, reason: collision with root package name */
    public final String f53325E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f53326F;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final String f53327b;

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
            this.f53327b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeString(this.f53327b);
        }
    }

    public static final class a implements Preference.f<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static a f53328a;

        @Override // androidx.preference.Preference.f
        @P
        public final CharSequence a(@N Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            return TextUtils.isEmpty(listPreference.n()) ? listPreference.f53341b.getString(R.string.not_set) : listPreference.n();
        }
    }

    public ListPreference(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53484e, i12, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f53322B = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f53323C = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (a.f53328a == null) {
                a.f53328a = new a();
            }
            this.f53365z = a.f53328a;
            d();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, v.k.f53486g, i12, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f53325E = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    @P
    public final CharSequence b() {
        Preference.f fVar = this.f53365z;
        if (fVar != null) {
            return fVar.a(this);
        }
        CharSequence charSequenceN = n();
        CharSequence charSequenceB = super.b();
        String str = this.f53325E;
        if (str == null) {
            return charSequenceB;
        }
        if (charSequenceN == null) {
            charSequenceN = "";
        }
        String str2 = String.format(str, charSequenceN);
        return TextUtils.equals(str2, charSequenceB) ? charSequenceB : str2;
    }

    @Override // androidx.preference.Preference
    public final Object i(@N TypedArray typedArray, int i12) {
        return typedArray.getString(i12);
    }

    public final int m(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f53323C) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @P
    public final CharSequence n() {
        CharSequence[] charSequenceArr;
        int iM2 = m(this.f53324D);
        if (iM2 < 0 || (charSequenceArr = this.f53322B) == null) {
            return null;
        }
        return charSequenceArr[iM2];
    }

    public final void o(String str) {
        boolean zEquals = TextUtils.equals(this.f53324D, str);
        if (zEquals && this.f53326F) {
            return;
        }
        this.f53324D = str;
        this.f53326F = true;
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.l.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}

package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import j.N;
import j.P;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: B, reason: collision with root package name */
    public boolean f53421B;

    /* renamed from: C, reason: collision with root package name */
    public String f53422C;

    /* renamed from: D, reason: collision with root package name */
    public String f53423D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f53424E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f53425F;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f53426b;

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
            this.f53426b = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f53426b ? 1 : 0);
        }
    }

    public TwoStatePreference(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void h() {
        m(!this.f53421B);
    }

    @Override // androidx.preference.Preference
    @P
    public final Object i(@N TypedArray typedArray, int i12) {
        return Boolean.valueOf(typedArray.getBoolean(i12, false));
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        return (this.f53425F ? this.f53421B : !this.f53421B) || super.l();
    }

    public final void m(boolean z12) {
        boolean z13 = this.f53421B != z12;
        if (z13 || !this.f53424E) {
            this.f53421B = z12;
            this.f53424E = true;
            if (z13) {
                e(l());
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RestrictTo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f53421B
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r4.f53422C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = r4.f53422C
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f53421B
            if (r0 != 0) goto L2d
            java.lang.String r0 = r4.f53423D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = r4.f53423D
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.b()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.n(android.view.View):void");
    }
}

package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.v;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: B, reason: collision with root package name */
    public int f53396B;

    /* renamed from: C, reason: collision with root package name */
    public final int f53397C;

    /* renamed from: D, reason: collision with root package name */
    public final int f53398D;

    /* renamed from: E, reason: collision with root package name */
    public int f53399E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f53400F;

    /* renamed from: G, reason: collision with root package name */
    public SeekBar f53401G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f53402H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f53403I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f53404J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f53405K;

    /* renamed from: L, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f53406L;

    /* renamed from: M, reason: collision with root package name */
    public final View.OnKeyListener f53407M;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f53408b;

        /* renamed from: c, reason: collision with root package name */
        public final int f53409c;

        /* renamed from: d, reason: collision with root package name */
        public final int f53410d;

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
            this.f53408b = parcel.readInt();
            this.f53409c = parcel.readInt();
            this.f53410d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f53408b);
            parcel.writeInt(this.f53409c);
            parcel.writeInt(this.f53410d);
        }
    }

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i12, boolean z12) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (z12 && (seekBarPreference.f53405K || !seekBarPreference.f53400F)) {
                seekBarPreference.m(seekBar);
                return;
            }
            int i13 = i12 + seekBarPreference.f53397C;
            TextView textView = seekBarPreference.f53402H;
            if (textView != null) {
                textView.setText(String.valueOf(i13));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f53400F = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.f53400F = false;
            if (seekBar.getProgress() + seekBarPreference.f53397C != seekBarPreference.f53396B) {
                seekBarPreference.m(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f53403I && (i12 == 21 || i12 == 22)) || i12 == 23 || i12 == 66 || (seekBar = seekBarPreference.f53401G) == null) {
                return false;
            }
            return seekBar.onKeyDown(i12, keyEvent);
        }
    }

    public SeekBarPreference(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.f53406L = new a();
        this.f53407M = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53491l, R.attr.seekBarPreferenceStyle, 0);
        this.f53397C = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i13 = this.f53397C;
        i12 = i12 < i13 ? i13 : i12;
        if (i12 != this.f53398D) {
            this.f53398D = i12;
            d();
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i14 != this.f53399E) {
            this.f53399E = Math.min(this.f53398D - this.f53397C, Math.abs(i14));
            d();
        }
        this.f53403I = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f53404J = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f53405K = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void f(@N u uVar) {
        super.f(uVar);
        uVar.itemView.setOnKeyListener(this.f53407M);
        this.f53401G = (SeekBar) uVar.B80(R.id.seekbar);
        TextView textView = (TextView) uVar.B80(R.id.seekbar_value);
        this.f53402H = textView;
        if (this.f53404J) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f53402H = null;
        }
        SeekBar seekBar = this.f53401G;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f53406L);
        this.f53401G.setMax(this.f53398D - this.f53397C);
        int i12 = this.f53399E;
        if (i12 != 0) {
            this.f53401G.setKeyProgressIncrement(i12);
        } else {
            this.f53399E = this.f53401G.getKeyProgressIncrement();
        }
        this.f53401G.setProgress(this.f53396B - this.f53397C);
        int i13 = this.f53396B;
        TextView textView2 = this.f53402H;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i13));
        }
        this.f53401G.setEnabled(c());
    }

    @Override // androidx.preference.Preference
    @P
    public final Object i(@N TypedArray typedArray, int i12) {
        return Integer.valueOf(typedArray.getInt(i12, 0));
    }

    public final void m(@N SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f53397C;
        int i12 = this.f53396B;
        if (progress != i12) {
            int i13 = this.f53397C;
            if (progress < i13) {
                progress = i13;
            }
            int i14 = this.f53398D;
            if (progress > i14) {
                progress = i14;
            }
            if (progress != i12) {
                this.f53396B = progress;
                TextView textView = this.f53402H;
                if (textView != null) {
                    textView.setText(String.valueOf(progress));
                }
            }
        }
    }
}

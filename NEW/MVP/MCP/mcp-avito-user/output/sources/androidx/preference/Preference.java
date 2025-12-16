package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.preference.v;
import com.avito.android.R;
import j.N;
import j.P;
import java.util.WeakHashMap;
import m.C43852a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    public final View.OnClickListener f53340A;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Context f53341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53342c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f53343d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f53344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53345f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f53346g;

    /* renamed from: h, reason: collision with root package name */
    public final String f53347h;

    /* renamed from: i, reason: collision with root package name */
    public final String f53348i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f53349j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f53350k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f53351l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f53352m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f53353n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f53354o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f53355p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f53356q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f53357r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f53358s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f53359t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f53360u;

    /* renamed from: v, reason: collision with root package name */
    public final int f53361v;

    /* renamed from: w, reason: collision with root package name */
    public final int f53362w;

    /* renamed from: x, reason: collision with root package name */
    public k f53363x;

    /* renamed from: y, reason: collision with root package name */
    public e f53364y;

    /* renamed from: z, reason: collision with root package name */
    public f f53365z;

    public static class BaseSavedState extends AbsSavedState {

        @N
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public final BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BaseSavedState[] newArray(int i12) {
                return new BaseSavedState[i12];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.j(view);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final Preference f53367b;

        public e(@N Preference preference) {
            this.f53367b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.f53367b;
            CharSequence charSequenceB = preference.b();
            if (!preference.f53359t || TextUtils.isEmpty(charSequenceB)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceB);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.f53367b;
            ClipboardManager clipboardManager = (ClipboardManager) preference.f53341b.getSystemService("clipboard");
            CharSequence charSequenceB = preference.b();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceB));
            Context context = preference.f53341b;
            Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceB), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        @P
        CharSequence a(@N T t12);
    }

    public Preference(@N Context context, @P AttributeSet attributeSet, int i12) {
        this.f53342c = Integer.MAX_VALUE;
        this.f53349j = true;
        this.f53350k = true;
        this.f53352m = true;
        this.f53353n = true;
        this.f53354o = true;
        this.f53355p = true;
        this.f53357r = true;
        this.f53360u = true;
        this.f53361v = R.layout.preference;
        this.f53340A = new a();
        this.f53341b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53486g, i12, 0);
        this.f53345f = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f53347h = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f53343d = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f53344e = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f53342c = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f53348i = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f53361v = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f53362w = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f53349j = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f53350k = z12;
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.getString(19) == null) {
            typedArrayObtainStyledAttributes.getString(10);
        }
        this.f53354o = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z12));
        this.f53355p = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z12));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f53351l = i(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f53351l = i(typedArrayObtainStyledAttributes, 11);
        }
        this.f53360u = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f53356q = zHasValue;
        if (zHasValue) {
            this.f53357r = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f53358s = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f53359t = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void k(@N View view, boolean z12) {
        view.setEnabled(z12);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                k(viewGroup.getChildAt(childCount), z12);
            }
        }
    }

    public long a() {
        return 0L;
    }

    @P
    public CharSequence b() {
        f fVar = this.f53365z;
        return fVar != null ? fVar.a(this) : this.f53344e;
    }

    public boolean c() {
        return this.f53349j && this.f53352m && this.f53353n;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@N Preference preference) {
        Preference preference2 = preference;
        int i12 = this.f53342c;
        int i13 = preference2.f53342c;
        if (i12 != i13) {
            return i12 - i13;
        }
        CharSequence charSequence = this.f53343d;
        CharSequence charSequence2 = preference2.f53343d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f53343d.toString());
    }

    public void d() {
        if (this.f53363x != null) {
            throw null;
        }
    }

    public void f(@N u uVar) {
        Integer numValueOf;
        View view = uVar.itemView;
        view.setOnClickListener(this.f53340A);
        view.setId(0);
        TextView textView = (TextView) uVar.B80(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceB = b();
            if (TextUtils.isEmpty(charSequenceB)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceB);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) uVar.B80(android.R.id.title);
        boolean z12 = this.f53350k;
        if (textView2 != null) {
            CharSequence charSequence = this.f53343d;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f53356q) {
                    textView2.setSingleLine(this.f53357r);
                }
                if (!z12 && c() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) uVar.B80(android.R.id.icon);
        boolean z13 = this.f53358s;
        if (imageView != null) {
            int i12 = this.f53345f;
            if (i12 != 0 || this.f53346g != null) {
                if (this.f53346g == null) {
                    this.f53346g = C43852a.a(this.f53341b, i12);
                }
                Drawable drawable = this.f53346g;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f53346g != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z13 ? 4 : 8);
            }
        }
        View viewB80 = uVar.B80(R.id.icon_frame);
        if (viewB80 == null) {
            viewB80 = uVar.B80(android.R.id.icon_frame);
        }
        if (viewB80 != null) {
            if (this.f53346g != null) {
                viewB80.setVisibility(0);
            } else {
                viewB80.setVisibility(z13 ? 4 : 8);
            }
        }
        if (this.f53360u) {
            k(view, c());
        } else {
            k(view, true);
        }
        view.setFocusable(z12);
        view.setClickable(z12);
        uVar.f53478e = this.f53354o;
        uVar.f53479f = this.f53355p;
        boolean z14 = this.f53359t;
        if (z14 && this.f53364y == null) {
            this.f53364y = new e(this);
        }
        view.setOnCreateContextMenuListener(z14 ? this.f53364y : null);
        view.setLongClickable(z14);
        if (!z14 || z12) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        view.setBackground(null);
    }

    @P
    public Object i(@N TypedArray typedArray, int i12) {
        return null;
    }

    @RestrictTo
    public void j(@N View view) {
        if (c() && this.f53350k) {
            h();
        }
    }

    public boolean l() {
        return !c();
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f53343d;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence charSequenceB = b();
        if (!TextUtils.isEmpty(charSequenceB)) {
            sb2.append(charSequenceB);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public void h() {
    }

    public void e(boolean z12) {
    }

    public Preference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.l.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}

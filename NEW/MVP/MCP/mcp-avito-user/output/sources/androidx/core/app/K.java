package androidx.core.app;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.avito.android.remote.model.text.TooltipAttribute;
import j.X;
import java.util.Objects;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public String f44497a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public IconCompat f44498b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44499c;

    /* compiled from: Person.java */
    @X
    public static class a {
    }

    /* compiled from: Person.java */
    @X
    public static class b {
        public static Person a(K k12) {
            Person.Builder name = new Person.Builder().setName(k12.f44497a);
            IconCompat iconCompat = k12.f44498b;
            return name.setIcon(iconCompat != null ? iconCompat.k(null) : null).setUri(null).setKey(null).setBot(false).setImportant(k12.f44499c).build();
        }
    }

    /* compiled from: Person.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public String f44500a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public IconCompat f44501b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f44502c;

        @j.N
        public final K a() {
            K k12 = new K();
            k12.f44497a = this.f44500a;
            k12.f44498b = this.f44501b;
            k12.f44499c = this.f44502c;
            return k12;
        }
    }

    @j.N
    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f44497a);
        IconCompat iconCompat = this.f44498b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f44738a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f44739b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f44739b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f44739b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f44739b);
                    break;
            }
            bundle.putInt("type", iconCompat.f44738a);
            bundle.putInt("int1", iconCompat.f44742e);
            bundle.putInt("int2", iconCompat.f44743f);
            bundle.putString("string1", iconCompat.f44747j);
            ColorStateList colorStateList = iconCompat.f44744g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f44745h;
            if (mode != IconCompat.f44737k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString(TooltipAttribute.PARAM_DEEP_LINK, null);
        bundle2.putString("key", null);
        bundle2.putBoolean("isBot", false);
        bundle2.putBoolean("isImportant", this.f44499c);
        return bundle2;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        K k12 = (K) obj;
        if (!Objects.equals(Objects.toString(this.f44497a), Objects.toString(k12.f44497a))) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Boolean.valueOf(this.f44499c).equals(Boolean.valueOf(k12.f44499c));
    }

    public final int hashCode() {
        return Objects.hash(this.f44497a, null, Boolean.FALSE, Boolean.valueOf(this.f44499c));
    }
}

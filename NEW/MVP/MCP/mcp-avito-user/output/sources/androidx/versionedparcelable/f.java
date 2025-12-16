package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.C20199a;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
@RestrictTo
/* loaded from: classes10.dex */
class f extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f54955d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f54956e;

    /* renamed from: f, reason: collision with root package name */
    public final int f54957f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54958g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54959h;

    /* renamed from: i, reason: collision with root package name */
    public int f54960i;

    /* renamed from: j, reason: collision with root package name */
    public int f54961j;

    /* renamed from: k, reason: collision with root package name */
    public int f54962k;

    public f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C20199a(), new C20199a(), new C20199a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        int i12 = this.f54960i;
        if (i12 >= 0) {
            int i13 = this.f54955d.get(i12);
            Parcel parcel = this.f54956e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i13);
            parcel.writeInt(iDataPosition - i13);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        Parcel parcel = this.f54956e;
        int iDataPosition = parcel.dataPosition();
        int i12 = this.f54961j;
        if (i12 == this.f54957f) {
            i12 = this.f54958g;
        }
        return new f(parcel, iDataPosition, i12, AK.c.s(new StringBuilder(), this.f54959h, "  "), this.f54952a, this.f54953b, this.f54954c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        return this.f54956e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        Parcel parcel = this.f54956e;
        int i12 = parcel.readInt();
        if (i12 < 0) {
            return null;
        }
        byte[] bArr = new byte[i12];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f54956e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i12) {
        while (this.f54961j < this.f54958g) {
            int i13 = this.f54962k;
            if (i13 == i12) {
                return true;
            }
            if (String.valueOf(i13).compareTo(String.valueOf(i12)) > 0) {
                return false;
            }
            int i14 = this.f54961j;
            Parcel parcel = this.f54956e;
            parcel.setDataPosition(i14);
            int i15 = parcel.readInt();
            this.f54962k = parcel.readInt();
            this.f54961j += i15;
        }
        return this.f54962k == i12;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        return this.f54956e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T m() {
        return (T) this.f54956e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        return this.f54956e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i12) {
        a();
        this.f54960i = i12;
        this.f54955d.put(i12, this.f54956e.dataPosition());
        u(0);
        u(i12);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z12) {
        this.f54956e.writeInt(z12 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        Parcel parcel = this.f54956e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f54956e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i12) {
        this.f54956e.writeInt(i12);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        this.f54956e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        this.f54956e.writeString(str);
    }

    public f(Parcel parcel, int i12, int i13, String str, C20199a<String, Method> c20199a, C20199a<String, Method> c20199a2, C20199a<String, Class> c20199a3) {
        super(c20199a, c20199a2, c20199a3);
        this.f54955d = new SparseIntArray();
        this.f54960i = -1;
        this.f54962k = -1;
        this.f54956e = parcel;
        this.f54957f = i12;
        this.f54958g = i13;
        this.f54961j = i12;
        this.f54959h = str;
    }
}

package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinModelTransform.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/CheckboxGroupTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckboxGroupTransform implements BeduinModelTransform {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f103382b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f103383c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f103379d = new a(null);

    @k
    public static final Parcelable.Creator<CheckboxGroupTransform> CREATOR = new b();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Class<CheckboxGroupTransform> f103380e = CheckboxGroupTransform.class;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f103381f = "checkboxGroup";

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/CheckboxGroupTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15365a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<CheckboxGroupTransform> a() {
            return CheckboxGroupTransform.f103380e;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return CheckboxGroupTransform.f103381f;
        }

        public a() {
        }
    }

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CheckboxGroupTransform> {
        @Override // android.os.Parcelable.Creator
        public final CheckboxGroupTransform createFromParcel(Parcel parcel) {
            return new CheckboxGroupTransform(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckboxGroupTransform[] newArray(int i12) {
            return new CheckboxGroupTransform[i12];
        }
    }

    public CheckboxGroupTransform(@k String str, boolean z12) {
        this.f103382b = str;
        this.f103383c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckboxGroupTransform)) {
            return false;
        }
        CheckboxGroupTransform checkboxGroupTransform = (CheckboxGroupTransform) obj;
        return L.f(this.f103382b, checkboxGroupTransform.f103382b) && this.f103383c == checkboxGroupTransform.f103383c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103383c) + (this.f103382b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxGroupTransform(optionId=");
        sb2.append(this.f103382b);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f103383c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f103382b);
        parcel.writeInt(this.f103383c ? 1 : 0);
    }
}

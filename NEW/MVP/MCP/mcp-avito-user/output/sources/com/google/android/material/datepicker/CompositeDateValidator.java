package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import j.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final d f356423b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final List<CalendarConstraints.DateValidator> f356424c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f356421d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final b f356422e = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    public class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(long j12, @N List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.U3(j12)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 1;
        }
    }

    public class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(long j12, @N List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.U3(j12)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 2;
        }
    }

    public class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @N
        public final CompositeDateValidator createFromParcel(@N Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i12 = parcel.readInt();
            d dVar = (i12 != 2 && i12 == 1) ? CompositeDateValidator.f356421d : CompositeDateValidator.f356422e;
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, dVar, null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final CompositeDateValidator[] newArray(int i12) {
            return new CompositeDateValidator[i12];
        }
    }

    public interface d {
        boolean a(long j12, @N List list);

        int getId();
    }

    public CompositeDateValidator() {
        throw null;
    }

    public CompositeDateValidator(List list, d dVar, a aVar) {
        this.f356424c = list;
        this.f356423b = dVar;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean U3(long j12) {
        return this.f356423b.a(j12, this.f356424c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f356424c.equals(compositeDateValidator.f356424c) && this.f356423b.getId() == compositeDateValidator.f356423b.getId();
    }

    public final int hashCode() {
        return this.f356424c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeList(this.f356424c);
        parcel.writeInt(this.f356423b.getId());
    }
}

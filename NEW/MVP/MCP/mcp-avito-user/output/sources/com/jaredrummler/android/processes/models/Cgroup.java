package com.jaredrummler.android.processes.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class Cgroup extends ProcFile {
    public static final Parcelable.Creator<Cgroup> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<ControlGroup> f364307c;

    public static class a implements Parcelable.Creator<Cgroup> {
        @Override // android.os.Parcelable.Creator
        public final Cgroup createFromParcel(Parcel parcel) {
            return new Cgroup(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Cgroup[] newArray(int i12) {
            return new Cgroup[i12];
        }
    }

    public Cgroup(String str) {
        super(str);
        String[] strArrSplit = this.f364311b.split("\n");
        this.f364307c = new ArrayList<>();
        for (String str2 : strArrSplit) {
            try {
                this.f364307c.add(new ControlGroup(str2));
            } catch (Exception unused) {
            }
        }
    }

    public final ControlGroup b(String str) {
        Iterator<ControlGroup> it = this.f364307c.iterator();
        while (it.hasNext()) {
            ControlGroup next = it.next();
            for (String str2 : next.f364309c.split(",")) {
                if (str2.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    @Override // com.jaredrummler.android.processes.models.ProcFile, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        super.writeToParcel(parcel, i12);
        parcel.writeTypedList(this.f364307c);
    }

    public Cgroup(Parcel parcel, a aVar) {
        super(parcel);
        this.f364307c = parcel.createTypedArrayList(ControlGroup.CREATOR);
    }
}

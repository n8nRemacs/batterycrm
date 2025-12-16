package com.avito.android.realty_agency.checkerboard.model;

import K51.d;
import Wh0.C15765a;
import Wh0.b;
import Wh0.c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.OpenParams;
import di0.C39732b;
import di0.C39733c;
import di0.C39734d;
import di0.C39735e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CheckerboardArguments.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/model/CheckerboardArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes16.dex */
public final /* data */ class CheckerboardArguments implements OpenParams {

    @k
    public static final Parcelable.Creator<CheckerboardArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f251209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f251210c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f251211d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f251212e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<C39732b> f251213f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SearchParams f251214g;

    /* compiled from: CheckerboardArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckerboardArguments> {
        @Override // android.os.Parcelable.Creator
        public final CheckerboardArguments createFromParcel(Parcel parcel) {
            int i12;
            C39733c c39733c;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(CheckerboardArguments.class.getClassLoader());
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int i14 = 0;
            while (i14 != i13) {
                c.f18016a.getClass();
                String string3 = parcel.readString();
                if (parcel.readInt() == 1) {
                    C15765a.f18014a.getClass();
                    i12 = i14;
                    c39733c = new C39733c(parcel.readDouble(), parcel.readDouble());
                } else {
                    i12 = i14;
                    c39733c = null;
                }
                long j13 = parcel.readLong();
                boolean z12 = parcel.readByte() != 0;
                b.f18015a.getClass();
                C39734d c39734d = new C39734d(parcel.readDouble(), parcel.readDouble());
                String string4 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int i16 = 0;
                while (i16 < i15) {
                    Wh0.d.f18017a.getClass();
                    int i17 = i13;
                    arrayList2.add(new C39735e(parcel.readLong(), parcel.readByte() != 0, parcel.readString(), parcel.readString()));
                    i16++;
                    i13 = i17;
                }
                arrayList.add(new C39732b(string3, c39733c, j13, z12, c39734d, string4, arrayList2));
                i14 = i12 + 1;
                i13 = i13;
            }
            return new CheckerboardArguments(j12, string, image, string2, arrayList, (SearchParams) parcel.readParcelable(CheckerboardArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CheckerboardArguments[] newArray(int i12) {
            return new CheckerboardArguments[i12];
        }
    }

    public CheckerboardArguments(long j12, @k String str, @k Image image, @k String str2, @k List<C39732b> list, @k SearchParams searchParams) {
        this.f251209b = j12;
        this.f251210c = str;
        this.f251211d = image;
        this.f251212e = str2;
        this.f251213f = list;
        this.f251214g = searchParams;
    }

    @k
    public final C39732b a(long j12) {
        for (C39732b c39732b : this.f251213f) {
            if (c39732b.getId() == j12) {
                return c39732b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @k
    public final C39735e b(long j12) {
        List<C39732b> list = this.f251213f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(((C39732b) it.next()).f(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C39735e c39735e = (C39735e) it2.next();
            if (c39735e.getId() == j12) {
                return c39735e;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckerboardArguments)) {
            return false;
        }
        CheckerboardArguments checkerboardArguments = (CheckerboardArguments) obj;
        return this.f251209b == checkerboardArguments.f251209b && L.f(this.f251210c, checkerboardArguments.f251210c) && L.f(this.f251211d, checkerboardArguments.f251211d) && L.f(this.f251212e, checkerboardArguments.f251212e) && L.f(this.f251213f, checkerboardArguments.f251213f) && L.f(this.f251214g, checkerboardArguments.f251214g);
    }

    public final int hashCode() {
        return this.f251214g.hashCode() + H.e(H.d(com.avito.android.actions_sheet.a.g(this.f251211d, H.d(Long.hashCode(this.f251209b) * 31, 31, this.f251210c), 31), 31, this.f251212e), 31, this.f251213f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckerboardArguments(developmentId=");
        sb2.append(this.f251209b);
        sb2.append(", developmentName=");
        sb2.append(this.f251210c);
        sb2.append(", developmentImage=");
        sb2.append(this.f251211d);
        sb2.append(", developerName=");
        sb2.append(this.f251212e);
        sb2.append(", buildings=");
        sb2.append(this.f251213f);
        sb2.append(", searchParams=");
        return f.m(sb2, this.f251214g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f251209b);
        parcel.writeString(this.f251210c);
        parcel.writeParcelable(this.f251211d, i12);
        parcel.writeString(this.f251212e);
        Iterator itJ = C0.j(this.f251213f, parcel);
        while (itJ.hasNext()) {
            c cVar = c.f18016a;
            C39732b c39732b = (C39732b) itJ.next();
            cVar.getClass();
            parcel.writeString(c39732b.getCompletedDate());
            if (c39732b.getGenPlanCenter() != null) {
                parcel.writeInt(1);
                C15765a c15765a = C15765a.f18014a;
                C39733c c39733cB = c39732b.getGenPlanCenter();
                c15765a.getClass();
                parcel.writeDouble(c39733cB.getX());
                parcel.writeDouble(c39733cB.getY());
            } else {
                parcel.writeInt(0);
            }
            parcel.writeLong(c39732b.getId());
            parcel.writeByte(c39732b.getIsCheckerboardAvailable() ? (byte) 1 : (byte) 0);
            b bVar = b.f18015a;
            C39734d c39734dD = c39732b.getMapCoords();
            bVar.getClass();
            parcel.writeDouble(c39734dD.getLat());
            parcel.writeDouble(c39734dD.getLng());
            parcel.writeString(c39732b.getName());
            parcel.writeInt(c39732b.f().size());
            for (C39735e c39735e : c39732b.f()) {
                Wh0.d.f18017a.getClass();
                parcel.writeLong(c39735e.getId());
                parcel.writeByte(c39735e.getIsCheckerboardAvailable() ? (byte) 1 : (byte) 0);
                parcel.writeString(c39735e.getName());
                parcel.writeString(c39735e.getSectionsLotsCount());
            }
        }
        parcel.writeParcelable(this.f251214g, i12);
    }
}

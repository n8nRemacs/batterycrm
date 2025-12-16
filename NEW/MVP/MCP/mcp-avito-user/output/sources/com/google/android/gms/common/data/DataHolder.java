package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
@KeepName
/* loaded from: classes6.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @N
    @RX0.a
    public static final Parcelable.Creator<DataHolder> CREATOR = new q();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349270b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String[] f349271c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f349272d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final CursorWindow[] f349273e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349274f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Bundle f349275g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f349276h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f349277i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f349278j;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f349279a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f349280b;

        public /* synthetic */ a(String[] strArr, String str, o oVar) {
            C36729v.j(strArr);
            this.f349279a = strArr;
            this.f349280b = new ArrayList();
            new HashMap();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new n(new String[0], null, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
    
        if (r6 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        r3.freeLastRow();
        r3 = new android.database.CursorWindow(false);
        r3.setStartPosition(r5);
        r3.setNumColumns(r0.length);
        r4.add(r3);
        r5 = r5 - 1;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.database.CursorWindow[] i(com.google.android.gms.common.data.DataHolder.a r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.i(com.google.android.gms.common.data.DataHolder$a):android.database.CursorWindow[]");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @RX0.a
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f349277i) {
                    this.f349277i = true;
                    int i12 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f349273e;
                        if (i12 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i12].close();
                        i12++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z12;
        try {
            if (this.f349278j && this.f349273e.length > 0) {
                synchronized (this) {
                    z12 = this.f349277i;
                }
                if (!z12) {
                    close();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public final void h() {
        this.f349272d = new Bundle();
        int i12 = 0;
        while (true) {
            String[] strArr = this.f349271c;
            if (i12 >= strArr.length) {
                break;
            }
            this.f349272d.putInt(strArr[i12], i12);
            i12++;
        }
        CursorWindow[] cursorWindowArr = this.f349273e;
        this.f349276h = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i13 = 0; i13 < cursorWindowArr.length; i13++) {
            this.f349276h[i13] = numRows;
            numRows += cursorWindowArr[i13].getNumRows() - (numRows - cursorWindowArr[i13].getStartPosition());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.k(parcel, 1, this.f349271c, false);
        TX0.a.m(parcel, 2, this.f349273e, i12);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349274f);
        TX0.a.a(parcel, 4, this.f349275g, false);
        TX0.a.q(parcel, 1000, 4);
        parcel.writeInt(this.f349270b);
        TX0.a.p(parcel, iO2);
        if ((i12 & 1) != 0) {
            close();
        }
    }

    public DataHolder(a aVar, int i12, Bundle bundle, p pVar) {
        this(aVar.f349279a, i(aVar), i12, (Bundle) null);
    }

    @SafeParcelable.b
    public DataHolder(@SafeParcelable.e int i12, @SafeParcelable.e String[] strArr, @SafeParcelable.e CursorWindow[] cursorWindowArr, @SafeParcelable.e int i13, @SafeParcelable.e @P Bundle bundle) {
        this.f349277i = false;
        this.f349278j = true;
        this.f349270b = i12;
        this.f349271c = strArr;
        this.f349273e = cursorWindowArr;
        this.f349274f = i13;
        this.f349275g = bundle;
    }

    @RX0.a
    public DataHolder(@N String[] strArr, @N CursorWindow[] cursorWindowArr, int i12, @P Bundle bundle) {
        this.f349277i = false;
        this.f349278j = true;
        this.f349270b = 1;
        C36729v.j(strArr);
        this.f349271c = strArr;
        C36729v.j(cursorWindowArr);
        this.f349273e = cursorWindowArr;
        this.f349274f = i12;
        this.f349275g = bundle;
        h();
    }
}

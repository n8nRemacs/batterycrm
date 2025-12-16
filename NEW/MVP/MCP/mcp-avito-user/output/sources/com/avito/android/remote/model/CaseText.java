package com.avito.android.remote.model;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.F3;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CaseText.kt */
@s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0003\u0010\bB\u0011\b\u0012\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010+R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/CaseText;", "Landroid/os/Parcelable;", "Ljava/io/Externalizable;", "<init>", "()V", "Landroid/util/SparseArray;", "", "names", "(Landroid/util/SparseArray;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "nameCase", "getName", "(I)Ljava/lang/String;", "name", "Lkotlin/G0;", "setName", "(ILjava/lang/String;)V", "", "hasNames", "()Z", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "Ljava/io/ObjectOutput;", "out", "writeExternal", "(Ljava/io/ObjectOutput;)V", "mNames", "Landroid/util/SparseArray;", "()Ljava/lang/String;", "getNames", "()Landroid/util/SparseArray;", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CaseText implements Parcelable, Externalizable {
    private static final long serialVersionUID = 1;

    @k
    private transient SparseArray<String> mNames;

    @f
    @k
    public static final Parcelable.Creator<CaseText> CREATOR = new Parcelable.Creator<CaseText>() { // from class: com.avito.android.remote.model.CaseText$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public CaseText createFromParcel(@k Parcel source) {
            return new CaseText(source, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public CaseText[] newArray(int size) {
            return new CaseText[size];
        }
    };

    public /* synthetic */ CaseText(Parcel parcel, C42822w c42822w) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[LOOP:0: B:29:0x0041->B:38:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@Y61.l java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L61
            java.lang.Class r2 = r8.getClass()
            java.lang.Class<com.avito.android.remote.model.CaseText> r3 = com.avito.android.remote.model.CaseText.class
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L14
            goto L61
        L14:
            com.avito.android.remote.model.CaseText r8 = (com.avito.android.remote.model.CaseText) r8
            android.util.SparseArray<java.lang.String> r2 = r7.mNames
            android.util.SparseArray<java.lang.String> r8 = r8.mNames
            if (r2 != 0) goto L1f
            if (r8 != 0) goto L1f
            goto L60
        L1f:
            if (r2 != 0) goto L23
            r3 = r0
            goto L24
        L23:
            r3 = r1
        L24:
            if (r8 != 0) goto L28
            r4 = r0
            goto L29
        L28:
            r4 = r1
        L29:
            r3 = r3 ^ r4
            if (r3 == 0) goto L2e
        L2c:
            r0 = r1
            goto L60
        L2e:
            int r3 = r2.size()
            int r4 = r8.size()
            if (r3 == r4) goto L39
            goto L2c
        L39:
            int r3 = r2.size()
            int r3 = r3 - r0
            if (r3 < 0) goto L60
            r4 = r1
        L41:
            int r5 = r2.keyAt(r4)
            java.lang.Object r6 = r2.get(r5)
            java.lang.Object r5 = r8.get(r5)
            if (r6 == 0) goto L58
            if (r5 == 0) goto L58
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L5b
            goto L2c
        L58:
            if (r6 == r5) goto L5b
            goto L2c
        L5b:
            if (r4 == r3) goto L60
            int r4 = r4 + 1
            goto L41
        L60:
            return r0
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.model.CaseText.equals(java.lang.Object):boolean");
    }

    @k
    public final String getName() {
        return this.mNames.indexOfKey(1) >= 0 ? this.mNames.get(1) : "";
    }

    @k
    public final SparseArray<String> getNames() {
        return this.mNames.clone();
    }

    public final boolean hasNames() {
        return this.mNames.size() > 0;
    }

    public int hashCode() {
        int size;
        SparseArray<String> sparseArray = this.mNames;
        if (sparseArray == null || sparseArray.size() - 1 < 0) {
            return 0;
        }
        int i12 = 0;
        int iHashCode = 0;
        while (true) {
            String str = sparseArray.get(sparseArray.keyAt(i12));
            iHashCode = (iHashCode * 31) + (str != null ? str.hashCode() : 0);
            if (i12 == size) {
                return iHashCode;
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Externalizable
    public void readExternal(@k ObjectInput in2) {
        SparseArray<String> sparseArray = this.mNames;
        int i12 = in2.readInt() - 1;
        if (i12 < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            sparseArray.put(in2.readInt(), in2.readObject());
            if (i13 == i12) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void setName(int nameCase, @l String name) {
        this.mNames.put(nameCase, name);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@k ObjectOutput out) throws IOException {
        SparseArray<String> sparseArray = this.mNames;
        int size = sparseArray.size();
        out.writeInt(size);
        int i12 = size - 1;
        if (i12 < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            int iKeyAt = sparseArray.keyAt(i13);
            String strValueAt = sparseArray.valueAt(i13);
            out.writeInt(iKeyAt);
            out.writeObject(strValueAt);
            if (i13 == i12) {
                return;
            } else {
                i13++;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        SparseArray<String> sparseArray = this.mNames;
        int i12 = F3.f318602a;
        if (sparseArray == null) {
            sparseArray = null;
        }
        dest.writeSparseArray(sparseArray);
    }

    public CaseText() {
        this.mNames = new SparseArray<>(0);
    }

    public CaseText(@k SparseArray<String> sparseArray) {
        new SparseArray(0);
        this.mNames = sparseArray;
    }

    @l
    public final String getName(int nameCase) {
        if (this.mNames.indexOfKey(nameCase) >= 0) {
            return this.mNames.get(nameCase);
        }
        return null;
    }

    private CaseText(Parcel parcel) {
        this.mNames = new SparseArray<>(0);
        int i12 = F3.f318602a;
        SparseArray<String> sparseArray = parcel.readSparseArray(CaseText.class.getClassLoader());
        this.mNames = sparseArray == null ? null : sparseArray;
    }
}
